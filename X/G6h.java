package X;

import com.facebook.tigon.nativeservice.authed.NativeAuthedTigonServiceHolder;
import java.util.concurrent.Callable;

/* loaded from: G6h.class */
public final class G6h implements Callable {
    public final int A00;

    public G6h(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        switch (this.A00) {
            case 0:
                NativeAuthedTigonServiceHolder nativeAuthedTigonServiceHolder = NativeAuthedTigonServiceHolder.$redex_init_class;
                i = 115143;
                return 1Bi.A03(i);
            case 1:
                NativeAuthedTigonServiceHolder nativeAuthedTigonServiceHolder2 = NativeAuthedTigonServiceHolder.$redex_init_class;
                i = 66762;
                return 1Bi.A03(i);
            default:
                return null;
        }
    }
}
