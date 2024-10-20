package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.inject.FbInjector;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.4bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bi.class */
public final class C04624bi {
    public static final ImmutableList A0D = ImmutableList.of((Object) "MESSENGER_ADS");
    public Context A00;
    public final FbUserSession A01;
    public final C00i A04;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final 4cP A09;
    public final C04684bo A0A;
    public final C00i A02 = new 1BQ(16511);
    public final C00i A03 = new 1BV(49260);
    public final C00i A05 = new 1BV(49181);
    public final C00i A0C = new 1BQ(33032);
    public final C00i A0B = new 1BQ(16824);

    public C04624bi(FbUserSession fbUserSession) {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A06 = new 1HH(A00, 65728);
        this.A04 = new 1BQ(16488);
        this.A01 = fbUserSession;
        82O r0 = (82O) 1Bn.A0A(65588);
        C1F6 c1f6 = (C1F6) 1Bn.A0A(998);
        Integer num = 1Lo.A05;
        this.A07 = new 1MV(fbUserSession, 49178);
        this.A0A = r0.A0C(fbUserSession, "MESSENGER_INBOX2_ADS");
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            4cP r02 = new 4cP("", "");
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A09 = r02;
            this.A08 = new 1MV(fbUserSession, 49183);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public static C3sa A00(C04624bi c04624bi) {
        C30G c30g = new C30G(56);
        c30g.A06("square_profile_pic_size_big", ((1qF) c04624bi.A0B.get()).A00(80));
        c30g.A03("deviceId", ((1H2) c04624bi.A0C.get()).A02());
        c30g.A03("serviceType", "MESSENGER_INBOX2");
        c30g.A03("fetch_type", "REGULAR");
        c30g.A07("specific_units", A0D);
        c30g.A08("separate_ads_fetch_enabled", true);
        C3sa A00 = C3sa.A00(c30g);
        ((C3sb) A00).A03 = 0L;
        A00.A0B = false;
        return A00;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r337v28 ??, still in use, count: 3, list:
          (r337v28 ??) from 0x0ff7: PHI (r337v29 ??) = (r337v28 ??), (r337v33 ??) binds: [B:529:0x0fdc, B:534:0x0ff1] A[DONT_GENERATE, DONT_INLINE]
          (r337v28 ?? I:java.util.AbstractCollection) from 0x0fd5: INVOKE (r0v926 ?? I:boolean) = (r337v28 ?? I:java.util.AbstractCollection), (r0v923 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.contains(java.lang.Object):boolean A[Catch: all -> 0x1815, MD:(java.lang.Object):boolean (c)]
          (r337v28 ?? I:java.util.Collection) from 0x0fe8: INVOKE (r0v970 ?? I:java.util.HashSet), (r337v28 ?? I:java.util.Collection) DIRECT call: java.util.HashSet.<init>(java.util.Collection):void A[Catch: all -> 0x1815, MD:(java.util.Collection<? extends E>):void (c)]
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
    public static X.4oF A01(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r337v28 ??, still in use, count: 3, list:
          (r337v28 ??) from 0x0ff7: PHI (r337v29 ??) = (r337v28 ??), (r337v33 ??) binds: [B:529:0x0fdc, B:534:0x0ff1] A[DONT_GENERATE, DONT_INLINE]
          (r337v28 ?? I:java.util.AbstractCollection) from 0x0fd5: INVOKE (r0v926 ?? I:boolean) = (r337v28 ?? I:java.util.AbstractCollection), (r0v923 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.contains(java.lang.Object):boolean A[Catch: all -> 0x1815, MD:(java.lang.Object):boolean (c)]
          (r337v28 ?? I:java.util.Collection) from 0x0fe8: INVOKE (r0v970 ?? I:java.util.HashSet), (r337v28 ?? I:java.util.Collection) DIRECT call: java.util.HashSet.<init>(java.util.Collection):void A[Catch: all -> 0x1815, MD:(java.util.Collection<? extends E>):void (c)]
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

    public static 4oF A02(C04624bi c04624bi) {
        int i;
        GraphQLResult graphQLResult;
        int i2;
        C3sa A00 = A00(c04624bi);
        C00j.A05("makeRequest", -1305526996);
        try {
            AbstractC05414dq A09 = 1VX.A09(c04624bi.A00, c04624bi.A01);
            A00.A05 = new 1iF(2429843100654746L);
            graphQLResult = (GraphQLResult) AbstractC05474dx.A01(C05464dw.class, A09.A03(A00));
            0fH.A0j("InboxAdsFetcherWithUnitStore", "Server fetch succeeded");
            C00j.A01(1213256531);
            C00j.A05("writeResultToDatabase", -556414380);
        } catch (Throwable th) {
            th = th;
            i = 16550783;
        }
        try {
            2JX r0 = (2JX) ((AbstractC08294mh) graphQLResult).A03;
            if (r0 != null) {
                2JX A0L = r0.A0L(-816631278, 2JX.class, -2070691926);
                if (A0L != null) {
                    2JX A0L2 = A0L.A0L(-794200758, 2JX.class, 932176944);
                    if (A0L2 != null) {
                        SQLiteDatabase AUF = ((C04724bs) c04624bi.A07.get()).AUF();
                        C01m.A01(AUF, 1495253828);
                        try {
                            C04684bo c04684bo = c04624bi.A0A;
                            c04684bo.A00();
                            1Du it = A0L2.A0c(104993457, 2JX.class, -1575321092).iterator();
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (!it.hasNext()) {
                                    break;
                                }
                                2JX r02 = (2JX) it.next();
                                String A0r = r02.A0r(3355);
                                if (A0r != null) {
                                    String A2O = r02.A2O();
                                    if (A2O != null) {
                                        SQLiteDatabase AUF2 = c04684bo.A03.AUF();
                                        ContentValues contentValues = new ContentValues();
                                        try {
                                            ByteBuffer serializeTreeToByteBuffer = 2tS.A04("fbandroid").serializeTreeToByteBuffer(2JX.A04(r02));
                                            byte[] bArr = new byte[serializeTreeToByteBuffer.remaining()];
                                            serializeTreeToByteBuffer.get(bArr);
                                            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0r);
                                            contentValues.put("pos", Integer.valueOf(i4));
                                            contentValues.put("before_threads", (Boolean) false);
                                            contentValues.put("tree_blob", bArr);
                                            contentValues.put("update_ts_ms", Long.valueOf(r02.getTimeValue(815119367)));
                                            contentValues.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A2O);
                                            contentValues.put("service_type", c04684bo.A04);
                                            contentValues.put("service_subkey", "");
                                            contentValues.put("service_tertiary_key", "");
                                            C01m.A00(-19796299);
                                            AUF2.replaceOrThrow("units", null, contentValues);
                                            C01m.A00(2101376115);
                                        } catch (IOException e) {
                                            0fH.A0r("InboxUnitStoreReaderWriter", "Unable to serialize inbox unit tree to database", e);
                                        }
                                        i3 = i4 + 1;
                                    }
                                }
                                1BK.A09(c04684bo.A01).D0v("InboxUnitStoreReaderWriter", "Trying to write incomplete unit to database.");
                                i3 = i4 + 1;
                            }
                            C00i c00i = c04624bi.A08;
                            C04954cf c04954cf = (C04954cf) c00i.get();
                            4cP r03 = c04624bi.A09;
                            c04954cf.A03(new 1G3(4cP.A00(r03, "last_successful_fetch_ms")), ((AbstractC08294mh) graphQLResult).A00);
                            ((C04954cf) c00i.get()).A04(new 1G3(4cP.A00(r03, "last_successful_cache_key")), A00.A02.B5f(A00, (4cQ) c04624bi.A05.get()));
                            ((C04954cf) c00i.get()).A04(new 1G3(4cP.A00(r03, "is_db_invalidated")), ConstantsKt.CAMERA_ID_FRONT);
                            AUF.setTransactionSuccessful();
                            0fH.A0j("InboxAdsFetcherWithUnitStore", "writeResultToDatabase");
                            C01m.A03(AUF, 725869350);
                            i2 = -2032546776;
                            C00j.A01(i2);
                            return A01(EnumC08284mf.A06, r0, c04624bi);
                        } catch (Throwable th2) {
                            C01m.A03(AUF, -1697369794);
                            throw th2;
                        }
                    }
                }
            }
            1BK.A09(c04624bi.A02).D0v("InboxAdsFetcherWithUnitStore", "Null result from server");
            i2 = -1376336673;
            C00j.A01(i2);
            return A01(EnumC08284mf.A06, r0, c04624bi);
        } catch (Throwable th3) {
            th = th3;
            i = 572893961;
            C00j.A01(i);
            throw th;
        }
    }
}
