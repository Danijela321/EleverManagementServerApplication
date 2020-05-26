Om projekt:
-registrera elever på alla yrkehögskolor i en stad
__________________________________________________________________
clona fyra projekt i Eclipso-workspace:
1.EleverManagementServerApplication
2.EleverRestClient
3.EleverManagementJPA
4.EleverManagementTestClient

_____________________________________________________________________

command promt(Derby-db):
NetworkServerControl.bat -p 50000 start

Command promt(Derby-db):
 ij.bat 
connect 'jdbc:derby://localhost:50000/EleverManagement; create=true';

Command promt Wildfly: 
standalone.bat
______________________________________________________________________
Addera denna kod i standalone.xml:
 <datasource jndi-name="java:/EleverDatabase" pool-name="EleverDatabase" enabled="true" use-java-context="true">
                    <connection-url>jdbc:derby://localhost:50000/EleverManagement</connection-url>
                    <driver>derbyclient.jar</driver>
                    <pool>
                        <min-pool-size>8</min-pool-size>
                        <initial-pool-size>8</initial-pool-size>
                        <max-pool-size>32</max-pool-size>
                    </pool>
                    <security>
                        <user-name>APP</user-name>
                        <password>APP</password>
                    </security>
                </datasource>
_______________________________________________________________________________________________


build.xml i EleverManagementServerApplication kör som Ant Build för att bygga projekt

____________________________________________________________________________________________
produktion och test versioner med hjälp av  beans.xm

(i beans.xm behöver man att aktivera den kod som ligger när som en kommentar för att kör Testing Version
 <!-- gör koden som kommentar för att programmet köra default version dvs Production Verison
     <alternatives>
	<class>com.yrgo.dataaccess.EleverDataAccessTestingVersion</class>
	</alternatives>
	-->

___________________________________________________________________________________________


REST


OBS! Man kan inte hitta en elev pga id. 
Man behöver först hitta en elever med efternamn och då kan man hitta elev pga id
(exempel finns ner)



Insomnia
---------------------------------------------------------------------------------
GET
-get all elever
GET + http://localhost:8080/EleverManagement/webservice/elever
(Får status code: 200 OK)


-get elever med samma efternamn
GET + http://localhost:8080/EleverManagement/webservice/elever/Lundqvist
(Får status code: 200 OK)

-get elever med id (obs! först behöver man skriva efternamn)
GET + http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/4
(Får status code: 200 OK)

---------------------------------------------------------------------------------

POST
POST + http://localhost:8080/EleverManagement/webservice/elever    
Välja format: JSON
i body skriver man t.ex.
{    
    "firstName": "Lanna",
    "surname": "Adda",
    "skola": "Teknikhogskolan",
    "klass": 2
  }
SEND


Result:

Får status code:201 Created
Header:
Connection	keep-alive
Location	http://localhost:8080/EleverManagement/webservice/elever/308
Content-Length	0
Date	Mon, 25 May 2020 10:32:36 GMT

nu elev Lana finns i databas:	513        |Lanna        |2          |Teknikhogskolan     |Adda


----------------------------------------------------------------------------------------------

Chrom(browser)
GET
-get all elever
http://localhost:8080/EleverManagement/webservice/elever

get elever med samma efternamn
http://localhost:8080/EleverManagement/webservice/elever/Lundqvist

-get elever med id (obs! först behöver man skriva efternamn)
http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/507

__________________________________________________________________________________________________


STATUS CODE

I EleverRestClient i TestClient
-status code 200
(elever Lundqvist med id=507 finns i db)
Response response = client.target("http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/507")
				.request("application/JSON").buildGet().invoke();
Result:
[Connection=keep-alive,Content-Length=73,Content-Type=application/json,Date=Wed, 20 May 2020 13:37:48 GMT]
200
{"id":507,"firstName":"Mate","surname":"Lundqvist","skola":"ITH","klass":2}


-------------------------------------------------------------------------------------------------------------------
-status code 201
Om man skapar en ny elev får man code status: 201
Elev:Anna Svensson, id:512, skola: Yrgo,  klass:1	
nu elev Anna fins i databas: 512  |Anna       |1          |Yrgo   |Svensson
--------------------------------------------------------------------------------------------------------------------

-status code 404 - NOT FOUND
(elever Lundqvist med id=4 finns inte i db)
Response response = client.target("http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/10")
				.request("application/JSON").buildGet().invoke();

Result:
(eclipse
[Connection=keep-alive,Content-Length=0,Date=Wed, 20 May 2020 14:14:33 GMT]
404
)
(insomnia: får status code 404 Not found)


(om man har fel i path)
http://localhost:8080/EleverManagement/webservice/eleveeer/Lundqvist/4
Result:
RESTEASY003210: Could not find resource for full path: http://localhost:8080/EleverManagement/webservice/eleveeer/Lundqvist/4











