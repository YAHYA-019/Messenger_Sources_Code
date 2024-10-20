package X;

import android.widget.EditText;

/* loaded from: F4i.class */
public final class F4i {
    public final EditText A00;
    public final FX5 A01;

    public F4i() {
    }

    public F4i(EditText editText) {
        this.A00 = editText;
        FX5 fx5 = new FX5(editText);
        this.A01 = fx5;
        editText.addTextChangedListener(fx5);
        if (DNv.A02 == null) {
            synchronized (DNv.A01) {
                if (DNv.A02 == null) {
                    DNv.A02 = new DNv();
                }
            }
        }
        editText.setEditableFactory(DNv.A02);
    }
}
