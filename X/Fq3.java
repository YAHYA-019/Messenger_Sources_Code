package X;

import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.litho.LithoView;
import com.facebook.quicksilver.QuicksilverActivity;

/* loaded from: Fq3.class */
public final class Fq3 implements GGH {
    public final /* synthetic */ QuicksilverActivity A00;
    public final /* synthetic */ Boolean A01;

    public Fq3(QuicksilverActivity quicksilverActivity, Boolean bool) {
        this.A00 = quicksilverActivity;
        this.A01 = bool;
    }

    public void Bpo(GraphQLResult graphQLResult) {
        QuicksilverActivity quicksilverActivity = this.A00;
        LithoView lithoView = quicksilverActivity.A0C;
        FGt fGt = quicksilverActivity.A0F;
        1Iw r0 = quicksilverActivity.A0B;
        boolean A1Q = AnonymousClass001.A1Q(quicksilverActivity.A00, 11);
        boolean A1O = QuicksilverActivity.A1O(quicksilverActivity);
        boolean booleanValue = this.A01.booleanValue();
        DZW dzw = quicksilverActivity.A0E;
        lithoView.A0x(fGt.A03((Dky) null, dzw != null ? dzw.A1X().A01 : null, r0, quicksilverActivity.A0c, 0, A1Q, A1O, booleanValue, QuicksilverActivity.A1Q(quicksilverActivity), 0S2.A01.equals(quicksilverActivity.A0G.A07), false, QuicksilverActivity.A1R(quicksilverActivity), QuicksilverActivity.A1P(quicksilverActivity)));
    }
}
