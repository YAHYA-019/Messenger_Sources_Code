package X;

import android.content.Context;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.2uw, reason: invalid class name */
/* loaded from: 2uw.class */
public final class C2uw extends C2ux {
    public long A00;
    public Context A01;
    public 30L A02;
    public 30L A03;
    public boolean A04;
    public boolean A06;
    public boolean A07;
    public 30L A0A;
    public final long A0B;
    public final 2uE A0D;
    public final 00V A0E;
    public final 0ED A0F;
    public final 2uI A0G;
    public final String A0H;
    public final Executor A0K;
    public final C2uv A0L;
    public final 00T A0M;
    public final C0dr A0C = RealtimeSinceBootClock.A00;
    public boolean A05 = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public final java.util.Map A0I = new HashMap();
    public final Queue A0J = new LinkedList();

    public C2uw(Context context, C2uv c2uv, 2uE r304, 30L r305, 30L r306, 30L r307, 00T r308, 00V r309, 0ED r310, String str, Executor executor) {
        this.A01 = context;
        this.A0M = r308;
        this.A0G = 2uG.A00(context);
        this.A0E = r309;
        this.A0F = r310;
        this.A0K = executor;
        this.A0D = r304;
        this.A0B = r307.A01.Av9(1GD.A07, r307.A00);
        this.A0L = c2uv;
        this.A0H = str;
        this.A0A = r305;
        this.A03 = r306;
        this.A02 = r307;
    }

    public static String A00(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private void A01(int i) {
        synchronized (this) {
            this.A0I.remove(Integer.valueOf(i));
        }
    }

    public static void A02(final C2uw c2uw) {
        synchronized (c2uw) {
            Boolean valueOf = Boolean.valueOf(c2uw.A06);
            Queue queue = c2uw.A0J;
            boolean z = false;
            if (!queue.isEmpty()) {
                z = true;
            }
            0fH.A0a(valueOf, Boolean.valueOf(z), Boolean.valueOf(c2uw.A04), "GooglePlayDownloader", "maybeKickExecutor waiting %s, hasTasks: %s downloading %s");
            if (!c2uw.A06 && !queue.isEmpty() && !c2uw.A04) {
                C3Lx c3Lx = (C3Lx) queue.remove();
                2uE r0 = c2uw.A0D;
                if (r0 != null) {
                    r0.A0D(c3Lx.A02);
                }
                0fH.A0g(A00(new ArrayList(c3Lx.A02.A02)), "GooglePlayDownloader", "Sending %s");
                c2uw.A06 = true;
                if (!c2uw.A05) {
                    try {
                        c2uw.A0G.CcP(new C2ue() { // from class: X.51h
                            @Override // X.C2uf
                            public /* bridge */ /* synthetic */ void CNC(Object obj) {
                                3NT r02 = (3NT) obj;
                                C2uw c2uw2 = C2uw.this;
                                synchronized (c2uw2) {
                                    int i = ((K8r) r02).A01;
                                    boolean z2 = true;
                                    if (i != 2 && i != 1 && i != 4) {
                                        z2 = false;
                                    }
                                    c2uw2.A04 = z2;
                                }
                                c2uw2.A0K.execute(new 3hM(this, r02));
                            }
                        });
                        c2uw.A05 = true;
                    } catch (SecurityException e) {
                        0fH.A0s("GooglePlayDownloader", "unable to register listener", e);
                    }
                }
                if (!c2uw.A08) {
                    c2uw.A08 = true;
                    Iterator it = c2uw.A0G.ArQ().iterator();
                    while (it.hasNext()) {
                        String A0i = AnonymousClass001.A0i(it);
                        if (AnonymousClass036.A00(A0i) < 0) {
                            0fH.A0o("GooglePlayDownloader", 0Pz.A0W("Unknown module name received from Google sessionState: ", A0i));
                        }
                        00Y.A00().A07(A0i, 0S2.A0C);
                    }
                }
                if (!c2uw.A09 && !c2uw.A07) {
                    c2uw.A04 = true;
                    c2uw.A07 = true;
                    c2uw.A0K.execute(new C51i(c2uw));
                }
                c2uw.A0K.execute(new Lnz(c3Lx, c2uw));
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v2 ??, still in use, count: 3, list:
          (r316v2 ??) from 0x011a: PHI (r316v3 ??) = (r316v2 ??), (r316v11 ??) binds: [B:650:0x0191, B:54:0x0117] A[DONT_GENERATE, DONT_INLINE]
          (r316v2 ?? I:java.lang.Object) from 0x0168: INVOKE (r0v27 ?? I:java.util.Map), (r0v29 ?? I:java.lang.Object), (r316v2 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0bd4, MD:(K, V):V (c)]
          (r316v2 ?? I:X.3Lx) from 0x017b: IGET (r0v52 ?? I:X.3QA) = (r316v2 ?? I:X.3Lx) A[Catch: all -> 0x0bd4] X.3Lx.A02 X.3QA
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
    public static void A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v2 ??, still in use, count: 3, list:
          (r316v2 ??) from 0x011a: PHI (r316v3 ??) = (r316v2 ??), (r316v11 ??) binds: [B:650:0x0191, B:54:0x0117] A[DONT_GENERATE, DONT_INLINE]
          (r316v2 ?? I:java.lang.Object) from 0x0168: INVOKE (r0v27 ?? I:java.util.Map), (r0v29 ?? I:java.lang.Object), (r316v2 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0bd4, MD:(K, V):V (c)]
          (r316v2 ?? I:X.3Lx) from 0x017b: IGET (r0v52 ?? I:X.3QA) = (r316v2 ?? I:X.3Lx) A[Catch: all -> 0x0bd4] X.3Lx.A02 X.3QA
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
}
