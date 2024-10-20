package X;

import android.net.Uri;
import com.facebook.inject.FbInjector;

/* loaded from: Bo6.class */
public final class Bo6 {
    public final Uri A00;
    public final RDh A01;
    public final String A02;

    public Bo6() {
        String A0j = 0Pz.A0j(FbInjector.A00().getPackageName(), ".", "experiments");
        this.A02 = A0j;
        Uri A03 = C0A2.A03(0Pz.A0W("content://", A0j));
        this.A00 = A03;
        this.A01 = new RDh(A03);
    }
}
