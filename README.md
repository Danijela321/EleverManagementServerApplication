Om projekt:
-registrera elever på alla yrkehögskolor i en stad


command promt(Derby-db):
NetworkServerControl.bat -p 50000 start

Command promt(Derby-db):
 ij.bat 
connect 'jdbc:derby://localhost:50000/EleverManagement; create=true';

Command promt Wildfly: 
standalone.bat



standalone.xml:
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




OBS! Man kan inte hitta en elev pga id. 
Man behöver först hitta en elever med efternamn och då kan man hitta elev pga id
(exempel finns ner)



Insomnia
GET
-get all elever
GET + http://localhost:8080/EleverManagement/webservice/elever

-get elever med samma efternamn
GET + http://localhost:8080/EleverManagement/webservice/elever/Lundqvist

-get elever med id (obs! först behöver man skriva efternamn)
GET + http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/4



POST
POST + http://localhost:8080/EleverManagement/webservice/elever
Välja format: JSON
i body skriver man t.ex.
{    
    "firstName": "Lana",
    "surname": "Andersson",
    "skola": "Teknikhogskolan",
    "klass": 2
  }
SEND

nu elev Lana finns i databas
302        |Lana    |2          |Teknikhogskolan    |Andersson




Chrom(browser)
GET
-get all elever
http://localhost:8080/EleverManagement/webservice/elever

get elever med samma efternamn
http://localhost:8080/EleverManagement/webservice/elever/Lundqvist

-get elever med id (obs! först behöver man skriva efternamn)
http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/4




I EleverRestClient i TestClient
-status code 200
(elever Lundqvist med id=4 finns i db)
Response response = client.target("http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/4")
				.request("application/JSON").buildGet().invoke();
Result:
[Connection=keep-alive,Content-Length=73,Content-Type=application/json,Date=Wed, 20 May 2020 13:37:48 GMT]
200
{"id":4,"firstName":"Mate","surname":"Lundqvist","skola":"ITH","klass":2}


-status code 404 - NOT FOUND
(elever Lundqvist med id=4 finns inte i db)
Response response = client.target("http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/10")
				.request("application/JSON").buildGet().invoke();

Result:
[Connection=keep-alive,Content-Length=0,Date=Wed, 20 May 2020 14:14:33 GMT]
404










