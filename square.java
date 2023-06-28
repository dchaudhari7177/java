class shape{
    void shap() {
        System.out.println("This is shape");
    }
}
class rectangle extends shape{
    void rect() {
        System.out.println("This is rectangle");
    }
}
class Circle extends shape{
    void cir() {
        System.out.println("This is Circle");
    }
}
class Square extends rectangle{
    void sq() {
        System.out.println("Square of Rectangle");
    }

    public static void main(String[] args) {
        Square obj=new Square();
        Circle cj=new Circle();
        obj.sq();
        obj.rect();
        obj.shap();
        cj.cir();
        cj.shap();
    }
}



