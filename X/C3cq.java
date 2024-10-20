package X;

import com.facebook.messaging.lockchat.auth.AuthLockChatState;

/* renamed from: X.3cq, reason: invalid class name */
/* loaded from: 3cq.class */
public final class C3cq implements 1Vf {
    public final 1Br A00 = 1Bq.A00(83479);

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
        }
        C00i c00i = this.A00.A00;
        if (!((AuthLockChatState) c00i.get()).A00.get() || ((AuthLockChatState) c00i.get()).A02.get() == 1xS.A03) {
            return;
        }
        AuthLockChatState authLockChatState = (AuthLockChatState) c00i.get();
        authLockChatState.A02.set(1xS.A02);
    }
}
