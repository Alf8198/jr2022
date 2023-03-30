package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    private static int hitCount;
    private String name;
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = random();

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;

        if (hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCount == 4) {
            defendedBodyPart = BodyPart.CHEST;
        }
        return defendedBodyPart;
    }

    public Object getName() {
        return this.name;
    }
    public int random (){
        int min = 1;
        int max = 5;
        int randomRes = (int)(Math.random() * (max - min + 1)) + min;
        return randomRes;
    }
}
