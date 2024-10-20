package X;

import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.tigon.iface.TigonRequestBuilder;
import java.util.concurrent.Executor;
import org.apache.http.Header;

/* renamed from: X.40j, reason: invalid class name */
/* loaded from: 40j.class */
public final class C40j {
    public AndroidAsyncExecutorFactory A00;
    public Executor A01;
    public 1BY A02;
    public final C00i A05 = new 1BQ(32863);
    public final C00i A04 = new 1BQ(116220);
    public final C00i A03 = new 1BQ(16418);
    public final C00i A09 = new 1BQ(99934);
    public final C00i A06 = new 1BQ(32856);
    public final C00i A08 = new 1BQ(16385);
    public final C00i A07 = new 1BQ(32858);

    public C40j(1BO r302) {
        this.A02 = new 1BY(r302);
    }

    private 1E8 A00(String str) {
        C00i c00i = this.A03;
        if (c00i.get() != null) {
            return ((1Cy) c00i.get()).A02(1DU.A01, (1EI) null, str, 10);
        }
        0fH.A0o("VideoUploadExecutor", "null combinedThreadPool");
        throw AnonymousClass001.A0N("null combinedThreadPool");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r301.getEntity() == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C40o A01(org.apache.http.HttpRequest r301) {
        /*
            r0 = r301
            boolean r0 = r0 instanceof org.apache.http.HttpEntityEnclosingRequest
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            r0 = r301
            org.apache.http.HttpEntityEnclosingRequest r0 = (org.apache.http.HttpEntityEnclosingRequest) r0
            r301 = r0
            r0 = r301
            org.apache.http.HttpEntity r0 = r0.getEntity()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L1b:
            r0 = 0
            r301 = r0
        L1d:
            r0 = 0
            r305 = r0
            r0 = r301
            if (r0 == 0) goto L7c
            r0 = r301
            org.apache.http.HttpEntity r0 = r0.getEntity()
            r306 = r0
            r0 = r306
            long r0 = r0.getContentLength()
            r307 = r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r309 = r0
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 > 0) goto L48
            r0 = 1
            r303 = r0
        L48:
            java.lang.String r0 = "Unexpected request length while extracting body: %d"
            r304 = r0
            r0 = r303
            r1 = r304
            r2 = r307
            com.google.common.base.Preconditions.checkArgument(r0, r1, r2)
            r0 = 0
            r309 = r0
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L7c
            r0 = r307
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 >= 0) goto L7f
            X.40o r0 = new X.40o
            r305 = r0
            r0 = r305
            r0.<init>()
        L73:
            r0 = r306
            r1 = r305
            r0.writeTo(r1)
        L7c:
            r0 = r305
            return r0
        L7f:
            r0 = r307
            int r0 = (int) r0
            r302 = r0
            X.40o r0 = new X.40o
            r305 = r0
            r0 = r305
            r1 = r302
            r0.<init>(r1)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40j.A01(org.apache.http.HttpRequest):X.40o");
    }

    public static void A02(TigonRequestBuilder tigonRequestBuilder, Header header) {
        tigonRequestBuilder.A00(header.getName(), header.getValue() != null ? header.getValue() : "");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v6 ??, still in use, count: 2, list:
          (r313v6 ??) from 0x00ef: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v5 ??), (r313v6 ??) binds: [B:49:0x00e8, B:22:0x0090, B:46:0x00d1, B:39:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          (r313v6 ?? I:com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory) from 0x00b3: IPUT 
          (r313v6 ?? I:com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory)
          (r301v0 'this' ?? I:X.40j A[IMMUTABLE_TYPE, THIS])
         A[Catch: IllegalStateException -> 0x00b9, all -> 0x024e] X.40j.A00 com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory
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
    public com.facebook.tigon.TigonBodyProvider A03(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r313v6 ??, still in use, count: 2, list:
          (r313v6 ??) from 0x00ef: PHI (r313v2 ??) = (r313v1 ??), (r313v3 ??), (r313v5 ??), (r313v6 ??) binds: [B:49:0x00e8, B:22:0x0090, B:46:0x00d1, B:39:0x00b1] A[DONT_GENERATE, DONT_INLINE]
          (r313v6 ?? I:com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory) from 0x00b3: IPUT 
          (r313v6 ?? I:com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory)
          (r301v0 'this' ?? I:X.40j A[IMMUTABLE_TYPE, THIS])
         A[Catch: IllegalStateException -> 0x00b9, all -> 0x024e] X.40j.A00 com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory
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

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0327, code lost:
    
        if (r312.getEntity() == null) goto L62;
     */
    /* JADX WARN: Type inference failed for: r312v10, types: [com.facebook.tigon.iface.RedirectRequestInfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.tigon.iface.TigonRequestBuilder.TigonRequestImpl A04(X.AnonymousClass409 r302, X.C40y r303, int r304) {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40j.A04(X.409, X.40y, int):com.facebook.tigon.iface.TigonRequestBuilder$TigonRequestImpl");
    }
}
