package basic1;

public class Person {//¼³°èµµ
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		this("");
	}
	public Person(String name) {
		this(name,0);
	}
	public Person(String name,int age) {
		this(name,age,0.0);		
	}
	public Person(String name,int age,double height) {		
		this(name,age,0.0,0.0);	
	}
	public Person(String name,int age,double height,double weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;		
	}
	public Person(Person p) {
		this.name=p.name;
		this.age=p.age;
		this.height=p.height;
		this.weight=p.weight;	
		
	}
	public void setName(Person this,String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public Person getInstance() {
		/*int a=10;
		String s="abc";
		double d=10.5;
		 Person p= new Person();*/
		return this;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+height+" "+weight;
	}
	public static void main(String[] args) {
		Person p1=new Person("½Â¿ø");//name|age|height|weight
		Person p2=new Person("¼º¼ö",22,180.5,55.9);//name|age|height|weight
		Person p3=new Person("ÀçÈÆ");//name|age|height|weight
		//p2.setName("½½±â");
		
		/*p1.getInstance().setName("ÁöÇý");
		System.out.println(p1);
		System.out.println("Test"+p1.getInstance().getName());*/
		p1.getInstance().setName("¼ö¿¬");
		System.out.println(p1);
		
		
		
	}	
	
	

}
