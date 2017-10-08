# SPRING REST API DEMO
REST API using spring

What is REST API ?

An architectural style called REST (Representational State Transfer) advocates that web applications should use HTTP.

	GET    - http://localhost:8080/SpringBootRestApi/api/employee/
	POST   - http://localhost:8080/SpringBootRestApi/api/employee/
			
			 {
				"name": "Johnson",
				"age": 30,
				"salary": 90000
			 }
	PUT    - http://localhost:8080/SpringBootRestApi/api/employee/4
				
			 {
				"name": "Todd",
				"age": 50,
				"salary": 50000
			 }
	
	DELETE - http://localhost:8080/SpringBootRestApi/api/employee/5
