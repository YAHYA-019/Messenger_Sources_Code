package X;

import com.facebook.acra.constants.ActionId;
import kotlin.jvm.functions.Function2;

/* loaded from: AJU.class */
public final class AJU extends 0DO implements Function2 {
    public int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJU(Object obj, 0DR r303, int i) {
        super(2, r303);
        this.A01 = i;
        this.A02 = obj;
    }

    public static Object A01(Object obj, AJU aju) {
        0Dt.A00(obj);
        return aju.A02;
    }

    public static void A02(Object obj, 2aI r302, int i) {
        2aK.A03((Integer) null, (0DE) null, new AJU(obj, null, i), r302, 3);
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
        return new AJU(obj2, r303, i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1269 A[Catch: TimeoutException -> 0x12a3, InterruptedException -> 0x12b0, ExecutionException -> 0x12bd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {InterruptedException -> 0x12b0, ExecutionException -> 0x12bd, TimeoutException -> 0x12a3, blocks: (B:251:0x0a01, B:252:0x0a07, B:254:0x0a10, B:255:0x0a17, B:256:0x0a1e, B:258:0x0a26, B:259:0x0a2b, B:260:0x0a32, B:262:0x0a53, B:264:0x0a71, B:265:0x0a78, B:267:0x0a81, B:269:0x0a8d, B:271:0x0a96, B:272:0x0a9f, B:275:0x0aab, B:276:0x0ab2, B:280:0x0ad3, B:284:0x0ae6, B:289:0x1269, B:290:0x126f, B:291:0x1276, B:292:0x127d, B:293:0x1284, B:295:0x1290, B:297:0x129b), top: B:250:0x0a01 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x10ea  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x1104  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0f35  */
    /* JADX WARN: Type inference failed for: r0v680, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:471:0x1101 -> B:466:0x10c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJU.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
