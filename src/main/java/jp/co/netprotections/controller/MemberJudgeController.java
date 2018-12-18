package jp.co.netprotections.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.dto.MemberJudgeResponseDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;



/**
 * リクエストを処理するControllerクラスです.
 * @author n.miyahara
 */
@RestController
public class MemberJudgeController {
																																																																																																																																																												/**
	 * @param MemberJudgeRequestDto dto
	 * @return
	 * @return MemberJudgeResponseDto response
	 */
	@RequestMapping(value="/main", method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody

	public MemberJudgeResponseDto doMethod(@RequestBody MemberJudgeRequestDto doMethodBox){

		MemberJudgeResponseDto mjrdInstance = new MemberJudgeResponseDto();

		if(checkInputName(doMethodBox)){
			mjrdInstance.setMemberName("隊員氏名：" + doMethodBox.getMemberName());
			MemberJudgeServiceImpl mjsiInstance = new MemberJudgeServiceImpl();
			boolean x = mjsiInstance.judge(doMethodBox);
			mjrdInstance.setEnlistedPropriety(x);
		} else {
			mjrdInstance.setMemberName(doMethodBox.getMemberName());
			mjrdInstance.setEnlistedPropriety(false);
		}
		return mjrdInstance;
	}

    public boolean checkInputName(MemberJudgeRequestDto doMethodBox2) {
    	if(doMethodBox2.getMemberName() != null
    	    && (0 <= doMethodBox2.getEventPlanning() && doMethodBox2.getEventPlanning() <= 5)
			&& (0 <= doMethodBox2.getCoodination() && doMethodBox2.getCoodination() <= 5)
			&& (0 <= doMethodBox2.getCogitation() && doMethodBox2.getCogitation() <= 5)
			&& (0 <= doMethodBox2.getProgrammingAbility() && doMethodBox2.getProgrammingAbility() <= 5)
			&& (0 <= doMethodBox2.getInfrastructureKnowledge() && doMethodBox2.getInfrastructureKnowledge() <= 5)) {
			return true;
		}else {
			return false;
		}
	}
}