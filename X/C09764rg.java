package X;

/* renamed from: X.4rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rg.class */
public final class C09764rg extends AbstractC09774rh implements InterfaceC04003zj, InterfaceC09784ri {
    public final C00i A00;
    public final C00i A01 = new 1BQ(65755);
    public final C00i A02;
    public final int A03;
    public final C00i A04;
    public final C00i A05;

    public C09764rg() {
        1BQ r0 = new 1BQ(49315);
        this.A04 = r0;
        this.A00 = new 1BV(49321);
        this.A05 = new 1BV(98403);
        this.A02 = new 1BV(82596);
        this.A03 = (1Bi.A03(83604) == C0et.A0C || ((C09794rj) r0.get()).A06) ? 3 : 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v4 ??, still in use, count: 2, list:
          (r313v4 ??) from 0x011f: PHI (r313v5 ??) = (r313v4 ??), (r313v3 ??) binds: [B:128:0x011b, B:112:0x02aa] A[DONT_GENERATE, DONT_INLINE]
          (r313v4 ?? I:java.util.AbstractCollection) from 0x010c: INVOKE (r313v4 ?? I:java.util.AbstractCollection), (r0v136 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0127, MD:(E):boolean (c)]
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
    private void A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v4 ??, still in use, count: 2, list:
          (r313v4 ??) from 0x011f: PHI (r313v5 ??) = (r313v4 ??), (r313v3 ??) binds: [B:128:0x011b, B:112:0x02aa] A[DONT_GENERATE, DONT_INLINE]
          (r313v4 ?? I:java.util.AbstractCollection) from 0x010c: INVOKE (r313v4 ?? I:java.util.AbstractCollection), (r0v136 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x0127, MD:(E):boolean (c)]
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

    @Override // X.InterfaceC03993zi
    public void A7p() {
        C00i c00i = this.A01;
        if (((1Ew) c00i.get()).BNC() && ((C09794rj) this.A04.get()).A06) {
            1Ew r0 = (1Ew) c00i.get();
            if (r0.Auc() != null) {
                r0.CjX(r0.Auc());
            }
        }
    }

    @Override // X.InterfaceC03993zi
    public void ABa(EnC enC, boolean z) {
        A00(this.A03);
    }

    @Override // X.InterfaceC04003zj
    public 4qU AZ3() {
        return new Fi5(this);
    }

    @Override // X.InterfaceC03993zi
    public String Asw() {
        return "LoggedInUserPersistentComponent";
    }

    @Override // X.InterfaceC04003zj
    public long Axo() {
        return 86400000L;
    }

    @Override // X.InterfaceC09784ri
    public void Bo9() {
        A00(1);
    }
}
