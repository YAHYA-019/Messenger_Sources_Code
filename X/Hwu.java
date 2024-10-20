package X;

import com.google.common.base.Absent;
import com.google.common.base.Optional;
import java.util.Arrays;
import java.util.List;

/* loaded from: Hwu.class */
public abstract class Hwu {
    public static java.util.Map A01;
    public static final List A02 = Arrays.asList("SM-N770F", "SM-A515F");
    public static Optional A00 = Absent.INSTANCE;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v2 ??, still in use, count: 6, list:
          (r305v2 ??) from 0x013b: PHI (r305v1 ??) = (r305v0 ??), (r305v2 ??) binds: [B:113:0x0138, B:45:0x010b] A[DONT_GENERATE, DONT_INLINE]
          (r305v2 ?? I:X.Hs8) from 0x009b: IGET (r0v100 ?? I:android.opengl.EGLDisplay) = (r305v2 ?? I:X.Hs8) A[Catch: all -> 0x0254] X.Hs8.A02 android.opengl.EGLDisplay
          (r305v2 ?? I:X.Hs8) from 0x00a2: IGET (r0v102 ?? I:android.opengl.EGLConfig) = (r305v2 ?? I:X.Hs8) A[Catch: all -> 0x0254] X.Hs8.A00 android.opengl.EGLConfig
          (r305v2 ?? I:X.Hs8) from 0x00cc: IGET (r0v119 ?? I:android.opengl.EGLDisplay) = (r305v2 ?? I:X.Hs8) A[Catch: all -> 0x0254] X.Hs8.A02 android.opengl.EGLDisplay
          (r305v2 ?? I:X.Hs8) from 0x00ef: IGET (r0v123 ?? I:android.opengl.EGLDisplay) = (r305v2 ?? I:X.Hs8) A[Catch: all -> 0x0254] X.Hs8.A02 android.opengl.EGLDisplay
          (r305v2 ?? I:X.Hs8) from 0x00f6: IGET (r0v125 ?? I:android.opengl.EGLContext) = (r305v2 ?? I:X.Hs8) A[Catch: all -> 0x0254] X.Hs8.A01 android.opengl.EGLContext
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
    public static java.util.Map A00() {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hwu.A00():java.util.Map");
    }
}
