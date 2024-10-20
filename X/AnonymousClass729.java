package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.data.SendTamXMAMessageParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.729, reason: invalid class name */
/* loaded from: 729.class */
public final class AnonymousClass729 implements 5Q4 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final Context A07;
    public final FbUserSession A08;
    public final C1AJ A09;

    /* JADX WARN: Type inference failed for: r0v14, types: [X.1AJ, java.lang.Object] */
    public AnonymousClass729(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A07 = context;
        this.A08 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 65962);
        this.A01 = 1Bu.A00(115941);
        this.A06 = 1Bq.A00(65630);
        this.A09 = new Object();
        this.A05 = 1Bu.A00(116182);
        this.A04 = 1Bq.A00(16385);
        this.A00 = 1Bq.A00(16387);
        this.A03 = 1Bq.A00(68243);
    }

    public final void A00(Bitmap bitmap, 6AO r303, 7TA r304, SendTamXMAMessageParams sendTamXMAMessageParams, Boolean bool, Long l, Number number, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, long j) {
        Ilq ilq = new Ilq(r303, r304, this, sendTamXMAMessageParams, bool, l, number, str7, str, str5, str6, str2, str3, str4, str8, list, j);
        if (bitmap != null) {
            ilq.A00(bitmap, null, number, "image/jpeg", null);
            return;
        }
        String str9 = sendTamXMAMessageParams.A0E;
        Uri uri = null;
        if (!"null".equals(str9) && str9 != null) {
            try {
                uri = C0A2.A03(str9);
            } catch (SecurityException unused) {
            }
        }
        if (uri != null) {
            if (!sendTamXMAMessageParams.A0I) {
                ArrayList A0s = AnonymousClass001.A0s();
                2IA A01 = 2IA.A01(uri);
                5Q7 r0 = new 5Q7();
                ((2rA) r0).A08 = true;
                ((2rA) r0).A0A = true;
                A01.A04 = new C06804hy(r0);
                A0s.add(A01.A04());
                String str10 = sendTamXMAMessageParams.A0B;
                if (str10 != null) {
                    try {
                        Uri A03 = C0A2.A03(str10);
                        if (A03 != null) {
                            2IA A012 = 2IA.A01(A03);
                            5Q7 r02 = new 5Q7();
                            ((2rA) r02).A08 = true;
                            ((2rA) r02).A0A = true;
                            A012.A04 = new C06804hy(r02);
                            A0s.add(A012.A04());
                        }
                    } catch (SecurityException unused2) {
                    }
                }
                ((I4Y) 1Br.A0B(this.A01)).A03(ilq, A0s);
                return;
            }
            if (!1Br.A07(this.A04).AZk(36323019458693266L)) {
                2EU A032 = ((2DX) 1Br.A0B(this.A06)).A03(1, 1);
                try {
                    ilq.BMi(11T.A03(A032.A09()), 11T.A03("image/bmp"));
                    A032.close();
                    return;
                } catch (Throwable th) {
                    2EU.A04(A032);
                    throw th;
                }
            }
        }
        C0ty c0ty = C0ty.A00;
        List singletonList = Collections.singletonList("image/jpeg");
        11T.A0A(singletonList);
        ilq.BMi(c0ty, singletonList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
    
        if (((X.7T7) r301.A03.A00.get()).A02(r0.A02) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BQg(X.C5fv r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r302
            boolean r0 = r0 instanceof X.5gC
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L43
            r0 = r302
            X.5gC r0 = (X.5gC) r0
            r302 = r0
            r0 = r302
            X.6Bu r0 = r0.A01
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L43
            r0 = r301
            X.1Br r0 = r0.A03
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.7T7 r0 = (X.7T7) r0
            r305 = r0
            r0 = r302
            java.lang.CharSequence r0 = r0.A02
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.A02(r1)
            r306 = r0
            r0 = 1
            r304 = r0
            r0 = r306
            if (r0 == 0) goto L47
        L43:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L47:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass729.BQg(X.5fv):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v9 ??, still in use, count: 2, list:
          (r318v9 ??) from 0x00f8: PHI (r318v8 ??) = (r318v7 ??), (r318v9 ??) binds: [B:78:0x00f3, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          (r318v9 ?? I:org.json.JSONArray) from 0x00ec: INVOKE (r318v9 ?? I:org.json.JSONArray), (r0v244 ?? I:java.lang.Object) VIRTUAL call: org.json.JSONArray.put(java.lang.Object):org.json.JSONArray A[Catch: JSONException -> 0x047c, MD:(java.lang.Object):org.json.JSONArray (c)]
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
    public void Ckt(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v9 ??, still in use, count: 2, list:
          (r318v9 ??) from 0x00f8: PHI (r318v8 ??) = (r318v7 ??), (r318v9 ??) binds: [B:78:0x00f3, B:31:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          (r318v9 ?? I:org.json.JSONArray) from 0x00ec: INVOKE (r318v9 ?? I:org.json.JSONArray), (r0v244 ?? I:java.lang.Object) VIRTUAL call: org.json.JSONArray.put(java.lang.Object):org.json.JSONArray A[Catch: JSONException -> 0x047c, MD:(java.lang.Object):org.json.JSONArray (c)]
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
}
