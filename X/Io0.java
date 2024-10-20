package X;

import java.io.Serializable;
import java.util.AbstractMap;

/* loaded from: Io0.class */
public class Io0 implements Serializable {
    public final byte type;

    public Io0(byte b) {
        this.type = b;
    }

    public static void A00(String str, AbstractMap abstractMap, byte b, byte b2) {
        abstractMap.put(Integer.valueOf(b), new Inz(new Io0(b2), str, b));
    }

    public static void A01(String str, AbstractMap abstractMap, byte b, byte b2, int i) {
        abstractMap.put(Integer.valueOf(i), new Inz(new Io0(b), str, b2));
    }
}
