
public class SimpleBentoGame {
	public static void main(String[] args) {
		 Player player=new Player();
		 Weather w =new Weather();

		 while(true){
			 w.makeWeather();

			 System.out.println("あなたの資金;"+ player.getMoney()+"円");

			 player.prepareBento(w.getKousuiKakuritsu());
			 System.out.println("天気は..."+w.getTenkiString()+"でした");

			 int sold=player.sellBento(w.getTenki());

			 System.out.println("あなたの店の弁当は"+sold+"個売れました");
			 System.out.println();
		 }

	}

}
