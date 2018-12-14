package functionalprogramming;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

import jp.co.netprotections.dto.MemberJudgeRequestDto;
import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@RunWith(JUnit4.class)
@SpringBootTest


public class FunctionalProgrammingApplicationTest {

	@Test
	public void test000() {

		 //eventPlanning <= 1 の場合、結果がfalseになるかのテストです
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("nmiyahara");
		request.setEventPlanning(1);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);

	    MemberJudgeServiceImpl response = new MemberJudgeServiceImpl();
	    boolean testResult = response.judge(request);
	    assertThat(testResult, is(false));
	}

	@Test
	public void test001() {

		 //Coodination <= 1 の場合、結果がfalseになるかのテストです
		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("nmiyahara");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(1);
		request.setProgrammingAbility(2);
		request.setInfrastructureKnowledge(3);


		MemberJudgeServiceImpl response = new MemberJudgeServiceImpl();
	    boolean testResult = response.judge(request);
	    assertThat(testResult, is(false));
	}

	/**
	 * requestの引数の合計値 <= 10 の場合、結果がfalseになるかのテストです
	 */
	@Test
	public void test002() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("nmiyahara");
		request.setEventPlanning(3);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(0);
		request.setInfrastructureKnowledge(0);


		MemberJudgeServiceImpl response = new MemberJudgeServiceImpl();
	    boolean testResult = response.judge(request);
	    assertThat(testResult, is(false));
	}

	/**
	 * すべて条件がtureになり、最終的な結果もtureになるパターン
	 */
	@Test
	public void test003() {

		MemberJudgeRequestDto request = new MemberJudgeRequestDto();

		request.setMemberName("nmiyahara");
		request.setEventPlanning(2);
		request.setCogitation(3);
		request.setCoodination(3);
		request.setProgrammingAbility(3);
		request.setInfrastructureKnowledge(3);


		MemberJudgeServiceImpl response = new MemberJudgeServiceImpl();
	    boolean testResult = response.judge(request);
	    assertThat(testResult, is(true));
	}



	}
