package X;

/* loaded from: C8c.class */
public final class C8c {
    public CJ7 A00;
    public int A01 = -1;
    public int A02 = -1;
    public BLX A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    public final void A00() {
        String str;
        CJ7 cj7 = this.A00;
        if (cj7 == null || !this.A08) {
            return;
        }
        BLX blx = this.A03;
        if (blx == null) {
            str = "surface";
        } else {
            int i = this.A01;
            int i2 = this.A02;
            Integer num = this.A04;
            if (num == null) {
                str = "action";
            } else {
                String str2 = this.A05;
                if (str2 == null) {
                    str = "contentId";
                } else {
                    String str3 = this.A06;
                    if (str3 != null) {
                        cj7.A03(blx, num, str2, str3, this.A07, i, i2);
                        this.A08 = false;
                        return;
                    }
                    str = "contentOwnerId";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A01(BLX blx, Integer num, String str, String str2, String str3, int i, int i2) {
        C3o5.A0k(str, 4, str2);
        this.A03 = blx;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = str;
        this.A04 = num;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = true;
    }
}
