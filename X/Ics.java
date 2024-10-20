package X;

import android.graphics.SurfaceTexture;

/* loaded from: Ics.class */
public final class Ics implements JME {
    public volatile SurfaceTexture A03;
    public volatile JG1 A04;
    public volatile int A05;
    public final Object A01 = AnonymousClass001.A0R();
    public final SurfaceTexture.OnFrameAvailableListener A00 = new IGg(this, 1);
    public final boolean A02 = true;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x002c: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:9:0x001b, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:android.graphics.SurfaceTexture) from 0x0029: IPUT (r302v3 ?? I:android.graphics.SurfaceTexture), (r301v0 ?? I:X.Ics) A[Catch: all -> 0x0049] X.Ics.A03 android.graphics.SurfaceTexture
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
    public static android.graphics.SurfaceTexture A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x002c: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:9:0x001b, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:android.graphics.SurfaceTexture) from 0x0029: IPUT (r302v3 ?? I:android.graphics.SurfaceTexture), (r301v0 ?? I:X.Ics) A[Catch: all -> 0x0049] X.Ics.A03 android.graphics.SurfaceTexture
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r301v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public long BFt() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            return surfaceTexture.getTimestamp();
        }
        return 0L;
    }

    public void BGt(float[] fArr) {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.getTransformMatrix(fArr);
        }
    }

    public void CPz(int i) {
        this.A05 = i;
        if (i != 0) {
            SurfaceTexture surfaceTexture = this.A03;
            if (surfaceTexture == null) {
                A00(this);
                return;
            }
            surfaceTexture.detachFromGLContext();
            surfaceTexture.attachToGLContext(i);
            if (this.A02) {
                surfaceTexture.setOnFrameAvailableListener(this.A00);
            }
            surfaceTexture.updateTexImage();
        }
    }

    public void CQ0() {
        if (this.A03 != null) {
            synchronized (this.A01) {
                SurfaceTexture surfaceTexture = this.A03;
                this.A03 = null;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
            }
        }
        this.A05 = 0;
    }

    public void Crq(JG1 jg1) {
        this.A04 = jg1;
    }

    public void D8A() {
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }
}
