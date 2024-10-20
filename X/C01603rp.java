package X;

import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.config.GraphQLConsistencyConfig;
import com.facebook.graphservice.fb.GraphQLConsistencyJNI;
import com.facebook.graphservice.fb.GraphQLServiceJNI;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.3rp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3rp.class */
public final class C01603rp {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A05 = new 1BV((1BY) null, 16669);
    public final 0QO A02 = new 0QO(1);
    public final 0QO A03 = new 0QO(1);
    public final 0QO A04 = new 0QO(1);

    public C01603rp(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        2yD r0 = (2yD) 1Bi.A03(16386);
        if (r0.AZk(2324148816959257764L)) {
            int Auy = (int) r0.Auy(18587282722330126L);
            fbUserSession.BKF();
            if (TextUtils.isEmpty(fbUserSession.BKF().mAuthToken)) {
                ((C01s) 1Bi.A03(16511)).D0w("GraphQLEmptyTokenException", "The Session used to create an FBGraphServiceFactory has a null authToken.", Auy);
            }
        }
    }

    public static GraphQLConsistencyJNI A00(C01603rp c01603rp, String str, boolean z) {
        int i;
        synchronized (c01603rp) {
            C00j.A05("FBGraphServiceFactory.getGraphQLConsistency", 637196250);
            try {
                GraphServiceAsset graphServiceAsset = GraphServiceAsset.getInstance(str);
                0QO r0 = c01603rp.A02;
                if (r0.containsKey(graphServiceAsset.mConfig.rootBuildConfigName)) {
                    GraphQLConsistencyJNI graphQLConsistencyJNI = (GraphQLConsistencyJNI) r0.get(graphServiceAsset.mConfig.rootBuildConfigName);
                    graphQLConsistencyJNI.getClass();
                    C00j.A01(-761747394);
                    return graphQLConsistencyJNI;
                }
                1BY r02 = c01603rp.A00;
                Executor executor = (Executor) 1Bn.A0G(r02, 16455);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16465);
                GraphQLConsistencyConfig graphQLConsistencyConfig = (GraphQLConsistencyConfig) 1Bn.A0G(r02, 32810);
                1G1 A04 = 1Fw.A04((1EZ) 1Bn.A0G(r02, 16428));
                1G1 r03 = c01603rp.A01;
                if (!r03.equals(A04)) {
                    AnonymousClass047 ACu = ((AnonymousClass046) c01603rp.A05.get()).ACu("pando_consistency_mismatch_user_error", 817905517);
                    1G1 r04 = r03;
                    ACu.A8K("factory_userId_hash", r04.A07 ? ConstantsKt.CAMERA_ID_FRONT : Integer.toString(r04.A05.hashCode()));
                    1G1 r05 = A04;
                    ACu.A8K("local_userId_hash", r05.A07 ? ConstantsKt.CAMERA_ID_FRONT : Integer.toString(r05.A05.hashCode()));
                    ACu.A8L("isPropagatingSession", z);
                    ACu.report();
                }
                C3rr c3rr = (C3rr) 1Lo.A09(A04, r02, 115440);
                C00j.A05("FBGraphServiceFactory.getPandoConsistencyService", -395174981);
                try {
                    PandoConsistencyServiceJNI pandoConsistencyServiceJNI = c3rr.A00.consistencyService;
                    C00j.A01(1296899416);
                    Executor executor2 = (Executor) 1Bn.A0G(r02, 16454);
                    C00j.A05("FBGraphServiceFactory.getAuthToken", 1968039068);
                    try {
                        String str2 = "No Auth Token";
                        String str3 = r03.BKF().mAuthToken;
                        if (str3 != null) {
                            int length = str3.length();
                            if (length > 5) {
                                str2 = str3.substring(length - 5);
                            }
                        }
                        C0es c0es = (C0es) 1Bn.A0G(r02, 83607);
                        if (c0es != null) {
                            c0es.AXB();
                            c0es.AXF();
                            1JF.A07("|", new Object[]{c0es.AXB(), c0es.AXF()});
                        }
                        C00j.A01(225746369);
                        try {
                            GraphQLConsistencyJNI graphQLConsistencyJNI2 = new GraphQLConsistencyJNI(graphServiceAsset, executor, scheduledExecutorService, graphQLConsistencyConfig, pandoConsistencyServiceJNI, false, str2, executor2);
                            C00j.A05("FBGraphServiceFactory.registerDiskTrimmable", -398204772);
                            try {
                                ((2HR) 1Bi.A03(16948)).CcG(graphQLConsistencyJNI2);
                                C00j.A01(-1185002859);
                                r0.put(graphServiceAsset.mConfig.rootBuildConfigName, graphQLConsistencyJNI2);
                                if (pandoConsistencyServiceJNI != null) {
                                    C00j.A05("FBGraphServiceFactory.setPublishPostProcessor", 1901420222);
                                    try {
                                        pandoConsistencyServiceJNI.setPublishPostProcessor(graphQLConsistencyJNI2);
                                        C00j.A01(-195308041);
                                    } catch (Throwable th) {
                                        th = th;
                                        i = 971629122;
                                        C00j.A01(i);
                                        throw th;
                                    }
                                }
                                C00j.A01(267699191);
                                return graphQLConsistencyJNI2;
                            } catch (Throwable th2) {
                                th = th2;
                                i = 266810202;
                            }
                        } catch (Exception e) {
                            th = e;
                            0fH.A0x("graph_store_initialize", "Failed to create GraphQLConsistency", th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i = 754851629;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    i = 851903617;
                }
            } catch (Throwable th5) {
                C00j.A01(-525124056);
                throw th5;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v6 ??, still in use, count: 3, list:
          (r307v6 ??) from 0x046c: PHI (r307v7 ??) = (r307v2 ??), (r307v6 ??), (r307v9 ??) binds: [B:206:0x00bc, B:173:0x046a, B:24:0x006e] A[DONT_GENERATE, DONT_INLINE]
          (r307v6 ?? I:java.lang.Object) from 0x0442: INVOKE (r0v198 ?? I:X.0QO), (r0v202 ?? I:java.lang.Object), (r307v6 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: Exception -> 0x0476, all -> 0x04a9]
          (r307v6 ?? I:java.lang.Object) from 0x0463: INVOKE (r0v188 ?? I:X.0QO), (r0v192 ?? I:java.lang.Object), (r307v6 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: Exception -> 0x0476, all -> 0x04a9]
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
    public static com.facebook.graphservice.fb.GraphQLServiceJNI A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v6 ??, still in use, count: 3, list:
          (r307v6 ??) from 0x046c: PHI (r307v7 ??) = (r307v2 ??), (r307v6 ??), (r307v9 ??) binds: [B:206:0x00bc, B:173:0x046a, B:24:0x006e] A[DONT_GENERATE, DONT_INLINE]
          (r307v6 ?? I:java.lang.Object) from 0x0442: INVOKE (r0v198 ?? I:X.0QO), (r0v202 ?? I:java.lang.Object), (r307v6 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: Exception -> 0x0476, all -> 0x04a9]
          (r307v6 ?? I:java.lang.Object) from 0x0463: INVOKE (r0v188 ?? I:X.0QO), (r0v192 ?? I:java.lang.Object), (r307v6 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: Exception -> 0x0476, all -> 0x04a9]
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

    public GraphQLConsistencyJNI A02(String str) {
        GraphQLConsistencyJNI A00;
        synchronized (this) {
            C00j.A05("FBGraphServiceFactory.getGraphQLConsistency", 1802099141);
            try {
                A00 = A00(this, str, false);
                C00j.A01(1063186807);
            } catch (Throwable th) {
                C00j.A01(-2038297541);
                throw th;
            }
        }
        return A00;
    }

    public GraphQLServiceJNI A03(String str) {
        GraphQLServiceJNI A01;
        synchronized (this) {
            C00j.A05("FBGraphServiceFactory.getGraphQLService", -148019243);
            try {
                A01 = A01(this, str, false);
                C00j.A01(173169123);
            } catch (Throwable th) {
                C00j.A01(1063455027);
                throw th;
            }
        }
        return A01;
    }
}
