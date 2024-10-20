package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.payments.checkout.activity.TetraPaymentMethodPickerActivity;

/* loaded from: Flk.class */
public final class Flk implements GK3 {
    public final /* synthetic */ TetraPaymentMethodPickerActivity A00;

    public Flk(TetraPaymentMethodPickerActivity tetraPaymentMethodPickerActivity) {
        this.A00 = tetraPaymentMethodPickerActivity;
    }

    @Override // X.GK3
    public void BzY() {
    }

    @Override // X.GK3
    public void C4o(boolean z) {
    }

    @Override // X.GK3
    public void CHl(int i, int i2, Intent intent) {
        if (i == 715) {
            Bundle A05 = 1BK.A05();
            A05.putParcelable("extra_activity_result_data", intent);
            TetraPaymentMethodPickerActivity tetraPaymentMethodPickerActivity = this.A00;
            Bundle A052 = 1BK.A05();
            A052.putAll(A05);
            Intent intent2 = (Intent) A052.getParcelable("extra_activity_result_data");
            if (intent2 != null) {
                tetraPaymentMethodPickerActivity.setResult(-1, intent2);
            } else {
                tetraPaymentMethodPickerActivity.setResult(-1);
            }
            tetraPaymentMethodPickerActivity.finish();
        }
    }

    @Override // X.GK3
    public void CsT(QoM qoM) {
    }

    @Override // X.GK3
    public void setVisibility(int i) {
    }
}
