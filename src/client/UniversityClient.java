package client;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import introsde.assignment3.soap.*;

public class UniversityClient{
	
	public static String printPerson(Person person) {
		String id= "N/A";
		if (person.getIdPerson()!=0) {
			id = String.valueOf(person.getIdPerson());
		}
		
		String result = "Person [Id="+ id + ", Firstname=" + person.getFirstName() + ", Lastname=" + person.getLastname() + ", Birthdate="
				+ person.getBirthdate();
		
		if (person.getActivityPreferences()!=null) {
			result = result + "," + printActivityPreferences(person.getActivityPreferences());
		}
		result = result +  "]";
		return result;
	}
	
	
	private static String printActivityPreferences(List<Activity> activitypreference) {
		String result = "{";
		for(int i=0;i<activitypreference.size();i++) {
			if (i>0) {
				result = result + "," + printActivity(activitypreference.get(i));
			}else {
				result = result + printActivity(activitypreference.get(i));
			}
			
		}
		result = result + "}";
		return result;
	}

	
	
	private static String printActivity(Activity activity) {
		String id= "N/A";
		if (activity.getIdActivity()!=0) {
			id = String.valueOf(activity.getIdActivity());
		}
		
		return "\nActivity\n(Id=" + id +", Name=" + activity.getName() + ", \n Description=" + activity.getDescription() + ", \n Place=" + activity.getPlace() + ", \n Type=" + activity.getType() + ", \n startDate=" + activity.getStartdate() + ")";
	}
	
	
	

	public static void main(String[] args) throws Exception {
		UniversityService service = new UniversityService();
        University university = service.getUniversityImplPort();
        List<Person> people = university.readPersonList();
        
        long personid = people.get(0).getIdPerson();
        long activity_id = people.get(0).getActivityPreferences().get(0).getIdActivity();
        //TODO: print WSDL URL
        
        
        //wsimport -keep http://localhost:6902/ws/university?wsdl

        //Method 1
        System.out.println("*********Method #1 | readPersonList()*********\n");
        System.out.println("Reading all people...\n");
        for (int i=0;i<people.size();i++) {
        	System.out.println("Person #"+(i+1));
        	System.out.println(printPerson(people.get(i)));
        	System.out.println("");
        }
        //Method 2
        System.out.println("\n*********Method #2 | readPerson(long personid)*********");
        System.out.println("Reading Person with... ");
        System.out.println("personid="+personid + "\n");
        Person person = university.readPerson(personid);
        System.out.println(printPerson(person));
        
        person.setFirstName("Marika");
        person.setLastname("Kozma");
        //Method 3
        System.out.println("\n*********Method #3 | updatePerson(Person person)*********");
        System.out.println("Updating Person...");
        System.out.println("person="+printPerson(person) + "\n");
        long updatedId = university.updatePerson(person).getIdPerson();
        System.out.println("Person with id="+ updatedId + " has been updated.");
        
        List<Activity> activities = new ArrayList<>();
        Activity a1 = new Activity();
        a1.setName("Cleaning");
        a1.setDescription("Cleaning the house");
        a1.setPlace("Trento");
        a1.setType(ActivityType.WORK);
        a1.setStartdate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-12-06"));

		activities.add(a1);
		
		Activity a2 = new Activity();
		//a2.setIdActivity(10);
		a2.setName("Football");
	    a2.setDescription("Playing football with a team");
	    a2.setPlace("Milano");
        a2.setType(ActivityType.SPORT);
        a2.setStartdate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-12-06"));		
		activities.add(a2);
        Person p = new Person();
        p.setFirstName("Lilla");
        p.setLastname("Kiss");
        p.setBirthdate(DatatypeFactory.newInstance().newXMLGregorianCalendar("1997-12-06"));
        p.getActivityPreferences().add(a1);
        p.getActivityPreferences().add(a2);
      
        //Method 4
        System.out.println("\n*********Method #4 | createPerson(Person p)*********");
        System.out.println("Creating Person... ");
        System.out.println("p="+printPerson(p) + "\n");
        Person newPerson = university.createPerson(p);
        long createdId = newPerson.getIdPerson();
        System.out.println("SUCCESS!Person with id="+ createdId + " has been created.");
        
        //Method 5
        System.out.println("\n*********Method #5 | deletePerson(Long id)*********");
        System.out.println("Deleting Person with... ");
        System.out.println("id="+createdId + "\n");
        int success = university.deletePerson(createdId);
        if (success>-1) {
        	 System.out.println("SUCCESS!Person with id="+ createdId + " has been deleted.");
        }else {
        	 System.out.println("ERROR!Person with id="+ createdId + " has NOT been deleted.");
        }
        
        //Method 6
        System.out.println("\n*********Method #6 | readPersonPreferences(long personid, String activityType)*********\n");
        System.out.println("Reading activities with.. ");
        System.out.println("personid="+personid);
        System.out.println("activityType=Sport \n");
        List<Activity> activitiesWithType = university.readPersonPreferencesWithType(personid, "Sport");
        for (int i=0;i<activitiesWithType.size();i++) {
        	System.out.println("Activity #"+(i+1));
        	System.out.println(printActivity(activitiesWithType.get(i)));
        	System.out.println("");
        }
        
        //Method 7
        System.out.println("\n*********Method #7 | readPreferences()*********\n");
        List<Activity> all_activities = university.readPreferences();
        System.out.println("Reading all activities...");
        for (int i=0;i<all_activities.size();i++) {
        	System.out.println("Activity #"+(i+1));
        	System.out.println(printActivity(all_activities.get(i)));
        	System.out.println("");
        }
        
        //Method 8
        System.out.println("\n*********Method #8 | readPersonPreferencesWithId(long personid, long activity_id)*********\n");
        System.out.println("Activities with.. ");
        System.out.println("personid="+personid);
        System.out.println("activity_id=" + activity_id+ "\n");
        Activity activityWithId = university.readPersonPreferencesWithId(personid, activity_id);
        System.out.println(printActivity(activityWithId));
        
        //Method 9
        System.out.println("\n*********Method #9 | savePersonPreferences(long personid, Activity activity)*********\n");
        System.out.println("Saving activitiy with.. ");
        System.out.println("personid="+personid);
        Activity a3 =  new Activity();
        a3.setName("Random");
        a3.setDescription("Something new");
        a3.setType(ActivityType.SOCIAL);
        a3.setPlace("Tata");
        a3.setStartdate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-12-09"));
        System.out.println("activity=" + printActivity(a3)+ "\n");
        Activity newActivity = university.savePersonPreferences(personid, a3);
        System.out.println("SUCCESS! Activity added to Person(id=" +personid+ ") with activity_id=" + newActivity.getIdActivity());
        
        //Method 10
        System.out.println("\n*********Method #10 | updatePersonPreferences(long personid, Activity activity)*********\n");
        System.out.println("Updating Person with.. ");
        System.out.println("personid="+personid);
        Activity a4 =  new Activity();
        a4.setName("YAP");
        a4.setDescription("Yet Another Preference");
        a4.setType(ActivityType.WORK);
        a4.setPlace("Balatonfenyves");
        a4.setStartdate(DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-12-01"));
        System.out.println("activity=" + printActivity(a4)+ "\n");
        Activity updatedActivity = university.updatePersonPreferences(personid, a4);
        System.out.println(printActivity(updatedActivity));
        
        
        /*
        System.out.println("**********");
        for (int i=0;i<people.size();i++) {
        	System.out.println("Person #"+(i+1));
        	System.out.println(printPerson( university.readPersonList().get(i)));
        	System.out.println("");
        }
        */
    }
}