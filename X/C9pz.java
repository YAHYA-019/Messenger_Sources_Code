package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9pz, reason: invalid class name */
/* loaded from: 9pz.class */
public final class C9pz implements View.OnFocusChangeListener {
    public final List A00 = AnonymousClass001.A0s();

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z);
        }
    }
}
