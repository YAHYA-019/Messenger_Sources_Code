package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.82s, reason: invalid class name */
/* loaded from: 82s.class */
public final class C82s extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82s(0DR r302, C15t c15t) {
        super(2, r302);
        this.A02 = 2;
        this.A03 = c15t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82s(Object obj, Object obj2, 0DR r304, int i) {
        super(2, r304);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        int i;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 0;
                break;
            case 1:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 1;
                break;
            case 2:
                C82s c82s = new C82s(r303, (C15t) this.A03);
                c82s.A01 = obj;
                return c82s;
            case 3:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 3;
                break;
            case 4:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 4;
                break;
            case 5:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 5;
                break;
            case 6:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 6;
                break;
            case 7:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 7;
                break;
            default:
                return new C82s(this.A01, this.A03, r303, 8);
        }
        return new C82s(obj2, obj3, r303, i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x084c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
