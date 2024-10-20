package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.avatar.socialstickers.model.DisclaimerTriggerSource;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function1;

/* renamed from: X.6i4, reason: invalid class name */
/* loaded from: 6i4.class */
public final class C6i4 {
    public Function1 A00;
    public boolean A01;
    public final 1Br A02;
    public final C01i A03;

    public C6i4(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A03 = C01g.A01(new AnonymousClass831(fbUserSession, 26));
        this.A02 = 1Bu.A00(68617);
    }

    public final void A00(DisclaimerTriggerSource disclaimerTriggerSource, ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        if (this.A01 || !((7G3) this.A02.A00.get()).A02()) {
            return;
        }
        ((C6k3) this.A03.getValue()).A00(new AVI(35, disclaimerTriggerSource, threadKey, this));
    }
}
