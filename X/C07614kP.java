package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.4kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kP.class */
public final class C07614kP extends AbstractC07384jq {
    @Override // X.InterfaceC07394jr
    public InterfaceC07514k3 AgW(ThreadKey threadKey) {
        C07654kb c07654kb;
        11T.A0F(threadKey, 0);
        if ((threadKey.A1K() && !threadKey.A1Q()) || threadKey.A1F() || threadKey.A1I() || threadKey.A0y()) {
            c07654kb = ((82O) 1Bn.A0A(394)).A0d(threadKey, true);
            11T.A0D(c07654kb);
        } else {
            c07654kb = 5nY.A00;
            11T.A0I(c07654kb, "null cannot be cast to non-null type com.facebook.xapp.messaging.datafetch.common.EmptyDataSource<T of com.facebook.xapp.messaging.datafetch.common.EmptyDataSource.Companion.create>");
        }
        return c07654kb;
    }
}
