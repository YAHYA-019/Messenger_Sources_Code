package X;

import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesException;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;
import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonErrorException;

/* renamed from: X.4a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4a1.class */
public abstract class AbstractC04134a1 implements GraphQLService.DataCallbacks {
    public int A00;
    public Class A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0.A0A == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC04134a1(X.2Jg r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            X.2Jf r0 = (X.2Jf) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A09
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1e
            r0 = r302
            boolean r0 = r0.A0A
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L24
        L1e:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L24:
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r303
            if (r0 != 0) goto La9
            r0 = r302
            java.lang.String r0 = r0.A06
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L3d
            java.lang.String r0 = ""
            r306 = r0
        L3d:
            r0 = r301
            r1 = r306
            r0.A02 = r1
            r0 = r303
            if (r0 == 0) goto L82
            r0 = 0
            r304 = r0
            r0 = 0
            r307 = r0
        L4c:
            r0 = r301
            r1 = r307
            r0.A01 = r1
            r0 = r302
            int r0 = r0.A02
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = r302
            int r0 = r0.A01
            r305 = r0
            r0 = 16
            r303 = r0
            r0 = r305
            r1 = 16
            r0 = r0 & r1
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L7b
            r0 = 1
            r305 = r0
        L7b:
            r0 = r301
            r1 = r305
            r0.A04 = r1
            return
        L82:
            r0 = r302
            java.lang.Class r0 = r0.A05
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La2
            java.lang.Class<com.facebook.graphservice.tree.TreeJNI> r0 = com.facebook.graphservice.tree.TreeJNI.class
            r306 = r0
            r0 = r306
            r1 = r307
            boolean r0 = r0.isAssignableFrom(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto La2
            goto L4c
        La2:
            java.lang.Class<com.facebook.graphservice.tree.TreeJNI> r0 = com.facebook.graphservice.tree.TreeJNI.class
            r307 = r0
            goto L4c
        La9:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04134a1.<init>(X.2Jg):void");
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public final void onError(TigonErrorException tigonErrorException, Summary summary) {
        Throwable c4Qa;
        if (GraphServicesExceptionMigrationAdapter.isGraphServicesExceptionEnabled) {
            c4Qa = new GraphServicesException(tigonErrorException, summary);
        } else if (summary == null || 1JF.A0B(summary.summary)) {
            c4Qa = new C4Qa(summary, tigonErrorException, false);
        } else {
            int i = summary.apiErrorCode;
            int i2 = summary.code;
            String str = summary.debugInfo;
            String str2 = summary.fbRequestId;
            String str3 = summary.description;
            boolean z = summary.requiresReauth;
            c4Qa = new DpH(new GraphQLError(null, summary.summary, str3, str2, str, null, i2, i, 0L, summary.isSilent, summary.isTransient, z), summary);
        }
        onError(c4Qa);
    }

    public abstract void onError(Throwable th);

    public abstract void onModelUpdate(Object obj, Summary summary);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r301.A04 != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.google.common.collect.ImmutableList] */
    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onUpdate(com.facebook.graphservice.interfaces.Tree r302, com.facebook.graphservice.interfaces.Summary r303) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L9f
            r0 = r301
            java.lang.String r0 = r0.A02
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L42
            r0 = r301
            boolean r0 = r0.A04
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3b
        L18:
            r0 = r302
            java.lang.String r0 = r0.getTypeName()
            int r0 = X.MhO.A00(r0)
            r306 = r0
            r0 = r306
            java.lang.Class r0 = X.C7ka.A00(r0)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9f
            r0 = r302
            com.facebook.graphservice.tree.TreeJNI r0 = (com.facebook.graphservice.tree.TreeJNI) r0
            r1 = r307
            r2 = r306
            com.facebook.graphservice.tree.TreeJNI r0 = r0.reinterpret(r1, r2)
            r302 = r0
        L3b:
            r0 = r301
            r1 = r302
            r2 = r303
            r0.onModelUpdate(r1, r2)
            return
        L42:
            r0 = r301
            boolean r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L6b
            r0 = r302
            com.facebook.graphservice.tree.TreeJNI r0 = (com.facebook.graphservice.tree.TreeJNI) r0
            r302 = r0
            r0 = r301
            java.lang.Class r0 = r0.A01
            r308 = r0
            r0 = r301
            int r0 = r0.A00
            r305 = r0
            r0 = r302
            r1 = r304
            r2 = r308
            r3 = r305
            com.google.common.collect.ImmutableList r0 = r0.getTreeList(r1, r2, r3)
            r302 = r0
            goto L3b
        L6b:
            r0 = r301
            boolean r0 = r0.A04
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L81
            r0 = r302
            r1 = r304
            com.facebook.graphservice.interfaces.Tree r0 = r0.getTree(r1)
            r302 = r0
            goto L18
        L81:
            r0 = r302
            com.facebook.graphservice.tree.TreeJNI r0 = (com.facebook.graphservice.tree.TreeJNI) r0
            r302 = r0
            r0 = r301
            java.lang.Class r0 = r0.A01
            r308 = r0
            r0 = r301
            int r0 = r0.A00
            r305 = r0
            r0 = r302
            r1 = r304
            r2 = r308
            r3 = r305
            com.facebook.graphservice.tree.TreeJNI r0 = r0.getTree(r1, r2, r3)
            r302 = r0
            goto L3b
        L9f:
            r0 = 0
            r302 = r0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04134a1.onUpdate(com.facebook.graphservice.interfaces.Tree, com.facebook.graphservice.interfaces.Summary):void");
    }
}
