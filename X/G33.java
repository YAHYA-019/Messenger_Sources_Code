package X;

/* loaded from: G33.class */
public final class G33 implements Runnable {
    public static final String __redex_internal_original_name = "BugReporterFileCache$logToFile$1";
    public final /* synthetic */ C4zV A00;
    public final /* synthetic */ String A01;

    public G33(C4zV c4zV, String str) {
        this.A00 = c4zV;
        this.A01 = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v10 ??, still in use, count: 6, list:
          (r310v10 ??) from 0x01b6: PHI (r310v4 ??) = (r310v7 ??), (r310v10 ??) binds: [B:56:?, B:8:0x0066] A[DONT_GENERATE, DONT_INLINE]
          (r310v10 ??) from 0x00ab: PHI (r310v7 ??) = (r310v3 ??), (r310v10 ??), (r310v10 ??) binds: [B:77:0x00a5, B:72:0x009e, B:49:0x0097] A[DONT_GENERATE, DONT_INLINE]
          (r310v10 ??) from 0x01bd: PHI (r310v6 ??) = (r310v4 ??), (r310v10 ??) binds: [B:75:0x01ba, B:58:0x008e] A[DONT_GENERATE, DONT_INLINE]
          (r310v10 ??) from 0x00ab: PHI (r310v7 ??) = (r310v3 ??), (r310v10 ??), (r310v10 ??) binds: [B:77:0x00a5, B:72:0x009e, B:49:0x0097] A[DONT_GENERATE, DONT_INLINE]
          (r310v10 ??) from 0x00c7: PHI (r310v9 ??) = (r310v7 ??), (r310v10 ??) binds: [B:55:0x00c4, B:20:0x0086] A[DONT_GENERATE, DONT_INLINE]
          (r310v10 ?? I:java.io.OutputStream) from 0x006f: INVOKE (r0v99 ?? I:java.io.OutputStreamWriter), (r310v10 ?? I:java.io.OutputStream) DIRECT call: java.io.OutputStreamWriter.<init>(java.io.OutputStream):void A[Catch: FileNotFoundException -> 0x009e, all -> 0x01b6, MD:(java.io.OutputStream):void (c)]
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
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G33.run():void");
    }
}
