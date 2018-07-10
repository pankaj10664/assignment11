import java.util.*;
 
class Employee implements Comparable<Employee> {
 
    public String name, Lastname;
    public int age;
     
     public Employee(String name, String Lastname,int age ){
         this.name=name;
         this.Lastname=Lastname;
         this.age=age;
     }
      
     public String getName(){
            return name;
          }
     public String getLastname(){
            return Lastname;
          }
          public int getAge(){
            return age;
          }
     
public int compareTo(Employee obj) {
    Employee e = (Employee)obj;
 
if(this.name.equals(e.getName()))
    {
        return this.Lastname.compareTo(e.getLastname());
    }
    else
    {
        return this.name.compareTo(e.getName());
    }   
     
 
}
     
public static void main(String arg[]){
 
    List<Employee> myList = new ArrayList<Employee>();
myList.add(new Employee("Andrew","Anderson",45));
myList.add(new Employee("Robert","Stalling",22));
myList.add(new Employee("Andrew","Anderson",19));
myList.add(new Employee("Harish","Samtani",45));
 
 
for(Employee employee : myList){
     System.out.println(" "+employee.getName() +" "+employee.getLastname()+ " " + employee.getAge());
}
 
 
System.out.println("\nSorting starts now \n");
 
Collections.sort( myList);
for(Employee employee : myList){
     System.out.println(" "+employee.getName() +" "+employee.getLastname()+ " " + employee.getAge());
}
}
      
}
