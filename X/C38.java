package X;

import android.content.Context;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: C38.class */
public final class C38 {
    public final /* synthetic */ Cs5 A00;
    public final /* synthetic */ User A01;

    public C38(Cs5 cs5, User user) {
        this.A00 = cs5;
        this.A01 = user;
    }

    public void A00(Integer num) {
        Cs5 cs5 = this.A00;
        AcQ acQ = cs5.A05.A00;
        AcX acX = cs5.A08;
        User user = this.A01;
        DK4 dk4 = cs5.A07;
        BP5 bp5 = cs5.A06;
        int i = cs5.A02;
        int i2 = cs5.A01;
        int i3 = cs5.A03;
        ImmutableList A07 = AcQ.A07(acQ);
        C1315Adt c1315Adt = (C1315Adt) 1Bn.A0A(83509);
        if (A07 != null) {
            AbK.A0S(acQ).A0B(bp5, dk4, A07, AcQ.A08(acQ), acQ.A0f, AcX.A05(acX));
            int i4 = 0;
            for (int i5 = 0; i5 < A07.size() && i4 < 2; i5++) {
                if (((CHk) A07.get(i5)).A07 == 53N.A05 && (!(((CHk) A07.get(i5)).A08 instanceof Cpf) || !((Cpf) ((CHk) A07.get(i5)).A08).A00.contains("message_search"))) {
                    i4++;
                }
            }
        }
        Context context = acQ.getContext();
        if (context != null) {
            1Bn.A0A(83510);
            ThreadSummary threadSummary = (ThreadSummary) acX.A07(Cs0.A00);
            AcP acP = (AcP) 4YU.A0p(acQ.A0A);
            String A05 = AcX.A05(acX);
            53N r0 = acX.A0A;
            DataSourceIdentifier dataSourceIdentifier = acX.A09;
            Integer num2 = acQ.A0e;
            if (num2 != null) {
                i3 = num2.intValue();
            }
            String str = acQ.A0f;
            BP3.A00(bp5);
            RankingLoggingItem rankingLoggingItem = acX.A04;
            if (AbL.A1Z(1Bn.A0A(65819))) {
                acX.A07((Crn) 1Bn.A0A(83505));
            }
            acP.A06(context, rankingLoggingItem, threadSummary == null ? null : threadSummary.A0n, threadSummary, dataSourceIdentifier, r0, bp5, dk4, BP2.A00(bp5), (1Kn) null, ImmutableList.of((Object) user), (Boolean) acX.A07(new Crp(AcQ.A03(acQ), acQ.requireContext())), num, (Long) null, A05, str, (String) null, (String) null, user.A1A, i, i2, i3, AbO.A01(acQ), 0, false, AnonymousClass001.A1T(acX.A07(c1315Adt)));
        }
    }
}
