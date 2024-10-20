package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.Dg6, reason: case insensitive filesystem */
/* loaded from: Dg6.class */
public abstract class AbstractC2178Dg6 extends ESq implements GKV {
    public F6I A00;
    public 2Me A01;
    public 2dD A02;
    public boolean A03;
    public final 1Iw A04;
    public final C1qo A05;

    public AbstractC2178Dg6(1Iw r302) {
        11T.A0F(r302, 1);
        this.A04 = r302;
        if (r302.A0D == null) {
            throw AnonymousClass001.A0N("Android Context is required!");
        }
        C1qo c1qo = r302.A0E;
        11T.A0A(c1qo);
        this.A05 = c1qo;
    }

    public static DfL A03(AbstractC2150Dfe abstractC2150Dfe, 1Iw r302, CharSequence charSequence) {
        abstractC2150Dfe.A06 = charSequence;
        DfL dfL = new DfL(EMz.A05, r302);
        dfL.A01();
        return dfL;
    }

    public static C2152Dfg A04(1Iw r301, int i) {
        11T.A0F(r301, i);
        return new C2152Dfg(r301);
    }

    public static FAa A05(C2152Dfg c2152Dfg, EP4 ep4) {
        c2152Dfg.A03 = ep4;
        return new FAa();
    }

    public static final 2dD A06(AbstractC2178Dg6 abstractC2178Dg6) {
        2dD r302 = abstractC2178Dg6.A02;
        if (r302 == null) {
            r302 = C2dB.A00(abstractC2178Dg6.A04);
            abstractC2178Dg6.A02 = r302;
        }
        return r302;
    }

    public static void A07(CallerContext callerContext, AbstractC2178Dg6 abstractC2178Dg6, 2cM r303) {
        r303.A2e(abstractC2178Dg6.A0O(callerContext));
    }

    public static void A08(CallerContext callerContext, AbstractC2178Dg6 abstractC2178Dg6, C2sn c2sn) {
        c2sn.A00(abstractC2178Dg6.A0O(callerContext));
    }

    public static void A09(CallerContext callerContext, AbstractC2178Dg6 abstractC2178Dg6, C1rq c1rq) {
        c1rq.A2f(abstractC2178Dg6.A0O(callerContext));
    }

    public static void A0A(AbstractC2162Dfq abstractC2162Dfq, 1Iw r302, Class cls, String str, int i) {
        abstractC2162Dfq.A06 = 1LI.A09(r302, cls, str, i);
    }

    public static void A0B(AbstractC2178Dg6 abstractC2178Dg6, C1qo c1qo, C26z c26z, float f) {
        A06(abstractC2178Dg6).A2C(c26z, c1qo.A02(f));
    }

    public static void A0C(2MR r301, C2152Dfg c2152Dfg, FAa fAa) {
        fAa.A06(r301);
        c2152Dfg.A04 = fAa.A01();
    }

    public static void A0D(AbstractC2150Dfe abstractC2150Dfe) {
        abstractC2150Dfe.A01 = new EvX(0S2.A00).A00();
    }

    public static void A0E(AbstractC2150Dfe abstractC2150Dfe) {
        abstractC2150Dfe.A03.A0G(abstractC2150Dfe.A09);
        FFO ffo = abstractC2150Dfe.A01;
        if (ffo == null || 2 - ffo.A09.intValue() != 0) {
            return;
        }
        1Iw r0 = abstractC2150Dfe.A0A;
        11T.A0F(r0, 0);
        C1rs c1rs = abstractC2150Dfe.A03;
        11T.A0F(c1rs, 0);
        float f = abstractC2150Dfe.A01.A03;
        Integer num = FFO.A0A;
        11T.A0F(num, 0);
        C5z7.A00(c1rs, EVp.A00(FAL.A05.A00(r0), r0, 2lO.A02, num, f));
        abstractC2150Dfe.A03 = c1rs;
    }

    public static void A0F(AbstractC2150Dfe abstractC2150Dfe, EMz eMz, 1Iw r303) {
        DfL dfL = new DfL(eMz, r303);
        dfL.A02();
        abstractC2150Dfe.A00 = dfL;
        abstractC2150Dfe.A02 = abstractC2150Dfe.A03;
    }

