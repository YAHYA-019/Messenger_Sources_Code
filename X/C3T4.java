package X;

import com.facebook.inject.FbInjector;
import com.facebook.presence.requeststream.PresenceAmendmentPollingMode;
import com.facebook.realtime.requeststream.streamref.NativeStream;

/* renamed from: X.3T4, reason: invalid class name */
/* loaded from: 3T4.class */
public final class C3T4 {
    public int A00;
    public 3El A01;
    public NativeStream A02;
    public boolean A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1YI A06;
    public final boolean A07;
    public final 1BP A08 = FbInjector.A00;

    public C3T4() {
        1Br A0C = 1BK.A0C();
        this.A04 = A0C;
        this.A05 = 1Bq.A00(66302);
        this.A00 = 3;
        this.A07 = 1Br.A07(A0C).AZk(36315580575720638L);
        this.A06 = 1YI.A00(FbInjector.A03);
    }

    public static final void A00(3El r301, C3T4 c3t4) {
        synchronized (c3t4) {
            try {
                0fH.A0g(r301.name(), "PresenceRequestStreamManager", "requestPollingModeSwitch(pollingMode=%s)");
                NativeStream nativeStream = c3t4.A02;
                if (nativeStream == null) {
                    0fH.A0j("PresenceRequestStreamManager", "Skipping amendStream for polling mode switch since stream is not initialized...");
                } else {
                    byte[] A0b = AnonymousClass243.A00().A0b(new PresenceAmendmentPollingMode(r301));
                    11T.A0A(A0b);
                    nativeStream.nativeAmend(A0b);
                    c3t4.A01 = r301;
                }
            } catch (2LD e) {
                0fH.A0r("PresenceRequestStreamManager", "[presence_bladerunner] Error amending stream and sending generic polling mode.", e);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v8 ??, still in use, count: 2, list:
          (r314v8 ??) from 0x02a5: PHI (r314v4 ??) = (r314v3 ??), (r314v8 ??) binds: [B:169:0x0294, B:88:0x0276] A[DONT_GENERATE, DONT_INLINE]
          (r314v8 ?? I:X.29M) from 0x0278: INVOKE (r0v221 ?? I:byte[]) = (r0v218 ?? I:X.29V), (r314v8 ?? I:X.29M) VIRTUAL call: X.29V.A00(X.29M):byte[] A[Catch: 2LA -> 0x0292, MD:(X.29M):byte[] (m)]
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
    /* JADX WARN: Not initialized variable reg: 339, insn: 0x040f: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r339 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:148:0x03fb */
    public static final boolean A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v8 ??, still in use, count: 2, list:
          (r314v8 ??) from 0x02a5: PHI (r314v4 ??) = (r314v3 ??), (r314v8 ??) binds: [B:169:0x0294, B:88:0x0276] A[DONT_GENERATE, DONT_INLINE]
          (r314v8 ?? I:X.29M) from 0x0278: INVOKE (r0v221 ?? I:byte[]) = (r0v218 ?? I:X.29V), (r314v8 ?? I:X.29M) VIRTUAL call: X.29V.A00(X.29M):byte[] A[Catch: 2LA -> 0x0292, MD:(X.29M):byte[] (m)]
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

    public final boolean A02() {
        synchronized (this) {
            if (this.A02 == null) {
                0fH.A0j("PresenceRequestStreamManager", "Stream Already cancelled");
                return false;
            }
            0fH.A0j("PresenceRequestStreamManager", "cancelStream");
            NativeStream nativeStream = this.A02;
            11T.A0D(nativeStream);
            nativeStream.nativeCancel();
            this.A02 = null;
            this.A01 = null;
            this.A03 = false;
            return true;
        }
    }
}
