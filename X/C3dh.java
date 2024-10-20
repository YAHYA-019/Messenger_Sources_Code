package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.3dh, reason: invalid class name */
/* loaded from: 3dh.class */
public final /* synthetic */ class C3dh implements 2eF {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 2TR A01;
    public final /* synthetic */ java.util.Map A02;

    public /* synthetic */ C3dh(FbUserSession fbUserSession, 2TR r303, java.util.Map map) {
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A02 = map;
    }

    public final ListenableFuture A8b(Object obj) {
        final 2TR r0 = this.A01;
        final FbUserSession fbUserSession = this.A00;
        final java.util.Map map = this.A02;
        if (obj != null) {
            return new 1hM(obj);
        }
        0fH.A0A(2TR.class, "checking all messenger contacts with cap");
        return 2TR.A06(r0, new Supplier() { // from class: X.3dc
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return 2TR.A02(fbUserSession, r0, map, true);
            }
        });
    }
}
