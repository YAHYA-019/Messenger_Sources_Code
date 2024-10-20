package X;

import android.content.DialogInterface;
import com.facebook.messaging.business.common.calltoaction.model.CTAUserConfirmation;

/* loaded from: D8q.class */
public final class D8q implements Runnable {
    public static final String __redex_internal_original_name = "CallToActionInvoker$showDialogAndHandleAction$1";
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ COy A01;
    public final /* synthetic */ CTAUserConfirmation A02;

    public D8q(DialogInterface.OnClickListener onClickListener, COy cOy, CTAUserConfirmation cTAUserConfirmation) {
        this.A01 = cOy;
        this.A02 = cTAUserConfirmation;
        this.A00 = onClickListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        COy cOy = this.A01;
        DR6 A02 = ((C5ic) 1Br.A0B(cOy.A05)).A02(cOy.A00);
        CTAUserConfirmation cTAUserConfirmation = this.A02;
        A02.A0J(cTAUserConfirmation.A01);
        String str = cTAUserConfirmation.A02;
        if (str != null && str.length() != 0) {
            A02.A03(str);
        }
        String str2 = cTAUserConfirmation.A03;
        if (str2 != null && str2.length() != 0) {
            A02.A0G(this.A00, str2);
        }
        String str3 = cTAUserConfirmation.A00;
        if (str3 != null && str3.length() != 0) {
            A02.A0E(CRZ.A00, str3);
        }
        A02.A05();
    }
}
