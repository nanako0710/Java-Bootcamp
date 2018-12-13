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
	public MemberJudgeResponseDto doMethod(@RequestBody MemberJudgeRequestDto box1) {


		MemberJudgeResponseDto instance = new MemberJudgeResponseDto();
		//宮原メモ：直接他のクラスのこのメソッド使いますっていうコードは書けない
			instance.setMemberName("隊員氏名：" + box1.getName());
			MemberJudgeServiceImpl instance2 = new MemberJudgeServiceImpl();
			boolean x = instance2.judge1(box1);
			instance.setEnlistedPropriety(x);

		return instance;
	}

	private boolean checkinput(MemberJudgeRequestDto box1) {
		int X = box1.getEventPlanning();
		int Y = box1.getCoodination();
		int Z = box1.getCogitation();
		int A = box1.getProgrammingAbility();
		int B = box1.getInfrastructureKnowledge();

		if((0 <= X && X <= 5)
		&& (0 <= Y && Y <= 5)
		&& (0 <= Z && Z <= 5)
		&& (0 <= A && A <= 5)
		&& (0 <= B && B <= 5)) {
			return true;
		}else {
			return false;
		}
	}

}

