package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.facebook.messaging.montage.model.MontageBucket;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: I2w.class */
public final class I2w {
    public int A00;
    public int A01;
    public EAX A02;
    public DH9 A03;
    public HTw A04;
    public GWe A05;
    public Hpp A06;
    public ImmutableList A07;
    public 1Mu A08;
    public String A09;
    public List A0A;
    public int A0B;
    public MontageBucket A0C;
    public List A0D;
    public List A0E;
    public final Context A0F;
    public final AbR A0G;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A0M;
    public final C00i A0I = 1BQ.A02(83305);
    public final C00i A0H = AbH.A0Q();
    public final C00i A0J = 1BV.A00(622);

    public I2w(Context context) {
        this.A0L = DKD.A0W(context);
        this.A0G = (AbR) 1Bn.A0E(context, (1BY) null, 623);
        this.A0M = 7zL.A0R(context, 621);
        this.A0F = context;
        this.A0K = AbI.A0J(context);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 2, list:
          (r313v3 ??) from 0x01a3: PHI (r313v1 ??) = (r313v0 ??), (r313v3 ??) binds: [B:32:0x0171, B:38:0x0198] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:X.Hpp) from 0x01a0: IPUT (r313v3 ?? I:X.Hpp), (r303v0 ?? I:X.I2w) X.I2w.A06 X.Hpp
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
    public static void A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v3 ??, still in use, count: 2, list:
          (r313v3 ??) from 0x01a3: PHI (r313v1 ??) = (r313v0 ??), (r313v3 ??) binds: [B:32:0x0171, B:38:0x0198] A[DONT_GENERATE, DONT_INLINE]
          (r313v3 ?? I:X.Hpp) from 0x01a0: IPUT (r313v3 ?? I:X.Hpp), (r303v0 ?? I:X.I2w) X.I2w.A06 X.Hpp
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

    public void A01() {
        EAX eax = this.A02;
        if (eax == null || !eax.isShowing()) {
            return;
        }
        Window window = this.A02.getWindow();
        if (window != null) {
            if (0AU.A00(21)) {
                View decorView = window.getDecorView();
                11T.A0A(decorView);
                decorView.setOnSystemUiVisibilityChangeListener(null);
            }
            1tJ.A05(window, this.A01);
        }
        this.A02.dismiss();
        this.A02 = null;
    }
}
