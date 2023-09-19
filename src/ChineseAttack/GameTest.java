package ChineseAttack;

public class GameTest {
    public static void main(String[] args){
        Role r1 = new Role("jim",100);
        Role r2 = new Role("Tom",100);

        r1.attack(r2);

        while(true){
            r1.attack(r2);
            if(r2.getBlood()<=0){
                System.out.println("winner is:"+ r1.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()<=0){
                System.out.println("winner is:"+r2.getName());
                break;
            }
        }




    }
}
