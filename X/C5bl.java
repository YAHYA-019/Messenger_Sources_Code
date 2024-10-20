package X;

import android.net.Uri;

/* renamed from: X.5bl, reason: invalid class name */
/* loaded from: 5bl.class */
public final class C5bl implements Runnable {
    public static final String __redex_internal_original_name = "FrescoControllerImpl$1";
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ 4hO A01;
    public final /* synthetic */ C5bj A02;
    public final /* synthetic */ 4iC A03;
    public final /* synthetic */ C06974ih A04;
    public final /* synthetic */ Object A05;

    public C5bl(Uri uri, 4hO r303, C5bj c5bj, 4iC r305, C06974ih c06974ih, Object obj) {
        this.A03 = r305;
        this.A01 = r303;
        this.A02 = c5bj;
        this.A00 = uri;
        this.A04 = c06974ih;
        this.A05 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v2 ??, still in use, count: 2, list:
          (r311v2 ??) from 0x00fb: PHI (r311v1 ??) = (r311v0 ??), (r311v2 ??) binds: [B:50:0x00bb, B:64:0x00f6] A[DONT_GENERATE, DONT_INLINE]
          (r311v2 ?? I:X.4g7) from 0x00f8: IPUT (r311v2 ?? I:X.4g7), (r0v22 ?? I:X.4i5) A[Catch: all -> 0x01b8] X.4i5.A00 X.4g7
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
    public void run() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5bl.run():void");
    }
}
