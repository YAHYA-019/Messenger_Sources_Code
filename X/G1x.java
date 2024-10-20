package X;

import android.net.Uri;
import java.net.URISyntaxException;

/* loaded from: G1x.class */
public final class G1x implements Runnable {
    public static final String __redex_internal_original_name = "BugReporterFileUtil$1";
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ FFl A01;

    public G1x(Uri uri, FFl fFl) {
        this.A01 = fFl;
        this.A00 = uri;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.A01.A04(DKE.A0n(this.A00.toString()));
        } catch (URISyntaxException e) {
            0fH.A0H(FFl.class, "Cannot parse Bug Report Directory URI", e);
        }
    }
}
