package X;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: D8z.class */
public final class D8z implements Runnable {
    public static final String __redex_internal_original_name = "ThreadCutoverViewOpenHelper$openE2EEThreadAndCloseOpenCutoverThread$1$onSuccess$1";
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ CPY A01;
    public final /* synthetic */ 0CL A02;

    public D8z(Bundle bundle, CPY cpy, 0CL r304) {
        this.A01 = cpy;
        this.A02 = r304;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A04(CPY.A00((Uri) this.A02.element), this.A00);
    }
}
