class Car{
    void Hyundai(){
        System.out.println("I20 is the most selling car in 2021");
    }
    class I20{
        void price(){
            System.out.println("price of I20 is 18lakhs ");
        }
    }
}
class Features{
    String milage = "16kmph";
    String Maxspeed = "140kmph";
    class model{
        void sports(){
            System.out.println("Sports car has body modified with 20lakhs in price ");
        }
        void topend(){
            System.out.println("Top end has best features with 2lakhs extra in price ");
        }
    }
}
public class Member_innerclass {
    public static void main(String[] args){
        Car hyundai = new Car();
        hyundai.Hyundai();
        Car.I20 cost = hyundai.new I20();
        cost.price();
        Features x = new Features();
        System.out.println("milage of I20 is "+ x.milage);
        System.out.println("Maxspeed of I20 is "+ x.Maxspeed);
        Features.model y = x.new model();
        y.sports();
        y.topend();
        }
}
