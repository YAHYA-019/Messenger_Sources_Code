package com.facebook.payments.receipt;

import X.1BO;
import X.1BY;
import X.1Bn;
import X.4YV;
import X.7zL;
import X.7zP;
import X.AnonymousClass001;
import X.C1pq;
import X.C4S3;
import X.ELR;
import X.ER6;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.receipt.model.ReceiptCommonParams;
import com.facebook.payments.receipt.model.ReceiptComponentControllerParams;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashSet;

/* loaded from: PaymentsReceiptActivityComponentHelper.class */
public final class PaymentsReceiptActivityComponentHelper extends C4S3 {
    public 1BY A00;
    public final Context A01 = 7zP.A0J();
    public final ViewerContext A02 = (ViewerContext) 1Bn.A0B(83431);

    public PaymentsReceiptActivityComponentHelper(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4S3
    public Intent A00(Context context, Intent intent) {
        Context context2 = this.A01;
        ViewerContext viewerContext = this.A02;
        Bundle extras = intent.getExtras();
        ER6 A00 = ER6.A00(extras.getString("product_type"));
        String string = extras.getString("title");
        if (string != null) {
            try {
                string = URLDecoder.decode(string, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        HashSet A0v = AnonymousClass001.A0v();
        C1pq.A08("paymentModulesClient", A00);
        String string2 = extras.getString("product_id");
        C1pq.A08("productId", string2);
        int ordinal = A00.ordinal();
        ReceiptComponentControllerParams receiptComponentControllerParams = new ReceiptComponentControllerParams(A00, ordinal != 2 ? ordinal != 11 ? ELR.A03 : ELR.A01 : ELR.A02, string2, 4YV.A0z("receiptStyle", A0v, A0v));
        String str = null;
        PaymentsDecoratorParams A03 = PaymentsDecoratorParams.A03();
        if (string != null) {
            str = string;
        }
        return PaymentsReceiptActivity.A12(context2, viewerContext, new ReceiptCommonParams(A03, receiptComponentControllerParams, str));
    }
}
