package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.OneLineComposerView;
import com.facebook.messaging.nativepagereply.savedreplies.creation.ui.SwipeableSavedRepliesTrayCreationView;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: D60.class */
public final class D60 implements Runnable {
    public static final String __redex_internal_original_name = "SwipeableSavedRepliesTrayCreationView$8$1";
    public final /* synthetic */ CnE A00;

    public D60(CnE cnE) {
        this.A00 = cnE;
    }

    @Override // java.lang.Runnable
    public void run() {
        SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView = this.A00.A00;
        Bfh bfh = swipeableSavedRepliesTrayCreationView.A08;
        if (bfh != null) {
            if (swipeableSavedRepliesTrayCreationView.A0E) {
                Context context = swipeableSavedRepliesTrayCreationView.getContext();
                BIc bIc = bfh.A00;
                Integer num = 0S2.A00;
                bIc.A0W(num);
                bIc.A0D = false;
                6Qe r0 = bIc.A05;
                if (r0 != null) {
                    r0.A00.A09.A08("saved_reply_v2");
                    FbSharedPreferences A0R = 1BK.A0R(bIc.A01);
                    1G2 r02 = 1NK.A3C;
                    if (A0R.AZn(r02, false)) {
                        1UG A08 = 1BK.A08(1BK.A07(((COU) bIc.A0E.get()).A01), "messenger_business_save_reply_bar_button_tooltip_impression");
                        if (A08.isSampled()) {
                            FbUserSession A00 = 1Fw.A00();
                            1UG.A02(A08, "business__inbox__saved__replies");
                            COU.A02(new 0DA(), A08, A00);
                        }
                    }
                    6Qe r03 = bIc.A05;
                    C8B c8b = new C8B(new Bfg(bfh), 0S2.A0j, num, "saved_reply_v2", AbJ.A0y(context, 2131965445));
                    6Pi r04 = ((OneLineComposerView) r03.A00.A0A).A0j;
                    C00i c00i = r04.A03;
                    if (!1BK.A0R(c00i).AZn(r02, false) && r04.A01(c8b)) {
                        1Ql.A03(r02, c00i.get(), true);
                    }
                }
            } else {
                bfh.A00.A0W(0S2.A00);
            }
        }
        swipeableSavedRepliesTrayCreationView.A0W();
    }
}
