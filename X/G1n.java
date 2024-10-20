package X;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: G1n.class */
public final class G1n implements Runnable {
    public static final String __redex_internal_original_name = "MSGNoviDatePickerComponentBinderUtils$3";
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ FyG A01;

    public G1n(EditText editText, FyG fyG) {
        this.A01 = fyG;
        this.A00 = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        InputMethodManager A06 = AbI.A06(this.A01.A00);
        if (A06 != null) {
            7zR.A12(this.A00, A06);
        }
    }
}
