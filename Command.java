import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Command{
    Scanner scan = new Scanner(System.in);
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
		    System.out.println("for内部");
		    if(rect.getW() == w && rect.getH() == h &&
		       rect.getX() == x && rect.getY() == y){
			fit = 1;
		    }else{
		    }
		}
		//Rectangleインスタンスに情報を送る(set)
		fit = rect_tmp.create(w,h,x,y);
		System.out.println("fit : " + fit);
	    }while(fit == 1);
	    if(rectangle.size() != 10){
		rectangle.add(rect_tmp);
	    }else{
		System.out.println("長方形は10個以上作れません");
	    }
	    break;
	case 5:
	    if(rectangle.isEmpty() == true){
		System.out.println("長方形は作成されていません");
	    }else{
		//delete
		//削除したい長方形の情報を入力
		System.out.println("削除したい長方形の情報を入力してください");
		System.out.print("width : ");
		int w = scan.nextInt();
		System.out.print("height : ");
		int h = scan.nextInt();
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("y : ");
		int y = scan.nextInt();
		int i = 0;
		for(Rectangle rect : rectangle){
		    if(rect.getW() == w && rect.getH() == h &&
		       rect.getX() == x && rect.getY() == y){
			System.out.println("remove前");
			rectangle.remove(i);
			System.out.println("remove後");
			break;
		    }else{
		    }
		    i++;
		}
	    }
	    break;
	}   
    }
}

	    