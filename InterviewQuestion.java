class Car{
    public void print(){
        System.out.println("i am car");
    }
}
class Nexon extends Car{
    @Override
    public void print(){
        System.out.println("i am Nexon");
    }
}

class WagonR extends Car{
    @Override
    public void print(){
        System.out.println("i am WagonR");
    }
}



public class InterviewQuestion {
    public static void main(String[] args) {
        Car obj = new Nexon();
        obj.print();
        Car obj1 = new WagonR();
        obj1.print();
    }
}
