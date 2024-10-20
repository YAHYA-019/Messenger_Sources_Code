package X;

import android.widget.EditText;

/* loaded from: Lot.class */
public final class Lot implements Runnable {
    public static final String __redex_internal_original_name = "ClearTextEndIconDelegate$4$1";
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ Lea A01;

    public Lot(EditText editText, Lea lea) {
        this.A01 = lea;
        this.A00 = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A02);
    }
}
