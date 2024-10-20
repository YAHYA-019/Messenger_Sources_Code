package X;

import android.content.Context;
import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6bm, reason: invalid class name */
/* loaded from: 6bm.class */
public final class C6bm extends C1rj {
    public static final C1u2 A0J = (C1u2) 1Bi.A05(C1u2.class, (Class) null);
    public int A00;
    public 2S4 A01;
    public 1LH A02;
    public 7QI A03;
    public MontageBucketInfo A04;
    public ThreadViewColorScheme A05;
    public 6OB A06;
    public 6OL A07;
    public 6O8 A08;
    public C2p1 A09;
    public C2fr A0A;
    public ThreadThemeInfo A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public C6bm() {
        super("M4ThreadViewTitleBarCustomTitle");
        this.A0G = false;
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A0D), this.A08, Boolean.valueOf(this.A0E), this.A05, this.A03, Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0G), this.A04, this.A06, Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0I), this.A0C, this.A02, this.A07, null, this.A09, this.A0B, this.A0A, this.A01, Integer.valueOf(this.A00)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x011d, code lost:
    
        if (r334 != 0) goto L11;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6bm.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C3s9 A13(1Iw r302) {
        boolean z = this.A0E;
        String str = this.A0C;
        if (!z) {
            return null;
        }
        5Rn r0 = 5Rn.A01;
        5X3 A00 = C3s9.A00(r0, 0Pz.A0W("subtitle-transition-key-", str));
        A00.A03(C2jm.A00);
        A00.A01(0.0f);
        A00.A02(0.0f);
        5X3 A002 = C3s9.A00(r0, "custom-title-transition-key");
        A002.A03(C2jm.A09);
        return new 5XA(new 5X3[]{A00, A002});
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r320v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r320v0 ??
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
    /* JADX WARN: Not initialized variable reg: 320, insn: 0x0542: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r320 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:222:0x0542 */
    @Override // X.C1rj
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6bm.A15(X.1Im, java.lang.Object):java.lang.Object");
    }

    @Override // X.C1rj
    public void A1C(1Iw r302) {
        C6bo c6bo = (C6bo) r302.A06().A00();
        C6br c6br = c6bo.A01;
        82W r0 = c6bo.A00;
        if (c6br != null) {
            C6bq c6bq = c6br.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r02 = c6bq.A01;
            r02.A08("com.facebook.messaging.threadview.plugins.interfaces.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onAttached", andIncrement);
            try {
                if (!C6bq.A00(c6bq)) {
                    r02.A02((Exception) null, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onAttached", andIncrement);
                    return;
                }
                int andIncrement2 = atomicInteger.getAndIncrement();
                r02.A0A("com.facebook.messaging.copresence.plugins.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "messaging.copresence.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "com.facebook.messaging.threadview.plugins.interfaces.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", andIncrement2, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "com.facebook.messaging.copresence.plugins.threadheader.ThreadheaderKillSwitch", "onAttached");
                try {
                    try {
                        11T.A0F(r0, 0);
                        throw AnonymousClass001.A0Q("threadViewSurface");
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r02.A04((Exception) null, "messaging.copresence.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onAttached", andIncrement2);
                    throw th;
                }
            } catch (Throwable th2) {
                r02.A02((Exception) null, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onAttached", andIncrement);
                throw th2;
            }
        }
    }

    @Override // X.C1rj
    public void A1D(1Iw r302) {
        C6br c6br = ((C6bo) r302.A06().A00()).A01;
        if (c6br != null) {
            C6bq c6bq = c6br.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = c6bq.A01;
            r0.A08("com.facebook.messaging.threadview.plugins.interfaces.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onDetached", andIncrement);
            Exception e = null;
            try {
                if (!C6bq.A00(c6bq)) {
                    r0.A02((Exception) null, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onDetached", andIncrement);
                    return;
                }
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.copresence.plugins.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "messaging.copresence.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "com.facebook.messaging.threadview.plugins.interfaces.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", andIncrement2, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "com.facebook.messaging.copresence.plugins.threadheader.ThreadheaderKillSwitch", "onDetached");
                try {
                    try {
                        throw AnonymousClass001.A0Q("threadViewSurface");
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.copresence.threadheader.copresencecustomtitle.CopresenceCustomTitleImplementation", "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onDetached", andIncrement2);
                    throw th;
                }
            } catch (Throwable th2) {
                r0.A02(e, "messaging.threadview.titlebar.customtitle.TitleBarCustomTitleInterfaceSpec", "onDetached", andIncrement);
                throw th2;
            }
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        82W r305;
        C6bo c6bo = (C6bo) r303;
        C6br c6br = null;
        2S4 r0 = this.A01;
        Float valueOf = Float.valueOf(0.0f);
        if (r0 != null) {
            Context context = r302.A0D;
            c6br = new C6br((C6bp) C1Y6.A00(context, "com_facebook_messaging_threadview_plugins_interfaces_titlebar_customtitle_TitleBarCustomTitleInterfaceSpec", "All", new Object[]{r0, context}));
            if (c6br.A00() != null) {
                r305 = c6br.A00();
                c6bo.A00 = r305;
                c6bo.A01 = c6br;
            }
        }
        r305 = new 82W(new C1rn(valueOf));
        c6bo.A00 = r305;
        c6bo.A01 = c6br;
    }

    @Override // X.C1rj
    public boolean A1R() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
