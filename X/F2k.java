package X;

import com.facebook.acra.constants.ActionId;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* loaded from: F2k.class */
public abstract class F2k {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v1 ??, still in use, count: 5, list:
          (r303v1 ??) from 0x03a4: PHI (r303v11 ??) = (r303v1 ??), (r303v12 ??) binds: [B:269:0x03a4, B:12:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          (r303v1 ?? I:X.FA0) from 0x005f: IPUT (r0v219 ?? I:java.lang.String), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A01 java.lang.String
          (r303v1 ?? I:X.FA0) from 0x02cc: IPUT (r1v18 ?? I:java.util.List), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A03 java.util.List
          (r303v1 ?? I:X.FA0) from 0x034d: IPUT (r1v11 ?? I:java.util.HashMap), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A02 java.util.HashMap
          (r303v1 ?? I:X.FA0) from 0x036c: IPUT (r0v38 ?? I:long), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A00 long
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
    public static X.FA0 A00(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v1 ??, still in use, count: 5, list:
          (r303v1 ??) from 0x03a4: PHI (r303v11 ??) = (r303v1 ??), (r303v12 ??) binds: [B:269:0x03a4, B:12:0x03a3] A[DONT_GENERATE, DONT_INLINE]
          (r303v1 ?? I:X.FA0) from 0x005f: IPUT (r0v219 ?? I:java.lang.String), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A01 java.lang.String
          (r303v1 ?? I:X.FA0) from 0x02cc: IPUT (r1v18 ?? I:java.util.List), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A03 java.util.List
          (r303v1 ?? I:X.FA0) from 0x034d: IPUT (r1v11 ?? I:java.util.HashMap), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A02 java.util.HashMap
          (r303v1 ?? I:X.FA0) from 0x036c: IPUT (r0v38 ?? I:long), (r303v1 ?? I:X.FA0) A[Catch: Exception -> 0x03a6, IOException -> 0x03b2] X.FA0.A00 long
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

    public static String A01(FA0 fa0) {
        StringWriter stringWriter = new StringWriter();
        3sP A07 = EaT.A00.A07(stringWriter);
        A07.A0b();
        String str = fa0.A01;
        A07.A0o("status");
        A07.A0r(str);
        A07.A0o("identity_mapping");
        A07.A0a();
        for (Rax rax : fa0.A03) {
            if (rax != null) {
                A07.A0b();
                String str2 = rax.A00;
                A07.A0o("source_identity_id");
                A07.A0r(str2);
                A07.A0o("destination_identities");
                A07.A0a();
                for (Rb0 rb0 : rax.A01) {
                    if (rb0 != null) {
                        A07.A0b();
                        String str3 = rb0.A00;
                        A07.A0o("identity_id");
                        A07.A0r(str3);
                        String str4 = rb0.A01;
                        A07.A0o("identity_type");
                        A07.A0r(str4);
                        String str5 = rb0.A02;
                        A07.A0o("obfuscated_identity_id");
                        A07.A0r(str5);
                        A07.A0o("surface_to_xpost_eligibilities");
                        A07.A0a();
                        for (RU8 ru8 : rb0.A03) {
                            if (ru8 != null) {
                                A07.A0b();
                                String str6 = ru8.A01;
                                A07.A0o("surface");
                                A07.A0r(str6);
                                boolean z = ru8.A02;
                                A07.A0o("is_eligible");
                                A07.A0v(z);
                                String str7 = ru8.A00;
                                A07.A0o("ineligible_reason");
                                A07.A0r(str7);
                                A07.A0Y();
                            }
                        }
                        A07.A0X();
                        A07.A0Y();
                    }
                }
                A07.A0X();
                A07.A0Y();
            }
        }
        A07.A0X();
        A07.A0o(AnonymousClass000.A00(ActionId.LEGACY_MARKER));
        A07.A0b();
        Iterator A0x = AnonymousClass001.A0x(fa0.A02);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            11T.A0F(A0z, 1);
            A07.A0o(String.valueOf(A0z.getKey()));
            if (A0z.getValue() == null) {
                A07.A0Z();
            } else {
                A07.A0r(1BK.A16(A0z));
            }
        }
        A07.A0Y();
        long j = fa0.A00;
        A07.A0o("last_update_time_ms");
        A07.A0g(j);
        A07.A0Y();
        A07.close();
        return stringWriter.toString();
    }
}
