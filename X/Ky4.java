package X;

/* loaded from: Ky4.class */
public abstract class Ky4 {
    public static final long[] A00 = {-9187201950435737345L, -1};
    public static final C2818Jaa A01 = new C2818Jaa(0);

    public static final void A00(long[] jArr, int i) {
        11T.A0F(jArr, 0);
        int i2 = (i + 7) >> 3;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                int length = jArr.length - 1;
                int i5 = length - 1;
                jArr[i5] = (-72057594037927936L) | (jArr[i5] & 72057594037927935L);
                jArr[length] = jArr[0];
                return;
            }
            long j = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & (((-1) ^ j) + (j >>> 7));
            i3 = i4 + 1;
        }
    }
}
