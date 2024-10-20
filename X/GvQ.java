package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.tiles.BlurThreadTileView;

/* loaded from: GvQ.class */
public final class GvQ extends FbFrameLayout implements JFq {
    public float A00;
    public Path A01;
    public RectF A02;
    public View A03;
    public FbTextView A04;
    public FbTextView A05;
    public BlurThreadTileView A06;
    public GrM A07;

    public static GrM A00(GvQ gvQ) {
        GrM grM = gvQ.A07;
        if (grM == null) {
            1Bn.A0A(147743);
            grM = new GrM(gvQ.getContext(), IDw.A01(gvQ, "ScreenSharingParticipantView"), I6F.A01(gvQ));
            gvQ.A07 = grM;
        }
        return grM;
    }

    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        IZj iZj = (IZj) jdb;
        BlurThreadTileView blurThreadTileView = this.A06;
        C2fr c2fr = iZj.A02;
        5YD r0 = blurThreadTileView.A06;
        r0.getClass();
        r0.A0A = c2fr;
        5YD.A03(r0);
        BlurThreadTileView blurThreadTileView2 = this.A06;
        boolean z = iZj.A04;
        if (blurThreadTileView2.A09 != z) {
            blurThreadTileView2.A09 = z;
            blurThreadTileView2.A02.setVisibility(DKG.A00(z ? 1 : 0));
        }
        boolean z2 = iZj.A05;
        boolean A1T = AnonymousClass001.A1T(getForeground());
        if (z2) {
            if (!A1T) {
                Resources resources = getResources();
                int A04 = DKC.A04(resources);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(A04, A04, A04, A04);
                requestLayout();
                setForeground(new JVS(7zN.A01(resources), -16777216));
            }
        } else if (A1T) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.getClass();
            setForeground(null);
            ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, 0, 0);
            requestLayout();
        }
        int i = 8;
        this.A03.setVisibility(DKG.A00(1));
        2OB r02 = this.A05;
        if (iZj.A08) {
            i = 0;
        }
        r02.setVisibility(i);
        if (getResources().getConfiguration().fontScale > 1.3f) {
            this.A05.setTextSize(2, 11.0f);
        }
        this.A04.setMaxLines(4);
        this.A04.setEllipsize(TextUtils.TruncateAt.END);
        this.A04.setTextSize(0, iZj.A01);
        this.A04.setText(iZj.A03);
        ViewGroup.LayoutParams layoutParams3 = (5Wh) this.A04.getLayoutParams();
        boolean z3 = iZj.A06;
        float f = 0.0f / 0.0f;
        if (z3) {
            ((5Wh) layoutParams3).A0F = -1;
            ((5Wh) layoutParams3).A0s = 2131366299;
            ((5Wh) layoutParams3).A0E = 2131366299;
        } else {
            ((5Wh) layoutParams3).A0E = -1;
            ((5Wh) layoutParams3).A0s = -1;
            ((5Wh) layoutParams3).A0F = 2131364422;
        }
        this.A04.setLayoutParams(layoutParams3);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (A00(this).A00 == 3) {
            canvas.clipPath(this.A01);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1349090571);
        super.onAttachedToWindow();
        A00(this).A0Y(this);
        0FI.A0C(-769885734, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-386584758);
        A00(this).A0X();
        super.onDetachedFromWindow();
        0FI.A0C(1316929564, A06);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1974079440);
        super.onSizeChanged(i, i2, i3, i4);
        this.A01.reset();
        this.A02.set(0.0f, 0.0f, i, i2);
        Path path = this.A01;
        RectF rectF = this.A02;
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.A01.close();
        0FI.A0C(-1700545349, A06);
    }
}
