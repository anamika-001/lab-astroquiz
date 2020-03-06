package utility;

import model.User;


public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{
	
	public boolean basicEligibilityCheck(User user) {
		if(checkUser(user)&&checkQuizAnswer("points"))
			return true;
		else
		   return false;
	
	}//sir we have to check for quizanswer too?? is it correct??yes
	//How is it calculating the points?we have to give calculation part?yes 10 marks per question
	
	public boolean checkUser(User user) {
		 int age=user.getAge();
		
		 int height=user.getHeight();
		 int weight=user.getWeight();
	     String country=user.getCountry();
		
		if((18<=age && age<=35)&&(155 <= height && height<=170)&&(55<=weight&&weight<=90)&&(country.equals("ProGrad")))
		return true;
		else
		return false;
	}

	
	

	@Override
	public boolean checkQuizAnswer(String points) {
		int num = Integer.parseInt(points);
		
		if(num>60) 
			return true;
		else
		
		   return false;
	}


	
}





