package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: G6v.class */
public final class G6v implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ F63 A03;
    public final /* synthetic */ EyU A04;
    public final /* synthetic */ Object A05;
    public final /* synthetic */ C23e[] A06;

    public G6v(Context context, F63 f63, EyU eyU, Object obj, C23e[] c23eArr, int i, long j) {
        this.A02 = context;
        this.A04 = eyU;
        this.A05 = obj;
        this.A06 = c23eArr;
        this.A03 = f63;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        return F63.A04.A02(this.A02, this.A03, this.A04, this.A05, this.A06, this.A00, this.A01);
    }
}
