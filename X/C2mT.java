package X;

import com.facebook.privacy.zone.api.ZonedValue;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Present;
import java.util.Stack;

/* renamed from: X.2mT, reason: invalid class name */
/* loaded from: 2mT.class */
public final class C2mT {
    public 2wE A00;
    public ZonedValue A01;
    public final Object A05 = new Object();
    public 1ZW[] A03 = null;
    public Stack A02 = new Stack();
    public final C00i A04 = new 1BQ(66333);

    public Optional A00() {
        Optional fromNullable;
        synchronized (this.A05) {
            2wE r0 = this.A00;
            if (r0 != null) {
                new Present(r0);
            } else {
                fromNullable = this.A02.isEmpty() ? Absent.INSTANCE : Optional.fromNullable((2wE) this.A02.peek());
            }
        }
        return fromNullable;
    }

    public Optional A01() {
        Optional fromNullable;
        synchronized (this.A05) {
            fromNullable = this.A02.isEmpty() ? Absent.INSTANCE : Optional.fromNullable((2wE) this.A02.peek());
        }
        return fromNullable;
    }

    public String A02() {
        String str;
        Optional A00 = A00();
        return (!A00.isPresent() || (str = ((2wE) A00.get()).A02) == null) ? "unknown" : str;
    }
}
