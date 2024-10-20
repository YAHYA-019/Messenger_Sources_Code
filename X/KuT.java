package X;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: KuT.class */
public final class KuT {
    public final C11474wl A00;
    public final 1Br A01;
    public final WeakReference A02;

    public KuT(C11474wl c11474wl, WeakReference weakReference) {
        11T.A0F(c11474wl, 2);
        this.A02 = weakReference;
        this.A00 = c11474wl;
        this.A01 = 1Bq.A00(16457);
    }

    private boolean A01() {
        Context context;
        L5Y l5y = (L5Y) this.A02.get();
        if (l5y == null || (context = l5y.A00) == null) {
            return false;
        }
        50O r0 = ((50K) 1Bn.A0E(context, (1BY) null, 49436)).A05;
        return 1BK.A1T(1BK.A0R(r0.A0F), r0.A06);
    }

    public final void A00(Ktt ktt) {
        if (ktt != null) {
            ktt.A0I = "PROMPTED_AUTOMATIC_AUTOFILL";
            L2l A01 = ktt.A01();
            WeakReference weakReference = this.A02;
            C3243Jnf A0S = JQz.A0S(weakReference);
            Bundle bundle = null;
            Bundle A06 = A0S != null ? A0S.A06() : null;
            C11474wl c11474wl = this.A00;
            LEA.A07(A06, c11474wl, A01);
            ktt.A0I = "ACCEPTED_AUTOMATIC_AUTOFILL";
            L2l A012 = ktt.A01();
            C3243Jnf A0S2 = JQz.A0S(weakReference);
            LEA.A07(A0S2 != null ? A0S2.A06() : null, c11474wl, A012);
            ktt.A02("enabled_automatic_autofill", "true");
            ktt.A0I = "PROMPTED_AUTOFILL";
            L2l A013 = ktt.A01();
            C3243Jnf A0S3 = JQz.A0S(weakReference);
            LEA.A07(A0S3 != null ? A0S3.A06() : null, c11474wl, A013);
            ktt.A0I = "ACCEPTED_AUTOFILL";
            L2l A014 = ktt.A01();
            C3243Jnf A0S4 = JQz.A0S(weakReference);
            if (A0S4 != null) {
                bundle = A0S4.A06();
            }
            LEA.A07(bundle, c11474wl, A014);
        }
    }

    public final boolean A02() {
        boolean z = false;
        if (2yD.A03(this.A00.A04.A00, 36311839672634944L) && A01()) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f0, code lost:
    
        if (r313 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A03() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KuT.A03():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (X.JR1.A1a(r301.A00.A04.A00, r302 ? 1 : 0, 36311839672634944L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A04(boolean r302) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A01()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L2d
            r0 = r301
            X.4wl r0 = r0.A00
            X.4wc r0 = r0.A04
            r304 = r0
            r0 = r304
            X.1CO r0 = r0.A00
            r305 = r0
            r0 = 36311839672634944(0x81016d00d40e40, double:3.027091852792029E-306)
            r306 = r0
            r0 = r305
            r1 = r302
            r2 = r306
            boolean r0 = X.JR1.A1a(r0, r1, r2)
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L31
        L2d:
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
        L31:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KuT.A04(boolean):boolean");
    }
}
