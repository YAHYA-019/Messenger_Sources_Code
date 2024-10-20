package X;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.TransactionTooLargeException;
import com.facebook.analytics2.logger.legacy.uploader.AlarmBasedUploadService;
import java.util.Arrays;

/* renamed from: X.1l7, reason: invalid class name */
/* loaded from: 1l7.class */
public final class C1l7 {
    public static C1l7 A02;
    public static final String A03 = AlarmBasedUploadService.class.getName();
    public final Context A00;
    public volatile String A01;

    public C1l7(Context context) {
        this.A00 = context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x001f: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000a, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:X.1l7) from 0x001c: SPUT (r303v2 ?? I:X.1l7) A[Catch: all -> 0x0023] X.1l7.A02 X.1l7
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
    public static X.C1l7 A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v2 ??, still in use, count: 2, list:
          (r303v2 ??) from 0x001f: PHI (r303v1 ??) = (r303v0 ??), (r303v2 ??) binds: [B:6:0x000a, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]
          (r303v2 ?? I:X.1l7) from 0x001c: SPUT (r303v2 ?? I:X.1l7) A[Catch: all -> 0x0023] X.1l7.A02 X.1l7
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
        String str;
        Throwable th;
        String str2;
        String A00 = 01X.A00();
        synchronized (this) {
            if (this.A01 == null) {
                String str3 = A03;
                String str4 = null;
                try {
                    Context context = this.A00;
                    ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 516).services;
                    if (serviceInfoArr != null) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            if (((PackageItemInfo) serviceInfo).name.equals(str3)) {
                                str4 = ((ComponentInfo) serviceInfo).processName;
                                break;
                            }
                        }
                    }
                    0fH.A14("UploadServiceProcessUtil", "Unable to find the UploadService! Services registered: %s", new Object[]{Arrays.deepToString(serviceInfoArr)});
                } catch (PackageManager.NameNotFoundException e) {
                    0fH.A12("UploadServiceProcessUtil", "Package %s cannot  be found!", e, new Object[]{this.A00.getPackageName()});
                } catch (RuntimeException e2) {
                    Throwable th2 = e2;
                    while (true) {
                        th = th2;
                        if (th.getCause() == null) {
                            break;
                        }
                        th2 = th.getCause();
                    }
                    if (th instanceof DeadObjectException) {
                        str2 = "DeadObjectException when trying to get package manager from context";
                    } else {
                        if (!(th instanceof TransactionTooLargeException)) {
                            throw e2;
                        }
                        str2 = "TransactionTooLargeException Exception when trying to get package manager from context";
                    }
                    0fH.A0r("UploadServiceProcessUtil", str2, e2);
                }
                this.A01 = str4;
            }
            str = this.A01;
        }
        if (str == null) {
            return false;
        }
        return str.equals(A00);
    }
}
