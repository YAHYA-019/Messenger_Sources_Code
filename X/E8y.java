package X;

import android.content.Context;
import android.view.KeyEvent;
import com.facebook.payments.ui.PaymentFormEditTextView;
import com.facebook.resources.ui.FbAutoCompleteTextView;

/* loaded from: E8y.class */
public final class E8y extends FbAutoCompleteTextView {
    public final /* synthetic */ PaymentFormEditTextView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E8y(Context context, PaymentFormEditTextView paymentFormEditTextView) {
        super(context);
        this.A00 = paymentFormEditTextView;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        PaymentFormEditTextView paymentFormEditTextView = this.A00;
        if (paymentFormEditTextView.A01 == null || i != 4 || keyEvent.getAction() != 0) {
            return false;
        }
        paymentFormEditTextView.A01.A00.A05.A02();
        return false;
    }
}
