package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.8is, reason: invalid class name */
/* loaded from: 8is.class */
public final class C8is extends 2Kb {
    public final int A00;
    public final int A01;
    public final View A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final 9SV A05;
    public final HighlightsFeedContent A06;
    public final String A07;
    public final C00m A08;
    public final 2aI A09;

    public C8is(View view, 06Z r303, FbUserSession fbUserSession, 9SV r305, HighlightsFeedContent highlightsFeedContent, String str, C00m c00m, 2aI r309, int i, int i2) {
        1BL.A1H(highlightsFeedContent, r303, r305);
        7zS.A18(5, str, fbUserSession, view);
        this.A06 = highlightsFeedContent;
        this.A03 = r303;
        this.A05 = r305;
        this.A01 = i;
        this.A07 = str;
        this.A09 = r309;
        this.A00 = i2;
        this.A04 = fbUserSession;
        this.A02 = view;
        this.A08 = c00m;
    }

    public static final 9Qo A00(C8is c8is, String str) {
        9SV r0 = c8is.A05;
        AKY aky = new AKY(str, c8is, 15);
        11T.A0F(str, 0);
        ConcurrentMap concurrentMap = r0.A02;
        Object obj = concurrentMap.get(str);
        if (obj == null) {
            Object invoke = aky.invoke();
            obj = concurrentMap.putIfAbsent(str, invoke);
            if (obj == null) {
                obj = invoke;
            }
        }
        return (9Qo) obj;
    }

    public static final void A01(ViewGroup viewGroup, C2k6 c2k6, C8is c8is) {
        ViewGroup viewGroup2;
        06Z r0 = c8is.A03;
        String str = c8is.A07;
        Fragment A0b = r0.A0b(str);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('[');
        int i = c8is.A00;
        if (A0b == null) {
            A0k.append(i);
            A0k.append("] Fragment=");
            A0k.append(c8is.A01);
            AnonymousClass001.A1D("/tag=", str, " for ", A0k);
            A0k.append(9CI.A00(c8is.A06));
            0fH.A0j("ImmersiveStories.Primitive", AnonymousClass001.A0d(" was not found in host fragment manager. Creating new fragment", A0k));
            viewGroup.post(new AGl(viewGroup, c2k6, c8is, new RYh(r0, c8is.A05, str)));
            return;
        }
        A0k.append(i);
        A0k.append("] Fragment tag ");
        A0k.append(str);
        A0k.append(" already exists for ");
        HighlightsFeedContent highlightsFeedContent = c8is.A06;
        0fH.A0j("ImmersiveStories.Primitive", AnonymousClass001.A0d(9CI.A00(highlightsFeedContent), A0k));
        View view = A0b.mView;
        ViewParent viewParent = null;
        if (11T.A0O(view != null ? view.getParent() : null, viewGroup)) {
            return;
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append('[');
        A0k2.append(i);
        AnonymousClass001.A1D("] Add fragment with tag=", str, " for ", A0k2);
        A0k2.append(9CI.A00(highlightsFeedContent));
        A0k2.append(" to parent container ");
        A0k2.append(viewGroup.getId());
        0fH.A0j("ImmersiveStories.Primitive", A0k2.toString());
        View view2 = A0b.mView;
        if (view2 != null) {
            viewParent = view2.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewParent) != null) {
            viewGroup2.removeView(A0b.mView);
        }
        viewGroup.removeAllViews();
        viewGroup.addView(A0b.mView);
    }

    public static final void A0L(C8is c8is, List list) {
        0fH.A0j("ImmersiveStories.Primitive", 0Pz.A0d("[tryRemoveFragment] for ", " fragments", list.size()));
        if (list.isEmpty()) {
            return;
        }
        0fH.A0l("ImmersiveStories.Primitive", "[tryRemoveFragment] Begin to remove fragments");
        06Z r0 = c8is.A03;
        C06c A0G = 7zL.A0G(r0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            0fH.A0n("ImmersiveStories.Primitive", 0Pz.A0W("Removing fragment with tag ", A0i));
            Fragment A0b = r0.A0b(A0i);
            if (A0b != null) {
                A0G.A0I(A0b);
            }
        }
        if (1BL.A0Q().AZk(36325759648682957L)) {
            A0G.A05();
        } else {
            A0G.A07();
        }
    }

    public C2lt A0s(2lX r302) {
        11T.A0F(r302, 0);
        final 1Br A01 = 1Lm.A01(this.A04, 68362);
        Object A00 = 1BL.A0Q().AZk(36325759650714596L) ? 2rO.A00(r302, AQg.A00(this, A01, 46), new Object[]{this.A06.A0P}) : new AXs() { // from class: X.9vi
            @Override // X.AXs
            public void C8K(boolean z) {
                MontageViewerFragment montageViewerFragment;
                C8is c8is = this;
                Object A0b = c8is.A03.A0b(c8is.A07);
                if (!(A0b instanceof MontageViewerFragment) || (montageViewerFragment = (MontageViewerFragment) A0b) == null) {
                    return;
                }
                boolean z2 = ((9Yc) 1Br.A0B(A01)).A00;
                C2397Gbz A08 = MontageViewerFragment.A08(montageViewerFragment);
                if (A08 != null) {
                    A08.A1l(z2);
                }
            }
        };
        4NU A002 = 4NT.A00(r302, AMa.A00);
        4FL.A00(r302, AQg.A00(r302, 2rO.A00(r302, AQg.A00(this, A002, 45), new Object[]{this.A06.A0P}), 43), 7zL.A1Y());
        int i = (-1) >>> 1;
        A2t a2t = new A2t(i, i);
        C2ll A0r = 7zQ.A0r(r302, new C2lk(C29N.A00, new A2K(this), 0, true), AV6.A00(r302, this, 49));
        2lQ r0 = 2lO.A02;
        return new C2lt(7zQ.A0Z(7zQ.A0Z(7zQ.A0Z(7zQ.A0Z(7zQ.A0Z((2lO) null, 0S2.A0j, new ARN(25, this, r302, A01, A00)), 0S2.A0N, AVH.A00(A002, this, 0)), 0S2.A0C, AVD.A01(A002, 4)), 0S2.A01, AV8.A00(A00, this, A01, 18)), 0S2.A00, AVH.A00(A01, A00, 1)), a2t, A0r);
    }
}
