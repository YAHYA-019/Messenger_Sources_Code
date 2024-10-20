package X;

import android.view.Choreographer;
import kotlin.jvm.functions.Function2;

/* loaded from: M01.class */
public final class M01 extends 0DO implements Function2 {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M01(int i, 0DR r303) {
        super(2, r303);
        this.A00 = i;
    }

    public final 0DR create(Object obj, 0DR r303) {
        int i;
        switch (this.A00) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        return new M01(i, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (3 - this.A00 != 0) {
            return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
        }
        0DR r0 = (0DR) obj2;
        if (r0 != null) {
            r0.getContext();
        }
        04S r02 = 04S.A00;
        0Dt.A00(r02);
        return r02;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A00) {
            case 2:
            case 3:
                0Dt.A00(obj);
                return 04S.A00;
            default:
                0Dt.A00(obj);
                return Choreographer.getInstance();
        }
    }
}
