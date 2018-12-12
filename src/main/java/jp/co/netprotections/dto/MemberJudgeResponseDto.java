package jp.co.netprotections.dto;

/**
 * Controllerのレスポンスクラスです.
 * @author n.miyahara
 *
 */
public class MemberJudgeResponseDto {


	private String memberName;

	private boolean enlistedPropriety;

	public String getMembreName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public boolean getEnlistedPropriety() {
		return enlistedPropriety;
	}

	public void setEnlistedPropriety(boolean enlistedPropriety) {
		this.enlistedPropriety = enlistedPropriety;
	}
}
