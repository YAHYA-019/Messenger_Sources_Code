package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: X.2v2, reason: invalid class name */
/* loaded from: 2v2.class */
public final class C2v2 {
    public final Executor A03;
    public final 00V A04;
    public final java.util.Map A02 = new HashMap();
    public final Queue A05 = new ConcurrentLinkedQueue();
    public File A00 = null;
    public boolean A01 = false;

    public C2v2(00V r302, Executor executor) {
        this.A03 = executor;
        this.A04 = r302;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x0027: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x0008, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:java.io.File) from 0x0024: IPUT (r302v2 ?? I:java.io.File), (r301v0 ?? I:X.2v2) A[Catch: all -> 0x002b] X.2v2.A00 java.io.File
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
    public static java.io.File A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v2 ??, still in use, count: 2, list:
          (r302v2 ??) from 0x0027: PHI (r302v1 ??) = (r302v0 ??), (r302v2 ??) binds: [B:6:0x0008, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]
          (r302v2 ?? I:java.io.File) from 0x0024: IPUT (r302v2 ?? I:java.io.File), (r301v0 ?? I:X.2v2) A[Catch: all -> 0x002b] X.2v2.A00 java.io.File
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

    public static void A01(C2v2 c2v2) {
        3Lw r0;
        while (true) {
            Queue queue = c2v2.A05;
            if (queue.isEmpty() || (r0 = (3Lw) queue.poll()) == null) {
                return;
            } else {
                c2v2.A03(r0.A00, r0.A01, r0.A02, true);
            }
        }
    }

    public static void A02(C2v2 c2v2) {
        synchronized (c2v2) {
            if (A00(c2v2).exists() && !c2v2.A01) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(A00(c2v2))));
                    try {
                        String readLine = bufferedReader.readLine();
                        while (true) {
                            String str = readLine;
                            if (str == null) {
                                break;
                            }
                            0fH.A0g(str, "LoggingMetadataStore", "Read logging line: %s");
                            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 2);
                            if (split.length == 2) {
                                String str2 = split[0];
                                String[] split2 = split[1].split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                if (split2.length > 0) {
                                    for (String str3 : split2) {
                                        String[] split3 = str3.split(":");
                                        if (split3.length == 2) {
                                            c2v2.A03(str2, split3[0], split3[1], false);
                                        }
                                    }
                                }
                            }
                            readLine = bufferedReader.readLine();
                        }
                        c2v2.A01 = true;
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            7kF.A00(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    0fH.A0s("LoggingMetadataStore", "Unable to read usage log", e);
                }
            }
        }
    }

    private void A03(String str, String str2, String str3, boolean z) {
        synchronized (this) {
            java.util.Map map = this.A02;
            if (!map.containsKey(str)) {
                map.put(str, new HashMap());
            }
            java.util.Map map2 = (java.util.Map) map.get(str);
            if (map2 != null && (z || !map2.containsKey(str2))) {
                map2.put(str2, str3);
                0fH.A0a(str, str2, str3, "LoggingMetadataStore", "set metadata: %s -> %s : %s");
            }
        }
    }

    public String A04(String str, String str2) {
        A02(this);
        A01(this);
        java.util.Map map = this.A02;
        if (!map.containsKey(str)) {
            return null;
        }
        java.util.Map map2 = (java.util.Map) map.get(str);
        if (map2.containsKey(str2)) {
            return (String) map2.get(str2);
        }
        return null;
    }

    public void A05(String str, String str2, String str3) {
        3Lw r0 = new 3Lw(str, str2, str3);
        Queue queue = this.A05;
        if (queue.offer(r0)) {
            return;
        }
        0fH.A0n("LoggingMetadataStore", "unable to add item to the queue, flushing");
        A01(this);
        queue.offer(r0);
    }
}
