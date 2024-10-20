package X;

import android.content.Context;

/* renamed from: X.9by, reason: invalid class name */
/* loaded from: 9by.class */
public final class C9by {
    public final Context A00;
    public final RLj A01;
    public final 9PL A02;
    public final RQh A03;
    public final 9hG A04;
    public final RYk A05;

    public C9by(Context context, 9aN r303, C9gj c9gj) {
        RQh rQh = new RQh(r303);
        9hG r0 = new 9hG(r303, rQh.A01);
        9PL r02 = new 9PL();
        this.A00 = context;
        this.A01 = new RLj(c9gj);
        this.A03 = rQh;
        this.A04 = r0;
        r0.A00 = new Runnable() { // from class: X.ADm
            public static final String __redex_internal_original_name = "InstallSession$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C9by.this.A00();
            }
        };
        this.A02 = r02;
        this.A05 = new RYk(r303, this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v4 ??, still in use, count: 2, list:
          (r308v4 ??) from 0x010f: PHI (r308v1 ??) = (r308v0 ??), (r308v4 ??) binds: [B:11:0x0039, B:39:0x010a] A[DONT_GENERATE, DONT_INLINE]
          (r308v4 ?? I:X.RLi) from 0x010c: IPUT (r308v4 ?? I:X.RLi), (r0v31 ?? I:X.RLj) A[Catch: OxInstallSdkException -> 0x0228] X.RLj.A00 X.RLi
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void A00() {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9by.A00():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if ((r0.A00 instanceof X.Ab7) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(X.AX5 r302) {
        /*
            r301 = this;
            r0 = r301
            X.9PL r0 = r0.A02
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L6f
            r0 = r303
            X.AX5 r0 = r0.A00
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L6f
        L1a:
            r0 = r302
            boolean r0 = r0 instanceof X.C90f
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L30
            r0 = r303
            java.util.Set r0 = r0.A01
            r304 = r0
            r0 = r304
            r0.clear()
        L30:
            r0 = r301
            X.9hG r0 = r0.A04
            r306 = r0
            r0 = r303
            java.util.Set r0 = r0.A01
            r304 = r0
            r0 = r304
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L5b
            r0 = r303
            X.AX5 r0 = r0.A00
            r304 = r0
            r0 = r304
            boolean r0 = r0 instanceof X.Ab7
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            if (r0 == 0) goto L60
        L5b:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L60:
            r0 = r305
            boolean r0 = X.7zO.A1Y(r0)
            r305 = r0
            r0 = r306
            r1 = r305
            r0.A01(r1)
            return
        L6f:
            r0 = r303
            r1 = r302
            r0.A00 = r1
            r0 = r302
            if (r0 == 0) goto L1a
            r0 = r303
            java.util.Set r0 = r0.A01
            r304 = r0
            r0 = r304
            java.util.Iterator r0 = r0.iterator()
            r308 = r0
        L85:
            r0 = r308
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L1a
            r0 = r308
            java.lang.Object r0 = r0.next()
            X.9LN r0 = (X.9LN) r0
            X.4GE r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.D5N(r1)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9by.A01(X.AX5):void");
    }
}
