# Rest-Api
● PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:

![image](https://user-images.githubusercontent.com/82029204/228813068-e184d7dc-aec4-4acf-8602-737d7ef0ac75.png)


● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.

![image](https://user-images.githubusercontent.com/82029204/228810773-a7facb3b-9005-42bf-b5e1-fb81e7621d96.png)
![image](https://user-images.githubusercontent.com/82029204/228810988-d600d295-70a1-4c3f-8e36-24948db1c436.png)

● DELETE a server. The parameter is a server ID
![image](https://user-images.githubusercontent.com/82029204/228812788-9535a7f4-6281-425d-b805-e59e26078bf3.png)
● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.

![image](https://user-images.githubusercontent.com/82029204/228813407-af4f248c-9d44-4b04-9e85-87de2b9d00e2.png)

