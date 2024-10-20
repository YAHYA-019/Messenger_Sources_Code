package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.xapp.messaging.reactions.reactors.model.Reactor;

/* renamed from: X.8lb, reason: invalid class name */
/* loaded from: 8lb.class */
public final class C8lb extends C1rj {
    public Animator.AnimatorListener A00;
    public 8Ls A01;
    public 6yN A02;
    public 6qZ A03;
    public boolean A04;

    public C8lb() {
        super("ReactionsAnimation");
    }

    public Integer A0m() {
        return 0S2.A01;
    }

    public Object A0n(Context context) {
        11T.A0F(context, 0);
        return new DN7(context);
    }

    public boolean A0p() {
        return true;
    }

    public boolean A0q() {
        return true;
    }

    public boolean A0r(1LI r302, 1LI r303, 2Yv r304, 2Yv r305) {
        Reactor reactor;
        Reactor reactor2;
        C8lb c8lb = (C8lb) r302;
        C8lb c8lb2 = (C8lb) r303;
        8Ls r306 = null;
        8Ls r307 = c8lb == null ? null : c8lb.A01;
        if (c8lb2 != null) {
            r306 = c8lb2.A01;
        }
        String str = null;
        String str2 = (r307 == null || (reactor2 = (Reactor) r307.A00) == null) ? null : reactor2.A00;
        if (r306 != null && (reactor = (Reactor) r306.A00) != null) {
            str = reactor.A00;
        }
        return 7zL.A1X(str2, str);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DN7 dn7 = (DN7) obj;
        Animator.AnimatorListener animatorListener = this.A00;
        8Ls r0 = this.A01;
        6qZ r02 = this.A03;
        6yN r03 = this.A02;
        boolean z = this.A04;
        11T.A0F(r302, 0);
        1BL.A11(1, dn7, r0, r02);
        11T.A0F(r03, 5);
        Context A0A = 7zL.A0A(r302);
        Integer num = 0S2.A00;
        int B67 = r03.B67(A0A, num, false);
        int B69 = r03.B69(A0A, num, z);
        dn7.A09.setColor(B67);
        dn7.A07.setColor(B67);
        dn7.A0A.setColor(B69);
        dn7.invalidateSelf();
        Drawable B5r = r02.B5r(A0A, r0.A01);
        dn7.A02 = B5r;
        if (B5r != null) {
            B5r.setAlpha(dn7.A01);
        }
        dn7.invalidateSelf();
        ValueAnimator valueAnimator = dn7.A06;
        if (valueAnimator.isStarted()) {
            return;
        }
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        0K6.A00(valueAnimator);
    }

    @Override // X.C1rj
    public void A1M(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DN7 dn7 = (DN7) obj;
        11T.A0F(dn7, 1);
        dn7.stop();
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8lb c8lb = (C8lb) r302;
            Animator.AnimatorListener animatorListener = this.A00;
            Animator.AnimatorListener animatorListener2 = c8lb.A00;
            if (animatorListener != null) {
                if (!animatorListener.equals(animatorListener2)) {
                    return false;
                }
            } else if (animatorListener2 != null) {
                return false;
            }
            6yN r0 = this.A02;
            6yN r02 = c8lb.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            6qZ r03 = this.A03;
            6qZ r04 = c8lb.A03;
            if (r03 != null) {
                if (!r03.equals(r04)) {
                    return false;
                }
            } else if (r04 != null) {
                return false;
            }
            if (this.A04 != c8lb.A04) {
                return false;
            }
            8Ls r05 = this.A01;
            8Ls r06 = c8lb.A01;
            if (r05 != null) {
                if (!r05.equals(r06)) {
                    return false;
                }
            } else if (r06 != null) {
                return false;
            }
        }
        return true;
    }
}
