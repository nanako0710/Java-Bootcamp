package jp.co.netprotections.dto;

/**
 * リクエストされたJSONをマッピングするDTOです.
 * @author s.nozaki
 *
 */
public class MemberJudgeRequestDto {


	public String name;

	public int eventPlanning;

	public int cogitation;

	public int coodination;

	public int programmingAbility;

	public int infrastructureKnowledge;

	public int X;

	public int Y;

	public int Z;

	public int A;

	public int B;


	public int allSum;



	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	public int getAllSum() {
		return allSum;
	}

	public void setAllSum(int allSum) {
		this.allSum = allSum;
	}

	public int getX() {
		return X;
	}

	public void setX(int X) {
		this.X = X;
	}

	public int getY() {
		return Y;
	}

	public void setY(int Y) {
		this.Y = Y;
	}
	public int getZ() {
		return Z;
	}

	public void setZ(int Z) {
		this.Z = Z;
	}

	public int getA() {
		return A;
	}

	public void setA(int A) {
		this.A = A;
	}

	public int getB() {
		return B;
	}

	public void setB(int B) {
		this.B = B;
	}
}

