package circularLinkedList;

import java.util.ArrayList;

public class Interviewee {

	String Name;
	static int NumberOFInterviewee;
	String ZetaId;
	ArrayList<String> Skills = new ArrayList<>();
	String PhoneNumber;
	String Education;
	int marks;
	Interviewer assignedTOStaff;
	
	public Interviewee(String name, String zetaId, ArrayList<String> skills, String phoneNumber, String education,
			int marks, Interviewer assignedTOStaff) {
		super();
		Name = name;
		ZetaId = zetaId;
		Skills = skills;
		PhoneNumber = phoneNumber;
		Education = education;
		this.marks = marks;
		this.assignedTOStaff = assignedTOStaff;
		NumberOFInterviewee++;
	}

	@Override
	public String toString() {
		return "Interviewee [Name=" + Name + ", ZetaId=" + ZetaId + ", Skills=" + Skills + ", PhoneNumber="
				+ PhoneNumber + ", Education=" + Education + ", marks=" + marks + ", assignedTOStaff=" + assignedTOStaff.getName()
				+ "]\n";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getZetaId() {
		return ZetaId;
	}

	public void setZetaId(String zetaId) {
		ZetaId = zetaId;
	}

	public ArrayList<String> getSkills() {
		return Skills;
	}

	public void setSkills(ArrayList<String> skills) {
		Skills = skills;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Interviewer getAssignedTOStaff() {
		return assignedTOStaff;
	}

	public void setAssignedTOStaff(Interviewer assignedTOStaff) {
		this.assignedTOStaff = assignedTOStaff;
	}
	
	
	
	
}
