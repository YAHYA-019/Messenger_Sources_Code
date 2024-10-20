package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.polling.datamodels.PollingPublishedOption;
import com.facebook.messaging.polling.plugins.interfaces.pollvoterslistdata.PollVotersListDataProviderInterfaceSpec$DataSourceOverride;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.List;

/* loaded from: B0p.class */
public final class B0p extends C1rj {
    public FbUserSession A00;
    public 57Y A01;

    public B0p() {
        super("PollVotingPublishedOptionComponent");
    }

    public static C1rq A00(1Iw r301, 57Y r302, boolean z) {
        C1rs A01;
        PollingPublishedOption pollingPublishedOption = r302.A02;
        boolean z2 = pollingPublishedOption.A06;
        boolean z3 = r302.A07;
        C1rq A0L = AbJ.A0L(r301);
        String str = pollingPublishedOption.A05;
        A0L.A2S(str);
        A0L.A0F(DKB.A00(23));
        boolean z4 = !z3;
        A0L.A2N(z4);
        A0L.A1N(8);
        A0L.A0G(z2);
        int i = 2131963450;
        if (z2) {
            i = 2131963448;
        }
        A0L.A1r(1LI.A0C(r301, B0p.class, "PollVotingPublishedOptionComponent", AnonymousClass001.A1a(i), 466811311));
        7zN.A1D(A0L, r301, B0p.class, "PollVotingPublishedOptionComponent", -1850725627);
        A0L.A0R();
        MigColorScheme migColorScheme = r302.A04;
        if (z) {
            C1rs A012 = A01(r301, migColorScheme, str, 7zM.A1b(pollingPublishedOption.A01));
            A012.A0R();
            A0L.A2e(A012);
            A01 = Dyc.A00(r301);
            A01.A2Y(z2);
            A01.A2X(migColorScheme);
            A01.A2Z(z4);
            7zN.A1D(A01, r301, B0p.class, "PollVotingPublishedOptionComponent", -1850725627);
            A01.A0S();
        } else {
            C1rs A00 = Dyc.A00(r301);
            A00.A2Y(z2);
            A00.A2X(migColorScheme);
            A00.A2Z(z4);
            7zN.A1D(A00, r301, B0p.class, "PollVotingPublishedOptionComponent", -1850725627);
            A00.A0S();
            A0L.A2e(A00);
            A01 = A01(r301, migColorScheme, str, 7zM.A1b(pollingPublishedOption.A01));
            A01.A0R();
        }
        A0L.A2e(A01);
        return A0L;
    }

