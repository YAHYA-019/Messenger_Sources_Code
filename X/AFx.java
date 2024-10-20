package X;

import android.content.Context;
import android.widget.Toast;

/* loaded from: AFx.class */
public final class AFx implements Runnable {
    public static final String __redex_internal_original_name = "EncryptedBackupsDeveloperOptions$internalShowToast$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ String A02;

    public AFx(Context context, String str, int i) {
        this.A01 = context;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.A01, this.A02, this.A00).show();
    }
}
