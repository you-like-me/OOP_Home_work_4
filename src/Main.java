public class Main {
    public static void main(String[] args) {
        Comandor comandor = new Comandor("Vasia", 250,new LongBow(), new Helmet());
        Team<Archer> archers = new Team<>(comandor);
        System.out.println("---------первая команда Лучники---------");
        System.out.println(comandor);
        archers.addWarrior(new Archer("Petr",180,new LongBow(), new Bracer()));
        archers.addWarrior(new Archer("Val",210, new LongBow(), new Bracer()));
        archers.forEach(item-> System.out.println(item));
        System.out.println("Суммарный урон команды равен: "+archers.getAllDamage()+
                "суммарное здоровье: "+archers.getAllHealthPoint()+
                "максимальная зона поражения: "+archers.getMaxRadius()+
                "максимальная защита: "+archers.getMaxProtection());


        System.out.println("---------вторая команда Топоры---------");
        Comandor comandor1 = new Comandor("SuperVasia",530,new LongBow(), new Shield());
        Team<Barbarian> axes = new Team<>(comandor1);
        axes.addWarrior(new Barbarian("Serg", 168, new Sekira(), new Shield()));
        System.out.println(comandor1);
        for (Barbarian item:axes) {
            System.out.println(item);
        }
        System.out.println("Суммарный урон команды равен: "+axes.getAllDamage()+
                "суммарное здоровье: "+axes.getAllHealthPoint()+
                "максимальная зона поражения: "+axes.getMaxRadius()+
                "максимальная защита: "+axes.getMaxProtection());
        System.out.println("---------третья команда Бандиты---------");
        Comandor comandor2 = new Comandor("Dmitriy", 290, new LongBow(), new Shield());
        Team<Warrior> gang = new Team<>(comandor2);
        gang.addWarrior(new Barbarian("John", 325,new Sekira(), new Helmet()));
        gang.addWarrior(new Archer("Mayk",187,new LongBow(), new Helmet()));
        System.out.println(comandor2);
        gang.forEach(item-> System.out.println(item));

        System.out.println("Суммарный урон команды равен: "+gang.getAllDamage()+
                "суммарное здоровье: "+gang.getAllHealthPoint()+
                "максимальная зона поражения: "+gang.getMaxRadius()+
                "максимальная защита: "+gang.getMaxProtection());

    }
}