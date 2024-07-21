package OneToOneEager.dao;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneEager.dto.AadharCard;
import OneToOneEager.dto.Person;


public class AadharCarddao {


	public void  saveAadharCard(int personId,AadharCard aadharCard)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vinod");
		EntityManager em=emf.createEntityManager();
		Person dbPerson =em.find(Person.class,personId);
		
		if(dbPerson!=null)
		{
			//person is present then i can iue the aadharcard
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(aadharCard);
			
			//update that person details
			dbPerson.setAadharcard(aadharCard);
			et.commit();
		}
		
		else
		{
			//person is a fake person
			System.out.println("Sorry ID is not present");
				
		}
		
		
		
		
		
	}



	
	public void updateAadharCard(int id,AadharCard aadharCard)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vinod");
		EntityManager em=emf.createEntityManager();
		AadharCard dbAadharCard=em.find(AadharCard.class,id );
		if(dbAadharCard!=null) 
		{
		EntityTransaction et=em.getTransaction();
		et.begin();
		aadharCard.setId(id);
		em.merge(aadharCard);
		et.commit();
	}
		
		else 
		{
			System.out.println("sorry id is not present");
		}
		
	}






	public void deleteAadharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			that id is present then i can delete the data
			EntityTransaction  entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
		
	}



}















