package X;

import android.widget.AutoCompleteTextView;

/* loaded from: Lov.class */
public final class Lov implements Runnable {
    public static final String __redex_internal_original_name = "DropdownMenuEndIconDelegate$5$1";
    public final /* synthetic */ AutoCompleteTextView A00;
    public final /* synthetic */ Leb A01;

    public Lov(AutoCompleteTextView autoCompleteTextView, Leb leb) {
        this.A01 = leb;
        this.A00 = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.removeTextChangedListener(this.A01.A00.A08);
    }
}
