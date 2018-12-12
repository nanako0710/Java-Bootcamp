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
	public MemberJudgeResponseDto dog(@RequestBody MemberJudgeRequestDto apple) {


		MemberJudgeResponseDto smile = new MemberJudgeResponseDto();
		//直接他のクラスのこのメソッド使いますっていうコードは書けない
			smile.setMemberName("隊員氏名：" + apple.getName());
			MemberJudgeServiceImpl stomach = new MemberJudgeServiceImpl();
			boolean x = stomach.judge(apple);
			smile.setEnlistedPropriety(x);

		return smile;
	}

	public boolean checkinput(MemberJudgeRequestDto apple) {
		int X = apple.getEventPlanning();
		int Y = apple.getCoodination();
		int Z = apple.getCogitation();
		int A = apple.getProgrammingAbility();
		int B = apple.getInfrastructureKnowledge();

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



//↓でやりたいことはバリデーション、・隊員情報の各属性は全て半角数値(int)であり、0以上5以下の値のみ受け付けるようにしたい
//setEnlistedProprietyでboolean型の合否のデータをとってきたいが、MemberJudgeRequestDtoの中にenlistedProprietyがないから
//どから何をとってくればresponse返せるのかわからん





