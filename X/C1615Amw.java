package X;

import com.facebook.graphql.enums.GraphQLNegativeFeedbackActionType;

/* renamed from: X.Amw, reason: case insensitive filesystem */
/* loaded from: Amw.class */
public final class C1615Amw extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C1615Amw(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    public C1615Amw(C8U c8u, CNL cnl, 1K9 r304, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A03 = c8u;
            this.A02 = cnl;
        } else {
            this.A02 = cnl;
            this.A03 = c8u;
        }
        this.A01 = r304;
    }

    public static BLo A00(2JY r301) {
        return CPK.A01((GraphQLNegativeFeedbackActionType) r301.A0g(GraphQLNegativeFeedbackActionType.A0N, -501377101));
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x05ff, code lost:
    
        if (r326 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x062b, code lost:
    
        if (r328 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0d12, code lost:
    
        if (r304 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0d3d, code lost:
    
        if (r328 == null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0d7b, code lost:
    
        if (r304 == null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0da6, code lost:
    
        if (r328 == null) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x12f2, code lost:
    
        if (r0 != null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x12e6, code lost:
    
        if (r0 != null) goto L351;
     */
    /* JADX WARN: Removed duplicated region for block: B:428:0x108d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1615Amw.A02(java.lang.Object):void");
    }

    public void A03(Throwable th) {
        switch (this.A00) {
            case 1:
                CfG.A01(this.A02);
                return;
            case 2:
            case 3:
                11T.A0F(th, 0);
                CNL cnl = (CNL) this.A02;
                if (cnl != null) {
                    synchronized (cnl) {
                        if (CNL.A01(cnl)) {
                            cnl.A00.markerPoint(320997463, "GQL_REQUEST_FAILED");
                            CNL.A00(cnl, (short) 3);
                        }
                        break;
                    }
                }
                break;
            case 4:
                11T.A0F(th, 0);
                break;
            case 5:
            default:
                return;
            case 6:
                11T.A0F(th, 0);
                Cc9 cc9 = (Cc9) this.A03;
                C4J c4j = (C4J) this.A01;
                Cc9.A01(c4j, cc9, th.getMessage());
                cc9.A00 = null;
                cc9.A08.A00(c4j, th, "onLoadFailed", "MessageRequestsLoader");
                2TV r0 = cc9.A02;
                if (r0 == null) {
                    11T.A0L("callback");
                    throw 0Q8.createAndThrow();
                }
                r0.C47(c4j, th);
                cc9.A07.A00(c4j, "MessageRequestsLoader", th, AnonymousClass001.A0u());
                return;
        }
        ((1K9) this.A01).onFailure(th);
    }
}
