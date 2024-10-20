package X;

import kotlin.jvm.functions.Function2;

/* loaded from: AJg.class */
public final class AJg extends 0DO implements Function2 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJg(C9iA c9iA, 0DR r303) {
        super(2, r303);
        this.A06 = 9;
        this.A05 = c9iA;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJg(Object obj, Object obj2, Object obj3, 0DR r305, int i) {
        super(2, r305);
        this.A06 = i;
        this.A05 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJg(Object obj, Object obj2, Object obj3, Object obj4, 0DR r306, int i) {
        super(2, r306);
        this.A06 = i;
        this.A04 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJg(Object obj, Object obj2, Object obj3, Object obj4, 0DR r306, int i, int i2) {
        super(2, r306);
        this.A06 = i;
        this.A02 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, 0DR r307, int i) {
        super(2, r307);
        this.A06 = i;
        this.A05 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = obj5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    public final 0DR create(Object obj, 0DR r303) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int i2;
        Object obj10;
        Object obj11;
        Object obj12;
        int i3;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        int i4;
        switch (this.A06) {
            case 0:
                obj3 = this.A02;
                obj5 = this.A05;
                obj4 = this.A03;
                obj2 = this.A01;
                i = 0;
                AJg aJg = new AJg(obj3, obj5, obj4, obj2, r303, i, 42);
                aJg.A04 = obj;
                return aJg;
            case 1:
                obj8 = this.A04;
                obj7 = this.A01;
                obj9 = this.A02;
                obj6 = this.A03;
                i2 = 1;
                AJg aJg2 = new AJg(obj8, obj7, obj9, obj6, r303, i2);
                aJg2.A05 = obj;
                return aJg2;
            case 2:
                obj5 = this.A05;
                obj3 = this.A02;
                obj2 = this.A01;
                obj4 = this.A03;
                i = 2;
                AJg aJg3 = new AJg(obj3, obj5, obj4, obj2, r303, i, 42);
                aJg3.A04 = obj;
                return aJg3;
            case 3:
                AJg aJg4 = new AJg(this.A05, this.A01, this.A02, r303, 3);
                aJg4.A03 = obj;
                return aJg4;
            case 4:
                obj10 = this.A01;
                obj11 = this.A05;
                obj12 = this.A02;
                i3 = 4;
                return new AJg(obj11, obj10, obj12, r303, i3);
            case 5:
                obj10 = this.A01;
                obj11 = this.A05;
                obj12 = this.A02;
                i3 = 5;
                return new AJg(obj11, obj10, obj12, r303, i3);
            case 6:
                obj3 = this.A02;
                obj5 = this.A05;
                obj4 = this.A03;
                obj2 = this.A01;
                i = 6;
                AJg aJg32 = new AJg(obj3, obj5, obj4, obj2, r303, i, 42);
                aJg32.A04 = obj;
                return aJg32;
            case 7:
                obj2 = this.A01;
                obj3 = this.A02;
                obj5 = this.A05;
                obj4 = this.A03;
                i = 7;
                AJg aJg322 = new AJg(obj3, obj5, obj4, obj2, r303, i, 42);
                aJg322.A04 = obj;
                return aJg322;
            case 8:
                obj13 = this.A05;
                obj16 = this.A03;
                obj15 = this.A02;
                obj17 = this.A04;
                obj14 = this.A01;
                i4 = 8;
                return new AJg(obj13, obj16, obj15, obj17, obj14, r303, i4);
            case 9:
                AJg aJg5 = new AJg((C9iA) this.A05, r303);
                aJg5.A01 = obj;
                return aJg5;
            case 10:
                obj13 = this.A05;
                obj14 = this.A01;
                obj15 = this.A02;
                obj17 = this.A04;
                obj16 = this.A03;
                i4 = 10;
                return new AJg(obj13, obj16, obj15, obj17, obj14, r303, i4);
            case 11:
                obj13 = this.A05;
                obj14 = this.A01;
                obj15 = this.A02;
                obj16 = this.A03;
                obj17 = this.A04;
                i4 = 11;
                return new AJg(obj13, obj16, obj15, obj17, obj14, r303, i4);
            case 12:
                obj6 = this.A03;
                obj7 = this.A01;
                obj8 = this.A04;
                obj9 = this.A02;
                i2 = 12;
                AJg aJg22 = new AJg(obj8, obj7, obj9, obj6, r303, i2);
                aJg22.A05 = obj;
                return aJg22;
            case 13:
                return new AJg(this.A04, this.A01, this.A02, this.A03, r303, 13);
            case 14:
                return new AJg(this.A05, this.A01, this.A02, r303, 14);
            case 15:
                obj2 = this.A01;
                obj3 = this.A02;
                obj4 = this.A03;
                obj5 = this.A05;
                i = 15;
                AJg aJg3222 = new AJg(obj3, obj5, obj4, obj2, r303, i, 42);
                aJg3222.A04 = obj;
                return aJg3222;
            default:
                obj16 = this.A03;
                obj14 = this.A01;
                obj17 = this.A04;
                obj13 = this.A05;
                obj15 = this.A02;
                i4 = 16;
                return new AJg(obj13, obj16, obj15, obj17, obj14, r303, i4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:294|(2:296|(2:298|(6:300|301|302|303|304|305)(2:316|317))(1:318))(5:336|(2:338|(2:340|341))|12|13|14)|319|320|321|322|323|324|325|326|327|328|329|330|(4:332|303|304|305)|115|116) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:342|(2:344|(2:346|(6:348|349|350|351|352|353)(2:358|359))(1:360))(5:378|(2:380|(2:382|383))|12|13|14)|361|362|363|364|365|366|367|368|369|370|371|372|(4:374|351|352|353)|115|116) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x162a, code lost:
    
        if (r303 == r309) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0a60, code lost:
    
        if (r312 != null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0b7f, code lost:
    
        r312 = r303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0b79, code lost:
    
        if (r312 != null) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0b6e, code lost:
    
        if (r303 == null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0b71, code lost:
    
        X.C0ra.A01(r312, r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0a50, code lost:
    
        r303 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0a51, code lost:
    
        r312 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0b6a, code lost:
    
        if (r312 != null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0b5a, code lost:
    
        r303 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0b5b, code lost:
    
        r312 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x10b4, code lost:
    
        if (r306 == null) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x13b9, code lost:
    
        if (X.1Br.A07(r0.A00).AZk(72339915124967908L) == false) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x1737, code lost:
    
        if (X.11T.A0O(r309, X.RfA.A0B) != false) goto L534;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x1a67 A[Catch: all -> 0x1a93, TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:134:0x0924, B:138:0x0934, B:140:0x093a, B:147:0x1a67, B:151:0x1a77, B:153:0x1a7d), top: B:125:0x0639 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0f97  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0fec  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x1b02  */
    /* JADX WARN: Type inference failed for: r0v1052, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1296, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1577, types: [X.JPu] */
    /* JADX WARN: Type inference failed for: r0v1578, types: [java.lang.Object, X.Hd4] */
    /* JADX WARN: Type inference failed for: r0v480, types: [X.0D2, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment, com.facebook.xapp.messaging.wellbeing.safetyinterventionplatform.ui.bottomsheet.SafetyInterventionBottomSheetFragment] */
    /* JADX WARN: Type inference failed for: r0v631, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v670, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v902, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v979, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:451:0x0f65 -> B:443:0x0f93). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 6958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
