package X;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: Leb.class */
public final class Leb implements MGR {
    public final /* synthetic */ K8T A00;

    public Leb(K8T k8t) {
        this.A00 = k8t;
    }

    @Override // X.MGR
    public void Bvz(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.A0V;
        if (autoCompleteTextView == null || i != 3) {
            return;
        }
        autoCompleteTextView.post(new Lov(autoCompleteTextView, this));
        if (autoCompleteTextView.getOnFocusChangeListener() == this.A00.A09) {
            autoCompleteTextView.setOnFocusChangeListener(null);
        }
        autoCompleteTextView.setOnTouchListener(null);
        autoCompleteTextView.setOnDismissListener(null);
    }
}
