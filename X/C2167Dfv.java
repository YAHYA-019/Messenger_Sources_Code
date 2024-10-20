package X;

import android.animation.AnimatorSet;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.animation.Interpolator;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.Dfv, reason: case insensitive filesystem */
/* loaded from: Dfv.class */
public final class C2167Dfv extends AbstractC2150Dfe {
    @Override // X.AbstractC2150Dfe, X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        1Im r0;
        StateListAnimator stateListAnimator;
        int A02;
        C1rs c1rs = ((AbstractC2150Dfe) this).A03;
        8CL r305 = null;
        if (c1rs == null) {
            return null;
        }
        c1rs.A2S(this.A06);
        c1rs.A2Q(true);
        String str = this.A07;
        if (str != null) {
            ((AbstractC2150Dfe) this).A03.A0F(str);
        }
        AbstractC2178Dg6.A0E(this);
        C1rs c1rs2 = ((AbstractC2150Dfe) this).A03;
        if (c1rs2 != null && (r0 = ((AbstractC2150Dfe) this).A04) != null) {
            c1rs2.A2T(r0);
            c1rs2.A1s(((AbstractC2150Dfe) this).A05);
            c1rs2.A1p(null);
            1Iw r02 = this.A0A;
            FFO ffo = ((AbstractC2150Dfe) this).A01;
            int[] iArr = F3y.A02;
            if (ffo == null) {
                stateListAnimator = null;
            } else {
                stateListAnimator = new StateListAnimator();
                AnimatorSet animatorSet = new AnimatorSet();
                EMZ emz = ffo.A07;
                float f = emz.value;
                Interpolator interpolator = F3y.A01;
                AnimatorSet.Builder with = animatorSet.play(F3y.A00(interpolator, "scaleX", f, 0L)).with(F3y.A00(interpolator, "scaleY", emz.value, 0L));
                AnimatorSet animatorSet2 = new AnimatorSet();
                long j = 100;
                AnimatorSet.Builder with2 = animatorSet2.play(F3y.A00(interpolator, "scaleX", 1.0f, j)).with(F3y.A00(interpolator, "scaleY", 1.0f, j));
                if (2 - ffo.A09.intValue() == 0) {
                    float A00 = C0A8.A00(r02.A0D, DKE.A0U(r02).A03(FFO.A0A).A00 / 2.0f);
                    Interpolator interpolator2 = F3y.A00;
                    with.with(F3y.A00(interpolator2, "elevation", A00, 0L));
                    with2.with(F3y.A00(interpolator2, "elevation", C0A8.A00(r0, DKE.A0U(r02).A03(r0).A00), j));
                }
                stateListAnimator.addState(F3y.A03, animatorSet);
                stateListAnimator.addState(F3y.A02, animatorSet2);
            }
            2cS A01 = C1ti.A01(c1rs2.A00.A0v());
            A01.A04 |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            A01.A05 = stateListAnimator;
            Context context = r02.A0D;
            DfL dfL = ((AbstractC2150Dfe) this).A00;
            StateListDrawable stateListDrawable = null;
            if (dfL != null) {
                C5be A002 = dfL.A00();
                stateListDrawable = new StateListDrawable();
                EMz eMz = dfL.A04;
                int i = dfL.A00;
                ENh eNh = dfL.A03;
                int ordinal = eMz.ordinal();
                if (ordinal != 5) {
                    if (ordinal == 4) {
                        A02 = 1tG.A05(FBB.A00(eNh.luminanceFactor, eNh.minLuminance, eNh.maxLuminance, i), 38);
                    }
                    A002.setAlpha(255);
                    stateListDrawable.addState(F3y.A03, A002);
                    stateListDrawable.setEnterFadeDuration(0);
                    stateListDrawable.setExitFadeDuration(100);
                } else {
                    A02 = 7zM.A02(context, 2MR.A1C);
                }
                if (A02 != 0) {
                    A002.setColor(A02);
                }
                A002.setAlpha(255);
                stateListDrawable.addState(F3y.A03, A002);
                stateListDrawable.setEnterFadeDuration(0);
                stateListDrawable.setExitFadeDuration(100);
            }
            c1rs2.A1e(stateListDrawable);
            FFO ffo2 = ((AbstractC2150Dfe) this).A01;
            if (ffo2 != null && 2 - ffo2.A09.intValue() == 0) {
                r305 = new 8CL(C0A8.A00(context, ffo2.A03), 0, ffo2);
            }
            c1rs2.A1g(r305);
            FFO ffo3 = ((AbstractC2150Dfe) this).A01;
            c1rs2.A0w((ffo3 == null || 2 - ffo3.A09.intValue() != 0) ? 0.0f : DKE.A0U(r02).A03(FFO.A0A).A00);
        }
        ((AbstractC2150Dfe) this).A03 = c1rs2;
        return c1rs2;
    }
}
