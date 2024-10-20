package X;

import com.facebook.tigon.TigonErrorException;

/* renamed from: X.AjJ, reason: case insensitive filesystem */
/* loaded from: AjJ.class */
public final class C1496AjJ extends AbstractC11854xp {
    @Override // X.AbstractC11854xp
    public boolean A06() {
        if (CN0.A04.contains(Integer.valueOf(CN0.A02))) {
            return true;
        }
        Exception exc = CN0.A03;
        if (exc == null) {
            return false;
        }
        while (true) {
            Throwable cause = exc.getCause();
            if (cause == null || exc == cause) {
                return false;
            }
            if (cause instanceof TigonErrorException) {
                return true;
            }
            exc = cause;
        }
    }
}
