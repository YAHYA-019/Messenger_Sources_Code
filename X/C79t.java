package X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.79t, reason: invalid class name */
/* loaded from: 79t.class */
public final class C79t implements TextWatcher {
    public final 6RU A00;

    public C79t(6RU r302) {
        this.A00 = r302;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        7FI.A02(this.A00, 7CM.A02);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        7FI.A02(this.A00, 7Ae.A02);
    }
}
