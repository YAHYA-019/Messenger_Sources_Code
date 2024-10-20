package X;

import android.os.Bundle;
import com.facebook.payments.auth.dynamicdescriptor.params.DynamicDescriptorParams;

/* loaded from: E4w.class */
public final class E4w extends F9s {
    public 1BY A00;
    public final C00i A01;

    public E4w(1BO r302, DynamicDescriptorParams dynamicDescriptorParams, String str) {
        super(dynamicDescriptorParams, str);
        this.A01 = 7zN.A0D(98470);
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.F9s
    public DYe A04() {
        QQo qQo = super.A00;
        if (qQo == null) {
            F6A f6a = (F6A) DKH.A0j(this.A00);
            DynamicDescriptorParams dynamicDescriptorParams = super.A01;
            boolean z = f6a.A01;
            qQo = new QQo();
            F9s.A01(dynamicDescriptorParams, qQo);
            Bundle bundle = qQo.mArguments;
            if (bundle == null) {
                bundle = 1BK.A05();
                qQo.setArguments(bundle);
            }
            bundle.putBoolean("attempts_exhausted", z);
            super.A00 = qQo;
        }
        return (DYe) qQo;
    }
}
