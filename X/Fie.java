package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import com.facebook.mobileconfig.factory.module.AdminIdMC;

/* loaded from: Fie.class */
public final class Fie implements 1Iq, 1Is {
    public AnimatorSet A00;
    public F6I A01;
    public 1Im A03;
    public 1Im A04;
    public final ETj A05;
    public final FFO A06;
    public final 1Iw A08;
    public final C00i A07 = 1Bi.A02(1CO.class, AdminIdMC.class);
    public EnM A02 = null;

    public Fie(ETj eTj, FFO ffo, 1Iw r304, 1Im r305) {
        this.A08 = r304;
        this.A05 = eTj;
        this.A06 = ffo;
        this.A04 = r305;
    }

    public Object ANs(1Im r302, Object obj) {
        float f;
        if (!(obj instanceof 3xE)) {
            if (!(obj instanceof 2lC)) {
                return null;
            }
            AnimatorSet animatorSet = this.A00;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.A00.cancel();
            }
            this.A00 = null;
            return null;
        }
        3xE r0 = (3xE) obj;
        MotionEvent motionEvent = r0.A00;
        View view = r0.A01;
        if (this.A00 == null) {
            this.A00 = new AnimatorSet();
        }
        ETj eTj = this.A05;
        2yD A0N = 1BK.A0N(this.A07);
        int action = motionEvent.getAction();
        if (action == 0) {
            if (eTj != null && A0N.AZk(72340739757117544L)) {
                EnM enM = new EnM(view, eTj);
                this.A02 = enM;
                int A00 = 2yD.A00(enM.A03, 72622214733693456L);
                ValueAnimator valueAnimator = enM.A00;
                if (A00 < 0) {
                    A00 = 0;
                } else if (A00 > 5000) {
                    A00 = 5000;
                }
                valueAnimator.setStartDelay(A00);
                0K6.A00(valueAnimator);
            }
            if (this.A00.isRunning()) {
                this.A00.cancel();
            }
            if (eTj != null) {
                C5be A01 = eTj.A01();
                if (eTj.A02) {
                    view.setForeground(A01);
                }
                if (A01 != null) {
                    A01.setAlpha(eTj.A00(view));
                }
            }
            FFO ffo = this.A06;
            if (ffo != null) {
                F6I f6i = this.A01;
                if (f6i == null) {
                    f6i = new F6I(this.A08);
                    this.A01 = f6i;
                }
                if (((C4s1) 1Br.A0B(f6i.A02)) == null || 1 - ffo.A09.intValue() == 0) {
                    f = 1.0f;
                } else {
                    double A02 = DKC.A02(view) / r0.A04();
                    if (A02 < 0.2d) {
                        f = 0.95f;
                    } else {
                        f = 0.99f;
                        if (A02 <= 0.4d) {
                            f = 0.97f;
                        }
                    }
                }
                view.setScaleX(f);
                view.setScaleY(f);
                if (2 - ffo.A09.intValue() == 0) {
                    1Iw r02 = this.A08;
                    view.setElevation(C0A8.A00(r02.A0D, DKE.A0U(r02).A03(FFO.A0A).A00 / 2.0f));
                }
            }
        } else if (action == 1 || action == 3) {
            if (this.A02 != null && A0N.AZk(72340739757117544L)) {
                this.A02.A00.cancel();
                this.A02 = null;
            }
            if (this.A00.getChildAnimations().isEmpty()) {
                long j = 100;
                if (eTj != null && eTj.A01() != null) {
                    ValueAnimator duration = ValueAnimator.ofInt(A0N.AZk(72340739757117544L) ? 2yD.A00(A0N, 72622214733758993L) : eTj.A00(view), 0).setDuration(j);
                    duration.setInterpolator(Eb5.A00);
                    duration.addUpdateListener(new FJV(eTj, this, 3));
                    duration.addListener(new DMH(eTj, this, 0));
                    this.A00.play(duration);
                }
                FFO ffo2 = this.A06;
                if (ffo2 != null) {
                    1Iw r03 = this.A08;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "scaleX", ffo2.A01(r03)).setDuration(j);
                    duration2.addListener(new DMH(view, this, 1));
                    Interpolator interpolator = Eb5.A02;
                    duration2.setInterpolator(interpolator);
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, "scaleY", ffo2.A01(r03)).setDuration(j);
                    duration3.addListener(new DMH(view, this, 2));
                    duration3.setInterpolator(interpolator);
                    this.A00.play(duration2).with(duration3);
                    if (2 - ffo2.A09.intValue() == 0) {
                        int A002 = C0A8.A00(r03.A0D, DKE.A0U(r03).A03(FFO.A0A).A00);
                        ObjectAnimator duration4 = ObjectAnimator.ofFloat(view, "elevation", A002).setDuration(j);
                        duration4.addListener(new DMG(view, this, A002));
                        duration4.setInterpolator(Eb5.A01);
                        this.A00.play(duration4);
                    }
                }
            }
            0K6.A00(this.A00);
        }
        1Im r04 = this.A04;
        if (r04 == null) {
            return false;
        }
        return r04.A00(r0);
    }

    public 1Iq Akd() {
        return this;
    }
}
