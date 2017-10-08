package com.learnshare.restapi;
 
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

import com.learnshare.restapi.model.Employee;
import org.springframework.web.client.RestTemplate;
 

public class SpringBootRestTestClient {
 
    public static final String REST_SERVICE_URI = "http://localhost:8080/SpringBootRestApi/api";
     
    /* GET */
    @SuppressWarnings("unchecked")
    private static void listAllEmployees(){
        System.out.println("Testing listAllEmployees API-----------");
         
        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> EmployeesMap = restTemplate.getForObject(REST_SERVICE_URI+"/employee/", List.class);
         
        if(EmployeesMap!=null){
            for(LinkedHashMap<String, Object> map : EmployeesMap){
                System.out.println("Employee : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
            }
        }else{
            System.out.println("No employee exist----------");
        }
    }
     
    /* GET */
    private static void getEmployee(){
        System.out.println("Testing getEmployee API----------");
        RestTemplate restTemplate = new RestTemplate();
        Employee employee = restTemplate.getForObject(REST_SERVICE_URI+"/employee/1", Employee.class);
        System.out.println(employee);
    }
     
    /* POST */
    private static void createEmployee() {
        System.out.println("Testing create Employee API----------");
        RestTemplate restTemplate = new RestTemplate();
        Employee employee = new Employee(0,"Sarah",51,134);
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/employee/", employee, Employee.class);
        System.out.println("Location : "+uri.toASCIIString());
    }
 
    /* PUT */
    private static void updateEmployee() {
        System.out.println("Testing update Employee API----------");
        RestTemplate restTemplate = new RestTemplate();
        Employee employee = new Employee(1,"Tomy",33, 70000);
        restTemplate.put(REST_SERVICE_URI+"/employee/1", employee);
        System.out.println(employee);
    }
 
    /* DELETE */
    private static void deleteEmployee() {
        System.out.println("Testing delete Employee API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/employee/3");
    }
 
 
    /* DELETE */
    private static void deleteAllEmployees() {
        System.out.println("Testing all delete Employees API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/employee/");
    }
 
    public static void main(String args[]){
        listAllEmployees();
        getEmployee();
        createEmployee();
        listAllEmployees();
        updateEmployee();
        listAllEmployees();
        deleteEmployee();
        listAllEmployees();
        deleteAllEmployees();
        listAllEmployees();
    }
}