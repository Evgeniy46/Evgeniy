public class Light {
    public static void main(String arfs[]){
        int lightspeed;
        long days;
        long seconds;
        long distance;
        //пиблизительная сколрсть света
        lightspeed = 186000;
        days  =1000;
        seconds = days * 24 * 60 * 60;//преобразовать в секунды

        distance = lightspeed * seconds;//вычислить расстояние

        System.out.printf("За "+days);
        System.out.printf(" дней пройдет около ");
        System.out.printf(distance + " миль ");

    }
}
