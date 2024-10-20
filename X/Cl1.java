package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.messaging.communitymessaging.analytics.CommunityMessagingLoggerModel;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: Cl1.class */
public final class Cl1 implements Aab {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AmI A01;
    public final /* synthetic */ 0CL A02;
    public final /* synthetic */ boolean A03;

    public Cl1(Context context, AmI amI, 0CL r304, boolean z) {
        this.A00 = context;
        this.A01 = amI;
        this.A02 = r304;
        this.A03 = z;
    }

    @Override // X.Aab
    public void Bri(View view, String str) {
        if (str != null) {
            CQN.A03(this.A00, view, 7zQ.A0m(this.A01.A08), str);
        }
    }

    @Override // X.Aab
    public void CF3(String str) {
        ThreadKey threadKey;
        if (str != null) {
            AmI amI = this.A01;
            06Z r0 = amI.mFragmentManager;
            11T.A0A(r0);
            CQN.A05(r0, amI.A06, str, (String) null, "channel_invite_link_sheet", AmI.A06(amI, this.A03));
            C1296Ad8 A0W = 7zR.A0W();
            Community community = amI.A04;
            Long l = null;
            String str2 = community != null ? community.A0U : null;
            ThreadSummary threadSummary = amI.A06;
            if (threadSummary != null && (threadKey = threadSummary.A0n) != null) {
                l = AbF.A14(threadKey);
            }
            A0W.A04(new CommunityMessagingLoggerModel(null, null, str2, null, String.valueOf(l), null, null, "invite_link_settings", "view_qr_code", "thread_settings", null, null));
        }
    }

    @Override // X.Aab
    public void CHB() {
        String str;
        AmI amI = this.A01;
        C1296Ad8 c1296Ad8 = amI.A02;
        if (c1296Ad8 == null) {
            str = "cmLogger";
        } else {
            c1296Ad8.A04(new CommunityMessagingLoggerModel(null, null, null, null, null, null, null, "invite_link_settings", "render_chat_reset_invite_link_confirmation", "thread_settings", null, null));
            if (amI.A05 != null) {
                C5ic A0l = 7zQ.A0l();
                Object A0l2 = 7zO.A0l(amI, 16979);
                DR6 A02 = A0l.A02(amI.requireContext());
                AbG.A1E(7zO.A0D(amI), A02, 2131954514);
                AbM.A1A(7zO.A0D(amI), A02, 2131954000);
                A02.A0K(true);
                CSG.A02(A02, 7zO.A0D(amI).getString(2131954512), amI, 49);
                CSG.A01(A02, 7zO.A0D(amI).getString(2131954513), amI, 50);
                JZj A04 = A02.A04();
                A04.setOnShowListener(new CSN(0, A04, A0l2, amI));
                A04.show();
                return;
            }
            str = "threadKey";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.Aab
    public void CKO(String str) {
        String str2;
        Uri uri;
        ThreadKey threadKey;
        String str3;
        String str4;
        if (str != null) {
            Context context = this.A00;
            C96j c96j = C96j.A02;
            AmI amI = this.A01;
            ThreadSummary threadSummary = amI.A06;
            if (threadSummary != null) {
                str2 = threadSummary.A20;
                uri = threadSummary.A0V;
                threadKey = threadSummary.A0n;
            } else {
                str2 = null;
                uri = null;
                threadKey = null;
            }
            Community community = amI.A04;
            if (community != null) {
                str3 = community.A0U;
                str4 = community.A0T;
            } else {
                str3 = null;
                str4 = null;
            }
            CQN.A01(context, uri, c96j, threadKey, 4YV.A0j(), str, str2, "thread_settings", "channel_invite_link_screen", str3, str4, (String) null, false, false);
        }
    }

    @Override // X.Aab
    public void CLD(String str) {
        String str2 = (String) this.A02.element;
        if (str2 != null) {
            CQN.A04(this.A00, str2);
        }
    }

    @Override // X.Aab
    public void CQl(boolean z) {
    }
}
