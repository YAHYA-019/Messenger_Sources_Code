package X;

import com.facebook.zero.protocol.params.FetchZeroTokenRequestParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: X.3zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zs.class */
public final class C04043zs extends AbstractC04053zt implements 1Ro {
    public static final String __redex_internal_original_name = "FetchZeroTokenMethod";
    public final C00i A02 = new 1BQ(16520);
    public final C00i A00 = new 1BQ(16511);
    public final C00i A01 = new 1BQ(16385);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if ("debug_graphql_verification".equals(r302) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean A00(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A01
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36310675730269035(0x81005e0075036b, double:3.026355770953008E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L35
            java.lang.String r0 = "debug_graphql_verification"
            r1 = r302
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r303 = r0
            r0 = r308
            if (r0 == 0) goto L38
        L35:
            r0 = 1
            r307 = r0
        L38:
            r0 = r307
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04043zs.A00(java.lang.String):java.lang.Boolean");
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        FetchZeroTokenRequestParams fetchZeroTokenRequestParams = (FetchZeroTokenRequestParams) obj;
        ArrayList A00 = AbstractC04053zt.A00(fetchZeroTokenRequestParams);
        str = "true";
        A00.add(new BasicNameValuePair("dialtone_enabled", fetchZeroTokenRequestParams.A03 ? str : "false"));
        A00.add(new BasicNameValuePair("needs_backup_rules", fetchZeroTokenRequestParams.A02 ? "true" : "false"));
        A00.add(new BasicNameValuePair("token_hash", fetchZeroTokenRequestParams.A00));
        A00.add(new BasicNameValuePair("request_reason", fetchZeroTokenRequestParams.A01));
        0fH.A07(C04043zs.class, A00.toString(), "Requesting zero rating token with params: %s");
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = "fetchZeroToken";
        c04083zw.A0J = A00;
        c04083zw.A0E = "POST";
        c04083zw.A0F = "mobile_zero_campaign";
        Integer num = 0S2.A01;
        c04083zw.A06 = num;
        c04083zw.A05(num);
        C04083zw.A00(c04083zw);
        return new C04103zy(c04083zw);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public /* bridge */ /* synthetic */ java.lang.Object B7m(
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
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
