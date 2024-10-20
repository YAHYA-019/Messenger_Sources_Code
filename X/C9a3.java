package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.9a3, reason: invalid class name */
/* loaded from: 9a3.class */
public final class C9a3 {
    public ViewGroup A00;
    public C96k A01;
    public C2a2 A02;
    public boolean A03;
    public boolean A04;
    public final long A05;
    public final C9lx A06;
    public final A3W A07;
    public final 2aI A08;

    public C9a3(A3W a3w, long j) {
        this.A07 = a3w;
        this.A05 = j;
        this.A06 = new C9lx(a3w);
        C2a0 c2a0 = new C2a0(null);
        2Zs r0 = 2aN.A00;
        this.A08 = 2aG.A02(c2a0.plus(4ZJ.A00));
        this.A01 = C96k.A08;
    }

    public final void A00(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        11T.A0F(viewGroup, 0);
        if (11T.A0O(this.A00, viewGroup)) {
            this.A00 = null;
            A3W a3w = this.A07;
            0fH.A0j("MessengerAIBotVideoPlayerV2", AnonymousClass001.A0Z(viewGroup, "detachPlayerView() - viewGroup: ", AnonymousClass001.A0k()));
            C9n3 c9n3 = a3w.A01;
            if (c9n3 != null) {
                0fH.A0j("CompositeHeroPlayer", 1BJ.A00(1232));
                FrameLayout frameLayout = c9n3.A09;
                ViewParent parent = frameLayout.getParent();
                if (!(parent instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent) == null) {
                    return;
                }
                viewGroup2.removeView(frameLayout);
            }
        }
    }
}
