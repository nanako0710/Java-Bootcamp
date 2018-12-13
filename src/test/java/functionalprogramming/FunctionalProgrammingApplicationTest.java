package functionalprogramming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;
import jp.co.netprotections.MemberJudgeServiceImpl;
import jp.co.netprotections.dto.MemberJudgeRequestDto;

@RunWith(JUnit4.class)

public class FunctionalProgrammingApplicationTest {

	@Test
	public void test000() {
		MemberJudgeServiceImpl orange = new MemberJudgeServiceImpl();
		boolean result = orange.judge1(MemberJudgeRequestDto box4) {
					if(set.eventPlanning(1) <= 1 || coodination(1) <= 1) {
						return false;
					}
					if(box4.getEventPlanning()+box3.getCogitation()+box3.getCoodination()+box3.getInfrastructureKnowledge()+box3.getProgrammingAbility() <= 10) {
						return false;
					}
					return true;
				}
			}


		assertThat(result, is(true));
	}

}
