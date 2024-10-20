package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* loaded from: Dzi.class */
public final class Dzi extends C1rj {
    public int A00;

    public Dzi() {
        super("TypingDotsComponent");
    }

    public static final ObjectAnimator A00(View view, float[] fArr) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setPropertyName("translationY");
        objectAnimator.setFloatValues(Arrays.copyOf(fArr, fArr.length));
        objectAnimator.setRepeatCount(-1);
        return objectAnimator;
    }

    public static 8Sy A01(1Iw r301) {
        return new 8Sy(r301, new Dzi());
    }

    public static final void A0L(View view, int i) {
        Drawable background = view.getBackground();
        if (background instanceof ShapeDrawable) {
            ((ShapeDrawable) background).getPaint().setColor(i);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        }
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object A0n(Context context) {
        float f;
        11T.A0F(context, 0);
        0fH.A0n("TypingDotsComponentSpec", "onCreateMountContent is called");
        LinearLayout linearLayout = new LinearLayout(context, null);
        Context A08 = 4YU.A08(linearLayout);
        ((DQL) linearLayout).A01 = (Ejk) 1Bn.A0E(A08, (1BY) null, 99987);
        LayoutInflater.from(A08).inflate(2132543458, linearLayout);
        linearLayout.setGravity(17);
        View findViewById = linearLayout.findViewById(2131367871);
        if (findViewById == null) {
            throw 4YV.A0h("findViewById:", 2131367871);
        }
        View findViewById2 = linearLayout.findViewById(2131367872);
        if (findViewById2 == null) {
            throw 4YV.A0h("findViewById:", 2131367872);
        }
        View findViewById3 = linearLayout.findViewById(2131367873);
        if (findViewById3 == null) {
            throw 4YV.A0h("findViewById:", 2131367873);
        }
        Ejk ejk = ((DQL) linearLayout).A01;
        if (ejk == null) {
            throw 1BK.A0h();
        }
        int A00 = C0A8.A00(ejk.A00, 6.0f);
        float[] fArr = EbB.A00;
        float[] fArr2 = new float[98];
        int i = 0;
        do {
            float f2 = fArr[i];
            f = A00;
            fArr2[i] = f2 * f;
            i++;
        } while (i < 98);
        float[] fArr3 = EbB.A01;
        float[] fArr4 = new float[98];
        int i2 = 0;
        do {
            fArr4[i2] = fArr3[i2] * f;
            i2++;
        } while (i2 < 98);
        float[] fArr5 = EbB.A02;
        float[] fArr6 = new float[98];
        int i3 = 0;
        do {
            fArr6[i3] = fArr5[i3] * f;
            i3++;
        } while (i3 < 98);
        float[] fArr7 = {fArr2, fArr4, fArr6};
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1633L);
        animatorSet.addListener(new FJM(animatorSet, 5));
        animatorSet.playTogether(A00(findViewById, fArr7[0]), A00(findViewById2, fArr7[1]), A00(findViewById3, fArr7[2]));
        ((DQL) linearLayout).A00 = animatorSet;
        0fH.A0n("TypingDotsView", 0Pz.A1C("mAnimators is created ? ", true));
        return linearLayout;
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3om, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ InterfaceC00783om A11() {
        return new Object();
    }

    @Override // X.C1rj
    public void A1F(1Iw r302) {
        ((Fiq) r302.A06().A05).A00 = Integer.valueOf(this.A00);
    }

    @Override // X.C1rj
    public void A1H(1Iw r302, AnonymousClass274 anonymousClass274, C23P c23p, C27G c27g, int i, int i2) {
        1BK.A1K(r302, 0, c23p);
        Context A0A = 7zL.A0A(r302);
        int A00 = C0A8.A00(A0A, 2.0f);
        int A002 = C0A8.A00(A0A, 6.0f) * 4;
        c23p.A01 = (A00 * 2) + A002;
        c23p.A00 = A002;
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        DQL dql = (DQL) obj;
        int intValue = ((Fiq) r302.A06().A05).A00.intValue();
        11T.A0F(dql, 1);
        View findViewById = dql.findViewById(2131367871);
        if (findViewById == null) {
            throw 4YV.A0h("findViewById:", 2131367871);
        }
        View findViewById2 = dql.findViewById(2131367872);
        if (findViewById2 == null) {
            throw 4YV.A0h("findViewById:", 2131367872);
        }
        View findViewById3 = dql.findViewById(2131367873);
        if (findViewById3 == null) {
            throw 4YV.A0h("findViewById:", 2131367873);
        }
        A0L(findViewById, intValue);
        A0L(findViewById2, intValue);
        A0L(findViewById3, intValue);
    }

    @Override // X.C1rj
    public void A1P(InterfaceC00783om interfaceC00783om, InterfaceC00783om interfaceC00783om2) {
        ((Fiq) interfaceC00783om).A00 = ((Fiq) interfaceC00783om2).A00;
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        return this == r302 || (r302 != null && getClass() == r302.getClass() && this.A00 == ((Dzi) r302).A00);
    }
}
