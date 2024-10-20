package X;

/* loaded from: K7V.class */
public final class K7V extends K7f implements MGK {
    public static final K7V zzb;
    public int zzd;
    public int zze;

    static {
        K7V k7v = new K7V();
        zzb = k7v;
        K7f.A0J(k7v, K7V.class);
    }

    public static K7V A00() {
        return zzb;
    }

    @Override // X.K7f
    public final Object A0P(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return K7f.A0H(zzb, "\u0001\u0001��\u0001\u0001\u0001\u0001������\u0001᠌��", new Object[]{"zzd", "zze", LdT.A00});
        }
        if (i2 == 3) {
            return new K7V();
        }
        if (i2 == 4) {
            return new K7L(null);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
