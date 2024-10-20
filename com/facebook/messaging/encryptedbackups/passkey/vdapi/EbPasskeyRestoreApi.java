package com.facebook.messaging.encryptedbackups.passkey.vdapi;

import X.0AI;
import X.0AN;
import X.0DR;
import X.0DT;
import X.0Pz;
import X.0QD;
import X.0fH;
import X.10N;
import X.11T;
import X.1BK;
import X.1H2;
import X.7zT;
import X.83Q;
import X.9GV;
import X.AHX;
import X.AQg;
import X.AQt;
import X.AVJ;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.BTf;
import X.C07v;
import X.C1x8;
import X.C2049DaC;
import X.C2s7;
import X.C4O5;
import X.C87v;
import X.C9af;
import X.DKB;
import X.EUZ;
import X.FEV;
import X.Fwt;
import X.Jt2;
import X.KNh;
import X.KSC;
import X.Kjm;
import X.Kvy;
import X.KxO;
import X.L20;
import X.LuN;
import X.M0s;
import X.M6P;
import X.M6Q;
import X.M6R;
import X.M6y;
import X.M9I;
import X.M9J;
import X.M9K;
import X.MCO;
import X.RQV;
import android.content.Context;
import android.os.CancellationSignal;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: EbPasskeyRestoreApi.class */
public final class EbPasskeyRestoreApi {
    public C87v A00;
    public final C1x8 A01;
    public final L20 A02;
    public final 1H2 A03;
    public final Kvy A04;

    public EbPasskeyRestoreApi(C1x8 c1x8, L20 l20, 1H2 r304, Kvy kvy) {
        7zT.A1W(c1x8, r304, kvy, l20);
        this.A01 = c1x8;
        this.A03 = r304;
        this.A04 = kvy;
        this.A02 = l20;
    }

