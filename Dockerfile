FROM tomcat:8

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

WORKDIR /usr/local/tomcat

CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
