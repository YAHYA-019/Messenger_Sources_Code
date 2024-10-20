package com.facebook.messaging.communitymessaging.plugins.adminonboarding.adminsuggestedactions;

import X.06Z;
import X.1BK;
import X.1Iw;
import X.1pI;
import X.7zT;
import X.AlF;
import X.B5H;
import X.BzL;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AdminSuggestedActionsViewBinderImplementation.class */
public final class AdminSuggestedActionsViewBinderImplementation {
    public final 06Z A00;
    public final FbUserSession A01;
    public final 1pI A02;
    public final 1Iw A03;

    public AdminSuggestedActionsViewBinderImplementation(06Z r302, FbUserSession fbUserSession, 1pI r304, 1Iw r305) {
        7zT.A1W(r305, r304, fbUserSession, r302);
        this.A03 = r305;
        this.A02 = r304;
        this.A01 = fbUserSession;
        this.A00 = r302;
    }

    public static final void A00(B5H b5h, AdminSuggestedActionsViewBinderImplementation adminSuggestedActionsViewBinderImplementation) {
        BzL bzL = AlF.A0Q;
        1pI r0 = adminSuggestedActionsViewBinderImplementation.A02;
        long j = b5h.A00;
        ThreadKey A07 = ThreadKey.A07(j);
        Long valueOf = Long.valueOf(j);
        String str = b5h.A01;
        bzL.A00(r0, A07, valueOf, str != null ? 1BK.A0n(str) : null);
    }
}
