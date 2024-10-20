package X;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: Lec.class */
public final class Lec implements MGR {
    public final /* synthetic */ K8R A00;

    public Lec(K8R k8r) {
        this.A00 = k8r;
    }

    @Override // X.MGR
    public void Bvz(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.A0V;
        if (editText == null || i != 1) {
            return;
        }
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.post(new Low(editText, this));
    }
}
