package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.facebook.fbui.widget.text.ImageWithTextView;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.media.picker.MediaPickerTitleView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Hpn.class */
public final class Hpn {
    public ValueAnimator A00;
    public boolean A01;
    public final C1u2 A02;
    public final MediaPickerEnvironment A03;
    public final MediaPickerTitleView A04;
    public final MigColorScheme A05;

    /* JADX WARN: Multi-variable type inference failed */
    public Hpn(C1u2 c1u2, MediaPickerEnvironment mediaPickerEnvironment, MediaPickerTitleView mediaPickerTitleView, MigColorScheme migColorScheme) {
        this.A04 = mediaPickerTitleView;
        this.A03 = mediaPickerEnvironment;
        this.A02 = c1u2;
        this.A05 = migColorScheme;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mediaPickerTitleView.getLayoutParams();
        if (layoutParams != null) {
            MediaPickerEnvironment mediaPickerEnvironment2 = this.A03;
            if (mediaPickerEnvironment2.A0F) {
                MigColorScheme migColorScheme2 = this.A05;
                AbH.A1M(mediaPickerTitleView, migColorScheme2);
                mediaPickerTitleView.A07(migColorScheme2.B4i());
            }
            if (mediaPickerEnvironment2.A0D) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) mediaPickerTitleView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                if (mediaPickerEnvironment2.A0B) {
                    int i = (int) (min * 0.3f);
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
                    layoutParams.setMarginStart(i);
                } else {
                    int i2 = (int) (min * 0.05f);
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i2;
                    layoutParams.setMarginEnd(i2);
                    layoutParams.gravity = 8388613;
                }
                MigColorScheme migColorScheme3 = this.A05;
                MigColorScheme.A00(mediaPickerTitleView, migColorScheme3);
                AbH.A1M(mediaPickerTitleView, migColorScheme3);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 8;
                mediaPickerTitleView.setText("");
                ImageWithTextView.A03(this.A02.A08(C1u3.A4u, migColorScheme3.B4i()), mediaPickerTitleView);
                mediaPickerTitleView.requestLayout();
                mediaPickerTitleView.invalidate();
            } else if (mediaPickerEnvironment2.A06 || mediaPickerEnvironment2.A0I) {
                Context context = mediaPickerTitleView.getContext();
                int A00 = C0A8.A00(context, 16.0f);
                int A002 = C0A8.A00(context, 10.0f);
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = A00;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = A00;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = A002;
                layoutParams.gravity = 8388611;
                ((ViewGroup.LayoutParams) layoutParams).height = -2;
                mediaPickerTitleView.setTextAppearance(context, 2132607651);
                mediaPickerTitleView.setPaddingRelative(0, 0, 0, 0);
                mediaPickerTitleView.setClickable(false);
                mediaPickerTitleView.A06(false);
                mediaPickerTitleView.setText("");
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = mediaPickerTitleView.getCompoundPaddingRight() / 2;
            }
            mediaPickerTitleView.setLayoutParams(layoutParams);
            Drawable drawable = ((ImageWithTextView) mediaPickerTitleView).A05;
            if (this.A00 == null && drawable != null) {
                int[] A1b = GOn.A1b();
                A1b[0] = 0;
                A1b[1] = 10000;
                ValueAnimator duration = ValueAnimator.ofInt(A1b).setDuration(100);
                this.A00 = duration;
                duration.setInterpolator(new DecelerateInterpolator());
                this.A00.addUpdateListener(new IFz(drawable, this));
            }
            C2rp.A02(mediaPickerTitleView, 0S2.A0N);
        }
    }

    public void A00(boolean z) {
        ValueAnimator valueAnimator;
        if (z == this.A01 || (valueAnimator = this.A00) == null) {
            return;
        }
        this.A01 = z;
        this.A04.setSelected(z);
        if (z) {
            0K6.A00(valueAnimator);
        } else {
            valueAnimator.reverse();
        }
    }
}
