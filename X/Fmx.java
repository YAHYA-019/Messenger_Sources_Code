package X;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.p2p.messenger.core.prefs.transactions.ProductMessengerPayHistoryItemView;
import com.facebook.payments.p2p.model.Amount;
import com.facebook.payments.p2p.model.CommerceOrder;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.google.common.base.Preconditions;

/* loaded from: Fmx.class */
public final class Fmx implements GFi {
    public final LayoutInflater A00;
    public final Elv A01;

    public Fmx() {
        LayoutInflater layoutInflater = (LayoutInflater) 1Hv.A02(7zP.A0J(), 100193);
        Elv elv = (Elv) 1Bn.A0B(99291);
        this.A00 = layoutInflater;
        this.A01 = elv;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.RLm, java.lang.Object] */
    @Override // X.GFi
    public GFh BK3(View view, ViewGroup viewGroup, Object obj) {
        if (view == null || !(view instanceof ProductMessengerPayHistoryItemView)) {
            view = AbG.A08(this.A00, viewGroup, 2132543167);
        }
        GFh gFh = (GFh) view;
        Elv elv = this.A01;
        Preconditions.checkArgument(obj instanceof PaymentTransaction);
        PaymentTransaction paymentTransaction = (PaymentTransaction) obj;
        CommerceOrder commerceOrder = paymentTransaction.A03;
        commerceOrder.getClass();
        Integer num = 0S2.A01;
        Boolean valueOf = Boolean.valueOf(AbH.A1E(elv.A01.A00).equals(String.valueOf(paymentTransaction.A06.mId)));
        String str = commerceOrder.mName;
        Amount amount = paymentTransaction.A01;
        ?? obj2 = new Object();
        ((RLm) obj2).A01 = QoN.A02;
        ((RLm) obj2).A00 = Typeface.DEFAULT;
        long parseLong = Long.parseLong(paymentTransaction.A0A) * 1000;
        ((RLm) obj2).A02 = parseLong > 0 ? 4YU.A0u(elv.A00, elv.A02.A03(parseLong), 2131967412) : "";
        gFh.CrF(new RuY(new RN8(new RYl((RLm) obj2), amount, valueOf, num, str), commerceOrder.mImageUrl));
        return gFh;
    }
}
