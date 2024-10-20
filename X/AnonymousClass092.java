package X;

import java.util.NoSuchElementException;

/* renamed from: X.092, reason: invalid class name */
/* loaded from: 092.class */
public final class AnonymousClass092 {
    public final Object A00;

    public AnonymousClass092() {
        this.A00 = null;
    }

    public AnonymousClass092(Object obj) {
        this.A00 = obj;
    }

    public Object A00() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public String toString() {
        Object obj = this.A00;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
