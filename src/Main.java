public class Main {
    public static void main(String[] args) {
        Factory fc = Factory.getInstance();
        Factory fc2 = Factory.getInstance();
        System.out.println("Obj 1 : " + fc.hashCode());
        System.out.println("Obj 2 : " + fc2.hashCode());

        shape sq = fc.getShape("SQUARE"); sq.draw();
        shape rq = fc.getShape("RECTANGLE"); rq.draw();


    }
}