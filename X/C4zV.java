package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.4zV, reason: invalid class name */
/* loaded from: 4zV.class */
public final class C4zV {
    public final C4zU A00;
    public final C4zT A01;
    public final File A02;
    public final ScheduledExecutorService A03;
    public final long A04;

    public C4zV(C4zU c4zU, C4zT c4zT, 1Mi r304, ScheduledExecutorService scheduledExecutorService) {
        11T.A0F(r304, 2);
        11T.A0F(scheduledExecutorService, 3);
        this.A01 = c4zT;
        this.A03 = scheduledExecutorService;
        this.A00 = c4zU;
        this.A02 = r304.AUU(1106610115);
        this.A04 = System.currentTimeMillis();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v6 ??, still in use, count: 9, list:
          (r312v6 ??) from 0x00d5: PHI (r312v2 ??) = (r312v0 ??), (r312v6 ??), (r312v6 ??) binds: [B:98:0x00d2, B:93:0x00c6, B:66:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x00e8: PHI (r312v4 ??) = (r312v1 ??), (r312v6 ??), (r312v6 ??) binds: [B:96:0x00e5, B:92:0x00cb, B:52:0x00c0] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x00d5: PHI (r312v2 ??) = (r312v0 ??), (r312v6 ??), (r312v6 ??) binds: [B:98:0x00d2, B:93:0x00c6, B:66:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x00e8: PHI (r312v4 ??) = (r312v1 ??), (r312v6 ??), (r312v6 ??) binds: [B:96:0x00e5, B:92:0x00cb, B:52:0x00c0] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x010c: PHI (r312v5 ??) = (r312v3 ??), (r312v6 ??), (r312v6 ??) binds: [B:58:0x0109, B:50:0x00ab, B:39:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x010c: PHI (r312v5 ??) = (r312v3 ??), (r312v6 ??), (r312v6 ??) binds: [B:58:0x0109, B:50:0x00ab, B:39:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ?? I:java.io.InputStream) from 0x0070: INVOKE (r0v50 ?? I:java.io.InputStreamReader), (r312v6 ?? I:java.io.InputStream) DIRECT call: java.io.InputStreamReader.<init>(java.io.InputStream):void A[Catch: IOException -> 0x00c6, FileNotFoundException -> 0x00cb, all -> 0x0130, MD:(java.io.InputStream):void (c)]
          (r312v6 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0148: IF  (r312v6 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:75:0x0161
          (r312v6 ?? I:java.io.InputStream) from 0x014d: INVOKE (r312v6 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: IOException -> 0x0153, MD:():void throws java.io.IOException (c)]
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
    public static final java.lang.StringBuilder A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r312v6 ??, still in use, count: 9, list:
          (r312v6 ??) from 0x00d5: PHI (r312v2 ??) = (r312v0 ??), (r312v6 ??), (r312v6 ??) binds: [B:98:0x00d2, B:93:0x00c6, B:66:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x00e8: PHI (r312v4 ??) = (r312v1 ??), (r312v6 ??), (r312v6 ??) binds: [B:96:0x00e5, B:92:0x00cb, B:52:0x00c0] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x00d5: PHI (r312v2 ??) = (r312v0 ??), (r312v6 ??), (r312v6 ??) binds: [B:98:0x00d2, B:93:0x00c6, B:66:0x00b8] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x00e8: PHI (r312v4 ??) = (r312v1 ??), (r312v6 ??), (r312v6 ??) binds: [B:96:0x00e5, B:92:0x00cb, B:52:0x00c0] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x010c: PHI (r312v5 ??) = (r312v3 ??), (r312v6 ??), (r312v6 ??) binds: [B:58:0x0109, B:50:0x00ab, B:39:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ??) from 0x010c: PHI (r312v5 ??) = (r312v3 ??), (r312v6 ??), (r312v6 ??) binds: [B:58:0x0109, B:50:0x00ab, B:39:0x00a2] A[DONT_GENERATE, DONT_INLINE]
          (r312v6 ?? I:java.io.InputStream) from 0x0070: INVOKE (r0v50 ?? I:java.io.InputStreamReader), (r312v6 ?? I:java.io.InputStream) DIRECT call: java.io.InputStreamReader.<init>(java.io.InputStream):void A[Catch: IOException -> 0x00c6, FileNotFoundException -> 0x00cb, all -> 0x0130, MD:(java.io.InputStream):void (c)]
          (r312v6 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0148: IF  (r312v6 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:75:0x0161
          (r312v6 ?? I:java.io.InputStream) from 0x014d: INVOKE (r312v6 ?? I:java.io.InputStream) VIRTUAL call: java.io.InputStream.close():void A[Catch: IOException -> 0x0153, MD:():void throws java.io.IOException (c)]
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

    /* JADX WARN: Type inference failed for: r0v32, types: [X.7k5, java.lang.Object] */
    public static final ArrayList A01(C4zV c4zV) {
        File[] listFiles = c4zV.A02.listFiles();
        ArrayList A0t = AnonymousClass001.A0t(listFiles != null ? listFiles.length : 0);
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    11T.A0D(file);
                    String name = file.getName();
                    11T.A0A(name);
                    long parseLong = Long.parseLong(name);
                    ?? obj = new Object();
                    obj.A01 = file;
                    obj.A00 = parseLong;
                    A0t.add(obj);
                } catch (NumberFormatException e) {
                    0fH.A0u("BugReporterFileCache", "Unable to convert filename to long - deleting it", e);
                    file.delete();
                }
            }
        }
        0RC.A0y(A0t, new Comparator() { // from class: X.7wh
            @Override // java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(Object obj2, Object obj3) {
                C7k5 c7k5 = (C7k5) obj2;
                C7k5 c7k52 = (C7k5) obj3;
                11T.A0H(c7k5, c7k52);
                return (c7k5.A00 > c7k52.A00 ? 1 : (c7k5.A00 == c7k52.A00 ? 0 : -1));
            }
        });
        return A0t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    public static final List A02(C4zV c4zV) {
        ArrayList A01 = A01(c4zV);
        if (!A01.isEmpty()) {
            int size = A01.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= size) {
                    i = A01.size();
                    break;
                }
                if (((C7k5) A01.get(i)).A00 < c4zV.A04) {
                    i2 = i + 1;
                } else if (((C7k5) A01.get(i)).A00 >= System.currentTimeMillis()) {
                    break;
                }
                i++;
            }
            A01 = A01.subList(i2, i);
        }
        return A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    public static final List A03(C4zV c4zV) {
        ArrayList A01 = A01(c4zV);
        if (!A01.isEmpty()) {
            int size = A01.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= size) {
                    i = A01.size();
                    break;
                }
                long j = c4zV.A04;
                if (j - ((C7k5) A01.get(i)).A00 >= 1800000) {
                    i2 = i + 1;
                } else if (((C7k5) A01.get(i)).A00 >= j) {
                    break;
                }
                i++;
            }
            A01 = A01.subList(i2, i);
        }
        return A01;
    }
}