    public static final Object A00(Context context, C87v c87v, C9af c9af, Set set, 0DR r305) {
        String str = C2s7.__redex_internal_original_name;
        C2s7 c2s7 = new C2s7(1, 0DT.A02(r305));
        c2s7.A0F();
        c2s7.BQE(new AVJ(new CancellationSignal(), 20));
        if (c9af != null) {
            c9af.A00("BLOKS_ASSERTION_FLOW_START");
        }
        KNh kNh = KNh.A03;
        LinkedHashMap A1C = 1BK.A1C();
        AQt aQt = new AQt(c2s7, c9af, 48);
        AQt aQt2 = new AQt(c2s7, c9af, 49);
        83Q r0 = new 83Q(c2s7, c9af, 32);
        AQg aQg = new AQg(c9af, c2s7, 0);
        M6P m6p = M6P.A00;
        11T.A0F(context, 0);
        11T.A0F(m6p, 8);
        C2049DaC A00 = EUZ.A00(context);
        SecurityProviderEphemeral.A01 = false;
        RQV rqv = (RQV) SecurityProviderEphemeral.A00.invoke();
        String str2 = null;
        synchronized (rqv) {
            SecurityProviderEphemeral securityProviderEphemeral = rqv.A00;
            KSC.A00 = securityProviderEphemeral.A00();
            M6y m6y = new M6y(m6p, securityProviderEphemeral, 42);
            Kjm kjm = new Kjm();
            String str3 = kNh.value;
            Map map = kjm.A02;
            map.put("entry_point", str3);
            BitSet bitSet = kjm.A00;
            bitSet.set(0);
            if (!set.isEmpty()) {
                map.put("allowable_credentials", set);
            }
            map.put(DKB.A00(362), null);
            if (c87v != null) {
                Jt2 jt2 = (Jt2) c87v.A00;
                if (jt2 != null) {
                    str2 = jt2.A00();
                }
            }
            map.put("prf_input_first", str2);
            FEV A002 = LuN.A00(kjm, aQt2, 4);
            Map map2 = kjm.A01;
            map2.put("on_flow_success", A002);
            map2.put("on_flow_error", LuN.A00(kjm, r0, 2));
            map2.put("on_flow_cancel", LuN.A00(kjm, aQg, 1));
            map2.put("on_flow_no_available_credentials", LuN.A00(kjm, aQt, 3));
            map2.put("on_entry_point_payments_autofill_success", LuN.A00(kjm, m6y, 0));
            if (!A1C.isEmpty()) {
                map.put("logging_params", A1C);
            }
            Fwt fwt = new Fwt(0);
            if (bitSet.nextClearBit(0) < 1) {
                throw AnonymousClass001.A0N(AbstractC00603o4.A00(14));
            }
            C4O5.A01(fwt, "com.bloks.www.bloks.caa.passkey.assertion.async", map, map2).A00(context, A00);
        }
        BTf.A00(context, new AQg(c9af, c2s7, 1));
        return c2s7.A0C();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(X.C2b1 r301, X.C9af r302, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A01(X.2b1, X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(X.C9af r301, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A02(X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi, X.0DR):java.lang.Object");
    }

    public static final C07v A03(9GV r301) {
        return 0AI.A05(0AI.A08(new M0s(KxO.A00, 6), 0AI.A05(0AI.A08(M9K.A00, 0AI.A04(M6R.A00, 0QD.A03(r301.A00))))));
    }

    public static final 0AN A04(9GV r301) {
        return 0AI.A08(M9J.A00, 0AI.A05(0AI.A08(new M0s(KxO.A00, 5), 0AI.A05(0AI.A08(M9I.A00, new 10N(new AHX(4), 0AI.A04(M6Q.A00, 0QD.A03(r301.A00))))))));
    }

    public static final void A05(C9af c9af, MCO mco, String str) {
        0fH.A0j("EbPasskeyRestoreApi", 0Pz.A0W("Passkey login failed: ", AnonymousClass001.A0X(mco)));
        c9af.A00(str);
        c9af.A01.flowEndFail(c9af.A00, str, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v5 ??, still in use, count: 10, list:
          (r311v5 ??) from 0x03bc: PHI (r311v2 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03cd: PHI (r311v1 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03bc: PHI (r311v2 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03cd: PHI (r311v1 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x036a: PHI (r311v6 ??) = (r311v5 ??), (r311v7 ??) binds: [B:112:0x035f, B:16:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03bc: PHI (r311v2 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03cd: PHI (r311v1 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ?? I:java.lang.Object) from 0x0342: IPUT (r311v5 ?? I:java.lang.Object), (r0v152 ?? I:X.AIX) A[Catch: 2az -> 0x03bc, all -> 0x03cd] X.AIX.A06 java.lang.Object
          (r311v5 ?? I:X.2b1) from 0x0356: INVOKE (r0v155 ?? I:java.lang.Object) = 
          (r311v5 ?? I:X.2b1)
          (r1v33 ?? I:X.9af)
          (r2v10 ?? I:com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi)
          (r3v3 ?? I:java.lang.String)
          (r4v1 ?? I:X.0DR)
         STATIC call: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A01(X.2b1, X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi, java.lang.String, X.0DR):java.lang.Object A[Catch: 2az -> 0x03bc, all -> 0x03cd, MD:(X.2b1, X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi, java.lang.String, X.0DR):java.lang.Object (m)]
          (r311v5 ?? I:X.2b0) from 0x03b0: INVOKE (r311v5 ?? I:X.2b0), (r1v18 ?? I:java.lang.Object) VIRTUAL call: X.2b0.Cal(java.lang.Object):java.lang.Void A[Catch: 2az -> 0x03bc, all -> 0x03cd, MD:(java.lang.Object):java.lang.Void (m)]
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x035f -> B:17:0x036a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x03c0 -> B:21:0x0140). Please report as a decompilation issue!!! */
    public final java.lang.Object A06(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v5 ??, still in use, count: 10, list:
          (r311v5 ??) from 0x03bc: PHI (r311v2 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03cd: PHI (r311v1 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03bc: PHI (r311v2 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03cd: PHI (r311v1 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x036a: PHI (r311v6 ??) = (r311v5 ??), (r311v7 ??) binds: [B:112:0x035f, B:16:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03bc: PHI (r311v2 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ??) from 0x03cd: PHI (r311v1 ??) = (r311v5 ??), (r311v5 ??), (r311v5 ??), (r311v7 ??) binds: [B:128:?, B:70:0x0249, B:129:?, B:15:0x0365] A[DONT_GENERATE, DONT_INLINE]
          (r311v5 ?? I:java.lang.Object) from 0x0342: IPUT (r311v5 ?? I:java.lang.Object), (r0v152 ?? I:X.AIX) A[Catch: 2az -> 0x03bc, all -> 0x03cd] X.AIX.A06 java.lang.Object
          (r311v5 ?? I:X.2b1) from 0x0356: INVOKE (r0v155 ?? I:java.lang.Object) = 
          (r311v5 ?? I:X.2b1)
          (r1v33 ?? I:X.9af)
          (r2v10 ?? I:com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi)
          (r3v3 ?? I:java.lang.String)
          (r4v1 ?? I:X.0DR)
         STATIC call: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A01(X.2b1, X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi, java.lang.String, X.0DR):java.lang.Object A[Catch: 2az -> 0x03bc, all -> 0x03cd, MD:(X.2b1, X.9af, com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi, java.lang.String, X.0DR):java.lang.Object (m)]
          (r311v5 ?? I:X.2b0) from 0x03b0: INVOKE (r311v5 ?? I:X.2b0), (r1v18 ?? I:java.lang.Object) VIRTUAL call: X.2b0.Cal(java.lang.Object):java.lang.Void A[Catch: 2az -> 0x03bc, all -> 0x03cd, MD:(java.lang.Object):java.lang.Void (m)]
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

    /* JADX WARN: Can't wrap try/catch for region: R(23:(2:3|(24:5|6|7|(2:9|(2:11|(2:13|(10:15|16|17|18|19|20|21|22|23|24)(2:26|27))(10:28|29|30|31|32|(7:34|35|36|37|38|39|(23:41|42|43|44|45|46|47|48|49|50|51|52|53|54|(2:56|57)|17|18|19|20|21|22|23|24)(6:58|59|60|61|62|63))(3:68|69|70)|64|65|66|67))(2:72|73))(16:138|139|140|141|142|143|144|145|146|147|148|149|150|(1:152)|153|154)|74|75|76|77|78|79|80|81|82|83|84|85|(1:87)(4:123|124|125|(2:127|128)(2:129|(6:130|131|132|133|134|(1:136)(1:137))))|88|89|(4:91|92|93|(20:95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|(2:111|112)|30|31|32|(0)(0))(4:113|114|115|116))(6:117|118|119|120|121|122)|64|65|66|67))|7|(0)(0)|74|75|76|77|78|79|80|81|82|83|84|85|(0)(0)|88|89|(0)(0)|64|65|66|67) */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x040f, code lost:
    
        r320 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x040a, code lost:
    
        r320 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205 A[Catch: all -> 0x040a, 2az -> 0x040f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x040f, all -> 0x040a, blocks: (B:16:0x033e, B:18:0x0345, B:20:0x034c, B:21:0x0355, B:23:0x035e, B:34:0x02be, B:35:0x02c5, B:37:0x02cf, B:38:0x02d6, B:42:0x02e8, B:43:0x02ef, B:44:0x02f6, B:46:0x0303, B:47:0x0309, B:48:0x030f, B:49:0x0315, B:50:0x031b, B:51:0x0321, B:53:0x032d, B:59:0x036a, B:60:0x036f, B:60:0x036f, B:63:0x0376, B:64:0x0402, B:64:0x0402, B:67:0x0409, B:68:0x03f3, B:70:0x03fa, B:73:0x018b, B:75:0x0192, B:77:0x0199, B:78:0x01a2, B:79:0x01a9, B:80:0x01b0, B:82:0x01b7, B:83:0x01be, B:84:0x01c5, B:87:0x01d3, B:88:0x01d8, B:91:0x01e8, B:92:0x01ef, B:95:0x01fb, B:164:0x0383, B:168:0x03a2, B:169:0x03aa, B:169:0x03aa, B:172:0x03b1, B:173:0x03b9, B:173:0x03b9, B:176:0x03c0, B:178:0x03c3, B:113:0x03c4, B:113:0x03c4, B:116:0x03cb, B:118:0x03dc, B:119:0x03e1, B:119:0x03e1, B:122:0x03e8, B:123:0x0205, B:124:0x020e, B:127:0x021c, B:128:0x0223, B:129:0x022b, B:131:0x0232, B:133:0x023a, B:136:0x0246), top: B:7:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02be A[Catch: all -> 0x040a, 2az -> 0x040f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x040f, all -> 0x040a, blocks: (B:16:0x033e, B:18:0x0345, B:20:0x034c, B:21:0x0355, B:23:0x035e, B:34:0x02be, B:35:0x02c5, B:37:0x02cf, B:38:0x02d6, B:42:0x02e8, B:43:0x02ef, B:44:0x02f6, B:46:0x0303, B:47:0x0309, B:48:0x030f, B:49:0x0315, B:50:0x031b, B:51:0x0321, B:53:0x032d, B:59:0x036a, B:60:0x036f, B:60:0x036f, B:63:0x0376, B:64:0x0402, B:64:0x0402, B:67:0x0409, B:68:0x03f3, B:70:0x03fa, B:73:0x018b, B:75:0x0192, B:77:0x0199, B:78:0x01a2, B:79:0x01a9, B:80:0x01b0, B:82:0x01b7, B:83:0x01be, B:84:0x01c5, B:87:0x01d3, B:88:0x01d8, B:91:0x01e8, B:92:0x01ef, B:95:0x01fb, B:164:0x0383, B:168:0x03a2, B:169:0x03aa, B:169:0x03aa, B:172:0x03b1, B:173:0x03b9, B:173:0x03b9, B:176:0x03c0, B:178:0x03c3, B:113:0x03c4, B:113:0x03c4, B:116:0x03cb, B:118:0x03dc, B:119:0x03e1, B:119:0x03e1, B:122:0x03e8, B:123:0x0205, B:124:0x020e, B:127:0x021c, B:128:0x0223, B:129:0x022b, B:131:0x0232, B:133:0x023a, B:136:0x0246), top: B:7:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03f3 A[Catch: all -> 0x040a, 2az -> 0x040f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x040f, all -> 0x040a, blocks: (B:16:0x033e, B:18:0x0345, B:20:0x034c, B:21:0x0355, B:23:0x035e, B:34:0x02be, B:35:0x02c5, B:37:0x02cf, B:38:0x02d6, B:42:0x02e8, B:43:0x02ef, B:44:0x02f6, B:46:0x0303, B:47:0x0309, B:48:0x030f, B:49:0x0315, B:50:0x031b, B:51:0x0321, B:53:0x032d, B:59:0x036a, B:60:0x036f, B:60:0x036f, B:63:0x0376, B:64:0x0402, B:64:0x0402, B:67:0x0409, B:68:0x03f3, B:70:0x03fa, B:73:0x018b, B:75:0x0192, B:77:0x0199, B:78:0x01a2, B:79:0x01a9, B:80:0x01b0, B:82:0x01b7, B:83:0x01be, B:84:0x01c5, B:87:0x01d3, B:88:0x01d8, B:91:0x01e8, B:92:0x01ef, B:95:0x01fb, B:164:0x0383, B:168:0x03a2, B:169:0x03aa, B:169:0x03aa, B:172:0x03b1, B:173:0x03b9, B:173:0x03b9, B:176:0x03c0, B:178:0x03c3, B:113:0x03c4, B:113:0x03c4, B:116:0x03cb, B:118:0x03dc, B:119:0x03e1, B:119:0x03e1, B:122:0x03e8, B:123:0x0205, B:124:0x020e, B:127:0x021c, B:128:0x0223, B:129:0x022b, B:131:0x0232, B:133:0x023a, B:136:0x0246), top: B:7:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3 A[Catch: all -> 0x040a, 2az -> 0x040f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x040f, all -> 0x040a, blocks: (B:16:0x033e, B:18:0x0345, B:20:0x034c, B:21:0x0355, B:23:0x035e, B:34:0x02be, B:35:0x02c5, B:37:0x02cf, B:38:0x02d6, B:42:0x02e8, B:43:0x02ef, B:44:0x02f6, B:46:0x0303, B:47:0x0309, B:48:0x030f, B:49:0x0315, B:50:0x031b, B:51:0x0321, B:53:0x032d, B:59:0x036a, B:60:0x036f, B:60:0x036f, B:63:0x0376, B:64:0x0402, B:64:0x0402, B:67:0x0409, B:68:0x03f3, B:70:0x03fa, B:73:0x018b, B:75:0x0192, B:77:0x0199, B:78:0x01a2, B:79:0x01a9, B:80:0x01b0, B:82:0x01b7, B:83:0x01be, B:84:0x01c5, B:87:0x01d3, B:88:0x01d8, B:91:0x01e8, B:92:0x01ef, B:95:0x01fb, B:164:0x0383, B:168:0x03a2, B:169:0x03aa, B:169:0x03aa, B:172:0x03b1, B:173:0x03b9, B:173:0x03b9, B:176:0x03c0, B:178:0x03c3, B:113:0x03c4, B:113:0x03c4, B:116:0x03cb, B:118:0x03dc, B:119:0x03e1, B:119:0x03e1, B:122:0x03e8, B:123:0x0205, B:124:0x020e, B:127:0x021c, B:128:0x0223, B:129:0x022b, B:131:0x0232, B:133:0x023a, B:136:0x0246), top: B:7:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e8 A[Catch: all -> 0x040a, 2az -> 0x040f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {2az -> 0x040f, all -> 0x040a, blocks: (B:16:0x033e, B:18:0x0345, B:20:0x034c, B:21:0x0355, B:23:0x035e, B:34:0x02be, B:35:0x02c5, B:37:0x02cf, B:38:0x02d6, B:42:0x02e8, B:43:0x02ef, B:44:0x02f6, B:46:0x0303, B:47:0x0309, B:48:0x030f, B:49:0x0315, B:50:0x031b, B:51:0x0321, B:53:0x032d, B:59:0x036a, B:60:0x036f, B:60:0x036f, B:63:0x0376, B:64:0x0402, B:64:0x0402, B:67:0x0409, B:68:0x03f3, B:70:0x03fa, B:73:0x018b, B:75:0x0192, B:77:0x0199, B:78:0x01a2, B:79:0x01a9, B:80:0x01b0, B:82:0x01b7, B:83:0x01be, B:84:0x01c5, B:87:0x01d3, B:88:0x01d8, B:91:0x01e8, B:92:0x01ef, B:95:0x01fb, B:164:0x0383, B:168:0x03a2, B:169:0x03aa, B:169:0x03aa, B:172:0x03b1, B:173:0x03b9, B:173:0x03b9, B:176:0x03c0, B:178:0x03c3, B:113:0x03c4, B:113:0x03c4, B:116:0x03cb, B:118:0x03dc, B:119:0x03e1, B:119:0x03e1, B:122:0x03e8, B:123:0x0205, B:124:0x020e, B:127:0x021c, B:128:0x0223, B:129:0x022b, B:131:0x0232, B:133:0x023a, B:136:0x0246), top: B:7:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /* JADX WARN: Type inference failed for: r0v119, types: [X.0uA] */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A07(X.C87v r302, X.C9af r303, java.lang.String r304, X.0DR r305) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A07(X.87v, X.9af, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r314v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r314v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r314v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r314v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x0352: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:166:0x0352 */
    /* JADX WARN: Not initialized variable reg: 314, insn: 0x0361: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r314 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:163:0x0361 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A08(X.C9af r302, java.lang.String r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A08(X.9af, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(2:9|(2:11|12)(2:28|29))(10:30|31|32|33|34|35|36|(1:38)|39|40)|13|14|15|(3:17|18|19)(7:21|22|23|24|25|26|27)))|46|6|7|(0)(0)|13|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fa, code lost:
    
        r310 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        r310 = X.JR1.A0a((X.C2b0) r312, r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        r310 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
    
        r312.A00();
        X.KVT.A00(r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        throw r310;
     */
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r312v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r312v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 312, insn: 0x00ed: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r312 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:44:0x00ed */
    /* JADX WARN: Not initialized variable reg: 312, insn: 0x00fc: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r312 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:42:0x00fc */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4 A[Catch: all -> 0x00eb, 2az -> 0x00fa, TRY_ENTER, TRY_LEAVE, TryCatch #2 {2az -> 0x00fa, all -> 0x00eb, blocks: (B:12:0x00bb, B:14:0x00c2, B:18:0x00ce, B:21:0x00d4, B:23:0x00db, B:24:0x00e3, B:24:0x00e3, B:27:0x00ea, B:31:0x0092, B:32:0x0099, B:33:0x00a0, B:35:0x00a6), top: B:7:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.2b1] */
    /* JADX WARN: Type inference failed for: r312v0, types: [X.2b0] */
    /* JADX WARN: Type inference failed for: r312v1, types: [X.2b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A09(X.C9af r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A09(X.9af, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A0A(X.0DR r302) {
        /*
            r301 = this;
            r0 = 1
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = X.AIb.A02(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L92
            r0 = r302
            r305 = r0
            r0 = r302
            X.AIb r0 = (X.AIb) r0
            r305 = r0
            r0 = r305
            int r0 = r0.A00
            r306 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r307 = r0
            r0 = r306
            r1 = r307
            r0 = r0 & r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L92
            r0 = r306
            r1 = r307
            int r0 = r0 - r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0.A00 = r1
        L39:
            r0 = r305
            java.lang.Object r0 = r0.A02
            r308 = r0
            X.0Ds r0 = X.0Ds.A02
            r309 = r0
            r0 = r305
            int r0 = r0.A00
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L6e
            r0 = r307
            r1 = r303
            if (r0 != r1) goto La6
            r0 = r308
            X.0Dt.A00(r0)
        L5c:
            r0 = r308
            X.9GV r0 = (X.9GV) r0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto La2
            r0 = r308
            X.0AN r0 = A04(r0)
            return r0
        L6e:
            r0 = r308
            X.0Dt.A00(r0)
            r0 = r305
            r1 = r301
            r0.A01 = r1
            r0 = r305
            r1 = r303
            r0.A00 = r1
            r0 = 0
            r1 = r301
            r2 = r305
            java.lang.Object r0 = A02(r0, r1, r2)
            r308 = r0
            r0 = r308
            r1 = r309
            if (r0 != r1) goto L5c
            r0 = r309
            return r0
        L92:
            X.AIb r0 = new X.AIb
            r305 = r0
            r0 = r305
            r1 = r301
            r2 = r302
            r3 = r303
            r0.<init>(r1, r2, r3)
            goto L39
        La2:
            X.16a r0 = X.C16a.A00
            return r0
        La6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi.A0A(X.0DR):java.lang.Object");
    }
}
