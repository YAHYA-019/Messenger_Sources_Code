package X;

import android.content.Context;

/* loaded from: D91.class */
public final class D91 implements Runnable {
    public static final String __redex_internal_original_name = "LinkHandlingHelper$7";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C68t A01;
    public final /* synthetic */ String A02;

    public D91(Context context, C68t c68t, String str) {
        this.A01 = c68t;
        this.A00 = context;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        7zR.A1M((F8q) 1Hv.A02(this.A00, 99435), 2131958552);
        C68t c68t = this.A01;
        C00i c00i = C68t.A0P;
        1BK.A09(c68t.A05).D0v("ActivityNotFoundForLink", this.A02);
    }
}
