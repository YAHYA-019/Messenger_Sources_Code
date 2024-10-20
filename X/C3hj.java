package X;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: X.3hj, reason: invalid class name */
/* loaded from: 3hj.class */
public final class C3hj implements Runnable {
    public static final String __redex_internal_original_name = "NoteNotificationOpener$enqueue$timeoutRunnable$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ 2kU A02;

    public C3hj(Context context, ViewGroup viewGroup, 2kU r304) {
        this.A02 = r304;
        this.A00 = context;
        this.A01 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2kU r0 = this.A02;
        r0.A0C.set(true);
        0fH.A0g(Double.valueOf(1Br.A07(((C3Np) 1Br.A0B(r0.A08)).A00).Ai7(37169544627880679L)), "NoteNotificationOpener", "Notes fetch timed out after %f seconds.");
        2kU.A00(this.A00, this.A01, r0);
    }
}
