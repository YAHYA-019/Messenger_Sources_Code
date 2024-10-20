package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.Callable;

/* renamed from: X.5vr, reason: invalid class name */
/* loaded from: 5vr.class */
public final class C5vr implements Callable {
    public final /* synthetic */ 2C4 A00;
    public final /* synthetic */ String A01;

    public C5vr(2C4 r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        2C4 r0 = this.A00;
        CallerContext callerContext = 2C4.A03;
        return ((C5vs) r0.A02.get()).A00(this.A01);
    }
}
