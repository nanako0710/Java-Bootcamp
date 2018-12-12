package functionalprogramming;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jp.co.netprotections.service.impl.MemberJudgeServiceImpl;

@RunWith(JUnit4.class)

public class FunctionalProgrammingApplicationTest {

	public void test000() {
		MemberJudgeServiceImpl orange = new MemberJudgeServiceImpl();
		boolean result = orange.judge();

	}


	@Test
	public void test001() {
		FunctionalProgrammingApplicationTest main = new FunctionalProgrammingApplicationTest();
		// 2. 生成したインスタンスから、結果をテストしたいメソッドを実行し、結果を得ます。
		boolean result = main.isString("Test String");

		// 3. 期待した結果が返ってきていることを確認します.
		assertThat(result, is(true));
	}

}
