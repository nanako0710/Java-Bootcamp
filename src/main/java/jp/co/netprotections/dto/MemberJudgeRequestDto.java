package jp.co.netprotections.dto;

/**
 * リクエストされたJSONをマッピングするDTOです.
 * @author s.nozaki
 *
 */
public class MemberJudgeRequestDto {


	private String name;

	private int eventPlanning;

	private int cogitation;

	private int coodination;

	private int programmingAbility;

	private int infrastructureKnowledge;


	public String getMemberName() {
		return name;
	}

	public void setMemberName(String name) {
		this.name = name;
	}

	public int getEventPlanning() {
		return eventPlanning;
	}

	public void setEventPlanning(int eventPlanning) {
		this.eventPlanning = eventPlanning;
	}

	public int getCogitation() {
		return cogitation;
	}

	public void setCogitation(int cogitation) {
		this.cogitation = cogitation;
	}

	public int getCoodination() {
		return coodination;
	}

	public void setCoodination(int coodination) {
		this.coodination = coodination;
	}

	public int getProgrammingAbility() {
		return programmingAbility;
	}

	public void setProgrammingAbility(int programmingAbility) {
		this.programmingAbility = programmingAbility;
	}

	public int getInfrastructureKnowledge() {
		return infrastructureKnowledge;
	}

	public void setInfrastructureKnowledge(int infrastructureKnowledge) {
		this.infrastructureKnowledge = infrastructureKnowledge;
	}
}

