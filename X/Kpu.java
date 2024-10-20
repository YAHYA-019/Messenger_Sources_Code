package X;

import java.lang.reflect.Array;

/* loaded from: Kpu.class */
public final class Kpu {
    public final int A00;
    public final int A01;
    public final byte[][] A02;

    public Kpu(int i, int i2) {
        int[] A1b = GOn.A1b();
        A1b[1] = i;
        A1b[0] = i2;
        this.A02 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, A1b);
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        int i = this.A01;
        int i2 = i * 2;
        int i3 = this.A00;
        StringBuilder A0l = AnonymousClass001.A0l((i2 * i3) + 2);
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= i3) {
                return A0l.toString();
            }
            byte[] bArr = this.A02[i5];
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 < i) {
                    byte b = bArr[i7];
                    A0l.append(b != 0 ? b != 1 ? "  " : " 1" : " 0");
                    i6 = i7 + 1;
                }
            }
            A0l.append('\n');
            i4 = i5 + 1;
        }
    }
}
