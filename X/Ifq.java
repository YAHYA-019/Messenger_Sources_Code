package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rtc.postcall.api.PostCallDialogFragment;
import com.facebook.traffic.ttrc.MC;
import java.util.List;

/* loaded from: Ifq.class */
public final class Ifq implements JMS {
    public long A00;
    public IEA A01;
    public GQz A02;
    public JMS A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final FbUserSession A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final boolean A0I;
    public final Context A0J;
    public final 1De A0K;
    public final boolean A0L;
    public final boolean A0M;

    public Ifq(1De r302) {
        this.A0K = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A0H = A03;
        FbUserSession A032 = 1Br.A03(A03);
        this.A07 = A032;
        this.A0D = GOn.A0i(A032, r0);
        this.A0F = 1Bu.A03(r0, 115139);
        Context A0I = 7zQ.A0I(r0);
        this.A0J = A0I;
        this.A08 = 1HG.A00(A0I, 100191);
        this.A0E = 1Lm.A03(A032, r0, 83902);
        this.A0A = 1BK.A0C();
        this.A0B = 1Lm.A03(A032, r0, 33089);
        this.A09 = AbG.A0M();
        this.A0G = 1Bu.A03(r0, 114884);
        this.A0C = 1Bu.A03(r0, 115004);
        this.A0M = 1Br.A07(this.A0A).AZk(36315151078990341L);
        this.A0L = 1Br.A07(this.A0A).AZk(36323586394442504L);
        this.A0I = 1Br.A07(this.A0A).AZk(18311885124294027L);
    }

    public static final 2QO A00(Ifq ifq) {
        return GOp.A0w(ifq.A0D);
    }

    public static void A01(Ifq ifq) {
        ifq.A04 = A00(ifq).A0J;
        ifq.A00 = A00(ifq).A03;
    }

    public static final boolean A02(Ifq ifq) {
        1Br r0 = ifq.A0D;
        return GOp.A0w(r0).A01 == 1 && GOp.A0w(r0).A02 > 0 && !GOq.A1S(ifq.A0B);
    }

    public final void A03(int i) {
        if (this.A04 != null) {
            HgR hgR = (HgR) 1Br.A0B(this.A0C);
            String str = this.A05;
            if (str == null) {
                11T.A0L("localCallId");
                throw 0Q8.createAndThrow();
            }
            String valueOf = String.valueOf(this.A04);
            long j = this.A00;
            11T.A0F(valueOf, 1);
            Hms hms = (Hms) 1Br.A0B(hgR.A02);
            Integer valueOf2 = Integer.valueOf(i);
            1UG A08 = 1BK.A08(hms.A00, 1BJ.A00(MC.android_traffic_qoe.__CONFIG__));
            if (A08.isSampled()) {
                A08.A7R("local_call_id", str);
                A08.A7R("shared_call_id", valueOf);
                A08.A6H("peer_id", Long.valueOf(j));
                A08.A6H("rating_style", valueOf2 != null ? 1BK.A0l(valueOf2.intValue()) : null);
                A08.BZL();
            }
        }
    }

    public final boolean A04() {
        Fragment A0b;
        0D2 A0b2;
        PostCallDialogFragment postCallDialogFragment;
        GQz gQz = this.A02;
        if (gQz != null) {
            if (!gQz.A01()) {
                return false;
            }
            GQz gQz2 = this.A02;
            if (gQz2 != null) {
                GR0 gr0 = gQz2.A02;
                06Z A00 = gr0.A00();
                if (A00 != null && (postCallDialogFragment = (PostCallDialogFragment) A00.A0b("SurveyDialogFragment")) != null) {
                    postCallDialogFragment.ATi();
                }
                06Z A002 = gr0.A00();
                JGT jgt = (JGT) (A002 != null ? A002.A0b("SplitRatingPickerFragment") : null);
                if (jgt != null) {
                    jgt.ATi();
                }
                06Z A003 = gr0.A00();
                if (A003 == null) {
                    return true;
                }
                06Z A004 = gr0.A00();
                if (A004 != null && (A0b2 = A004.A0b("SurveyDialogFragment")) != null) {
                    A0b2.A0p();
                }
                06Z A005 = gr0.A00();
                if (A005 != null && (A0b = A005.A0b("SplitRatingPickerFragment")) != null) {
                    DKE.A1J(A0b, A003);
                }
                HKw.A00(A003);
                return true;
            }
        }
        11T.A0L("surveyHandler");
        throw 0Q8.createAndThrow();
    }

