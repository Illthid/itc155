public class Octagon implements Shape{
    private double a;   //1

    public Octagon(double a) {
        this.a = a;
    }

    public double getArea() {
       return(float)(2*(1+Math.sqrt(2))*a*a);

    }
    public double getPerimeter(){
        return(float)(8*a);
    }

    public static void main(String[] args) {
        Shape octagon1=new Octagon(4);

            System.out.println("area of a regular octagon with a side length of 4 = "+octagon1.getArea()+
              " perimeter = "+octagon1.getPerimeter());
    }
}
