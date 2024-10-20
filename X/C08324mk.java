package X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.facebook.analytics.analyticsmodule.DeviceInfoHelper;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.chipset.ChipsetInfoUtil;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4mk.class */
public final class C08324mk implements InterfaceC08334ml {
    public String A00;
    public final ActivityManager A01;
    public final Context A02;
    public final PackageManager A03;
    public final NetworkInfo A04;
    public final WifiManager A05;
    public final PowerManager A06;
    public final TelephonyManager A07;
    public final DeviceInfoHelper A08;
    public final C08364mq A09;
    public final C08344mm A0A;
    public final ChipsetInfoUtil A0B;
    public final 1Em A0C;
    public final 1yM A0D;
    public final 1Oe A0E;
    public final 1I9 A0F;
    public final C00i A0G;
    public final C00i A0H;
    public final C00i A0I;
    public final C00i A0J;
    public final C00i A0K;
    public final C00i A0L;
    public final C00i A0M;
    public final C00i A0N;
    public final C00i A0O;
    public final C00i A0P;
    public final 1HM A0Q;
    public final C02333uu A0R;
    public final String A0S;
    public final Set A0T;
    public final Set A0U;
    public final C15h A0V;
    public final Context A0W;

    public C08324mk() {
        Context A00 = FbInjector.A00();
        this.A02 = A00;
        this.A0J = new 1BQ(33013);
        this.A03 = (PackageManager) 1Bi.A03(100169);
        Context context = (Context) 1Bn.A0A(83719);
        this.A0W = context;
        this.A01 = (ActivityManager) 1Hv.A02(context, 100171);
        this.A06 = (PowerManager) 1Hv.A02(context, 100179);
        this.A07 = (TelephonyManager) 1Hv.A02(context, 100178);
        this.A0A = (C08344mm) 1Bn.A0A(49243);
        this.A05 = (WifiManager) 1Hv.A02(context, 100180);
        this.A0C = (1Em) 1Bi.A03(67292);
        this.A0B = (ChipsetInfoUtil) 1Bi.A03(116382);
        this.A0G = new 1BV(99448);
        this.A0T = 1Bi.A06(196);
        this.A0U = 1Bn.A0I(205);
        this.A0S = (String) 1Bi.A03(100173);
        this.A0Q = (1HM) 1Bi.A03(67556);
        this.A0V = new AHe(this, 1);
        this.A08 = (DeviceInfoHelper) 1Bi.A03(49244);
        this.A0I = new 1BQ(16511);
        this.A0R = (C02333uu) 1Bi.A03(131080);
        this.A0F = (1I9) 1Bi.A03(16559);
        this.A0D = (1yM) 1Bi.A03(16885);
        this.A09 = (C08364mq) 1Bn.A0A(49247);
        this.A0O = new 1BQ(16386);
        this.A0L = new 1BQ(16385);
        this.A04 = (NetworkInfo) 1Bn.A0A(100184);
        this.A0E = (1Oe) 1Bi.A03(16617);
        this.A0P = new 1BQ(33032);
        this.A0N = new 1HH(context, 100185);
        this.A0H = new 1BV(85192);
        this.A0M = new 1BV(83183);
        this.A0K = new 1HH(A00, 49160);
    }

    private 7qY A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                PackageManager packageManager = this.A03;
                return new 7qY(!packageManager.getApplicationInfo(str, 0).enabled ? 0S2.A01 : 0S2.A00, str, packageManager.getPackageInfo(str, 64).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return new 7qY(0S2.A0N, "", -1);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static String A01(Integer num) {
        int i;
        switch (num.intValue()) {
            case 0:
                return "SERVICE_ENABLED";
            case 1:
                return JQw.A00(14);
            case 2:
                i = 387;
                return AbstractC00603o4.A00(i);
            default:
                i = 388;
                return AbstractC00603o4.A00(i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v5 ??, still in use, count: 4, list:
          (r306v5 ??) from 0x0045: PHI (r306v2 ??) = (r306v0 ??), (r306v5 ??) binds: [B:40:0x003d, B:26:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ??) from 0x006e: PHI (r306v3 ??) = (r306v1 ??), (r306v5 ??) binds: [B:38:0x006a, B:23:0x0093] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ??) from 0x0073: PHI (r306v4 ??) = (r306v3 ??), (r306v5 ??) binds: [B:25:0x0070, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ?? I:java.io.Reader) from 0x002e: INVOKE (r0v25 ?? I:java.io.BufferedReader), (r306v5 ?? I:java.io.Reader), (r0v24 ?? I:int) DIRECT call: java.io.BufferedReader.<init>(java.io.Reader, int):void A[Catch: all -> 0x0043, IOException -> 0x0093, MD:(java.io.Reader, int):void (c)]
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
    public static java.lang.String A02(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v5 ??, still in use, count: 4, list:
          (r306v5 ??) from 0x0045: PHI (r306v2 ??) = (r306v0 ??), (r306v5 ??) binds: [B:40:0x003d, B:26:0x0043] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ??) from 0x006e: PHI (r306v3 ??) = (r306v1 ??), (r306v5 ??) binds: [B:38:0x006a, B:23:0x0093] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ??) from 0x0073: PHI (r306v4 ??) = (r306v3 ??), (r306v5 ??) binds: [B:25:0x0070, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]
          (r306v5 ?? I:java.io.Reader) from 0x002e: INVOKE (r0v25 ?? I:java.io.BufferedReader), (r306v5 ?? I:java.io.Reader), (r0v24 ?? I:int) DIRECT call: java.io.BufferedReader.<init>(java.io.Reader, int):void A[Catch: all -> 0x0043, IOException -> 0x0093, MD:(java.io.Reader, int):void (c)]
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

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:412:0x1c04
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1055, types: [java.lang.Throwable, org.json.JSONObject, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1062, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v1063, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v1065, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v1066, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v995, types: [java.util.List] */
    @Override // X.InterfaceC08314mj
    public X.2Jy AU5(java.lang.String r302, long r303) {
        /*
            Method dump skipped, instructions count: 7184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08324mk.AU5(java.lang.String, long):X.2Jy");
    }

    @Override // X.InterfaceC08334ml
    public long Apq() {
        C00i c00i = this.A0J;
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
        1G2 r0 = 2wZ.A07;
        if (!fbSharedPreferences.BNM(r0)) {
            1G1 r02 = (FbUserSession) this.A0V.get();
            if (!r02.A07) {
                FbSharedPreferences fbSharedPreferences2 = (FbSharedPreferences) c00i.get();
                1G3 A0D = 2wZ.A0A.A0D(r02.A02);
                11T.A0A(A0D);
                if (fbSharedPreferences2.AZn((1G2) A0D, false)) {
                    return 5000L;
                }
            }
        }
        FbSharedPreferences fbSharedPreferences3 = (FbSharedPreferences) c00i.get();
        int i = 24;
        if (((2yD) this.A0L.get()).AZk(36315052294349235L)) {
            i = 12;
        }
        return fbSharedPreferences3.Av1(r0, i * 3600000);
    }
}
