package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: Ixk.class */
public final class Ixk implements Runnable {
    public static final String __redex_internal_original_name = "PreinflateManager$resubmitPreInflateRequest$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ WeakReference A01;

    public Ixk(WeakReference weakReference, int i) {
        this.A01 = weakReference;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.A01.get();
        if (context != null) {
            I6v.A00(context, this.A00);
        }
    }
}
