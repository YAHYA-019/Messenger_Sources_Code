package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: AJr.class */
public final class AJr extends 0DO implements C0Bd {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJr(UserFlowLogger userFlowLogger, 0DR r303) {
        super(3, r303);
        this.A04 = 2;
        this.A01 = userFlowLogger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AJr(Object obj, 0DR r303, int i) {
        super(3, r303);
        this.A04 = i;
        this.A03 = obj;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        AJr aJr;
        0DR r0 = (0DR) obj3;
        switch (this.A04) {
            case 0:
                obj4 = this.A03;
                i = 0;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
            case 1:
                obj4 = this.A03;
                i = 1;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
            case 2:
                aJr = new AJr((UserFlowLogger) this.A01, r0);
                aJr.A02 = obj;
                aJr.A03 = obj2;
                break;
            case 3:
                obj4 = this.A03;
                i = 3;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
            case 4:
                obj4 = this.A03;
                i = 4;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
            case 5:
                obj4 = this.A03;
                i = 5;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
            case 6:
                obj4 = this.A03;
                i = 6;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
            case 7:
                obj4 = this.A03;
                i = 7;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
            default:
                obj4 = this.A03;
                i = 8;
                aJr = new AJr(obj4, r0, i);
                aJr.A01 = obj;
                aJr.A02 = obj2;
                break;
        }
        return aJr.invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x05df, code lost:
    
        if (r0 == X.C1wj.A03) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06b9  */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v167, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v428, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
