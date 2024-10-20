package X;

import com.facebook.payments.confirmation.ConfirmationMessageRowView;
import com.facebook.widget.text.BetterTextView;

/* loaded from: E7P.class */
public final class E7P extends DTE {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r301v0, types: [X.E7P, X.2lb] */
    public /* bridge */ /* synthetic */ void A0A(GD9 gd9) {
        BetterTextView betterTextView;
        Fm1 fm1 = (Fm1) gd9;
        ConfirmationMessageRowView confirmationMessageRowView = this.A0I;
        confirmationMessageRowView.A01.setVisibility(8);
        confirmationMessageRowView.A00.setVisibility(8);
        confirmationMessageRowView.A03.setVisibility(8);
        confirmationMessageRowView.A02.setVisibility(8);
        CharSequence charSequence = fm1.A02;
        if (charSequence != null) {
            confirmationMessageRowView.A01.setText(2131954796);
            confirmationMessageRowView.A01.setVisibility(0);
            confirmationMessageRowView.A00.setText(charSequence);
            betterTextView = confirmationMessageRowView.A00;
        } else {
            CharSequence charSequence2 = fm1.A01;
            if (charSequence2 != null) {
                confirmationMessageRowView.A01.setText(charSequence2);
                confirmationMessageRowView.A01.setVisibility(0);
            }
            C2203Dgv c2203Dgv = fm1.A00;
            if (c2203Dgv != null) {
                try {
                    confirmationMessageRowView.A03.A02(c2203Dgv);
                    confirmationMessageRowView.A03.setVisibility(0);
                } catch (ERd e) {
                    0fH.A0w("ConfirmationMessageRowView", e.getMessage(), e);
                }
            }
            CharSequence charSequence3 = fm1.A03;
            if (charSequence3 == null) {
                return;
            }
            confirmationMessageRowView.A02.setText(charSequence3);
            betterTextView = confirmationMessageRowView.A02;
        }
        betterTextView.setVisibility(0);
    }
}
