package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.HighlightsReactionContent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarParams;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* renamed from: X.9vl, reason: invalid class name */
/* loaded from: 9vl.class */
public final class C9vl implements Aaj {
    public C87p A00 = new C87p(false, 5);
    public final Context A01;
    public final View A02;
    public final Fragment A03;
    public final 06Z A04;
    public final 1Br A05;
    public final MigColorScheme A06;
    public final Fragment A07;
    public final Lifecycle A08;
    public final FbUserSession A09;
    public final 1pI A0A;
    public final 8uI A0B;
    public final C3So A0C;
    public final 76E A0D;
    public final 72H A0E;

    public C9vl(Context context, View view, Fragment fragment, Fragment fragment2, 06Z r306, Lifecycle lifecycle, FbUserSession fbUserSession, 1pI r309, 8uI r310, C3So c3So, MigColorScheme migColorScheme, 76E r313, 72H r314) {
        this.A01 = context;
        this.A09 = fbUserSession;
        this.A04 = r306;
        this.A07 = fragment;
        this.A08 = lifecycle;
        this.A0A = r309;
        this.A02 = view;
        this.A06 = migColorScheme;
        this.A03 = fragment2;
        this.A0E = r314;
        this.A0D = r313;
        this.A0B = r310;
        this.A0C = c3So;
        this.A05 = 1Bu.A01(context, 50185);
    }

    @Override // X.Aaj
    public void Bjg(8Lu r302, HighlightsAttachmentContent highlightsAttachmentContent, HighlightsFeedContent highlightsFeedContent) {
        11T.A0H(highlightsFeedContent, highlightsAttachmentContent);
        9nF.A03(this.A01, this.A04, r302, highlightsAttachmentContent, highlightsFeedContent);
    }

    @Override // X.Aaj
    public void Bla(HighlightsFeedContent highlightsFeedContent) {
        Lifecycle lifecycle;
        06Z parentFragmentManager;
        11T.A0F(highlightsFeedContent, 0);
        if (C1ub.A00().AZk(36321636491870837L)) {
            lifecycle = this.A08;
            parentFragmentManager = this.A04;
        } else {
            Fragment fragment = this.A07;
            if (fragment == null) {
                return;
            }
            lifecycle = this.A08;
            parentFragmentManager = fragment.getParentFragmentManager();
        }
        Context context = this.A01;
        FbUserSession fbUserSession = this.A09;
        1BK.A1M(lifecycle, parentFragmentManager);
        9nF.A01(context, parentFragmentManager, lifecycle, fbUserSession, highlightsFeedContent, 95K.A02);
    }

