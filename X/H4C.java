package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.video.player.RichVideoPlayer;

/* loaded from: H4C.class */
public final class H4C extends 6cN implements 7TS {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public View.OnClickListener A05;
    public GQU A06;
    public final ColorDrawable A07;
    public final ImageView A08;
    public final 1Br A09;
    public final C66i A0A;
    public final RichVideoPlayer A0B;
    public final H08 A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H4C(Context context, RichVideoPlayer richVideoPlayer) {
        super(context);
        11T.A0F(context, 1);
        this.A0B = richVideoPlayer;
        this.A09 = 1Bu.A00(49939);
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        setId(7TS.A00);
        A0U(2132542053);
        this.A08 = (ImageView) 7zM.A0H(this, 2131368356);
        ColorDrawable colorDrawable = new ColorDrawable(7zM.A02(context, 2MR.A0E));
        this.A07 = colorDrawable;
        colorDrawable.setAlpha(0);
        setBackground(colorDrawable);
        H08 h08 = new H08(this);
        this.A0C = h08;
        C66i A0W = AbstractC2326GOr.A0W(this.A09);
        A0W.A09(C66h.A03(300.2d, 35.0d));
        A0W.A0A(h08);
        this.A0A = A0W;
    }

    public static final void A00(H4C h4c) {
        ImageView imageView = h4c.A08;
        imageView.setOnClickListener(null);
        imageView.setVisibility(4);
        h4c.A00 = -1.0f;
        h4c.A01 = -1.0f;
        GQU gqu = h4c.A06;
        if (gqu != null) {
            GQT gqt = gqu.A00;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            6cT r0 = gqt.A03;
            gqt.A0V(r0, layoutParams);
            6cN r02 = gqt.A00;
            if (r02 == null) {
                throw 1BK.A0h();
            }
            ViewParent parent = r02.getParent();
            r0.setX(0.0f);
            r0.setY(0.0f);
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(gqt.A00);
            }
            gqt.A00 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        View.OnClickListener onClickListener = this.A05;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }
}
