class Shape{
    Double dimention1;
    Double dimention2;
    Shape(double dimention_1, double dimention_2){
        dimention1=dimention_1;
        dimention2 =dimention_2;
    }
    public void Area() {
    }

}


class Rectangle extends Shape{
    Rectangle(double dimention1, double dimention2){
    super(dimention2, dimention2);
    }

    public void Area(){
        double result = dimention2 * dimention2;
        System.out.println(result);
    }

}





public class CantExtend {
    public static void main(String[] args) {
        Shape shp;
        shp = new Rectangle(100, 150);
        shp.Area();
    }
}
