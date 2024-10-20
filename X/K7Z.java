package X;

/* loaded from: K7Z.class */
public final class K7Z extends K7f implements MGK {
    public static final K7Z zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;

    static {
        K7Z k7z = new K7Z();
        zzb = k7z;
        K7f.A0J(k7z, K7Z.class);
    }

    public static K7O A00() {
        return (K7O) zzb.A0N();
    }

    public static /* synthetic */ void A02(K7Z k7z, int i) {
        k7z.zzg = i - 1;
        k7z.zzd |= 1;
    }

    public static /* synthetic */ void A03(K7Z k7z, K7W k7w) {
        k7w.getClass();
        k7z.zzf = k7w;
        k7z.zze = 2;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002������\u0001᠌��\u0002<��", new Object[]{"zzf", "zze", "zzd", C4Ww.__redex_internal_original_name, LdP.A00, K7W.class});
        }
        if (i2 == 3) {
            return new K7Z();
        }
        if (i2 == 4) {
            return new K7O(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
