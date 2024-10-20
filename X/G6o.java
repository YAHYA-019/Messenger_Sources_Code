package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.Callable;

/* loaded from: G6o.class */
public final class G6o implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public G6o(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj4;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        return ((4xJ) this.A01).A00.A07((CallerContext) null, (1Ro) this.A02, (C04033zm) this.A04, this.A03);
    }
}
