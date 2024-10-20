package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1kl, reason: invalid class name */
/* loaded from: 1kl.class */
public final class C1kl extends C1kn implements C1kp {
    public static final long serialVersionUID = 1;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1kl] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    @Override // X.C1kp
    public Object BHq(Object obj) {
        ?? r0 = this;
        try {
            r0 = r0.get(obj);
            return r0;
        } catch (ExecutionException unused) {
            throw new RuntimeException(r0.getCause());
        }
    }

    @Override // X.C1kp
    public void Cbs(Object obj) {
        1kN r0 = this.localCache;
        obj.getClass();
        int A00 = 1kN.A00(r0, obj);
        1kN.A01(r0, A00).A0L(r0.A0E, obj, A00, false);
    }

    @Override // X.C1kp, com.google.common.base.Function
    public final Object apply(Object obj) {
        return BHq(obj);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r328v2 ??, still in use, count: 4, list:
          (r328v2 ??) from 0x02b9: PHI (r328v1 ??) = (r328v0 ??), (r328v2 ??), (r328v2 ??) binds: [B:102:0x0270, B:115:0x02b2, B:113:0x02a8] A[DONT_GENERATE, DONT_INLINE]
          (r328v2 ??) from 0x02b9: PHI (r328v1 ??) = (r328v0 ??), (r328v2 ??), (r328v2 ??) binds: [B:102:0x0270, B:115:0x02b2, B:113:0x02a8] A[DONT_GENERATE, DONT_INLINE]
          (r328v2 ?? I:X.1kP) from 0x029f: INVOKE (r321v4 ?? I:X.1kk), (r328v2 ?? I:X.1kP) INTERFACE call: X.1kk.Cw2(X.1kP):void A[Catch: all -> 0x030e, MD:(X.1kP):void (m)]
          (r328v2 ?? I:X.1kP) from 0x02b4: INVOKE (r321v2 ?? I:X.1kk), (r328v2 ?? I:X.1kP) INTERFACE call: X.1kk.Cw2(X.1kP):void A[Catch: all -> 0x030e, MD:(X.1kP):void (m)]
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
    @Override // X.C1kp
    public java.lang.Object get(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r328v2 ??, still in use, count: 4, list:
          (r328v2 ??) from 0x02b9: PHI (r328v1 ??) = (r328v0 ??), (r328v2 ??), (r328v2 ??) binds: [B:102:0x0270, B:115:0x02b2, B:113:0x02a8] A[DONT_GENERATE, DONT_INLINE]
          (r328v2 ??) from 0x02b9: PHI (r328v1 ??) = (r328v0 ??), (r328v2 ??), (r328v2 ??) binds: [B:102:0x0270, B:115:0x02b2, B:113:0x02a8] A[DONT_GENERATE, DONT_INLINE]
          (r328v2 ?? I:X.1kP) from 0x029f: INVOKE (r321v4 ?? I:X.1kk), (r328v2 ?? I:X.1kP) INTERFACE call: X.1kk.Cw2(X.1kP):void A[Catch: all -> 0x030e, MD:(X.1kP):void (m)]
          (r328v2 ?? I:X.1kP) from 0x02b4: INVOKE (r321v2 ?? I:X.1kk), (r328v2 ?? I:X.1kP) INTERFACE call: X.1kk.Cw2(X.1kP):void A[Catch: all -> 0x030e, MD:(X.1kP):void (m)]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
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

    @Override // X.C1kn
    public Object writeReplace() {
        return new 3CK(this.localCache);
    }
}
