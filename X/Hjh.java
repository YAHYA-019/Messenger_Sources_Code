package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.upload.apis.ResumableUploadCallableFactory;

/* loaded from: Hjh.class */
public final class Hjh {
    public Context A00;
    public final 1I7 A01;
    public final C00i A02;
    public final C00i A03;
    public final IAW A04;
    public final 5Hw A05;
    public final ResumableUploadCallableFactory A06;
    public final Hq4 A07;
    public final HrA A08;

    public Hjh(FbUserSession fbUserSession) {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = DKD.A0H(A00);
        this.A02 = AbH.A0E();
        this.A04 = (IAW) 1Bi.A03(116133);
        this.A05 = (5Hw) 1Bi.A03(49660);
        this.A07 = (Hq4) 1Bi.A03(116139);
        this.A06 = (ResumableUploadCallableFactory) 1Lo.A06(fbUserSession, 116207);
        this.A08 = (HrA) 1Lo.A06(fbUserSession, 116177);
        this.A03 = new 1MV(fbUserSession, 116131);
    }
}
