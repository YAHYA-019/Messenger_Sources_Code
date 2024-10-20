package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.Callable;

/* loaded from: G6j.class */
public final class G6j implements Callable {
    public final /* synthetic */ 2C4 A00;
    public final /* synthetic */ String A01;

    public G6j(2C4 r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        2C4 r0 = this.A00;
        CallerContext callerContext = 2C4.A03;
        return ((F7Q) r0.A00.get()).A00(this.A01);
    }
}
