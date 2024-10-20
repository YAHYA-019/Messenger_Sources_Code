package X;

import java.util.Random;

/* loaded from: Kxq.class */
public abstract class Kxq {
    public static final ThreadLocal A00 = new Lxt();

    public static byte[] A00(int i) {
        byte[] bArr = new byte[i];
        ((Random) A00.get()).nextBytes(bArr);
        return bArr;
    }
}
