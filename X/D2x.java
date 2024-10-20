package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

/* loaded from: D2x.class */
public final class D2x implements Function {
    public final Context A00;
    public final C00i A01;
    public final C00i A02;
    public final CrI A03;
    public final CrK A04;

    public D2x(FbUserSession fbUserSession, Context context) {
        1Bn.A0E(context, (1BY) null, 83513);
        this.A02 = 7zL.A0R(context, 83512);
        this.A03 = new CrI(fbUserSession, context);
        1Bn.A0E(context, (1BY) null, 83514);
        this.A04 = new CrK(fbUserSession, context);
        this.A00 = context;
        this.A01 = AbH.A0X();
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        String obj2;
        C1303Adg AqF = ((DEj) obj).AqF();
        C1301Ade c1301Ade = AqF.A02;
        c1301Ade.getClass();
        int i = AqF.A00;
        int i2 = AqF.A01;
        String str = AqF.A03;
        DIg dIg = C1301Ade.A06;
        if (c1301Ade.A04(dIg) == 53N.A0N || c1301Ade.A04(dIg) == 53N.A0O) {
            Long A05 = AbF.A0n(this.A01).A05();
            obj2 = A05 != null ? A05.toString() : null;
        } else {
            obj2 = (String) c1301Ade.A04(CrS.A00);
        }
        53N r0 = (53N) c1301Ade.A04(dIg);
        ThreadSummary threadSummary = (ThreadSummary) c1301Ade.A04(CrY.A00);
        if (obj2 == null) {
            if (r0 != 53N.A01) {
                return null;
            }
        } else if (r0 == null) {
            return null;
        }
        Number number = (Number) c1301Ade.A04(CrU.A00);
        if (obj2 == null) {
            obj2 = "";
        }
        Long A15 = threadSummary != null ? AbF.A15(threadSummary) : null;
        DK4 dk4 = c1301Ade.A00;
        DataSourceIdentifier dataSourceIdentifier = (DataSourceIdentifier) c1301Ade.A04(CrP.A00);
        RankingLoggingItem rankingLoggingItem = (RankingLoggingItem) c1301Ade.A04(CrW.A00);
        Context context = this.A00;
        C1314Ads c1314Ads = !AbL.A1Z(1Bn.A0E(context, (1BY) null, 65819)) ? null : (C1314Ads) c1301Ade.A04((CrE) 1Bn.A0E(context, (1BY) null, 83506));
        BOv bOv = (BOv) c1301Ade.A04(CrR.A00);
        BOw bOw = (BOw) c1301Ade.A04(CrO.A00);
        int intValue = number != null ? number.intValue() : -1;
        String str2 = (String) c1301Ade.A04(CrV.A00);
        boolean equals = Boolean.TRUE.equals(c1301Ade.A04(this.A03));
        ImmutableList immutableList = (ImmutableList) c1301Ade.A04(this.A04);
        boolean A1T = AnonymousClass001.A1T(c1301Ade.A04((DIg) this.A02.get()));
        Cra cra = Cra.A00;
        Integer A00 = c1301Ade.A04(cra) != null ? AbstractC1327Ae5.A00(((User) c1301Ade.A04(cra)).A0a) : null;
        Integer num = (c1301Ade.A04(cra) == null || ((User) c1301Ade.A04(cra)).A0Z == null) ? null : ((User) c1301Ade.A04(cra)).A0Z.mValue;
        if (str == null) {
            User user = (User) c1301Ade.A04(cra);
            str = user == null ? null : user.A1A;
        }
        return new CHk(c1314Ads, rankingLoggingItem, dataSourceIdentifier, r0, dk4, bOw, bOv, immutableList, A00, num, A15, obj2, str2, (String) null, str, i, i2, intValue, 0, equals, false, A1T);
    }
}
