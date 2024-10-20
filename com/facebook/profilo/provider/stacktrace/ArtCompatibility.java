package com.facebook.profilo.provider.stacktrace;

import X.C0il;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ArtCompatibility.class */
public class ArtCompatibility {
    public static final AtomicReference sIsCompatible;

    static {
        C0il.A0B("profilo_stacktrace");
        sIsCompatible = new AtomicReference(null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v0 ??, still in use, count: 5, list:
          (r309v0 ??) from 0x036b: PHI (r309v1 ??) = (r309v0 ??), (r309v2 ??), (r309v4 ??) binds: [B:163:0x0366, B:70:0x035a, B:45:0x0350] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ?? I:java.io.File) from 0x0050: INVOKE (r0v19 ?? I:boolean) = (r309v0 ?? I:java.io.File) VIRTUAL call: java.io.File.exists():boolean A[Catch: IOException -> 0x0370, MD:():boolean (c)]
          (r309v0 ?? I:java.io.File) from 0x0061: INVOKE (r0v153 ?? I:java.io.FileInputStream), (r309v0 ?? I:java.io.File) DIRECT call: java.io.FileInputStream.<init>(java.io.File):void A[Catch: IOException -> 0x0370, MD:(java.io.File):void throws java.io.FileNotFoundException (c)]
          (r309v0 ?? I:java.io.File) from 0x02fd: INVOKE (r0v127 ?? I:java.io.FileOutputStream), (r309v0 ?? I:java.io.File) DIRECT call: java.io.FileOutputStream.<init>(java.io.File):void A[Catch: IOException -> 0x0370, MD:(java.io.File):void throws java.io.FileNotFoundException (c)]
          (r309v0 ?? I:java.lang.Throwable) from 0x0368: INVOKE (r309v0 ?? I:java.lang.Throwable), (r305v3 ?? I:java.lang.Throwable) STATIC call: X.0Ug.A00(java.lang.Throwable, java.lang.Throwable):void A[Catch: IOException -> 0x0370]
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
    public static boolean isCompatible(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v0 ??, still in use, count: 5, list:
          (r309v0 ??) from 0x036b: PHI (r309v1 ??) = (r309v0 ??), (r309v2 ??), (r309v4 ??) binds: [B:163:0x0366, B:70:0x035a, B:45:0x0350] A[DONT_GENERATE, DONT_INLINE]
          (r309v0 ?? I:java.io.File) from 0x0050: INVOKE (r0v19 ?? I:boolean) = (r309v0 ?? I:java.io.File) VIRTUAL call: java.io.File.exists():boolean A[Catch: IOException -> 0x0370, MD:():boolean (c)]
          (r309v0 ?? I:java.io.File) from 0x0061: INVOKE (r0v153 ?? I:java.io.FileInputStream), (r309v0 ?? I:java.io.File) DIRECT call: java.io.FileInputStream.<init>(java.io.File):void A[Catch: IOException -> 0x0370, MD:(java.io.File):void throws java.io.FileNotFoundException (c)]
          (r309v0 ?? I:java.io.File) from 0x02fd: INVOKE (r0v127 ?? I:java.io.FileOutputStream), (r309v0 ?? I:java.io.File) DIRECT call: java.io.FileOutputStream.<init>(java.io.File):void A[Catch: IOException -> 0x0370, MD:(java.io.File):void throws java.io.FileNotFoundException (c)]
          (r309v0 ?? I:java.lang.Throwable) from 0x0368: INVOKE (r309v0 ?? I:java.lang.Throwable), (r305v3 ?? I:java.lang.Throwable) STATIC call: X.0Ug.A00(java.lang.Throwable, java.lang.Throwable):void A[Catch: IOException -> 0x0370]
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

    public static native boolean nativeCheck(int i);
}
