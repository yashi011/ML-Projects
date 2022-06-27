package handson;


public class customer {
	
	String name;
	String date;
	Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String toString() {
		return name+" "+date+" "+age;
	}
	public customer(String name, String date,int age) {
       this.name=name;
       this.date=date;
       this.age=age;
	}
	

}
