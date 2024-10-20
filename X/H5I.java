package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.widget.CustomFrameLayout;
import com.mapbox.mapboxsdk.R;

/* loaded from: H5I.class */
public final class H5I extends CustomFrameLayout implements JFq {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public GlyphView A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C01i A06;
    public final 1Br A07;

    public H5I(Context context) {
        super(context);
        this.A04 = 7zM.A0U();
        Context A08 = 4YU.A08(this);
        this.A05 = 1HG.A00(A08, 115350);
        this.A07 = 1Bu.A00(115704);
        this.A06 = J9s.A01(this, 26);
        LayoutInflater.from(A08).inflate(2132541744, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(A08.getResources().getDimensionPixelSize(2132279342), A08.getResources().getDimensionPixelSize(R.dimen.mapbox_minimum_scale_span_when_rotating));
        marginLayoutParams.setMarginEnd(A08.getResources().getDimensionPixelSize(2132279379));
        setLayoutParams(marginLayoutParams);
        ViewGroup viewGroup = (ViewGroup) DKG.A0B(this, 2131366310);
        11T.A0F(viewGroup, 0);
        this.A02 = viewGroup;
        View requireViewById = requireViewById(2131367275);
        11T.A0A(requireViewById);
        this.A01 = requireViewById;
        View requireViewById2 = requireViewById(2131365341);
        11T.A0A(requireViewById2);
        this.A00 = requireViewById2;
        GlyphView glyphView = (GlyphView) DKG.A0B(this, 2131367110);
        this.A03 = glyphView;
        if (glyphView == null) {
            11T.A0L("screenSharingIcon");
            throw 0Q8.createAndThrow();
        }
        glyphView.setImageDrawable(7zP.A0S(this.A04).A07(C1u3.A5f));
        setOnClickListener(new IKB(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JFq
    public /* bridge */ /* synthetic */ void CfQ(JDB jdb) {
        String str;
        RrK rrK = (RrK) jdb;
        11T.A0F(rrK, 0);
        View view = this.A01;
        if (view == null) {
            str = "selectedParticipantOverlay";
        } else {
            int i = 0;
            view.setVisibility(DKG.A00(rrK.A01 ? 1 : 0));
            GlyphView glyphView = this.A03;
            if (glyphView == null) {
                str = "screenSharingIcon";
            } else {
                glyphView.setVisibility(DKG.A00(rrK.A03 ? 1 : 0));
                View view2 = this.A00;
                if (view2 == null) {
                    str = "lockIcon";
                } else {
                    if (!rrK.A02) {
                        i = 8;
                    }
                    view2.setVisibility(i);
                    View view3 = (View) ((Hp0) 1Br.A0B(this.A05)).A00(4YU.A08(this), rrK.A00, 3);
                    ViewParent parent = view3.getParent();
                    ViewGroup viewGroup = this.A02;
                    if (viewGroup != null) {
                        if (parent != viewGroup) {
                            AbstractC2326GOr.A0z(view3);
                            viewGroup.removeAllViews();
                            viewGroup.addView(view3);
                            return;
                        }
                        return;
                    }
                    str = "participantViewHolder";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(950442375);
        super.onAttachedToWindow();
        ((GS2) 7zM.A1B(this.A06)).A0Y(this);
        0FI.A0C(-1665233354, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-1215645196);
        ((GS2) 7zM.A1B(this.A06)).A0X();
        super.onDetachedFromWindow();
        0FI.A0C(-1732890362, A06);
    }
}
