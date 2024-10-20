package X;

import android.content.Context;
import android.os.StrictMode;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0il, reason: invalid class name */
/* loaded from: 0il.class */
public final class C0il {
    public static boolean A00 = true;
    public static int A01;
    public static int A02;
    public static Context A03;
    public static C0jb A04;
    public static C0ms A05;
    public static volatile C0ib[] A0C;
    public static final ReentrantReadWriteLock A08 = new ReentrantReadWriteLock();
    public static final AtomicInteger A07 = new AtomicInteger(0);
    public static final Set A06 = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final java.util.Map A0A = AnonymousClass001.A0u();
    public static final Set A0B = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final java.util.Map A09 = AnonymousClass001.A0u();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r304v5 */
    /* JADX WARN: Type inference failed for: r304v6 */
    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i = A02;
            boolean A1N = AnonymousClass001.A1N(i & 2);
            if ((i & 256) != 0) {
                A1N = (A1N ? 1 : 0) | 4;
            }
            if ((i & 128) == 0) {
                A1N = (A1N ? 1 : 0) | '\b';
            }
            AnonymousClass001.A1L(reentrantReadWriteLock);
            return A1N;
        } catch (Throwable th) {
            AnonymousClass001.A1L(reentrantReadWriteLock);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0ib[]] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0ib] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock] */
    public static File A01(String str) {
        ?? r0;
        A04();
        try {
            String mapLibraryName = System.mapLibraryName(str);
            ReentrantReadWriteLock reentrantReadWriteLock = A08;
            r0 = reentrantReadWriteLock.readLock();
            r0.lock();
            try {
                ?? r02 = A0C;
                int length = r02.length;
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        AnonymousClass001.A1M(reentrantReadWriteLock);
                        new FileNotFoundException(mapLibraryName);
                        break;
                    }
                    r0 = r02[i2];
                    File A062 = r0.A06(mapLibraryName);
                    if (A062 != null) {
                        AnonymousClass001.A1M(reentrantReadWriteLock);
                        return A062;
                    }
                    i = i2 + 1;
                }
            } catch (Throwable th) {
                th = th;
                AnonymousClass001.A1M(reentrantReadWriteLock);
            }
            throw th;
        } catch (IOException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public static String A02() {
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.readLock().lock();
        try {
            A04();
            ArrayList A0s = AnonymousClass001.A0s();
            C0ib[] c0ibArr = A0C;
            if (c0ibArr != null) {
                for (C0ib c0ib : c0ibArr) {
                    c0ib.A02(A0s);
                }
            }
            String join = TextUtils.join(":", A0s);
            C0l8.A00("SoLoader", 0Pz.A0W("makeLdLibraryPath final path: ", join));
            return join;
        } finally {
            AnonymousClass001.A1M(reentrantReadWriteLock);
        }
    }

    public static String A03(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = null;
            if (A0C != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (str2 != null) {
                        break;
                    }
                    if (i2 >= A0C.length) {
                        break;
                    }
                    str2 = A0C[i2].A08(str);
                    i = i2 + 1;
                }
            }
            AnonymousClass001.A1M(reentrantReadWriteLock);
            return str2;
        } catch (Throwable th) {
            AnonymousClass001.A1M(reentrantReadWriteLock);
            throw th;
        }
    }

    public static void A04() {
        if (!A09()) {
            throw AnonymousClass001.A0N("SoLoader.init() not yet called");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v10 ??, still in use, count: 2, list:
          (r304v10 ??) from 0x03d8: PHI (r304v9 ??) = (r304v2 ??), (r304v4 ??), (r304v6 ??), (r304v10 ??) binds: [B:248:0x03d4, B:242:0x03c3, B:192:0x02d7, B:102:0x0237] A[DONT_GENERATE, DONT_INLINE]
          (r304v10 ?? I:java.lang.Object) from 0x0230: INVOKE (r0v263 ?? I:java.lang.String) = (r304v10 ?? I:java.lang.Object), (r0v261 ?? I:java.lang.String), (r0v260 ?? I:java.lang.StringBuilder) STATIC call: X.001.A0Z(java.lang.Object, java.lang.String, java.lang.StringBuilder):java.lang.String A[Catch: all -> 0x04d6, MD:(java.lang.Object, java.lang.String, java.lang.StringBuilder):java.lang.String (m)]
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
    public static void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r304v10 ??, still in use, count: 2, list:
          (r304v10 ??) from 0x03d8: PHI (r304v9 ??) = (r304v2 ??), (r304v4 ??), (r304v6 ??), (r304v10 ??) binds: [B:248:0x03d4, B:242:0x03c3, B:192:0x02d7, B:102:0x0237] A[DONT_GENERATE, DONT_INLINE]
          (r304v10 ?? I:java.lang.Object) from 0x0230: INVOKE (r0v263 ?? I:java.lang.String) = (r304v10 ?? I:java.lang.Object), (r0v261 ?? I:java.lang.String), (r0v260 ?? I:java.lang.StringBuilder) STATIC call: X.001.A0Z(java.lang.Object, java.lang.String, java.lang.StringBuilder):java.lang.String A[Catch: all -> 0x04d6, MD:(java.lang.Object, java.lang.String, java.lang.StringBuilder):java.lang.String (m)]
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

    public static void A06(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        AtomicReference atomicReference = 0gW.A00;
        0gY[] r0 = (0gY[]) atomicReference.get();
        if (r0 != null) {
            int length = r0.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                r0[i3].C3y(str, i);
                i2 = i3 + 1;
            }
        }
        try {
            boolean A0A2 = A0A(threadPolicy, str, null, null, i | 1);
            0gY[] r02 = (0gY[]) atomicReference.get();
            if (r02 == null) {
                return;
            }
            int length2 = r02.length;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= length2) {
                    return;
                }
                r02[i5].C3x((Throwable) null, A0A2);
                i4 = i5 + 1;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                0gY[] r03 = (0gY[]) atomicReference.get();
                if (r03 != null) {
                    int length3 = r03.length;
                    int i6 = 0;
                    while (true) {
                        int i7 = i6;
                        if (i7 >= length3) {
                            break;
                        }
                        r03[i7].C3x(th, false);
                        i6 = i7 + 1;
                    }
                }
                throw th2;
            }
        }
    }

    public static void A07(C0ib c0ib) {
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.writeLock().lock();
        try {
            A04();
            c0ib.A09(A00());
            C0ib[] c0ibArr = new C0ib[A0C.length + 1];
            c0ibArr[0] = c0ib;
            System.arraycopy(A0C, 0, c0ibArr, 1, A0C.length);
            A0C = c0ibArr;
            A07.getAndIncrement();
            C0l8.A00("SoLoader", AnonymousClass001.A0Z(c0ib, "Prepended to SO sources: ", AnonymousClass001.A0k()));
        } finally {
            AnonymousClass001.A1L(reentrantReadWriteLock);
        }
    }

    public static void A08(ArrayList arrayList) {
        String str = 0iL.A00() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = 0Pz.A0j(str2, ":", str);
        }
        Iterator it = AnonymousClass001.A0w(str.split(":")).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            C0l8.A00("SoLoader", 0Pz.A0W("adding system library source: ", str3));
            arrayList.add(new C13i(new File(str3), 2));
        }
    }

    public static boolean A09() {
        boolean z = true;
        if (A0C != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = A08;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A0C == null) {
                z = false;
            }
            AnonymousClass001.A1M(reentrantReadWriteLock);
            return z;
        } catch (Throwable th) {
            AnonymousClass001.A1M(reentrantReadWriteLock);
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v0 ??, still in use, count: 2, list:
          (r317v0 ??) from 0x00b0: PHI (r317v1 ??) = (r317v0 ??), (r317v2 ??) binds: [B:4857:0x00c4, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
          (r317v0 ?? I:java.lang.Object) from 0x00c6: INVOKE (r0v27 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r317v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x8115, MD:(K, V):V (c)]
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
    public static boolean A0A(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v0 ??, still in use, count: 2, list:
          (r317v0 ??) from 0x00b0: PHI (r317v1 ??) = (r317v0 ??), (r317v2 ??) binds: [B:4857:0x00c4, B:38:0x00a7] A[DONT_GENERATE, DONT_INLINE]
          (r317v0 ?? I:java.lang.Object) from 0x00c6: INVOKE (r0v27 ?? I:java.util.Map), (r303v0 ?? I:java.lang.Object), (r317v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x8115, MD:(K, V):V (c)]
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

    public static boolean A0B(String str) {
        return A00 ? A0C(str, 0) : C0gh.A03(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x3818, code lost:
    
        if (r301.equals(r303) != false) goto L1042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x3cd5, code lost:
    
        if (r0 != null) goto L1259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x3cda, code lost:
    
        return r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x1d24, code lost:
    
        if (r312 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x2623, code lost:
    
        if (r301.equals(r312) == false) goto L45;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:51:0x00b9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1206:0x364f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x3abc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x2729  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x3a51  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x39af  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x3ad4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x3a69  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x39d5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x3852  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x3a9d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x39ed  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x3743  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x37a1  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x341c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x3536  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x348f  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x3a39  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x35fc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x26a1  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x30f5  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x359b  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x3724  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x32a1  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x3187  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x2fc1  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x33e1  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x3894  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x3367  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x2b0f  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x38dd  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x297d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x1d1c  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x3921  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x2f01  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x3909  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x3a1a  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x3614  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2d1e  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2de4  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x2ebf  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x396a  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x2bdd  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x3130  */
    /* JADX WARN: Removed duplicated region for block: B:932:0x35e4  */
    /* JADX WARN: Type inference failed for: r0v1330, types: [java.lang.Object, X.0MU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(java.lang.String r301, int r302) {
        /*
            Method dump skipped, instructions count: 15801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0il.A0C(java.lang.String, int):boolean");
    }
}