    public final boolean A05() {
        if (!A02(this) || !this.A0L) {
            return false;
        }
        A01(this);
        this.A06 = GOp.A0w(this.A0D).A0a;
        return true;
    }

    public void BjI() {
        JMS jms = this.A03;
        if (jms != null) {
            jms.BjI();
        }
    }

    public void CF7(Context context, String str, List list) {
        HgR hgR = (HgR) 1Br.A0B(this.A0C);
        String str2 = this.A05;
        if (str2 == null) {
            11T.A0L("localCallId");
            throw 0Q8.createAndThrow();
        }
        String str3 = this.A04;
        if (str3 == null) {
            throw 1BK.A0h();
        }
        ((Hms) 1Br.A0B(hgR.A02)).A00("Codec Avatar Survey", null, str2, str3, list, this.A00);
        JMS jms = this.A03;
        if (jms != null) {
            jms.CF7(context, "Codec Avatar Survey", list);
        }
    }

    public void CPY(int i) {
        JMS jms = this.A03;
        if (jms != null) {
            jms.CPY(i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v9 ??, still in use, count: 4, list:
          (r307v9 ??) from 0x0353: PHI (r307v6 ??) = (r307v5 ??), (r307v9 ??) binds: [B:188:0x0350, B:182:0x0349] A[DONT_GENERATE, DONT_INLINE]
          (r307v9 ??) from 0x0367: PHI (r307v7 ??) = (r307v6 ??), (r307v9 ??) binds: [B:185:0x0364, B:178:0x0367] A[DONT_GENERATE, DONT_INLINE]
          (r307v9 ?? I:java.lang.StringBuilder) from 0x0330: INVOKE (r307v9 ?? I:java.lang.StringBuilder), (r0v177 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: IOException -> 0x0349, all -> 0x071e, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r307v9 ?? I:java.lang.StringBuilder) from 0x033c: INVOKE (r307v9 ?? I:java.lang.StringBuilder), (r0v167 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: IOException -> 0x0349, all -> 0x071e, MD:(java.lang.String):java.lang.StringBuilder (c)]
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
    public void CPZ(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r307v9 ??, still in use, count: 4, list:
          (r307v9 ??) from 0x0353: PHI (r307v6 ??) = (r307v5 ??), (r307v9 ??) binds: [B:188:0x0350, B:182:0x0349] A[DONT_GENERATE, DONT_INLINE]
          (r307v9 ??) from 0x0367: PHI (r307v7 ??) = (r307v6 ??), (r307v9 ??) binds: [B:185:0x0364, B:178:0x0367] A[DONT_GENERATE, DONT_INLINE]
          (r307v9 ?? I:java.lang.StringBuilder) from 0x0330: INVOKE (r307v9 ?? I:java.lang.StringBuilder), (r0v177 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: IOException -> 0x0349, all -> 0x071e, MD:(java.lang.String):java.lang.StringBuilder (c)]
          (r307v9 ?? I:java.lang.StringBuilder) from 0x033c: INVOKE (r307v9 ?? I:java.lang.StringBuilder), (r0v167 ?? I:java.lang.String) VIRTUAL call: java.lang.StringBuilder.append(java.lang.String):java.lang.StringBuilder A[Catch: IOException -> 0x0349, all -> 0x071e, MD:(java.lang.String):java.lang.StringBuilder (c)]
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

    public void CTQ(Integer num) {
        11T.A0F(num, 0);
        if (num == 0S2.A00) {
            1Br.A0C(this.A0C);
        }
        JMS jms = this.A03;
        if (jms != null) {
            jms.CTQ(num);
        }
    }

    public void D0G() {
        GQz gQz = this.A02;
        if (gQz == null) {
            11T.A0L("surveyHandler");
            throw 0Q8.createAndThrow();
        }
        06Z A00 = gQz.A02.A00();
        if (A00 != null) {
            GQz.A00(A00, gQz);
        }
        JMS jms = this.A03;
        if (jms != null) {
            jms.D0G();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (r303.length() == 0) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.facebook.rtc.postcall.SurveyDialogFragment, com.facebook.rtc.postcall.api.PostCallDialogFragment, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D0M(int r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ifq.D0M(int, java.lang.String):void");
    }
}
