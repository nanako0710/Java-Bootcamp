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
	public MemberJudgeResponseDto doMethod(@RequestBody MemberJudgeRequestDto doMethodBox) {


		MemberJudgeResponseDto mjrdInstance = new MemberJudgeResponseDto();

			mjrdInstance.setMemberName("隊員氏名：" + doMethodBox.getMemberName());
			MemberJudgeServiceImpl mjsiInstance = new MemberJudgeServiceImpl();
			boolean x = mjsiInstance.judge(doMethodBox);
			mjrdInstance.setEnlistedPropriety(x);

		return mjrdInstance;
	}

	private boolean checkinput(MemberJudgeRequestDto doMethodBox) {

		if((0 <= doMethodBox.getEventPlanning() && doMethodBox.getEventPlanning() <= 5)
		&& (0 <= doMethodBox.getCoodination() && doMethodBox.getCoodination() <= 5)
		&& (0 <= doMethodBox.getCogitation() && doMethodBox.getCogitation() <= 5)
		&& (0 <= doMethodBox.getProgrammingAbility() && doMethodBox.getProgrammingAbility() <= 5)
		&& (0 <= doMethodBox.getInfrastructureKnowledge() && doMethodBox.getInfrastructureKnowledge() <= 5)) {
			return true;
		}else {
			return false;
		}
	}

    private boolean checkinputname(MemberJudgeRequestDto doMethodBox) {
    	if(doMethodBox.getMemberName() == null) {
    		return false;
    	} else {
    		return true;
    	}
    }

}

