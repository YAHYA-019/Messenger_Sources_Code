package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: Lj3.class */
public abstract class Lj3 implements Iterable, Serializable {
    public static final Lj3 A00 = new K5U(KdB.A05);
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

    public int A01() {
        K5T k5t = (K5U) this;
        return k5t instanceof K5T ? k5t.zzc : ((K5U) k5t).zza.length;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A01 = A01();
            byte[] bArr = ((K5U) this).zza;
            i = A01;
            Charset charset = KdB.A02;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= A01) {
                    break;
                }
                i = (i * 31) + bArr[i3];
                i2 = i3 + 1;
            }
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new Lsg(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String A12 = 1BK.A12(this);
        int A01 = A01();
        Integer valueOf = Integer.valueOf(A01);
        if (A01 <= 50) {
            concat = KYA.A00(this);
        } else {
            K5U k5u = (K5U) this;
            int A002 = A00(0, 47, k5u.A01());
            concat = KYA.A00(A002 == 0 ? A00 : new K5T(k5u.zza, A002)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A12, valueOf, concat);
    }
}
