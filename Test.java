public class Test {
    public static void main(String[] args) {
        Sword <Steel> steelSword = new Sword<>(new Steel());
        if (steelSword.swordTest()) System.out.println("Меч прошел проверку прочности!");
        else System.out.println("Меч не прошел проверку прочности ;c");
//        Sword <Plastic> plasticSword = new Sword<>();

    }
}
