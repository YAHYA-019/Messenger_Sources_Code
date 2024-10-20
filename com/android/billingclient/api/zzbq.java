package com.android.billingclient.api;

import X.0Q8;
import X.C50v;
import X.C50w;
import X.L1w;
import X.MEn;
import X.MEo;
import X.MEq;
import X.MEr;
import X.MEs;
import java.util.Collections;
import java.util.List;

/* loaded from: zzbq.class */
public final class zzbq implements C50v, MEn, MEo, MEr, C50w, MEs, MEq {
    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);

    @Override // X.MEn
    public final void BhP(L1w l1w) {
        nativeOnAcknowledgePurchaseResponse(l1w.A00, l1w.A01, 0L);
    }

    @Override // X.C50v
    public final void BlT() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // X.C50v
    public final void BlU(L1w l1w) {
        nativeOnBillingSetupFinished(l1w.A00, l1w.A01, 0L);
    }

    @Override // X.MEo
    public final void Br2(L1w l1w, String str) {
        nativeOnConsumePurchaseResponse(l1w.A00, l1w.A01, str, 0L);
    }

    @Override // X.MEq
    public final void CEr(L1w l1w, List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchaseHistoryResponse(l1w.A00, l1w.A01, (PurchaseHistoryRecord[]) list.toArray(new PurchaseHistoryRecord[list.size()]), 0L);
    }

    @Override // X.C50w
    public final void CEx(L1w l1w, List list) {
        throw 0Q8.createAndThrow();
    }

    @Override // X.MEr
    public final void CF4(L1w l1w, List list) {
        nativeOnQueryPurchasesResponse(l1w.A00, l1w.A01, (Purchase[]) list.toArray(new Purchase[list.size()]), 0L);
    }

    @Override // X.MEs
    public final void CLq(L1w l1w, List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(l1w.A00, l1w.A01, (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), 0L);
    }
}
