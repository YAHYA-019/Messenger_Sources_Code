package com.facebook.common.dextricks;

import X.AnonymousClass001;
import com.facebook.common.dextricks.classifier.NameClassifier;
import com.facebook.common.dextricks.fallback.FallbackDexLoader;
import dalvik.system.BaseDexClassLoader;

/* loaded from: ReflectionClassLoader.class */
public abstract class ReflectionClassLoader extends ClassLoader {
    public static final ClassLoader APP_CLASSLOADER;
    public static final String TAG = "ReflectionClassLoader";
    public static volatile ClassLoader sInstalledClassLoader;
    public final ClassLoader mPutativeLoader = APP_CLASSLOADER;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class, java.lang.Class<com.facebook.common.dextricks.ReflectionClassLoader>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.ClassLoader] */
    static {
        ?? r0 = ReflectionClassLoader.class;
        try {
            r0 = r0.getClassLoader();
            APP_CLASSLOADER = r0;
        } catch (Exception unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public static ClassLoader createReflectionClassLoader() {
        return new ReflectionClassLoader();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 3, list:
          (r303v2 ??) from 0x003a: PHI (r303v3 ??) = (r303v2 ??), (r303v4 ??) binds: [B:26:0x0037, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:java.lang.ClassLoader) from 0x0027: INVOKE (r0v20 ?? I:boolean) = (r0v18 ?? I:dalvik.system.BaseDexClassLoader), (r303v2 ?? I:java.lang.ClassLoader) STATIC call: com.facebook.common.dextricks.Achilles.addTosharedLibraryLoadersAfter(dalvik.system.BaseDexClassLoader, java.lang.ClassLoader):boolean A[Catch: Exception -> 0x0048, all -> 0x006c, MD:(dalvik.system.BaseDexClassLoader, java.lang.ClassLoader):boolean (m)]
          (r303v2 ?? I:java.lang.ClassLoader) from 0x0037: SPUT (r303v2 ?? I:java.lang.ClassLoader) A[Catch: Exception -> 0x0048, all -> 0x006c] com.facebook.common.dextricks.ReflectionClassLoader.sInstalledClassLoader java.lang.ClassLoader
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
    public static java.lang.ClassLoader install(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 3, list:
          (r303v2 ??) from 0x003a: PHI (r303v3 ??) = (r303v2 ??), (r303v4 ??) binds: [B:26:0x0037, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:java.lang.ClassLoader) from 0x0027: INVOKE (r0v20 ?? I:boolean) = (r0v18 ?? I:dalvik.system.BaseDexClassLoader), (r303v2 ?? I:java.lang.ClassLoader) STATIC call: com.facebook.common.dextricks.Achilles.addTosharedLibraryLoadersAfter(dalvik.system.BaseDexClassLoader, java.lang.ClassLoader):boolean A[Catch: Exception -> 0x0048, all -> 0x006c, MD:(dalvik.system.BaseDexClassLoader, java.lang.ClassLoader):boolean (m)]
          (r303v2 ?? I:java.lang.ClassLoader) from 0x0037: SPUT (r303v2 ?? I:java.lang.ClassLoader) A[Catch: Exception -> 0x0048, all -> 0x006c] com.facebook.common.dextricks.ReflectionClassLoader.sInstalledClassLoader java.lang.ClassLoader
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

    public static final boolean maybeFallbackLoadDexes(String str) {
        FallbackDexLoader fallbackDexLoader = FallbackDexLoader.A00;
        if (fallbackDexLoader == null) {
            return false;
        }
        String str2 = null;
        if (NameClassifier.A01(MultiDexClassLoaderJava.sEncodedLongtailUnrenamedTypes, str)) {
            str2 = "longtail";
        }
        return fallbackDexLoader.A03(str, str2, new ClassNotFoundException(str));
    }

    public void addDexPathFromConfig(ClassLoaderConfiguration classLoaderConfiguration) {
        classLoaderConfiguration.addDexFileToClassLoaderPath((BaseDexClassLoader) this.mPutativeLoader);
    }
}
