package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.4jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jp.class */
public final class C07374jp extends AbstractC07384jq {
    public final 1De A00;
    public final FbUserSession A01;

    public C07374jp(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A00 = r303;
        this.A01 = fbUserSession;
    }

    @Override // X.InterfaceC07394jr
    public InterfaceC07514k3 AgW(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        return ((C07474jz) 1Lm.A07(this.A01, this.A00.A00, 65870)).A00(threadKey);
    }
}
