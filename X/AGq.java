package X;

import android.content.Context;
import android.view.View;

/* loaded from: AGq.class */
public final class AGq implements Runnable {
    public static final String __redex_internal_original_name = "TranslateContextMessageMenuItem$showErrorPopup$1";
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ 1Br A02;
    public final /* synthetic */ C9wl A03;

    public AGq(Context context, View view, 1Br r304, C9wl c9wl) {
        this.A01 = view;
        this.A03 = c9wl;
        this.A00 = context;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6LF r0 = (6LF) 1Br.A0B(this.A02);
        7zQ.A17(this.A00, this.A01, this.A03.A09, r0, 2131959557);
    }
}
