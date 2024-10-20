package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.Gcr, reason: case insensitive filesystem */
/* loaded from: Gcr.class */
public final class C2430Gcr extends Ic7 implements JQ3, JPf {
    public int A00;
    public Req A01;
    public JQ1 A02;
    public I5d A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final HPA A0A;
    public final JLp A0B;
    public final JLq A0C;
    public final I4V A0D;
    public final I1d A0E;

    public C2430Gcr(JOW jow) {
        super.A00 = jow;
        this.A0D = I4V.A00();
        this.A0A = new HPA(this);
        this.A0B = new Id3(this, 4);
        Hvf hvf = JO2.A00;
        Object i1d = new I1d();
        Object A09 = Ic7.A09(this, hvf);
        I1d i1d2 = (I1d) (A09 != null ? A09 : i1d);
        this.A0E = i1d2;
        Handler handler = (Handler) jow.Adn(JO2.A0F);
        handler = handler == null ? ((JQ7) Ic7.A08(this, JQ7.A00)).AoV("Lite-SurfacePipe-Thread") : handler;
        this.A09 = handler;
        Hvf hvf2 = JNz.A02;
        Boolean A0d = 1BK.A0d();
        boolean A0A = Ic7.A0A(this, hvf2, A0d);
        this.A04 = A0A;
        this.A01 = new Req(handler, jow, i1d2, A0A);
        if (Ic7.A0A(this, JNz.A00, A0d)) {
            RtF rtF = new RtF(handler);
            this.A0C = rtF;
            rtF.CvC(30);
        }
        this.A07 = Ic7.A0A(this, JNz.A01, A0d);
    }

    @Override // X.Ic7
    public void A0D() {
        GuJ guJ = JQ1.A00;
        if (Ic7.A0B(this, guJ)) {
            this.A02 = (JQ1) Ic7.A07(this, guJ);
        }
        Req req = this.A01;
        JOW jow = req.A08;
        JQC AdC = jow.AdC(JPz.A01);
        AdC.getClass();
        req.A02 = (JPz) AdC;
        jow.Adn(JNr.A00);
    }

    @Override // X.Ic7
    public void A0E() {
        this.A03 = null;
        this.A0D.A01();
        Req req = this.A01;
        Handler handler = req.A04;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.post(new S6i(req));
            return;
        }
        req.A09.clear();
        req.A0A.clear();
        req.A06.clear();
        req.A05.clear();
        req.A07.clear();
    }

    @Override // X.JQ3
    public void A6y(I5d i5d) {
        IHY.A00(this.A01.A02).A5n(new Icv(this.A0E, i5d), 0);
    }

    @Override // X.JQ3
    public void A7V(JG4 jg4) {
        if (this.A0D.A02(jg4)) {
            Req req = this.A01;
            int i = req.A01;
            int i2 = req.A00;
            if (i <= 0 || i2 <= 0) {
                return;
            }
            jg4.CAR(i, i2, 0, 0, this.A04);
        }
    }

    @Override // X.JQ3
    public JNZ BDt() {
        throw AnonymousClass001.A0p();
    }

    @Override // X.JQ3
    public boolean BNd() {
        JQ6 jq6 = ((C2419Gcg) this.A01.A02).A06.A00;
        if (jq6 != null) {
            return jq6.BNe();
        }
        return false;
    }

    @Override // X.JQ3
    public void Ceu(I5d i5d) {
        IHY.A00(this.A01.A02).CeN(0, i5d);
    }

    @Override // X.JQ3
    public void CfE(JG4 jg4) {
        this.A0D.A03(jg4);
    }

    @Override // X.JQ3
    public void Co6(boolean z) {
    }

    @Override // X.JQ3
    public void Cpk(Object obj, int i, int i2, int i3) {
        throw AnonymousClass001.A0q("setInput not supported");
    }

    @Override // X.JQ3
    public /* synthetic */ void Cpl(int i, Object obj, int i2, int i3, int i4) {
        throw AnonymousClass001.A0q("setInput not supported");
    }

    @Override // X.JQ3
    public /* synthetic */ void Cs5(HJY hjy, Object obj) {
    }

    @Override // X.JQ3
    public void CtE(boolean z) {
        I5d i5d = this.A03;
        if (i5d != null) {
            i5d.A0E = z;
        }
    }

    @Override // X.JQ3
    public /* synthetic */ void CtN(HWr hWr) {
    }

    @Override // X.JQ3
    public void CwK(JKN jkn) {
        throw AnonymousClass001.A0p();
    }
}
