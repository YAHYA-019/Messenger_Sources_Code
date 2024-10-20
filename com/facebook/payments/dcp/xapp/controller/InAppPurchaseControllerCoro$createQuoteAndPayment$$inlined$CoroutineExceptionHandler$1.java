package com.facebook.payments.dcp.xapp.controller;

import X.0DC;
import X.0DE;
import X.AZb;
import X.ENg;
import X.G7R;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1.class */
public final class InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1 extends 0DC implements CoroutineExceptionHandler {
    public final /* synthetic */ AZb $purchaseListener$inlined;
    public final /* synthetic */ InAppPurchaseControllerCoro this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1(G7R g7r, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, AZb aZb) {
        super(g7r);
        this.this$0 = inAppPurchaseControllerCoro;
        this.$purchaseListener$inlined = aZb;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(0DE r302, Throwable th) {
        this.this$0.A06.A00("UNKNOWN_FAILURE");
        AZb aZb = this.$purchaseListener$inlined;
        if (aZb != null) {
            aZb.CEq(ENg.A0M);
        }
    }
}
