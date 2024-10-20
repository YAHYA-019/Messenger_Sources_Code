package X;

/* loaded from: K7a.class */
public final class K7a extends K7f implements MGK {
    public static final K7a zzb;
    public int zzd;
    public int zzf;
    public MRS zze = K7f.A0G();
    public String zzg = "";

    static {
        K7a k7a = new K7a();
        zzb = k7a;
        K7f.A0J(k7a, K7a.class);
    }

    public static K7S A00() {
        return (K7S) zzb.A0N();
    }

    public static /* synthetic */ void A02(K7a k7a, int i) {
        k7a.zzd |= 1;
        k7a.zzf = i;
    }

    public static /* synthetic */ void A03(K7a k7a, Iterable iterable) {
        MRS mrs = k7a.zze;
        if (!mrs.DCS()) {
            mrs = K7f.A0F(mrs);
            k7a.zze = mrs;
        }
        Lda.A0K(iterable, mrs);
    }

    public static /* synthetic */ void A04(K7a k7a, String str) {
        str.getClass();
        k7a.zzd |= 2;
        k7a.zzg = str;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzb, "\u0001\u0003��\u0001\u0001\u0003\u0003��\u0001��\u0001\u001a\u0002င��\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", C4Ww.__redex_internal_original_name});
        }
        if (i2 == 3) {
            return new K7a();
        }
        if (i2 == 4) {
            return new K7S(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
