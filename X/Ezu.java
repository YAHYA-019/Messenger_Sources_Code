package X;

import java.util.Collections;
import java.util.List;

/* loaded from: Ezu.class */
public final class Ezu {
    public GL7 A00;
    public final Object A02 = AnonymousClass001.A0R();
    public final F7l A01 = new F7l();

    public Ezu() {
        FwU fwU = new FwU(56, 10, false);
        fwU.put(32, Collections.emptyList());
        fwU.A01 = true;
        fwU.A03 = EaO.A00.incrementAndGet();
        this.A00 = fwU;
    }

    public GL7 A00() {
        GL7 gl7;
        synchronized (this.A02) {
            gl7 = this.A00;
        }
        return gl7;
    }

    public GL7 A01(FyG fyG, int i) {
        F7l f7l = this.A01;
        FJ5.A05();
        if (!f7l.A00) {
            F7l.A00(f7l, fyG);
            f7l.A00 = true;
        }
        try {
            return (GL7) f7l.A01.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            FAo.A00(fyG, e);
            return null;
        }
    }

    public GL7 A02(FyG fyG, String str) {
        F7l f7l = this.A01;
        FJ5.A05();
        if (!f7l.A00) {
            F7l.A00(f7l, fyG);
            f7l.A00 = true;
        }
        return (GL7) f7l.A02.get(str);
    }

    public List A03() {
        List A0A;
        synchronized (this.A02) {
            A0A = GL7.A0A(this.A00);
        }
        return A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        if (r0.A01 != false) goto L38;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.F6U r302, X.FyG r303, java.util.List r304) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ezu.A04(X.F6U, X.FyG, java.util.List):void");
    }

    public void A05(GL7 gl7) {
        synchronized (this.A02) {
            this.A00 = gl7;
        }
    }
}
