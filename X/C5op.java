package X;

import com.facebook.graphservice.interfaces.GraphQLService;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5op, reason: invalid class name */
/* loaded from: 5op.class */
public final class C5op implements 1K9 {
    public final C3s4 A00;
    public final 1K9 A01;
    public final Set A02;
    public final Executor A05;
    public final String A04 = C04I.A00().toString();
    public final AtomicReference A03 = new AtomicReference(null);

    public C5op(C9dz c9dz, C3s4 c3s4, 1K9 r304, Executor executor) {
        this.A00 = c3s4;
        this.A05 = executor;
        this.A01 = r304;
        HashSet hashSet = new HashSet();
        this.A02 = hashSet;
        if (c9dz != null) {
            hashSet.add(c9dz);
        }
    }

    public void A00() {
        GraphQLService.Token token = (GraphQLService.Token) this.A03.getAndSet(null);
        if (token != null) {
            token.cancel();
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj && obj != null && getClass() == obj.getClass()) {
            z = Objects.equal(this.A04, ((C5op) obj).A04);
        }
        return z;
    }

    public void finalize() {
        int A03 = 0FI.A03(-244040907);
        A00();
        0FI.A09(-323222363, A03);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04});
    }

    public void onFailure(Throwable th) {
        this.A05.execute(new G2B(this, th));
    }

    public void onSuccess(Object obj) {
        this.A05.execute(new G2A(this, obj));
    }
}
