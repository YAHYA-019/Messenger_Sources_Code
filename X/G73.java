package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: G73.class */
public final class G73 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public G73(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public static ListenableFuture A00(1ED r301, Object obj, Object obj2, Object obj3, int i) {
        return r301.D3C(new G73(i, obj, obj2, obj3));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v11 ??, still in use, count: 4, list:
          (r314v11 ??) from 0x065f: PHI (r314v9 ??) = (r314v10 ??), (r314v11 ??) binds: [B:63:?, B:25:0x00e9] A[DONT_GENERATE, DONT_INLINE]
          (r314v11 ??) from 0x013b: PHI (r314v10 ??) = (r314v8 ??), (r314v11 ??) binds: [B:85:0x0138, B:43:0x0126] A[DONT_GENERATE, DONT_INLINE]
          (r314v11 ?? I:java.io.Writer) from 0x00ea: INVOKE (r314v11 ?? I:java.io.Writer), (r1v60 ?? I:java.lang.String) VIRTUAL call: java.io.Writer.write(java.lang.String):void A[Catch: IOException -> 0x0126, all -> 0x065f, MD:(java.lang.String):void throws java.io.IOException (c)]
          (r314v11 ?? I:java.io.Writer) from 0x00ef: INVOKE (r314v11 ?? I:java.io.Writer) VIRTUAL call: java.io.Writer.close():void A[Catch: IOException -> 0x00f5, MD:():void throws java.io.IOException (c)]
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
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 1685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G73.call():java.lang.Object");
    }
}
