package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AJM.class */
public final class AJM extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 0;
    public final long A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJM(AbstractC2933JdM abstractC2933JdM, Aau aau, MMs mMs, 0DR r305, long j) {
        super(2, r305);
        this.A06 = aau;
        this.A04 = j;
        this.A05 = mMs;
        this.A07 = abstractC2933JdM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJM(Context context, LifecycleOwner lifecycleOwner, 8DP r304, 0DR r305, Function1 function1, long j, boolean z) {
        super(2, r305);
        this.A07 = r304;
        this.A05 = context;
        this.A04 = j;
        this.A06 = lifecycleOwner;
        this.A01 = function1;
        this.A02 = z;
    }

    public final 0DR create(Object obj, 0DR r303) {
        if (this.A03 != 0) {
            8DP r0 = (8DP) this.A07;
            return new AJM((Context) this.A05, (LifecycleOwner) this.A06, r0, r303, (Function1) this.A01, this.A04, this.A02);
        }
        Aau aau = (Aau) this.A06;
        long j = this.A04;
        AJM ajm = new AJM((AbstractC2933JdM) this.A07, aau, (MMs) this.A05, r303, j);
        ajm.A01 = obj;
        return ajm;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Type inference failed for: r0v103, types: [X.2a2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJM.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
