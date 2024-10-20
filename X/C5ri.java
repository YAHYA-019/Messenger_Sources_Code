package X;

import android.graphics.Bitmap;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ri, reason: invalid class name */
/* loaded from: 5ri.class */
public final class C5ri implements C5pz {
    public final List A00 = new ArrayList();
    public final /* synthetic */ C10924uz A01;
    public final /* synthetic */ C5rg A02;
    public final /* synthetic */ FbUserSession A03;
    public final /* synthetic */ C5aA A04;
    public final /* synthetic */ C5rf A05;
    public final /* synthetic */ 5rY A06;
    public final /* synthetic */ NewMessageNotification A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public C5ri(C10924uz c10924uz, C5rg c5rg, FbUserSession fbUserSession, C5aA c5aA, C5rf c5rf, 5rY r307, NewMessageNotification newMessageNotification, String str, String str2, boolean z, boolean z2) {
        this.A06 = r307;
        this.A07 = newMessageNotification;
        this.A04 = c5aA;
        this.A0B = z;
        this.A0A = z2;
        this.A01 = c10924uz;
        this.A02 = c5rg;
        this.A03 = fbUserSession;
        this.A08 = str;
        this.A09 = str2;
        this.A05 = c5rf;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r332v16 ??, still in use, count: 2, list:
          (r332v16 ??) from 0x0416: PHI (r332v2 ??) = (r332v1 ??), (r332v16 ??) binds: [B:43:0x0332, B:92:0x040e] A[DONT_GENERATE, DONT_INLINE]
          (r332v16 ?? I:java.lang.Object) from 0x0410: INVOKE (r0v112 ?? I:java.util.Map), (r0v51 ?? I:java.lang.Object), (r332v16 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x1d1a, MD:(K, V):V (c)]
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r332v16 ??, still in use, count: 2, list:
          (r332v16 ??) from 0x0416: PHI (r332v2 ??) = (r332v1 ??), (r332v16 ??) binds: [B:43:0x0332, B:92:0x040e] A[DONT_GENERATE, DONT_INLINE]
          (r332v16 ?? I:java.lang.Object) from 0x0410: INVOKE (r0v112 ?? I:java.util.Map), (r0v51 ?? I:java.lang.Object), (r332v16 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x1d1a, MD:(K, V):V (c)]
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

    @Override // X.C5pz
    public void Blg() {
        ((5Zj) this.A06.A08.get()).A01(((MessagingNotification) this.A07).A02, "onBitmapFetchFailed", (String) null);
        this.A04.A01("fail");
        try {
            A00(null);
        } finally {
            2EU.A05(this.A00);
        }
    }

    @Override // X.C5pz
    public void BpV(2EU r302) {
        Bitmap bitmap = null;
        ((5Zj) this.A06.A08.get()).A01(((MessagingNotification) this.A07).A02, "onCloseableBitmapAvailable", (String) null);
        this.A04.A01(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
        List list = this.A00;
        list.add(r302);
        try {
            if (r302.A09() instanceof 2EY) {
                bitmap = ((2EY) r302.A09()).A04;
            }
            A00(bitmap);
        } finally {
            2EU.A05(list);
        }
    }
}
