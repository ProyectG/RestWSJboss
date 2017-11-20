package cl.rest.ws;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student 
{
	@XmlElement(required=false, type=String.class, name="name")
    private String name;
	@XmlElement(required=false, type=int.class, name="age")
    private int age;
       
    public Student() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}