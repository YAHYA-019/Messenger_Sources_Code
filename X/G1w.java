package X;

import java.io.File;

/* loaded from: G1w.class */
public final class G1w implements Runnable {
    public static final String __redex_internal_original_name = "BugReportWriter$18";
    public final /* synthetic */ FIL A00;
    public final /* synthetic */ File A01;

    public G1w(FIL fil, File file) {
        this.A00 = fil;
        this.A01 = file;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v3 ??, still in use, count: 3, list:
          (r310v3 ??) from 0x03bd: PHI (r310v2 ??) = (r310v1 ??), (r310v3 ??) binds: [B:237:0x03ba, B:216:0x03a9] A[DONT_GENERATE, DONT_INLINE]
          (r310v3 ?? I:java.io.Writer) from 0x0391: INVOKE (r310v3 ?? I:java.io.Writer), (r0v83 ?? I:java.lang.String) VIRTUAL call: java.io.Writer.write(java.lang.String):void A[Catch: IOException -> 0x03a9, all -> 0x0432, MD:(java.lang.String):void throws java.io.IOException (c)]
          (r310v3 ?? I:java.io.Writer) from 0x0396: INVOKE (r310v3 ?? I:java.io.Writer) VIRTUAL call: java.io.Writer.close():void A[Catch: IOException -> 0x039c, MD:():void throws java.io.IOException (c)]
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
    /* JADX WARN: Not initialized variable reg: 309, insn: 0x0449: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r309 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:250:0x0449 */
    /* JADX WARN: Not initialized variable reg: 310, insn: 0x0434: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r310 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:248:0x0434 */
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G1w.run():void");
    }
}
