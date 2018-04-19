package problem1;

class Rectangle{
    //長方形の情報
    int width = 0;
    int height = 0;
    int x = 0;
    int y = 0;
    create(int w, int h, int x, int y){
	this.width = w;
	this.height = h;
	this.x = x;
	this.y = y;
    }
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
