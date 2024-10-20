package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.93f, reason: invalid class name */
/* loaded from: 93f.class */
public final class C93f extends AbstractC07384jq {
    public final FbUserSession A00;

    public C93f(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
    }

    @Override // X.InterfaceC07394jr
    public /* bridge */ /* synthetic */ InterfaceC07514k3 AgW(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        return ((C5jm) 1Lm.A06(this.A00, 68746)).A00(0Pz.A0W("NULL_STATE_UI_STATE_PREFIX", 4YU.A0y(threadKey)));
    }
}
