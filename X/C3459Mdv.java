package X;

import android.animation.Animator;

/* renamed from: X.Mdv, reason: case insensitive filesystem */
/* loaded from: Mdv.class */
public final class C3459Mdv extends FJK {
    public final /* synthetic */ 7Da A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C3459Mdv(7Da r302, boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = r302;
        this.A02 = z2;
    }

    public void onAnimationEnd(Animator animator) {
        boolean z = this.A02;
        7Da r0 = this.A00;
        if (!z) {
            r0.A08 = false;
            r0.A0V().A07 = r0.A08;
            NAd nAd = r0.A07;
            if (nAd != null) {
                nAd.Bx9();
                return;
            }
            return;
        }
        r0.A08 = true;
        r0.A0V().A07 = r0.A08;
        NAd nAd2 = r0.A07;
        if (nAd2 != null) {
            nAd2.Bph();
        }
        NAd nAd3 = r0.A07;
        if (nAd3 != null) {
            nAd3.CA3(r0.A00);
        }
    }

    public void onAnimationStart(Animator animator) {
        NAd nAd;
        if (!this.A01 || (nAd = this.A00.A07) == null) {
            return;
        }
        nAd.CDG(true);
    }
}
