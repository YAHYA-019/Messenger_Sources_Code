package com.facebook.resources.impl.logger;

import X.0D7;
import X.1Bq;
import X.1Br;
import X.2R2;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: DrawableCounterLogger.class */
public final class DrawableCounterLogger {
    public int A00;
    public 2R2 A01;
    public final 1Br A04 = 1Bq.A00(16467);
    public final 1Br A07 = 1Bq.A00(67196);
    public final 1Br A06 = 1Bq.A00(17093);
    public final 1Br A03 = 1Bq.A00(16387);
    public final 1Br A05 = 1Bq.A00(16634);
    public final Object A08 = new Object();
    public Map A02 = new HashMap();

    public static final void A00(final DrawableCounterLogger drawableCounterLogger, long j) {
        synchronized (drawableCounterLogger.A08) {
            if (drawableCounterLogger.A00 >= j) {
                final 2R2 r0 = drawableCounterLogger.A01;
                if (r0 != null && ((0D7) r0).A00.isSampled()) {
                    final Map map = drawableCounterLogger.A02;
                    if (map.size() != 0 && ((0D7) r0).A00.isSampled()) {
                        ((Executor) drawableCounterLogger.A04.A00.get()).execute(new Runnable() { // from class: X.3hw
                            public static final String __redex_internal_original_name = "DrawableCounterLogger$log$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                JSONArray jSONArray = new JSONArray();
                                Iterator A0y = AnonymousClass001.A0y(map);
                                while (A0y.hasNext()) {
                                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                                    3OL r02 = (3OL) A0z.getKey();
                                    int A03 = AnonymousClass001.A03(A0z.getValue());
                                    JSONObject A12 = AnonymousClass001.A12();
                                    try {
                                        String str = r02.A01;
                                        if (str != null) {
                                            A12.put(ErrorReportingConstants.ENDPOINT, str);
                                        }
                                        Resources resources = (Resources) 1Br.A0B(drawableCounterLogger.A07);
                                        int i = r02.A00;
                                        A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, resources.getResourceEntryName(i));
                                        A12.put("count", A03);
                                        A12.put("resource_id", i);
                                        jSONArray.put(A12);
                                    } catch (Resources.NotFoundException | JSONException unused) {
                                    }
                                }
                                if (jSONArray.length() != 0) {
                                    String A02 = 11T.A02(jSONArray);
                                    2R2 r03 = r0;
                                    r03.A0E("asset_counts", A02);
                                    r03.BZL();
                                }
                            }
                        });
                    }
                    drawableCounterLogger.A02 = new HashMap(drawableCounterLogger.A02.size());
                    drawableCounterLogger.A00 = 0;
                }
                drawableCounterLogger.A01 = null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v25 ??, still in use, count: 2, list:
          (r303v25 ??) from 0x009a: PHI (r303v3 ??) = (r303v2 ??), (r303v25 ??) binds: [B:12:0x0051, B:26:0x0096] A[DONT_GENERATE, DONT_INLINE]
          (r303v25 ?? I:X.2R2) from 0x0097: IPUT 
          (r303v25 ?? I:X.2R2)
          (r301v0 'this' ?? I:com.facebook.resources.impl.logger.DrawableCounterLogger A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0180] com.facebook.resources.impl.logger.DrawableCounterLogger.A01 X.2R2
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
    public final void A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r303v25 ??, still in use, count: 2, list:
          (r303v25 ??) from 0x009a: PHI (r303v3 ??) = (r303v2 ??), (r303v25 ??) binds: [B:12:0x0051, B:26:0x0096] A[DONT_GENERATE, DONT_INLINE]
          (r303v25 ?? I:X.2R2) from 0x0097: IPUT 
          (r303v25 ?? I:X.2R2)
          (r301v0 'this' ?? I:com.facebook.resources.impl.logger.DrawableCounterLogger A[IMMUTABLE_TYPE, THIS])
         A[Catch: all -> 0x0180] com.facebook.resources.impl.logger.DrawableCounterLogger.A01 X.2R2
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
