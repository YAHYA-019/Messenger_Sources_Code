package X;

import java.nio.ByteBuffer;

/* loaded from: L85.class */
public final class L85 {
    public static final ThreadLocal A03 = new ThreadLocal();
    public final int A00;
    public final Kjx A01;
    public volatile int A02 = 0;

    public L85(Kjx kjx, int i) {
        this.A01 = kjx;
        this.A00 = i;
    }

    public static JgK A00(L85 l85) {
        short s;
        ThreadLocal threadLocal = A03;
        LA6 la6 = (JgK) threadLocal.get();
        if (la6 == null) {
            la6 = new LA6();
            threadLocal.set(la6);
        }
        JgL jgL = l85.A01.A02;
        int i = l85.A00;
        int A032 = jgL.A03(6);
        if (A032 != 0) {
            int i2 = A032 + ((LA6) jgL).A00;
            int i3 = i2 + ((LA6) jgL).A04.getInt(i2) + 4 + (i * 4);
            int i4 = i3 + ((LA6) jgL).A04.getInt(i3);
            ByteBuffer byteBuffer = ((LA6) jgL).A04;
            la6.A04 = byteBuffer;
            if (byteBuffer != null) {
                la6.A00 = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                la6.A02 = i5;
                s = la6.A04.getShort(i5);
            } else {
                s = 0;
                la6.A00 = 0;
                la6.A02 = 0;
            }
            la6.A01 = s;
        }
        return la6;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(super.toString());
        A0k.append(", id:");
        JQz.A1Q(A0k, LA6.A00(A00(this)));
        A0k.append(", codepoints:");
        JgK A00 = A00(this);
        int A032 = A00.A03(16);
        if (A032 != 0) {
            int A01 = LA6.A01(A00, A032);
            for (int i = 0; i < A01; i++) {
                JQz.A1Q(A0k, LA6.A02(A00(this), i));
                A0k.append(" ");
            }
        }
        return A0k.toString();
    }
}
