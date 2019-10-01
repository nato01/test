import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Jack {

	public static void main(String[] args) throws
	IOException{
		BufferedReader br =new BufferedReader(new
		InputStreamReader(System.in));

		int プレイヤー点数=0,ディーラー点数=0;
		Random random=new Random();
		int num=random.nextInt(52);
		int[]プレイヤーカード=new int[30];
		int[]ディーラーカード=new int[30];
		for(int i=0;i<2;i++){
			プレイヤーカード[i]=random.nextInt(13)+1;
			if(プレイヤーカード[i]>10){
				プレイヤーカード[i]=10;
			}
			if(プレイヤーカード[i]==1){
				プレイヤーカード[i]=11;
			}
			プレイヤー点数+=プレイヤーカード[i];
			if(プレイヤー点数>=22){
				for(int I=0;I<=プレイヤーカード.length;I++){
					if(プレイヤーカード[1]==11){
						プレイヤーカード[I]=1;
						プレイヤー点数-=10;
					}
				}
			}
		}
		for(int i=2;プレイヤー点数<22;i++){
			System.out.println("現在の点数は"+プレイヤー点数+"です。");

			System.out.println("もう一枚引くなら｢ヒット」、引かないなら｢スタンド｣と入力してください");
			String str=br.readLine();

			if(str.equals("ヒット")){
				プレイヤーカード[i]=random.nextInt(13)+1;
				if (プレイヤーカード[i]>=10) {
					プレイヤーカード[i]=10;
				}
				if(プレイヤーカード[i]==1){
					プレイヤーカード[i]=11;
				}
				プレイヤー点数+=プレイヤーカード[i];
				if(プレイヤー点数>=22){
					System.out.println("プレイヤーはバストしました");
					break;
				}
			}
			if (str.equals("スタンド")) break;

			for (int j=0;ディーラー点数<17;j++) {

			ディーラーカード[j]=random.nextInt(13)+1;

			if (ディーラーカード[j]>=10) {

			ディーラーカード[j]=10;

			}

			if (ディーラーカード[j]==1) {

			ディーラーカード[j]=11;

			}

			ディーラー点数+=ディーラーカード[j];

			if(ディーラー点数>=22) {

			System.out.println("ディーラーはバストしました");

			break;

			}

			}

			}

			if (ディーラー点数>21&&プレイヤー点数<22) {

			System.out.println("プレイヤーの勝ち");

			}else if (ディーラー点数<22&&プレイヤー点数>21) {

			System.out.println("ディーラーの勝ち");

			}else if (ディーラー点数>プレイヤー点数) {

			System.out.println("ディーラーの勝ち");

			}else if (ディーラー点数<プレイヤー点数) {

			System.out.println("プレイヤーの勝ち");

			}else if (ディーラー点数==プレイヤー点数) {

			System.out.println("引き分け");

			}else if (ディーラー点数>21&&プレイヤー点数>21) {

			System.out.println("ディーラーの勝ち");

			}
		}

	}


