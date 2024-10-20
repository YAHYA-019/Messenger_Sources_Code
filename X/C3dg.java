package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* renamed from: X.3dg, reason: invalid class name */
/* loaded from: 3dg.class */
public final class C3dg implements 2fS {
    public final /* synthetic */ Callable A00;

    public C3dg(Callable callable) {
        this.A00 = callable;
    }

    public ListenableFuture ADN() {
        return 1Kd.A0A(this.A00.call());
    }

    public String toString() {
        return this.A00.toString();
    }
}
