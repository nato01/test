
public class Test {

	public static void main(String[] args) {
	  Person taro=new Person();
	  taro.name="山田太郎";
      taro.age=20;
      System.out.println(taro.name);
      System.out.println(taro.age);
      taro.talk();

      Person kimura=new Person();
      kimura.name="木村次郎";
      kimura.age=18;
      System.out.println(kimura.name);
      System.out.println(kimura.age);

      Person suzuki=new Person();
      suzuki.name="鈴木花子";
      suzuki.age=16;
      System.out.println(suzuki.name);
      System.out.println(suzuki.age);

      Person sakakibara=new Person();
      sakakibara.name="榊原孝";
      sakakibara.age=20;
      sakakibara.phoneNumber="000-1111-2222";
      sakakibara.address="aaa@yahoo.co.jp";
      System.out.println(sakakibara.name);
      System.out.println(sakakibara.age);
      System.out.println(sakakibara.phoneNumber);
      System.out.println(sakakibara.address);

      Person aibo=new Person();
      aibo.name="aibo";
      aibo.talk();
      aibo.walk();


      Person asimo=new Person();
      asimo.name="asimo";
      asimo.talk();


	}

}
