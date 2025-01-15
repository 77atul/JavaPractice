public class Dice {
    int roll(){
        double random =Math.ceil( Math.random()*6);
        return(int) random;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i=1; i<=10; i++){
            System.out.println(dice.roll());
        }
    }

}
