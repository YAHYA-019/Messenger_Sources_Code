package X;

import com.facebook.payments.ui.PaymentFormEditTextView;
import com.facebook.resources.ui.FbTextView;

/* loaded from: Fnb.class */
public final class Fnb implements GJX {
    public final /* synthetic */ DZE A00;
    public final /* synthetic */ PaymentFormEditTextView A01;
    public final /* synthetic */ String A02;

    public Fnb(DZE dze, PaymentFormEditTextView paymentFormEditTextView, String str) {
        this.A00 = dze;
        this.A01 = paymentFormEditTextView;
        this.A02 = str;
    }

    public GFy Ar0() {
        return new RvR(AbM.A0u(this.A01.A03));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View] */
    public void Bo7() {
        boolean z;
        FbTextView fbTextView;
        DZE dze = this.A00;
        String str = this.A02;
        switch (str.hashCode()) {
            case -1809289019:
                if (str.equals("name_input_controller_fragment_tag")) {
                    z = false;
                    break;
                } else {
                    return;
                }
            case -559108585:
                if (str.equals("billing_zip_input_controller_fragment_tag")) {
                    z = true;
                    break;
                } else {
                    return;
                }
            case -275321781:
                if (str.equals("state_input_controller_fragment_tag")) {
                    z = 2;
                    break;
                } else {
                    return;
                }
            case 1040861093:
                if (str.equals("city_input_controller_fragment_tag")) {
                    z = 3;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        switch (z) {
            case false:
                fbTextView = dze.A0O;
                break;
            case true:
                fbTextView = dze.A0Q;
                break;
            case true:
                fbTextView = dze.A0P;
                break;
            default:
                fbTextView = dze.A0N;
                break;
        }
        if (fbTextView != null) {
            fbTextView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.view.View] */
    public void CKr(String str) {
        2OB r0;
        FbTextView fbTextView;
        2OB r02;
        2OB r03;
        2OB r04;
        DZE dze = this.A00;
        String str2 = this.A02;
        switch (str2.hashCode()) {
            case -1809289019:
                if (str2.equals("name_input_controller_fragment_tag") && (r0 = dze.A0O) != null) {
                    r0.setText(str);
                    fbTextView = dze.A0O;
                    break;
                } else {
                    return;
                }
            case -559108585:
                if (str2.equals("billing_zip_input_controller_fragment_tag") && (r02 = dze.A0Q) != null) {
                    r02.setText(str);
                    fbTextView = dze.A0Q;
                    break;
                } else {
                    return;
                }
                break;
            case -275321781:
                if (str2.equals("state_input_controller_fragment_tag") && (r03 = dze.A0P) != null) {
                    r03.setText(str);
                    fbTextView = dze.A0P;
                    break;
                } else {
                    return;
                }
            case 1040861093:
                if (str2.equals("city_input_controller_fragment_tag") && (r04 = dze.A0N) != null) {
                    r04.setText(str);
                    fbTextView = dze.A0N;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        fbTextView.setVisibility(0);
    }
}
