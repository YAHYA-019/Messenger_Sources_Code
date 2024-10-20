package X;

import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: DBn.class */
public final /* synthetic */ class DBn implements C00m {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ RankingLoggingItem A03;
    public final /* synthetic */ ThreadSummary A04;
    public final /* synthetic */ CoC A05;
    public final /* synthetic */ DataSourceIdentifier A06;
    public final /* synthetic */ 53N A07;
    public final /* synthetic */ DK4 A08;

    public /* synthetic */ DBn(RankingLoggingItem rankingLoggingItem, ThreadSummary threadSummary, CoC coC, DataSourceIdentifier dataSourceIdentifier, 53N r306, DK4 dk4, int i, int i2, int i3) {
        this.A05 = coC;
        this.A04 = threadSummary;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = r306;
        this.A08 = dk4;
        this.A02 = i3;
        this.A06 = dataSourceIdentifier;
        this.A03 = rankingLoggingItem;
    }

    @Override // X.C00m
    public final Object invoke() {
        CoC coC = this.A05;
        ThreadSummary threadSummary = this.A04;
        int i = this.A01;
        53N r0 = this.A07;
        DK4 dk4 = this.A08;
        int i2 = this.A02;
        C1557Alb.A0A(this.A03, threadSummary, coC.A01.A02, this.A06, r0, dk4, i, i2);
        return null;
    }
}
