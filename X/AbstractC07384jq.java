package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.4jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jq.class */
public abstract class AbstractC07384jq implements InterfaceC07394jr {
    public static final InterfaceC07434jv A00 = new Object();
    public static final InterfaceC07464jy A01 = new Object();

    @Override // X.InterfaceC07394jr
    public InterfaceC07434jv AVj(ThreadKey threadKey) {
        if (this instanceof C07374jp) {
            return (InterfaceC07434jv) 1Bn.A0E((Context) null, ((C07374jp) this).A00.A00, 66018);
        }
        if (!(this instanceof C07614kP)) {
            return A00;
        }
        11T.A0F(threadKey, 0);
        return new 5nO(threadKey);
    }

    @Override // X.InterfaceC07394jr
    public InterfaceC07464jy Ad8(ThreadKey threadKey) {
        if (!(this instanceof 4kR)) {
            return A01;
        }
        11T.A0F(threadKey, 0);
        FbUserSession fbUserSession = ((4kR) this).A00;
        Context A002 = FbInjector.A00();
        11T.A0A(A002);
        return ((InterfaceC07394jr) 1Lm.A05(A002, fbUserSession, 67812)).Ad8(threadKey);
    }
}
