package X;

import android.content.Context;
import android.net.Uri;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.drawee.view.DraweeView;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.stickers.model.Sticker;

/* loaded from: H65.class */
public abstract class H65 extends GXa {
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r317v0 ??
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
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
    	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 317, insn: 0x03dc: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r317 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:39:0x03d9 */
    /* JADX WARN: Type inference failed for: r317v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r319v0, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    /* JADX WARN: Type inference failed for: r319v4, types: [com.facebook.drawee.view.DraweeView, com.facebook.drawee.fbpipeline.FbDraweeView, android.view.View] */
    public void A0A(MigColorScheme migColorScheme, GGS ggs, HY0 hy0, HpA hpA, Boolean bool, int i, int i2, boolean z) {
        ?? r317;
        Object A0p;
        DraweeView draweeView;
        C69s c69s;
        DraweeView draweeView2;
        DraweeView draweeView3;
        5BO A02;
        C06974ih A01;
        try {
            if (this instanceof H0L) {
                H0L h0l = (H0L) this;
                Sticker A00 = hpA.A00();
                A00.getClass();
                Uri A04 = ((69I) h0l.A05.get()).A04(A00);
                A04.getClass();
                LottieAnimationView lottieAnimationView = h0l.A02;
                lottieAnimationView.A0B(A04.toString());
                AbR abR = (AbR) h0l.A04.get();
                Context context = h0l.A01;
                Context A012 = FbInjector.A01();
                AbL.A0y(abR);
                Hpv hpv = new Hpv(context, hy0, A00, bool, i);
                1Bn.A0K();
                FbInjector.A04(A012);
                h0l.A00 = hpv;
                lottieAnimationView.setContentDescription(((5Yf) h0l.A03.get()).A00(Integer.valueOf(i + 1), Integer.valueOf(i2), A00.A0G));
                lottieAnimationView.A01 = new ILy(h0l, A00);
                return;
            }
            H0M h0m = (H0M) this;
            Sticker A002 = hpA.A00();
            A002.getClass();
            AbR abR2 = (AbR) h0m.A05.get();
            Context context2 = h0m.A02;
            Context A013 = FbInjector.A01();
            AbL.A0y(abR2);
            Hpv hpv2 = new Hpv(context2, hy0, A002, bool, i);
            1Bn.A0K();
            FbInjector.A04(A013);
            h0m.A00 = hpv2;
            C00i c00i = h0m.A06;
            I3W A042 = ((7Qb) c00i.get()).A04(A002, (C6qc) null);
            if (((7Qb) c00i.get()).A05(A002) && 6Bl.A00(A002)) {
                C2516Gfw c2516Gfw = new C2516Gfw(h0m, z);
                InterfaceC06384gn interfaceC06384gn = A042.A00;
                ?? r319 = h0m.A03;
                2Dp A03 = ((7Qb) c00i.get()).A03(A002);
                2Dp r0 = A042.A01;
                CallerContext callerContext = H0M.A07;
                C69q c69q = r319.A01;
                boolean A022 = c69q.A02();
                if (interfaceC06384gn != null) {
                    if (A022) {
                        A02 = 5BL.A02(A03, r0);
                        C07004ik c07004ik = new C07004ik(c69q.A01());
                        c07004ik.A0G = new C06394go(interfaceC06384gn);
                        A01 = new C06974ih(c07004ik);
                    } else {
                        ((C69s) 4YU.A0p(r319.A00)).A09();
                        c69s = (C69s) 4YU.A0p(r319.A00);
                        ((C69o) c69s).A02 = callerContext;
                        ((C69o) c69s).A01 = r319.A00.A01;
                        ((C69o) c69s).A04 = A03;
                        ((C69o) c69s).A03 = r0;
                        ((C69o) c69s).A00 = c2516Gfw;
                        c69s.A0B(interfaceC06384gn);
                        draweeView2 = r319;
                    }
                } else if (A022) {
                    A02 = 5BL.A02(A03, r0);
                    A01 = c69q.A01();
                } else {
                    ((C69s) 4YU.A0p(r319.A00)).A09();
                    C69s c69s2 = (C69s) 4YU.A0p(r319.A00);
                    ((C69o) c69s2).A02 = callerContext;
                    ((C69o) c69s2).A01 = r319.A00.A01;
                    ((C69o) c69s2).A04 = A03;
                    ((C69o) c69s2).A03 = r0;
                    ((C69o) c69s2).A00 = c2516Gfw;
                    A0p = c69s2;
                    draweeView = r319;
                    c69s = (C69s) A0p;
                    draweeView2 = draweeView;
                }
                C1iM.A01(r319, new 4gO(c2516Gfw), A01, A02, callerContext);
                draweeView3 = r319;
                draweeView3.setContentDescription(((5Yf) h0m.A04.get()).A00(Integer.valueOf(i + 1), Integer.valueOf(i2), A002.A0G));
            }
            ?? r3192 = h0m.A03;
            2Dp[] A07 = ((7Qb) c00i.get()).A07(A002);
            CallerContext callerContext2 = H0M.A07;
            C69q c69q2 = r3192.A01;
            if (c69q2.A02()) {
                C1iM.A01(r3192, null, c69q2.A01(), 5BL.A00(A07), callerContext2);
                draweeView3 = r3192;
                draweeView3.setContentDescription(((5Yf) h0m.A04.get()).A00(Integer.valueOf(i + 1), Integer.valueOf(i2), A002.A0G));
            }
            ((C69s) 4YU.A0p(r3192.A00)).A09();
            C69o c69o = (C69o) 4YU.A0p(r3192.A00);
            c69o.A02 = callerContext2;
            c69o.A01 = r3192.A00.A01;
            c69o.A07(A07);
            c69o.A00 = null;
            A0p = 4YU.A0p(r3192.A00);
            draweeView = r3192;
            c69s = (C69s) A0p;
            draweeView2 = draweeView;
            draweeView2.A06(c69s.A08());
            draweeView3 = draweeView2;
            draweeView3.setContentDescription(((5Yf) h0m.A04.get()).A00(Integer.valueOf(i + 1), Integer.valueOf(i2), A002.A0G));
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(r317);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if ("keyframes".equals(null) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0B() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.H0L
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L29
            r0 = 0
            r303 = r0
            java.lang.String r0 = "webp"
            r304 = r0
            r0 = r304
            r1 = 0
            boolean r0 = r0.equals(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L29
            java.lang.String r0 = "keyframes"
            r304 = r0
            r0 = r304
            r1 = 0
            boolean r0 = r0.equals(r1)
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L2b
        L29:
            r0 = 1
            r303 = r0
        L2b:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H65.A0B():boolean");
    }

    public boolean A0C(boolean z) {
        if (!(this instanceof H0L)) {
            FbDraweeView fbDraweeView = ((H0M) this).A03;
            if (fbDraweeView == null || fbDraweeView.A08() == null) {
                return false;
            }
            EXs.A00(fbDraweeView.A08(), z);
            return true;
        }
        LottieAnimationView lottieAnimationView = ((H0L) this).A02;
        if (z) {
            lottieAnimationView.A05();
            return true;
        }
        lottieAnimationView.A02 = false;
        lottieAnimationView.A08.A05();
        return true;
    }
}
