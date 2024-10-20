package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.facebook.mqttlite.MqttService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1dd, reason: invalid class name */
/* loaded from: 1dd.class */
public final class C1dd {
    public final 1Br A00 = 1Bq.A00(65789);
    public final 1Br A01 = 1Bq.A00(100169);
    public final 05L A02;
    public final Set A03;

    public C1dd() {
        C01s c01s = (C01s) 1Bi.A03(16511);
        this.A03 = new HashSet();
        this.A02 = c01s == null ? 05L.A02 : new 05L(c01s);
    }

    private final void A00(ComponentName componentName) {
        Set set = this.A03;
        synchronized (set) {
            if (set.contains(componentName)) {
                return;
            }
            set.add(componentName);
            ((PackageManager) this.A01.A00.get()).setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    public static final void A01(Context context, Intent intent, C1dd c1dd) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            c1dd.A00(component);
            return;
        }
        11T.A0D(context);
        ComponentName componentName = new ComponentName(context, (Class<?>) MqttService.class);
        c1dd.A00(componentName);
        intent.setComponent(componentName);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v8 ??, still in use, count: 2, list:
          (r315v8 ??) from 0x00a6: PHI (r315v4 ??) = (r315v3 ??), (r315v8 ??) binds: [B:21:0x007d, B:30:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r315v8 ?? I:java.lang.Object) from 0x00a0: INVOKE (r0v46 ?? I:java.util.Map), (r0v39 ?? I:java.lang.Object), (r315v8 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x012f, MD:(K, V):V (c)]
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
    public final X.C1eg A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v8 ??, still in use, count: 2, list:
          (r315v8 ??) from 0x00a6: PHI (r315v4 ??) = (r315v3 ??), (r315v8 ??) binds: [B:21:0x007d, B:30:0x009e] A[DONT_GENERATE, DONT_INLINE]
          (r315v8 ?? I:java.lang.Object) from 0x00a0: INVOKE (r0v46 ?? I:java.util.Map), (r0v39 ?? I:java.lang.Object), (r315v8 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x012f, MD:(K, V):V (c)]
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

    public final void A03(Context context, Intent intent) {
        C01s c01s;
        String str;
        11T.A0F(context, 0);
        A01(context, intent, this);
        ComponentName component = intent.getComponent();
        if (component != null) {
            0fH.A0g(component.flattenToString(), "PushServiceTargetingHelper", "Calling stopService on component: %s");
        }
        05L r0 = this.A02;
        11T.A0D(r0);
        05S r02 = new 05S(context, (C01s) null, r0, (Boolean) null);
        05L r03 = r02.A01;
        Context context2 = r02.A00;
        String A00 = AnonymousClass000.A00(79);
        try {
            context2.stopService(intent);
        } catch (SecurityException e) {
            e = e;
            0fH.A0s(A00, "Failed to stopService", e);
            c01s = r03.A01;
            if (c01s != null) {
                str = "stopService SecurityException";
                c01s.softReport(A00, str, e);
            }
        } catch (RuntimeException e2) {
            e = e2;
            if (!AnonymousClass001.A1Y(e)) {
                throw e;
            }
            c01s = r03.A01;
            if (c01s != null) {
                str = "stopService DeadObjectException";
                c01s.softReport(A00, str, e);
            }
        }
    }

    public final void A04(ServiceConnection serviceConnection) {
        11T.A0F(serviceConnection, 0);
        try {
            1eM r0 = (1eM) this.A00.A00.get();
            synchronized (r0) {
                Iterator it = r0.A01.values().iterator();
                while (it.hasNext()) {
                    1eN r02 = (1eN) it.next();
                    Set set = r02.A03;
                    if (set.remove(serviceConnection) && set.isEmpty()) {
                        it.remove();
                        1Hu r03 = r0.A00;
                        ServiceConnection serviceConnection2 = r02.A02;
                        11T.A0F(serviceConnection2, 0);
                        r03.A00.unbindService(serviceConnection2);
                    }
                }
            }
        } catch (RuntimeException e) {
            0fH.A0r("PushServiceTargetingHelper", "Error unbinding to service", e);
        }
    }
}
