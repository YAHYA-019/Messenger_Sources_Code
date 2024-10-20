package X;

import android.content.Context;

/* loaded from: H33.class */
public abstract class H33 extends C6d5 {
    public GhB A00;
    public 6TI A01;
    public 6TI A02;
    public String A03;
    public final RYz A04;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.RYz, java.lang.Object] */
    public H33(Context context) {
        super(context, null, 0);
        this.A04 = new Object();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 5, list:
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:X.3xs) from 0x0287: INVOKE (r313v3 ?? I:X.3xs), (r0v276 ?? I:java.lang.String) VIRTUAL call: X.3xs.A0e(java.lang.String):void A[Catch: all -> 0x04e4, MD:(java.lang.String):void (m)]
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
    public static final void A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 5, list:
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ??) from 0x029c: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??), (r313v3 ??) binds: [B:244:0x0296, B:90:0x025a, B:94:0x0271, B:98:0x0281, B:100:0x0286] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:X.3xs) from 0x0287: INVOKE (r313v3 ?? I:X.3xs), (r0v276 ?? I:java.lang.String) VIRTUAL call: X.3xs.A0e(java.lang.String):void A[Catch: all -> 0x04e4, MD:(java.lang.String):void (m)]
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

    @Override // X.C6d6
    public void A0M() {
        if (1BL.A0Q().AZk(36311010747287267L)) {
            RYz rYz = this.A04;
            rYz.A03 = false;
            RYz.A00(rYz);
        } else {
            this.A03 = null;
            this.A01 = this.A02;
            this.A02 = null;
            A0k();
        }
    }

    @Override // X.C6d6
    public void A0Y(6TI r302) {
        if (r302 != null) {
            A0e(r302, true);
        }
    }

    @Override // X.C6d6
    public void A0Z(6TI r302) {
        2JY r0 = (2JY) r302.A02("LivingRoomKey");
        if (!11T.A0O(r0 != null ? r0.A0k() : null, this.A03)) {
            super.A0Z(r302);
            return;
        }
        this.A01 = this.A02;
        this.A02 = r302;
        if (1BL.A0Q().AZk(36311010747287267L)) {
            A0e(r302, false);
        }
    }

    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        11T.A0F(r302, 0);
        if (!1BL.A0Q().AZk(36311010747287267L)) {
            A00(this, r302);
            return;
        }
        RYz rYz = this.A04;
        rYz.A00 = new Ivp(this, r302);
        rYz.A01 = new IpW(this);
        rYz.A03 = true;
        RYz.A00(rYz);
        6Tu r0 = this.A08;
        6TN B3f = r0 != null ? r0.B3f() : null;
        if (B3f == 6TN.A09 || B3f == 6TN.A0S || B3f == 6TN.A0T) {
            rYz.A02 = true;
            RYz.A00(rYz);
        }
    }

    public abstract void A0k();
}
