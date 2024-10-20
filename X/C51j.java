package X;

import android.content.Context;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.51j, reason: invalid class name */
/* loaded from: 51j.class */
public final class C51j extends C2ux {
    public long A00;
    public Context A01;
    public boolean A02;
    public boolean A04;
    public boolean A05;
    public final 2uE A0A;
    public final RQN A0B;
    public final 00V A0C;
    public final 0ED A0D;
    public final 2uI A0E;
    public final Executor A0G;
    public final boolean A0H;
    public final C2uv A0I;
    public final 30L A0J;
    public final 00T A0K;
    public final String A0L;
    public final boolean A0N;
    public final C0dr A09 = RealtimeSinceBootClock.A00;
    public boolean A03 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public final java.util.Map A0F = AnonymousClass001.A0u();
    public final Queue A0M = new LinkedList();
    public final int A08 = 30;

    public C51j(Context context, C2uv c2uv, 2uE r304, 30L r305, 00T r306, 00V r307, 0ED r308, String str, Executor executor, boolean z, boolean z2) {
        this.A01 = context;
        this.A0K = r306;
        this.A0G = executor;
        this.A0E = 2uG.A00(context);
        this.A0C = r307;
        this.A0D = r308;
        this.A0A = r304;
        this.A0B = new RQN(r304);
        this.A0N = z;
        this.A0I = c2uv;
        this.A0H = z2;
        this.A0L = str;
        this.A0J = r305;
    }

    public static String A00(List list) {
        StringBuilder A0k = AnonymousClass001.A0k();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (z) {
                z = false;
            } else {
                A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            A0k.append(A0i);
        }
        return A0k.toString();
    }

    private void A01(int i) {
        synchronized (this) {
            this.A0F.remove(Integer.valueOf(i));
        }
    }

    public static void A02(C3Lx c3Lx, C3O1 c3o1) {
        if (!(c3Lx instanceof QV5)) {
            c3Lx.A01.A01(c3o1);
            return;
        }
        Iterator it = ((QV5) c3Lx).A00.iterator();
        while (it.hasNext()) {
            ((C3Lx) it.next()).A01.A01(c3o1);
        }
    }

