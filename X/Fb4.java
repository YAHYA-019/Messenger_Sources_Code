package X;

import com.facebook.messaging.communitymessaging.plugins.chatcaptain.chatcaptaintabemptystate.ChatCaptainTabEmptyStateConfigImplementation;
import com.facebook.messaging.communitymessaging.plugins.chatcaptain.chathostinviteentrypoint.ChatHostInviteEntryPointImplementation;
import com.facebook.messaging.wellbeing.unknowncontact.scams.marketplace.plugins.hintcard.ScamMarketplaceHintCardImplementation;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;

/* loaded from: Fb4.class */
public final class Fb4 implements GEA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fb4(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public void onDismiss() {
        06Z r303;
        switch (this.A00) {
            case 0:
                C00i c00i = ((EiC) 1Br.A0B(((ElA) this.A01).A00.A00)).A00.A00;
                FbSharedPreferences A0S = 1BK.A0S(c00i);
                User A0v = 7zQ.A0v();
                1G9 r0 = 1NK.A5S;
                1G9 A05 = 1G9.A05(r0, A0v.A13);
                1G2 A03 = 1G9.A03(A05, A05);
                11T.A0A(A03);
                int A032 = 7zM.A03(A0S, A03);
                1Ql A0U = 1BL.A0U(c00i);
                1G9 A052 = 1G9.A05(r0, 7zQ.A0v().A13);
                1G2 A033 = 1G9.A03(A052, A052);
                11T.A0A(A033);
                7zO.A1T(A0U, A033, A032);
                F4G.A00((F4G) this.A02, "INTERSTITIAL_DISMISS");
                return;
            case 1:
                r303 = ((ChatCaptainTabEmptyStateConfigImplementation) this.A02).A01;
                DKT.A07(r303);
                return;
            case 2:
                r303 = ((ChatHostInviteEntryPointImplementation) this.A02).A01;
                DKT.A07(r303);
                return;
            default:
                r303 = ((ScamMarketplaceHintCardImplementation) this.A02).A01;
                DKT.A07(r303);
                return;
        }
    }
}