    public static 2KD A01(1Iw r301, MigColorScheme migColorScheme, String str, boolean z) {
        2KD A00 = 2K3.A00(r301);
        A00.A2l();
        A00.A2b();
        A00.A2z(str);
        A00.A2x(migColorScheme);
        A00.A12(18.0f);
        7zO.A1H(A00, 2RH.A04);
        if (!z) {
            7zO.A1L(A00, 2RH.A03);
        }
        return A00;
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        PollingPublishedOption pollingPublishedOption;
        MigColorScheme migColorScheme;
        C1rs c1rs;
        String quantityString;
        FbUserSession fbUserSession = this.A00;
        57Y r0 = this.A01;
        C28o c28o = (C28o) 1Bi.A03(16909);
        Context context = r302.A0D;
        23F r02 = (23F) 1Lo.A04(context, fbUserSession, (1BY) null, 33102);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0e();
        C26z c26z = C26z.START;
        4YU.A1O(A01, 2RH.A04, c26z);
        A01.A2b();
        if (r0.A05) {
            pollingPublishedOption = r0.A02;
            String str = pollingPublishedOption.A03;
            if (str != null) {
                C1912Awd A06 = C1912Awd.A06(fbUserSession, r302);
                A06.A2W(2RK.A07);
                7zO.A1M(A06, 2RH.A07, c26z);
                A06.A01.A04 = ImmutableList.of((Object) 1BK.A0X(str));
                A01.A2e(A06);
            }
            if (!r0.A06) {
                c1rs = A00(r302, r0, true);
                A01.A2e(c1rs);
                return A01.A00;
            }
            String str2 = pollingPublishedOption.A05;
            migColorScheme = r0.A04;
            C1rs A012 = A01(r302, migColorScheme, str2, 7zM.A1b(pollingPublishedOption.A01));
            A012.A0R();
            A01.A2e(A012);
        } else {
            A01.A2e(A00(r302, r0, false));
            pollingPublishedOption = r0.A02;
            migColorScheme = r0.A04;
        }
        ImmutableList immutableList = pollingPublishedOption.A01;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            A0h.m11011add((Object) 1BK.A0X(AnonymousClass001.A0i(it)));
        }
        ImmutableList build = A0h.build();
        int i = pollingPublishedOption.A00;
        if (i <= build.size()) {
            i = build.size();
        }
        c1rs = 2rR.A00(r302);
        2rR r03 = ((2rS) c1rs).A01;
        r03.A00 = i;
        c1rs.A2c(new 2rQ((List) null, build));
        if (build.isEmpty()) {
            quantityString = "";
        } else {
            StringBuilder A0k = AnonymousClass001.A0k();
            boolean A1X = 4YV.A1X(i, 3);
            int size = build.size();
            int min = A1X ? Math.min(2, size) : Math.min(size, 3);
            int max = Math.max(i - min, 1);
            for (int i2 = 0; i2 < min; i2++) {
                C2cd.A07(c28o.A04(r02.A00((UserKey) build.get(i2)), false), A0k, AnonymousClass001.A1P(i2));
            }
            quantityString = context.getResources().getQuantityString(2131820769, max, AnonymousClass001.A1b(A0k, max));
        }
        c1rs.A2S(quantityString);
        c1rs.A1r(1LI.A0C(r302, B0p.class, "PollVotingPublishedOptionComponent", AnonymousClass001.A1a(2131963442), 466811311));
        c1rs.A2Z(22.0f);
        c1rs.A2Y(6.0f);
        c1rs.A2X(3.0f);
        c1rs.A2a(3);
        c1rs.A2d(true);
        r03.A09 = true;
        r03.A01 = migColorScheme.AjC();
        c1rs.A2b(migColorScheme);
        2RH r04 = 2RH.A05;
        7zO.A1E(c1rs, r04);
        4YU.A1O(c1rs, r04, C26z.LEFT);
        4YU.A1O(c1rs, 2RH.A03, C26z.RIGHT);
        7zN.A1D(c1rs, r302, B0p.class, "PollVotingPublishedOptionComponent", 704409024);
        c1rs.A0S();
        A01.A2e(c1rs);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v82, types: [X.Aly, androidx.fragment.app.Fragment] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        Serializable serializable;
        switch (r302.A01) {
            case -1850725627:
                1Is r0 = r302.A00.A01;
                View view = ((3xC) obj).A00;
                57Y r02 = ((B0p) r0).A01;
                view.performHapticFeedback(1);
                r02.A01.CUz(r02.A00, !r02.A02.A06);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 466811311:
                F5R f5r = (F5R) obj;
                1Iw r03 = r302.A00.A00;
                int A08 = 7zO.A08(r302.A03, 0);
                View view2 = f5r.A00;
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
                f5r.A01.A0a(view2, accessibilityNodeInfoCompat);
                0Oe r04 = 0Oe.A04;
                accessibilityNodeInfoCompat.A05(new 0Oe(16, 4YU.A0E(r03).getString(A08)));
                return null;
            case 704409024:
                1Iv r05 = r302.A00;
                1Is r06 = r05.A01;
                1Iw r07 = r05.A00;
                57Y r08 = ((B0p) r06).A01;
                IEZ iez = (IEZ) 1Bn.A0E(r07.A0D, (1BY) null, 83032);
                boolean z = r08.A05;
                1UG A082 = 1BK.A08(IEZ.A00(iez), "show_voters");
                if (A082.isSampled()) {
                    0DA r09 = new 0DA();
                    r09.A01(z ? HCX.A01 : HCX.A02, GOm.A00(85));
                    A082.A7T(r09, "poll");
                    A082.BZL();
                }
                HUa hUa = r08.A03;
                PollingPublishedOption pollingPublishedOption = r08.A02;
                BgM bgM = hUa.A00.A03;
                if (bgM == null) {
                    return null;
                }
                ?? r010 = bgM.A00;
                String str = r010.A02.A03;
                C8x c8x = (C8x) r010.A07.get();
                FbUserSession fbUserSession = r010.A00;
                fbUserSession.getClass();
                Boolean valueOf = Boolean.valueOf(c8x.A01(r010.requireContext(), fbUserSession, r010.A01));
                ThreadSummary threadSummary = r010.A01;
                ThreadKey threadKey = null;
                if (threadSummary == null) {
                    serializable = null;
                } else {
                    serializable = threadSummary.A0g;
                    threadKey = threadSummary.A0n;
                }
                1pK c1582Am1 = new C1582Am1();
                Bundle A05 = 1BK.A05();
                A05.putString("poll_id", str);
                A05.putParcelable("poll_published_option", pollingPublishedOption);
                A05.putParcelable("data_source_override", valueOf.booleanValue() ? PollVotersListDataProviderInterfaceSpec$DataSourceOverride.A03 : PollVotersListDataProviderInterfaceSpec$DataSourceOverride.A02);
                A05.putSerializable("folder_name", serializable);
                AbF.A1J(A05, threadKey);
                c1582Am1.setArguments(A05);
                C06c A09 = AbJ.A09((Fragment) r010);
                A09.A0D(2130772065, 2130772071, 2130772064, 2130772072);
                A09.A0Q(c1582Am1, "voters", 2131366606);
                AbJ.A1K(A09, (String) null);
                return null;
            default:
                return null;
        }
    }
}
