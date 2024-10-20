package X;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: X.1rs, reason: invalid class name */
/* loaded from: 1rs.class */
public abstract class C1rs {
    public C1rj A00;
    public final 1Iw A01;
    public final C1qo A02;

    public C1rs(1LI r302, 1Iw r303, int i, int i2) {
        r303.getClass();
        this.A02 = r303.A0E;
        C1rj c1rj = (C1rj) r302;
        this.A00 = c1rj;
        this.A01 = r303;
        if (r303.A02 != null) {
            c1rj.A01 = r303.A0C();
        }
        if (i != 0 || i2 != 0) {
            C1rj c1rj2 = this.A00;
            C1ti A0v = c1rj2.A0v();
            A0v.A00 = i;
            A0v.A01 = i2;
            try {
                r303.A00 = i;
                r303.A01 = i2;
                c1rj2.A1E(r303);
                r303.A00 = 0;
                r303.A01 = 0;
            } catch (Exception e) {
                C4Cv.A01(r302, r303, e);
            }
        }
        ((1LI) this.A00).A02 = 1LI.A0I(r303.A0D);
    }

    public static void A00(BitSet bitSet, String[] strArr) {
        A05(bitSet, strArr, 2);
    }

    public static void A01(BitSet bitSet, String[] strArr) {
        A05(bitSet, strArr, 1);
    }

    public static void A02(BitSet bitSet, String[] strArr) {
        A05(bitSet, strArr, 4);
    }

    public static void A03(BitSet bitSet, String[] strArr) {
        A05(bitSet, strArr, 3);
    }

    public static void A04(BitSet bitSet, String[] strArr) {
        A05(bitSet, strArr, 5);
    }

