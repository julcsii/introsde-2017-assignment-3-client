
package introsde.assignment3.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UniversityService", targetNamespace = "http://soap.assignment3.introsde/", wsdlLocation = "https://sde-assignment-3.herokuapp.com/ws/university?wsdl")
public class UniversityService
    extends Service
{

    private final static URL UNIVERSITYSERVICE_WSDL_LOCATION;
    private final static WebServiceException UNIVERSITYSERVICE_EXCEPTION;
    private final static QName UNIVERSITYSERVICE_QNAME = new QName("http://soap.assignment3.introsde/", "UniversityService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://sde-assignment-3.herokuapp.com/ws/university?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UNIVERSITYSERVICE_WSDL_LOCATION = url;
        UNIVERSITYSERVICE_EXCEPTION = e;
    }

    public UniversityService() {
        super(__getWsdlLocation(), UNIVERSITYSERVICE_QNAME);
    }

    public UniversityService(WebServiceFeature... features) {
        super(__getWsdlLocation(), UNIVERSITYSERVICE_QNAME, features);
    }

    public UniversityService(URL wsdlLocation) {
        super(wsdlLocation, UNIVERSITYSERVICE_QNAME);
    }

    public UniversityService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UNIVERSITYSERVICE_QNAME, features);
    }

    public UniversityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UniversityService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns University
     */
    @WebEndpoint(name = "UniversityImplPort")
    public University getUniversityImplPort() {
        return super.getPort(new QName("http://soap.assignment3.introsde/", "UniversityImplPort"), University.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns University
     */
    @WebEndpoint(name = "UniversityImplPort")
    public University getUniversityImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.assignment3.introsde/", "UniversityImplPort"), University.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UNIVERSITYSERVICE_EXCEPTION!= null) {
            throw UNIVERSITYSERVICE_EXCEPTION;
        }
        return UNIVERSITYSERVICE_WSDL_LOCATION;
    }

}
