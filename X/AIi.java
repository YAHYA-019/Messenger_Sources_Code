package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AIi.class */
public final class AIi extends 0DO implements Function1 {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIi(Object obj, 0DR r303, int i) {
        super(1, r303);
        this.A01 = i;
        this.A02 = obj;
    }

    public final 0DR create(0DR r302) {
        return new AIi(this.A02, r302, this.A01 != 0 ? 1 : 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0DR r0 = (0DR) obj;
        if (this.A01 != 0) {
            return create(r0).invokeSuspend(04S.A00);
        }
        Object obj2 = this.A02;
        if (r0 != null) {
            r0.getContext();
        }
        0Dt.A00(04S.A00);
        return obj2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.A01 == 0) {
            if (this.A00 != 0) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
            return this.A02;
        }
        0Ds r0 = 0Ds.A02;
        if (this.A00 != 0) {
            0Dt.A00(obj);
        } else {
            0Dt.A00(obj);
            Function1 function1 = (Function1) this.A02;
            this.A00 = 1;
            obj = function1.invoke(this);
            if (obj == r0) {
                return r0;
            }
        }
        return new 8rQ(obj);
    }
}
