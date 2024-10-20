package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.Gnf, reason: case insensitive filesystem */
/* loaded from: Gnf.class */
public final class C2762Gnf extends IFM {
    public Context A00;
    public ImageView A01;
    public final Hrw A02;

    public C2762Gnf(ViewGroup viewGroup, Hrw hrw) {
        super(viewGroup, (AbR) null, hrw, C6x1.A02, true);
        this.A00 = viewGroup.getContext();
        this.A02 = hrw;
    }

    private void A00(Drawable drawable) {
        if (drawable == null || ((IFM) this).A06.A02.Afb() != C6x4.A07) {
            return;
        }
        drawable.setColorFilter(this.A00.getResources().getColor(2132213969), PorterDuff.Mode.SRC_ATOP);
    }

    public void A0H() {
        super.A0H();
        IWN iwn = ((IFM) this).A06.A02;
        C6x4 Afb = iwn.Afb();
        if (Afb == null || ((Afb.drawableResId == -1 && Afb.recordDrawableResId == -1) || this.A01 == null)) {
            ImageView imageView = this.A01;
            imageView.getClass();
            imageView.setVisibility(8);
            return;
        }
        Context context = this.A00;
        11T.A0F(context, 0);
        int i = Afb.drawableResId;
        if (i != -1 && Afb.drawable == null) {
            Afb.drawable = context.getDrawable(i);
        }
        Drawable drawable = Afb.drawable;
        C6x4 Afb2 = iwn.Afb();
        int i2 = Afb2.recordDrawableResId;
        if (i2 != -1 && Afb2.recordDrawable == null) {
            Afb2.recordDrawable = context.getDrawable(i2);
        }
        Drawable drawable2 = Afb2.recordDrawable;
        A00(drawable);
        A00(drawable2);
        if (!iwn.BJH()) {
            ImageView imageView2 = this.A01;
            imageView2.getClass();
            imageView2.setImageDrawable(drawable);
        } else if (iwn.Afb() == C6x4.A0A) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, drawable2});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(0);
            ImageView imageView3 = this.A01;
            imageView3.getClass();
            imageView3.setImageDrawable(transitionDrawable);
        } else {
            ImageView imageView4 = this.A01;
            imageView4.getClass();
            imageView4.setImageDrawable(drawable2);
        }
        ImageView imageView5 = this.A01;
        imageView5.getClass();
        imageView5.setVisibility(0);
    }
}
