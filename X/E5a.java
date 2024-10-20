package X;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.payments.invoice.protocol.InvoiceConfigParams;
import com.facebook.payments.invoice.protocol.InvoiceConfigResult;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: E5a.class */
public final class E5a extends E5c {
    public static final String __redex_internal_original_name = "InvoiceConfigMethod";
    public final ViewerContext A00;
    public final EsB A01;

    public E5a() {
        super((CbI) 1Bn.A0B(82307), InvoiceConfigResult.class);
        ViewerContext viewerContext = (ViewerContext) 1Bn.A0B(83431);
        EsB esB = (EsB) 1Bn.A0B(99045);
        this.A00 = viewerContext;
        this.A01 = esB;
    }

    public String A02() {
        return 1BJ.A00(1388);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        InvoiceConfigParams invoiceConfigParams = (InvoiceConfigParams) obj;
        ViewerContext viewerContext = this.A00;
        Preconditions.checkArgument(viewerContext.mIsPageContext);
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("buyer_id", String.valueOf(invoiceConfigParams.A00)));
        A0s.add(new BasicNameValuePair("seller_id", viewerContext.mUserId));
        A0s.add(new BasicNameValuePair(DexOptimization.OPT_KEY_CLIENT, invoiceConfigParams.A01.toString()));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("product_id", invoiceConfigParams.A02), A0s);
        AbF.A1P(A0C, __redex_internal_original_name);
        return AbK.A0M(A0C, "payments/invoice_configs", A0s);
    }
}
