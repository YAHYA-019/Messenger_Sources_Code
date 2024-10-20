package X;

import com.facebook.acra.constants.ActionId;
import kotlin.jvm.functions.Function2;

/* loaded from: AJd.class */
public final class AJd extends 0DO implements Function2 {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJd(Object obj, 0DR r303, int i) {
        super(2, r303);
        this.A01 = i;
        this.A02 = obj;
    }

    public static Object A01(Object obj, AJd aJd) {
        0Dt.A00(obj);
        return aJd.A02;
    }

    public static Object A02(Object obj, AJd aJd, C11i c11i, int i, int i2) {
        AI7 ai7 = new AI7(obj, i);
        aJd.A00 = i2;
        return c11i.collect(ai7, aJd);
    }

    public static void A03(Object obj, 2aI r302, int i) {
        2aK.A03((Integer) null, (0DE) null, new AJd(obj, null, i), r302, 3);
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
            case 42:
                i = 42;
                break;
            case 43:
                i = 43;
                break;
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                i = 44;
                break;
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                i = 45;
                break;
            case 46:
                i = 46;
                break;
            case ActionId.ON_START_END /* 47 */:
                i = 47;
                break;
            case ActionId.QUEUED /* 48 */:
                i = 48;
                break;
            default:
                i = 49;
                break;
        }
        return new AJd(obj2, r303, i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (46 - this.A01 == 0) {
            obj = null;
        }
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x0d98, code lost:
    
        if (((X.5Qb) r302).A00 == 0) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x1039, code lost:
    
        if (r0.mResultSet.getBoolean(0, 0) != false) goto L382;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0c97  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x1019  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0d29  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 5488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
