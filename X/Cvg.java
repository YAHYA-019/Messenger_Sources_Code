package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cvg.class */
public final class Cvg implements C5ww {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ FbUserSession A04;
    public final /* synthetic */ RankingLoggingItem A05;
    public final /* synthetic */ ThreadSummary A06;
    public final /* synthetic */ DIk A07;
    public final /* synthetic */ DataSourceIdentifier A08;
    public final /* synthetic */ 53N A09;
    public final /* synthetic */ DK4 A0A;

    public Cvg(Context context, FbUserSession fbUserSession, RankingLoggingItem rankingLoggingItem, ThreadSummary threadSummary, DIk dIk, DataSourceIdentifier dataSourceIdentifier, 53N r308, DK4 dk4, int i, int i2, int i3) {
        this.A06 = threadSummary;
        this.A04 = fbUserSession;
        this.A03 = context;
        this.A07 = dIk;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = r308;
        this.A0A = dk4;
        this.A02 = i3;
        this.A08 = dataSourceIdentifier;
        this.A05 = rankingLoggingItem;
    }

    @Override // X.C5ww
    public final void onClick(View view) {
        DIk dIk;
        int i;
        int i2;
        53N r312;
        DK4 dk4;
        int i3;
        DataSourceIdentifier dataSourceIdentifier;
        RankingLoggingItem rankingLoggingItem;
        11T.A0F(view, 0);
        ThreadSummary threadSummary = this.A06;
        if (threadSummary.A0n.A17()) {
            1FV A01 = ((C75) 1Lm.A05(this.A03, this.A04, 82162)).A01(threadSummary);
            1Bi.A03(16456);
            dIk = this.A07;
            i = this.A00;
            i2 = this.A01;
            r312 = this.A09;
            dk4 = this.A0A;
            i3 = this.A02;
            dataSourceIdentifier = this.A08;
            rankingLoggingItem = this.A05;
            C1zm A0g = AbF.A0g(threadSummary);
            A0g.A03((ThreadKey) A01.get());
            threadSummary = AbF.A0i(A0g);
        } else {
            dIk = this.A07;
            i = this.A00;
            i2 = this.A01;
            r312 = this.A09;
            dk4 = this.A0A;
            i3 = this.A02;
            dataSourceIdentifier = this.A08;
            rankingLoggingItem = this.A05;
        }
        dIk.C2p(rankingLoggingItem, threadSummary, dataSourceIdentifier, r312, dk4, i, i2, i3);
    }
}
