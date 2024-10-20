package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.fury.context.ReqContext;
import com.facebook.messaging.communitymessaging.plugins.adminonboarding.hintcard.SendWelcomeMessageHintCardImplementation;
import com.facebook.messaging.communitymessaging.plugins.channellist.foldersubheader.CommunityMessagingFolderSubheaderImplementation;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: Czs.class */
public final class Czs implements 1HN, 1HO {
    public final int A00;
    public final Object A01;

    public Czs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        1GU r307;
        D5I d7a;
        L58 l58;
        switch (this.A00) {
            case 0:
                B3d b3d = (B3d) this.A01;
                List list = C2lb.A0J;
                r307 = b3d.A05;
                d7a = new D7A(r303, this);
                break;
            case 1:
                B9K b9k = (B9K) this.A01;
                CallerContext callerContext = B9K.A15;
                r307 = AbG.A0B(b9k.A0Z);
                d7a = new D5I(this);
                break;
            case 2:
                11T.A0F(r303, 1);
                if (r303.equals(CDb.A03)) {
                    Set keySet = ((CDb) this.A01).A01.keySet();
                    11T.A0A(keySet);
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        C6N c6n = ((Bc7) it.next()).A00;
                        c6n.A01 = null;
                        c6n.A0C.D7z();
                    }
                    return;
                }
                return;
            case 3:
                JU4 ju4 = (JU4) this.A01;
                if (!r303.equals(C1xm.A04) || (l58 = ju4.A0S) == null) {
                    return;
                }
                l58.A03(1BL.A1a(ju4.A1Q));
                return;
            case 4:
                11T.A0F(fbSharedPreferences, 0);
                SendWelcomeMessageHintCardImplementation sendWelcomeMessageHintCardImplementation = (SendWelcomeMessageHintCardImplementation) this.A01;
                6IV r0 = sendWelcomeMessageHintCardImplementation.A08;
                if (r0 != null) {
                    r0.D71();
                }
                1G2 r02 = 1NK.A06;
                if (fbSharedPreferences.AZn(r02, false)) {
                    7zP.A0N(sendWelcomeMessageHintCardImplementation.A03).CY3(new D5Y(sendWelcomeMessageHintCardImplementation));
                    return;
                }
                1HN r03 = SendWelcomeMessageHintCardImplementation.A0A;
                if (r03 == null) {
                    11T.A0L("listener");
                    throw 0Q8.createAndThrow();
                }
                fbSharedPreferences.D63(r03, r02);
                SendWelcomeMessageHintCardImplementation.A0B = false;
                sendWelcomeMessageHintCardImplementation.A05.AFT();
                return;
            case 5:
                11T.A0F(fbSharedPreferences, 0);
                CommunityMessagingFolderSubheaderImplementation communityMessagingFolderSubheaderImplementation = (CommunityMessagingFolderSubheaderImplementation) this.A01;
                if (fbSharedPreferences.AZn(communityMessagingFolderSubheaderImplementation.A0A, false)) {
                    return;
                }
                communityMessagingFolderSubheaderImplementation.A07.A00();
                return;
            case 6:
                11T.A0F(r303, 1);
                if (r303.equals(C2bv.A0o)) {
                    B3x.A00((B3x) this.A01);
                    return;
                }
                return;
            case 7:
                C1530Akj c1530Akj = ((CFA) this.A01).A00;
                if (c1530Akj != null) {
                    c1530Akj.A1X();
                    return;
                }
                return;
            case 8:
                1EK.A09(C1347Aep.__redex_internal_original_name, 459382642025155L);
                try {
                    ReqContext A04 = AnonymousClass018.A04(C1347Aep.__redex_internal_original_name, 0);
                    try {
                        C1347Aep c1347Aep = (C1347Aep) this.A01;
                        int i = 2131963637;
                        if (c1347Aep.A03.A02()) {
                            i = 2131963638;
                        }
                        c1347Aep.setSummary(i);
                        BdX bdX = c1347Aep.A01;
                        if (bdX != null) {
                            bdX.A00.A1c();
                        }
                        if (A04 != null) {
                            A04.close();
                        }
                        return;
                    } finally {
                    }
                } finally {
                    1EK.A03();
                }
            default:
                ((C1599Amg) this.A01).A08.D7z();
                return;
        }
        r307.Ciz(d7a);
    }
}
