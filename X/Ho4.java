package X;

import android.net.Uri;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: Ho4.class */
public final class Ho4 {
    public final 1Br A00 = 1Bq.A00(32976);
    public final 1Br A01 = 1Bq.A00(16462);

    public void A00(Uri uri, JJ6 jj6, File file) {
        GOp.A1H(this.A01).schedule((Runnable) new J2O(uri, jj6, this, file), 0L, TimeUnit.SECONDS);
    }
}
