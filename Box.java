 class Rectangle {
     int length;
     int width;

     void setDimension(int a, int b) {
         length = a;
         width = b;
     }

     void setArea() {
         System.out.println("Area of rectangle is" + length * width);
     }
 }
    public class Box extends Rectangle {
        int depth;
        void setDepth(int a){
            depth=a;
        }
        void volume(){
            System.out.println("Depth of A Box is: "+length*width*depth);

    }

    public static void main(String[] args) {
        Box obj=new Box();
        obj.setDimension(10,20);
        obj.setDepth(30);
        obj.setArea();
        obj.volume();

    }
}