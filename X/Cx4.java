package X;

import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;

/* loaded from: Cx4.class */
public final class Cx4 implements DGK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;

    public Cx4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, int i3, int i4) {
        this.A00 = i4;
        this.A05 = obj3;
        this.A09 = obj2;
        this.A01 = i;
        this.A02 = i2;
        this.A08 = obj5;
        this.A06 = obj6;
        this.A03 = i3;
        this.A04 = obj4;
        this.A07 = obj;
    }

    public final void Bnv(boolean z) {
        int i = this.A00;
        DIk dIk = (DIk) this.A05;
        if (i != 0) {
            User user = (User) this.A09;
            int i2 = this.A01;
            int i3 = this.A02;
            53N r0 = (53N) this.A08;
            DK4 dk4 = (DK4) this.A06;
            int i4 = this.A03;
            dIk.Bnt((RankingLoggingItem) this.A07, (DataSourceIdentifier) this.A04, r0, dk4, user, i2, i3, i4);
            return;
        }
        ThreadSummary threadSummary = (ThreadSummary) this.A09;
        int i5 = this.A01;
        int i6 = this.A02;
        53N r02 = (53N) this.A08;
        DK4 dk42 = (DK4) this.A06;
        int i7 = this.A03;
        dIk.C2p((RankingLoggingItem) this.A07, threadSummary, (DataSourceIdentifier) this.A04, r02, dk42, i5, i6, i7);
    }
}
