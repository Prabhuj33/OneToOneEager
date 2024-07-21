package OneToOneEager.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import OneToOneEager.dto.Person;

public class PersonDao {

	public void savePerson(Person person)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vinod");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin(); 
		em.persist(person);
		et.commit();
	}

	
	//update

	public void updatePerson(int id,Person person)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vinod");
		EntityManager em=emf.createEntityManager();
		Person dbPerson=em.find(Person.class,id);
		if(dbPerson!=null)
		{
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		person.setId(id);
		person.setAadharcard(dbPerson.getAadharcard());
		
		em.merge(person);
		et.commit();
		}
		
		else {
			System.out.println("sorry the is not present");
			
		}
	
	}
	
	
	
	
		public void deletePerson(int id)
		{
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vinod");
			EntityManager em=emf.createEntityManager();
			Person dbPerson=em.find(Person.class,id);
			if(dbPerson!=null)
			{
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			
			em.remove(dbPerson);
			et.commit();
			}
			else 
			{
				System.out.println("sorry the id is not present ");
			}

	
		}
			public void findPerson(int id)
			{
				EntityManagerFactory emf=Persistence.createEntityManagerFactory("vinod");
				EntityManager em=emf.createEntityManager();
				Person dbPerson=em.find(Person.class,id);
				if(dbPerson!=null)
				{
				System.out.println(dbPerson);
				}
				
				else {
					System.out.println("sorry the is not present");
				}

			
			
			
			
	}








}








