package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.groups.invitelink.join.model.GroupInviteLinkData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel;
import com.facebook.messaging.search.lists.model.MessageSearchMessageModel;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.facebook.messaging.threadview.params.HighlightRange;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;

/* loaded from: Cs7.class */
public final class Cs7 implements DIn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Context A05;
    public final /* synthetic */ Cr4 A06;
    public final /* synthetic */ BP5 A07;
    public final /* synthetic */ DK4 A08;
    public final /* synthetic */ AcX A09;

    public Cs7(Context context, Cr4 cr4, BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4, int i5) {
        this.A06 = cr4;
        this.A09 = acX;
        this.A08 = dk4;
        this.A07 = bp5;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = context;
    }

    @Override // X.DIn
    public void D9q(PlatformSearchGameData platformSearchGameData) {
        CFh cFh = new CFh();
        cFh.A02 = BMF.A0A;
        CallToActionContextParams callToActionContextParams = new CallToActionContextParams(cFh);
        AcQ acQ = this.A06.A00;
        CallToAction callToAction = platformSearchGameData.A00;
        if (callToAction != null) {
            ((COy) 7zO.A0m(acQ, 84929)).A03(callToActionContextParams, callToAction);
        }
        AcX acX = this.A09;
        DK4 dk4 = this.A08;
        BP5 bp5 = this.A07;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = this.A04;
        String str = callToAction.A0E;
        AcQ.A0B(this.A05, acQ, bp5, dk4, acX, (1Kn) null, ImmutableList.of(), (Long) null, str, i, i2, i3, i4, false);
    }

    @Override // X.DIn
    public void D9r(PlatformSearchUserData platformSearchUserData) {
        AcQ acQ = this.A06.A00;
        AcX acX = this.A09;
        DK4 dk4 = this.A08;
        BP5 bp5 = this.A07;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = this.A04;
        int i5 = this.A03;
        AcQ.A0A(this.A05, (GroupInviteLinkData) null, (ThreadSummary) null, acQ, bp5, dk4, acX, 5SW.A1Z, ImmutableList.of(), i, i2, i3, i4, i5, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0560, code lost:
    
        if (r302 != null) goto L62;
     */
    @Override // X.DIn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D9s(com.facebook.messaging.model.threads.ThreadSummary r302) {
        /*
            Method dump skipped, instructions count: 2105
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cs7.D9s(com.facebook.messaging.model.threads.ThreadSummary):void");
    }

    @Override // X.DIn
    public void D9t(C1772As6 c1772As6) {
        AcQ acQ = this.A06.A00;
        DK4 dk4 = this.A08;
        acQ.A0L.getClass();
        MessageDeepLinkInfo A0M = 7zV.A0M(c1772As6.A05, AnonymousClass001.A0v(), false);
        ImmutableList A07 = AcQ.A07(acQ);
        if (A07 != null) {
            ((AcP) 4YU.A0p(acQ.A0A)).A0B(acQ.A1Y(), dk4, A07, AcQ.A08(acQ), acQ.A0f, (String) null);
        }
        AcP A0T = AbI.A0T(acQ);
        String str = acQ.A0f;
        ThreadKey threadKey = c1772As6.A01;
        53N A00 = 53N.A00(threadKey);
        C6pc A002 = C6pc.A00(threadKey);
        Integer num = c1772As6.A02;
        if (A0T.A0G.A02 != null && A0T.A0K) {
            CQb A02 = AcP.A02(A0T);
            A02.A06 = A00;
            A02.A08 = A002;
            A02.A0D = num;
            ((AcR) A0T.A0E.get()).A02(A00, A002, (ImmutableList) null, str);
        }
        ((CIx) 1Lo.A04(acQ.getContext(), acQ.A05, (1BY) null, 84246)).A00 = Long.valueOf(System.currentTimeMillis());
        acQ.A0L.A00(threadKey, (ThreadSummary) null, A0M, 5SW.A18);
    }

    @Override // X.DIn
    public void D9u(MessageSearchMessageModel messageSearchMessageModel) {
        AcQ acQ = this.A06.A00;
        AcX acX = this.A09;
        String A05 = AcX.A05(acX);
        DK4 dk4 = this.A08;
        BP5 bp5 = this.A07;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A04;
        ImmutableList A07 = AcQ.A07(acQ);
        if (A07 != null) {
            AbK.A0S(acQ).A0B((BP5) null, dk4, A07, AcQ.A08(acQ), acQ.A0f, A05);
        }
        BP3.A00(acQ.A1Y());
        ThreadSummary threadSummary = messageSearchMessageModel.A01;
        if (threadSummary != null) {
            AcP A0S = AbK.A0S(acQ);
            DataSourceIdentifier dataSourceIdentifier = acX.A09;
            RankingLoggingItem rankingLoggingItem = acX.A04;
            String str = acQ.A0f;
            53N r0 = messageSearchMessageModel.A02;
            String str2 = messageSearchMessageModel.A09;
            boolean A03 = ((AnonymousClass545) 4YU.A0p(acQ.A0B)).A03(threadSummary);
            ImmutableList immutableList = threadSummary.A1L;
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                AbN.A1R(builder, it);
            }
            A0S.A08(rankingLoggingItem, dataSourceIdentifier, r0, bp5, dk4, builder.build(), str, A05, i, i2, i3, A03);
            AcP A0S2 = AbK.A0S(acQ);
            String str3 = acQ.A0f;
            if (A0S2.A0K) {
                AcP.A01(A0S2).A03(str3, false);
            }
            Integer num = 0S2.A0C;
            AcQ.A0J(threadSummary, acQ, num, 0S2.A0N);
            6Hx r02 = acQ.A0G;
            if (r02 != null) {
                r02.A02(new C1765Arz(threadSummary, num, null, null, null, null, acQ.A0f));
                acQ.A0G.A03(threadSummary);
            }
            acQ.A0L.getClass();
            ImmutableList of = ImmutableList.of();
            ImmutableList immutableList2 = messageSearchMessageModel.A03;
            if (immutableList2 == null) {
                immutableList2 = ImmutableList.of();
            } else if (!immutableList2.isEmpty()) {
                ImmutableList.Builder builder2 = ImmutableList.builder();
                1Du it2 = immutableList2.iterator();
                while (it2.hasNext()) {
                    MessageSearchMatchRangesModel messageSearchMatchRangesModel = (MessageSearchMatchRangesModel) it2.next();
                    builder2.m11011add((Object) new HighlightRange(messageSearchMatchRangesModel.A00, messageSearchMatchRangesModel.A01));
                }
                of = builder2.build();
            }
            long A052 = AbK.A05(messageSearchMessageModel.A05);
            HashSet A0v = AnonymousClass001.A0v();
            HashSet A072 = C1pq.A07(of, 4YT.A00(ActionId.MQTT_DISCONNECTED), A0v, A0v);
            String str4 = acQ.A0f;
            C1pq.A08("query", str4);
            String A00 = 4YT.A00(1249);
            C1pq.A08(A00, immutableList2);
            acQ.A0L.A00(threadSummary.A0n, threadSummary, new MessageDeepLinkInfo(of, immutableList2, str2, str4, 4YV.A10(A00, A072), A052, -1, false), 5SW.A18);
        }
    }

    @Override // X.DIn
    public void D9v(MessageSearchThreadModel messageSearchThreadModel) {
        AcQ acQ = this.A06.A00;
        AcX acX = this.A09;
        String A05 = AcX.A05(acX);
        DK4 dk4 = this.A08;
        BP5 bp5 = this.A07;
        int i = this.A02;
        int i2 = this.A01;
        int i3 = this.A04;
        ThreadSummary threadSummary = messageSearchThreadModel.A02;
        if (threadSummary != null) {
            ImmutableList A07 = AcQ.A07(acQ);
            if (A07 != null) {
                AbK.A0S(acQ).A0B(bp5, dk4, A07, AcQ.A08(acQ), acQ.A0f, A05);
            }
            BP3.A00(acQ.A1Y());
            AcP acP = (AcP) 4YU.A0p(acQ.A0A);
            DataSourceIdentifier dataSourceIdentifier = acX.A09;
            RankingLoggingItem rankingLoggingItem = acX.A04;
            String str = acQ.A0f;
            53N r0 = messageSearchThreadModel.A03;
            boolean A03 = ((AnonymousClass545) 4YU.A0p(acQ.A0B)).A03(threadSummary);
            ImmutableList immutableList = threadSummary.A1L;
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                AbN.A1R(builder, it);
            }
            acP.A08(rankingLoggingItem, dataSourceIdentifier, r0, bp5, dk4, builder.build(), str, A05, i, i2, i3, A03);
            AcQ.A0J(threadSummary, acQ, 0S2.A01, 0S2.A0N);
            6Hx r02 = acQ.A0G;
            if (r02 != null) {
                r02.A03(threadSummary);
            }
            acQ.A0z.get();
            CB7.A00(acQ.getContext(), threadSummary, acQ.A0f, "integrated_message_search_server", "message_multiple", AcP.A04(AbK.A0S(acQ)));
        }
    }

    @Override // X.DIn
    public void D9x(User user) {
        AcQ acQ = this.A06.A00;
        AcX acX = this.A09;
        DK4 dk4 = this.A08;
        BP5 bp5 = this.A07;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A01;
        int i4 = this.A04;
        int i5 = this.A03;
        AcQ.A0A(this.A05, (GroupInviteLinkData) null, (ThreadSummary) null, acQ, bp5, dk4, acX, 5SW.A1Z, ImmutableList.of((Object) user), i, i2, i3, i4, i5, true);
    }
}
