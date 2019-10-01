package sampleDB;

public class checkLoadJDBC {

	public static void main(String[] args) throws InstantiationException,
    IllegalAccessException{
		//TODO 自動生成されたメソッド・スタブ

		String msg="";

		try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
			msg="ドライバーのロードに成功しました";
		}catch (ClassNotFoundException e){
			msg="ドライブのロードに失敗しました";
		}
		System.out.println(msg);
	}

}
