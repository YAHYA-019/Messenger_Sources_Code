package com.facebook.messaging.rtc.safetywarning;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1Fv;
import X.1iF;
import X.2Ov;
import X.2QN;
import X.4YU;
import X.7zL;
import X.7zN;
import X.7zQ;
import X.AbF;
import X.AbK;
import X.BVT;
import X.C00i;
import X.C3o5;
import X.C7m;
import X.CCo;
import X.CDw;
import X.CJ5;
import X.DHN;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* loaded from: BlockedParticipantAddedDialogFragment.class */
public final class BlockedParticipantAddedDialogFragment extends 2Ov {
    public DHN A00;
    public final 1Br A02 = 1Bu.A02(this, 85071);
    public final 1Br A01 = 7zN.A0I(this);

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        C00i c00i = this.A02.A00;
        CCo cCo = (CCo) c00i.get();
        FbUserSession A06 = ((1Fv) 1Bi.A03(66351)).A06(this);
        11T.A0F(A06, 0);
        ImmutableList A0a = 1BL.A0a(((CJ5) 4YU.A0o(A06, cCo.A00, 83620)).A01().keySet());
        if (this.A00 == null) {
            throw 1BK.A0h();
        }
        Context requireContext = requireContext();
        CCo cCo2 = (CCo) c00i.get();
        FbUserSession A062 = ((1Fv) 1Bi.A03(66351)).A06(this);
        11T.A0F(A062, 0);
        2QN r0 = (2QN) 4YU.A0o(A062, cCo2.A00, 99978);
        Context A09 = 7zL.A09();
        int i = 2131964784;
        if (r0.A0a) {
            i = 2131964785;
        }
        String A13 = AbK.A13(A09, CCo.A00(A062, cCo2), i);
        CCo cCo3 = (CCo) c00i.get();
        FbUserSession A063 = ((1Fv) 1Bi.A03(66351)).A06(this);
        11T.A0F(A063, 0);
        2QN r02 = (2QN) 4YU.A0o(A063, cCo3.A00, 99978);
        Context A092 = 7zL.A09();
        int i2 = 2131964783;
        if (ThreadKey.A0S(r02.A05)) {
            i2 = 2131964781;
        }
        String A132 = AbK.A13(A092, CCo.A00(A063, cCo3), i2);
        CDw cDw = new CDw();
        CDw.A00(cDw, this, ActionId.APP_WILL_ENTER_FOREGROUND);
        c00i.get();
        String A0u = 1BK.A0u(7zL.A09(), 2131964782);
        cDw.A02 = A0u;
        AbF.A1V(A0u);
        C7m c7m = new C7m(cDw);
        CDw cDw2 = new CDw();
        CDw.A00(cDw2, this, ActionId.APP_DID_ENTER_BACKGROUND);
        c00i.get();
        String A0u2 = 1BK.A0u(7zL.A09(), 2131964780);
        cDw2.A02 = A0u2;
        AbF.A1V(A0u2);
        ImmutableList of = ImmutableList.of((Object) c7m, (Object) new C7m(cDw2));
        11T.A0A(of);
        MigColorScheme A0m = 7zQ.A0m(this.A01);
        C3o5.A0k(requireContext, 0, A0m);
        return BVT.A00(requireContext, (Drawable) null, A0m, of, A13, A132, A0a, true);
    }

    public 1iF A17() {
        return AbF.A0C(3461599647265142L);
    }
}
