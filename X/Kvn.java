package X;

import com.facebook.breakpad.BreakpadManager;
import java.util.Arrays;

/* loaded from: Kvn.class */
public final class Kvn {
    public static final void A00(C00m c00m) {
        try {
            c00m.invoke();
        } catch (RuntimeException e) {
            String A10 = GOo.A10("exception: %s\ntracking: %s", Arrays.copyOf(DKG.A1b(KyG.A01, e.toString()), 2));
            BreakpadManager.setCustomData("ConnectivityManagerProxy", A10, new Object[0]);
            0fH.A0k("ConnectivityManagerProxy", A10);
            throw e;
        }
    }
}
