package X;

import android.widget.EditText;

/* loaded from: Low.class */
public final class Low implements Runnable {
    public static final String __redex_internal_original_name = "PasswordToggleEndIconDelegate$3$1";
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ Lec A01;

    public Low(EditText editText, Lec lec) {
        this.A01 = lec;
        this.A00 = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A00);
    }
}
