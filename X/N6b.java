package X;

/* loaded from: N6b.class */
public final class N6b implements 1xJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public N6b(1xH r302, 5Nv r303, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = r303;
        this.A04 = z;
        this.A03 = str;
        this.A01 = r302;
    }

    public /* bridge */ /* synthetic */ void Cit(Object obj) {
        String str;
        1xH r310;
        C19d c19d;
        5Nv r308;
        String str2;
        Number number = (Number) obj;
        if (this.A00 != 0) {
            if (number != null) {
                int intValue = number.intValue();
                if (intValue == 1) {
                    r308 = (5Nv) this.A02;
                    5Nv.A05(new 8Lb(this.A04, (String) null, 1), r308);
                    5Nv.A01(r308).A06(4YT.A00(1223), this.A03);
                    5Nv.A01(r308).A01();
                    r310 = (1xH) this.A01;
                    c19d = 0EI.A00;
                } else {
                    if (intValue == 5) {
                        str2 = "SAVE_ME_FLAG_NOT_INIT_ERROR";
                    } else if (intValue == 7) {
                        str2 = "SAVE_ME_FLAG_JSON_ERROR";
                    }
                    5Nv.A01((5Nv) this.A02).A04(str2);
                    r310 = (1xH) this.A01;
                    c19d = new C19d(null);
                }
            }
            str2 = "SAVE_ME_FLAG_LOCK_BOX_ERROR";
            5Nv.A01((5Nv) this.A02).A04(str2);
            r310 = (1xH) this.A01;
            c19d = new C19d(null);
        } else {
            if (number != null) {
                int intValue2 = number.intValue();
                if (intValue2 == 1) {
                    r308 = (5Nv) this.A02;
                    5Nv.A04(new 8Lb(this.A04, (String) null, 0), r308);
                    5Nv.A01(r308).A06(4YT.A00(1223), this.A03);
                    5Nv.A01(r308).A01();
                    r310 = (1xH) this.A01;
                    c19d = 0EI.A00;
                } else {
                    if (intValue2 == 5) {
                        str = "SAVE_ME_FLAG_NOT_INIT_ERROR";
                    } else if (intValue2 == 7) {
                        str = "SAVE_ME_FLAG_JSON_ERROR";
                    }
                    5Nv.A01((5Nv) this.A02).A04(str);
                    r310 = (1xH) this.A01;
                    c19d = new C19d(null);
                }
            }
            str = "SAVE_ME_FLAG_LOCK_BOX_ERROR";
            5Nv.A01((5Nv) this.A02).A04(str);
            r310 = (1xH) this.A01;
            c19d = new C19d(null);
        }
        r310.A04(c19d);
    }
}
