package com.facebook.rtc.screenshare.casttofriends;

import X.0FI;
import X.11T;
import X.1BM;
import X.1Br;
import X.1Bu;
import X.2Ov;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zU;
import X.8DF;
import X.AJU;
import X.AQe;
import X.C01g;
import X.C01i;
import X.C03i;
import X.J9p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;

/* loaded from: CastToFriendsDialog.class */
public final class CastToFriendsDialog extends 2Ov {
    public LithoView A00;
    public final C01i A03;
    public final 1Br A02 = 1Bu.A02(this, 16980);
    public final FbUserSession A01 = 1BM.A01(this);

    /* JADX WARN: Multi-variable type inference failed */
    public CastToFriendsDialog() {
        J9p j9p = new J9p(this, 47);
        C01i A00 = C01g.A00(C03i.A02, new J9p(new J9p(this, 44), 45));
        this.A03 = 7zU.A0F(new J9p(A00, 46), j9p, AQe.A00(null, A00, 42), 7zL.A18(8DF.class));
    }

    public boolean Bkd() {
        A0o();
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1827434335);
        11T.A0F(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0G = 7zM.A0G(layoutInflater, viewGroup, 2132541679, false);
        0FI.A08(743079305, A02);
        return A0G;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1105866274);
        super.onDestroyView();
        this.A00 = null;
        0FI.A08(-791620789, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = 7zL.A0b(view, 2131363329);
        AJU.A02(this, 7zO.A0J(this), 28);
    }
}
