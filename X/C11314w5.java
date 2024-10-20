package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4w5.class */
public final class C11314w5 implements 1UN {
    public 1BY A00;
    public final C11344w8 A02;
    public final 4wJ A03;
    public final ImmutableSet A04;
    public final java.util.Map A07;
    public final java.util.Map A08;
    public final FbUserSession A09;
    public final C11334w7 A0A;
    public final java.util.Map A0B;
    public final Class A05 = getClass();
    public final ClassLoader A06 = AbstractC11324w6.class.getClassLoader();
    public final C00i A01 = new 1BQ(16511);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x02fb, code lost:
    
        if (r0 == 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0326  */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.4w7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C11314w5(X.1BO r302, com.facebook.auth.usersession.FbUserSession r303) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11314w5.<init>(X.1BO, com.facebook.auth.usersession.FbUserSession):void");
    }

    public static void A00(Uri uri, C11314w5 c11314w5, boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (c11314w5) {
            for (Map.Entry entry : c11314w5.A0B.entrySet()) {
                if (A02(uri, (Uri) entry.getKey())) {
                    arrayList.addAll(((WeakHashMap) entry.getValue()).keySet());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C4Zz) it.next()).Bnd(uri, c11314w5, z);
        }
    }

    public static void A01(C11314w5 c11314w5, 4wL r302, Set set) {
        synchronized (c11314w5) {
            c11314w5.A08.put(r302, set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                4wC r0 = (4wC) it.next();
                java.util.Map map = c11314w5.A07;
                Uri uri = r0.A01;
                SortedSet sortedSet = (SortedSet) map.get(uri);
                if (sortedSet == null) {
                    Comparator comparator = 4wC.A02;
                    comparator.getClass();
                    new TreeSet(comparator);
                }
                sortedSet.add(r0);
                map.put(uri, sortedSet);
            }
        }
    }

    public static boolean A02(Uri uri, Uri uri2) {
        String authority = uri.getAuthority();
        authority.getClass();
        boolean z = false;
        if (authority.equals(uri2.getAuthority())) {
            List<String> pathSegments = uri.getPathSegments();
            List<String> pathSegments2 = uri2.getPathSegments();
            if (pathSegments.size() >= pathSegments2.size()) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= pathSegments2.size()) {
                        z = true;
                        break;
                    }
                    if (!pathSegments.get(i2).equals(pathSegments2.get(i2))) {
                        break;
                    }
                    i = i2 + 1;
                }
            }
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v20 ??, still in use, count: 2, list:
          (r303v20 ??) from 0x01ed: PHI (r303v18 ??) = (r303v17 ??), (r303v20 ??) binds: [B:122:0x01dd, B:125:0x01e9] A[DONT_GENERATE, DONT_INLINE]
          (r303v20 ?? I:java.lang.Object) from 0x01ea: IPUT (r303v20 ?? I:java.lang.Object), (r0v27 ?? I:X.5rW) A[Catch: all -> 0x0254, 5D6 -> 0x0259] X.5rW.A00 java.lang.Object
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
    public java.lang.Object A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v20 ??, still in use, count: 2, list:
          (r303v20 ??) from 0x01ed: PHI (r303v18 ??) = (r303v17 ??), (r303v20 ??) binds: [B:122:0x01dd, B:125:0x01e9] A[DONT_GENERATE, DONT_INLINE]
          (r303v20 ?? I:java.lang.Object) from 0x01ea: IPUT (r303v20 ?? I:java.lang.Object), (r0v27 ?? I:X.5rW) A[Catch: all -> 0x0254, 5D6 -> 0x0259] X.5rW.A00 java.lang.Object
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

    public void A04(Uri uri, C4Zz c4Zz) {
        synchronized (this) {
            java.util.Map map = this.A0B;
            WeakHashMap weakHashMap = (WeakHashMap) map.get(uri);
            if (weakHashMap == null) {
                new WeakHashMap();
            }
            weakHashMap.put(c4Zz, true);
            map.put(uri, weakHashMap);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v19 ??, still in use, count: 2, list:
          (r309v19 ??) from 0x022c: PHI (r309v18 ??) = (r309v17 ??), (r309v19 ??) binds: [B:126:0x0214, B:130:0x0224] A[DONT_GENERATE, DONT_INLINE]
          (r309v19 ?? I:java.lang.Object) from 0x0226: INVOKE (r0v131 ?? I:java.util.Map), (r0v127 ?? I:java.lang.Object), (r309v19 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x034c, 5D6 -> 0x03da, MD:(K, V):V (c)]
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
    public void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v19 ??, still in use, count: 2, list:
          (r309v19 ??) from 0x022c: PHI (r309v18 ??) = (r309v17 ??), (r309v19 ??) binds: [B:126:0x0214, B:130:0x0224] A[DONT_GENERATE, DONT_INLINE]
          (r309v19 ?? I:java.lang.Object) from 0x0226: INVOKE (r0v131 ?? I:java.util.Map), (r0v127 ?? I:java.lang.Object), (r309v19 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x034c, 5D6 -> 0x03da, MD:(K, V):V (c)]
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

    public void AFz() {
        4wJ r0;
        4wL r02;
        synchronized (this) {
            this.A08.clear();
            this.A07.clear();
            ImmutableSet immutableSet = this.A04;
            1Du it = immutableSet.iterator();
            while (it.hasNext()) {
                ((4wC) it.next()).A00();
            }
            r0 = this.A03;
            r02 = r0.A08;
            A01(this, r02, immutableSet);
        }
        if (((2yD) 1Bi.A03(16385)).AZk(36326360943777278L)) {
            C11334w7 c11334w7 = this.A0A;
            c11334w7.getClass();
            r0.A0D.remove(c11334w7);
            ConcurrentMap concurrentMap = r0.A0B;
            concurrentMap.remove(1000000000);
            concurrentMap.remove(1000000001);
        }
        if (r0.A0F) {
            Message obtain = Message.obtain((Handler) null, 1);
            ConcurrentMap concurrentMap2 = r0.A0C;
            if (!concurrentMap2.isEmpty()) {
                obtain.arg1 = r02.A01;
                r0.A01.post(new 5Qd(obtain, r0));
            }
            concurrentMap2.clear();
            r0.A01.post(new 4wN(r0));
        }
    }
}
