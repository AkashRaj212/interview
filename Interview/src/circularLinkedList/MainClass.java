package circularLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args) {
		
		CircularLinkedList<Interviewer> staffs = new CircularLinkedList<>();
		staffs.insertNode(new Interviewer("Aarthi", "ZS123", "Backend"));
		staffs.insertNode(new Interviewer("Santhi", "ZS124", "Testing"));
		staffs.insertNode(new Interviewer("Mathimithra", "ZS125", "Backend"));
		staffs.insertNode(new Interviewer("Sree Lakshmi", "ZS126", "English"));
		staffs.insertNode(new Interviewer("Mejalla", "ZS127", "Soft skills"));
		
	
		
		ArrayList<Interviewee> interviewee = new ArrayList<>();
		
		Scanner Input = new Scanner(System.in);
		
a :while(true) {
			
			System.out.println("\nenter 1 for apply for interview");
			System.out.println("enter 2 for interviewee schedule");
			System.out.println("enter any other for exit");
			System.out.print("enter the option : ");
			String option= Input.next();
			
			switch(option) {
			
			case "1":
				System.out.print("\nenter your name:");
				String Name=Input.next();
				
				String Zetaid=Name+Interviewee.NumberOFInterviewee;
				System.out.print("\nenter your skills by comma sperated : ");
				String skill=Input.next();
				ArrayList<String> skills = new ArrayList<>(Arrays.asList(skill.split(",")));
				System.out.print("\nenter your phoneNumber:");
				String phoneNumber=Input.next();
				System.out.print("\nenter your Education:");
				String education=Input.next();
				Interviewer Staff= staffs.getnextNode();
			    interviewee.add(new Interviewee(Name, Zetaid, skills, phoneNumber, education, 0, Staff));
			    Staff.addInterviewee(interviewee.get(interviewee.size()-1));
			    System.out.println("your ZetaId : "+ Zetaid);
			    break;
			
			case "2":
				System.out.print("\nEnter your Zetaid : ");
				String Id = Input.next();
				for(int i=0;i<interviewee.size();i++) {
					if(interviewee.get(i).getZetaId().equals(Id));
						System.out.println(interviewee.get(i));

						break;
					}
				
				break;
				
			default:
				System.out.println("\nthankyou");
				break a;
			}
			
			}
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	

