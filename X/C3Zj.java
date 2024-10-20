package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.3Zj, reason: invalid class name */
/* loaded from: 3Zj.class */
public final class C3Zj implements DFQ {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 5pG A01;

    public C3Zj(FbUserSession fbUserSession, 5pG r303) {
        this.A01 = r303;
        this.A00 = fbUserSession;
    }

    public final void CHd(ImmutableSet immutableSet) {
        if (immutableSet != null) {
            ((C3Qq) 1Br.A0B(this.A01.A04)).A01(this.A00, immutableSet);
        }
    }
}
