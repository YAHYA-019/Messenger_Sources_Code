package X;

import android.content.Context;
import android.view.View;
import com.facebook.payments.currency.CurrencyAmount;
import com.facebook.payments.p2p.datamodel.P2pPaymentData;
import com.facebook.resources.ui.FbTextView;
import java.math.BigDecimal;

/* loaded from: E61.class */
public final class E61 extends Ezy {
    public Context A00;
    public View A01;
    public P2pPaymentData A02;
    public FbTextView A03;
    public final 1GS A04 = DKG.A0J();

    public static void A00(E61 e61) {
        if (e61.A01 == null || e61.A03 == null) {
            return;
        }
        int size = e61.A02.A06.size();
        View view = e61.A01;
        if (size == 1) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        2OB r0 = e61.A03;
        Context context = e61.A00;
        P2pPaymentData p2pPaymentData = e61.A02;
        CurrencyAmount A00 = p2pPaymentData.A00();
        DKH.A0v(context, r0, new CurrencyAmount(A00.A00, A00.A01.multiply(new BigDecimal(p2pPaymentData.A06.size()))).A06(0S2.A0C, e61.A04.A05()), 2131957518);
    }
}
