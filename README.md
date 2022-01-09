# betvictor homework

The app consists of three modules: Service-Sender-Receiver
Use maven to build them.

I used apache-tomcat 8.5.73 as server.
To deploy copy Sender.war to {tomcat}/webapps

As a JMS provider I choose apache-activeMQ 2.20.0(latest)
I started on the default localhost:61616 port

# buggy behaviour

I found out that the first submit resolves in zero comment shown. It seems that it retrieves comments from Hsql faster than the message to store the comment arrives.
Every other submits work fine. I'll think about a better solution.
