package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;

/* loaded from: AI2.class */
public final class AI2 implements 0zU {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ LifecycleOwner A02;
    public final /* synthetic */ 8DP A03;
    public final /* synthetic */ Function1 A04;
    public final /* synthetic */ boolean A05;

    public AI2(Context context, LifecycleOwner lifecycleOwner, 8DP r304, Function1 function1, long j, boolean z) {
        this.A03 = r304;
        this.A01 = context;
        this.A00 = j;
        this.A02 = lifecycleOwner;
        this.A04 = function1;
        this.A05 = z;
    }

    public /* bridge */ /* synthetic */ Object emit(Object obj, 0DR r303) {
        2Zs r0 = 2aN.A00;
        Object A00 = 2aK.A00(r303, 4ZJ.A00, new AJO(obj, this.A03, this.A01, this.A02, this.A04, null, 0, this.A00, this.A05));
        if (A00 != 0Ds.A02) {
            A00 = 04S.A00;
        }
        return A00;
    }
}
