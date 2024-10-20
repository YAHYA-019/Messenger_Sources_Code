package X;

import java.util.EnumMap;

/* loaded from: Krn.class */
public final class Krn {
    public java.util.Map A00;
    public L3x[] A01;
    public final String A02;
    public final byte[] A03;

    public Krn(String str, byte[] bArr, L3x[] l3xArr) {
        System.currentTimeMillis();
        this.A02 = str;
        this.A03 = bArr;
        this.A01 = l3xArr;
        this.A00 = null;
    }

    public void A00(KMt kMt, Object obj) {
        java.util.Map map = this.A00;
        if (map == null) {
            map = new EnumMap(KMt.class);
            this.A00 = map;
        }
        map.put(kMt, obj);
    }

    public String toString() {
        return this.A02;
    }
}
