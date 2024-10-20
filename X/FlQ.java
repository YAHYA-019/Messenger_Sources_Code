package X;

import com.facebook.common.util.JSONUtil;
import com.facebook.payments.checkout.configuration.model.PriceAmountInputCheckoutPurchaseInfoExtension;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.form.model.AmountFormData;
import com.facebook.payments.form.model.FormFieldAttributes;
import com.facebook.payments.model.FormFieldProperty;
import com.google.common.base.Preconditions;
import java.math.BigDecimal;

/* loaded from: FlQ.class */
public final class FlQ implements GKs {
    @Override // X.GKs
    public /* bridge */ /* synthetic */ Object CWh(24X r302, String str) {
        Preconditions.checkArgument(AnonymousClass001.A1W(Quq.A00(JSONUtil.A0H(r302.A0D("identifier"), null)), Quq.A0D));
        String A0P = C3o5.A0P(r302, "default_currency", null);
        BigDecimal bigDecimal = new BigDecimal(C3o5.A0P(r302.A0D("min_amount"), "amount", null));
        BigDecimal bigDecimal2 = new BigDecimal(C3o5.A0P(r302.A0D("max_amount"), "amount", null));
        String A0P2 = C3o5.A0P(r302, "placeholder_text", null);
        FormFieldAttributes formFieldAttributes = new FormFieldAttributes(Quo.A03, Qup.A01, FormFieldProperty.A03, null, A0P2, null, null, null, 0);
        C1pq.A08("currency", A0P);
        return new PriceAmountInputCheckoutPurchaseInfoExtension(new AmountFormData(new CurrencyAmount(A0P, bigDecimal2), new CurrencyAmount(A0P, bigDecimal), formFieldAttributes, A0P, null, null, null, false, false, false));
    }
}
