package X;

import android.net.Uri;

/* loaded from: J04.class */
public final class J04 implements Runnable {
    public static final String __redex_internal_original_name = "ArmadilloMediaDownloader$streamingDownload$1$3$callback$1";
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ JMA A01;
    public final /* synthetic */ String A02;

    public J04(Uri uri, JMA jma, String str) {
        this.A01 = jma;
        this.A02 = str;
        this.A00 = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.CO2(this.A02, this.A00);
    }
}
