//天気を表すクラス
public class Weather {

     //降水確率
	private int kousui;

	//天気 0=晴れ 1=曇 2=雨
	private int tenki;

	//天気を表す文字列
	//これはオブジェクト毎に異なる必要はないので
	//クラス変数にそている
	static private String[]tenkimoji={"晴れ","曇り","雨"};

	//降水確率と天気を計算する
	public void makeWeather(){

		//乱数で0～100の数を作って,降水確率とする
		kousui=(int)(Math.random()*101);

		//天気は,別の乱数rで決める.
		//r<降水確率-10なら雨,r<降水確率+10なら曇り,それ以外は晴れ
		int r=(int)(Math.random()*101);
		if(r<kousui-10){
			tenki=2; //雨
		}
		else if(r<kousui+10){
			tenki=1; //雲り
		}
		else {
			tenki=0; //晴れ
		}
	}


	//降水確率を返す
	public int getKousuiKakuritsu(){
		return kousui;
	}


	//計算した天気を返す
	public int getTenki(){
		return tenki;
	}


	//計算した天気を文字列で返す
	public String getTenkiString(){
		return tenkimoji[tenki];
	}


	}