    @Override // X.Aaj
    public void BrW(HighlightsFeedContent highlightsFeedContent, 8Kh r303) {
        11T.A0H(highlightsFeedContent, r303);
        FbUserSession fbUserSession = this.A09;
        Context context = this.A01;
        9nF.A02(context, this.A04, this.A0A, (2ZG) 1Lm.A05(context, fbUserSession, 33213), highlightsFeedContent, new AaL() { // from class: X.9vx
            @Override // X.AaL
            public void C12() {
                C9vl c9vl = C9vl.this;
                View view = c9vl.A02;
                6LF r0 = (6LF) 1Bu.A06(c9vl.A01, 67784);
                MigColorScheme migColorScheme = c9vl.A06;
                Fragment fragment = c9vl.A03;
                CharSequence text = 7zO.A0D(fragment).getText(2131957644);
                11T.A0A(text);
                r0.A01(new View.OnClickListener() { // from class: X.9pm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        0FI.A0B(-444768464, 0FI.A05(-1613888800));
                    }
                }, view, migColorScheme, (KT3) null, text, 7zO.A0D(fragment).getText(2131966056), 0);
            }

            @Override // X.AaL
            public void C14() {
                C9vl c9vl = C9vl.this;
                View view = c9vl.A02;
                6LF r0 = (6LF) 1Bu.A06(c9vl.A01, 67784);
                MigColorScheme migColorScheme = c9vl.A06;
                Fragment fragment = c9vl.A03;
                CharSequence text = 7zO.A0D(fragment).getText(2131957645);
                11T.A0A(text);
                r0.A01(new View.OnClickListener() { // from class: X.9pn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        0FI.A0B(-668903260, 0FI.A05(2044446140));
                    }
                }, view, migColorScheme, (KT3) null, text, 7zO.A0D(fragment).getText(2131966056), 0);
            }

            @Override // X.AaL
            public void C4t() {
                C9vl c9vl = C9vl.this;
                View view = c9vl.A02;
                6LF r0 = (6LF) 1Bu.A06(c9vl.A01, 67784);
                MigColorScheme migColorScheme = c9vl.A06;
                CharSequence text = 7zO.A0D(c9vl.A03).getText(2131957646);
                11T.A0A(text);
                r0.A02(view, migColorScheme, text);
            }

            @Override // X.AaL
            public void CGP() {
                C9vl c9vl = C9vl.this;
                View view = c9vl.A02;
                6LF r0 = (6LF) 1Bu.A06(c9vl.A01, 67784);
                MigColorScheme migColorScheme = c9vl.A06;
                CharSequence text = 7zO.A0D(c9vl.A03).getText(2131957648);
                11T.A0A(text);
                r0.A02(view, migColorScheme, text);
            }
        }, r303);
    }

    @Override // X.Aaj
    public void Bss() {
        Object A06 = 1Lm.A06(this.A09, 67495);
        9nF.A05(this.A04, AVH.A00(A06, this, 10), this.A00.A00);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.5fq, X.5qu] */
    @Override // X.Aaj
    public void Bvr(Context context, HighlightsFeedContent highlightsFeedContent, AaX aaX, ThreadKey threadKey, String str) {
        11T.A0F(context, 0);
        11T.A0G(highlightsFeedContent, 1, str);
        1Ih r0 = (1Ih) 7zM.A19();
        C5fv A00 = C9el.A00(highlightsFeedContent);
        C5fv A6V = A00.A6V(C5lx.A00, new 5uW(0S2.A0Y, "", true, false));
        ?? c5fq = new C5fq();
        c5fq.A03 = true;
        c5fq.A02 = str;
        NavigationTrigger navigationTrigger = (NavigationTrigger) 7zN.A0r(C82h.A00(r0, A00, A6V, c5fq, 4YU.A0s()), highlightsFeedContent.A05);
        this.A0E.A00((C5fq) c5fq);
        if (navigationTrigger == null) {
            navigationTrigger = 9GP.A01;
        }
        NavigationTrigger navigationTrigger2 = navigationTrigger;
        7zV.A0W(threadKey, navigationTrigger2, new A4w(this.A03.getActivity(), context, null, this.A09, highlightsFeedContent, aaX), this.A0D).Ckr((AnonymousClass539) null, new 5gC((C5qu) c5fq), "composer_text_tab", (String) null);
    }

    @Override // X.Aaj
    public void C1k(HighlightsFeedContent highlightsFeedContent) {
        Lifecycle lifecycle;
        06Z parentFragmentManager;
        11T.A0F(highlightsFeedContent, 0);
        if (C1ub.A00().AZk(36321636491870837L)) {
            lifecycle = this.A08;
            parentFragmentManager = this.A04;
        } else {
            Fragment fragment = this.A07;
            if (fragment == null) {
                return;
            }
            lifecycle = this.A08;
            parentFragmentManager = fragment.getParentFragmentManager();
        }
        Context context = this.A01;
        FbUserSession fbUserSession = this.A09;
        1BK.A1M(lifecycle, parentFragmentManager);
        9nF.A01(context, parentFragmentManager, lifecycle, fbUserSession, highlightsFeedContent, 95K.A03);
    }

    @Override // X.Aaj
    public void C2y(HighlightsFeedContent highlightsFeedContent, boolean z) {
        Long l = highlightsFeedContent.A0M;
        if (l != null) {
            long longValue = l.longValue();
            C3So c3So = this.A0C;
            if (c3So != null) {
                ThreadKey A05 = ThreadKey.A05(longValue);
                NavigationTrigger A03 = NavigationTrigger.A03("highlights_tab_joined_channels_trigger");
                String A13 = 4YU.A13(highlightsFeedContent.A0Z);
                C3So.A01(c3So, C3So.A00(A05, A03, Boolean.valueOf(9F3.A00.A00(highlightsFeedContent)), A13, z ? highlightsFeedContent.A0W : null, 7zP.A1Z(A13)));
            }
        }
    }

    @Override // X.Aaj
    public void C2z(HighlightsFeedContent highlightsFeedContent) {
        11T.A0F(highlightsFeedContent, 0);
        Long l = highlightsFeedContent.A0M;
        Long l2 = highlightsFeedContent.A0L;
        if (l == null || l2 == null) {
            return;
        }
        Context context = this.A01;
        CNJ cnj = (CNJ) 7zR.A0o(context, 83172);
        5PI r0 = new 5PI();
        r0.A0E(highlightsFeedContent.A0W);
        r0.A05 = l2.longValue();
        r0.A0V = ThreadKey.A05(l.longValue());
        5PI.A00(r0, highlightsFeedContent.A0Q);
        7zV.A0h(context, cnj, highlightsFeedContent, r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.74a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarFragment, androidx.fragment.app.Fragment, X.2Ov] */
    @Override // X.Aaj
    public void C5N(Context context, 9cG r303, HighlightsFeedContent highlightsFeedContent, 9JK r305, ReactionsBarParams reactionsBarParams) {
        0fH.A0j("HighlightsClassicContentListener", "onLongPressed");
        C06c A0G = 7zL.A0G(this.A04);
        ?? A00 = 9EZ.A00(reactionsBarParams);
        MigColorScheme migColorScheme = this.A06;
        C8vs c8vs = new C8vs(migColorScheme);
        FbUserSession fbUserSession = this.A09;
        A00.A03 = new A52(this.A03.getActivity(), context, fbUserSession, highlightsFeedContent, r305, this.A0D, this.A0E);
        A00.A18(new Ih1(r303, 1));
        Drawable A0F = 7zO.A0F(C1u3.A52, 4YV.A0I(), migColorScheme);
        AAI aai = new AAI(this, 0);
        6qY r0 = (6qY) 1Lm.A06(fbUserSession, 67662);
        7HB r02 = (7HB) 1Bn.A0E(context, (1BY) null, 67796);
        7HC r03 = (7HC) 1Bn.A0E(context, (1BY) null, 67390);
        ?? obj = new Object();
        11T.A0D(A0F);
        A00.A05 = new 7HH(context, A0F, (C74a) obj, c8vs, r02, r03, r0, aai, false, false);
        A0G.A0O(A00, "reactions_bar_fragment_tag");
        A0G.A04();
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.74a, java.lang.Object] */
    @Override // X.Aaj
    public void C7g(Context context, HighlightsFeedContent highlightsFeedContent, AYp aYp) {
        boolean A1X = 1BL.A1X(context, highlightsFeedContent);
        HashSet A0v = AnonymousClass001.A0v();
        for (HighlightsReactionContent highlightsReactionContent : highlightsFeedContent.A0m) {
            String str = highlightsReactionContent.A03;
            if (highlightsReactionContent.A04) {
                A0v.add(str);
            }
        }
        8Lr r0 = new 8Lr(A0v);
        C8vs c8vs = new C8vs(this.A06);
        6qY r02 = (6qY) 1Lm.A06(this.A09, 67662);
        7HC r03 = (7HC) 1Bn.A0E(context, (1BY) null, 67390);
        7HB r04 = (7HB) 1Bn.A0E(context, (1BY) null, 67796);
        9EW.A00(r0, (C74a) new Object(), c8vs, r04, r03, aYp, new A8w(2), r02, A1X, false).A0q(7zL.A0G(this.A04), "HighlightsClassicContentListener", A1X);
    }

    @Override // X.Aaj
    public void CBO(HighlightsFeedContent highlightsFeedContent, String str) {
        9nF.A04(this.A01, highlightsFeedContent, str);
    }

    @Override // X.Aaj
    public void CEz() {
        1pI r0 = this.A0A;
        if (r0.BVa()) {
            7zV.A0x(r0);
        }
    }

    @Override // X.Aaj
    public void CNy(long j) {
        IAa A02 = ((6uV) 1Br.A0B(this.A05)).A02(this.A09, 7Mg.A08);
        A02.A0F = ImmutableList.of((Object) String.valueOf(j));
        A02.A05 = this.A0B;
        A02.A03(this.A04);
    }

    @Override // X.Aaj
    public void CSI(HighlightsFeedContent highlightsFeedContent) {
        Long l = highlightsFeedContent.A0M;
        if (l != null) {
            long longValue = l.longValue();
            C3So c3So = this.A0C;
            if (c3So != null) {
                ThreadKey A05 = ThreadKey.A05(longValue);
                NavigationTrigger A03 = NavigationTrigger.A03(1BJ.A00(447));
                7zR.A0a().A0N(1Hb.A0I, 5SW.A0p, l);
                String A13 = 4YU.A13(highlightsFeedContent.A0Z);
                Boolean valueOf = Boolean.valueOf(9F3.A00.A00(highlightsFeedContent));
                11T.A0F(A13, 2);
                C3So.A01(c3So, C3So.A00(A05, A03, valueOf, A13, null, false));
            }
        }
    }
}
