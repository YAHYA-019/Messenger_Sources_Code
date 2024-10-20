package X;

/* renamed from: X.Gm0, reason: case insensitive filesystem */
/* loaded from: Gm0.class */
public final class C2713Gm0 extends 2Yv {
    public JIf A00;
    public 2Qn A01;
    public Runnable A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            Boolean valueOf = Boolean.valueOf(this.A05);
            Boolean bool = (Boolean) objArr[0];
            boolean booleanValue = bool.booleanValue();
            if (valueOf == null || !valueOf.equals(bool)) {
                valueOf = Boolean.valueOf(booleanValue);
            }
            this.A05 = valueOf.booleanValue();
            return;
        }
        if (i == 1) {
            Boolean valueOf2 = Boolean.valueOf(this.A06);
            Boolean bool2 = (Boolean) objArr[0];
            boolean booleanValue2 = bool2.booleanValue();
            if (valueOf2 == null || !valueOf2.equals(bool2)) {
                valueOf2 = Boolean.valueOf(booleanValue2);
            }
            this.A06 = valueOf2.booleanValue();
            return;
        }
        if (i == 2) {
            Boolean valueOf3 = Boolean.valueOf(this.A06);
            Object obj = this.A03;
            String str = this.A04;
            6TI r0 = (6TI) objArr[0];
            11T.A0F(r0, 3);
            if (str == null || !str.equals(r0.A03())) {
                str = r0.A03();
                valueOf3 = true;
                obj = r0.A02("CoWatchContentRating");
            }
            this.A06 = valueOf3.booleanValue();
            this.A03 = (String) obj;
            this.A04 = str;
        }
    }
}
