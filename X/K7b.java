package X;

/* loaded from: K7b.class */
public final class K7b extends K7f implements MGK {
    public static final K7b zzb;
    public int zzd;
    public int zze;
    public int zzg;
    public String zzf = "";
    public String zzh = "";

    static {
        K7b k7b = new K7b();
        zzb = k7b;
        K7f.A0J(k7b, K7b.class);
    }

    public static K7R A00() {
        return (K7R) zzb.A0N();
    }

    public static /* synthetic */ void A02(K7b k7b, int i) {
        k7b.zzd |= 1;
        k7b.zze = i;
    }

    public static /* synthetic */ void A03(K7b k7b, int i) {
        k7b.zzg = i - 1;
        k7b.zzd |= 4;
    }

    public static /* synthetic */ void A04(K7b k7b, String str) {
        str.getClass();
        k7b.zzd |= 2;
        k7b.zzf = str;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzb, "\u0001\u0004��\u0001\u0001\u0005\u0004������\u0001င��\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", C4Ww.__redex_internal_original_name, LdU.A00, "zzh"});
        }
        if (i2 == 3) {
            return new K7b();
        }
        if (i2 == 4) {
            return new K7R(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
