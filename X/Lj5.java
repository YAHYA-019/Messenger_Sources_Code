package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: Lj5.class */
public abstract class Lj5 implements Iterable, Serializable {
    public static final Lj5 A00 = new KEB(Kyu.A05);
    public static final MGe A01;
    public int hash = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.MGe] */
    static {
        A01 = (KcK.A00 == null || KcK.A01) ? new Object() : new Object();
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw JQy.A0l(i);
        }
        if (i2 < i) {
            throw JQy.A0m("Beginning index larger than ending index: ", ", ", i, i2);
        }
        throw JQy.A0m("End index: ", " >= ", i2, i3);
    }

    public static KEB A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new KEB(A01.AIJ(bArr, i, i2));
    }

    public int A02() {
        KEA kea = (KEB) this;
        return kea instanceof KEA ? kea.bytesLength : ((KEB) kea).bytes.length;
    }

    public Lj5 A03(int i) {
        KEB keb = (KEB) this;
        int A002 = A00(0, i, keb.A02());
        return A002 == 0 ? A00 : new KEA(keb.bytes, keb.A06(), A002);
    }

    public final String A04() {
        Charset charset = Kyu.A04;
        if (A02() == 0) {
            return "";
        }
        KEB keb = (KEB) this;
        return JQx.A0y(charset, keb.bytes, keb.A06(), keb.A02());
    }

    public final byte[] A05() {
        int A02 = A02();
        if (A02 == 0) {
            return Kyu.A05;
        }
        byte[] bArr = new byte[A02];
        KEA kea = (KEB) this;
        if (!(kea instanceof KEA)) {
            System.arraycopy(((KEB) kea).bytes, 0, bArr, 0, A02);
            return bArr;
        }
        KEA kea2 = kea;
        System.arraycopy(((KEB) kea2).bytes, kea2.bytesOffset, bArr, 0, A02);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int A02 = A02();
            KEB keb = (KEB) this;
            byte[] bArr = keb.bytes;
            int A06 = keb.A06();
            i = A02;
            Charset charset = Kyu.A04;
            int i2 = A06;
            while (true) {
                int i3 = i2;
                if (i3 >= A06 + A02) {
                    break;
                }
                i = (i * 31) + bArr[i3];
                i2 = i3 + 1;
            }
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return new Lsk(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String A12 = 1BK.A12(this);
        int A02 = A02();
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A12, Integer.valueOf(A02), A02 <= 50 ? KYn.A00(this) : 0Pz.A0W(KYn.A00(A03(47)), "..."));
    }
}
