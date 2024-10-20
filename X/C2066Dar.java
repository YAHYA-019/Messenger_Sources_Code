package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.google.common.base.Preconditions;

/* renamed from: X.Dar, reason: case insensitive filesystem */
/* loaded from: Dar.class */
public final class C2066Dar extends C1q6 {
    public final /* synthetic */ FIe A00;

    public C2066Dar(FIe fIe) {
        this.A00 = fIe;
    }

    @Override // X.C1q6, X.C1pu
    public void Bhs(Intent intent, Fragment fragment, int i, int i2) {
        Epd epd;
        String stringExtra;
        Epd epd2;
        ETm eTm;
        EtE etE;
        if (i == 131) {
            FIe fIe = this.A00;
            if (i2 != -1) {
                epd = fIe.A01;
                epd.A01.A00();
                return;
            } else if (intent.getStringExtra("user_fingerprint_nonce") != null) {
                String stringExtra2 = intent.getStringExtra("user_fingerprint_nonce");
                eTm = fIe.A01.A01;
                etE = fIe.A0H.A0A(stringExtra2) ? new EtE(ELo.A01, stringExtra2) : new EtE(ELo.A02, stringExtra2);
            } else {
                stringExtra = intent.getStringExtra("user_entered_pin");
                stringExtra.getClass();
                epd2 = fIe.A01;
                eTm = epd2.A01;
                etE = new EtE(ELo.A05, stringExtra);
                Preconditions.checkArgument(AnonymousClass001.A1Q(stringExtra.length(), 4));
            }
        } else {
            if (i != 5001 && i != 5002) {
                return;
            }
            FIe fIe2 = this.A00;
            if (i2 != -1) {
                FIe.A01(fIe2);
                epd = fIe2.A01;
                epd.A01.A00();
                return;
            } else {
                if (intent.getStringExtra("user_fingerprint_nonce") != null) {
                    FIe.A02(fIe2, intent.getStringExtra("user_fingerprint_nonce"));
                    return;
                }
                FIe.A01(fIe2);
                stringExtra = intent.getStringExtra("user_entered_pin");
                stringExtra.getClass();
                if (i == 5002) {
                    PaymentsFlowStep paymentsFlowStep = fIe2.A0H.A07() ? PaymentsFlowStep.A1l : PaymentsFlowStep.A0U;
                    F9H f9h = fIe2.A0E;
                    f9h.A00 = F9H.A00(F5g.A03, new E4y(fIe2, paymentsFlowStep, 1), f9h, new Fvi(f9h, stringExtra), f9h.A00);
                }
                epd2 = fIe2.A01;
                eTm = epd2.A01;
                etE = new EtE(ELo.A05, stringExtra);
                Preconditions.checkArgument(AnonymousClass001.A1Q(stringExtra.length(), 4));
            }
        }
        eTm.A02(etE);
    }

    public boolean equals(Object obj) {
        return obj instanceof C2066Dar;
    }

    public int hashCode() {
        return 0;
    }
}
