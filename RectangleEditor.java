import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RectangleEditor{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Command command = new Command();
	//初期値はサイズ10
	List<Rectangle> rectangle = new ArrayList<Rectangle>();

	while(true){
	    //選択画面
	    System.out.println("1:create");
	    System.out.println("2:move");
	    System.out.println("3:expand");
	    System.out.println("4:shrink");
	    System.out.println("5:delete");
	    System.out.println("6:deleteAll");
	    System.out.println("7:intersect");
	    System.out.println("8:exit");
	    
	    int choices = scan.nextInt();
	    
	    //Commandクラスに選択した操作とリストを送る
	    command.selected(choices, rectangle);
	    
	    //ArrayList内の情報を表示
	    System.out.println("ArrayListの中身");
	    for(Rectangle rect : rectangle){
		//	System.out.println("ArrayListの中身");
		rect.show();
	    }
	}
    }
}