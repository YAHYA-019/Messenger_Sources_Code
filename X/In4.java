package X;

import com.google.common.base.Function;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: In4.class */
public final class In4 implements 2fS {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public In4(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final ListenableFuture ADN() {
        switch (this.A00) {
            case 0:
                return 2FP.A01((Function) this.A02, ((5V3) this.A01).A03);
            case 1:
                return 2FP.A00((2eF) this.A02, ((5V3) this.A01).A03, 1JU.A01);
            default:
                return !((AtomicReference) this.A02).compareAndSet(H9p.NOT_RUN, H9p.STARTED) ? 1Kd.A06() : ((2fS) this.A01).ADN();
        }
    }

    public String toString() {
        return 2 - this.A00 != 0 ? super.toString() : this.A01.toString();
    }
}
