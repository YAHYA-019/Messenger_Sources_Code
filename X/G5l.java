package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;

/* loaded from: G5l.class */
public final class G5l implements Runnable {
    public static final String __redex_internal_original_name = "MessengerExtensionUriHandler$handleUri$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnClickListener A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ CallToAction A03;
    public final /* synthetic */ E18 A04;

    public G5l(Context context, DialogInterface.OnClickListener onClickListener, Uri uri, CallToAction callToAction, E18 e18) {
        this.A04 = e18;
        this.A00 = context;
        this.A02 = uri;
        this.A01 = onClickListener;
        this.A03 = callToAction;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E18 e18 = this.A04;
        C5ic c5ic = e18.A07;
        Context context = this.A00;
        DR6 A02 = c5ic.A02(context);
        A02.A03(context.getString(2131967772));
        Uri uri = this.A02;
        A02.A0J(uri.toString());
        A02.A0G(this.A01, context.getString(2131967771));
        A02.A0E(FK1.A00, context.getString(2131967770));
        A02.A07(new FJo(4, uri, e18, this.A03));
        A02.A05();
    }
}
