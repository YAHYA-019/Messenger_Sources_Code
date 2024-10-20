package X;

import android.os.Handler;
import com.facebook.acra.constants.ActionId;

/* loaded from: E8v.class */
public final class E8v extends DSj {
    public DLQ A00;
    public final Handler A01;
    public final FyG A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E8v(X.FyG r302, X.DLQ r303, int r304) {
        /*
            r301 = this;
            X.Ebe r0 = new X.Ebe
            r305 = r0
            r0 = r305
            r1 = r304
            r0.<init>(r1)
            r0 = r302
            android.util.SparseArray r0 = r0.A01
            r1 = 2131362440(0x7f0a0288, float:1.834466E38)
            java.lang.Object r0 = r0.get(r1)
            r0 = r301
            r1 = r305
            r0.<init>(r1)
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A00 = r1
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r305 = r0
            X.DNb r0 = new X.DNb
            r306 = r0
            r0 = r306
            r1 = r305
            r2 = r301
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r306
            r0.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E8v.<init>(X.FyG, X.DLQ, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public void BlZ(
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public /* bridge */ /* synthetic */ void A0C(C2lb c2lb) {
        GJj A0t;
        DLQ A06 = ((Ek4) ((DTD) c2lb).A00).A01.A06(ActionId.APP_WILL_ENTER_FOREGROUND);
        if (A06 == null || A06.A05 != 13366 || (A0t = DKC.A0t(A06)) == null) {
            return;
        }
        FGp.A00();
        Handler handler = this.A01;
        handler.sendMessage(handler.obtainMessage(0, A0t));
    }

    public /* bridge */ /* synthetic */ void A0F(C2lb c2lb) {
        GJj A0u;
        DLQ A06 = ((Ek4) ((DTD) c2lb).A00).A01.A06(ActionId.APP_WILL_ENTER_FOREGROUND);
        if (A06 == null || A06.A05 != 13366 || (A0u = DKC.A0u(A06)) == null) {
            return;
        }
        FGp.A00();
        Handler handler = this.A01;
        handler.sendMessage(handler.obtainMessage(0, A0u));
    }
}
