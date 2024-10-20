package X;

import android.content.Context;
import com.facebook.graphql.enums.GraphQLMessagingReachabilitySettingsSection;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model.DeliverySetting;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model.ReachabilitySetting;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model.ReachabilitySettingsProposedChanges;
import com.facebook.payments.checkout.model.CheckoutLaunchParams;
import com.facebook.payments.checkout.model.CheckoutLaunchParamsCore;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.rtc.launch.CallStartOutcome;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

/* loaded from: D2v.class */
public final class D2v implements Function {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public D2v(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = str;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        B7c b7c;
        ReachabilitySetting reachabilitySetting;
        2JY r0;
        2JY A0B;
        DeliverySetting deliverySetting;
        String A0t;
        switch (this.A00) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th == null) {
                    throw 1BK.A0h();
                }
                b7c = (B7c) this.A02;
                String message = th.getMessage();
                String str = ((VideoChatLink) this.A01).A0T;
                11T.A0A(str);
                B7c.A03(b7c, message, str, this.A03);
                1Br.A0C(b7c.A03);
                reachabilitySetting = 04S.A00;
                return reachabilitySetting;
            case 1:
                CallStartOutcome callStartOutcome = (CallStartOutcome) obj;
                if (callStartOutcome == null || callStartOutcome.A00()) {
                    b7c = (B7c) this.A02;
                    1Br.A0C(b7c.A03);
                    reachabilitySetting = 04S.A00;
                    return reachabilitySetting;
                }
                B7c b7c2 = (B7c) this.A02;
                1Br.A0C(b7c2.A03);
                String str2 = callStartOutcome.A01;
                String str3 = ((VideoChatLink) this.A01).A0T;
                11T.A0A(str3);
                B7c.A03(b7c2, str2, str3, this.A03);
                reachabilitySetting = 04S.A00;
                return reachabilitySetting;
            case 2:
                AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
                reachabilitySetting = null;
                if (abstractC08294mh != null && (r0 = (2JY) abstractC08294mh.A03) != null && (A0B = 1BK.A0B(r0, 2JX.class, 1467096053, 1681382755)) != null) {
                    ReachabilitySetting reachabilitySetting2 = (ReachabilitySetting) this.A01;
                    String str4 = this.A03;
                    String A0r = A0B.A0r(-511516159);
                    String A0r2 = A0B.A0r(-1061090040);
                    if ((A0B.hasFieldValue(-1867169789) && A0B.getBooleanValue(-1867169789)) || (A0r != null && A0r2 != null)) {
                        if (A0r == null) {
                            A0r = "";
                        }
                        String A00 = new C04t("  ").A00(new C04t("\n").A00(A0r, " "), "");
                        if (A0r2 == null) {
                            A0r2 = "";
                        }
                        String A002 = new C04t("  ").A00(new C04t("\n").A00(A0r2, " "), "");
                        String str5 = reachabilitySetting2.A05;
                        DeliverySetting deliverySetting2 = reachabilitySetting2.A01;
                        String str6 = reachabilitySetting2.A06;
                        ImmutableList immutableList = reachabilitySetting2.A02;
                        ImmutableList immutableList2 = reachabilitySetting2.A03;
                        GraphQLMessagingReachabilitySettingsSection graphQLMessagingReachabilitySettingsSection = reachabilitySetting2.A00;
                        String str7 = reachabilitySetting2.A07;
                        11T.A0A(deliverySetting2);
                        1Du it = immutableList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                deliverySetting = (DeliverySetting) it.next();
                                if (11T.A0O(deliverySetting.A00, str4)) {
                                }
                            } else {
                                deliverySetting = deliverySetting2;
                            }
                        }
                        ImmutableList A0c = A0B.A0c(957787882, 2JX.class, 1919119238);
                        ImmutableList.Builder A0h = 4YU.A0h();
                        if (A0c != null && !A0c.isEmpty()) {
                            1Du it2 = A0c.iterator();
                            while (it2.hasNext()) {
                                2JY A0P = 7zL.A0P(it2);
                                String str8 = null;
                                2JY A0B2 = 1BK.A0B(A0P, 2JX.class, 387585363, -562971655);
                                String A0t2 = A0P.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessagingReachabilitySettingsAudience", 975628804);
                                if (A0B2 != null && (A0t = A0B2.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessagingReachabilitySettingsDeliveryOption", 374323620)) != null) {
                                    str8 = A0t;
                                }
                                A0h.m11011add((Object) new ReachabilitySettingsProposedChanges(A0t2, str8));
                            }
                        }
                        ImmutableList A01 = 1Fj.A01(A0h);
                        C1pq.A08("warningDialogueTitle", A00);
                        C1pq.A08("warningDialogueDescription", A002);
                        reachabilitySetting = new ReachabilitySetting(graphQLMessagingReachabilitySettingsSection, deliverySetting, immutableList, immutableList2, A01, str5, str6, str7, A002, A00);
                    }
                }
                return reachabilitySetting;
            default:
                String str9 = (String) obj;
                if (str9 != null) {
                    Epi epi = (Epi) this.A02;
                    1Br.A0C(epi.A02);
                    String str10 = this.A03;
                    C1pq.A08("pageId", str10);
                    C1pq.A08("pageId", str10);
                    EiE eiE = (EiE) 1Br.A0B(epi.A00);
                    Context context = (Context) this.A01;
                    0LS.A0A(context, ((EvN) 1Br.A0B(eiE.A00)).A00(context, new CheckoutLaunchParams(new CheckoutLaunchParamsCore(null, EMD.A0I, null, PaymentItemType.A0R, str9, str10), null)));
                }
                reachabilitySetting = RYs.A00(true);
                return reachabilitySetting;
        }
    }
}
