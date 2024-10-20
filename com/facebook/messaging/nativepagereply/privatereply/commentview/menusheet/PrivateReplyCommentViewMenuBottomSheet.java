package com.facebook.messaging.nativepagereply.privatereply.commentview.menusheet;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1BV;
import X.1BY;
import X.1Iw;
import X.1LI;
import X.1Lo;
import X.2JX;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zT;
import X.9Tp;
import X.C1u2;
import X.FJ8;
import X.QGs;
import android.content.Context;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: PrivateReplyCommentViewMenuBottomSheet.class */
public final class PrivateReplyCommentViewMenuBottomSheet extends MigBottomSheetDialogFragment {
    public FbUserSession A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        Context A0A = 7zL.A0A(r302);
        1BV A0R = 7zL.A0R(A0A, 16979);
        C1u2 A0I = 4YV.A0I();
        FbUserSession fbUserSession = this.A00;
        if (fbUserSession == null) {
            7zL.A1C();
            throw 0Q8.createAndThrow();
        }
        9Tp r0 = (9Tp) 1Lo.A04(A0A, fbUserSession, (1BY) null, 67689);
        Object A03 = FJ8.A03(requireArguments(), "comm_item");
        11T.A0I(A03, "null cannot be cast to non-null type com.facebook.messaging.nativepagereply.privatereply.commenttab.graphql.PrivateReplyCommentQueryResponse.Page.BusinessCommItemPartsPaginating.InlinePageCommItemPart");
        return new QGs(A0I, (2JX) A03, r0, 7zN.A0W(A0R));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1825678358);
        super.onCreate(bundle);
        this.A00 = 7zT.A08(this);
        0FI.A08(-1007883741, A02);
    }
}
