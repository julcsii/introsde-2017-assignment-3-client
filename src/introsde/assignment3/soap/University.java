
package introsde.assignment3.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "University", targetNamespace = "http://soap.assignment3.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface University {


    /**
     * 
     * @param personId
     * @return
     *     returns introsde.assignment3.soap.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPersonResponse")
    @Action(input = "http://soap.assignment3.introsde/University/readPersonRequest", output = "http://soap.assignment3.introsde/University/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment3.soap.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPersonListResponse")
    @Action(input = "http://soap.assignment3.introsde/University/readPersonListRequest", output = "http://soap.assignment3.introsde/University/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param person
     * @return
     *     returns introsde.assignment3.soap.Person
     */
    @WebMethod
    @WebResult(name = "createdPerson", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.CreatePersonResponse")
    @Action(input = "http://soap.assignment3.introsde/University/createPersonRequest", output = "http://soap.assignment3.introsde/University/createPersonResponse")
    public Person createPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns introsde.assignment3.soap.Person
     */
    @WebMethod
    @WebResult(name = "updatedPerson", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.UpdatePersonResponse")
    @Action(input = "http://soap.assignment3.introsde/University/updatePersonRequest", output = "http://soap.assignment3.introsde/University/updatePersonResponse")
    public Person updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param personId
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.DeletePersonResponse")
    @Action(input = "http://soap.assignment3.introsde/University/deletePersonRequest", output = "http://soap.assignment3.introsde/University/deletePersonResponse")
    public int deletePerson(
        @WebParam(name = "personId", targetNamespace = "")
        long personId);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<introsde.assignment3.soap.Activity>
     */
    @WebMethod
    @WebResult(name = "personPreferencesWithType", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPreferencesWithType", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPersonPreferencesWithType")
    @ResponseWrapper(localName = "readPersonPreferencesWithTypeResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPersonPreferencesWithTypeResponse")
    @Action(input = "http://soap.assignment3.introsde/University/readPersonPreferencesWithTypeRequest", output = "http://soap.assignment3.introsde/University/readPersonPreferencesWithTypeResponse")
    public List<Activity> readPersonPreferencesWithType(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.assignment3.soap.Activity>
     */
    @WebMethod
    @WebResult(name = "preferences", targetNamespace = "")
    @RequestWrapper(localName = "readPreferences", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPreferences")
    @ResponseWrapper(localName = "readPreferencesResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPreferencesResponse")
    @Action(input = "http://soap.assignment3.introsde/University/readPreferencesRequest", output = "http://soap.assignment3.introsde/University/readPreferencesResponse")
    public List<Activity> readPreferences();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.assignment3.soap.Activity
     */
    @WebMethod
    @WebResult(name = "personPreferencesWithId", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPreferencesWithId", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPersonPreferencesWithId")
    @ResponseWrapper(localName = "readPersonPreferencesWithIdResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.ReadPersonPreferencesWithIdResponse")
    @Action(input = "http://soap.assignment3.introsde/University/readPersonPreferencesWithIdRequest", output = "http://soap.assignment3.introsde/University/readPersonPreferencesWithIdResponse")
    public Activity readPersonPreferencesWithId(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.assignment3.soap.Activity
     */
    @WebMethod
    @WebResult(name = "savedActivity", targetNamespace = "")
    @RequestWrapper(localName = "savePersonPreferences", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.SavePersonPreferences")
    @ResponseWrapper(localName = "savePersonPreferencesResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.SavePersonPreferencesResponse")
    @Action(input = "http://soap.assignment3.introsde/University/savePersonPreferencesRequest", output = "http://soap.assignment3.introsde/University/savePersonPreferencesResponse")
    public Activity savePersonPreferences(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Activity arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.assignment3.soap.Activity
     */
    @WebMethod
    @WebResult(name = "updatedActivity", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonPreferences", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.UpdatePersonPreferences")
    @ResponseWrapper(localName = "updatePersonPreferencesResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.UpdatePersonPreferencesResponse")
    @Action(input = "http://soap.assignment3.introsde/University/updatePersonPreferencesRequest", output = "http://soap.assignment3.introsde/University/updatePersonPreferencesResponse")
    public Activity updatePersonPreferences(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Activity arg1);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "databaseInit", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.DatabaseInit")
    @ResponseWrapper(localName = "databaseInitResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.DatabaseInitResponse")
    @Action(input = "http://soap.assignment3.introsde/University/databaseInitRequest", output = "http://soap.assignment3.introsde/University/databaseInitResponse")
    public void databaseInit();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.assignment3.soap.Activity
     */
    @WebMethod
    @WebResult(name = "evaluatedActivity", targetNamespace = "")
    @RequestWrapper(localName = "evaluatePersonPreferences", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.EvaluatePersonPreferences")
    @ResponseWrapper(localName = "evaluatePersonPreferencesResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.EvaluatePersonPreferencesResponse")
    @Action(input = "http://soap.assignment3.introsde/University/evaluatePersonPreferencesRequest", output = "http://soap.assignment3.introsde/University/evaluatePersonPreferencesResponse")
    public Activity evaluatePersonPreferences(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Activity arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<introsde.assignment3.soap.Activity>
     */
    @WebMethod
    @WebResult(name = "bestPreference", targetNamespace = "")
    @RequestWrapper(localName = "getBestPersonPreference", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.GetBestPersonPreference")
    @ResponseWrapper(localName = "getBestPersonPreferenceResponse", targetNamespace = "http://soap.assignment3.introsde/", className = "introsde.assignment3.soap.GetBestPersonPreferenceResponse")
    @Action(input = "http://soap.assignment3.introsde/University/getBestPersonPreferenceRequest", output = "http://soap.assignment3.introsde/University/getBestPersonPreferenceResponse")
    public List<Activity> getBestPersonPreference(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}
