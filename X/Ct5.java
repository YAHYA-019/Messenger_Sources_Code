package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: Ct5.class */
public final class Ct5 implements DFs {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final DJZ A03;
    public final 1De A04;
    public final BPf A05;
    public final DFu A06;
    public final C15h A07;

    public Ct5(1De r302, DFu dFu, DHY dhy, DJZ djz) {
        this.A04 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 84075);
        this.A01 = 1Bu.A03(r0, 83912);
        this.A00 = 1Bu.A03(r0, 84117);
        B9b b9b = new B9b(this, dFu);
        this.A05 = b9b;
        this.A07 = new DBe(7zQ.A0I(r0), ActionId.RTMP_CONNECTION_FAILED);
        this.A03 = djz;
        ((C1k) 1Br.A0B(this.A00)).A00(b9b, dhy.Arf());
        this.A06 = dFu;
    }

    @Override // X.DFs
    public void BnA(String str) {
        if (str == null) {
            str = "";
        }
        DJZ djz = this.A03;
        if (11T.A0O(djz.Ay1().A0U, str)) {
            return;
        }
        Bz9 Ay4 = djz.Ay4();
        Ay4.A0U = str;
        DJZ.A00(Ay4, djz);
        11T.A0O(((C5U) this.A07.get()).A04, str);
    }
}
