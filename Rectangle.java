import java.util.Scanner;

public class Rectangle{

    Scanner scan = new Scanner(System.in);
    //長方形の情報
    private int width = 0;
    private int height = 0;
    private int x = 0;
    private int y = 0;
    int create(int w, int h, int x, int y){
	//長方形がボードに収まる場合
	if(x+w >= 0 && x+w <= Board.WIDTH && y+h >= 0 && y+h <= Board.HEIGHT && w > 0 && h > 0){
	    this.width = w;
	    this.height = h;
	    this.x = x;
	    this.y = y;
	    return 0;
	    //長方形がボードに収まらない場合
	}else{
	    return 1;
	}
    }
    //長方形に関する情報を返す
    int getW(){
	return this.width;
    }
    int getH(){
	return this.height;
    }
    int getX(){
	return this.x;
    }
    int getY(){
	return this.y;
    }
    void show(){
	System.out.println("width : " + this.width);
	System.out.println("height : " + this.height);
	System.out.println("x : " + this.x);
	System.out.println("y : " + this.y);
    }
}
/*
    move(int x0, int y0){
	this.x = this.x + x0;
	this.y = this.y + y0;
    }
    expand_shrink(int mx, int my){
	this.x = Math.round(mx*this.x);
	this.y = Math.round(my*this.y);
    }
    //Rectangleクラスのメソッドじゃない？
    //Rectangleクラスのインスタンスを消去する(null)
    delete(){
    }
    //上に同じ
    deleteAll(){
    }
    //複数の長方形を使うのでRectangleクラスのメソッドじゃない？
    intersect(){
    }
}
*/