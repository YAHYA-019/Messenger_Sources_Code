package com.facebook.msys.mci;

import X.0Pz;
import X.0fH;
import X.1XV;
import X.1Xv;
import X.AnonymousClass001;
import X.C1iw;
import X.C1um;
import com.facebook.msys.mci.NotificationCenterInternal;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: NotificationCenterInternal.class */
public abstract class NotificationCenterInternal {
    public final Map A00;
    public final Map A01;
    public final Set A02;
    public NativeHolder mNativeHolder;

    /* loaded from: NotificationCenterInternal$NotificationCallbackInternal.class */
    public interface NotificationCallbackInternal {
        void onNewNotification(String str, 1Xv r2, Map map);
    }

    static {
        1XV.A00();
    }

    public NotificationCenterInternal() {
        this(false);
    }

    public NotificationCenterInternal(boolean z) {
        this.A00 = new HashMap();
        this.A01 = new HashMap();
        this.A02 = new HashSet();
        if (z) {
            return;
        }
        this.mNativeHolder = initNativeHolder();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v30 java.util.Set, still in use, count: 2, list:
          (r306v30 java.util.Set) from 0x0056: PHI (r306v4 java.util.Set) = (r306v30 java.util.Set) binds: [B:21:0x0049] A[DONT_GENERATE, DONT_INLINE]
          (r306v30 java.util.Set) from 0x0049: IF  (r306v30 java.util.Set) == (null java.util.Set)  -> B:124:0x0244 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public void A00(X.1Xv r302, com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.NotificationCenterInternal.A00(X.1Xv, com.facebook.msys.mci.NotificationCenterInternal$NotificationCallbackInternal, java.lang.String):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v12 ??, still in use, count: 2, list:
          (r307v12 ??) from 0x00ba: PHI (r307v5 ??) = (r307v4 ??), (r307v12 ??) binds: [B:31:0x0086, B:35:0x0096] A[DONT_GENERATE, DONT_INLINE]
          (r307v12 ?? I:java.lang.Object) from 0x0098: INVOKE (r0v8 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r307v12 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0125, MD:(K, V):V (c)]
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
    public void A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v12 ??, still in use, count: 2, list:
          (r307v12 ??) from 0x00ba: PHI (r307v5 ??) = (r307v4 ??), (r307v12 ??) binds: [B:31:0x0086, B:35:0x0096] A[DONT_GENERATE, DONT_INLINE]
          (r307v12 ?? I:java.lang.Object) from 0x0098: INVOKE (r0v8 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r307v12 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0125, MD:(K, V):V (c)]
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

    public void A02(NotificationCallbackInternal notificationCallbackInternal) {
        HashSet hashSet;
        HashMap hashMap;
        synchronized (this) {
            notificationCallbackInternal.getClass();
            Map map = this.A01;
            C1um c1um = (C1um) map.get(notificationCallbackInternal);
            if (c1um != null) {
                synchronized (c1um) {
                    hashSet = new HashSet(c1um.A01);
                    hashMap = new HashMap();
                    Iterator it = c1um.A00.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(it);
                        hashMap.put((1Xv) A0z.getKey(), new HashSet((Collection) A0z.getValue()));
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    A00(null, notificationCallbackInternal, (String) it2.next());
                }
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass001.A0z(it3);
                    1Xv r0 = (1Xv) A0z2.getKey();
                    Iterator it4 = ((Set) A0z2.getValue()).iterator();
                    while (it4.hasNext()) {
                        A00(r0, notificationCallbackInternal, AnonymousClass001.A0i(it4));
                    }
                }
                map.remove(notificationCallbackInternal);
            }
        }
    }

    public abstract void addObserverNative(String str, int i);

    public void dispatchNotificationToCallbacks(final String str, Long l, Object obj) {
        1Xv r310;
        if (obj != null && !(obj instanceof Map)) {
            throw 0Pz.A08("Native layer of msys reported a notification whose payload could not be serialized into a Java Map. Instead, it's of type ", AnonymousClass001.A0Y(obj));
        }
        final Map map = (Map) obj;
        final ArrayList arrayList = new ArrayList();
        synchronized (this) {
            r310 = l != null ? (1Xv) this.A00.get(l) : null;
            for (Map.Entry entry : this.A01.entrySet()) {
                C1um c1um = (C1um) entry.getValue();
                if (!c1um.A01.contains(str)) {
                    Set set = (Set) c1um.A00.get(r310);
                    if (set != null && set.contains(str)) {
                    }
                }
                arrayList.add((NotificationCallbackInternal) entry.getKey());
            }
        }
        0fH.A0Y(str, r310, obj, arrayList, "NotificationCenter", "Get notification %s with scope %s and payload %s, dispatching to %s");
        if (arrayList.isEmpty()) {
            return;
        }
        final 1Xv r1 = r310;
        Execution.executePossiblySync(new C1iw() { // from class: X.22e
            public static final String __redex_internal_original_name = "NotificationCenterInternal$2";

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("dispatchNotificationToCallbacks");
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((NotificationCenterInternal.NotificationCallbackInternal) it.next()).onNewNotification(str, r1, map);
                }
            }
        }, getAccountSession(), str.equals("MCIDatabaseCommitNotificationV2") ? Execution.getExecutionContext() : 1);
    }

    public abstract AccountSession getAccountSession();

    public abstract NativeHolder initNativeHolder();

    public abstract void postStrictNotificationNative(String str, int i);

    public abstract void removeObserverNative(String str);

    public void setNativeHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
