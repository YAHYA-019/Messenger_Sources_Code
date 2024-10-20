package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.internalprefs.presence.MessengerInternalPresenceDebugActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: D7j.class */
public final class D7j implements Runnable {
    public static final String __redex_internal_original_name = "MessengerInternalPresenceDebugActivity$filterAndRenderUsersToListItems$1$1";
    public final /* synthetic */ MessengerInternalPresenceDebugActivity A00;
    public final /* synthetic */ ImmutableList A01;

    public D7j(MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity, ImmutableList immutableList) {
        this.A00 = messengerInternalPresenceDebugActivity;
        this.A01 = immutableList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity = this.A00;
        final ImmutableList immutableList = this.A01;
        LithoView lithoView = (LithoView) messengerInternalPresenceDebugActivity.A0K.getValue();
        final MigColorScheme A0c = 7zR.A0c(messengerInternalPresenceDebugActivity);
        final List list = messengerInternalPresenceDebugActivity.A05;
        final int intValue = messengerInternalPresenceDebugActivity.A02.intValue();
        final 3wJ r0 = messengerInternalPresenceDebugActivity.A0C;
        final 4LS r02 = messengerInternalPresenceDebugActivity.A0B;
        lithoView.A0y(new 1LH(r02, A0c, r0, immutableList, list, intValue) { // from class: X.8c1
            public final int A00;
            public final 4LS A01;
            public final MigColorScheme A02;
            public final 3wJ A03;
            public final ImmutableList A04;
            public final List A05;

            {
                7zT.A1T(A0c, list, r0);
                this.A02 = A0c;
                this.A05 = list;
                this.A00 = intValue;
                this.A03 = r0;
                this.A04 = immutableList;
                this.A01 = r02;
            }

            public 1LI A0s(C2k5 c2k5) {
                11T.A0F(c2k5, 0);
                C2sn A0L = 7zR.A0L(c2k5);
                1Iw r03 = A0L.A00;
                8TK A00 = 3wK.A00(r03);
                MigColorScheme migColorScheme = this.A02;
                A00.A2X(migColorScheme);
                A00.A2Z(this.A05);
                int i = this.A00;
                3wK r04 = A00.A01;
                r04.A00 = i;
                A00.A2Y(this.A03);
                r04.A03 = AnonymousClass955.CENTERED;
                A0L.A00(A00.A2W());
                C2ze A002 = 2hU.A00(r03);
                A002.A2X(9xN.A00);
                4LS r05 = this.A01;
                2hU r06 = A002.A01;
                r06.A05 = r05;
                r06.A0D = false;
                A002.A2Y(BWx.A00(migColorScheme));
                A0L.A00(A002.A2W());
                8OH A003 = C8m6.A00(r03);
                A003.A2W(this.A04);
                A003.A0R();
                A003.A0J();
                A0L.A00(A003.A01);
                return 7zU.A0H(A0L);
            }
        });
    }
}
