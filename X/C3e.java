package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;

/* loaded from: C3e.class */
public final class C3e {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ AfV A02;

    public C3e(FbUserSession fbUserSession, 1Br r303, AfV afV) {
        this.A02 = afV;
        this.A00 = fbUserSession;
        this.A01 = r303;
    }

    public void A00() {
        AfV afV = this.A02;
        BkB bkB = (BkB) afV.A04.getValue();
        1Br r0 = bkB.A01;
        QuickPerformanceLogger A0e = 7zP.A0e(r0);
        int i = bkB.A00;
        A0e.markerAnnotate(744820896, i, "fail_reason", "save");
        7zP.A0e(r0).markerEnd(744820896, i, (short) 3);
        ((C1x1) afV.A02.getValue()).A00(afV.A00, BLT.A02);
    }
}
