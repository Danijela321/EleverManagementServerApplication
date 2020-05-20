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





Chrom(browser)
-get all elever
http://localhost:8080/EleverManagement/webservice/elever

get elever med samma efternamn
http://localhost:8080/EleverManagement/webservice/elever/Lundqvist

-get elever med id (obs! först behöver man skriva efternamn)
http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/4



insomnia
-get all elever
GET + http://localhost:8080/EleverManagement/webservice/elever

-get elever med samma efternamn
GET + http://localhost:8080/EleverManagement/webservice/elever/Lundqvist

-get elever med id (obs! först behöver man skriva efternamn)
GET + http://localhost:8080/EleverManagement/webservice/elever/Lundqvist/4