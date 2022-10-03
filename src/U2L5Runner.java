public class U2L5Runner {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(80, 100);
        Rectangle rect2 = new Rectangle(50);
        Rectangle rect3 = new Rectangle();

        rect3 = rect1;
        rect1 = rect2;
        rect1.setLength(60);

        Rectangle rect4 = rect3;
        rect3.setWidth(70);
        rect3 = rect1;
        rect3.setLength(40);
        rect2.setWidth(90);

        System.out.println(rect1 == rect2); // if this prints true, rect and rect2 refer to the same object in memory
        System.out.println(rect2 == rect3);
        System.out.println(rect3 == rect1);
        System.out.println(rect4 == rect2); //prints false
    }

}
