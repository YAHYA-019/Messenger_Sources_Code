package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.AndroidRuntimeException;

/* loaded from: Erg.class */
public final class Erg {
    public final 1Br A00 = 7zM.A0M();

    public final void A00(Context context) {
        Intent A0A = 4YU.A0A("android.intent.action.MAIN");
        A0A.addCategory("android.intent.category.HOME");
        A0A.setFlags(268435456);
        try {
            ((C08f) ((08O) 1Br.A0B(this.A00)).A06.get()).A0A(context, A0A);
        } catch (RuntimeException e) {
            if (!(e instanceof AndroidRuntimeException) && !(e instanceof ActivityNotFoundException)) {
                throw e;
            }
        }
    }
}
