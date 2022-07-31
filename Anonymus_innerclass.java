abstract class Vehicle{
    abstract void cost();
    abstract void speed();
    void viper(){
        System.out.println("every car has a viper and it cleans the glass");
    }
}
public class Anonymus_innerclass {
    public static void main(String[] args) {
        Vehicle tata = new Vehicle() {
            void cost() {
                System.out.println("cost depends on brand");
            }

            void speed() {
                System.out.println("speed depends on model");
            }
        };
        tata.cost();
        tata.speed();
        tata.viper();
    }
}
