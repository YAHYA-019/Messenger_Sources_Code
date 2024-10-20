package X;

import android.content.Context;
import android.widget.Toast;

/* loaded from: ABh.class */
public final class ABh implements 1K9 {
    public final Context A00;

    public ABh(Context context) {
        this.A00 = context;
    }

    public void onFailure(Throwable th) {
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Bqb bqb = (Bqb) obj;
        if (bqb != null) {
            if (bqb.A02 || bqb.A01) {
                Toast.makeText(this.A00, 2131964654, 0).show();
            }
        }
    }
}
