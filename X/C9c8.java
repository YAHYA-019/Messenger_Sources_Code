package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.viewer.avatarquickreplies.MontageViewerAvatarQuickRepliesView;
import com.facebook.messaging.montage.viewer.quickreply.MontageViewerQuickRepliesOverlay;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9c8, reason: invalid class name */
/* loaded from: 9c8.class */
public final class C9c8 {
    public AZR A00;
    public List A01;
    public C2a2 A02;
    public C2a2 A03;
    public C2a2 A04;
    public boolean A05;
    public boolean A06;
    public final 1Br A07;
    public final 1Br A08;
    public final C9Jt A09;
    public final 2Wo A0A;
    public final Context A0B;
    public final FbUserSession A0C;
    public final MontageViewerQuickRepliesOverlay A0D;

    public C9c8(Context context, FbUserSession fbUserSession, MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay, 2Wo r305) {
        int A06 = 7zP.A06(context, fbUserSession, 1);
        this.A0B = context;
        this.A0A = r305;
        this.A0C = fbUserSession;
        this.A0D = montageViewerQuickRepliesOverlay;
        this.A08 = 1Lm.A00(context, fbUserSession, 68725);
        this.A07 = 1Lm.A00(context, fbUserSession, 66197);
        this.A01 = C0ty.A00;
        C9Jt c9Jt = new C9Jt(this);
        this.A09 = c9Jt;
        if (!((9Vz) 1Br.A0B(this.A08)).A0C) {
            9Vz r0 = (9Vz) 1Br.A0B(this.A08);
            synchronized (r0) {
                r0.A06.add(c9Jt);
            }
            this.A02 = 2aK.A03((Integer) null, (0DE) null, new AJe(this, null, 37), 7zN.A0y(), A06);
        }
        this.A03 = 2aK.A03((Integer) null, (0DE) null, new AJe(this, null, 38), 7zN.A0y(), A06);
    }

    /* JADX WARN: Type inference failed for: r0v91, types: [X.9Js] */
    public final void A00() {
        2Wo r0 = this.A0A;
        View A01 = r0.A01();
        11T.A0I(A01, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.avatarquickreplies.MontageViewerAvatarQuickRepliesView");
        A01.setVisibility(8);
        C00i c00i = this.A08.A00;
        if (((9Vz) c00i.get()).A0C) {
            AJe.A03(this, 7zN.A0y(), 39);
        } else {
            9Vz r02 = (9Vz) c00i.get();
            List list = (List) r02.A09.get();
            if (list != null && 1BK.A1Y(list)) {
                Iterator it = r02.A06.iterator();
                while (it.hasNext()) {
                    C9c8 c9c8 = ((C9Jt) it.next()).A00;
                    c9c8.A01 = list;
                    c9c8.A06 = false;
                    AJe.A03(c9c8, 7zN.A0y(), 42);
                }
            } else if (!r02.A08.getAndSet(true)) {
                9Ru r03 = (9Ru) 1Br.A0B(r02.A05);
                boolean z = r02.A0B;
                C9H4 c9h4 = new C9H4(r02);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                A0M.A03("fetch_animated_stickers", Boolean.valueOf(z));
                A0M.A03("msgr_avatar_quick_reaction", true);
                C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "MsgrAvatarQuickReactionQuery", (String) null, "fbandroid", -1083694715, 0, 880747415L, 880747415L, false, true));
                ((C3sb) A0L).A02 = 0L;
                ((C3sb) A0L).A03 = 0L;
                ((4fF) 1Br.A0B(r03.A01)).A0H(A0L, new ABp(r03, c9h4, 0));
            }
        }
        View A012 = r0.A01();
        11T.A0I(A012, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.avatarquickreplies.MontageViewerAvatarQuickRepliesView");
        ((MontageViewerAvatarQuickRepliesView) A012).A00 = new Object() { // from class: X.9Js
        };
        MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay = this.A0D;
        if (montageViewerQuickRepliesOverlay != null) {
            montageViewerQuickRepliesOverlay.A00 = AVB.A01(this, 36);
        }
        C2a2 c2a2 = this.A04;
        if (c2a2 != null) {
            c2a2.AE0(null);
        }
        if (((9Vz) c00i.get()).A0C) {
            this.A04 = 2aK.A04(new AJe(this, null, 40), 7zN.A0y());
        }
    }

    public final void A01() {
        LithoView lithoView;
        List subList;
        if (1BK.A1Y(this.A01)) {
            if (!this.A06) {
                MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay = this.A0D;
                if (montageViewerQuickRepliesOverlay == null) {
                    2Wo r0 = this.A0A;
                    View A01 = r0.A01();
                    11T.A0I(A01, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.avatarquickreplies.MontageViewerAvatarQuickRepliesView");
                    ((MontageViewerAvatarQuickRepliesView) A01).A00(this.A01);
                    CFy cFy = (CFy) 1Bn.A0A(68091);
                    FbUserSession fbUserSession = this.A0C;
                    Context context = this.A0B;
                    if (cFy.A01(context, fbUserSession)) {
                        CFy.A00(context);
                        View A012 = r0.A01();
                        11T.A0I(A012, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.avatarquickreplies.MontageViewerAvatarQuickRepliesView");
                        ((MontageViewerAvatarQuickRepliesView) A012).A02.setVisibility(0);
                    }
                } else {
                    List list = this.A01;
                    11T.A0F(list, 0);
                    List A0Y = 0QD.A0Y(list, 6);
                    if (A0Y.isEmpty()) {
                        LithoView lithoView2 = montageViewerQuickRepliesOverlay.A08;
                        C0ty c0ty = C0ty.A00;
                        MontageViewerQuickRepliesOverlay.A02(lithoView2, montageViewerQuickRepliesOverlay, c0ty);
                        MontageViewerQuickRepliesOverlay.A02(montageViewerQuickRepliesOverlay.A09, montageViewerQuickRepliesOverlay, c0ty);
                    } else {
                        if (A0Y.size() <= 2) {
                            MontageViewerQuickRepliesOverlay.A02(montageViewerQuickRepliesOverlay.A08, montageViewerQuickRepliesOverlay, A0Y);
                            lithoView = montageViewerQuickRepliesOverlay.A09;
                            subList = C0ty.A00;
                        } else {
                            int size = A0Y.size() / 2;
                            MontageViewerQuickRepliesOverlay.A02(montageViewerQuickRepliesOverlay.A08, montageViewerQuickRepliesOverlay, A0Y.subList(0, size));
                            lithoView = montageViewerQuickRepliesOverlay.A09;
                            subList = A0Y.subList(size, A0Y.size());
                        }
                        MontageViewerQuickRepliesOverlay.A02(lithoView, montageViewerQuickRepliesOverlay, subList);
                        montageViewerQuickRepliesOverlay.A02 = true;
                    }
                }
                this.A06 = true;
            }
            if (this.A0D == null) {
                this.A0A.A03();
            }
        }
    }
}
