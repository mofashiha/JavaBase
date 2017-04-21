package Check;

public class Person {
   private int age=20;
   private String name="张三";
    public Person(int age,String name) {
  this.age=age;
  this.name=name;
	
}
    
    public Person() {
		
	}

	public void print() {
		System.out.println("姓名："+name+"年龄："+age);
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
}
