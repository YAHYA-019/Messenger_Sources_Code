package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;

/* loaded from: D9h.class */
public final class D9h implements Runnable {
    public static final String __redex_internal_original_name = "CallToActionInvoker$handleAction$2";
    public final /* synthetic */ DialogInterface.OnClickListener A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ COy A02;
    public final /* synthetic */ CallToAction A03;

    public D9h(DialogInterface.OnClickListener onClickListener, Uri uri, COy cOy, CallToAction callToAction) {
        this.A02 = cOy;
        this.A01 = uri;
        this.A00 = onClickListener;
        this.A03 = callToAction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        COy cOy = this.A02;
        C5ic c5ic = (C5ic) 1Br.A0B(cOy.A05);
        Context context = cOy.A00;
        DR6 A02 = c5ic.A02(context);
        A02.A03(context.getString(2131967772));
        Uri uri = this.A01;
        A02.A0J(uri.toString());
        A02.A0G(this.A00, context.getString(2131967771));
        A02.A0E(CRY.A00, context.getString(2131967770));
        A02.A07(new FJo(3, uri, cOy, this.A03));
        A02.A05();
    }
}
