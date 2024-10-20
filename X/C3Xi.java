package X;

import com.facebook.common.util.TriState;
import com.facebook.interstitial.api.GraphQLInterstitialsResult;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.3Xi, reason: invalid class name */
/* loaded from: 3Xi.class */
public final class C3Xi implements 4qU {
    public 1BY A00;
    public final C00i A03 = 1BV.A01((1BY) null, 98770);
    public final C00i A02 = 1BV.A01((1BY) null, 98769);
    public final C00i A01 = 1BQ.A02(99390);
    public final C00i A04 = 1BQ.A02(100056);

    public C3Xi(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public Iterable B0L() {
        C3sa A01 = ((C09954rz) this.A03.get()).A01(ImmutableList.of((Object) "8148"), false);
        return ImmutableList.of((Object) new C4r6(TriState.UNSET, (1Ro) this.A02.get(), A01, null, "m4a_ndx_eligibility_check"));
    }

    public void CA9(java.util.Map map) {
        ImmutableList A00 = AbstractC10564tu.A00((2JX) map.get("m4a_ndx_eligibility_check"), 1BL.A08(this.A01));
        if (A00 != null) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                GraphQLInterstitialsResult graphQLInterstitialsResult = (GraphQLInterstitialsResult) it.next();
                if (!graphQLInterstitialsResult.isValid) {
                    return;
                }
                C2x8 A002 = graphQLInterstitialsResult.A00();
                F6W f6w = (F6W) this.A04.get();
                if (A002 != null) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    2JY A0B = 1BK.A0B(A002, 2JX.class, -1052106183, -1282291815);
                    if (A0B != null) {
                        2JY A0K = A0B.A0K(1920849689, 2JX.class, -274374564);
                        ImmutableList A0Z = A0K.A0Z(443904703);
                        for (int i = 0; i < A0Z.size(); i++) {
                            builder.m11011add(A0Z.get(i));
                        }
                        f6w.A00 = builder.build();
                        f6w.A02 = A0K.A0r(-22145738);
                        ((Ers) f6w.A06.get()).A00("ndx_eligibility", "server_eligibility_fetched", f6w.A02);
                    }
                }
            }
        }
    }
}
