package com.facebook.messaging.nativepagereply.plugins.orders.threadviewbanner;

import X.07S;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1UG;
import X.1VX;
import X.4YT;
import X.4YU;
import X.4YV;
import X.5Dh;
import X.5Sc;
import X.63D;
import X.6Kw;
import X.7OX;
import X.7zN;
import X.9RY;
import X.AbF;
import X.AbI;
import X.AbO;
import X.AbstractC05414dq;
import X.AnonymousClass954;
import X.BOI;
import X.BfW;
import X.Biy;
import X.C01643sd;
import X.CYu;
import X.Cuw;
import X.Q80;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.AdsConversionsQPData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: BusinessInboxOrdersUpsellBanner.class */
public final class BusinessInboxOrdersUpsellBanner {
    public final Context A00;
    public final 1Br A01;
    public final 63D A02;
    public final FbUserSession A03;

    public BusinessInboxOrdersUpsellBanner(Context context, FbUserSession fbUserSession, 63D r304) {
        1BL.A1H(context, r304, fbUserSession);
        this.A00 = context;
        this.A02 = r304;
        this.A03 = fbUserSession;
        this.A01 = 1Bu.A00(82669);
    }

    public static final void A00(ThreadKey threadKey, AdsConversionsQPData adsConversionsQPData, BusinessInboxOrdersUpsellBanner businessInboxOrdersUpsellBanner) {
        Biy biy = (Biy) 7zN.A0l(businessInboxOrdersUpsellBanner.A00, 1, 83953);
        String str = adsConversionsQPData.A02;
        FbUserSession fbUserSession = businessInboxOrdersUpsellBanner.A03;
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, 4YU.A0z(threadKey), 4YT.A00(1012));
        07S.A00(A0J, AbF.A16(threadKey), "page_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, str, "conversion_type");
        4YV.A1A(A0J, A0N, "data");
        AbstractC05414dq A04 = 1VX.A04(biy.A00, fbUserSession);
        5Dh r0 = new 5Dh((C01643sd) AbO.A09(A0N, new C01643sd(Q80.class, "DismissMessengerConversionSuggestion", null, "data", "fbandroid", 290645710, 384, 3886932122L, 3886932122L, false, true)).A0K);
        4YU.A1J(r0, 391254665174029L);
        A04.A06(r0);
    }

    public final void A01(7OX r302, 5Sc r303) {
        AdsConversionsQPData adsConversionsQPData;
        ThreadKey threadKey;
        boolean A1W = 1BL.A1W(r303, r302);
        ThreadSummary threadSummary = r303.A02;
        if (threadSummary == null || (adsConversionsQPData = threadSummary.A0o) == null || (threadKey = threadSummary.A0n) == null || !11T.A0O(adsConversionsQPData.A02, "CONFIRM_ORDER")) {
            return;
        }
        BfW bfW = (BfW) 1Br.A0B(this.A01);
        long j = threadKey.A05;
        long j2 = threadKey.A02;
        String str = adsConversionsQPData.A09;
        1UG A08 = 1BK.A08(1Br.A02(bfW.A00), "smart_suggestion_impression");
        if (A08.isSampled()) {
            A08.A5c(BOI.A01, "suggestion_type");
            A08.A6H("page_or_business_id", Long.valueOf(j));
            AbI.A1K(A08, j2);
            if (str == null) {
                str = "";
            }
            A08.A7R(TraceFieldType.RequestID, str);
            A08.A7R("channel", "MESSENGER");
            A08.BZL();
        }
        Context context = this.A00;
        String string = context.getString(2131953278);
        r302.CXr(new 6Kw(r302, new Cuw(3, this, threadKey, adsConversionsQPData), new 9RY(new CYu(A1W ? 1 : 0, adsConversionsQPData, r302, this, threadKey), AnonymousClass954.PRIMARY, context.getString(2131953276)), (9RY) null, (Boolean) null, context.getString(2131953277), (String) null, string));
    }
}
