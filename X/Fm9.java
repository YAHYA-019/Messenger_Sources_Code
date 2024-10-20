package X;

import android.content.Intent;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.payments.contactinfo.form.ContactInfoFormActivity;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.ui.titlebar.PaymentsTitleBarViewStub;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;
import com.facebook.ui.legacynavbar.LegacyNavigationBar;

/* loaded from: Fm9.class */
public final class Fm9 implements GK4 {
    public final /* synthetic */ ContactInfoFormActivity A00;

    public Fm9(ContactInfoFormActivity contactInfoFormActivity) {
        this.A00 = contactInfoFormActivity;
    }

    @Override // X.GK4
    public void Br4(Throwable th) {
    }

    @Override // X.GK4
    public void Br5(Intent intent) {
        ContactInfoFormActivity contactInfoFormActivity = this.A00;
        if (intent != null) {
            contactInfoFormActivity.setResult(-1, intent);
        } else {
            contactInfoFormActivity.setResult(-1);
        }
        contactInfoFormActivity.finish();
    }

    @Override // X.GK4
    public void BzV(boolean z) {
        ContactInfoFormActivity contactInfoFormActivity = this.A00;
        if (contactInfoFormActivity.A04 == null) {
            Eot eot = contactInfoFormActivity.A02;
            eot.getClass();
            F6h f6h = eot.A04;
            f6h.A09 = z;
            GL6.A01(eot.A03, f6h);
            return;
        }
        F6h f6h2 = contactInfoFormActivity.A06;
        f6h2.A00 = AbJ.A00(z ? 1 : 0);
        f6h2.A09 = true;
        f6h2.A03 = 2132542132;
        f6h2.A02 = 7zM.A02(contactInfoFormActivity, z ? 2MR.A1j : 2MR.A0o);
        LegacyNavigationBar legacyNavigationBar = contactInfoFormActivity.A04;
        if (legacyNavigationBar != null) {
            DKH.A1O(legacyNavigationBar, f6h2);
        }
    }

    @Override // X.GK4
    public void CuD(String str) {
        ContactInfoFormActivity contactInfoFormActivity = this.A00;
        LegacyNavigationBar legacyNavigationBar = contactInfoFormActivity.A04;
        if (legacyNavigationBar == null) {
            Eot eot = contactInfoFormActivity.A02;
            eot.getClass();
            F6h f6h = eot.A04;
            f6h.A08 = str;
            GL6.A01(eot.A03, f6h);
            return;
        }
        F6h f6h2 = contactInfoFormActivity.A06;
        f6h2.A08 = str;
        DKH.A1O(legacyNavigationBar, f6h2);
        LegacyNavigationBar legacyNavigationBar2 = contactInfoFormActivity.A04;
        FsC fsC = new FsC(this);
        Evd evd = legacyNavigationBar2.A04;
        if (evd != null) {
            evd.A03 = fsC;
        }
    }

    @Override // X.GK4
    public void CvW(String str) {
        PaymentsTitleBarViewStub paymentsTitleBarViewStub;
        ContactInfoFormActivity contactInfoFormActivity = this.A00;
        if (contactInfoFormActivity.A04 != null) {
            TextView textView = (TextView) DKF.A0B(contactInfoFormActivity.getLayoutInflater(), 2132542137);
            textView.setText(str);
            LegacyNavigationBar legacyNavigationBar = contactInfoFormActivity.A04;
            ViewGroup viewGroup = legacyNavigationBar.A0C;
            viewGroup.removeAllViews();
            LegacyNavigationBar.A01(legacyNavigationBar, 2);
            viewGroup.addView(textView);
            return;
        }
        Eot eot = contactInfoFormActivity.A02;
        eot.getClass();
        PaymentsDecoratorParams paymentsDecoratorParams = eot.A01;
        if (paymentsDecoratorParams != null && (paymentsTitleBarViewStub = eot.A02) != null) {
            PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle = paymentsDecoratorParams.paymentsTitleBarTitleStyle;
            PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle2 = PaymentsTitleBarTitleStyle.A03;
            if (paymentsTitleBarTitleStyle == paymentsTitleBarTitleStyle2) {
                paymentsTitleBarViewStub.A03(paymentsTitleBarTitleStyle2, str, 0);
                GL6 gl6 = eot.A02.A06;
                eot.A03 = gl6;
                ErO.A00(gl6, eot, 4);
                return;
            }
        }
        GL6 gl62 = eot.A03;
        if (gl62 != null) {
            gl62.CvV(str);
        }
    }
}
