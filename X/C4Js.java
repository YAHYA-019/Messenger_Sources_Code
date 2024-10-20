package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.4Js, reason: invalid class name */
/* loaded from: 4Js.class */
public final class C4Js implements C4Jn, 4IR, C4Jt {
    public static final String A0E = 4IS.A01("GreedyScheduler");
    public Boolean A00;
    public boolean A01;
    public C4Ju A02;
    public final Context A03;
    public final 4IX A04;
    public final C4Ji A05;
    public final C4Jr A0A;
    public final C4Jv A0B;
    public final C4Jw A0C;
    public final C4Ii A0D;
    public final java.util.Map A07 = new HashMap();
    public final Object A06 = new Object();
    public final 4IT A09 = new 4IT();
    public final java.util.Map A08 = new HashMap();

    public C4Js(Context context, 4IX r303, C4Ji c4Ji, C4Jr c4Jr, C4Ja c4Ja, C4Ii c4Ii) {
        this.A03 = context;
        C4Ig c4Ig = r303.A04;
        this.A02 = new C4Ju(r303.A02, c4Ig, this);
        this.A0B = new C4Jv(c4Ig, c4Jr);
        this.A0D = c4Ii;
        this.A0C = new C4Jw(c4Ja);
        this.A04 = r303;
        this.A05 = c4Ji;
        this.A0A = c4Jr;
    }

    @Override // X.C4Jn
    public void ADz(String str) {
        Runnable runnable;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(4OZ.A00(this.A03, this.A04));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            4IS.A00();
            android.util.Log.i(A0E, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        4IS.A00().A02(A0E, 0Pz.A0W("Cancelling work ID ", str));
        C4Ju c4Ju = this.A02;
        if (c4Ju != null && (runnable = (Runnable) c4Ju.A02.remove(str)) != null) {
            c4Ju.A00.ADy(runnable);
        }
        for (C4Km c4Km : this.A09.A02(str)) {
            this.A0B.A00(c4Km);
            C4Jr c4Jr = this.A0A;
            11T.A0F(c4Km, 1);
            c4Jr.D31(c4Km, -512);
        }
    }

    @Override // X.C4Jn
    public boolean BN9() {
        return false;
    }

    @Override // X.C4Jt
    public void Bqz(AnonymousClass996 anonymousClass996, C4Kf c4Kf) {
        C4Ki A00 = C4Kh.A00(c4Kf);
        if (!(anonymousClass996 instanceof 8E9)) {
            4IS.A00().A02(A0E, AnonymousClass001.A0Z(A00, "Constraints not met: Cancelling work ID ", AnonymousClass001.A0k()));
            C4Km A002 = this.A09.A00(A00);
            if (A002 != null) {
                this.A0B.A00(A002);
                this.A0A.D31(A002, ((8E8) anonymousClass996).A00);
                return;
            }
            return;
        }
        4IT r0 = this.A09;
        if (r0.A03(A00)) {
            return;
        }
        4IS.A00().A02(A0E, AnonymousClass001.A0Z(A00, "Constraints met: Scheduling work ID ", AnonymousClass001.A0k()));
        C4Km A01 = r0.A01(A00);
        this.A0B.A01(A01);
        C4Jr c4Jr = this.A0A;
        11T.A0F(A01, 1);
        C4Jq c4Jq = (C4Jq) c4Jr;
        c4Jq.A01.ARK(new C4Kn(null, c4Jq.A00, A01));
    }

    public void Bwy(C4Ki c4Ki, boolean z) {
        C2a2 c2a2;
        C4Km A00 = this.A09.A00(c4Ki);
        if (A00 != null) {
            this.A0B.A00(A00);
        }
        Object obj = this.A06;
        synchronized (obj) {
            c2a2 = (C2a2) this.A07.remove(c4Ki);
        }
        if (c2a2 != null) {
            4IS.A00().A02(A0E, AnonymousClass001.A0Z(c4Ki, "Stopping tracking for ", AnonymousClass001.A0k()));
            c2a2.AE0(null);
        }
        if (z) {
            return;
        }
        synchronized (obj) {
            this.A08.remove(c4Ki);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v4 ??, still in use, count: 2, list:
          (r316v4 ??) from 0x00f4: PHI (r316v2 ??) = (r316v1 ??), (r316v4 ??) binds: [B:26:0x00cb, B:33:0x00ec] A[DONT_GENERATE, DONT_INLINE]
          (r316v4 ?? I:java.lang.Object) from 0x00ee: INVOKE (r0v83 ?? I:java.util.Map), (r0v81 ?? I:java.lang.Object), (r316v4 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x031c, MD:(K, V):V (c)]
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
    @Override // X.C4Jn
    public void Cje(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r316v4 ??, still in use, count: 2, list:
          (r316v4 ??) from 0x00f4: PHI (r316v2 ??) = (r316v1 ??), (r316v4 ??) binds: [B:26:0x00cb, B:33:0x00ec] A[DONT_GENERATE, DONT_INLINE]
          (r316v4 ?? I:java.lang.Object) from 0x00ee: INVOKE (r0v83 ?? I:java.util.Map), (r0v81 ?? I:java.lang.Object), (r316v4 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x031c, MD:(K, V):V (c)]
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
}
