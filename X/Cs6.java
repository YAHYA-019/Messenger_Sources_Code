package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.business.search.model.PlatformSearchGameData;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
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

/* loaded from: Cs6.class */
public final class Cs6 implements DIn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ Cr5 A05;
    public final /* synthetic */ BP5 A06;
    public final /* synthetic */ DK4 A07;
    public final /* synthetic */ AcX A08;

    public Cs6(Cr5 cr5, BP5 bp5, DK4 dk4, AcX acX, int i, int i2, int i3, int i4, int i5) {
        this.A05 = cr5;
        this.A08 = acX;
        this.A07 = dk4;
        this.A06 = bp5;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A03 = i5;
    }

    @Override // X.DIn
    public void D9q(PlatformSearchGameData platformSearchGameData) {
        CFh cFh = new CFh();
        cFh.A02 = BMF.A0A;
        CallToActionContextParams callToActionContextParams = new CallToActionContextParams(cFh);
        Cr5 cr5 = this.A05;
        CallToAction callToAction = platformSearchGameData.A00;
        if (callToAction != null) {
            ((COy) 1Hv.A02(cr5.A02, 84929)).A03(callToActionContextParams, callToAction);
        }
        AcX acX = this.A08;
        DK4 dk4 = this.A07;
        Cr5.A01(cr5, this.A06, dk4, acX, ImmutableList.of(), this.A00, this.A02, this.A01, this.A04);
    }

    @Override // X.DIn
    public void D9r(PlatformSearchUserData platformSearchUserData) {
        Cr5 cr5 = this.A05;
        AcX acX = this.A08;
        DK4 dk4 = this.A07;
        Cr5.A00(null, cr5, this.A06, dk4, acX, ImmutableList.of(), this.A00, this.A02, this.A01, this.A04, this.A03);
    }

    @Override // X.DIn
    public void D9s(ThreadSummary threadSummary) {
        Cr5 cr5 = this.A05;
        AcX acX = this.A08;
        DK4 dk4 = this.A07;
        Cr5.A00(threadSummary, cr5, this.A06, dk4, acX, AnonymousClass545.A01((AnonymousClass545) cr5.A05.get(), threadSummary, true), this.A00, this.A02, this.A01, this.A04, this.A03);
    }

    @Override // X.DIn
    public void D9t(C1772As6 c1772As6) {
    }

    @Override // X.DIn
    public void D9u(MessageSearchMessageModel messageSearchMessageModel) {
        Cr5 cr5 = this.A05;
        AcX acX = this.A08;
        String str = (String) acX.A07(Crv.A00);
        DK4 dk4 = this.A07;
        BP5 bp5 = this.A06;
        int i = this.A02;
        int i2 = this.A04;
        ThreadSummary threadSummary = messageSearchMessageModel.A01;
        if (threadSummary != null) {
            BP3.A00(bp5);
            AcP acP = cr5.A07;
            DataSourceIdentifier dataSourceIdentifier = acX.A09;
            RankingLoggingItem rankingLoggingItem = acX.A04;
            String str2 = cr5.A01;
            53N r0 = messageSearchMessageModel.A02;
            String str3 = messageSearchMessageModel.A09;
            boolean A1X = AbK.A1X(cr5.A05, threadSummary);
            ImmutableList immutableList = threadSummary.A1L;
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                AbN.A1R(builder, it);
            }
            acP.A08(rankingLoggingItem, dataSourceIdentifier, r0, bp5, dk4, builder.build(), str2, str, i, -1, i2, A1X);
            C1T c1t = cr5.A0A;
            c1t.getClass();
            ImmutableList of = ImmutableList.of();
            ImmutableList immutableList2 = messageSearchMessageModel.A03;
            if (immutableList2 != null && !immutableList2.isEmpty()) {
                ImmutableList.Builder builder2 = ImmutableList.builder();
                1Du it2 = immutableList2.iterator();
                while (it2.hasNext()) {
                    MessageSearchMatchRangesModel messageSearchMatchRangesModel = (MessageSearchMatchRangesModel) it2.next();
                    builder2.m11011add((Object) new HighlightRange(messageSearchMatchRangesModel.A00, messageSearchMatchRangesModel.A01));
                }
                of = builder2.build();
            }
            HashSet A0v = AnonymousClass001.A0v();
            c1t.A00(threadSummary.A0n, threadSummary, new MessageDeepLinkInfo(of, null, str3, "", C1pq.A07(of, 4YT.A00(ActionId.MQTT_DISCONNECTED), A0v, A0v), 1L, -1, false), 5SW.A18);
        }
    }

    @Override // X.DIn
    public void D9v(MessageSearchThreadModel messageSearchThreadModel) {
        Cr5 cr5 = this.A05;
        String str = (String) this.A08.A07(Crv.A00);
        DK4 dk4 = this.A07;
        BP5 bp5 = this.A06;
        int i = this.A02;
        int i2 = this.A04;
        ThreadSummary threadSummary = messageSearchThreadModel.A02;
        if (threadSummary != null) {
            BP3.A00(bp5);
            AcP acP = cr5.A07;
            String str2 = cr5.A01;
            53N r0 = messageSearchThreadModel.A03;
            boolean A1X = AbK.A1X(cr5.A05, threadSummary);
            ImmutableList immutableList = threadSummary.A1L;
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                AbN.A1R(builder, it);
            }
            acP.A08((RankingLoggingItem) null, (DataSourceIdentifier) null, r0, bp5, dk4, builder.build(), str2, str, i, -1, i2, A1X);
            cr5.A04.get();
            CB7.A00(cr5.A02, threadSummary, cr5.A01, "integrated_message_search_server", "message_multiple", AcP.A04(acP));
        }
    }

    @Override // X.DIn
    public void D9x(User user) {
        Cr5 cr5 = this.A05;
        AcX acX = this.A08;
        DK4 dk4 = this.A07;
        Cr5.A00(null, cr5, this.A06, dk4, acX, ImmutableList.of((Object) user), this.A00, this.A02, this.A01, this.A04, this.A03);
    }
}
