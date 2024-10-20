package X;

/* loaded from: K7d.class */
public final class K7d extends K7f implements MGK {
    public static final K7d zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public K7Y zzg;
    public K7X zzh;

    static {
        K7d k7d = new K7d();
        zzb = k7d;
        K7f.A0J(k7d, K7d.class);
    }

    public static K7U A00() {
        return (K7U) zzb.A0N();
    }

    public static /* synthetic */ void A02(K7c k7c, K7d k7d) {
        k7d.zzf = k7c;
        k7d.zze = 2;
    }

    public static /* synthetic */ void A03(K7Z k7z, K7d k7d) {
        k7d.zzf = k7z;
        k7d.zze = 3;
    }

    public static /* synthetic */ void A04(K7e k7e, K7d k7d) {
        k7d.zzf = k7e;
        k7d.zze = 5;
    }

    public static /* synthetic */ void A05(K7Y k7y, K7d k7d) {
        k7d.zzg = k7y;
        k7d.zzd |= 1;
    }

    public static /* synthetic */ void A06(K7X k7x, K7d k7d) {
        k7x.getClass();
        k7d.zzh = k7x;
        k7d.zzd |= 2;
    }

    public static /* synthetic */ void A07(K7d k7d, K7V k7v) {
        k7d.zzf = k7v;
        k7d.zze = 4;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006������\u0001ဉ��\u0002<��\u0003<��\u0004<��\u0005<��\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", C4Ww.__redex_internal_original_name, K7c.class, K7Z.class, K7V.class, K7e.class, "zzh"});
        }
        if (i2 == 3) {
            return new K7d();
        }
        if (i2 == 4) {
            return new K7U(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
