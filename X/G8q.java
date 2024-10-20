package X;

import kotlin.jvm.functions.Function2;

/* loaded from: G8q.class */
public final class G8q extends 0DO implements Function2 {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8q(Object obj, Object obj2, Object obj3, 0DR r305, int i, boolean z) {
        super(2, r305);
        this.A01 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = z;
    }

    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        boolean z;
        int i;
        int i2 = this.A01;
        Object obj4 = this.A04;
        switch (i2) {
            case 0:
                obj2 = this.A03;
                obj3 = this.A02;
                z = this.A05;
                i = 0;
                break;
            case 1:
                obj2 = this.A03;
                obj3 = this.A02;
                z = this.A05;
                i = 1;
                break;
            case 2:
                obj2 = this.A03;
                obj3 = this.A02;
                z = this.A05;
                i = 2;
                break;
            default:
                obj3 = this.A02;
                z = this.A05;
                obj2 = this.A03;
                i = 3;
                break;
        }
        return new G8q(obj4, obj2, obj3, r303, i, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
