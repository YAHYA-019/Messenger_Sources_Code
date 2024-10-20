package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5j9, reason: invalid class name */
/* loaded from: 5j9.class */
public final class C5j9 extends AbstractC07384jq {
    public final 1Br A00;

    public C5j9(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A00 = 1Lm.A01(fbUserSession, 68746);
    }

    @Override // X.InterfaceC07394jr
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public 4kZ AgW(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        return ((C5jm) 1Br.A0B(this.A00)).A00(0Pz.A0W("MEDIA_DOWNLOAD_CONTROL_UI_STATE", 4YU.A0y(threadKey)));
    }
}
