package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6u1, reason: invalid class name */
/* loaded from: 6u1.class */
public final class C6u1 extends AbstractC07384jq {
    public final FbUserSession A00;

    public C6u1(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
    }

    @Override // X.InterfaceC07394jr
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public 4kZ AgW(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        return ((C5jm) 1Lm.A06(this.A00, 68746)).A00(0Pz.A0W("VOICE_MODE_UI_STATE_PREFIX", String.valueOf(threadKey.A0s())));
    }
}
