package X;

import com.facebook.messaging.integrity.frx.model.AdditionalActionsPage;
import com.facebook.messaging.integrity.frx.model.BlockPage;
import com.facebook.messaging.integrity.frx.model.EvidencePage;
import com.facebook.messaging.integrity.frx.model.EvidenceSearchPage;
import com.facebook.messaging.integrity.frx.model.FRXPage;
import com.facebook.messaging.integrity.frx.model.FeedbackPage;
import com.facebook.messaging.integrity.frx.model.GroupMembersPage;
import com.facebook.messaging.integrity.frx.model.MarketplaceFeedbackPage;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* loaded from: Clb.class */
public final class Clb implements DIm {
    public final /* synthetic */ BeZ A00;

    public Clb(BeZ beZ) {
        this.A00 = beZ;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9P(AdditionalActionsPage additionalActionsPage) {
        ThreadSummary threadSummary;
        FeedbackReportFragment feedbackReportFragment = this.A00.A00;
        feedbackReportFragment.A0F.getClass();
        ThreadKey threadKey = feedbackReportFragment.A0M;
        boolean z = true;
        if (threadKey == null || ((!threadKey.A1F() && !threadKey.A1I() && !threadKey.A11()) || (threadSummary = feedbackReportFragment.A0N) == null || feedbackReportFragment.A0W.size() != 2Gt.A03(threadSummary).size() - 1)) {
            z = false;
        }
        CQD cqd = feedbackReportFragment.A0E;
        cqd.getClass();
        return z ? cqd.A07(additionalActionsPage, new BLo[]{BLo.A0G, BLo.A0J}) : cqd.A06(additionalActionsPage, feedbackReportFragment.A0Q);
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9Q(BlockPage blockPage) {
        return null;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9R(EvidencePage evidencePage) {
        this.A00.A00.A0E.getClass();
        return CQD.A01(evidencePage, false);
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9S(EvidenceSearchPage evidenceSearchPage) {
        this.A00.A00.A0E.getClass();
        ImmutableList immutableList = evidenceSearchPage.A00;
        String str = evidenceSearchPage.A02;
        HashSet A0v = AnonymousClass001.A0v();
        ImmutableList.of();
        C1pq.A08("searchDataSourceTypes", immutableList);
        EvidenceSearchPage evidenceSearchPage2 = new EvidenceSearchPage(immutableList, str, A0v);
        FRXPage fRXPage = new FRXPage(evidenceSearchPage2.A00(), evidenceSearchPage2.A01);
        fRXPage.A03 = evidenceSearchPage2;
        return fRXPage;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9T(FeedbackPage feedbackPage) {
        return null;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9U(GroupMembersPage groupMembersPage) {
        Integer A01 = groupMembersPage.A01();
        Integer num = 0S2.A0C;
        BeZ beZ = this.A00;
        if (A01 == num) {
            FeedbackReportFragment feedbackReportFragment = beZ.A00;
            feedbackReportFragment.A0E.getClass();
            return CQD.A03(groupMembersPage, feedbackReportFragment.A0W);
        }
        FeedbackReportFragment feedbackReportFragment2 = beZ.A00;
        CQD cqd = feedbackReportFragment2.A0E;
        cqd.getClass();
        ImmutableList immutableList = feedbackReportFragment2.A0R;
        immutableList.getClass();
        return cqd.A08(immutableList);
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9V(MarketplaceFeedbackPage marketplaceFeedbackPage) {
        return null;
    }
}
