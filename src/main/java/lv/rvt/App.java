package lv.rvt;

public class App {

public static void main(String[] args) {
    HealthStation childrensHospital = new HealthStation();

    Person ethan = new Person("Ethan", 1, 110, 7);
    Person peter = new Person("Peter", 33, 176, 85);

    // Test weighing
    System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
    System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

    // Test feeding
    childrensHospital.feed(ethan);
    childrensHospital.feed(ethan);
    childrensHospital.feed(ethan);

    System.out.println("");

    System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
    System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

    // Test weighings count
    System.out.println("weighings performed: " + childrensHospital.weighings());
    childrensHospital.weigh(ethan);
    childrensHospital.weigh(peter);
    System.out.println("weighings performed: " + childrensHospital.weighings());
    childrensHospital.weigh(ethan);
    childrensHospital.weigh(ethan);
    System.out.println("weighings performed: " + childrensHospital.weighings());
}
}