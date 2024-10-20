package X;

import com.facebook.graphql.enums.GraphQLXFBDigitalProductXGradeStrategy;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.facebook.stickers.model.Sticker;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.util.LinkedHashMap;

/* loaded from: Fvr.class */
public final class Fvr implements 1K9 {
    public final int A00;
    public final Object A01;

    public Fvr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onFailure(Throwable th) {
        if (1 - this.A00 == 0) {
            11T.A0F(th, 0);
            Ent ent = (Ent) this.A01;
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = ent.A00;
            C50m c50m = inAppPurchaseControllerCoro.A09;
            java.util.Map map = ent.A02;
            11T.A0F(map, 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            LinkedHashMap A1C = 1BK.A1C();
            FHZ.A03(th, A1C);
            linkedHashMap.putAll(A1C);
            c50m.A00.BZX(linkedHashMap, null, 1BJ.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH));
            C7Zk c7Zk = inAppPurchaseControllerCoro.A06;
            c7Zk.A01("fetch_quote_end");
            c7Zk.A00("SERVER_QUOTING_FAILED");
            ent.A03.resumeWith(new 0DV(th));
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        2JY r0;
        2JY A0B;
        String A0r;
        String str;
        switch (this.A00) {
            case 0:
                C69b.A08((C69b) this.A01, (Sticker) obj);
                return;
            case 1:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                Integer num = null;
                if (abstractC08294mh == null || (r0 = (2JY) abstractC08294mh.A03) == null || (A0B = 1BK.A0B(r0, 2JX.class, -1319406662, -579144534)) == null) {
                    onFailure(AbF.A1D(7zK.A00(58)));
                    return;
                }
                String A0r2 = A0B.A0r(-879111746);
                if (A0r2 == null || (A0r = A0B.A0r(756285279)) == null) {
                    onFailure(AbF.A1D("Wrong GraphQL response"));
                    return;
                }
                2JY A0B2 = 1BK.A0B(A0B, 2JX.class, -940301979, 88610568);
                Ent ent = (Ent) this.A01;
                String A0r3 = A0B.A0r(-768546338);
                if (A0B2 != null) {
                    str = A0B2.A0r(-1077981273);
                    Enum A0g = A0B2.A0g(GraphQLXFBDigitalProductXGradeStrategy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, 436389203);
                    if (A0g != null) {
                        int i = 0;
                        if (A0g == GraphQLXFBDigitalProductXGradeStrategy.DEFERRED) {
                            i = 4;
                        } else if (A0g == GraphQLXFBDigitalProductXGradeStrategy.IMMEDIATE_AND_CHARGE_FULL_PRICE) {
                            i = 5;
                        } else if (A0g == GraphQLXFBDigitalProductXGradeStrategy.IMMEDIATE_SWITCH_WITH_PRORATED_CHARGE) {
                            i = 2;
                        } else if (A0g != GraphQLXFBDigitalProductXGradeStrategy.IMMEDIATE_SWITCH_WITH_PRORATED_REFUNDS) {
                            if (A0g == GraphQLXFBDigitalProductXGradeStrategy.IMMEDIATE_WITHOUT_PRORATION) {
                                i = 3;
                            } else if (A0g == GraphQLXFBDigitalProductXGradeStrategy.IMMEDIATE_SWITCH_WITH_TIME_PRORATION) {
                                i = 1;
                            }
                        }
                        num = Integer.valueOf(i);
                    }
                } else {
                    str = null;
                }
                InAppPurchaseControllerCoro inAppPurchaseControllerCoro = ent.A00;
                inAppPurchaseControllerCoro.A06.A01("fetch_quote_end");
                C50m c50m = inAppPurchaseControllerCoro.A09;
                java.util.Map map = ent.A02;
                11T.A0F(map, 3);
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(EPP.A0T.value, A0r);
                linkedHashMap.put(EPP.A0q.value, A0r2);
                if (A0r3 != null) {
                    linkedHashMap.put(EPP.A0d.value, A0r3);
                }
                c50m.A00.BZX(linkedHashMap, null, 1BJ.A00(361));
                DqC dqC = ent.A01;
                dqC.A03 = A0r;
                dqC.A04 = A0r2;
                dqC.A02 = str;
                dqC.A01 = num;
                C84j c84j = dqC.A00;
                if (c84j == null) {
                    c84j = new C84j(null, 3);
                }
                c84j.A01 = A0r3;
                dqC.A00 = c84j;
                ent.A03.resumeWith(1BK.A1G(dqC, linkedHashMap));
                return;
            default:
                2BV.A01((2JX) obj, (2BV) this.A01);
                return;
        }
    }
}