    public static void A0G(C2152Dfg c2152Dfg, FAa fAa) {
        c2152Dfg.A04 = fAa.A01();
    }

    public static void A0H(C2152Dfg c2152Dfg, FAa fAa) {
        fAa.A04();
        c2152Dfg.A04 = fAa.A01();
    }

    public final FF6 A0I(3Eh r302) {
        Fcg fcg = (Fcg) 1Br.A0B(A0M().A03);
        if (fcg == null || r302 == null) {
            return null;
        }
        if (r302.ordinal() != 0) {
            return new FF6(r302);
        }
        fcg.A00.get();
        return FF6.A02;
    }

    public AbstractC2178Dg6 A0J(int i) {
        A0L(4YU.A0E(this.A04).getString(i));
        return this;
    }

    public AbstractC2178Dg6 A0K(C26z c26z, int i) {
        11T.A0F(c26z, 0);
        A06(this).A2A(c26z, i);
        return this;
    }

    public AbstractC2178Dg6 A0L(CharSequence charSequence) {
        A06(this).A2S(charSequence);
        return this;
    }

    public final F6I A0M() {
        F6I f6i = this.A00;
        if (f6i == null) {
            f6i = new F6I(this.A04);
            this.A00 = f6i;
        }
        return f6i;
    }

    public abstract C1rs A0N(EzJ ezJ);

    public final 1LI A0O(CallerContext callerContext) {
        if (callerContext == null) {
            ((ESq) this).A00 = true;
        }
        1LI r304 = null;
        if (callerContext != null) {
            1Iw r0 = this.A04;
            11T.A0F(r0, 0);
            EvK evK = new EvK(DKE.A0U(r0), r0);
            evK.A03 = this.A01;
            evK.A00 = callerContext;
            evK.A04 = A0P();
            C1rs ACp = ACp(evK.A00());
            if (ACp != null) {
                r304 = ACp.A2V();
            }
        }
        return r304;
    }

    public String A0P() {
        return this instanceof C2152Dfg ? "FDSText" : this instanceof AbstractC2162Dfq ? "FDSButton" : this instanceof AbstractC2157Dfl ? ((AbstractC2157Dfl) this) instanceof C2176Dg4 ? "FDSInstantFeedbackProfilePhotoAddOn" : "FDSProfilePhoto" : this instanceof C2160Dfo ? "FDSTextPairing" : this instanceof DfZ ? "FDSTable" : this instanceof C2155Dfj ? "FDSProgressRing" : this instanceof C2146Dfa ? "FDSBaselineAlignedRow" : this instanceof AbstractC2156Dfk ? "FDSIcon" : this instanceof DfX ? "FDSContainedIcon" : this instanceof AbstractC2150Dfe ? ((AbstractC2150Dfe) this) instanceof C2167Dfv ? "FDSPressedStateExperimental" : "FDSPressedState" : this instanceof DfO ? "FB4ACustomPivotLinks" : this instanceof DfU ? "FDSNullState" : this instanceof DfN ? "FDSInstantFeedbackErrorAddOn" : this instanceof C2148Dfc ? "FDSInstantFeedback" : this instanceof C2153Dfh ? "FDSFailedLoadingState" : this instanceof DfM ? "FDSDivider" : this instanceof DfS ? "FDSInternalSwitch" : this instanceof DfR ? "FDSInternalRadioButton" : this instanceof DfQ ? "FDSInternalCheckBox" : this instanceof C2147Dfb ? "FDSContextualMessage" : this instanceof DfW ? "FDSHeader" : this instanceof C2163Dfr ? "FDSToggleListCell" : this instanceof C2161Dfp ? "FDSToggleButton" : this instanceof C2165Dft ? "FDSListCell" : this instanceof DfT ? "FDSInternalPillButton" : this instanceof AbstractC2159Dfn ? "FDSInternalIconButton" : this instanceof AbstractC2158Dfm ? "FDSInternalActionTextButton" : this instanceof DfV ? "FDSIconToggleButton" : this instanceof DfP ? "FDSContextRow" : this instanceof C2151Dff ? "FDSContainedIconButton" : this instanceof C2149Dfd ? "FDSButtonGroup" : this instanceof C2154Dfi ? "FDSInternalBottomSheetHeader" : "FDSInternalActionCell";
    }

