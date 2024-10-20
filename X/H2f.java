package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbui.widget.glyph.GlyphView;

/* loaded from: H2f.class */
public final class H2f extends H3O {
    public ImageView A00;
    public TextView A01;
    public GlyphView A02;
    public boolean A03;
    public GPl A04;
    public final Fragment A05;
    public final 1Br A06;
    public final 7Tm A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2f(Context context, Fragment fragment, 7Tm r304) {
        super(context, (AttributeSet) null, 0);
        7zR.A1N(context, r304);
        this.A05 = fragment;
        this.A07 = r304;
        this.A06 = 1BK.A0C();
    }

    public String A0H() {
        return "VideoSeekBarAndControlsPlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0M() {
        super.A0M();
        A0i(this.A04);
        this.A04 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0P() {
        super/*X.6d6*/.A0P();
        A0i(this.A04);
        this.A04 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r0.A1d != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r1 = r302
            r2 = r303
            super.A0e(r1, r2)
            r0 = r301
            r0.A0n()
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            r305 = r0
            r0 = r301
            boolean r0 = r0.A03
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r306
            if (r0 == 0) goto L39
            r0 = r305
            if (r0 == 0) goto L39
            r0 = r305
            boolean r0 = r0.A1d
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L3f
        L39:
            r0 = 0
            r308 = r0
            r0 = 0
            r305 = r0
        L3f:
            r0 = r301
            android.widget.ImageView r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L51
            java.lang.String r0 = "videoSaveButton"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L51:
            r0 = r308
            if (r0 != 0) goto L5a
            r0 = 8
            r307 = r0
        L5a:
            r0 = r304
            r1 = r307
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H2f.A0e(X.6TI, boolean):void");
    }

    public void A0m() {
        String str;
        super.A0m();
        GlyphView glyphView = this.A02;
        if (glyphView == null) {
            str = "videoStateButton";
        } else {
            glyphView.setOnClickListener(new RjY(this));
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setOnClickListener(new RjZ(this));
                return;
            }
            str = "videoSaveButton";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0n() {
        super.A0n();
        6TJ A00 = GPl.A00(this, ActionId.HEADER_DATA_LOADED);
        this.A04 = A00;
        A0h(A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0o() {
        LinearLayout.LayoutParams layoutParams;
        super.A0o();
        this.A01 = AbG.A09(this, 2131368357);
        this.A02 = (GlyphView) C09s.A01(this, 2131368361);
        this.A00 = (ImageView) C09s.A01(this, 2131368360);
        1Bn.A0A(147493);
        Context A08 = 4YU.A08(this);
        Drawable A0C = GOo.A0C(C1u3.A2S, 4YV.A0I(), 7zR.A0c(A08));
        ImageView imageView = this.A00;
        if (imageView == null) {
            11T.A0L("videoSaveButton");
            throw 0Q8.createAndThrow();
        }
        imageView.setImageDrawable(A0C);
        this.A03 = true;
        1Bn.A0A(147492);
        if (2yD.A03(1BL.A0Q(), 36316439570557004L)) {
            layoutParams = DKE.A0M();
            layoutParams.gravity = 17;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) ((5.0f * 7zO.A0I(A08).density) + 0.5f);
        } else {
            layoutParams = null;
        }
        View A01 = C09s.A01(this, 2131367249);
        if (layoutParams != null) {
            A01.setLayoutParams(layoutParams);
        }
    }
}
