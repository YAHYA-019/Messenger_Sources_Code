package X;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.payments.p2p.messenger.core.prefs.transactions.UserMessengerPayHistoryItemView;
import com.facebook.payments.p2p.model.Amount;
import com.facebook.payments.p2p.model.PaymentTransaction;
import com.facebook.payments.p2p.model.Receiver;
import com.google.common.base.Preconditions;

/* loaded from: Fmy.class */
public final class Fmy implements GFi {
    public final LayoutInflater A00;
    public final F5X A01;

    public Fmy() {
        LayoutInflater layoutInflater = (LayoutInflater) 1Hv.A02(7zP.A0J(), 100193);
        F5X f5x = (F5X) 1Bn.A0B(99290);
        this.A00 = layoutInflater;
        this.A01 = f5x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.RLm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [com.facebook.payments.p2p.model.Sender] */
    @Override // X.GFi
    public GFh BK3(View view, ViewGroup viewGroup, Object obj) {
        QoN qoN;
        RYl A00;
        QoN qoN2;
        if (view == null || !(view instanceof UserMessengerPayHistoryItemView)) {
            view = AbG.A08(this.A00, viewGroup, 2132543542);
        }
        GFh gFh = (GFh) view;
        F5X f5x = this.A01;
        Preconditions.checkArgument(obj instanceof PaymentTransaction);
        PaymentTransaction paymentTransaction = (PaymentTransaction) obj;
        String A1E = AbH.A1E(f5x.A01.A00);
        Receiver receiver = paymentTransaction.A05;
        boolean z = !A1E.equals(receiver.mId);
        Integer num = 0S2.A00;
        Boolean valueOf = Boolean.valueOf(z);
        if (!z) {
            receiver = paymentTransaction.A06;
        }
        String name = receiver.getName();
        Amount amount = paymentTransaction.A01;
        EnumC3492Mfn enumC3492Mfn = paymentTransaction.A07;
        switch (enumC3492Mfn.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 14:
            case 15:
            case 16:
            case 17:
                qoN2 = QoN.A03;
                A00 = F5X.A00(qoN2, f5x, paymentTransaction, false);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                qoN2 = QoN.A01;
                A00 = F5X.A00(qoN2, f5x, paymentTransaction, false);
                break;
            case 13:
                qoN2 = QoN.A02;
                A00 = F5X.A00(qoN2, f5x, paymentTransaction, false);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                qoN = QoN.A03;
                A00 = F5X.A00(qoN, f5x, paymentTransaction, true);
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                qoN = QoN.A01;
                A00 = F5X.A00(qoN, f5x, paymentTransaction, true);
                break;
            case 31:
            case 32:
                qoN = QoN.A02;
                A00 = F5X.A00(qoN, f5x, paymentTransaction, true);
                break;
            default:
                0fH.A07(F5X.class, enumC3492Mfn, "Invalid transfer_status %s provided");
                ?? obj2 = new Object();
                ((RLm) obj2).A01 = QoN.A03;
                ((RLm) obj2).A00 = Typeface.DEFAULT_BOLD;
                ((RLm) obj2).A02 = "";
                A00 = new RYl((RLm) obj2);
                break;
        }
        gFh.CrF(new RuZ(new RN8(A00, amount, valueOf, num, name), z ? paymentTransaction.A05 : paymentTransaction.A06));
        return gFh;
    }
}
