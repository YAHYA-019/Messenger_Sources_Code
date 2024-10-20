package X;

/* loaded from: Kxu.class */
public abstract class Kxu {
    public static final char[] A00 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static char A00(int i) {
        char[] cArr = A00;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw KJr.A00();
    }
}
