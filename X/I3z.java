package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.montage.model.MontageBucket;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesExpandedView;
import com.facebook.messaging.montage.viewer.quickreply.MontageViewerQuickRepliesOverlay;
import com.google.common.collect.ImmutableList;

/* loaded from: I3z.class */
public final class I3z {
    public 8Lu A00;
    public HrG A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final MontageViewerQuickRepliesOverlay A08;
    public final 2Wo A0A;
    public final 2Wo A0B;
    public final AZQ A07 = new IXI(this);
    public final HmQ A09 = new HmQ(this);
    public final 1Br A05 = 1Bq.A00(115422);
    public final 1Br A06 = 7zM.A0R();

    public I3z(MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay, 2Wo r303, 2Wo r304) {
        this.A0B = r303;
        this.A0A = r304;
        this.A08 = montageViewerQuickRepliesOverlay;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        if (r306 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.8Lu A00(com.facebook.auth.usersession.FbUserSession r301, java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3z.A00(com.facebook.auth.usersession.FbUserSession, java.lang.String, java.lang.String):X.8Lu");
    }

    public final void A01() {
        this.A03 = false;
        this.A00 = null;
        this.A02 = null;
        this.A04 = false;
        2Wo r0 = this.A0A;
        r0.A02();
        2Wo r02 = this.A0B;
        r02.A02();
        if (r02.A00 != null) {
            View A01 = r02.A01();
            11T.A0I(A01, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesView");
            ((ViewGroup) A01).removeAllViews();
        }
        if (r0.A00 != null) {
            View A012 = r0.A01();
            11T.A0I(A012, "null cannot be cast to non-null type com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesExpandedView");
            MontageViewerContextualRepliesExpandedView montageViewerContextualRepliesExpandedView = (MontageViewerContextualRepliesExpandedView) A012;
            montageViewerContextualRepliesExpandedView.A00.removeAllViews();
            montageViewerContextualRepliesExpandedView.A01.removeAllViews();
        }
        MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay = this.A08;
        if (montageViewerQuickRepliesOverlay != null) {
            montageViewerQuickRepliesOverlay.A0C.removeAllViews();
            montageViewerQuickRepliesOverlay.A0D.removeAllViews();
        }
    }

    public final void A02(FbUserSession fbUserSession, MontageBucket montageBucket, MontageCard montageCard) {
        String str;
        ImmutableList immutableList;
        boolean z;
        0fH.A0j("MontageViewerContextualRepliesController", "loadSuggestions");
        if (montageBucket == null || montageCard == null || montageBucket.A03() || !C48H.A01(montageCard.A0H)) {
            return;
        }
        MontageMetadata montageMetadata = montageCard.A0A;
        if (montageMetadata == null || (immutableList = montageBucket.A03) == null) {
            str = "loadSuggestions: cards or metadata is null";
        } else if (montageMetadata.A0P) {
            String A0v = GOo.A0v(montageBucket);
            String str2 = montageMetadata.A0I;
            Object A0F = 0QD.A0F(immutableList);
            11T.A0A(A0F);
            MontageMetadata montageMetadata2 = ((MontageCard) A0F).A0A;
            if (montageMetadata2 != null && str2 != null) {
                String str3 = montageMetadata2.A0I;
                HcK hcK = (HcK) 1Lo.A08(fbUserSession, 115421);
                synchronized (hcK) {
                    if (A0v == null || str3 == null) {
                        z = true;
                    } else {
                        java.util.Map map = (java.util.Map) hcK.A00.get(A0v);
                        z = map == null ? false : map.containsKey(str3);
                    }
                }
                if (!z) {
                    0fH.A0j("MontageViewerContextualRepliesController", "loadSuggestions: start fetch");
                    4YV.A11(this.A06).execute(new J2r(fbUserSession, this, A0v, str3, str2));
                    return;
                }
                0fH.A0j("MontageViewerContextualRepliesController", "loadSuggestions: fetched all stories");
                8Lu A00 = A00(fbUserSession, A0v, str2);
                HrG hrG = this.A01;
                if (hrG != null) {
                    hrG.A01(A00, str2);
                    return;
                }
                return;
            }
            str = "loadSuggestions: last card metadata is null";
        } else {
            str = "loadSuggestions: user cannot reply to this story";
        }
        0fH.A0j("MontageViewerContextualRepliesController", str);
    }
}
