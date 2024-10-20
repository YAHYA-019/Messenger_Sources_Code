package X;

import com.facebook.models.ModelAssetMetadata;
import com.facebook.models.ModelMetadata;
import com.facebook.models.interfaces.ModelLoaderBase;

/* loaded from: Krh.class */
public final class Krh {
    public final KpN A00;
    public final KfR A01;
    public final KfS A02;
    public final KfQ A03;

    public Krh(KpN kpN, KfQ kfQ, KfR kfR, KfS kfS) {
        11T.A0F(kfR, 2);
        this.A03 = kfQ;
        this.A01 = kfR;
        this.A02 = kfS;
        this.A00 = kpN;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Throwable, int] */
    public final Jt3 A00(MLo mLo, String str) {
        KfQ kfQ = this.A03;
        String Ay7 = mLo.Ay7();
        long Ay8 = mLo.Ay8();
        ModelLoaderBase modelLoaderBase = kfQ.A00;
        if (modelLoaderBase == null) {
            return new Jt3(false, "model loader is null", "");
        }
        ?? r0 = (Ay8 > (-1) ? 1 : (Ay8 == (-1) ? 0 : -1));
        try {
            ModelAssetMetadata assetMetadata = (r0 == 0 ? (ModelMetadata) modelLoaderBase.load(Ay7).get() : (ModelMetadata) modelLoaderBase.load(Ay7, Ay8).get()).getAssetMetadata(str);
            if (assetMetadata == null) {
                return new Jt3(false, "no asset", "");
            }
            String str2 = assetMetadata.path;
            11T.A09(str2);
            return new Jt3(true, null, str2);
        } catch (Exception unused) {
            return new Jt3(false, r0.getMessage(), "");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v10 ??, still in use, count: 2, list:
          (r308v10 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) from 0x0143: MOVE (r0v177 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r308v10 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
          (r308v10 ??) from 0x0169: PHI (r308v8 ??) = (r308v7 ??), (r308v10 ??) binds: [B:65:0x0164, B:40:0x0149] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:184)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final X.Jt3 A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r308v10 ??, still in use, count: 2, list:
          (r308v10 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) from 0x0143: MOVE (r0v177 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r308v10 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
          (r308v10 ??) from 0x0169: PHI (r308v8 ??) = (r308v7 ??), (r308v10 ??) binds: [B:65:0x0164, B:40:0x0149] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:184)
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
}
