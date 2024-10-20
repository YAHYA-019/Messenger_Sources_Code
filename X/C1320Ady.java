package X;

import android.content.Context;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Ady, reason: case insensitive filesystem */
/* loaded from: Ady.class */
public final class C1320Ady {
    public int A00;
    public C00i A01;
    public C00i A02;
    public Bmq A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public ByH A0A;
    public Object A0B;
    public final C04r A0C;
    public final C00i A0D;
    public final C00i A0E;
    public final Bmp A0F;
    public final AdN A0G;
    public final ImmutableList A0H;
    public final ImmutableList A0I;
    public final Object A0J;
    public final String A0K;
    public final long A0M;
    public final Handler.Callback A0N;
    public final C00i A0P;
    public final C1321Adz A0Q;
    public final CIP A0R;
    public final CML A0S;
    public final DFe A0T;
    public final C1b A0U;
    public final ImmutableList A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final C00i A0O = AbH.A0K();
    public final ExecutorService A0L = (ExecutorService) 1Bi.A03(16460);

    /* JADX WARN: Type inference failed for: r0v97, types: [X.0QO, X.04r] */
    public C1320Ady(Context context, FbUserSession fbUserSession, CIo cIo) {
        1BQ A0X = AbH.A0X();
        this.A02 = A0X;
        this.A0E = 1BQ.A02(84344);
        this.A01 = 1BQ.A02(84351);
        CSO cso = new CSO(this, 0);
        this.A0N = cso;
        this.A0T = AbJ.A0f(A0X).AZk(36326360943384056L) ? new C1324Ae2(this) : new Cpq(this, 3);
        this.A0J = new Object();
        this.A00 = -1;
        this.A0U = new C1b();
        this.A08 = false;
        this.A04 = "";
        1Bn.A0E(context, (1BY) null, 148126);
        C0dr c0dr = (C0dr) 1Bi.A03(84488);
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 455);
        1Bn.A0E(context, (1BY) null, 148121);
        1Bn.A0E(context, (1BY) null, 148122);
        AdN adN = (AdN) 1Lo.A04(context, fbUserSession, (1BY) null, 84525);
        this.A0G = adN;
        this.A0D = 7zL.A0R(context, 84334);
        this.A0P = AbF.A0Q(context.getApplicationContext(), 84348);
        String str = cIo.A0C;
        this.A0K = str;
        this.A0F = new Bmp(c0dr);
        this.A0R = new CIP(1BQ.A02(16508), adN, str, 7zL.A14(cso), cIo.A01, cIo.A00, C1gb.A01(this.A02).AZk(36319935674530262L));
        ImmutableList build = cIo.A07.build();
        this.A0H = build;
        this.A0C = new 0QO(build.size());
        this.A0I = cIo.A08.build();
        ImmutableList build2 = cIo.A09.build();
        DFg dFg = cIo.A06;
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            C1321Adz c1321Adz = new C1321Adz(fbUserSession, dFg, build2, str);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0Q = c1321Adz;
            ImmutableList.Builder builder = ImmutableList.builder();
            ImmutableList build3 = cIo.A0B.build();
            for (int i = 0; i < build3.size(); i++) {
                builder.m11011add((Object) new AdU(context, fbUserSession, (DHQ) build3.get(i), this.A0K, 0Pz.A0T("RendererHelper", i)));
            }
            this.A0V = builder.build();
            this.A0S = new CML(context, fbUserSession, cIo.A0A.build(), this.A0K);
            this.A0X = cIo.A04;
            this.A0W = cIo.A03;
            this.A0M = cIo.A02;
            this.A0Y = cIo.A05;
            1Du it = this.A0H.iterator();
            while (it.hasNext()) {
                DIW diw = (DIW) it.next();
                diw.A5L(this.A0T);
                this.A0C.put(diw, C1323Ae1.A05);
            }
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r0 == X.0S2.A0j) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.common.collect.ImmutableList A00(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320Ady.A00(java.lang.Object):com.google.common.collect.ImmutableList");
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "finished";
            case 2:
                return "finished_with_real_time_update";
            case 3:
                return "failed";
            case 4:
                return "canceled";
            case 5:
                return "loading_continuous";
            default:
                return "loading";
        }
    }

    private void A02(BOx bOx, DIW diw, ByH byH, Exception exc, Integer num, Object obj, int i, boolean z) {
        String str;
        if (this.A0G.A02()) {
            A0B("notifyResultLoadedForSource DataSource (%s) input: %s count: %d status: %s resultIgnored: %b", diw.getFriendlyName(), obj, Integer.valueOf(i), A01(num), Boolean.valueOf(z));
        }
        1Du it = this.A0I.iterator();
        while (it.hasNext()) {
            DIV div = (DIV) it.next();
            Object obj2 = exc;
            if (bOx == BOx.A03) {
                if ((exc instanceof ExecutionException) && (exc.getCause() instanceof Exception)) {
                    obj2 = exc.getCause();
                }
                if (obj2 instanceof TimeoutException) {
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                } else if (obj2 != null) {
                    String message = ((Throwable) obj2).getMessage();
                    str = (message == null || message.isEmpty()) ? "" : message.substring(0, Math.min(message.length(), 50));
                } else {
                    str = "unknown";
                }
            } else {
                str = null;
            }
            div.CHk(bOx, diw, byH, num, obj, str, i, z);
        }
    }

    public static void A03(C1320Ady c1320Ady) {
        1GU.A00(c1320Ady.A0O);
        if (c1320Ady.A0G.A02()) {
            c1320Ady.A0B("performReCreateViewModels", AnonymousClass001.A1Z());
        }
        synchronized (c1320Ady.A0J) {
            boolean A0C = c1320Ady.A0C();
            c1320Ady.A0A(c1320Ady.A0A, c1320Ady.A0B, A0C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        if (r0 > r318) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        r318 = r318 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0125, code lost:
    
        if (r318 >= r0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0154, code lost:
    
        if (((X.C1323Ae1) r0.get((X.DIW) r0.get(r318))).A02 != r0) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0160, code lost:
    
        if (r0.A02() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0163, code lost:
    
        r317 = "performDataChanged a later DataSource finished for input: %s, ignoring continuous result from DataSource (%s)";
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0170, code lost:
    
        r307 = new java.lang.Object[]{r305, r303.getFriendlyName()};
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(X.C1320Ady r301, X.C1323Ae1 r302, X.DIW r303, X.ByH r304, java.lang.Object r305) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320Ady.A04(X.Ady, X.Ae1, X.DIW, X.ByH, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x05be, code lost:
    
        if (com.google.common.base.Objects.equal(r302.A07, r301.A0A.A07) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x054c  */
    /* JADX WARN: Type inference failed for: r0v154, types: [com.facebook.messaging.search.constants.DataSourceIdentifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A05(X.C1320Ady r301, X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320Ady.A05(X.Ady, X.ByH, java.lang.Object):void");
    }

    private void A06(C1323Ae1 c1323Ae1, DIW diw, ByH byH, Object obj) {
        synchronized (this.A0J) {
            int i = c1323Ae1.A00;
            A02(BOx.A04, diw, byH, null, c1323Ae1.A02, obj, i, false);
            this.A0C.put(diw, c1323Ae1);
        }
    }

    private void A07(DIW diw, ByH byH, Object obj) {
        if (this.A0G.A02()) {
            A0B("notifySetInputForSource DataSource (%s) input: %s", diw.getFriendlyName(), obj);
        }
        1Du it = this.A0I.iterator();
        while (it.hasNext()) {
            ((DIV) it.next()).CKt(diw, byH, obj);
        }
    }

    private void A08(DIW diw, Exception exc, Object obj) {
        if (this.A0G.A02()) {
            A0B("notifyLoadingFailedForSource DataSource (%s) input: %s exception: %s", diw.getFriendlyName(), obj, exc);
        }
        1Du it = this.A0I.iterator();
        while (it.hasNext()) {
            ((DIV) it.next()).C4B(diw, exc, obj);
        }
    }

    private void A09(ByH byH, ImmutableList immutableList) {
        ImmutableList A00 = this.A0Q.A00(byH, immutableList);
        1Du it = this.A0V.iterator();
        while (it.hasNext()) {
            AdU adU = (AdU) it.next();
            ImmutableList CYy = adU.A06.CYy(byH, A00);
            AdN adN = (AdN) 1Lo.A04(adU.A00, adU.A02, (1BY) null, 84525);
            if (adN.A02()) {
                adN.A01(adU.A08, "%s#renderViewModels view models: %d, render models: %d", new Object[]{adU.A07, 1BK.A0k(A00), 1BK.A0k(CYy)});
            }
            AdU.A00(adU, byH, CYy);
        }
    }

    private void A0A(ByH byH, Object obj, boolean z) {
        1GU.A00(this.A0O);
        if (this.A0G.A02()) {
            A0B("updateViewModels input: %s", obj);
        }
        ImmutableList A00 = A00(obj);
        if ((obj instanceof String) && A0D(obj)) {
            String str = (String) obj;
            if (!A00.isEmpty() || z) {
                Bmq bmq = this.A03;
                if (bmq == null) {
                    bmq = new Bmq(2yD.A00(C1gb.A01(this.A02), 36608432920403939L));
                    this.A03 = bmq;
                }
                int i = this.A00;
                11T.A0F(str, 1);
                synchronized (bmq.A01) {
                    bmq.A00.A04(0Pz.A0N(str, '_', i), new 8Lr(10, A00, z));
                }
            }
        }
        C1321Adz c1321Adz = this.A0Q;
        1GU.A00(c1321Adz.A00);
        ImmutableList A002 = c1321Adz.A00(byH, A00);
        1Du it = this.A0V.iterator();
        while (it.hasNext()) {
            AdU adU = (AdU) it.next();
            ((1GU) adU.A03.get()).AAq();
            ImmutableList CYy = adU.A06.CYy(byH, A002);
            AdN adN = (AdN) 1Lo.A04(adU.A00, adU.A02, (1BY) null, 84525);
            if (adN.A02()) {
                adN.A01(adU.A08, "%s#renderViewModels view models: %d, render models: %d", new Object[]{adU.A07, 1BK.A0k(A002), 1BK.A0k(CYy)});
            }
            if (C1gb.A02((C1gb) adU.A04.get()).AZk(36326914993969022L)) {
                if (adN.A02()) {
                    adN.A01(adU.A08, "%s#renderViewModels sending message", new Object[]{adU.A07});
                }
                2aK.A03((Integer) null, (0DE) null, new AJU(new DBi(1, CYy, byH, adU), null, 11), 2Zy.A02(2Zo.A01()), 3);
            } else {
                synchronized (adU) {
                    Handler handler = adU.A01;
                    handler.removeMessages(1);
                    if (adN.A02()) {
                        adN.A01(adU.A08, "%s#renderViewModels sending message", new Object[]{adU.A07});
                    }
                    Buu buu = (Buu) adU.A05.A00.A01();
                    buu.A03 = CYy;
                    buu.A02 = byH;
                    handler.sendMessage(handler.obtainMessage(1, buu));
                }
            }
        }
    }

    private void A0B(String str, Object... objArr) {
        AdN adN = this.A0G;
        if (adN.A02()) {
            adN.A00(this.A0K, 0Pz.A0W("ListCreator#", StringFormatUtil.formatStrLocaleSafe(str, objArr)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0C() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320Ady.A0C():boolean");
    }

    private boolean A0D(Object obj) {
        boolean z = false;
        if (obj instanceof String) {
            C00i c00i = this.A02;
            if (C1gb.A01(c00i).AZk(36326957943641998L)) {
                String str = this.A0K;
                if ("universal_search".equals(str) && C1gb.A01(c00i).AZk(36326957943838608L)) {
                    return true;
                }
                if (53M.A02(str)) {
                    z = 7zR.A1W(C1gb.A01(c00i), 36326957943773071L);
                }
            }
        }
        return z;
    }

    public void A0E() {
        if (this.A0G.A02()) {
            A0B("reCreateViewModels", new Object[0]);
        }
        synchronized (this) {
            CIP cip = this.A0R;
            cip.A01(3);
            if (!AbG.A0B(this.A0O).BWu()) {
                A03(this);
            } else if (C1gb.A01(this.A02).AZk(36324767510319118L)) {
                this.A0L.submit((Runnable) new D6U(this));
            } else {
                cip.A02(3, (Object) null, false);
            }
        }
    }

    public void A0F(C1323Ae1 c1323Ae1, DIW diw, ByH byH, Object obj) {
        if (this.A0G.A02()) {
            A0B("onDataChangedForSource DataSource (%s) input: %s data: %d status: %s)", diw.getFriendlyName(), obj, Integer.valueOf(c1323Ae1.A00), A01(c1323Ae1.A02));
        }
        if (!AbG.A0B(this.A0O).BWu()) {
            A04(this, c1323Ae1, diw, byH, obj);
            return;
        }
        if (C1gb.A01(this.A02).AZk(36324767510319118L)) {
            this.A0L.submit((Runnable) new DAB(this, c1323Ae1, diw, byH, obj));
            return;
        }
        CIP cip = this.A0R;
        Buu buu = (Buu) this.A0F.A00.A01();
        buu.A01 = diw;
        buu.A04 = obj;
        buu.A00 = c1323Ae1;
        buu.A02 = byH;
        cip.A02(2, buu, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r321v7 ??, still in use, count: 2, list:
          (r321v7 ??) from 0x0361: PHI (r321v2 ??) = (r321v1 ??), (r321v7 ??) binds: [B:120:0x0331, B:128:0x035c] A[DONT_GENERATE, DONT_INLINE]
          (r321v7 ?? I:X.Bmq) from 0x035e: IPUT (r321v7 ?? I:X.Bmq), (r301v0 'this' ?? I:X.Ady A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0667] X.Ady.A03 X.Bmq
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
    public void A0G(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r321v7 ??, still in use, count: 2, list:
          (r321v7 ??) from 0x0361: PHI (r321v2 ??) = (r321v1 ??), (r321v7 ??) binds: [B:120:0x0331, B:128:0x035c] A[DONT_GENERATE, DONT_INLINE]
          (r321v7 ?? I:X.Bmq) from 0x035e: IPUT (r321v7 ?? I:X.Bmq), (r301v0 'this' ?? I:X.Ady A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0667] X.Ady.A03 X.Bmq
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

    public void A0H(Object obj, boolean z) {
        C1323Ae1 c1323Ae1;
        synchronized (this) {
            A0G(obj);
            if (!(obj instanceof C96) && !z && !this.A09) {
                1Du it = this.A0H.iterator();
                while (it.hasNext()) {
                    DIW diw = (DIW) it.next();
                    C04r c04r = this.A0C;
                    if (c04r.get(diw) != null) {
                        new C1323Ae1(((C1323Ae1) c04r.get(diw)).A01, 0S2.A00);
                    } else {
                        c1323Ae1 = C1323Ae1.A05;
                    }
                    c04r.put(diw, c1323Ae1);
                }
                this.A09 = false;
            }
        }
    }
}
