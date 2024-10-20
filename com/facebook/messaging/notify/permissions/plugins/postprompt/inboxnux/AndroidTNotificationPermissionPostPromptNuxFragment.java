package com.facebook.messaging.notify.permissions.plugins.postprompt.inboxnux;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Iw;
import X.1JW;
import X.1wT;
import X.2Pe;
import X.2RH;
import X.2cK;
import X.2cM;
import X.2qQ;
import X.4YU;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8Tn;
import X.AbF;
import X.AbK;
import X.C00i;
import X.C1u3;
import X.C2dn;
import X.C2do;
import X.C5yv;
import X.C5yw;
import X.C8nn;
import X.C8xf;
import X.CZF;
import X.CxE;
import X.DKB;
import X.FAJ;
import X.FJE;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.neue.nux.NuxFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Map;

/* loaded from: AndroidTNotificationPermissionPostPromptNuxFragment.class */
public final class AndroidTNotificationPermissionPostPromptNuxFragment extends NuxFragment {
    public final 1Br A06 = 7zN.A0I(this);
    public final 1Br A09 = 1Bu.A02(this, 100122);
    public final 1Br A0A = 1HG.A01(this, 83178);
    public final 1Br A0B = 1Bu.A02(this, 65920);
    public final 1Br A07 = 1Bu.A02(this, 17005);
    public final 1Br A08 = 1Bq.A00(33158);
    public final 1Br A05 = 1BK.A0E();
    public final 1Br A04 = 1Bu.A00(66245);
    public final int A01 = 2132411111;
    public final int A00 = 2132346647;
    public final View.OnClickListener A03 = CZF.A00(this, 24);
    public final View.OnClickListener A02 = CZF.A00(this, 23);

    @Override // com.facebook.messaging.neue.nux.NuxFragment
    public String A1b() {
        return DKB.A00(51);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && ((C2dn) 1Br.A0B(this.A08)).BUX()) {
            FAJ.A00((FAJ) 1Br.A0B(this.A09), "notifications_permission_granted", (Map) null);
            ((2Pe) 1Br.A0B(this.A07)).D5o();
        }
        7zR.A14(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A04 = 7zQ.A04(layoutInflater, 1667502372);
        LithoView A0V = 7zO.A0V(layoutInflater.getContext());
        0FI.A08(1229755414, A04);
        return A0V;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [X.2qQ, java.lang.Object] */
    public void onViewCreated(View view, Bundle bundle) {
        C5yv c5yv;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = (LithoView) view;
        1Iw A0U = AbF.A0U(lithoView);
        C00i c00i = this.A06.A00;
        MigColorScheme.A00(lithoView, 7zM.A11(c00i));
        2cM A01 = 2cK.A01(A0U, (String) null, 0);
        if (((1wT) 1Br.A0B(this.A04)).A01()) {
            C5yw A00 = C5yv.A00(A0U);
            A00.A2b(7zM.A11(c00i));
            A00.A2X();
            CxE.A01(A00, this, 73);
            A00.A2i(false);
            A00.A2h(false);
            c5yv = A00.A2V();
        } else {
            c5yv = null;
        }
        A01.A2e(c5yv);
        8Tn A002 = C8nn.A00(A0U);
        A002.A2a(7zM.A11(c00i));
        String A0u = 7zN.A0u(A0U, AbK.A12(A0U.A0D), 2131962276);
        MigColorScheme A11 = 7zM.A11(c00i);
        ?? obj = new Object();
        7zM.A1V((2qQ) obj, this.A01);
        A002.A2Y(new 8NJ(new 8Lf(this.A03, this.A02, A0U.A0D(2131962277), A0U.A0D(2131962275), true), new C8xf(null, 7zT.A02((2qQ) obj, A11, this.A00)), (CharSequence) null, (CharSequence) null, A0u, 1JW.A03(new 8Ll[]{new 8Ll(C1u3.A5S, A0U.A0D(2131962272), (CharSequence) null, (String) null), new 8Ll(C1u3.A39, A0U.A0D(2131962273), (CharSequence) null, (String) null), new 8Ll(C1u3.A5l, A0U.A0D(2131962274), (CharSequence) null, (String) null)}), true));
        4YU.A1N(A002, 2RH.A06);
        lithoView.A0y(7zL.A0V(A01, A002.A2W()));
        1Br.A08(this.A05).putBoolean(C2do.A01, true).commitImmediately();
        ((FJE) 1Br.A0B(this.A0A)).A0F(DKB.A00(51));
        FAJ.A00((FAJ) 1Br.A0B(this.A09), "notifications_permission", (Map) null);
    }
}
