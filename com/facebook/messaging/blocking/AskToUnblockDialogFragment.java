package com.facebook.messaging.blocking;

import X.1BK;
import X.1iF;
import X.2Ov;
import X.4YU;
import X.7zO;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.C1pq;
import X.C5ic;
import X.CSG;
import X.DR6;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.blocking.params.BlockUnblockParams;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;

/* loaded from: AskToUnblockDialogFragment.class */
public class AskToUnblockDialogFragment extends 2Ov {
    public FbUserSession A00;
    public BlockUnblockParams A01;

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.Fragment, com.facebook.messaging.blocking.AskToUnblockDialogFragment, X.2Ov] */
    public static AskToUnblockDialogFragment A05(User user) {
        Name name = user.A0X;
        String A00 = name.A00();
        C1pq.A08("displayNameOrFullName", A00);
        String A02 = name.A02();
        C1pq.A08("shortDisplayName", A02);
        UserKey userKey = user.A0k;
        C1pq.A08("userKey", userKey);
        BlockUnblockParams blockUnblockParams = new BlockUnblockParams(userKey, A00, A02);
        ?? r0 = new 2Ov();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("params", blockUnblockParams);
        r0.setArguments(A05);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        this.A00 = AbL.A09(this);
        C5ic A0c = AbJ.A0c();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = (BlockUnblockParams) bundle2.getParcelable("params");
        }
        this.A01.getClass();
        String str = this.A01.A02;
        DR6 A02 = A0c.A02(getContext());
        String A0u = 4YU.A0u(7zO.A0D(this), str, 2131967529);
        A02.A00(2131967530);
        A02.A0J(A0u);
        CSG.A05(A02, this, 25, 2131967511);
        CSG.A04(A02, this, 24, 2131953782);
        A02.A0K(false);
        return A02.A04();
    }

    public 1iF A17() {
        return AbN.A0B();
    }
}
