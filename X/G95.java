package X;

import kotlin.jvm.functions.Function2;

/* loaded from: G95.class */
public final class G95 extends 0DO implements Function2 {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G95(Object obj, 0DR r303, int i) {
        super(2, r303);
        this.A01 = i;
        this.A02 = obj;
    }

    public static Object A01(Object obj, G95 g95) {
        0Dt.A00(obj);
        return g95.A02;
    }

    public static Object A02(Object obj, G95 g95, C11i c11i, int i) {
        G7e g7e = new G7e(obj, i);
        g95.A00 = 1;
        return c11i.collect(g7e, g95);
    }

    public static Object A03(Object obj, G95 g95, C11i c11i, int i) {
        G7f g7f = new G7f(obj, i);
        g95.A00 = 1;
        return c11i.collect(g7f, g95);
    }

    public static void A04(Object obj, 2aI r302, int i) {
        2aK.A03((Integer) null, (0DE) null, new G95(obj, null, i), r302, 3);
    }

    public final 0DR create(Object obj, 0DR r303) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case 12:
                i = 12;
                break;
            case 13:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case 15:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case 18:
                i = 18;
                break;
            case 19:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            case 29:
                i = 29;
                break;
            case 30:
                i = 30;
                break;
            case 31:
                i = 31;
                break;
            case 32:
                i = 32;
                break;
            case 33:
                i = 33;
                break;
            case 34:
                i = 34;
                break;
            case 35:
                i = 35;
                break;
            case 36:
                i = 36;
                break;
            case 37:
                i = 37;
                break;
            case 38:
                i = 38;
                break;
            case 39:
                i = 39;
                break;
            case 40:
                i = 40;
                break;
            case 41:
                i = 41;
                break;
            default:
                i = 42;
                break;
        }
        return new G95(obj2, r303, i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0b9d  */
    /* JADX WARN: Type inference failed for: r0v862, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v863, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v876, types: [X.Ffr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G95.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
