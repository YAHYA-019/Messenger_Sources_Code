package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: G75.class */
public final class G75 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public G75(FIL fil, ImmutableMap immutableMap, File file, File file2, java.util.Map map, java.util.Map map2) {
        this.A00 = 0;
        this.A01 = fil;
        this.A03 = file;
        this.A04 = file2;
        this.A06 = immutableMap;
        this.A02 = map;
        this.A05 = map2;
    }

    public G75(FbUserSession fbUserSession, FIL fil, File file, File file2, java.util.Map map, java.util.Map map2, int i) {
        this.A00 = i;
        this.A01 = fil;
        if (1 - i != 0) {
            this.A02 = map;
            this.A05 = map2;
            this.A03 = file;
            this.A04 = file2;
            this.A06 = fbUserSession;
        } else {
            this.A03 = file;
            this.A04 = file2;
            this.A06 = fbUserSession;
            this.A02 = map;
            this.A05 = map2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v8 ??, still in use, count: 6, list:
          (r310v8 ??) from 0x03ce: PHI (r310v6 ??) = (r310v4 ??), (r310v7 ??), (r310v8 ??) binds: [B:186:0x03c8, B:163:0x03c1, B:140:0x03b7] A[DONT_GENERATE, DONT_INLINE]
          (r310v8 ?? I:java.io.Writer) from 0x0345: INVOKE (r310v8 ?? I:java.io.Writer), (r0v242 ?? I:java.lang.String) VIRTUAL call: java.io.Writer.write(java.lang.String):void A[Catch: IOException -> 0x03b7, all -> 0x0422, MD:(java.lang.String):void throws java.io.IOException (c)]
          (r310v8 ?? I:java.io.Writer) from 0x034e: INVOKE (r310v8 ?? I:java.io.Writer), (r0v244 ?? I:int) VIRTUAL call: java.io.Writer.write(int):void A[Catch: IOException -> 0x03b7, all -> 0x0422, MD:(int):void throws java.io.IOException (c)]
          (r310v8 ?? I:java.io.Writer) from 0x035c: INVOKE (r310v8 ?? I:java.io.Writer), (r0v247 ?? I:java.lang.String) VIRTUAL call: java.io.Writer.write(java.lang.String):void A[Catch: IOException -> 0x03b7, all -> 0x0422, MD:(java.lang.String):void throws java.io.IOException (c)]
          (r310v8 ?? I:java.io.BufferedWriter) from 0x0361: INVOKE (r310v8 ?? I:java.io.BufferedWriter) VIRTUAL call: java.io.BufferedWriter.newLine():void A[Catch: IOException -> 0x03b7, all -> 0x0422, MD:():void throws java.io.IOException (c)]
          (r310v8 ?? I:java.io.Writer) from 0x0369: INVOKE (r310v8 ?? I:java.io.Writer) VIRTUAL call: java.io.Writer.close():void A[Catch: IOException -> 0x036f, MD:():void throws java.io.IOException (c)]
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
    /* JADX WARN: Not initialized variable reg: 310, insn: 0x0424: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r310 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:176:0x0424 */
    /* JADX WARN: Not initialized variable reg: 324, insn: 0x043c: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r324 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:178:0x043c */
    /* JADX WARN: Not initialized variable reg: 324, insn: 0x06f0: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r324 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:343:0x06f0 */
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 1820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G75.call():java.lang.Object");
    }
}
