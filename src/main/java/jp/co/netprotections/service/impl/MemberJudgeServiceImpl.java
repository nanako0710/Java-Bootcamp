package jp.co.netprotections.service.impl;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.service.MemberJudgeService;

public class MemberJudgeServiceImpl implements MemberJudgeService {

//まずイベント企画とかでif文を作って、それがtrueだったものを合計でまた可否判定する、

	@Override
	public boolean judge1(MemberJudgeRequestDto box3) {
		if(box3.getEventPlanning() <= 1 || box3.getCoodination() <= 1) {
			return false;
		}
		if(box3.getEventPlanning()+box3.getCogitation()+box3.getCoodination()+box3.getInfrastructureKnowledge()+box3.getProgrammingAbility() <= 10) {
			return false;
		}
		return true;
	}
}