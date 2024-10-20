package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import java.util.List;

/* renamed from: X.5rv, reason: invalid class name */
/* loaded from: 5rv.class */
public final class C5rv {
    public Uri A00;
    public Bundle A01 = new Bundle();
    public String A02;
    public final long A03;
    public final 5Ud A04;
    public final CharSequence A05;

    public C5rv(5Ud r302, CharSequence charSequence, long j) {
        this.A05 = charSequence;
        this.A03 = j;
        this.A04 = r302;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v3 ??, still in use, count: 5, list:
          (r314v3 ??) from 0x0172: PHI (r314v2 ??) = (r314v1 ??), (r314v3 ??), (r314v3 ??) binds: [B:77:0x016f, B:47:0x00f6, B:52:0x010b] A[DONT_GENERATE, DONT_INLINE]
          (r314v3 ??) from 0x0172: PHI (r314v2 ??) = (r314v1 ??), (r314v3 ??), (r314v3 ??) binds: [B:77:0x016f, B:47:0x00f6, B:52:0x010b] A[DONT_GENERATE, DONT_INLINE]
          (r314v3 ?? I:X.5rv) from 0x00e1: IPUT (r0v78 ?? I:java.lang.String), (r314v3 ?? I:X.5rv) A[Catch: ClassCastException -> 0x016e] X.5rv.A02 java.lang.String
          (r314v3 ?? I:X.5rv) from 0x00e8: IPUT (r0v82 ?? I:android.net.Uri), (r314v3 ?? I:X.5rv) A[Catch: ClassCastException -> 0x016e] X.5rv.A00 android.net.Uri
          (r314v3 ?? I:X.5rv) from 0x00fb: IGET (r0v70 ?? I:android.os.Bundle) = (r314v3 ?? I:X.5rv) A[Catch: ClassCastException -> 0x016e] X.5rv.A01 android.os.Bundle
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
    public static java.util.ArrayList A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r314v3 ??, still in use, count: 5, list:
          (r314v3 ??) from 0x0172: PHI (r314v2 ??) = (r314v1 ??), (r314v3 ??), (r314v3 ??) binds: [B:77:0x016f, B:47:0x00f6, B:52:0x010b] A[DONT_GENERATE, DONT_INLINE]
          (r314v3 ??) from 0x0172: PHI (r314v2 ??) = (r314v1 ??), (r314v3 ??), (r314v3 ??) binds: [B:77:0x016f, B:47:0x00f6, B:52:0x010b] A[DONT_GENERATE, DONT_INLINE]
          (r314v3 ?? I:X.5rv) from 0x00e1: IPUT (r0v78 ?? I:java.lang.String), (r314v3 ?? I:X.5rv) A[Catch: ClassCastException -> 0x016e] X.5rv.A02 java.lang.String
          (r314v3 ?? I:X.5rv) from 0x00e8: IPUT (r0v82 ?? I:android.net.Uri), (r314v3 ?? I:X.5rv) A[Catch: ClassCastException -> 0x016e] X.5rv.A00 android.net.Uri
          (r314v3 ?? I:X.5rv) from 0x00fb: IGET (r0v70 ?? I:android.os.Bundle) = (r314v3 ?? I:X.5rv) A[Catch: ClassCastException -> 0x016e] X.5rv.A01 android.os.Bundle
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

    public static Bundle[] A01(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return bundleArr;
            }
            C5rv c5rv = (C5rv) list.get(i2);
            Bundle bundle = new Bundle();
            CharSequence charSequence = c5rv.A05;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", c5rv.A03);
            5Ud r0 = c5rv.A04;
            if (r0 != null) {
                bundle.putCharSequence("sender", r0.A01);
                bundle.putParcelable("sender_person", C5se.A00(r0));
            }
            String str = c5rv.A02;
            if (str != null) {
                bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            }
            Uri uri = c5rv.A00;
            if (uri != null) {
                bundle.putParcelable(TraceFieldType.Uri, uri);
            }
            bundle.putBundle(Location.EXTRAS, c5rv.A01);
            bundleArr[i2] = bundle;
            i = i2 + 1;
        }
    }
}
