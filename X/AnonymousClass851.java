package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import kotlin.jvm.functions.Function2;

/* renamed from: X.851, reason: invalid class name */
/* loaded from: 851.class */
public final class AnonymousClass851 extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass851(JOe jOe, LiveLocationSession liveLocationSession, ITQ itq, Boolean bool, 0DR r306, int i) {
        super(2, r306);
        this.A05 = i;
        if (23 - i != 0) {
            this.A03 = bool;
            this.A02 = jOe;
            this.A04 = itq;
            this.A01 = liveLocationSession;
        } else {
            this.A01 = bool;
            this.A02 = jOe;
            this.A04 = itq;
            this.A03 = liveLocationSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass851(Object obj, 0DR r303, int i) {
        super(2, r303);
        this.A05 = i;
        this.A04 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass851(Object obj, 0DR r303, Object obj2, Object obj3, int i) {
        super(2, r303);
        this.A05 = i;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass851(Object obj, Object obj2, 0DR r304, int i) {
        super(2, r304);
        this.A05 = i;
        this.A01 = obj;
        this.A04 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass851(Object obj, Object obj2, Object obj3, 0DR r305, int i) {
        super(2, r305);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass851(Object obj, Object obj2, Object obj3, Object obj4, 0DR r306, int i) {
        super(2, r306);
        this.A05 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i2;
        Object obj9;
        Object obj10;
        Object obj11;
        int i3;
        Object obj12;
        Object obj13;
        Object obj14;
        int i4;
        Object obj15;
        Object obj16;
        Object obj17;
        int i5;
        AnonymousClass851 anonymousClass851;
        Boolean bool;
        JOe jOe;
        ITQ itq;
        LiveLocationSession liveLocationSession;
        int i6;
        Object obj18;
        int i7;
        AnonymousClass851 anonymousClass8512;
        Object obj19;
        Object obj20;
        int i8;
        Object obj21;
        Object obj22;
        Object obj23;
        int i9;
        switch (this.A05) {
            case 0:
                obj19 = this.A01;
                obj20 = this.A04;
                i8 = 0;
                anonymousClass8512 = new AnonymousClass851(obj19, obj20, r303, i8);
                anonymousClass8512.A02 = obj;
                return anonymousClass8512;
            case 1:
                obj2 = this.A04;
                obj3 = this.A01;
                obj4 = this.A02;
                i = 1;
                anonymousClass851 = new AnonymousClass851(obj4, r303, obj2, obj3, i);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 2:
                obj19 = this.A01;
                obj20 = this.A04;
                i8 = 2;
                anonymousClass8512 = new AnonymousClass851(obj19, obj20, r303, i8);
                anonymousClass8512.A02 = obj;
                return anonymousClass8512;
            case 3:
                obj18 = this.A04;
                i7 = 3;
                AnonymousClass851 anonymousClass8513 = new AnonymousClass851(obj18, r303, i7);
                anonymousClass8513.A01 = obj;
                return anonymousClass8513;
            case 4:
                obj21 = this.A01;
                obj22 = this.A02;
                obj23 = this.A03;
                i9 = 4;
                AnonymousClass851 anonymousClass8514 = new AnonymousClass851(obj23, obj22, obj21, r303, i9);
                anonymousClass8514.A04 = obj;
                return anonymousClass8514;
            case 5:
                obj7 = this.A03;
                obj6 = this.A02;
                obj8 = this.A04;
                obj5 = this.A01;
                i2 = 5;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 6:
                obj8 = this.A04;
                obj7 = this.A03;
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 6;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 7:
                obj7 = this.A03;
                obj8 = this.A04;
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 7;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 8:
                obj8 = this.A04;
                obj7 = this.A03;
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 8;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 9:
                obj15 = this.A01;
                obj16 = this.A04;
                obj17 = this.A02;
                i5 = 9;
                return new AnonymousClass851(obj17, r303, obj16, obj15, i5);
            case 10:
                obj7 = this.A03;
                obj8 = this.A04;
                obj6 = this.A02;
                obj5 = this.A01;
                i2 = 10;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 11:
                obj8 = this.A04;
                obj5 = this.A01;
                obj7 = this.A03;
                obj6 = this.A02;
                i2 = 11;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 12:
                obj9 = this.A04;
                obj10 = this.A02;
                obj11 = this.A01;
                i3 = 12;
                anonymousClass851 = new AnonymousClass851(obj10, r303, obj9, obj11, i3);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 13:
                return new AnonymousClass851(this.A01, this.A04, r303, 13);
            case 14:
                anonymousClass851 = new AnonymousClass851(this.A02, r303, this.A04, this.A01, 14);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 15:
                obj9 = this.A04;
                obj10 = this.A02;
                obj11 = this.A01;
                i3 = 15;
                anonymousClass851 = new AnonymousClass851(obj10, r303, obj9, obj11, i3);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 16:
                obj8 = this.A04;
                obj5 = this.A01;
                obj7 = this.A03;
                obj6 = this.A02;
                i2 = 16;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 17:
                obj8 = this.A04;
                obj5 = this.A01;
                obj6 = this.A02;
                obj7 = this.A03;
                i2 = 17;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 18:
                obj8 = this.A04;
                obj5 = this.A01;
                obj6 = this.A02;
                obj7 = this.A03;
                i2 = 18;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 19:
                obj8 = this.A04;
                obj5 = this.A01;
                obj6 = this.A02;
                obj7 = this.A03;
                i2 = 19;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 20:
                anonymousClass8512 = new AnonymousClass851(this.A01, this.A04, r303, 20);
                anonymousClass8512.A02 = obj;
                return anonymousClass8512;
            case 21:
                obj18 = this.A04;
                i7 = 21;
                AnonymousClass851 anonymousClass85132 = new AnonymousClass851(obj18, r303, i7);
                anonymousClass85132.A01 = obj;
                return anonymousClass85132;
            case 22:
                obj9 = this.A04;
                obj10 = this.A02;
                obj11 = this.A01;
                i3 = 22;
                anonymousClass851 = new AnonymousClass851(obj10, r303, obj9, obj11, i3);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 23:
                bool = (Boolean) this.A01;
                jOe = (JOe) this.A02;
                itq = (ITQ) this.A04;
                liveLocationSession = (LiveLocationSession) this.A03;
                i6 = 23;
                return new AnonymousClass851(jOe, liveLocationSession, itq, bool, r303, i6);
            case 24:
                bool = (Boolean) this.A03;
                jOe = (JOe) this.A02;
                itq = (ITQ) this.A04;
                liveLocationSession = (LiveLocationSession) this.A01;
                i6 = 24;
                return new AnonymousClass851(jOe, liveLocationSession, itq, bool, r303, i6);
            case 25:
                obj12 = this.A02;
                obj13 = this.A01;
                obj14 = this.A04;
                i4 = 25;
                anonymousClass851 = new AnonymousClass851(obj12, r303, obj14, obj13, i4);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 26:
                obj5 = this.A01;
                obj6 = this.A02;
                obj8 = this.A04;
                obj7 = this.A03;
                i2 = 26;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 27:
                obj15 = this.A01;
                obj16 = this.A04;
                obj17 = this.A02;
                i5 = 27;
                return new AnonymousClass851(obj17, r303, obj16, obj15, i5);
            case 28:
                obj9 = this.A04;
                obj10 = this.A02;
                obj11 = this.A01;
                i3 = 28;
                anonymousClass851 = new AnonymousClass851(obj10, r303, obj9, obj11, i3);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 29:
                obj8 = this.A04;
                obj5 = this.A01;
                obj7 = this.A03;
                obj6 = this.A02;
                i2 = 29;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 30:
                obj8 = this.A04;
                obj5 = this.A01;
                obj6 = this.A02;
                obj7 = this.A03;
                i2 = 30;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 31:
                obj5 = this.A01;
                obj8 = this.A04;
                obj6 = this.A02;
                obj7 = this.A03;
                i2 = 31;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 32:
                obj10 = this.A02;
                obj9 = this.A04;
                obj11 = this.A01;
                i3 = 32;
                anonymousClass851 = new AnonymousClass851(obj10, r303, obj9, obj11, i3);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 33:
                obj10 = this.A02;
                obj9 = this.A04;
                obj11 = this.A01;
                i3 = 33;
                anonymousClass851 = new AnonymousClass851(obj10, r303, obj9, obj11, i3);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 34:
                obj8 = this.A04;
                obj7 = this.A03;
                obj5 = this.A01;
                obj6 = this.A02;
                i2 = 34;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 35:
                obj8 = this.A04;
                obj5 = this.A01;
                obj7 = this.A03;
                obj6 = this.A02;
                i2 = 35;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 36:
                return new AnonymousClass851(this.A02, r303, this.A04, this.A01, 36);
            case 37:
                obj8 = this.A04;
                obj5 = this.A01;
                obj6 = this.A02;
                obj7 = this.A03;
                i2 = 37;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 38:
                obj12 = this.A02;
                obj13 = this.A01;
                obj14 = this.A04;
                i4 = 38;
                anonymousClass851 = new AnonymousClass851(obj12, r303, obj14, obj13, i4);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 39:
                obj9 = this.A04;
                obj10 = this.A02;
                obj11 = this.A01;
                i3 = 39;
                anonymousClass851 = new AnonymousClass851(obj10, r303, obj9, obj11, i3);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            case 40:
                return new AnonymousClass851(this.A01, this.A04, r303, 40);
            case 41:
                obj8 = this.A04;
                obj5 = this.A01;
                obj7 = this.A03;
                obj6 = this.A02;
                i2 = 41;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 42:
                obj5 = this.A01;
                obj6 = this.A02;
                obj7 = this.A03;
                obj8 = this.A04;
                i2 = 42;
                return new AnonymousClass851(obj8, obj7, obj5, obj6, r303, i2);
            case 43:
                obj2 = this.A04;
                obj3 = this.A01;
                obj4 = this.A02;
                i = 43;
                anonymousClass851 = new AnonymousClass851(obj4, r303, obj2, obj3, i);
                anonymousClass851.A03 = obj;
                return anonymousClass851;
            default:
                obj23 = this.A03;
                obj22 = this.A02;
                obj21 = this.A01;
                i9 = 44;
                AnonymousClass851 anonymousClass85142 = new AnonymousClass851(obj23, obj22, obj21, r303, i9);
                anonymousClass85142.A04 = obj;
                return anonymousClass85142;
        }
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1012:0x33a1  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x33ce  */
    /* JADX WARN: Type inference failed for: r0v1146, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1274, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1418, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1484, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1588, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v159, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2030, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2076, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2168, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2285, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2397, types: [com.facebook.msgorcapinnedmessages.mca.MailboxMSGOrcaPinnedMessages$LoadViewDataOptions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2431, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2480, types: [X.6yx, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2523, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2552, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2658, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2836, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2969, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3000, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3069, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3193, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3271, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v356, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v404, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v576, types: [X.3Qp] */
    /* JADX WARN: Type inference failed for: r0v673, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v744, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v767, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v807, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v826, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v847, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v249, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r304v252 */
    /* JADX WARN: Type inference failed for: r314v38 */
    /* JADX WARN: Type inference failed for: r314v39 */
    /* JADX WARN: Type inference failed for: r314v4 */
    /* JADX WARN: Type inference failed for: r314v40 */
    /* JADX WARN: Type inference failed for: r314v5 */
    /* JADX WARN: Type inference failed for: r314v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r314v7 */
    /* JADX WARN: Type inference failed for: r314v9 */
    /* JADX WARN: Type inference failed for: r341v0, types: [X.11N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r344v12, types: [X.9l2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x080f -> B:138:0x07a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:488:0x1dc5 -> B:478:0x1dea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:791:0x2e65 -> B:782:0x2de9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:840:0x2f7a -> B:782:0x2de9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:844:0x2f89 -> B:782:0x2de9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:854:0x2fbb -> B:782:0x2de9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:866:0x2fee -> B:782:0x2de9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:955:0x3250 -> B:942:0x31d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:958:0x3256 -> B:942:0x31d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:986:0x33cb -> B:981:0x334d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:988:0x3426 -> B:981:0x334d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 13400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass851.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
