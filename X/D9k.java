package X;

import android.content.Context;
import android.net.Uri;

/* loaded from: D9k.class */
public final class D9k implements Runnable {
    public static final String __redex_internal_original_name = "AdminReportingLaunchHelper$openUrlOnBackgroundThread$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CNM A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public D9k(Context context, CNM cnm, String str, String str2) {
        this.A01 = cnm;
        this.A00 = context;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C67Q) 1Br.A0B(this.A01.A01)).A03(this.A00, 4YU.A0F(this.A03), Uri.parse(this.A02), 0S2.A01);
    }
}
