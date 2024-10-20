package com.facebook.payments.dcp.bloks;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.ETC;
import X.FHh;
import X.GJj;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* loaded from: InAppPurchaseFetchPriceAndBuyBase$evaluateImp$1.class */
public final class InAppPurchaseFetchPriceAndBuyBase$evaluateImp$1 extends 0DO implements Function2 {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ String $appName;
    public final /* synthetic */ GJj $callback;
    public final /* synthetic */ String $catalogType;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ FHh $environment;
    public final /* synthetic */ String $mode;
    public final /* synthetic */ String $payeeId;
    public final /* synthetic */ Map $payload;
    public final /* synthetic */ String $productId;
    public final /* synthetic */ String $productType;
    public final /* synthetic */ List $purchaseTypes;
    public final /* synthetic */ Map $response;
    public final /* synthetic */ List $storeSkus;
    public Object L$0;
    public int label;
    public final /* synthetic */ ETC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseFetchPriceAndBuyBase$evaluateImp$1(Context context, FragmentActivity fragmentActivity, ETC etc, FHh fHh, GJj gJj, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, Map map, Map map2, 0DR r317) {
        super(2, r317);
        this.this$0 = etc;
        this.$productType = str;
        this.$context = context;
        this.$mode = str2;
        this.$response = map;
        this.$appName = str3;
        this.$callback = gJj;
        this.$environment = fHh;
        this.$purchaseTypes = list;
        this.$storeSkus = list2;
        this.$catalogType = str4;
        this.$activity = fragmentActivity;
        this.$productId = str5;
        this.$payeeId = str6;
        this.$payload = map2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ETC etc = this.this$0;
        String str = this.$productType;
        Context context = this.$context;
        String str2 = this.$mode;
        Map map = this.$response;
        String str3 = this.$appName;
        GJj gJj = this.$callback;
        FHh fHh = this.$environment;
        List list = this.$purchaseTypes;
        List list2 = this.$storeSkus;
        return new InAppPurchaseFetchPriceAndBuyBase$evaluateImp$1(context, this.$activity, etc, fHh, gJj, str, str2, str3, this.$catalogType, this.$productId, this.$payeeId, list, list2, map, this.$payload, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.bloks.InAppPurchaseFetchPriceAndBuyBase$evaluateImp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
