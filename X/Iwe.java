package X;

import android.view.View;
import com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesExpandedView;
import com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesView;
import com.facebook.messaging.montage.viewer.quickreply.MontageViewerQuickRepliesOverlay;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Iwe.class */
public final /* synthetic */ class Iwe implements Runnable {
    public static final String __redex_internal_original_name = "MontageViewerPageFragment$9$$ExternalSyntheticLambda2";
    public final /* synthetic */ 8Lu A00;
    public final /* synthetic */ HrG A01;

    public /* synthetic */ Iwe(8Lu r302, HrG hrG) {
        this.A01 = hrG;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HrG hrG = this.A01;
        8Lu r0 = this.A00;
        C2397Gbz c2397Gbz = hrG.A00;
        I3z i3z = c2397Gbz.A0e;
        if (i3z == null || c2397Gbz.A0p) {
            return;
        }
        ImmutableCollection immutableCollection = (ImmutableCollection) r0.A00;
        if (immutableCollection.isEmpty()) {
            i3z.A02 = null;
            i3z.A00 = null;
            i3z.A04 = false;
            i3z.A0B.A02();
        } else {
            i3z.A00 = r0;
            if (i3z.A02 == null) {
                i3z.A02 = 1BK.A0t();
            }
            i3z.A03 = 7zM.A1b(immutableCollection);
            ImmutableList.Builder A0h = 4YU.A0h();
            1Du it = immutableCollection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                11T.A0I(next, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.contextualreplies.ContextualReplySuggestion.ContextualReplyTextSuggestion");
                A0h.m11011add(next);
            }
            List A1A = C13m.A1A(1Fj.A01(A0h));
            if (!i3z.A04) {
                i3z.A0B.A03();
            }
            View A01 = i3z.A0B.A01();
            11T.A0I(A01, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesView");
            MontageViewerContextualRepliesView montageViewerContextualRepliesView = (MontageViewerContextualRepliesView) A01;
            montageViewerContextualRepliesView.setClipToPadding(false);
            montageViewerContextualRepliesView.setClipChildren(false);
            montageViewerContextualRepliesView.A0F(i3z.A07, A1A);
            MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay = i3z.A08;
            if (montageViewerQuickRepliesOverlay != null) {
                J5y j5y = new J5y(i3z, 13);
                J5z j5z = new J5z(i3z, 1);
                if (!A1A.isEmpty()) {
                    ArrayList A17 = 1BK.A17(A1A);
                    MontageViewerContextualRepliesView montageViewerContextualRepliesView2 = montageViewerQuickRepliesOverlay.A0C;
                    ImmutableList A0E = montageViewerContextualRepliesView2.A0E(A1A);
                    AZQ ixj = new IXJ(j5y, j5z);
                    montageViewerContextualRepliesView2.A0F(ixj, A0E);
                    A17.removeAll(A0E);
                    montageViewerQuickRepliesOverlay.A0D.A0F(ixj, 0QD.A0V(A17));
                    montageViewerQuickRepliesOverlay.A03 = true;
                }
            } else {
                View A012 = i3z.A0A.A01();
                11T.A0I(A012, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesExpandedView");
                MontageViewerContextualRepliesExpandedView montageViewerContextualRepliesExpandedView = (MontageViewerContextualRepliesExpandedView) A012;
                montageViewerContextualRepliesExpandedView.A02 = i3z.A09;
                MontageViewerContextualRepliesView montageViewerContextualRepliesView3 = montageViewerContextualRepliesExpandedView.A00;
                montageViewerContextualRepliesView3.removeAllViews();
                MontageViewerContextualRepliesView montageViewerContextualRepliesView4 = montageViewerContextualRepliesExpandedView.A01;
                montageViewerContextualRepliesView4.removeAllViews();
                if (!A1A.isEmpty()) {
                    ArrayList A172 = 1BK.A17(A1A);
                    ImmutableList A0E2 = montageViewerContextualRepliesView3.A0E(A1A);
                    AZQ azq = montageViewerContextualRepliesExpandedView.A03;
                    montageViewerContextualRepliesView3.A0F(azq, A0E2);
                    A172.removeAll(A0E2);
                    montageViewerContextualRepliesView4.A0F(azq, 0QD.A0V(A172));
                }
            }
        }
        i3z.A0A.A02();
        if (((AbstractCollection) r0.A00).isEmpty()) {
            return;
        }
        c2397Gbz.A0n = false;
        GOo.A0Q(c2397Gbz).A06.setVisibility(8);
    }
}
