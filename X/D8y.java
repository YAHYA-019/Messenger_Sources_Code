package X;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: D8y.class */
public final class D8y implements Runnable {
    public static final String __redex_internal_original_name = "ThreadCutoverViewOpenHelper$openE2EEBubbleAndCloseCutoverBubble$1$onSuccess$1";
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ CPY A02;

    public D8y(Uri uri, Bundle bundle, CPY cpy) {
        this.A02 = cpy;
        this.A00 = uri;
        this.A01 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A04(CPY.A00(this.A00), this.A01);
    }
}
