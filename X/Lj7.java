package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: Lj7.class */
public abstract class Lj7 implements Iterable, Serializable {
    public static final Lj7 A00 = new K6O(KdC.A05);
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

    public static K6O A01(byte[] bArr, int i) {
        A00(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new K6O(bArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [int] */
    public static String A02(Lj7 lj7) {
        byte b;
        String str;
        StringBuilder A0l = AnonymousClass001.A0l(lj7.A03());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= lj7.A03()) {
                return A0l.toString();
            }
            K6N k6n = (K6O) lj7;
            if (k6n instanceof K6N) {
                K6N k6n2 = k6n;
                int i3 = k6n2.zzd;
                if (((i3 - (i2 + 1)) | i2) < 0) {
                    if (i2 < 0) {
                        throw new ArrayIndexOutOfBoundsException(0Pz.A0T("Index < 0: ", i2));
                    }
                    throw JR1.A0j(i2, i3);
                }
                b = ((K6O) k6n2).zza[k6n2.zzc + i2];
            } else {
                b = ((K6O) k6n).zza[i2];
            }
            if (b == 34) {
                str = "\\\"";
            } else if (b == 39) {
                str = "\\'";
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            b = JR2.A07(A0l, b);
                        }
                        A0l.append((char) b);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            A0l.append(str);
            i = i2 + 1;
        }
    }

    public int A03() {
        K6N k6n = (K6O) this;
        return k6n instanceof K6N ? k6n.zzd : ((K6O) k6n).zza.length;
    }

    public final byte[] A04() {
        int A03 = A03();
        if (A03 == 0) {
            return KdC.A05;
        }
        byte[] bArr = new byte[A03];
        K6N k6n = (K6O) this;
        if (!(k6n instanceof K6N)) {
            System.arraycopy(((K6O) k6n).zza, 0, bArr, 0, A03);
            return bArr;
        }
        K6N k6n2 = k6n;
        System.arraycopy(((K6O) k6n2).zza, k6n2.zzc, bArr, 0, A03);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int A03 = A03();
            i = A03;
            K6N k6n = (K6O) this;
            int i2 = k6n instanceof K6N ? k6n.zzc : 0;
            Charset charset = KdC.A02;
            int i3 = i2;
            while (true) {
                int i4 = i3;
                if (i4 >= i2 + A03) {
                    break;
                }
                i = (i * 31) + ((K6O) k6n).zza[i4];
                i3 = i4 + 1;
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
        return new Lsh(this);
    }

    public final String toString() {
        K6N k6n;
        String concat;
        Locale locale = Locale.ROOT;
        String A12 = 1BK.A12(this);
        int A03 = A03();
        Integer valueOf = Integer.valueOf(A03);
        if (A03 <= 50) {
            concat = A02(this);
        } else {
            K6N k6n2 = (K6O) this;
            int A002 = A00(0, 47, k6n2.A03());
            if (A002 == 0) {
                k6n = A00;
            } else {
                k6n = new K6N(((K6O) k6n2).zza, k6n2 instanceof K6N ? k6n2.zzc : 0, A002);
            }
            concat = A02(k6n).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A12, valueOf, concat);
    }
}
