package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: X.7W5, reason: invalid class name */
/* loaded from: 7W5.class */
public final class C7W5 implements C6w3, C6s9 {
    public int A00;
    public Integer A01;
    public Integer A02;
    public WeakReference A03;
    public WeakReference A04;
    public WeakReference A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Integer A0C;
    public boolean A0D;
    public final ViewTreeObserver.OnGlobalLayoutListener A0E;

    public C7W5() {
        Integer num = 0S2.A01;
        this.A02 = num;
        this.A01 = num;
        this.A0C = num;
        this.A0E = new 3UR(this, 0);
    }

    private final void A00(int i) {
        View view;
        WeakReference weakReference = this.A05;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        11T.A0I(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = i;
        this.A09 = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r301.A0C == r0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A01() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L25
            r0 = r301
            java.lang.Integer r0 = r0.A01
            r303 = r0
            java.lang.Integer r0 = X.0S2.A00
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L25
            r0 = r301
            java.lang.Integer r0 = r0.A0C
            r305 = r0
            r0 = 1
            r302 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L29
        L25:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L29:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W5.A01():boolean");
    }

    public final void A02() {
        A00(0);
        Integer num = 0S2.A01;
        this.A02 = num;
        this.A01 = num;
        this.A0C = num;
        this.A08 = false;
        this.A07 = false;
        this.A0D = false;
        this.A06 = false;
        this.A00 = 0;
        this.A09 = 0;
        this.A0B = 0;
        this.A0A = 0;
    }

    @Override // X.C6w3
    public void BvB(int i) {
        this.A0A = i;
        if (this.A08) {
            A00(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        if (r305 > java.lang.Math.max(0, r301.A09)) goto L9;
     */
    @Override // X.C6w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Byl(boolean r302, int r303) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L5d
            java.lang.Integer r0 = X.0S2.A00
            r304 = r0
        L8:
            r0 = r301
            r1 = r304
            r0.A0C = r1
            r0 = r301
            int r0 = r0.A09
            r1 = r303
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            r305 = r0
            java.lang.String r0 = "BelowComposerSpaceCoordinator"
            r306 = r0
            java.lang.String r0 = "onFinishComposerChanged belowComposerHeight: "
            r1 = r305
            java.lang.String r0 = X.0Pz.A0T(r0, r1)
            r304 = r0
            r0 = r306
            r1 = r304
            X.0fH.A0j(r0, r1)
            r0 = r301
            boolean r0 = r0.A07
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L51
            r0 = r301
            int r0 = r0.A0B
            r305 = r0
            r0 = r301
            int r0 = r0.A09
            r307 = r0
            r0 = 0
            r1 = r307
            int r0 = java.lang.Math.max(r0, r1)
            r307 = r0
            r0 = r305
            r1 = r307
            if (r0 <= r1) goto L57
        L51:
            r0 = r301
            r1 = r305
            r0.A00(r1)
        L57:
            r0 = r301
            r1 = 0
            r0.A07 = r1
            return
        L5d:
            java.lang.Integer r0 = X.0S2.A01
            r304 = r0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7W5.Byl(boolean, int):void");
    }

    @Override // X.C6w3
    public void Bym(boolean z, int i) {
        this.A01 = z ? 0S2.A00 : 0S2.A01;
        0fH.A0j("BelowComposerSpaceCoordinator", 0Pz.A1C("onFinishDrawerChanged shouldListenToDrawerHeight ", this.A08));
        if (this.A08) {
            A00(i);
        }
        int i2 = this.A0A;
        if (i2 > Math.max(0, this.A09)) {
            A00(i2);
        }
        this.A08 = false;
    }

    @Override // X.C6s9
    public void C3A(int i) {
        this.A0B = i;
        if (A01()) {
            A00(i);
        }
    }

    @Override // X.C6s9
    public void C3H(boolean z, int i) {
        int i2;
        this.A02 = z ? 0S2.A00 : 0S2.A01;
        0fH.A0j("BelowComposerSpaceCoordinator", 0Pz.A1C("onKeyboardVisibilityChanged shouldListenToKeyboardHeight ", A01()));
        if (A01()) {
            if (!z) {
                i = 0;
            }
            A00(i);
        }
        if (z && (i2 = this.A0B) > Math.max(0, this.A09)) {
            A00(i2);
        }
        this.A0D = false;
    }

    @Override // X.C6w3
    public void CDH(boolean z) {
        this.A0C = z ? 0S2.A0C : 0S2.A0N;
        Integer num = this.A01;
        Integer num2 = 0S2.A00;
        boolean z2 = true;
        boolean A1W = AnonymousClass001.A1W(num, num2);
        boolean A1W2 = AnonymousClass001.A1W(this.A02, num2);
        if (!z || A1W || A1W2) {
            z2 = false;
        }
        this.A07 = z2;
        if (z2) {
            this.A08 = false;
        }
    }

    @Override // X.C6w3
    public void CDK(boolean z) {
        this.A01 = z ? 0S2.A0C : 0S2.A0N;
        Integer num = this.A0C;
        Integer num2 = 0S2.A00;
        boolean z2 = true;
        boolean A1W = AnonymousClass001.A1W(num, num2);
        Integer num3 = this.A02;
        boolean A1W2 = AnonymousClass001.A1W(num3, num2);
        if ((!z || A1W || A1W2) && num3 != 0S2.A01) {
            z2 = false;
        }
        this.A08 = z2;
        if (z2) {
            this.A07 = false;
        }
    }

    @Override // X.C6s9
    public void CDO(boolean z) {
        if (this.A0D) {
            return;
        }
        this.A02 = z ? 0S2.A0C : 0S2.A0N;
        this.A06 = false;
        if (A01()) {
            this.A08 = false;
            this.A07 = false;
        }
    }

    @Override // X.C6w3
    public void CDP(boolean z, boolean z2) {
        this.A02 = z ? 0S2.A0C : 0S2.A0N;
        this.A06 = z2;
        if (A01()) {
            this.A08 = false;
            this.A07 = false;
        }
        this.A0D = true;
    }
}
