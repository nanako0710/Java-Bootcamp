package jp.co.netprotections.service.impl;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.service.MemberJudgeService;

public class MemberJudgeServiceImpl implements MemberJudgeService {

//まずイベント企画とかでif文を作って、それがtrueだったものを合計でまた可否判定する、

	@Override
public boolean judge(MemberJudgeRequestDto judgeBox) {
	if(judgeBox.getEventPlanning() <= 1 || judgeBox.getCoodination() <= 1) {
		return false;
	}
	if(judgeBox.getEventPlanning()+judgeBox.getCogitation()+judgeBox.getCoodination()+judgeBox.getInfrastructureKnowledge()+judgeBox.getProgrammingAbility() <= 10) {
		return false;
	}
		return true;
	}
}