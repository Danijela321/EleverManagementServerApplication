command promt(Derby-db):
NetworkServerControl.bat -p 50000 start

Command promt(Derby-db):
 ij.bat 
connect 'jdbc:derby://localhost:50000/EleverManagement; create=true';

Command promt Wildfly: 
standalone.bat






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