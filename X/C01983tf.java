package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.graphql.calls.GraphQlCallInput;

/* renamed from: X.3tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tf.class */
public final class C01983tf extends 2Jf implements InterfaceC01633sc, Cloneable {
    public C01983tf(Class cls, String str, String str2, int i, long j, long j2) {
        super(cls, (Class) null, str, str2, "fbandroid", i, 0, j, j2, false, true);
        synchronized (this) {
            GraphQlCallInput graphQlCallInput = new 2Jd(ActionId.RTMP_STREAM_PREPARED);
            graphQlCallInput.A06("client_has_ods_usecase_counters", true);
            ((2Jf) this).A00.A00.A03().A0G();
            ((2Jf) this).A00.A01(graphQlCallInput, "%options");
        }
    }

    @Override // X.InterfaceC01633sc
    public ViewerContext BKF() {
        return null;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }
}