    public static void A03(C3Lx c3Lx, Exception exc) {
        if (!(c3Lx instanceof QV5)) {
            c3Lx.A01.A00(exc);
            return;
        }
        Iterator it = ((QV5) c3Lx).A00.iterator();
        while (it.hasNext()) {
            ((C3Lx) it.next()).A01.A00(exc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x020e A[Catch: all -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0009, B:6:0x000e, B:7:0x0014, B:8:0x001b, B:9:0x0021, B:11:0x0034, B:12:0x003b, B:13:0x0041, B:14:0x0048, B:16:0x005e, B:18:0x0065, B:22:0x0073, B:27:0x007a, B:31:0x0087, B:32:0x008e, B:36:0x009b, B:37:0x00a2, B:38:0x00a7, B:42:0x00b4, B:43:0x00bc, B:44:0x00c1, B:46:0x00cd, B:48:0x00d3, B:51:0x00dd, B:52:0x00e5, B:54:0x00ec, B:58:0x010c, B:59:0x0110, B:61:0x0115, B:62:0x011c, B:65:0x0128, B:66:0x0130, B:67:0x0135, B:68:0x013a, B:69:0x013f, B:70:0x0147, B:73:0x0153, B:75:0x015d, B:78:0x0165, B:82:0x0176, B:83:0x017b, B:84:0x0180, B:85:0x0185, B:86:0x018b, B:90:0x0199, B:91:0x019f, B:92:0x01a4, B:93:0x01a9, B:99:0x01c2, B:101:0x01cb, B:102:0x01d0, B:104:0x01d4, B:105:0x01d8, B:108:0x01e2, B:110:0x01e8, B:111:0x01ec, B:112:0x01f2, B:113:0x01f9, B:114:0x0202, B:117:0x020e, B:118:0x0216, B:119:0x021b, B:121:0x0222, B:123:0x0229, B:124:0x0232, B:127:0x023e, B:128:0x0246, B:130:0x0250, B:131:0x0255, B:132:0x025a, B:133:0x025f, B:134:0x0264, B:136:0x0270, B:139:0x0278, B:191:0x0357, B:193:0x0361, B:194:0x0365, B:197:0x036c, B:198:0x0372, B:214:0x037d, B:215:0x01bd, B:216:0x00f4, B:217:0x00fc, B:219:0x0103, B:142:0x027e, B:200:0x0286, B:201:0x028c, B:203:0x0291, B:204:0x0297, B:205:0x029e, B:146:0x02b9, B:150:0x02c2, B:152:0x02c8, B:153:0x02cc, B:154:0x02d3, B:155:0x02db, B:158:0x02e7, B:159:0x02ee, B:163:0x02fc, B:165:0x0302, B:167:0x0309, B:168:0x030d, B:170:0x0312, B:172:0x031a, B:174:0x0321, B:177:0x032a, B:181:0x0334, B:182:0x033a, B:184:0x0340, B:185:0x0345, B:187:0x034a, B:188:0x0350, B:209:0x02ac, B:211:0x02b3), top: B:4:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023e A[Catch: all -> 0x037e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0009, B:6:0x000e, B:7:0x0014, B:8:0x001b, B:9:0x0021, B:11:0x0034, B:12:0x003b, B:13:0x0041, B:14:0x0048, B:16:0x005e, B:18:0x0065, B:22:0x0073, B:27:0x007a, B:31:0x0087, B:32:0x008e, B:36:0x009b, B:37:0x00a2, B:38:0x00a7, B:42:0x00b4, B:43:0x00bc, B:44:0x00c1, B:46:0x00cd, B:48:0x00d3, B:51:0x00dd, B:52:0x00e5, B:54:0x00ec, B:58:0x010c, B:59:0x0110, B:61:0x0115, B:62:0x011c, B:65:0x0128, B:66:0x0130, B:67:0x0135, B:68:0x013a, B:69:0x013f, B:70:0x0147, B:73:0x0153, B:75:0x015d, B:78:0x0165, B:82:0x0176, B:83:0x017b, B:84:0x0180, B:85:0x0185, B:86:0x018b, B:90:0x0199, B:91:0x019f, B:92:0x01a4, B:93:0x01a9, B:99:0x01c2, B:101:0x01cb, B:102:0x01d0, B:104:0x01d4, B:105:0x01d8, B:108:0x01e2, B:110:0x01e8, B:111:0x01ec, B:112:0x01f2, B:113:0x01f9, B:114:0x0202, B:117:0x020e, B:118:0x0216, B:119:0x021b, B:121:0x0222, B:123:0x0229, B:124:0x0232, B:127:0x023e, B:128:0x0246, B:130:0x0250, B:131:0x0255, B:132:0x025a, B:133:0x025f, B:134:0x0264, B:136:0x0270, B:139:0x0278, B:191:0x0357, B:193:0x0361, B:194:0x0365, B:197:0x036c, B:198:0x0372, B:214:0x037d, B:215:0x01bd, B:216:0x00f4, B:217:0x00fc, B:219:0x0103, B:142:0x027e, B:200:0x0286, B:201:0x028c, B:203:0x0291, B:204:0x0297, B:205:0x029e, B:146:0x02b9, B:150:0x02c2, B:152:0x02c8, B:153:0x02cc, B:154:0x02d3, B:155:0x02db, B:158:0x02e7, B:159:0x02ee, B:163:0x02fc, B:165:0x0302, B:167:0x0309, B:168:0x030d, B:170:0x0312, B:172:0x031a, B:174:0x0321, B:177:0x032a, B:181:0x0334, B:182:0x033a, B:184:0x0340, B:185:0x0345, B:187:0x034a, B:188:0x0350, B:209:0x02ac, B:211:0x02b3), top: B:4:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0286 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(X.C51j r301) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51j.A04(X.51j):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v0 ??, still in use, count: 3, list:
          (r311v0 ??) from 0x0114: PHI (r311v1 ??) = (r311v0 ??), (r311v4 ??) binds: [B:584:0x018a, B:55:0x0111] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ?? I:java.lang.Object) from 0x0161: INVOKE (r0v28 ?? I:java.util.Map), (r0v30 ?? I:java.lang.Object), (r311v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0aa5, MD:(K, V):V (c)]
          (r311v0 ?? I:X.3Lx) from 0x0174: IGET (r0v53 ?? I:X.3QA) = (r311v0 ?? I:X.3Lx) A[Catch: all -> 0x0aa5] X.3Lx.A02 X.3QA
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
    public static void A05(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r311v0 ??, still in use, count: 3, list:
          (r311v0 ??) from 0x0114: PHI (r311v1 ??) = (r311v0 ??), (r311v4 ??) binds: [B:584:0x018a, B:55:0x0111] A[DONT_GENERATE, DONT_INLINE]
          (r311v0 ?? I:java.lang.Object) from 0x0161: INVOKE (r0v28 ?? I:java.util.Map), (r0v30 ?? I:java.lang.Object), (r311v0 ?? I:java.lang.Object) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x0aa5, MD:(K, V):V (c)]
          (r311v0 ?? I:X.3Lx) from 0x0174: IGET (r0v53 ?? I:X.3QA) = (r311v0 ?? I:X.3Lx) A[Catch: all -> 0x0aa5] X.3Lx.A02 X.3QA
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

    @Override // X.C2u6
    public 2vI A06(3QA r302) {
        30L r0 = this.A0J;
        if (r0 != null) {
            r0.A01.Ba9(r0.A00);
        }
        2vH r02 = new 2vH();
        2uE r03 = this.A0A;
        if (r03 != null) {
            int i = r302.A00;
            r03.A00(r302, i);
            String str = this.A0L;
            if (str != null) {
                r03.A08(i, str);
            }
        }
        AMV(r302);
        C3Lx c3Lx = new C3Lx(r02, r302);
        synchronized (this) {
            if (r03 != null) {
                r03.A0C(r302);
            }
            this.A0M.offer(c3Lx);
            A04(this);
        }
        return r02.A00;
    }

    @Override // X.C2u6
    public void AMV(3QA r302) {
        this.A0E.AMW(1BK.A17(r302.A02));
    }

    @Override // X.C2u6
    public boolean BVR(2vI r302) {
        int i;
        3F8 A03 = r302.A03();
        return (A03 instanceof KQ3) || !(!(A03 instanceof K2D) || (i = A03.mStatus.A00) == -5 || i == -2 || i == 0);
    }

    @Override // X.C2u6
    public 2vI D2J(2vH r302, 3QA r303) {
        2uE r0 = this.A0A;
        if (r0 != null) {
            r0.A0I(r303.A02);
        }
        C4Ez AMX = this.A0E.AMX(1BK.A17(r303.A02));
        Executor executor = this.A0G;
        AMX.A03(new LeB(r302, this, 1), executor);
        AMX.A0A(new Le0(r302, this), executor);
        return r302.A00;
    }

    @Override // X.C2u6
    public String getName() {
        return "GooglePlay";
    }
}
