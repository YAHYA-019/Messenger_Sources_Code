package com.facebook.messaging.blocking;

import X.1HH;
import X.1iF;
import X.2Ov;
import X.4YU;
import X.7zO;
import X.AbF;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.C00i;
import X.CSG;
import X.DE9;
import X.DR6;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: GroupCreateAskToUnblockDialog.class */
public class GroupCreateAskToUnblockDialog extends 2Ov {
    public FbUserSession A00;
    public C00i A01;
    public DE9 A02;
    public User A03;
    public final C00i A05 = AbF.A0S(this, 82650);
    public final C00i A04 = AbH.A0K();

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        this.A00 = AbL.A09(this);
        this.A01 = new 1HH(this, 50020);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = (User) bundle2.getParcelable("blockee");
        }
        this.A03.getClass();
        String A1B = AbF.A1B(this.A03);
        String A0u = 4YU.A0u(7zO.A0D(this), A1B, 2131957407);
        String A0u2 = 4YU.A0u(7zO.A0D(this), A1B, 2131957406);
        DR6 A02 = AbJ.A0c().A02(getContext());
        A02.A03(A0u);
        A02.A0J(A0u2);
        CSG.A05(A02, this, 26, 2131967511);
        A02.A0B((DialogInterface.OnClickListener) null, 2131953782);
        A02.A0K(false);
        return A02.A04();
    }

    public 1iF A17() {
        return AbN.A0B();
    }
}
