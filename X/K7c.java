package X;

/* loaded from: K7c.class */
public final class K7c extends K7f implements MGK {
    public static final K7c zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;
    public K7b zzh;

    static {
        K7c k7c = new K7c();
        zzb = k7c;
        K7f.A0J(k7c, K7c.class);
    }

    public static K7Q A00() {
        return zzb.A0N();
    }

    public static K7c A02(L9j l9j, byte[] bArr) {
        return (K7c) K7f.A0B(l9j, zzb, bArr);
    }

    public static /* synthetic */ void A03(K7c k7c, int i) {
        k7c.zzg = i - 1;
        k7c.zzd |= 1;
    }

    public static /* synthetic */ void A04(K7c k7c, K7b k7b) {
        k7b.getClass();
        k7c.zzh = k7b;
        k7c.zzd |= 2;
    }

    public static /* synthetic */ void A05(K7c k7c, K7W k7w) {
        k7w.getClass();
        k7c.zzf = k7w;
        k7c.zze = 4;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003������\u0001᠌��\u0002ဉ\u0001\u0004<��", new Object[]{"zzf", "zze", "zzd", C4Ww.__redex_internal_original_name, LdP.A00, "zzh", K7W.class});
        }
        if (i2 == 3) {
            return new K7c();
        }
        if (i2 == 4) {
            return new K7Q((KRc) null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
