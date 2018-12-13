package jp.co.netprotections.service;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

/**
 *judgeメソッドを使って、隊員入団可否判定を返します
 */
@Service

//やりたいことはMemberJudgeServiceのeventPlanningにMemberJudgeRequestDtoで代入されたeventPlanningの値を使いたい

public interface MemberJudgeService {
	public boolean judge1(MemberJudgeRequestDto box3);
}

