package com.facebook.messaging.r2l.ui;

import X.1BV;
import X.1Bi;
import X.1Fv;
import X.1Iw;
import X.1Lo;
import X.2Qb;
import X.8lH;
import X.9aB;
import X.C00i;
import X.C9Or;
import X.CIc;
import X.N8J;
import X.QFE;
import X.QJK;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.user.model.UserKey;

/* loaded from: Rooms2LiveLobbyJoinInterstitialDialogFragment.class */
public class Rooms2LiveLobbyJoinInterstitialDialogFragment extends Rooms2LiveDialogFragment {
    public static C9Or A03;
    public C00i A00;
    public final C00i A01 = new 1BV(this, 84833);
    public final C00i A02 = new 1BV(68476);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.r2l.ui.Rooms2LiveDialogFragment
    public void A1C(LithoView lithoView) {
        FbUserSession A06 = ((1Fv) 1Bi.A03(66351)).A06(this);
        this.A00 = 1Lo.A02(A06, this, 17016);
        1Iw r0 = lithoView.A09;
        9aB r02 = (9aB) this.A02.get();
        String A0D = r0.A0D(2131965145);
        C00i c00i = this.A00;
        c00i.getClass();
        VideoChatLink videoChatLink = ((2Qb) c00i.get()).A06;
        8lH A00 = r02.A00(A06, videoChatLink == null ? null : videoChatLink.A07, r0, A03, A0D);
        QFE qfe = new QFE(r0, new QJK());
        qfe.A2X(A00);
        lithoView.A0x(qfe.A2W());
        C00i c00i2 = this.A00;
        c00i2.getClass();
        UserKey A08 = ((2Qb) c00i2.get()).A08();
        if (A08 != null) {
            C00i c00i3 = this.A01;
            ((CIc) c00i3.get()).A02(new N8J(0, A06, lithoView, this));
            ((CIc) c00i3.get()).A01(A06, Long.parseLong(A08.id));
        }
    }

    @Override // com.facebook.messaging.r2l.ui.Rooms2LiveDialogFragment
    public boolean A1D() {
        return true;
    }
}
