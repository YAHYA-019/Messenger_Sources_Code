package X;

import java.util.concurrent.CancellationException;

/* loaded from: IkE.class */
public final class IkE implements JMY {
    public final Hqo A00;
    public final IF5 A01;
    public final String A02;
    public final JIC A03;
    public final Hqj A04;
    public final JNB A05;
    public final JMJ A06;
    public final java.util.Map A07;

    public IkE(JIC jic, Hqj hqj, Hqo hqo, QyG qyG, JMJ jmj, String str, java.util.Map map) {
        1BK.A1K(str, 2, jic);
        this.A00 = hqo;
        this.A02 = str;
        this.A07 = map;
        this.A03 = jic;
        this.A06 = jmj;
        this.A05 = hqo.A02;
        this.A04 = hqj;
        ROD rod = new ROD(jic, map, hqo.A01.A0A());
        this.A01 = qyG.A00(new HdY(jic, map, GOp.A08(str)), hqj, this, new Hyh(jic, map), rod, QpB.A03);
    }

    public void CJz(Rb8 rb8, float f) {
        synchronized (this) {
            this.A06.CEI(f);
        }
    }

    public void CRb(Exception exc) {
        synchronized (this) {
            this.A01.A07();
            this.A06.Bxd(exc);
        }
    }

    public void CRg(HtP htP) {
        this.A06.CSx(htP.A00());
    }

    public void CSw(RZ2 rz2) {
        synchronized (this) {
            this.A06.onSuccess(new Rac(QpB.A03, rz2, AnonymousClass001.A0s()));
        }
    }

    public void Cja() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D8Q() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IkE.D8Q():void");
    }

    public void cancel() {
        synchronized (this) {
            this.A01.A07();
        }
        this.A06.Bn7(new CancellationException("RawMediaUploadStrategy canceled by user"));
    }
}
