package X;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3zR, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zR.class */
public final class C03903zR implements TextWatcher, 2wL {
    public final Set A01 = 1Bi.A06(187);
    public final Set A02 = 1Bi.A06(269);
    public final C0dp A00 = (C0dp) 1Bi.A03(99390);

    public void CQz(Activity activity, MotionEvent motionEvent) {
        long now = this.A00.now();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((2CV) it.next()).CQy(now);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it = this.A02.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0Q("onBeforeTextChanged");
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        long now = this.A00.now();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((2CV) it.next()).CPw(now);
        }
    }
}
