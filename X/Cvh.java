package X;

import android.view.View;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;

/* loaded from: Cvh.class */
public final class Cvh implements C5ww {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ RankingLoggingItem A03;
    public final /* synthetic */ DIk A04;
    public final /* synthetic */ DataSourceIdentifier A05;
    public final /* synthetic */ 53N A06;
    public final /* synthetic */ DK4 A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public Cvh(RankingLoggingItem rankingLoggingItem, DIk dIk, DataSourceIdentifier dataSourceIdentifier, 53N r305, DK4 dk4, User user, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0D = z;
        this.A04 = dIk;
        this.A09 = str;
        this.A0C = z2;
        this.A0A = z3;
        this.A0B = z4;
        this.A08 = user;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = r305;
        this.A07 = dk4;
        this.A02 = i3;
        this.A05 = dataSourceIdentifier;
        this.A03 = rankingLoggingItem;
    }

    @Override // X.C5ww
    public final void onClick(View view) {
        if (this.A0D) {
            this.A04.Bzz(this.A09, this.A0C);
            return;
        }
        if (this.A0A || this.A0B) {
            DIk dIk = this.A04;
            String str = this.A09;
            User user = this.A08;
            dIk.Btp(str, user.A0C() ? 0S2.A01 : 0S2.A00, user.A13);
            return;
        }
        DIk dIk2 = this.A04;
        User user2 = this.A08;
        int i = this.A00;
        int i2 = this.A01;
        dIk2.C2q(this.A03, this.A05, this.A06, this.A07, user2, i, i2, this.A02);
    }
}
