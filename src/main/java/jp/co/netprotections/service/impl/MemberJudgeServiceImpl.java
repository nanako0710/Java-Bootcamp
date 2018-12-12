package jp.co.netprotections.service.impl;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.service.MemberJudgeService;

public class MemberJudgeServiceImpl implements MemberJudgeService {

	@Override
	public boolean judge(MemberJudgeRequestDto box) {
		if (box.getEventPlanning() <= 1 || box.getCoodination() <= 1 || box.getEventPlanning()+box.getCogitation()+box.getCoodination()+box.getInfrastructureKnowledge()+box.getProgrammingAbility() <= 10) {
			return false;
		} else {
			return true;
		}
	}

}