    public void A0Q(float f) {
        A06(this).A0j(f);
    }

    public void A0R(float f) {
        A06(this).A0k(f);
    }

    public final void A0S(float f) {
        A06(this).A1L(this.A05.A02(f));
    }

    public final void A0T(float f) {
        A06(this).A1U(this.A05.A02(f));
    }

    public final void A0U(float f) {
        A06(this).A0C(this.A05.A02(f));
    }

    public final void A0V(2lO r302) {
        2dD r303 = this.A02;
        if (r303 == null) {
            r303 = C2dB.A00(this.A04);
            this.A02 = r303;
        }
        if (r302 != null) {
            C5z7.A00(r303, r302);
        }
    }

    public void A0W(C1ro c1ro) {
        A06(this).A1y(c1ro);
    }

    public void A0X(C26z c26z, float f) {
        if (this instanceof C2152Dfg) {
            ((C2152Dfg) this).A0h(c26z, f);
            return;
        }
        if (!(this instanceof AbstractC2157Dfl)) {
            11T.A0F(c26z, 0);
        }
        A0K(c26z, this.A05.A02(f));
    }

    public final void A0Y(C26z c26z, float f) {
        A06(this).A2E(c26z, this.A05.A02(f));
    }

    public final void A0Z(C26z c26z, float f) {
        A06(this).A2G(c26z, this.A05.A02(f));
    }

    public void A0a(C26z c26z, int i) {
        if (!(this instanceof AbstractC2157Dfl)) {
            11T.A0F(c26z, 0);
        }
        A0K(c26z, this.A05.A06(i));
    }

    public final void A0b(2dP r302) {
        A06(this).A2H(r302);
    }

    public void A0c(String str) {
        if (this instanceof AbstractC2150Dfe) {
            ((AbstractC2150Dfe) this).A07 = str;
        } else {
            A06(this).A0F(str);
        }
    }

    public final void A0d(String str) {
        A06(this).A2K(str);
    }

    public final void A0e(boolean z) {
        A06(this).A2M(z);
    }

    public /* bridge */ /* synthetic */ GKV A7v(C1ro c1ro) {
        A0W(c1ro);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0144, code lost:
    
        if (r0.length() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015b, code lost:
    
        if (r0.length() == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0172, code lost:
    
        if (r0.length() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b4, code lost:
    
        if (r306 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e2, code lost:
    
        if (r305.A09 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ff, code lost:
    
        if (r305.A07 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
    
        if (r311 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x027e, code lost:
    
        if (r0 == X.ENZ.A05) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C1rs ACp(X.EzJ r302) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2178Dg6.ACp(X.EzJ):X.1rs");
    }

    public /* bridge */ /* synthetic */ GKV ATI(float f) {
        A0Q(0.0f);
        return this;
    }

    public /* bridge */ /* synthetic */ GKV ATJ(float f) {
        A0R(f);
        return this;
    }

    public int AZ1(EzJ ezJ) {
        return 0;
    }

    public /* bridge */ /* synthetic */ GKV BcJ(C26z c26z, float f) {
        if (!(this instanceof C2152Dfg)) {
            A0X(c26z, f);
            return this;
        }
        C2152Dfg c2152Dfg = (C2152Dfg) this;
        c2152Dfg.A0h(c26z, f);
        return c2152Dfg;
    }

    public /* bridge */ /* synthetic */ GKV BcK(C26z c26z, int i) {
        if (!(this instanceof C2152Dfg)) {
            A0K(c26z, i);
            return this;
        }
        C2152Dfg c2152Dfg = (C2152Dfg) this;
        c2152Dfg.A0j(c26z, i);
        return c2152Dfg;
    }

    public /* bridge */ /* synthetic */ GKV Bd8(float f) {
        A06(this).A0q(33.333336f);
        return this;
    }

    public /* bridge */ /* synthetic */ GKV BeO(float f) {
        A06(this).A0t(f);
        return this;
    }

    public /* bridge */ /* synthetic */ GKV D94(Object obj) {
        A06(this).A0E(obj);
        return this;
    }
}
