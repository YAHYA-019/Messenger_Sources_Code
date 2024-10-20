package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: Lj4.class */
public abstract class Lj4 implements Iterable, Serializable {
    public static final Lj4 A00 = new KBy(KdF.A05);
    public static final MGX A01;
    public static final long serialVersionUID = 1;
    public int hash = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.MGX] */
    static {
        A01 = (KcF.A00 == null || KcF.A01) ? new Object() : new Object();
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

    public static KBy A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new KBy(A01.AIJ(bArr, i, i2));
    }

    public int A02() {
        KBx kBx = (KBy) this;
        return kBx instanceof KBx ? kBx.bytesLength : ((KBy) kBx).bytes.length;
    }

    public Lj4 A03(int i) {
        KBy kBy = (KBy) this;
        int A002 = A00(0, i, kBy.A02());
        return A002 == 0 ? A00 : new KBx(kBy.bytes, kBy.A05(), A002);
    }

    public final byte[] A04() {
        int A02 = A02();
        if (A02 == 0) {
            return KdF.A05;
        }
        byte[] bArr = new byte[A02];
        KBx kBx = (KBy) this;
        if (!(kBx instanceof KBx)) {
            System.arraycopy(((KBy) kBx).bytes, 0, bArr, 0, A02);
            return bArr;
        }
        KBx kBx2 = kBx;
        System.arraycopy(((KBy) kBx2).bytes, kBx2.bytesOffset, bArr, 0, A02);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int A02 = A02();
            KBy kBy = (KBy) this;
            byte[] bArr = kBy.bytes;
            int A05 = kBy.A05();
            i = A02;
            Charset charset = KdF.A04;
            int i2 = A05;
            while (true) {
                int i3 = i2;
                if (i3 >= A05 + A02) {
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
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A12, Integer.valueOf(A02), A02 <= 50 ? KYg.A00(this) : 0Pz.A0W(KYg.A00(A03(47)), "..."));
    }
}
