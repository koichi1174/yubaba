import java.util.*;

public class Main {
	public static void main(String[] args) {
    String name = "";

    Scanner sc = new Scanner(System.in);
    name = sc.next();



		System.out.println(textGenerator(name));
	}
  public static String textGenerator(String name){
    int name_length = name.length() + 1;
    double index = Math.random() * name_length;
    String keiyaku = "契約書だよ。そこに名前を書きな。" + "\n";
    String fun = "フン。"+ "\n";
    String zeitaku =  name + "というのかい。贅沢な名だねぇ。" + "\n";

    String name_short = name.substring((int)index - 1,(int)index);

    
    String imakara = "今からお前の名前は" + name_short + "\n";
    String iikai = name_short + "だ。いいかい";
    String henji =  name_short + "だよ。" + "\n" + "分かったら返事をするんだ、";
    String bikkuri = name_short + "！！";

    return keiyaku + fun + zeitaku + imakara + iikai + henji + bikkuri;

  }


}
