package X;

/* loaded from: K7Y.class */
public final class K7Y extends K7f implements MGK {
    public static final K7Y zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";

    static {
        K7Y k7y = new K7Y();
        zzb = k7y;
        K7f.A0J(k7y, K7Y.class);
    }

    public static K7P A00() {
        return zzb.A0N();
    }

    public static /* synthetic */ void A02(K7Y k7y, String str) {
        str.getClass();
        k7y.zzd |= 1;
        k7y.zze = str;
    }

    public static /* synthetic */ void A03(K7Y k7y, String str) {
        str.getClass();
        k7y.zzd |= 2;
        k7y.zzf = str;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzb, "\u0001\u0002��\u0001\u0001\u0002\u0002������\u0001ဈ��\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new K7Y();
        }
        if (i2 == 4) {
            return new K7P((KRf) null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
