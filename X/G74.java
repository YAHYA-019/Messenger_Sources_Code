package X;

import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: G74.class */
public final class G74 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public G74(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A05 = obj;
        this.A02 = obj4;
        this.A04 = obj5;
    }

    public G74(FIL fil, File file, File file2, java.util.Map map, java.util.Map map2, int i) {
        this.A00 = i;
        this.A01 = fil;
        switch (i) {
            case 0:
            case 1:
            case 3:
                this.A03 = file;
                this.A04 = file2;
                this.A02 = map;
                this.A05 = map2;
                break;
            case 2:
            default:
                this.A02 = map;
                this.A05 = map2;
                this.A03 = file;
                this.A04 = file2;
                break;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r321v6 ??, still in use, count: 4, list:
          (r321v6 ??) from 0x023d: PHI (r321v4 ??) = (r321v3 ??), (r321v5 ??), (r321v6 ??) binds: [B:145:0x0234, B:132:0x022c, B:112:0x0220] A[DONT_GENERATE, DONT_INLINE]
          (r321v6 ?? I:java.io.Writer) from 0x01f9: INVOKE (r321v6 ?? I:java.io.Writer), (r0v393 ?? I:java.lang.String) VIRTUAL call: java.io.Writer.write(java.lang.String):void A[Catch: IOException -> 0x0220, all -> 0x02ea, MD:(java.lang.String):void throws java.io.IOException (c)]
          (r321v6 ?? I:java.io.BufferedWriter) from 0x01fe: INVOKE (r321v6 ?? I:java.io.BufferedWriter) VIRTUAL call: java.io.BufferedWriter.newLine():void A[Catch: IOException -> 0x0220, all -> 0x02ea, MD:():void throws java.io.IOException (c)]
          (r321v6 ?? I:java.io.Writer) from 0x020a: INVOKE (r321v6 ?? I:java.io.Writer) VIRTUAL call: java.io.Writer.close():void A[Catch: IOException -> 0x0210, MD:():void throws java.io.IOException (c)]
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
    /* JADX WARN: Not initialized variable reg: 320, insn: 0x0301: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r320 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:149:0x0301 */
    /* JADX WARN: Not initialized variable reg: 321, insn: 0x02ec: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r321 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:147:0x02ec */
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 2068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G74.call():java.lang.Object");
    }
}
