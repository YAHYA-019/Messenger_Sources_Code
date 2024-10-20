package X;

/* renamed from: X.3Nx, reason: invalid class name */
/* loaded from: 3Nx.class */
public final class C3Nx {
    public final 1Br A00 = 1BK.A0E();
    public final 1Br A01 = 1Bq.A00(83605);
    public final C00261ak A02 = (C00261ak) 1Bi.A03(33072);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String A00() {
        boolean equals;
        String BD0;
        String str = "m.";
        if (AnonymousClass001.A1V(1Bn.A0A(83591))) {
            C00i c00i = this.A00.A00;
            String BD02 = 1BK.A0S(c00i).BD0(1Pf.A0b);
            if (BD02 == null) {
                BD02 = "default";
            }
            switch (BD02.hashCode()) {
                case -1183762670:
                    if (BD02.equals("intern")) {
                        str = "m.intern.";
                        break;
                    }
                    break;
                case 99349:
                    if (BD02.equals("dev")) {
                        str = "m.dev.";
                        break;
                    }
                    break;
                case 1544803905:
                    equals = BD02.equals("default");
                    break;
                case 1865400007:
                    equals = BD02.equals("sandbox");
                    break;
            }
            if (equals && (BD0 = 1BK.A0S(c00i).BD0(1Pf.A0a)) != null && BD0.length() != 0 && !"default".equals(BD0)) {
                return 0Pz.A0W(str, BD0);
            }
        }
        return AnonymousClass001.A0d("facebook.com", AnonymousClass001.A0n(str));
    }
}
