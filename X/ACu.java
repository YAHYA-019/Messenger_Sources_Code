package X;

import android.view.inputmethod.InputMethodManager;

/* loaded from: ACu.class */
public final class ACu implements Runnable {
    public static final String __redex_internal_original_name = "MessageComposerEditor$showSoftInputWithDelay$1";
    public final /* synthetic */ 6PS A00;

    public ACu(6PS r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6PS r0 = this.A00;
        6P9 r02 = r0.A02;
        r02.requestFocus();
        ((InputMethodManager) 1Br.A0B(r0.A00)).showSoftInput(r02, 0);
    }
}
