# introsde-2017-assignment--client
University of Trento

Introduction of Service Design Engineering 

2017 Fall

#### Name: Julia Hermann
#### Email: julia.hermann@studenti.unitn.it
#### Server code: https://github.com/julcsii/introsde-2017-assignment-2-server
#### Server base URL on Heroku: https://sde-assignment-3.herokuapp.com/

#### Task
The client sends SOAP requests to a server deployed on Heroku and logs the response to the standard output. The request that are implemented are listed here:https://sites.google.com/a/unitn.it/introsde_2017-18/lab-sessions/assignments/assignment-3  

#### Code execution with Eclipse
1. Clone repository
2. Create new Java project referring the location where you put the source code
3. Add Ivy Library
4. Run execute.evaluation with Ant (this will run the UniversityClient.java class and log the output to  soap-client.log.)

#### Notes
To fill the database of the server, the client runs DatabaseInit.init() method. 

The stub classes are generated from the WSDL using wsimport:wsimport -keep https://sde-assignment-3.herokuapp.com/ws/university?wsdl. 