    public static void A05(BitSet bitSet, String[] strArr, int i) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    A0s.add(strArr[i2]);
                }
            }
            throw 1BK.A0i("The following props are not marked as optional and were not supplied: ", Arrays.toString(A0s.toArray()));
        }
    }

    public C1rs A0B(float f) {
        this.A00.A0v().A09(f);
        return this;
    }

    public C1rs A0C(int i) {
        this.A00.A0v().A0I(i);
        return this;
    }

    public C1rs A0D(Drawable drawable) {
        this.A00.A0v().A0J(drawable);
        return this;
    }

    public C1rs A0E(Object obj) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 2;
        A02.A0b = obj;
        return this;
    }

    public C1rs A0F(String str) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 4194304;
        A02.A0c = str;
        return this;
    }

    public C1rs A0G(boolean z) {
        29K A02 = C1ti.A02(this.A00.A0v());
        int i = 2;
        if (z) {
            i = 1;
        }
        A02.A0E = i;
        return this;
    }

    public void A0H() {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 2;
        A01.A0M = true;
    }

    public void A0I() {
        StateListAnimator loadStateListAnimator = AnimatorInflater.loadStateListAnimator(this.A01.A0D, 2132411522);
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        A01.A05 = loadStateListAnimator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r0.floatValue() > 0.0f) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0J() {
        /*
            r301 = this;
            boolean r0 = X.C02A.isZeroAlphaLoggingEnabled
            r302 = r0
            r0 = r302
            if (r0 == 0) goto La9
            r0 = r301
            X.1rj r0 = r0.A00
            X.1ti r0 = r0.A00
            r303 = r0
            r0 = r303
            if (r0 == 0) goto La9
            r0 = r303
            X.29K r0 = r0.A08
            r304 = r0
            r0 = r304
            if (r0 == 0) goto La9
            r0 = r304
            float r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L4b
            r0 = r303
            float r0 = r0.floatValue()
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r307
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = 1
            r308 = r0
            r0 = 1
            r307 = r0
            r0 = r302
            if (r0 <= 0) goto L54
        L4b:
            r0 = 0
            r308 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r309 = r0
        L54:
            r0 = r304
            X.1Im r0 = r0.A0I
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7e
            r0 = r304
            X.1Im r0 = r0.A0M
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7e
            r0 = r304
            X.1Im r0 = r0.A0X
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7e
            r0 = r304
            X.1Im r0 = r0.A0L
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L7e
            r0 = 0
            r306 = r0
            r0 = 0
            r310 = r0
        L7e:
            r0 = r308
            if (r0 == 0) goto La9
            r0 = r306
            if (r0 == 0) goto La9
            X.1Lc r0 = X.1Lc.A06
            r310 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            X.3jI r0 = new X.3jI
            r309 = r0
            r0 = r309
            r1 = r301
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.String r0 = "ZeroAlphaComponent"
            r303 = r0
            r0 = r310
            r1 = r303
            r2 = r309
            X.3GO.A00(r0, r1, r2)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1rs.A0J():void");
    }

    public void A0K() {
        this.A00.A0v().A0A = true;
    }

    public final void A0L() {
        A1y(C1ro.CENTER);
    }

    public final void A0M() {
        A1y(C1ro.FLEX_END);
    }

    public final void A0N() {
        A1y(C1ro.FLEX_START);
    }

    public final void A0O() {
        A1G(2130969933);
    }

    public final void A0P() {
        A1G(R.attr.selectableItemBackground);
    }

    public final void A0Q() {
        A0g(1.0f);
    }

    public final void A0R() {
        A0j(1.0f);
    }

    public final void A0S() {
        A0k(0.0f);
    }

    public final void A0T() {
        A0k(1.0f);
    }

    public final void A0U() {
        A0l(48.0f);
    }

    public final void A0V() {
        A0m(100.0f);
    }

    public final void A0W() {
        A24(C26z.HORIZONTAL, 16.0f);
    }

    public final void A0X() {
        A25(C26z.HORIZONTAL, 16.0f);
    }

    public final void A0Y() {
        A25(C26z.HORIZONTAL, 12.0f);
    }

    public final void A0Z() {
        A25(C26z.VERTICAL, 8.0f);
    }

    public final void A0a() {
        A2D(C26z.HORIZONTAL, 2132279327);
    }

    public final void A0b() {
        A2E(C26z.ALL, 0);
    }

    public final void A0c() {
        A2H(2dP.A01);
    }

    public final void A0d() {
        A1x(5Rn.A01);
    }

    public final void A0e() {
        A10(100.0f);
    }

    public void A0f(float f) {
        C1tk A00 = C1ti.A00(this.A00.A0v());
        A00.A0I |= Constants.LOAD_RESULT_WITH_VDEX_ODEX;
        A00.A00 = f;
    }

    public void A0g(float f) {
        C1tk A00 = C1ti.A00(this.A00.A0v());
        A00.A0I |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        A00.A01 = f;
    }

    public void A0h(float f) {
        A1K(this.A02.A02(f));
    }

    public void A0i(float f) {
        C1tk A00 = C1ti.A00(this.A00.A0v());
        A00.A0I |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        A00.A02 = f;
    }

    public void A0j(float f) {
        C1tk A00 = C1ti.A00(this.A00.A0v());
        A00.A0I |= Constants.LOAD_RESULT_PGO;
        A00.A03 = f;
    }

    public void A0k(float f) {
        C1tk A00 = C1ti.A00(this.A00.A0v());
        A00.A0I |= 65536;
        A00.A04 = f;
    }

    public void A0l(float f) {
        A1L(this.A02.A02(f));
    }

    public void A0m(float f) {
        this.A00.A0v().A03(f);
    }

    public void A0n(float f) {
        A1O(this.A02.A02(f));
    }

    public void A0o(float f) {
        this.A00.A0v().A04(f);
    }

    public void A0p(float f) {
        A1Q(this.A02.A02(f));
    }

    public void A0q(float f) {
        this.A00.A0v().A05(f);
    }

    public void A0r(float f) {
        A1S(this.A02.A02(f));
    }

    public void A0s(float f) {
        A1U(this.A02.A02(f));
    }

    public void A0t(float f) {
        this.A00.A0v().A07(f);
    }

    public void A0u(float f) {
        this.A00.A0v().A0A(f);
    }

    public void A0v(float f) {
        this.A00.A0v().A0B(f);
    }

    public void A0w(float f) {
        this.A00.A0v().A0C(this.A02.A02(f));
    }

    public void A0x(float f) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A01.A00 = f;
    }

    public void A0y(float f) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
        A01.A01 = f;
    }

    public void A0z(float f) {
        A0C(this.A02.A02(f));
    }

    public void A10(float f) {
        this.A00.A0v().A08(f);
    }

    public final void A11(float f) {
        A24(C26z.LEFT, f);
    }

    public final void A12(float f) {
        A24(C26z.VERTICAL, f);
    }

    public final void A13(float f) {
        A24(C26z.START, f);
    }

    public final void A14(float f) {
        A24(C26z.RIGHT, f);
    }

    public final void A15(float f) {
        A24(C26z.END, f);
    }

    public final void A16(float f) {
        A24(C26z.HORIZONTAL, f);
    }

    public final void A17(float f) {
        A24(C26z.TOP, f);
    }

    public final void A18(float f) {
        A24(C26z.BOTTOM, f);
    }

    public final void A19(float f) {
        A25(C26z.TOP, f);
    }

    public final void A1A(float f) {
        A25(C26z.BOTTOM, f);
    }

    public final void A1B(float f) {
        A25(C26z.VERTICAL, f);
    }

    public final void A1C(float f) {
        A25(C26z.HORIZONTAL, f);
    }

    public final void A1D(float f) {
        A25(C26z.ALL, f);
    }

    public final void A1E(float f) {
        A27(C26z.BOTTOM, f);
    }

    public final void A1F(float f) {
        A27(C26z.TOP, f);
    }

    public void A1G(int i) {
        A1I(this.A02.A08(i));
    }

    public void A1H(int i) {
        A0D(new ColorDrawable(i));
    }

    public void A1I(int i) {
        A0D(i == 0 ? null : this.A01.A0D.getDrawable(i));
    }

    public void A1J(int i) {
        A2S(this.A01.A0D.getResources().getString(i));
    }

    public void A1K(int i) {
        C1tk A00 = C1ti.A00(this.A00.A0v());
        A00.A0I |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        A00.A0B = i;
    }

    public void A1L(int i) {
        this.A00.A0v().A0D(i);
    }

    public void A1M(int i) {
        A1L(this.A02.A06(i));
    }

    public void A1N(int i) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 1;
        A01.A02 = i;
    }

    public void A1O(int i) {
        this.A00.A0v().A0E(i);
    }

    public void A1P(int i) {
        A1O(this.A02.A06(i));
    }

    public void A1Q(int i) {
        this.A00.A0v().A0F(i);
    }

    public void A1R(int i) {
        A1Q(this.A02.A06(i));
    }

    public void A1S(int i) {
        this.A00.A0v().A0G(i);
    }

    public void A1T(int i) {
        A1S(this.A02.A06(i));
    }

    public void A1U(int i) {
        this.A00.A0v().A0H(i);
    }

    public void A1V(int i) {
        A1U(this.A02.A06(i));
    }

    public void A1W(int i) {
        A0C(this.A02.A06(i));
    }

    public final void A1X(int i) {
        A2B(C26z.HORIZONTAL, i);
    }

    public final void A1Y(int i) {
        A2B(C26z.TOP, i);
    }

    public final void A1Z(int i) {
        A2D(C26z.TOP, i);
    }

    public final void A1a(int i) {
        A2D(C26z.BOTTOM, i);
    }

    public final void A1b(int i) {
        A2D(C26z.VERTICAL, i);
    }

    public final void A1c(int i) {
        A2D(C26z.ALL, i);
    }

    public final void A1d(int i) {
        A2D(C26z.HORIZONTAL, i);
    }

    public void A1e(Drawable drawable) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 4;
        A01.A07 = drawable;
    }

    public void A1f(SparseArray sparseArray) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 4;
        SparseArray sparseArray2 = A02.A0G;
        if (sparseArray2 != null) {
            sparseArray = AnonymousClass675.A00(sparseArray2, sparseArray);
        }
        A02.A0G = sparseArray;
    }

    public void A1g(ViewOutlineProvider viewOutlineProvider) {
        this.A00.A0v().A0K(viewOutlineProvider);
    }

    public void A1h(C6ni c6ni) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        if (c6ni != null) {
            A01.A04 |= 8192;
            A01.A08 = c6ni;
        }
    }

    public void A1i(C1rn c1rn) {
        this.A00.A0u().put(1, c1rn);
    }

    public void A1j(C1rn c1rn) {
        this.A00.A0u().put(5, c1rn);
    }

    public void A1k(C1rn c1rn) {
        this.A00.A0u().put(2, c1rn);
    }

    public void A1l(1Im r302) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 131072;
        A02.A0K = r302;
    }

    public void A1m(1Im r302) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 16;
        A01.A0A = r302;
    }

    public void A1n(1Im r302) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 32;
        A01.A0B = r302;
    }

    public void A1o(1Im r302) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 262144;
        A02.A0L = r302;
    }

    public void A1p(1Im r302) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 64;
        A01.A0C = r302;
    }

    public void A1q(1Im r302) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 16;
        A02.A0M = r302;
    }

    public void A1r(1Im r302) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 256;
        A02.A0O = r302;
    }

    public void A1s(1Im r302) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 32;
        A02.A0X = r302;
    }

    public void A1t(1Im r302) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 128;
        A01.A0D = r302;
    }

    public void A1u(1Im r302) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 65536;
        A01.A0E = r302;
    }

    public void A1v(1Im r302) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= 8;
        A01.A0F = r302;
    }

    public void A1w(C2iw c2iw) {
        ((1LI) this.A00).A01 = c2iw;
    }

    public void A1x(5Rn r302) {
        2cS A01 = C1ti.A01(this.A00.A0v());
        A01.A04 |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        A01.A0G = r302;
    }

    public void A1y(C1ro c1ro) {
        C1ti A0v = this.A00.A0v();
        11T.A0F(c1ro, 0);
        C1tk A00 = C1ti.A00(A0v);
        A00.A0I |= 8192;
        A00.A0R = c1ro;
    }

    public void A1z(AnonymousClass255 anonymousClass255) {
        C1ti A0v = this.A00.A0v();
        int A00 = AnonymousClass254.A00(anonymousClass255);
        C1tk A002 = C1ti.A00(A0v);
        A002.A0I |= RequestDefragmentingOutputStream.BODY_BUFFER_SIZE;
        A002.A0Q = new C1tr(A00);
    }

    public void A20(C26z c26z) {
        this.A00.A0v().A0N(c26z);
    }

    public final void A21(C26z c26z) {
        A2B(c26z, 2132279314);
    }

    public final void A22(C26z c26z) {
        A2B(c26z, 2132279327);
    }

    public final void A23(C26z c26z) {
        A2D(c26z, 2132279327);
    }

    public void A24(C26z c26z, float f) {
        A2A(c26z, this.A02.A02(f));
    }

    public void A25(C26z c26z, float f) {
        A2C(c26z, this.A02.A02(f));
    }

    public void A26(C26z c26z, float f) {
        this.A00.A0v().A0P(c26z, f);
    }

    public void A27(C26z c26z, float f) {
        A2E(c26z, this.A02.A02(f));
    }

    public void A28(C26z c26z, float f) {
        C1ti A0v = this.A00.A0v();
        11T.A0F(c26z, 0);
        C1tk A00 = C1ti.A00(A0v);
        A00.A0I |= 4194304;
        2cN r308 = A00.A0O;
        if (r308 == null) {
            r308 = new 2cN();
        }
        r308.A02(c26z, f);
        A00.A0O = r308;
    }

    public void A29(C26z c26z, float f) {
        A2G(c26z, this.A02.A02(f));
    }

    public void A2A(C26z c26z, int i) {
        this.A00.A0v().A0Q(c26z, i);
    }

    public void A2B(C26z c26z, int i) {
        A2A(c26z, this.A02.A06(i));
    }

    public void A2C(C26z c26z, int i) {
        this.A00.A0v().CWc(c26z, i);
    }

    public void A2D(C26z c26z, int i) {
        A2C(c26z, this.A02.A06(i));
    }

    public void A2E(C26z c26z, int i) {
        this.A00.A0v().A0R(c26z, i);
    }

    public void A2F(C26z c26z, int i) {
        A2E(c26z, this.A02.A06(i));
    }

    public void A2G(C26z c26z, int i) {
        this.A00.A0v().A0S(c26z, i);
    }

    public void A2H(2dP r302) {
        C1ti A0v = this.A00.A0v();
        11T.A0F(r302, 0);
        C1tk A00 = C1ti.A00(A0v);
        A00.A0I |= 1048576;
        A00.A0T = r302;
    }

    public void A2I(CharSequence charSequence) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 16777216;
        A02.A0Z = charSequence;
    }

    public void A2J(String str) {
        if (str == null) {
            1LI r0 = this.A01.A02;
            C53s.A00("Component:NullKeySet", 0S2.A01, 0Pz.A0j("Setting a null key from ", r0 != null ? r0.A0a() : "unknown component", " which is usually a mistake! If it is not, explicitly set the String 'null'"));
            str = "null";
        }
        C1rj c1rj = this.A00;
        ((1LI) c1rj).A04 = true;
        ((1LI) c1rj).A03 = str;
    }

    public void A2K(String str) {
        C1ti A0v = this.A00.A0v();
        A0v.A02 |= 2;
        A0v.A09 = str;
    }

    public void A2L(String str) {
        C1rj c1rj = this.A00;
        C1ti A0v = c1rj.A0v();
        String str2 = c1rj.A01;
        2cS A01 = C1ti.A01(A0v);
        A01.A04 |= 512;
        A01.A0H = str;
        A01.A0I = str2;
        2cS r0 = c1rj.A0v().A07;
        if (r0 == null || r0.A0G == null) {
            A1x(C3s9.A04);
        }
    }

    public void A2M(boolean z) {
        29K A02 = C1ti.A02(this.A00.A0v());
        int i = 2;
        if (z) {
            i = 1;
        }
        A02.A09 = i;
    }

    public void A2N(boolean z) {
        29K A02 = C1ti.A02(this.A00.A0v());
        int i = 2;
        if (z) {
            i = 1;
        }
        A02.A0A = i;
    }

    public void A2O(boolean z) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 8388608;
        A02.A0f = z;
    }

    public void A2P(boolean z) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
        A02.A0g = z;
    }

    public void A2Q(boolean z) {
        29K A02 = C1ti.A02(this.A00.A0v());
        int i = 2;
        if (z) {
            i = 1;
        }
        A02.A0C = i;
    }

    public void A2R(Object[] objArr, int i) {
        A2S(this.A01.A0D.getResources().getString(i, objArr));
    }

    public C1rs A2S(CharSequence charSequence) {
        29K A02 = C1ti.A02(this.A00.A0v());
        A02.A0F |= 1;
        A02.A0a = charSequence;
        return this;
    }

    public C1rs A2T(1Im r302) {
        this.A00.A0v().A0M(r302);
        return this;
    }

    public C1rs A2U(boolean z) {
        29K A02 = C1ti.A02(this.A00.A0v());
        int i = 2;
        if (z) {
            i = 1;
        }
        A02.A0B = i;
        return this;
    }

    public 1LI A2V() {
        if (this instanceof 2qP) {
            return ((2qP) this).A2W();
        }
        if (this instanceof C31f) {
            return ((C31f) this).A2W();
        }
        if (this instanceof C2pz) {
            return ((C2pz) this).A2W();
        }
        if (this instanceof C2ki) {
            return ((C2ki) this).A2W();
        }
        if (this instanceof C2cm) {
            C2cm c2cm = (C2cm) this;
            c2cm.A0J();
            return c2cm.A00;
        }
        if (this instanceof C2yw) {
            C2yw c2yw = (C2yw) this;
            c2yw.A0J();
            return c2yw.A01;
        }
        if (this instanceof 2rS) {
            return ((2rS) this).A2W();
        }
        if (this instanceof C2sS) {
            return ((C2sS) this).A2W();
        }
        if (this instanceof C2q4) {
            return ((C2q4) this).A2W();
        }
        if (this instanceof C36l) {
            C36l c36l = (C36l) this;
            A04(c36l.A02, c36l.A03);
            c36l.A0J();
            return c36l.A01;
        }
        if (this instanceof C2cq) {
            return ((C2cq) this).A2W();
        }
        if (this instanceof C36n) {
            C36n c36n = (C36n) this;
            A01(c36n.A02, c36n.A03);
            c36n.A0J();
            return c36n.A01;
        }
        if (this instanceof C36m) {
            C36m c36m = (C36m) this;
            A00(c36m.A02, c36m.A03);
            c36m.A0J();
            return c36m.A01;
        }
        if (this instanceof C36a) {
            C36a c36a = (C36a) this;
            c36a.A0J();
            return c36a.A01;
        }
        if (this instanceof 2zT) {
            return ((2zT) this).A2W();
        }
        if (this instanceof 31C) {
            31C r0 = (31C) this;
            A00(r0.A02, r0.A03);
            r0.A0J();
            return r0.A01;
        }
        if (this instanceof 36Z) {
            36Z r02 = (36Z) this;
            r02.A0J();
            return r02.A01;
        }
        if (this instanceof 2zF) {
            2zF r03 = (2zF) this;
            A03(r03.A02, r03.A03);
            r03.A0J();
            return r03.A01;
        }
        if (this instanceof 2zX) {
            return ((2zX) this).A2W();
        }
        if (this instanceof 2zY) {
            return ((2zY) this).A2W();
        }
        if (this instanceof C2zl) {
            C2zl c2zl = (C2zl) this;
            A05(c2zl.A02, c2zl.A03, 9);
            c2zl.A0J();
            return c2zl.A01;
        }
        if (this instanceof C2zo) {
            C2zo c2zo = (C2zo) this;
            A03(c2zo.A02, c2zo.A03);
            c2zo.A0J();
            return c2zo.A01;
        }
        if (this instanceof C2zp) {
            C2zp c2zp = (C2zp) this;
            A01(c2zp.A02, c2zp.A03);
            c2zp.A0J();
            return c2zp.A01;
        }
        if (this instanceof C2zk) {
            return ((C2zk) this).A2W();
        }
        if (this instanceof C2zi) {
            return ((C2zi) this).A2W();
        }
        if (this instanceof C2zn) {
            C2zn c2zn = (C2zn) this;
            A00(c2zn.A02, c2zn.A03);
            c2zn.A0J();
            return c2zn.A01;
        }
        if (this instanceof AnonymousClass300) {
            AnonymousClass300 anonymousClass300 = (AnonymousClass300) this;
            A02(anonymousClass300.A02, anonymousClass300.A03);
            anonymousClass300.A0J();
            return anonymousClass300.A01;
        }
        if (this instanceof C2ze) {
            return ((C2ze) this).A2W();
        }
        if (this instanceof C30h) {
            C30h c30h = (C30h) this;
            A05(c30h.A02, c30h.A03, 6);
            c30h.A0J();
            return c30h.A01;
        }
        if (this instanceof C30r) {
            C30r c30r = (C30r) this;
            A01(c30r.A02, c30r.A03);
            c30r.A0J();
            return c30r.A01;
        }
        if (this instanceof 2zD) {
            2zD r04 = (2zD) this;
            A00(r04.A02, r04.A03);
            r04.A0J();
            return r04.A01;
        }
        if (this instanceof C2z8) {
            return ((C2z8) this).A2W();
        }
        if (this instanceof C2z9) {
            C2z9 c2z9 = (C2z9) this;
            A05(c2z9.A02, c2z9.A03, 6);
            c2z9.A0J();
            return c2z9.A01;
        }
        if (this instanceof C36k) {
            C36k c36k = (C36k) this;
            A01(c36k.A02, c36k.A03);
            c36k.A0J();
            return c36k.A01;
        }
        if (this instanceof C2zv) {
            C2zv c2zv = (C2zv) this;
            A05(c2zv.A02, c2zv.A03, 7);
            c2zv.A0J();
            return c2zv.A01;
        }
        if (this instanceof C31j) {
            C31j c31j = (C31j) this;
            A04(c31j.A02, c31j.A03);
            c31j.A0J();
            return c31j.A01;
        }
        if (this instanceof C36j) {
            C36j c36j = (C36j) this;
            A01(c36j.A02, c36j.A03);
            c36j.A0J();
            return c36j.A01;
        }
        if (this instanceof C36i) {
            C36i c36i = (C36i) this;
            A01(c36i.A02, c36i.A03);
            c36i.A0J();
            return c36i.A01;
        }
        if (this instanceof C2zh) {
            C2zh c2zh = (C2zh) this;
            A05(c2zh.A02, c2zh.A03, 11);
            c2zh.A0J();
            return c2zh.A01;
        }
        if (this instanceof C36h) {
            C36h c36h = (C36h) this;
            A05(c36h.A02, c36h.A03, 13);
            c36h.A0J();
            return c36h.A01;
        }
        if (this instanceof C30b) {
            C30b c30b = (C30b) this;
            A05(c30b.A02, c30b.A03, 10);
            c30b.A0J();
            return c30b.A01;
        }
        if (this instanceof C36g) {
            C36g c36g = (C36g) this;
            A01(c36g.A02, c36g.A03);
            c36g.A0J();
            return c36g.A01;
        }
        if (this instanceof C36f) {
            C36f c36f = (C36f) this;
            A00(c36f.A02, c36f.A03);
            c36f.A0J();
            return c36f.A01;
        }
        if (this instanceof C36e) {
            C36e c36e = (C36e) this;
            A01(c36e.A02, c36e.A03);
            c36e.A0J();
            return c36e.A01;
        }
        if (this instanceof C36d) {
            C36d c36d = (C36d) this;
            A05(c36d.A02, c36d.A03, 8);
            c36d.A0J();
            return c36d.A01;
        }
        if (this instanceof C36c) {
            C36c c36c = (C36c) this;
            A04(c36c.A02, c36c.A03);
            c36c.A0J();
            return c36c.A01;
        }
        if (this instanceof C36b) {
            C36b c36b = (C36b) this;
            A04(c36b.A02, c36b.A03);
            c36b.A0J();
            return c36b.A01;
        }
        if (this instanceof C31n) {
            C31n c31n = (C31n) this;
            A04(c31n.A02, c31n.A03);
            c31n.A0J();
            return c31n.A01;
        }
        if (this instanceof C31g) {
            C31g c31g = (C31g) this;
            A04(c31g.A02, c31g.A03);
            c31g.A0J();
            return c31g.A01;
        }
        if (this instanceof C31k) {
            C31k c31k = (C31k) this;
            A05(c31k.A02, c31k.A03, 7);
            c31k.A0J();
            return c31k.A01;
        }
        if (this instanceof 2zC) {
            return ((2zC) this).A2W();
        }
        if (this instanceof C2yv) {
            return ((C2yv) this).A2W();
        }
        C2yr c2yr = (C2yr) this;
        A01(c2yr.A02, c2yr.A03);
        c2yr.A0J();
        return c2yr.A01;
    }
}
