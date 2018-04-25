import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Command{
    Scanner scan = new Scanner(System.in);
    Board board = new Board();
    void selected(int operation, List<Rectangle> rectangle){
	switch(operation){
	case 1:
	    //create
	    //作成できるかどうか一時避難場所
	    Rectangle rect_tmp = new Rectangle();
	    int fit = 0;
	    do{
		System.out.print("width : ");
		int w = scan.nextInt();
		System.out.print("height : ");
		int h = scan.nextInt();
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("y : ");
		int y = scan.nextInt();
		//Rectangleインスタンスに情報を送る(set)
		//	fit = rect_tmp.create(w,h,x,y);
		//ArrayList内に同じ長方形があるか確認
		for(Rectangle rect : rectangle){
		    //System.out.println("for内部");
		    if(rect.getW() == w && rect.getH() == h &&
		       rect.getX() == x && rect.getY() == y){
			System.out.println("その長方形はすでに存在しています");
			fit = 1;
			break;
		    }else{
			fit = 0;
		    }
		}
		//Rectangleインスタンスに情報を送る(set)
		//長方形被りがない場合、長方形の条件に合致しているか確認
		if(fit == 0){
		    fit = rect_tmp.create(w,h,x,y);
		}
	    }while(fit == 1);
	    if(rectangle.size() != 10){
		rectangle.add(rect_tmp);
	    }else{
		System.out.println("長方形は10個以上作れません");
	    }
	    break;
	case 5:
	    //delete
	    board.delete(rectangle);
	    break;
	case 8:
	    //displayBoard
	    board.displayBoard(rectangle);
	    break;
	case 9:
	    //exit
	    System.out.println("終了します");
	    System.exit(0);
	}   
    }
}