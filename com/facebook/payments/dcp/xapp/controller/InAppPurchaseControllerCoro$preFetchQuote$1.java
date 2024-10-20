package com.facebook.payments.dcp.xapp.controller;

import X.03W;
import X.03Y;
import X.04R;
import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.11T;
import X.1BK;
import X.4cY;
import X.4cZ;
import X.AnonymousClass001;
import X.C2a1;
import X.C2s6;
import X.C50m;
import X.C87x;
import X.DqC;
import X.EQx;
import com.facebook.payments.dcp.xapp.cache.InAppPurchaseQuoteCache;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: InAppPurchaseControllerCoro$preFetchQuote$1.class */
public final class InAppPurchaseControllerCoro$preFetchQuote$1 extends 0DO implements Function2 {
    public final /* synthetic */ EQx $dcpProductType;
    public final /* synthetic */ String $developerPayload;
    public final /* synthetic */ String $productId;
    public final /* synthetic */ String $productType;
    public final /* synthetic */ InAppPurchaseQuoteCache $quoteCache;
    public final /* synthetic */ String $storeSku;
    public int label;
    public final /* synthetic */ InAppPurchaseControllerCoro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseControllerCoro$preFetchQuote$1(InAppPurchaseQuoteCache inAppPurchaseQuoteCache, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, EQx eQx, String str, String str2, String str3, String str4, 0DR r309) {
        super(2, r309);
        this.$storeSku = str;
        this.$dcpProductType = eQx;
        this.$developerPayload = str2;
        this.$productId = str3;
        this.this$0 = inAppPurchaseControllerCoro;
        this.$productType = str4;
        this.$quoteCache = inAppPurchaseQuoteCache;
    }

    public final 0DR create(Object obj, 0DR r303) {
        String str = this.$storeSku;
        EQx eQx = this.$dcpProductType;
        String str2 = this.$developerPayload;
        String str3 = this.$productId;
        return new InAppPurchaseControllerCoro$preFetchQuote$1(this.$quoteCache, this.this$0, eQx, str, str2, str3, this.$productType, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        4cZ r0;
        0Ds r02 = 0Ds.A02;
        int i = this.label;
        try {
            if (i == 0) {
                0Dt.A00(obj);
                DqC dqC = new DqC(null, this.$dcpProductType, this.$storeSku, this.$developerPayload, this.$productId, null, false, false);
                C50m c50m = this.this$0.A09;
                String str = dqC.A03;
                String str2 = this.$productType;
                String str3 = dqC.A07;
                03W r315 = dqC.A08;
                if (r315 == null) {
                    r315 = 04R.A0G();
                }
                LinkedHashMap A04 = c50m.A04(str, str2, str3, r315, true);
                InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.this$0;
                this.label = 1;
                obj = InAppPurchaseControllerCoro.A02(inAppPurchaseControllerCoro, dqC, A04, this);
                if (obj == r02) {
                    return r02;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
            }
            03Y r03 = (03Y) obj;
            DqC dqC2 = (DqC) r03.first;
            Map map = (Map) r03.second;
            InAppPurchaseQuoteCache inAppPurchaseQuoteCache = this.$quoteCache;
            String str4 = this.$productId;
            11T.A0F(str4, 0);
            11T.A0G(dqC2, 1, map);
            if (str4.equals(inAppPurchaseQuoteCache.A00)) {
                4cY r04 = ((C87x) inAppPurchaseQuoteCache).A00;
                if (r04 != null) {
                    r04.A0O(1BK.A1G(dqC2, map));
                }
            }
        } catch (Throwable th) {
            InAppPurchaseQuoteCache inAppPurchaseQuoteCache2 = this.$quoteCache;
            String str5 = this.$productId;
            11T.A0F(str5, 0);
            if (str5.equals(inAppPurchaseQuoteCache2.A00) && (r0 = ((C87x) inAppPurchaseQuoteCache2).A00) != null) {
                ((C2a1) r0).A0O(new C2s6(th, false));
            }
        }
        return 04S.A00;
    }
}
