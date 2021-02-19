import com.perosal.*;

public class Main {

    public static void main(String[] args) {

        Square sq = new Square(3);
        System.out.println(sq.computeArea());

        Rectangle rct = new Rectangle(sq);
        System.out.println(rct.computeArea());

        Triangle[] triangles = rct.slitIntoTriangles();
        System.out.println(triangles[0].computeArea());

        Circle circle = new Circle(5);
        System.out.println(circle.computeArea());

        System.out.println();

    }
}
