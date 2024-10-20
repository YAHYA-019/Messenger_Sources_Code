package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.inject.FbInjector;

/* renamed from: X.4Eo, reason: invalid class name */
/* loaded from: 4Eo.class */
public final class C4Eo {
    public final 1Br A00 = 1Bq.A00(67996);
    public final C01i A01;
    public final Context A02;

    public C4Eo() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A02 = A00;
        this.A01 = C01g.A00(C03i.A02, new C4O0(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.I0w, java.lang.Object] */
    public final 1xH A00(Uri uri) {
        IA3 ia3 = (IA3) this.A01.getValue();
        1xH r0 = new 1xH();
        ia3.A00.A02(uri, (I0w) new Object(), HB4.A05, new ITu(uri, r0, ia3));
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.I0w, java.lang.Object] */
    public final void A01(Uri uri, JEi jEi) {
        IA3 ia3 = (IA3) this.A01.getValue();
        ia3.A00.A02(uri, (I0w) new Object(), HB4.A05, new ITw(this.A02, uri, jEi, ia3));
    }
}
