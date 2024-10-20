package X;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: Lea.class */
public final class Lea implements MGR {
    public final /* synthetic */ K8S A00;

    public Lea(K8S k8s) {
        this.A00 = k8s;
    }

    @Override // X.MGR
    public void Bvz(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.A0V;
        if (editText == null || i != 2) {
            return;
        }
        editText.post(new Lot(editText, this));
        if (editText.getOnFocusChangeListener() == this.A00.A03) {
            editText.setOnFocusChangeListener(null);
        }
    }
}
