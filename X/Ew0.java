package X;

import android.util.SparseBooleanArray;
import com.facebook.payments.model.FormFieldProperty;

/* loaded from: Ew0.class */
public final class Ew0 {
    public final SparseBooleanArray A00 = new SparseBooleanArray();

    public void A00(FormFieldProperty formFieldProperty, String str, int i) {
        FormFieldProperty formFieldProperty2 = FormFieldProperty.A03;
        boolean z = true;
        SparseBooleanArray sparseBooleanArray = this.A00;
        if (formFieldProperty == formFieldProperty2) {
            z = DKC.A1Y(str);
        }
        sparseBooleanArray.put(i, z);
    }

    public boolean A01() {
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            SparseBooleanArray sparseBooleanArray = this.A00;
            if (i2 >= sparseBooleanArray.size()) {
                z = true;
                break;
            }
            if (!sparseBooleanArray.valueAt(i2)) {
                break;
            }
            i = i2 + 1;
        }
        return z;
    }
}
