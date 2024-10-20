package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.5k7, reason: invalid class name */
/* loaded from: 5k7.class */
public final class C5k7 implements InterfaceC07394jr {
    public final FbUserSession A00;
    public final 1De A01;

    public C5k7(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A01 = r303;
        this.A00 = fbUserSession;
    }

    @Override // X.InterfaceC07394jr
    public InterfaceC07434jv AVj(ThreadKey threadKey) {
        return (InterfaceC07434jv) 1Bn.A0E((Context) null, this.A01.A00, 66085);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4jy, java.lang.Object] */
    @Override // X.InterfaceC07394jr
    public InterfaceC07464jy Ad8(ThreadKey threadKey) {
        return new Object();
    }

    @Override // X.InterfaceC07394jr
    public InterfaceC07514k3 AgW(ThreadKey threadKey) {
        11T.A0F(threadKey, 0);
        return ((C07474jz) 1Lm.A07(this.A00, this.A01.A00, 65870)).A00(threadKey);
    }
}
