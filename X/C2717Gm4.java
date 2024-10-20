package X;

/* renamed from: X.Gm4, reason: case insensitive filesystem */
/* loaded from: Gm4.class */
public final class C2717Gm4 extends 2Yv {
    public GRS A00;
    public HkR A01;
    public GRD A02;
    public GRB A03;
    public 6U2 A04;
    public GPl A05;
    public GRX A06;
    public GRd A07;
    public GRI A08;
    public Exception A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            Integer num = (Integer) objArr[0];
            C00j.A05("GrootComponentSpec.updatePlaybackState", 682665560);
            C00j.A01(-440364415);
            this.A0A = num;
            return;
        }
        if (i == 1) {
            this.A0C = 7zO.A1Z(objArr, 0);
        } else if (i == 2) {
            this.A09 = (Exception) objArr[0];
        } else if (i == 3) {
            this.A08 = (GRI) objArr[0];
        }
    }
}
