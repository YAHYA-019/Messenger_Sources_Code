package X;

import android.animation.Animator;

/* renamed from: X.Mdu, reason: case insensitive filesystem */
/* loaded from: Mdu.class */
public final class C3458Mdu extends FJK {
    public final /* synthetic */ 7Da A00;
    public final /* synthetic */ C00m A01;

    public C3458Mdu(7Da r302, C00m c00m) {
        this.A00 = r302;
        this.A01 = c00m;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.invoke();
        NAd nAd = this.A00.A07;
        if (nAd != null) {
            nAd.BpX();
        }
    }

    public void onAnimationStart(Animator animator) {
        NAd nAd = this.A00.A07;
        if (nAd != null) {
            nAd.CDG(false);
        }
    }
}
