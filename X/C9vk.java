package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.HighlightsReactionContent;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarParams;
import java.util.HashSet;

/* renamed from: X.9vk, reason: invalid class name */
/* loaded from: 9vk.class */
public final class C9vk implements Aaj {
    public final /* synthetic */ FriendsTabFragment A00;

    public C9vk(FriendsTabFragment friendsTabFragment) {
        this.A00 = friendsTabFragment;
    }

    @Override // X.Aaj
    public void Bjg(8Lu r302, HighlightsAttachmentContent highlightsAttachmentContent, HighlightsFeedContent highlightsFeedContent) {
        1vZ r0 = this.A00;
        Context context = r0.getContext();
        if (context != null) {
            9nF.A03(context, r0.mFragmentManager, r302, highlightsAttachmentContent, highlightsFeedContent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.Aaj
    public void Bla(HighlightsFeedContent highlightsFeedContent) {
        Lifecycle lifecycle;
        06Z parentFragmentManager;
        ?? r0 = this.A00;
        Context context = r0.getContext();
        if (!C1ub.A00().AZk(36321636491870837L)) {
            Fragment fragment = r0.mParentFragment;
            if (context == null || fragment == null) {
                return;
            }
            lifecycle = r0.getLifecycle();
            parentFragmentManager = fragment.getParentFragmentManager();
        } else {
            if (context == null) {
                return;
            }
            lifecycle = r0.getLifecycle();
            parentFragmentManager = r0.mFragmentManager;
        }
        FbUserSession fbUserSession = r0.A03;
        fbUserSession.getClass();
        11T.A0H(lifecycle, parentFragmentManager);
        11T.A0F(highlightsFeedContent, 4);
        9nF.A01(context, parentFragmentManager, lifecycle, fbUserSession, highlightsFeedContent, 95K.A02);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.Aaj
    public void BrW(HighlightsFeedContent highlightsFeedContent, 8Kh r303) {
        ?? r0 = this.A00;
        Context context = r0.getContext();
        if (context != null) {
            FbUserSession fbUserSession = r0.A03;
            fbUserSession.getClass();
            9nF.A02(context, r0.mFragmentManager, r0.A04, (2ZG) 1Lo.A04(context, fbUserSession, (1BY) null, 33213), highlightsFeedContent, new AaL() { // from class: X.9vw
                /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
                @Override // X.AaL
                public void C12() {
                    ?? r02 = C9vk.this.A00;
                    View view = r02.mView;
                    if (view != null) {
                        ((6LF) 1Bn.A0E((Context) null, r02.A05, 67784)).A01(new FXP(1), view, 7zM.A11(r02.A06), (KT3) null, 7zO.A0D((Fragment) r02).getText(2131957644), 7zO.A0D((Fragment) r02).getText(2131966056), 0);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
                @Override // X.AaL
                public void C14() {
                    ?? r02 = C9vk.this.A00;
                    View view = r02.mView;
                    if (view != null) {
                        ((6LF) 1Bn.A0E((Context) null, r02.A05, 67784)).A01(new FXP(0), view, 7zM.A11(r02.A06), (KT3) null, 7zO.A0D((Fragment) r02).getText(2131957645), 7zO.A0D((Fragment) r02).getText(2131966056), 0);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
                @Override // X.AaL
                public void C4t() {
                    ?? r02 = C9vk.this.A00;
                    View view = r02.mView;
                    if (view != null) {
                        ((6LF) 1Bn.A0E((Context) null, r02.A05, 67784)).A02(view, 7zM.A11(r02.A06), 7zO.A0D((Fragment) r02).getText(2131957646));
                    }
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
                @Override // X.AaL
                public void CGP() {
                    ?? r02 = C9vk.this.A00;
                    View view = r02.mView;
                    if (view != null) {
                        ((6LF) 1Bn.A0E((Context) null, r02.A05, 67784)).A02(view, 7zM.A11(r02.A06), 7zO.A0D((Fragment) r02).getText(2131957648));
                    }
                }
            }, r303);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.Aaj
    public void Bss() {
        ?? r0 = this.A00;
        Context context = r0.getContext();
        if (context != null) {
            9nF.A05(r0.mFragmentManager, new G7O(context, this, 3), r0.A0F.A03);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.5fq, X.5qu] */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.Aaj
    public void Bvr(Context context, HighlightsFeedContent highlightsFeedContent, AaX aaX, ThreadKey threadKey, String str) {
        1Ih r0 = (1Ih) 7zM.A19();
        C5fv A00 = C9el.A00(highlightsFeedContent);
        C5fv A6V = A00.A6V(C5lx.A00, new 5uW(0S2.A0Y, "", true, false));
        ?? c5fq = new C5fq();
        c5fq.A03 = true;
        c5fq.A02 = str;
        NavigationTrigger navigationTrigger = (NavigationTrigger) 7zN.A0r(C82h.A00(r0, A00, A6V, c5fq, 4YU.A0s()), highlightsFeedContent.A05);
        ?? r02 = this.A00;
        ((72H) r02.A0f.get()).A00((C5fq) c5fq);
        if (navigationTrigger == null) {
            navigationTrigger = 9GP.A01;
        }
        NavigationTrigger navigationTrigger2 = navigationTrigger;
        7zV.A0W(threadKey, navigationTrigger2, new A4w(r02.getActivity(), context, null, r02.A03, highlightsFeedContent, aaX), r02.A18.get()).Ckr((AnonymousClass539) null, new 5gC((C5qu) c5fq), "composer_text_tab", (String) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.Aaj
    public void C1k(HighlightsFeedContent highlightsFeedContent) {
        Lifecycle lifecycle;
        06Z parentFragmentManager;
        ?? r0 = this.A00;
        Context context = r0.getContext();
        if (!C1ub.A00().AZk(36321636491870837L)) {
            Fragment fragment = r0.mParentFragment;
            if (context == null || fragment == null) {
                return;
            }
            lifecycle = r0.getLifecycle();
            parentFragmentManager = fragment.getParentFragmentManager();
        } else {
            if (context == null) {
                return;
            }
            lifecycle = r0.getLifecycle();
            parentFragmentManager = r0.mFragmentManager;
        }
        FbUserSession fbUserSession = r0.A03;
        fbUserSession.getClass();
        11T.A0H(lifecycle, parentFragmentManager);
        11T.A0F(highlightsFeedContent, 4);
        9nF.A01(context, parentFragmentManager, lifecycle, fbUserSession, highlightsFeedContent, 95K.A03);
    }

    @Override // X.Aaj
    public void C2y(HighlightsFeedContent highlightsFeedContent, boolean z) {
        Long l = highlightsFeedContent.A0M;
        Aa0 aa0 = this.A00.mListener;
        if (aa0 == null || l == null) {
            return;
        }
        aa0.C9u(ThreadKey.A05(l.longValue()), NavigationTrigger.A03("highlights_tab_joined_channels_trigger"), Boolean.valueOf(9F3.A00.A00(highlightsFeedContent)), highlightsFeedContent.A0Z.trim(), z ? highlightsFeedContent.A0W : null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.Aaj
    public void C2z(HighlightsFeedContent highlightsFeedContent) {
        ?? r0 = this.A00;
        Context context = r0.getContext();
        Long l = highlightsFeedContent.A0M;
        Long l2 = highlightsFeedContent.A0L;
        if (context == null || r0.mListener == null || l == null || l2 == null) {
            return;
        }
        CNJ cnj = (CNJ) 1Hv.A02(context, 83172);
        5PI r02 = new 5PI();
        r02.A0E(highlightsFeedContent.A0W);
        r02.A05 = l2.longValue();
        r02.A0V = ThreadKey.A05(l.longValue());
        5PI.A00(r02, highlightsFeedContent.A0Q);
        7zV.A0h(context, cnj, highlightsFeedContent, r02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment, X.2Og] */
    /* JADX WARN: Type inference failed for: r0v56, types: [X.74a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarFragment, androidx.fragment.app.Fragment, X.2Ov] */
    @Override // X.Aaj
    public void C5N(Context context, 9cG r303, HighlightsFeedContent highlightsFeedContent, 9JK r305, ReactionsBarParams reactionsBarParams) {
        ?? r0 = this.A00;
        C06c A0G = 7zL.A0G(r0.mFragmentManager);
        ?? A00 = 9EZ.A00(reactionsBarParams);
        C8vr c8vr = new C8vr((MigColorScheme) r0.A06.get());
        FbUserSession fbUserSession = r0.A03;
        fbUserSession.getClass();
        A00.A03 = new A51(r0.getActivity(), context, fbUserSession, highlightsFeedContent, r305, (76E) r0.A18.get(), (72H) r0.A0f.get());
        A00.A18(new A3P(r303, this));
        Drawable A0F = 7zO.A0F(C1u3.A52, 7zP.A0R(), (MigColorScheme) r0.A06.get());
        6qY r02 = (6qY) 1Lo.A04((Context) null, r0.A03, r0.A05, 67662);
        A00.A05 = new 7HH(context, A0F, (C74a) new Object(), c8vr, (7HB) 1Bn.A0E(context, (1BY) null, 67796), (7HC) 1Bn.A0E(context, (1BY) null, 67390), r02, (2Og) r0, false, false);
        A0G.A0O(A00, "reactions_bar_fragment_tag");
        A0G.A04();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.74a, java.lang.Object] */
    @Override // X.Aaj
    public void C7g(Context context, HighlightsFeedContent highlightsFeedContent, AYp aYp) {
        HashSet A0v = AnonymousClass001.A0v();
        for (HighlightsReactionContent highlightsReactionContent : highlightsFeedContent.A0m) {
            if (highlightsReactionContent.A04) {
                A0v.add(highlightsReactionContent.A03);
            }
        }
        8Lr r0 = new 8Lr(A0v);
        ?? r02 = this.A00;
        C8vr c8vr = new C8vr((MigColorScheme) r02.A06.get());
        FbUserSession fbUserSession = r02.A03;
        fbUserSession.getClass();
        6qY r03 = (6qY) 1Lo.A04((Context) null, fbUserSession, r02.A05, 67662);
        7HC r04 = (7HC) 1Bn.A0E(context, (1BY) null, 67390);
        7HB r05 = (7HB) 1Bn.A0E(context, (1BY) null, 67796);
        9EW.A00(r0, (C74a) new Object(), c8vr, r05, r04, aYp, new A8w(0), r03, true, false).A0q(7zL.A0G(r02.mFragmentManager), "friends_tab", true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    @Override // X.Aaj
    public void CBO(HighlightsFeedContent highlightsFeedContent, String str) {
        ?? r0 = this.A00;
        Context context = r0.getContext();
        if (context != null) {
            r0.A03.getClass();
            9nF.A04(context, highlightsFeedContent, str);
        }
    }

    @Override // X.Aaj
    public void CEz() {
        FriendsTabFragment friendsTabFragment = this.A00;
        if (friendsTabFragment.A04.BVa()) {
            7zV.A0x(friendsTabFragment.A04);
        }
    }

    @Override // X.Aaj
    public void CNy(long j) {
        this.A00.A1Y(7Mg.A08, j);
    }

    @Override // X.Aaj
    public void CSI(HighlightsFeedContent highlightsFeedContent) {
        Long l = highlightsFeedContent.A0M;
        FriendsTabFragment friendsTabFragment = this.A00;
        if (friendsTabFragment.mListener == null || l == null) {
            return;
        }
        ThreadKey A05 = ThreadKey.A05(l.longValue());
        NavigationTrigger A03 = NavigationTrigger.A03(1BJ.A00(447));
        ((CQo) 1Bi.A03(82689)).A0N(1Hb.A0I, 5SW.A0p, l);
        friendsTabFragment.mListener.CA0(A05, A03, Boolean.valueOf(9F3.A00.A00(highlightsFeedContent)), highlightsFeedContent.A0Z.trim());
    }
}
