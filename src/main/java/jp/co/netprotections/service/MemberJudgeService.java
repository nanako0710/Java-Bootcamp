package jp.co.netprotections.service;

import org.springframework.stereotype.Service;

import jp.co.netprotections.dto.MemberJudgeRequestDto;

/**
 * タスク完了サービスクラス。
 */
@Service

//やりたいことはMemberJudgeServiceのeventPlanningにMemberJudgeRequestDtoで代入されたeventPlanningの値を使いたい

public interface MemberJudgeService {

	public boolean judge(MemberJudgeRequestDto box);

}

