public class Person{
	public String name=null;
	public int age=0;
//1
	public Person(){}


//2
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}


//3
    public Person(String name){
    	this.name=name;
    	this.age=0;
    }


    //4
    public Person(int age){
    	this.name="名前なし";
    	this.age=age;
    }


    //5
    public Person(int age,String name){
    	this.name=name;
    	this.age=age;
    }

}
