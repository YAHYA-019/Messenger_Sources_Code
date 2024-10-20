package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset;

/* renamed from: X.Gcb, reason: case insensitive filesystem */
/* loaded from: Gcb.class */
public final class C2414Gcb extends Ic7 implements JPu {
    public Qxa A00;
    public JEA A01;
    public final GFM A02;

    public C2414Gcb(JOW jow) {
        super.A00 = jow;
        this.A02 = new IcN(this);
    }

    public void A0F(Hpi hpi) {
        Iir iir;
        if (this.A01 == null) {
            JQC A07 = Ic7.A07(this, JPv.A00);
            11T.A0A(A07);
            this.A01 = ((JPv) A07).AXQ();
        }
        JQC A072 = Ic7.A07(this, JPy.A01);
        11T.A0A(A072);
        JPy jPy = (JPy) A072;
        if (hpi != null) {
            JEA jea = this.A01;
            11T.A0D(jea);
            iir = jea.AI0(hpi);
        } else {
            iir = new Iir(null, null);
        }
        jPy.CGa(iir);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r308v2, types: [java.lang.Object, X.Qxa] */
    @Override // X.JPu
    public void CoL(ARRequestAsset aRRequestAsset, Hd4 hd4, JHu jHu, FEf fEf, String str) {
        if (str == null || aRRequestAsset == null) {
            jHu.BhE(str);
            A0F(null);
            return;
        }
        Qxa qxa = this.A00;
        Qxa qxa2 = qxa;
        if (qxa == null) {
            JQC A07 = Ic7.A07(this, JPv.A00);
            11T.A0A(A07);
            JJb AlW = ((JPv) A07).AlW();
            11T.A0A(AlW);
            GFM gfm = this.A02;
            ?? obj = new Object();
            ((Qxa) obj).A00 = AlW;
            ((Qxa) obj).A01 = gfm;
            this.A00 = obj;
            qxa2 = obj;
        }
        11T.A0D(qxa2);
        if (qxa2 != true) {
            throw 1BK.A0h();
        }
        IMz iMz = new IMz(hd4, jHu, this, str);
        qxa2.A00.Aiv(new Rlj(IMu.A00, iMz, aRRequestAsset, qxa2, fEf), qxa2.A01);
    }
}
