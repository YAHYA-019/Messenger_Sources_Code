package X;

import java.util.concurrent.Callable;

/* renamed from: X.356, reason: invalid class name */
/* loaded from: 356.class */
public final class AnonymousClass356 extends 1QH implements C3mO {
    public final String A00;

    public AnonymousClass356(String str, Callable callable) {
        super(callable);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass356)) {
            return false;
        }
        return 1JF.A0C(this.A00, ((AnonymousClass356) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
