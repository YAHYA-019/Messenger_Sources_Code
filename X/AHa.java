package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: AHa.class */
public final class AHa implements Callable {
    public final Object A00;
    public final /* synthetic */ 9hT A01;

    public AHa(9hT r302, Object obj) {
        this.A01 = r302;
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        9hT r0 = this.A01;
        79Q r02 = r0.A03;
        Object obj = this.A00;
        ListenableFuture D1r = r02.D1r(obj);
        1Kd.A0D(r0.A02, new ABk(r0, obj), D1r);
        return D1r;
    }
}
