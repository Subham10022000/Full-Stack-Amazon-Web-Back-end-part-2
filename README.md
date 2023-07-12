# Full-Stack-Amazon-Web-Back-end-part-2
The backend is made using spring boot ,Microservices ,Feign Client , jpa , lombok, REST APIS,Cloud
# How This works
# Prerequisites: PostmanAPI,Spring Cloud,Microservices,MongoDB,SQL
First make clone of this git. 
Check pom.xml of each microservices and maven build each project file.
Run productdetails and addToCart separately on diffrent port.
Change your application properties for mongo and sql db.
Post Json should match with entity properties.
The Products from productdetails will now be fetched by feign client  and can be seen while getting data from cartdetails .
UUID generator can be used to submit id of user and product id. 

1. submit details of productdetails
2. submit user and prodid (ofproduct details) in addtocart
3. GET- pass the user id in uri .
4. You can retreive the userid and productid with all details due to intercommunication.
