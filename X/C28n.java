package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.28n, reason: invalid class name */
/* loaded from: 28n.class */
public final class C28n {
    public static HandlerThread A05;
    public static C28n A06;
    public static final Object A07 = new Object();
    public final Context A00;
    public final C2B7 A01;
    public final HashMap A02;
    public final 2B3 A03;
    public volatile Handler A04;

    public C28n() {
    }

    public C28n(Context context, Looper looper) {
        this.A02 = new HashMap();
        2B3 r0 = new 2B3(this);
        this.A03 = r0;
        this.A00 = context.getApplicationContext();
        this.A04 = new 2B6(looper, r0);
        this.A01 = C2B7.A00();
    }

    public static C28n A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new C28n(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public void A01(ComponentName componentName, ServiceConnection serviceConnection) {
        A02(serviceConnection, new 2Bl(componentName));
    }

    public final void A02(ServiceConnection serviceConnection, 2Bl r303) {
        IllegalStateException A0i;
        HashMap hashMap = this.A02;
        synchronized (hashMap) {
            2Bm r0 = (2Bm) hashMap.get(r303);
            if (r0 != null) {
                java.util.Map map = r0.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, r303), 5000L);
                    }
                } else {
                    A0i = 1BK.A0i("Trying to unbind a GmsServiceConnection  that was not bound before.  config=", r303.toString());
                }
            } else {
                A0i = 1BK.A0i("Nonexistent connection status for service config: ", r303.toString());
            }
            throw A0i;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v3 ??, still in use, count: 4, list:
          (r306v3 ??) from 0x0049: PHI (r306v2 ??) = (r306v1 ??), (r306v1 ??), (r306v1 ??), (r306v3 ??) binds: [B:49:0x00be, B:43:0x00a1, B:45:0x00a6, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r306v3 ?? I:X.2Bm) from 0x002b: IGET (r0v47 ?? I:java.util.Map) = (r306v3 ?? I:X.2Bm) A[Catch: all -> 0x00e1] X.2Bm.A05 java.util.Map
          (r306v3 ?? I:X.2Bm) from 0x003d: INVOKE (r306v3 ?? I:X.2Bm), (r304v0 ?? I:java.lang.String) VIRTUAL call: X.2Bm.A00(java.lang.String):void A[Catch: all -> 0x00e1]
          (r306v3 ?? I:java.lang.Object) from 0x0045: INVOKE (r0v1 ?? I:java.util.AbstractMap), (r303v0 ?? I:java.lang.Object), (r306v3 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00e1, MD:(K, V):V (c)]
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
    public final boolean A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v3 ??, still in use, count: 4, list:
          (r306v3 ??) from 0x0049: PHI (r306v2 ??) = (r306v1 ??), (r306v1 ??), (r306v1 ??), (r306v3 ??) binds: [B:49:0x00be, B:43:0x00a1, B:45:0x00a6, B:18:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r306v3 ?? I:X.2Bm) from 0x002b: IGET (r0v47 ?? I:java.util.Map) = (r306v3 ?? I:X.2Bm) A[Catch: all -> 0x00e1] X.2Bm.A05 java.util.Map
          (r306v3 ?? I:X.2Bm) from 0x003d: INVOKE (r306v3 ?? I:X.2Bm), (r304v0 ?? I:java.lang.String) VIRTUAL call: X.2Bm.A00(java.lang.String):void A[Catch: all -> 0x00e1]
          (r306v3 ?? I:java.lang.Object) from 0x0045: INVOKE (r0v1 ?? I:java.util.AbstractMap), (r303v0 ?? I:java.lang.Object), (r306v3 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x00e1, MD:(K, V):V (c)]
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
