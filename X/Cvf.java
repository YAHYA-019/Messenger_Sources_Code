package X;

import android.view.View;
import com.facebook.messaging.business.search.model.PlatformSearchUserData;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cvf.class */
public final class Cvf implements C5ww {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ PlatformSearchUserData A03;
    public final /* synthetic */ RankingLoggingItem A04;
    public final /* synthetic */ DIk A05;
    public final /* synthetic */ DataSourceIdentifier A06;
    public final /* synthetic */ 53N A07;
    public final /* synthetic */ DK4 A08;

    public Cvf(PlatformSearchUserData platformSearchUserData, RankingLoggingItem rankingLoggingItem, DIk dIk, DataSourceIdentifier dataSourceIdentifier, 53N r306, DK4 dk4, int i, int i2, int i3) {
        this.A05 = dIk;
        this.A03 = platformSearchUserData;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = r306;
        this.A08 = dk4;
        this.A02 = i3;
        this.A06 = dataSourceIdentifier;
        this.A04 = rankingLoggingItem;
    }

    @Override // X.C5ww
    public final void onClick(View view) {
        DIk dIk = this.A05;
        PlatformSearchUserData platformSearchUserData = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        53N r0 = this.A07;
        DK4 dk4 = this.A08;
        int i3 = this.A02;
        dIk.C2o(platformSearchUserData, this.A04, this.A06, r0, dk4, i, i2, i3);
    }
}
