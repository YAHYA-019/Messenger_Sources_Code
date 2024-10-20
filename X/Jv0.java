package X;

import android.os.Looper;
import java.util.HashSet;

/* loaded from: Jv0.class */
public final class Jv0 extends 1LV {
    public final HashSet A00;

    public Jv0(String[] strArr) {
        super(strArr);
        this.A00 = AnonymousClass001.A0v();
    }

    public void A02(JSi jSi) {
        Looper myLooper;
        if (!this.A00.add(Long.valueOf(JR0.A0Q())) || (myLooper = Looper.myLooper()) == null) {
            return;
        }
        L8o.A00().A03(myLooper);
    }
}
