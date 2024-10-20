package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: EC4.class */
public final class EC4 extends EC5 {
    public View A00;

    public void A0s() {
        ClickableSpan[] A0r;
        if (A0r().length != 1 || (A0r = A0r()) == null || A0r.length <= 0 || A0r[0] == null) {
            return;
        }
        ClickableSpan[] A0r2 = A0r();
        ((A0r2 == null || A0r2.length <= 0) ? null : A0r2[0]).onClick(this.A00);
    }
}
