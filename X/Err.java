package X;

import com.facebook.http.protocol.ApiErrorResult;

/* loaded from: Err.class */
public final class Err {
    public final C00i A00 = AbH.A0S();

    public void A00(Exception exc) {
        if (!(exc instanceof 2L0)) {
            if (!(exc.getCause() instanceof 2L0)) {
                return;
            } else {
                exc = exc.getCause();
            }
        }
        ApiErrorResult A00 = ((2L0) exc).A00();
        if (A00 == null || A00.A00() != 190) {
            return;
        }
        AbK.A1O(1BL.A0V(this.A00), 5Qw.A00);
    }
}
