package OneToOneEagerController;




import OneToOneEager.dao.PersonDao;
import OneToOneEager.dto.AadharCard;
import OneToOneEager.dto.Person;

public class PersonAadharCardController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

//				Person pe=new Person();
//				pe.setId(3);
//				pe.setName("riya");
//				pe.setAddress("chennai");
//				
//				PersonDao per=new PersonDao();
//				per.savePerson(pe);
//			
//			
//				AadharCard a=new AadharCard();
//				a.setId(104);
//				a.setName("ramya");
//				a.setAge(18);
//				
//				AadharCardDao aa=new AadharCardDao();
//				aa.updateAadharCard(3,a);
//				
//				
//			
//				
//				
//				//update8
//				Person pe=new Person();
//				pe.setId(3);
//				pe.setName("priya");
//				pe.setAddress("kaniyakumari");
//				
//				PersonDao per=new PersonDao();
//				per.updatePerson(2, pe);	
//				
//				
//				
//				
//				AadharCard a=new AadharCard();
//				a.setId(102);
//				a.setName("lavanya");
//				a.setAge(18);
//				
//				AadharCardDao aa=new AadharCardDao();
//				aa.updateAadharCard(102,a);
//
//				
//				
//
//			//delete
//			
//			
//				PersonDao dao=new PersonDao();
//		        dao.deletePerson(2);		
//				
//				
//
//		    	AadharCardDao aa=new AadharCardDao();
//				aa.deleteAadharCard(101);
//			
//
				
				
			//find 
				
				PersonDao p=new PersonDao();  // find only relatioship entity
				p.findPerson(1);
				
					
				
			}

		

		
		
		
			
		
	}


