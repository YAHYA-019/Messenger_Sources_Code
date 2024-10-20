package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Gbg, reason: case insensitive filesystem */
/* loaded from: Gbg.class */
public final class C2379Gbg extends 1pK {
    public static final String __redex_internal_original_name = "AvatarEndCallUpsellFragment";
    public HVa A00;
    public final C01i A01 = C01g.A01(new DCx(this, 49));
    public final C01i A02 = C01g.A01(SH1.A00);

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int AZN;
        int A02 = 0FI.A02(-1891846197);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132541931, viewGroup, false);
        TextView textView = (TextView) 7zM.A0H(inflate, 2131362318);
        C01i c01i = this.A01;
        AbH.A1M(textView, (MigColorScheme) c01i.getValue());
        AbG.A1J((TextView) 7zM.A0H(inflate, 2131362317), (MigColorScheme) c01i.getValue());
        ImageView imageView = (ImageView) 7zM.A0H(inflate, 2131362316);
        1Br A00 = 1Lm.A00(requireContext(), 1BM.A01(this), 100044);
        imageView.setImageResource(2132411378);
        TextView textView2 = (TextView) 7zM.A0H(inflate, 2131362313);
        IKE.A01(textView2, this, 12);
        Drawable background = textView2.getBackground();
        if (background instanceof GradientDrawable) {
            boolean AZk = GOq.A0f(((IAT) 1Br.A0B(A00)).A01).AZk(36314296384495462L);
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            MigColorScheme migColorScheme = (MigColorScheme) c01i.getValue();
            if (AZk) {
                gradientDrawable.setColor(migColorScheme.B4d());
                AZN = ((MigColorScheme) c01i.getValue()).B4i();
            } else {
                gradientDrawable.setColor(migColorScheme.BKg());
                AZN = ((MigColorScheme) c01i.getValue()).AZN();
            }
            textView2.setTextColor(AZN);
            background.mutate();
        }
        ImageView imageView2 = (ImageView) 7zM.A0H(inflate, 2131362314);
        GOo.A1E(imageView2, C1u3.A1w, (C1u2) this.A02.getValue(), ((MigColorScheme) c01i.getValue()).AWT());
        IKE.A01(imageView2, this, 13);
        0FI.A08(130450982, A02);
        return inflate;
    }
}
