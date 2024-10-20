package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.Gcc, reason: case insensitive filesystem */
/* loaded from: Gcc.class */
public final class C2415Gcc extends Ic7 implements JPy {
    public Icn A00;
    public IHW A01;
    public boolean A02;
    public final I4u A03;
    public final HP3 A04;
    public final HwD A05;
    public final JQ9 A06;
    public final JQ7 A07;
    public final JQ8 A08;

    public C2415Gcc(JOW jow) {
        super.A00 = jow;
        HJS hjs = JQ9.A00;
        JQ8 jq8 = null;
        JQ9 jq9 = jow.BRE(hjs) ? (JQ9) jow.AdD(hjs) : null;
        this.A06 = jq9;
        HJS hjs2 = JQ8.A00;
        this.A08 = jow.BRE(hjs2) ? (JQ8) jow.AdD(hjs2) : jq8;
        JQ7 jq7 = (JQ7) jow.AdD(JQ7.A00);
        this.A07 = jq7;
        HP3 hp3 = new HP3(this);
        this.A04 = hp3;
        HwD hwD = HwD.A00;
        this.A05 = hwD;
        if (Ic7.A0A(this, JO2.A05, false)) {
            JQC A07 = Ic7.A07(this, JPz.A01);
            11T.A0A(A07);
            I2L i2l = ((C2419Gcg) ((JPz) A07)).A05;
            if (i2l != null) {
                GuB.A01().A00("ArEngineRenderThread", 0);
                Id1 id1 = new Id1();
                Hvf hvf = JO2.A00;
                Object i1d = new I1d();
                Object A09 = Ic7.A09(this, hvf);
                this.A01 = new IHW((I1d) (A09 != null ? A09 : i1d), i2l.A00(jq7.AoV("ArEngineRenderThread").getLooper()), id1, Ic7.A0A(this, JNw.A00, false));
            }
        }
        IHW ihw = this.A01;
        Object obj = 0;
        Object A092 = Ic7.A09(this, JO2.A0I);
        I4u i4u = new I4u(ihw, AnonymousClass001.A03(A092 != null ? A092 : obj));
        this.A03 = i4u;
        Icn icn = (Icn) Ic7.A09(this, JNy.A01);
        this.A00 = icn;
        if (icn != null) {
            if (jq9 != null) {
                icn.A04 = jq9;
            }
            i4u.A01(hp3, hwD, icn);
        }
    }

    public static final void A00(C2415Gcc c2415Gcc) {
        I4u i4u = c2415Gcc.A03;
        if (i4u.A02 == null) {
            GuJ guJ = JPm.A01;
            if (Ic7.A0B(c2415Gcc, guJ)) {
                Icn icn = ((Gtm) ((JPm) Ic7.A07(c2415Gcc, guJ))).A00;
                11T.A0A(icn);
                c2415Gcc.A00 = icn;
                i4u.A01(c2415Gcc.A04, c2415Gcc.A05, icn);
            }
        }
    }

    @Override // X.JPy
    public void CGa(JJD jjd) {
        Icn icn;
        Handler handler;
        if (!this.A02 && jjd.BHT() == HC9.A0V && Ic7.A0A(this, JPy.A00, false)) {
            I4u i4u = this.A03;
            if (((Iir) jjd).A00 != null || (icn = i4u.A02) == null || (handler = icn.A01) == null) {
                return;
            }
            handler.post(new IvU(i4u, jjd));
            return;
        }
        if (this.A02) {
            Icn icn2 = this.A03.A02;
            if (icn2 == null) {
                throw 1BK.A0h();
            }
            icn2.CZQ(jjd);
        }
    }

    @Override // X.JPy
    public void CGb(JJD jjd, JJE jje) {
        11T.A0F(jje, 1);
        if (this.A02) {
            Icn icn = this.A03.A02;
            if (icn == null) {
                throw 1BK.A0h();
            }
            icn.CZR(jjd, jje);
        }
    }

    @Override // X.JPy
    public void CpB(List list) {
        11T.A0F(list, 0);
        this.A03.A02(list);
    }
}
