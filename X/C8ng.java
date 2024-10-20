package X;

import android.content.Context;
import android.view.View;
import com.facebook.litho.BaseMountingView;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;

/* renamed from: X.8ng, reason: invalid class name */
/* loaded from: 8ng.class */
public final class C8ng extends C1rj {
    public 1LI A00;
    public Hkb A01;

    public C8ng() {
        super("ShimmerComponent");
    }

    public static 8Td A00(1Iw r301) {
        return new 8Td(new C8ng(), r301);
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8ng c8ng = (C8ng) super.A0l();
        c8ng.A00 = 4YV.A0J(c8ng.A00);
        return c8ng;
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new 91S(context);
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        ((C8ob) 4YU.A0P(r302)).A00.A0U(c23p, i, i2);
    }

    @Override // X.C1rj
    public void A1I(1Iw r302, AnonymousClass274 anonymousClass274, C27G c27g) {
        ((C8ob) 4YU.A0P(r302)).A00.A0U(null, View.MeasureSpec.makeMeasureSpec(c27g.A05(), 1073741824), View.MeasureSpec.makeMeasureSpec(c27g.A00(), 1073741824));
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        C8ob c8ob = (C8ob) 4YU.A0P(r302);
        91S r0 = (91S) obj;
        Hkb hkb = this.A01;
        1LI r02 = this.A00;
        ComponentTree componentTree = c8ob.A00;
        LithoView lithoView = r0.A00;
        if (lithoView.A00 == null) {
            lithoView.A10(componentTree, true);
        } else {
            lithoView.A0x(r02);
        }
        r0.A03(hkb);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ((BaseMountingView) ((91S) obj).A00).A0I.A0E();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        C1s0 A01 = ComponentTree.A01(this.A00, 1Iw.A01(r302), null);
        A01.A01(r302.A03.A01.A0N);
        ((C8ob) r303).A00 = A01.A00();
    }

    @Override // X.C1rj
    public boolean A1S() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8ng c8ng = (C8ng) r302;
            1LI r0 = this.A00;
            1LI r02 = c8ng.A00;
            if (r0 != null) {
                if (!C4Cv.A05(r0, r02, z)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            Hkb hkb = this.A01;
            Hkb hkb2 = c8ng.A01;
            if (hkb != null) {
                if (!hkb.equals(hkb2)) {
                    return false;
                }
            } else if (hkb2 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1rj, X.C1rk
    public boolean ADe() {
        return true;
    }
}
