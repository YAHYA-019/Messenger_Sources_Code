package X;

import android.net.Uri;
import java.util.Set;

/* loaded from: Cbq.class */
public final class Cbq implements 1RN {
    public final /* synthetic */ C63l A00;
    public final /* synthetic */ Cht A01;

    public Cbq(C63l c63l, Cht cht) {
        this.A01 = cht;
        this.A00 = c63l;
    }

    public boolean BRi() {
        return false;
    }

    public void dispose() {
    }

    public void onFailure(Throwable th) {
        this.A01.A00(null);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A01.A00((Uri) obj);
        C63l c63l = this.A00;
        Set set = C63l.A0B;
        c63l.A00 = null;
    }
}
