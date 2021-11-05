package solarSystemOurHome;

public class solution {
    public static void main(String[] args) {
        System.out.println("Человечество живет в\nСолнечной системе.");
        System.out.println("Её возраст около"+" "+SolarSystem.age+" "+"лет." );
        System.out.println("В Солнечной системе"+" "+SolarSystem.planetsCount+" "+" известных\nпланет.");
        System.out.println("Как и большинство звездных систем, \nсостоит из"+SolarSystem.starsCount+" "+"звезды.");
        System.out.println("Звезды по имени"+" "+SolarSystem.starName+".");
        System.out.println("Расстояние к центру галактики \nсоставляет"+" "+SolarSystem.galacticCenterDistance+" "+"световых лет.");
        System.out.println("Каждый обитатель Солнечной системы \nдолжен знать эту информацию!");
    }
}
