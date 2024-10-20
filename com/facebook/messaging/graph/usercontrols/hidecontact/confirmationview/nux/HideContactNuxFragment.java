package com.facebook.messaging.graph.usercontrols.hidecontact.confirmationview.nux;

import X.0Q8;
import X.11T;
import X.1Iw;
import X.2cK;
import X.2cM;
import X.2fZ;
import X.3Ea;
import X.7zL;
import X.7zN;
import X.7zQ;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8Tn;
import X.AKJ;
import X.AbF;
import X.AbI;
import X.AbK;
import X.BCz;
import X.Be1;
import X.C01g;
import X.C01i;
import X.C1u3;
import X.C2fr;
import X.C5xv;
import X.C5yv;
import X.C5yw;
import X.C8nn;
import X.CGK;
import X.CZD;
import X.CxE;
import X.I2j;
import android.os.Bundle;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.widget.dialog.SlidingSheetFullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import java.util.List;

/* loaded from: HideContactNuxFragment.class */
public final class HideContactNuxFragment extends SlidingSheetFullScreenDialogFragment {
    public 3Ea A00;
    public FbUserSession A01;
    public CGK A02;
    public Be1 A03;
    public I2j A04;
    public MigColorScheme A05;
    public Integer A06;
    public String A07;
    public LithoView A08;
    public final C01i A09 = C01g.A01(new AKJ(this, 32));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00af, code lost:
    
        if (r0.equals(r311) != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.graph.usercontrols.hidecontact.confirmationview.nux.HideContactNuxFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = (LithoView) view;
        this.A08 = lithoView;
        if (lithoView != null) {
            1Iw r0 = lithoView.A09;
            MigColorScheme migColorScheme = this.A05;
            String str = "colorScheme";
            if (migColorScheme != null) {
                MigColorScheme.A00(lithoView, migColorScheme);
                11T.A0D(r0);
                C5xv A00 = CxE.A00(this, 44);
                C5yw A0b = 7zN.A0b(r0, false);
                MigColorScheme migColorScheme2 = this.A05;
                if (migColorScheme2 != null) {
                    A0b.A2b(migColorScheme2);
                    A0b.A2d(A00);
                    A0b.A2i(false);
                    C5yv A2V = A0b.A2V();
                    LithoView lithoView2 = this.A08;
                    if (lithoView2 != null) {
                        2cM A01 = 2cK.A01(r0, (String) null, 0);
                        A01.A2e(A2V);
                        8Tn A002 = C8nn.A00(r0);
                        MigColorScheme migColorScheme3 = this.A05;
                        if (migColorScheme3 != null) {
                            A002.A2a(migColorScheme3);
                            String A12 = AbK.A12(requireContext());
                            11T.A0A(A12);
                            int i = 2131957601;
                            if (7zQ.A0p().A03()) {
                                i = 2131957612;
                            }
                            C01i c01i = this.A09;
                            String A15 = AbI.A15(this, AbF.A1B((User) c01i.getValue()), i);
                            11T.A0D(A15);
                            List A0v = 7zN.A0v(8Ll.A01(C1u3.A2d, AbI.A15(this, AbF.A1B((User) c01i.getValue()), 2131957602), A15, (String) null, 8), 8Ll.A01(C1u3.A0p, getString(2131957607), AbI.A15(this, AbF.A1B((User) c01i.getValue()), 2131957606), (String) null, 8), 8Ll.A01(C1u3.A6e, getString(2131957605), getString(2131957604), (String) null, 8));
                            8Lf r02 = new 8Lf(CZD.A00(this, ActionId.RTMP_PACKET_RECEIVED), CZD.A00(this, 108), 7zN.A0s(this, 2131957599), getString(2131957600), true);
                            FbUserSession fbUserSession = this.A01;
                            if (fbUserSession != null) {
                                C2fr A0P = ((2fZ) 7zN.A0m(this, fbUserSession, 17067)).A0P((User) c01i.getValue());
                                11T.A0A(A0P);
                                BCz bCz = new BCz(A0P);
                                String string = getString(2131957603, AbF.A1B((User) c01i.getValue()), A12);
                                11T.A0A(string);
                                A002.A2Y(new 8NJ(r02, bCz, (CharSequence) null, (CharSequence) null, string, A0v, true));
                                lithoView2.A0y(7zL.A0V(A01, A002.A2W()));
                                return;
                            }
                            str = "fbUserSession";
                        }
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        11T.A0L("lithoView");
        throw 0Q8.createAndThrow();
    }
}
