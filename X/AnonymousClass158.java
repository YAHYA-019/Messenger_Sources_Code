package X;

import android.os.Binder;
import java.util.Arrays;

/* renamed from: X.158, reason: invalid class name */
/* loaded from: 158.class */
public final class AnonymousClass158 {
    public final int A00;
    public final int A01;

    public AnonymousClass158() {
        int callingUid = Binder.getCallingUid();
        this.A00 = callingUid;
        this.A01 = Arrays.hashCode(AnonymousClass001.A1b(Integer.valueOf(callingUid), Binder.getCallingPid()));
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            return obj == this || this.A01 == obj.hashCode();
        }
        return false;
    }

    public int hashCode() {
        return this.A01;
    }
}
