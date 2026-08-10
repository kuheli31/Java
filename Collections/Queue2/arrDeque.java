package Queue2;

import java.util.ArrayDeque;

public class arrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adc = new ArrayDeque<>();
        adc.offer(10);
        adc.offerFirst(20);
        adc.offer(15);
        adc.offerLast(25);
        adc.offer(5);

        System.out.println("ArrayDeque elements:"+ adc);
        System.out.println("Peek First: " + adc.peekFirst());
        System.out.println("Peek Last: " + adc.peekLast());
        System.out.println("Poll First: " + adc.pollFirst());
        System.out.println("Poll Last: " + adc.pollLast());


    }
}
