package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* renamed from: X.80f, reason: invalid class name */
/* loaded from: 80f.class */
public final class C80f implements 2Yl {
    public final /* synthetic */ 1Iw A00;
    public final /* synthetic */ 6Hs A01;

    public C80f(1Iw r302, 6Hs r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    public void BoD() {
        6Hs r0 = this.A01;
        Set set = 6Hs.A0Q;
        AppBarLayout appBarLayout = r0.A09;
        if (appBarLayout != null) {
            appBarLayout.A03 = 10;
            appBarLayout.requestLayout();
        }
        LithoView lithoView = r0.A04;
        if (lithoView != null) {
            lithoView.A0x(7zL.A0Y());
        }
        06Z BDe = r0.A0J.BDe();
        6Fy r02 = r0.A0L;
        ThreadKey BF7 = r02.BF7();
        ThreadSummary threadSummary = r02.AgO().A03;
        5zD r03 = r0.A07;
        ThreadThemeInfo BEz = r03 != null ? r03.BEz() : null;
        Fragment fragment = new 6Jk();
        Bundle A0E = 7zR.A0E(BF7);
        A0E.putParcelable("thread_summary", threadSummary);
        A0E.putParcelable("thread_theme_info", BEz);
        fragment.setArguments(A0E);
        6Hw r04 = r0.A06;
        ((6Jk) fragment).A07 = r04;
        6Hx r05 = r0.A05;
        ((6Jk) fragment).A06 = r05;
        C06c A0G = 7zL.A0G(BDe);
        A0G.A0P(fragment, "search_in_chat", 2131368029);
        A0G.A0V("search_in_chat");
        A0G.A04();
        6FG r06 = r0.A08;
        if (r06 != null) {
            6F2 r07 = r06.A00;
            ImmutableSet immutableSet = 6F2.A4P;
            6Mr r08 = r07.A0u;
            if (r08 != null && r08.A03 != null) {
                6Mz.A01(r08.A07);
                6N2 r09 = r08.A08;
                AnonymousClass811 anonymousClass811 = r09.A01;
                if (anonymousClass811 != null && r09.A03) {
                    C80s.A01(anonymousClass811);
                }
                r09.A03 = false;
                6N4 r010 = r08.A05;
                r010.A07 = true;
                6N4.A01(r010);
                6N4.A02(r010);
                6N6 r011 = r08.A0A;
                r011.A03 = true;
                AnonymousClass811 anonymousClass8112 = r011.A02;
                if (anonymousClass8112 != null && r011.A04) {
                    C80s.A01(anonymousClass8112);
                }
                r011.A04 = false;
                6N6.A01(r011);
                6N8.A00(r08.A06);
                r08.A09.onEnterSearchInChat();
            }
        }
        r0.A0G.BNy();
        FbUserSession A0C = 4YV.A0C(this.A00.A0D);
        if (r04.A00 != null) {
            r04.A01 = true;
            6Hw.A00(A0C, C80u.MSNGR_SEARCH_IN_CONVERSATION_BAR_CLICKED);
        }
        if (r05.A01 != null) {
            r05.A05 = true;
            1UG A08 = 1BK.A08(1Br.A02(r05.A06), 1BJ.A00(469));
            if (A08.isSampled()) {
                0DA r012 = new 0DA();
                String str = r05.A01;
                if (str == null) {
                    throw 1BK.A0h();
                }
                r012.A07("instance_id", str);
                r012.A05(4YT.A00(77), 1);
                A08.A7T(r012, 4YT.A00(1262));
                A08.A5q(AbE.A00(19), 1);
                A08.BZL();
            }
        }
    }
}
