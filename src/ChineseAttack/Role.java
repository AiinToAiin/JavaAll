package ChineseAttack;

import ChineseAttack.Role;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(){

    }

    public Role(String name, int blood){
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }



    public void attack(Role role){
        Random r = new Random();
        int attackblood = r.nextInt(20)+1;

        int sheng =role.getBlood()-attackblood;
        sheng = sheng < 0 ? 0:sheng;
        role.setBlood(sheng);
        System.out.println(this.getName()+"攻击了"+role.getName()+"造成了"+
                attackblood+"伤害,剩余"+sheng+"血");
    }
}
