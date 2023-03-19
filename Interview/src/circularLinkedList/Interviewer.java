package circularLinkedList;

import java.util.ArrayList;

public class Interviewer {

String name;
String Id;
String specialization;
ArrayList<Interviewee> intervieweeAttened = new ArrayList<>();


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return Id;
}

public void setId(String id) {
	Id = id;
}

public String getSpecialization() {
	return specialization;
}

public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

public Interviewer(String name, String id, String specialization) {
	super();
	this.name = name;
	Id = id;
	this.specialization = specialization;
}

public void addInterviewee(Interviewee e) {
	this.intervieweeAttened.add(e);
}


@Override
public String toString() {
	return "Interviewer [name=" + name + ", Id=" + Id + ", specialization=" + specialization + "]";
}
	
	
	
	
}
