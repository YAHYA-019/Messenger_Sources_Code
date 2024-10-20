package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: Cvn.class */
public final class Cvn implements C5ww {
    public final int A00;
    public final Object A01;

    public Cvn(B9H b9h, int i) {
        this.A00 = i;
        switch (i) {
            case 18:
            case 19:
            case 20:
                this.A01 = b9h;
                return;
            default:
                this.A01 = b9h;
                return;
        }
    }

    public Cvn(B9I b9i, int i) {
        this.A00 = i;
        switch (i) {
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
            case ActionId.QUEUEING_BEGIN /* 54 */:
            case ActionId.QUEUEING_SUCCESS /* 55 */:
            case ActionId.QUEUEING_FAIL /* 56 */:
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                this.A01 = b9i;
                return;
            default:
                this.A01 = b9i;
                return;
        }
    }

    public Cvn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Cvn A00(Object obj, int i) {
        return new Cvn(obj, i);
    }

    public static Cvn A01(Object obj, Object obj2, Object obj3, int i, boolean z) {
        return new Cvn(new CvW(i, obj, obj2, obj3, z), 94);
    }

    public static Object A02(Cvn cvn, Object obj) {
        11T.A0F(obj, 0);
        return cvn.A01;
    }

    public static void A03(AnonymousClass557 anonymousClass557, Object obj, int i) {
        anonymousClass557.A01 = new Cvn(obj, i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r329v10 ??, still in use, count: 5, list:
          (r329v10 ??) from 0x202b: PHI (r329v8 ??) = (r329v7 ??), (r329v10 ??) binds: [B:488:0x1f88, B:494:0x1fec] A[DONT_GENERATE, DONT_INLINE]
          (r329v10 ?? I:android.preference.Preference) from 0x1ff9: INVOKE (r329v10 ?? I:android.preference.Preference), (r1v280 ?? I:int) VIRTUAL call: android.preference.Preference.setLayoutResource(int):void A[MD:(int):void (c)]
          (r329v10 ?? I:android.preference.Preference) from 0x2003: INVOKE (r329v10 ?? I:android.preference.Preference), (r0v1773 ?? I:int) VIRTUAL call: android.preference.Preference.setOrder(int):void A[MD:(int):void (c)]
          (r329v10 ?? I:android.preference.Preference) from 0x201c: INVOKE (r329v10 ?? I:android.preference.Preference), (r0v1776 ?? I:android.preference.Preference$OnPreferenceClickListener) VIRTUAL call: android.preference.Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener):void A[MD:(android.preference.Preference$OnPreferenceClickListener):void (c)]
          (r329v10 ?? I:java.lang.Object) from 0x2025: INVOKE (r0v1741 ?? I:java.util.Map), (r0v1739 ?? I:java.lang.Object), (r329v10 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
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
    @Override // X.C5ww
    public final void onClick(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r329v10 ??, still in use, count: 5, list:
          (r329v10 ??) from 0x202b: PHI (r329v8 ??) = (r329v7 ??), (r329v10 ??) binds: [B:488:0x1f88, B:494:0x1fec] A[DONT_GENERATE, DONT_INLINE]
          (r329v10 ?? I:android.preference.Preference) from 0x1ff9: INVOKE (r329v10 ?? I:android.preference.Preference), (r1v280 ?? I:int) VIRTUAL call: android.preference.Preference.setLayoutResource(int):void A[MD:(int):void (c)]
          (r329v10 ?? I:android.preference.Preference) from 0x2003: INVOKE (r329v10 ?? I:android.preference.Preference), (r0v1773 ?? I:int) VIRTUAL call: android.preference.Preference.setOrder(int):void A[MD:(int):void (c)]
          (r329v10 ?? I:android.preference.Preference) from 0x201c: INVOKE (r329v10 ?? I:android.preference.Preference), (r0v1776 ?? I:android.preference.Preference$OnPreferenceClickListener) VIRTUAL call: android.preference.Preference.setOnPreferenceClickListener(android.preference.Preference$OnPreferenceClickListener):void A[MD:(android.preference.Preference$OnPreferenceClickListener):void (c)]
          (r329v10 ?? I:java.lang.Object) from 0x2025: INVOKE (r0v1741 ?? I:java.util.Map), (r0v1739 ?? I:java.lang.Object), (r329v10 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
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
