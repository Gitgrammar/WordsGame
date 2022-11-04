import java.util.*;/**
 * WordsApp
 */
public class WordsApp {

    public static void main(String[] args) {
        System.out.println("単語当てゲームを開始します。");
        String[]words={"ぞう","しろくま","くじら","ペンギン","カンガルー","ライオン","人"};
        String[]ans={"elephant","polar bear","whale","penguin","kangaloo","lion","human"};
        int correct=0;
        int wrong=0;

        for(int i=0;i<=ans.length-1;i++){
        System.out.print(words[i]+">>");
        Scanner sc=new Scanner(System.in);
        String urAns=sc.nextLine();
        if(urAns.equals(ans[i])){
            System.out.println("正解");
            correct++;
        }else{
            System.out.println("不正解");
            System.out.println("貴方の解答"+urAns);
            System.out.println("正解は"+ans[i]);
            wrong++;
        }
        }
        System.out.println("全10問中"+correct+"問正解");
    }
}