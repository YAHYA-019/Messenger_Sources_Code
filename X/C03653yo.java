package X;

import android.content.Context;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.3yo, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yo.class */
public final class C03653yo {
    public static C03653yo A02;
    public static final Set A03;
    public static final String[] A04;
    public final Context A00;
    public final boolean A01;

    static {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        A03 = treeSet;
        A04 = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        treeSet.add("com.instagram.android");
    }

    public C03653yo(Context context) {
        this.A01 = !A03.contains(context.getApplicationContext().getPackageName());
        this.A00 = context.getApplicationContext();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x001a: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x000a, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:X.3yo) from 0x0017: SPUT (r303v3 ?? I:X.3yo) A[Catch: all -> 0x001e] X.3yo.A02 X.3yo
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
    public static X.C03653yo A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v3 ??, still in use, count: 2, list:
          (r303v3 ??) from 0x001a: PHI (r303v2 ??) = (r303v1 ??), (r303v3 ??) binds: [B:6:0x000a, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]
          (r303v3 ?? I:X.3yo) from 0x0017: SPUT (r303v3 ?? I:X.3yo) A[Catch: all -> 0x001e] X.3yo.A02 X.3yo
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

    public boolean A01() {
        String[] strArr = A04;
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                if (this.A00.checkCallingOrSelfPermission(strArr[i]) == 0) {
                    z = true;
                    break;
                }
            } catch (Throwable th) {
                0fH.A0r("GeoApiAppPermissionChecker", "Runtime exception in accessing OS permissions [%s]", th);
            }
            i++;
            if (i >= 2) {
                break;
            }
        }
        return z;
    }

    public boolean A02() {
        boolean z = false;
        try {
            if (this.A00.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                z = true;
            }
            return z;
        } catch (Throwable th) {
            0fH.A0r("GeoApiAppPermissionChecker", "Runtime exception in accessing OS permissions [%s]", th);
            return false;
        }
    }
}
