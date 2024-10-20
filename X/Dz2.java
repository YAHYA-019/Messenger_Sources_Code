package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.common.calltoaction.model.CTACustomerFeedback;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dz2.class */
public final class Dz2 extends C1rj {
    public View.OnClickListener A00;
    public FbUserSession A01;
    public EAX A02;
    public CTACustomerFeedback A03;
    public MigColorScheme A04;
    public DLP A05;
    public boolean A06;

    public Dz2() {
        super("CustomerFeedbackRootComponent");
    }

    public static 2K3 A00(1Iw r301, MigColorScheme migColorScheme, String str) {
        if (str == null) {
            return null;
        }
        2KD A0f = 7zR.A0f(r301, str, false);
        A0f.A10(80.0f);
        A0f.A0L();
        A0f.A2x(migColorScheme);
        A0f.A1Z(2RH.A06.sizeRes);
        A0f.A2X();
        A0f.A2b();
        A0f.A2f();
        return A0f.A2W();
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A03, this.A01, Boolean.valueOf(this.A06), this.A04, this.A00, this.A05};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x02db, code lost:
    
        if (r0 == 16) goto L22;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dz2.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0X e0x = (E0X) r303;
        e0x.A03 = false;
        e0x.A02 = false;
        e0x.A00 = "";
        e0x.A01 = "";
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
