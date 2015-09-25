package java8;

/**
 * Created by sgholve on 9/24/15.
 */
public class FourMegaByteRoundUp {
    public static void main(String[] args) {
        long value = 34359738363L;
        value = (4 * 1024 * 1024) - 3;
        long fourMebibyte = 4 * 1024 * 1024L;
        if ((value % fourMebibyte) == 0L) {
            System.out.println(value);
        } else {
            System.out.println((value - 1L));
            System.out.println((value - 1L) / fourMebibyte);
            System.out.println((((value - 1L) / fourMebibyte) + 1));
            System.out.println((((value - 1L) / fourMebibyte) + 1) * fourMebibyte);
        }

        System.out.println(DCManagerRequestState.ACCEPTED.name());
        System.out.println(DCManagerRequestState.ACCEPTED.toString());
    }
}


enum DCManagerRequestState {

    ACCEPTED,
    PROVISIONING,
    SUCCESS,
    ERROR,
    CANCEL
}
