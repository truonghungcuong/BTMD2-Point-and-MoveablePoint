public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        moveablePoint=new MoveablePoint(1,3,5,7);
        System.out.println(moveablePoint.toString());
        moveablePoint=moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
