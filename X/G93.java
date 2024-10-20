package X;

import kotlin.jvm.functions.Function2;

/* loaded from: G93.class */
public final class G93 extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G93(0DR r302, Function2 function2, int i) {
        super(2, r302);
        this.A03 = i;
        this.A01 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G93(Object obj, 0DR r303, int i) {
        super(2, r303);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G93(Object obj, Object obj2, 0DR r304, int i) {
        super(2, r304);
        this.A03 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        Function2 function2;
        int i3;
        switch (this.A03) {
            case 0:
                obj4 = this.A02;
                i2 = 0;
                G93 g93 = new G93(obj4, r303, i2);
                g93.A01 = obj;
                return g93;
            case 1:
                obj4 = this.A02;
                i2 = 1;
                G93 g932 = new G93(obj4, r303, i2);
                g932.A01 = obj;
                return g932;
            case 2:
                obj4 = this.A02;
                i2 = 2;
                G93 g9322 = new G93(obj4, r303, i2);
                g9322.A01 = obj;
                return g9322;
            case 3:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 3;
                return new G93(obj2, obj3, r303, i);
            case 4:
                function2 = (Function2) this.A01;
                i3 = 4;
                G93 g933 = new G93(r303, function2, i3);
                g933.A02 = obj;
                return g933;
            case 5:
                function2 = (Function2) this.A01;
                i3 = 5;
                G93 g9332 = new G93(r303, function2, i3);
                g9332.A02 = obj;
                return g9332;
            case 6:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 6;
                return new G93(obj2, obj3, r303, i);
            case 7:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 7;
                return new G93(obj2, obj3, r303, i);
            case 8:
                obj4 = this.A02;
                i2 = 8;
                G93 g93222 = new G93(obj4, r303, i2);
                g93222.A01 = obj;
                return g93222;
            case 9:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 9;
                return new G93(obj2, obj3, r303, i);
            case 10:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 10;
                return new G93(obj2, obj3, r303, i);
            case 11:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 11;
                return new G93(obj2, obj3, r303, i);
            case 12:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 12;
                return new G93(obj2, obj3, r303, i);
            case 13:
                obj4 = this.A02;
                i2 = 13;
                G93 g932222 = new G93(obj4, r303, i2);
                g932222.A01 = obj;
                return g932222;
            case 14:
                obj4 = this.A02;
                i2 = 14;
                G93 g9322222 = new G93(obj4, r303, i2);
                g9322222.A01 = obj;
                return g9322222;
            case 15:
                obj4 = this.A02;
                i2 = 15;
                G93 g93222222 = new G93(obj4, r303, i2);
                g93222222.A01 = obj;
                return g93222222;
            case 16:
                obj2 = this.A02;
                obj3 = this.A01;
                i = 16;
                return new G93(obj2, obj3, r303, i);
            default:
                function2 = (Function2) this.A01;
                i3 = 17;
                G93 g93322 = new G93(r303, function2, i3);
                g93322.A02 = obj;
                return g93322;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G93.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
