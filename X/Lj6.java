package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: Lj6.class */
public abstract class Lj6 implements Iterable, Serializable {
    public static final Lj6 A00 = new K7J(LC1.A05);
    public int zzc = 0;

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

    public static K7J A01(byte[] bArr, int i, int i2) {
        A00(i, i + i2, bArr.length);
        return new K7J(JQx.A1a(bArr, i2, i));
    }

    public abstract byte A02(int i);

    public abstract byte A03(int i);

    public final int A04() {
        return this.zzc;
    }

    public abstract int A05();

    public abstract int A06(int i, int i2, int i3);

    public abstract Lj6 A07(int i, int i2);

    public final String A08(Charset charset) {
        return A05() == 0 ? "" : A09(charset);
    }

    public abstract String A09(Charset charset);

    public abstract void A0A(KwW kwW);

    public abstract boolean A0B();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A05 = A05();
            i = A06(A05, 0, A05);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Lsi(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String A12 = 1BK.A12(this);
        int A05 = A05();
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A12, Integer.valueOf(A05), A05 <= 50 ? KYL.A00(this) : KYL.A00(A07(0, 47)).concat("..."));
    }
}
