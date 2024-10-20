package X;

import android.app.Application;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.lang.Thread;
import java.util.HashMap;

/* renamed from: X.0kz, reason: invalid class name */
/* loaded from: 0kz.class */
public final class C0kz {
    public static C0kz A03;
    public C0hg A00;
    public 0RH A01;
    public final Application A02;

    public C0kz(Application application) {
        this.A02 = application;
    }

    public static C0kz A00() {
        C0kz c0kz;
        synchronized (C0kz.class) {
            c0kz = A03;
        }
        return c0kz;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x001a: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x000a, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:X.0kz) from 0x0017: SPUT (r303v3 ?? I:X.0kz) A[Catch: all -> 0x001e] X.0kz.A03 X.0kz
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
    public static X.C0kz A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x001a: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x000a, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:X.0kz) from 0x0017: SPUT (r303v3 ?? I:X.0kz) A[Catch: all -> 0x001e] X.0kz.A03 X.0kz
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

    public static void A02(C0kz c0kz, Throwable th) {
        C0hg c0hg = c0kz.A00;
        C15h c15h = c0hg == null ? null : c0hg.A0c;
        C15h c15h2 = c0hg == null ? null : c0hg.A0P;
        C15h c15h3 = c0hg == null ? null : c0hg.A0O;
        final String A04 = C0di.A00().A04();
        final HashMap A0u = AnonymousClass001.A0u();
        if (0cQ.A01() != null) {
            final C15h c15h4 = c15h;
            final C15h c15h5 = c15h2;
            final C15h c15h6 = c15h3;
            0cQ.A03(new C0cS() { // from class: X.0pr
                @Override // X.C0cS
                public int BMm(0cI r302, Thread thread, Throwable th2) {
                    C15h c15h7 = c15h4;
                    String str = null;
                    String A01 = c15h7 == null ? null : C15h.A01(c15h7);
                    C15h c15h8 = c15h5;
                    String A012 = c15h8 == null ? null : C15h.A01(c15h8);
                    C15h c15h9 = c15h6;
                    if (c15h9 != null) {
                        str = C15h.A02(c15h9);
                    }
                    DirectReports.A03(A01, A012, str, A04, th2, A0u);
                    return 0;
                }
            }, 100);
        } else {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            final C15h c15h7 = c15h;
            final C15h c15h8 = c15h2;
            final C15h c15h9 = c15h3;
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0h7
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th2) {
                    C15h c15h10 = c15h7;
                    String str = null;
                    String A01 = c15h10 == null ? null : C15h.A01(c15h10);
                    C15h c15h11 = c15h8;
                    String A012 = c15h11 == null ? null : C15h.A01(c15h11);
                    C15h c15h12 = c15h9;
                    if (c15h12 != null) {
                        str = C15h.A02(c15h12);
                    }
                    DirectReports.A03(A01, A012, str, A04, th2, A0u);
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th2);
                }
            });
        }
        0fH.A0u("MessengerLacrimaConfig", "Fallback error reporting", th);
        String str = null;
        c0kz.A00 = null;
        String A01 = c15h == null ? null : C15h.A01(c15h);
        String A012 = c15h2 == null ? null : C15h.A01(c15h2);
        if (c15h3 != null) {
            str = C15h.A02(c15h3);
        }
        DirectReports.A01(A01, A012, str, C0di.A00().A04(), "Lacrima", "Use fallback error handler", th);
    }
}
