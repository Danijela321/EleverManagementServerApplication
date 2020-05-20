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





