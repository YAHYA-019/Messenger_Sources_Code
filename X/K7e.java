package X;

import java.util.Iterator;

/* loaded from: K7e.class */
public final class K7e extends K7f implements MGK {
    public static final MD3 zzb = new LdV();
    public static final K7e zzd;
    public int zze;
    public int zzg;
    public K7b zzj;
    public boolean zzk;
    public boolean zzl;
    public String zzf = "";
    public MQj zzh = K7f.A0E();
    public MRS zzi = K7f.A0G();

    static {
        K7e k7e = new K7e();
        zzd = k7e;
        K7f.A0J(k7e, K7e.class);
    }

    public static K7T A00() {
        return (K7T) zzd.A0N();
    }

    public static K7e A02(L9j l9j, byte[] bArr) {
        return (K7e) K7f.A0B(l9j, zzd, bArr);
    }

    public static /* synthetic */ void A03(K7b k7b, K7e k7e) {
        k7b.getClass();
        k7e.zzj = k7b;
        k7e.zze |= 4;
    }

    public static /* synthetic */ void A04(K7e k7e) {
        k7e.zze |= 16;
        k7e.zzl = false;
    }

    public static /* synthetic */ void A05(K7e k7e, int i) {
        k7e.zzg = i - 1;
        k7e.zze |= 2;
    }

    public static /* synthetic */ void A06(K7e k7e, K7a k7a) {
        k7a.getClass();
        MRS mrs = k7e.zzi;
        if (!mrs.DCS()) {
            mrs = K7f.A0F(mrs);
            k7e.zzi = mrs;
        }
        mrs.add(k7a);
    }

    public static /* synthetic */ void A07(K7e k7e, Iterable iterable) {
        MQj mQj = k7e.zzh;
        if (!mQj.DCS()) {
            int size = mQj.size();
            int i = size + size;
            if (size == 0) {
                i = 10;
            }
            k7e.zzh = mQj.DCr(i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            k7e.zzh.DCy(((KMP) it.next()).A00());
        }
    }

    public static /* synthetic */ void A08(K7e k7e, boolean z) {
        k7e.zze |= 8;
        k7e.zzk = z;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzd, "\u0001\u0007��\u0001\u0001\u0007\u0007��\u0002��\u0001ဈ��\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", C4Ww.__redex_internal_original_name, LdR.A00, "zzh", LdQ.A00, Lqy.__redex_internal_original_name, K7a.class, "zzj", C4X8.__redex_internal_original_name, "zzl"});
        }
        if (i2 == 3) {
            return new K7e();
        }
        if (i2 == 4) {
            return new K7T(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
