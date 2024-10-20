package X;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import com.facebook.acra.constants.ActionId;
import kotlin.jvm.functions.Function2;

/* loaded from: AJj.class */
public final class AJj extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJj(0DR r302, C4G7 c4g7) {
        super(2, r302);
        this.A03 = 10;
        this.A04 = c4g7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJj(PressGestureScopeImpl pressGestureScopeImpl, Kts kts, 0DR r304, C0Bd c0Bd, int i) {
        super(2, r304);
        this.A03 = i;
        switch (i) {
            case 5:
            case 6:
                this.A01 = c0Bd;
                this.A02 = pressGestureScopeImpl;
                this.A04 = kts;
                break;
            default:
                this.A04 = c0Bd;
                this.A01 = pressGestureScopeImpl;
                this.A02 = kts;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJj(Object obj, Object obj2, 0DR r304, int i) {
        super(2, r304);
        this.A03 = i;
        this.A01 = obj;
        this.A04 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJj(Object obj, Object obj2, 0DR r304, int i, int i2) {
        super(2, r304);
        this.A03 = i;
        this.A02 = obj;
        this.A04 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJj(Object obj, Object obj2, Object obj3, 0DR r305, int i) {
        super(2, r305);
        this.A03 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    public static AJj A01(Object obj, Object obj2, 0DR r303, int i) {
        return new AJj(obj, obj2, r303, i, 42);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        int i3;
        AJj aJj;
        Object obj8;
        Object obj9;
        int i4;
        C0Bd c0Bd;
        PressGestureScopeImpl pressGestureScopeImpl;
        Kts kts;
        int i5;
        Object obj10;
        Object obj11;
        Object obj12;
        int i6;
        switch (this.A03) {
            case 0:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 0;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 1:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 1;
                AJj A01 = A01(obj2, obj3, r303, i);
                A01.A01 = obj;
                return A01;
            case 2:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 2;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 3:
                obj8 = this.A04;
                obj9 = this.A01;
                i4 = 3;
                aJj = new AJj(obj9, obj8, r303, i4);
                aJj.A02 = obj;
                return aJj;
            case 4:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 4;
                AJj A012 = A01(obj2, obj3, r303, i);
                A012.A01 = obj;
                return A012;
            case 5:
                c0Bd = (C0Bd) this.A01;
                pressGestureScopeImpl = (PressGestureScopeImpl) this.A02;
                kts = (Kts) this.A04;
                i5 = 5;
                return new AJj(pressGestureScopeImpl, kts, r303, c0Bd, i5);
            case 6:
                c0Bd = (C0Bd) this.A01;
                pressGestureScopeImpl = (PressGestureScopeImpl) this.A02;
                kts = (Kts) this.A04;
                i5 = 6;
                return new AJj(pressGestureScopeImpl, kts, r303, c0Bd, i5);
            case 7:
                c0Bd = (C0Bd) this.A04;
                pressGestureScopeImpl = (PressGestureScopeImpl) this.A01;
                kts = (Kts) this.A02;
                i5 = 7;
                return new AJj(pressGestureScopeImpl, kts, r303, c0Bd, i5);
            case 8:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 8;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 9:
                obj8 = this.A04;
                obj9 = this.A01;
                i4 = 9;
                aJj = new AJj(obj9, obj8, r303, i4);
                aJj.A02 = obj;
                return aJj;
            case 10:
                return new AJj(r303, (C4G7) this.A04);
            case 11:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 11;
                AJj A0122 = A01(obj2, obj3, r303, i);
                A0122.A01 = obj;
                return A0122;
            case 12:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 12;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 13:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 13;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 14:
                obj12 = this.A01;
                obj11 = this.A04;
                obj10 = this.A02;
                i6 = 14;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 15:
                obj6 = this.A01;
                obj7 = this.A04;
                i3 = 15;
                aJj = new AJj(obj6, obj7, r303, i3);
                aJj.A02 = obj;
                return aJj;
            case 16:
                obj11 = this.A04;
                obj10 = this.A02;
                obj12 = this.A01;
                i6 = 16;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 17:
                obj6 = this.A01;
                obj7 = this.A04;
                i3 = 17;
                aJj = new AJj(obj6, obj7, r303, i3);
                aJj.A02 = obj;
                return aJj;
            case 18:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 18;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 19:
                obj12 = this.A01;
                obj11 = this.A04;
                obj10 = this.A02;
                i6 = 19;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 20:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 20;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 21:
                obj12 = this.A01;
                obj11 = this.A04;
                obj10 = this.A02;
                i6 = 21;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 22:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 22;
                AJj A01222 = A01(obj2, obj3, r303, i);
                A01222.A01 = obj;
                return A01222;
            case 23:
                obj6 = this.A01;
                obj7 = this.A04;
                i3 = 23;
                aJj = new AJj(obj6, obj7, r303, i3);
                aJj.A02 = obj;
                return aJj;
            case 24:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 24;
                AJj A012222 = A01(obj2, obj3, r303, i);
                A012222.A01 = obj;
                return A012222;
            case 25:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 25;
                AJj A0122222 = A01(obj2, obj3, r303, i);
                A0122222.A01 = obj;
                return A0122222;
            case 26:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 26;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 27:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 27;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 28:
                obj12 = this.A01;
                obj11 = this.A04;
                obj10 = this.A02;
                i6 = 28;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 29:
                obj11 = this.A04;
                obj12 = this.A01;
                obj10 = this.A02;
                i6 = 29;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 30:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 30;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 31:
                return A01(this.A02, this.A04, r303, 31);
            case 32:
                obj12 = this.A01;
                obj10 = this.A02;
                obj11 = this.A04;
                i6 = 32;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 33:
                obj4 = this.A02;
                obj5 = this.A04;
                i2 = 33;
                return A01(obj4, obj5, r303, i2);
            case 34:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 34;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 35:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 35;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 36:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 36;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 37:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 37;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 38:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 38;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 39:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 39;
                AJj A01222222 = A01(obj2, obj3, r303, i);
                A01222222.A01 = obj;
                return A01222222;
            case 40:
                obj4 = this.A02;
                obj5 = this.A04;
                i2 = 40;
                return A01(obj4, obj5, r303, i2);
            case 41:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 41;
                AJj A012222222 = A01(obj2, obj3, r303, i);
                A012222222.A01 = obj;
                return A012222222;
            case 42:
                return new AJj(this.A02, this.A04, r303, 42, 42);
            case 43:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 43;
                AJj A0122222222 = A01(obj2, obj3, r303, i);
                A0122222222.A01 = obj;
                return A0122222222;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                obj10 = this.A02;
                obj12 = this.A01;
                obj11 = this.A04;
                i6 = 44;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                obj11 = this.A04;
                obj10 = this.A02;
                obj12 = this.A01;
                i6 = 45;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case 46:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 46;
                return new AJj(obj11, obj10, obj12, r303, i6);
            case ActionId.ON_START_END /* 47 */:
                obj2 = this.A02;
                obj3 = this.A04;
                i = 47;
                AJj A01222222222 = A01(obj2, obj3, r303, i);
                A01222222222.A01 = obj;
                return A01222222222;
            case ActionId.QUEUED /* 48 */:
                obj10 = this.A02;
                obj11 = this.A04;
                obj12 = this.A01;
                i6 = 48;
                return new AJj(obj11, obj10, obj12, r303, i6);
            default:
                obj12 = this.A01;
                obj10 = this.A02;
                obj11 = this.A04;
                i6 = 49;
                return new AJj(obj11, obj10, obj12, r303, i6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x20cb, code lost:
    
        if (r303 == r306) goto L670;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x1407  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x2385  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x188e  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x1f6c A[Catch: all -> 0x1f98, TRY_ENTER, TryCatch #0 {all -> 0x1f98, blocks: (B:589:0x1f57, B:592:0x1f61, B:595:0x1f6c, B:596:0x1f72, B:596:0x1f72, B:599:0x1f7d, B:600:0x1f81, B:600:0x1f81, B:603:0x1f36, B:604:0x1f3c, B:605:0x1f42, B:606:0x1f49, B:611:0x1f8a, B:618:0x1f2c), top: B:584:0x1efc }] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x1f87  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x1f8a A[Catch: all -> 0x1f98, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x1f98, blocks: (B:589:0x1f57, B:592:0x1f61, B:595:0x1f6c, B:596:0x1f72, B:596:0x1f72, B:599:0x1f7d, B:600:0x1f81, B:600:0x1f81, B:603:0x1f36, B:604:0x1f3c, B:605:0x1f42, B:606:0x1f49, B:611:0x1f8a, B:618:0x1f2c), top: B:584:0x1efc }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x1ee9  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x2169  */
    /* JADX WARN: Type inference failed for: r0v1029, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1059, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1448, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1497, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1759, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1846, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1932, types: [X.0zV] */
    /* JADX WARN: Type inference failed for: r0v1992, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2043, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v362, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v413, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v455, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v477, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v497, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v562, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v704, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v754, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v924, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:589:0x1f51 -> B:571:0x1f5b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 9365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
