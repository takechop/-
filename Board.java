import java.util.List;
import java.util.ArrayList;

class Board{
    //ボードの大きさは一定なのでstatic変数にしちゃった
    final static int WIDTH = 500;
    final static int HEIGHT = 400;
    
    void displayBoard(List<Rectangle> rectangle){
	int i = 1;
	for(Rectangle rect : rectangle){
	    System.out.println(i + "個目の長方形");
	    System.out.println("width" + rect.getW());
	    System.out.println("height" + rect.getH());
	    System.out.println("x : " + rect.getX());
	    System.out.println("y : " + rect.getY());
	    i++;
	}
    }
}