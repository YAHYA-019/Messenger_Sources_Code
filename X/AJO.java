package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: AJO.class */
public final class AJO extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJO(Context context, LifecycleOwner lifecycleOwner, 8DP r304, 0DR r305, Function1 function1, long j, boolean z) {
        super(2, r305);
        this.A02 = 2;
        this.A07 = r304;
        this.A04 = context;
        this.A03 = j;
        this.A05 = lifecycleOwner;
        this.A06 = function1;
        this.A08 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, 0DR r307, int i, long j, boolean z) {
        super(2, r307);
        this.A02 = i;
        this.A01 = obj;
        this.A07 = obj2;
        this.A04 = obj3;
        this.A03 = j;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A08 = z;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        Object obj4;
        long j;
        Object obj5;
        Object obj6;
        boolean z;
        int i;
        switch (this.A02) {
            case 0:
                obj3 = this.A07;
                obj2 = this.A01;
                obj4 = this.A04;
                j = this.A03;
                obj5 = this.A05;
                obj6 = this.A06;
                z = this.A08;
                i = 0;
                break;
            case 1:
                obj2 = this.A01;
                obj3 = this.A07;
                obj4 = this.A04;
                j = this.A03;
                obj5 = this.A05;
                obj6 = this.A06;
                z = this.A08;
                i = 1;
                break;
            default:
                AJO ajo = new AJO((Context) this.A04, (LifecycleOwner) this.A05, (8DP) this.A07, r303, (Function1) this.A06, this.A03, this.A08);
                ajo.A01 = obj;
                return ajo;
        }
        return new AJO(obj2, obj3, obj4, obj5, obj6, r303, i, j, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0595, code lost:
    
        if (r317.length() == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x08b9, code lost:
    
        if (r305 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x08c1, code lost:
    
        if (r317 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03b4, code lost:
    
        if (r0 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03a6, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
