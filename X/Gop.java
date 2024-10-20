package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.messaging.montage.model.MontageBucket;
import com.facebook.messaging.montage.model.MontageCard;

/* loaded from: Gop.class */
public final class Gop extends IXY {
    public MontageCard A00;
    public final Context A01;

    public Gop(ViewGroup viewGroup, Hao hao) {
        super(viewGroup, hao, 2131367258);
        this.A01 = viewGroup.getContext();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v5 ??, still in use, count: 2, list:
          (r317v5 ??) from 0x01c0: PHI (r317v4 ??) = (r317v3 ??), (r317v5 ??) binds: [B:34:0x0146, B:40:0x01b1] A[DONT_GENERATE, DONT_INLINE]
          (r317v5 ?? I:X.Hpp) from 0x01bd: IPUT (r317v5 ?? I:X.Hpp), (r0v18 ?? I:com.facebook.messaging.montage.viewer.seensheet.MontageViewerSeenHeadsView) com.facebook.messaging.montage.viewer.seensheet.MontageViewerSeenHeadsView.A01 X.Hpp
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v5 ??, still in use, count: 2, list:
          (r317v5 ??) from 0x01c0: PHI (r317v4 ??) = (r317v3 ??), (r317v5 ??) binds: [B:34:0x0146, B:40:0x01b1] A[DONT_GENERATE, DONT_INLINE]
          (r317v5 ?? I:X.Hpp) from 0x01bd: IPUT (r317v5 ?? I:X.Hpp), (r0v18 ?? I:com.facebook.messaging.montage.viewer.seensheet.MontageViewerSeenHeadsView) com.facebook.messaging.montage.viewer.seensheet.MontageViewerSeenHeadsView.A01 X.Hpp
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

    public void A07(MontageBucket montageBucket, HhX hhX) {
        super.A07(montageBucket, hhX);
        MontageBucket montageBucket2 = ((IXY) this).A01;
        if (montageBucket2 == null || GOn.A0o(montageBucket2) == null) {
            return;
        }
        MontageCard A0o = GOn.A0o(((IXY) this).A01);
        this.A00 = A0o;
        if (A0o.A0M) {
            A00(GOq.A0R(this.A01));
        } else {
            DKG.A1J(((IXY) this).A00);
        }
    }

    public void A08(MontageCard montageCard) {
        super.A08(montageCard);
        this.A00 = montageCard;
        A00(GOq.A0R(this.A01));
    }
}
