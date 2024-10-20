package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.bondishareablecomponent.BondiFiveStarRatingDisplay;
import com.facebook.browser.lite.extensions.moreinfo.MoreInfoContactRow;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.FbImageView;

/* loaded from: JZG.class */
public final class JZG extends LinearLayout {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public BondiFiveStarRatingDisplay A05;
    public MoreInfoContactRow A06;
    public MoreInfoContactRow A07;
    public MoreInfoContactRow A08;
    public MoreInfoContactRow A09;
    public MoreInfoContactRow A0A;
    public MoreInfoContactRow A0B;
    public MoreInfoContactRow A0C;
    public MoreInfoContactRow A0D;
    public GlyphButton A0E;
    public FbTextView A0F;
    public FbTextView A0G;
    public FbTextView A0H;
    public FbTextView A0I;
    public FbTextView A0J;
    public FbTextView A0K;
    public FbTextView A0L;
    public FbTextView A0M;
    public FbImageView A0N;
    public View[] A0O;
    public final String A0P;

    public JZG(Context context) {
        super(context);
        this.A0O = new View[0];
        this.A0P = "MoreInfoView";
        Context context2 = getContext();
        View.inflate(context2, 2132542630, this);
        this.A0D = requireViewById(2131363319);
        this.A08 = requireViewById(2131363318);
        this.A06 = requireViewById(2131363315);
        this.A07 = requireViewById(2131363317);
        MoreInfoContactRow requireViewById = requireViewById(2131366067);
        this.A09 = requireViewById;
        if (requireViewById != null) {
            requireViewById.A01("");
        }
        MoreInfoContactRow requireViewById2 = requireViewById(2131366068);
        this.A0A = requireViewById2;
        if (requireViewById2 != null) {
            requireViewById2.A01("");
        }
        MoreInfoContactRow requireViewById3 = requireViewById(2131366069);
        this.A0B = requireViewById3;
        if (requireViewById3 != null) {
            requireViewById3.A01("");
        }
        MoreInfoContactRow requireViewById4 = requireViewById(2131366070);
        this.A0C = requireViewById4;
        if (requireViewById4 != null) {
            requireViewById4.A01("");
        }
        this.A05 = requireViewById(2131362535);
        this.A0M = JQz.A0T(this, 2131362529);
        this.A0K = JQz.A0T(this, 2131362523);
        this.A0G = JQz.A0T(this, 2131362526);
        this.A0E = (GlyphButton) requireViewById(2131362527);
        this.A0L = JQz.A0T(this, 2131362522);
        this.A0H = JQz.A0T(this, 2131362536);
        this.A0N = (FbImageView) requireViewById(2131362528);
        this.A0F = JQz.A0T(this, 2131362525);
        this.A00 = requireViewById(2131362542);
        this.A0I = JQz.A0T(this, 2131362537);
        this.A02 = requireViewById(2131362711);
        this.A01 = requireViewById(2131362524);
        this.A0J = JQz.A0T(this, 2131362541);
        this.A04 = requireViewById(2131362540);
        this.A03 = requireViewById(2131362539);
        this.A0O = new View[]{JQz.A0M(this, 2131366713), JQz.A0M(this, 2131366716), JQz.A0M(this, 2131366714), JQz.A0M(this, 2131366715)};
        MoreInfoContactRow moreInfoContactRow = this.A0D;
        if (moreInfoContactRow != null) {
            GlyphButton glyphButton = moreInfoContactRow.A01;
            11T.A0D(glyphButton);
            glyphButton.setImageResource(2132344835);
        }
        MoreInfoContactRow moreInfoContactRow2 = this.A08;
        if (moreInfoContactRow2 != null) {
            GlyphButton glyphButton2 = moreInfoContactRow2.A01;
            11T.A0D(glyphButton2);
            glyphButton2.setImageResource(2132345166);
        }
        MoreInfoContactRow moreInfoContactRow3 = this.A06;
        if (moreInfoContactRow3 != null) {
            GlyphButton glyphButton3 = moreInfoContactRow3.A01;
            11T.A0D(glyphButton3);
            glyphButton3.setImageResource(2132345309);
        }
        MoreInfoContactRow moreInfoContactRow4 = this.A07;
        if (moreInfoContactRow4 != null) {
            GlyphButton glyphButton4 = moreInfoContactRow4.A01;
            11T.A0D(glyphButton4);
            glyphButton4.setImageResource(2132345408);
        }
        MoreInfoContactRow moreInfoContactRow5 = this.A08;
        if (moreInfoContactRow5 != null) {
            2OB r0 = moreInfoContactRow5.A02;
            11T.A0D(r0);
            r0.setText(2131951658);
            MoreInfoContactRow.A00(moreInfoContactRow5);
        }
        MoreInfoContactRow moreInfoContactRow6 = this.A06;
        if (moreInfoContactRow6 != null) {
            2OB r02 = moreInfoContactRow6.A02;
            11T.A0D(r02);
            r02.setText(2131951657);
            MoreInfoContactRow.A00(moreInfoContactRow6);
        }
        MoreInfoContactRow moreInfoContactRow7 = this.A07;
        if (moreInfoContactRow7 != null) {
            2OB r03 = moreInfoContactRow7.A02;
            11T.A0D(r03);
            r03.setText(2131951654);
            MoreInfoContactRow.A00(moreInfoContactRow7);
        }
        A02(this);
        2OB r04 = this.A0M;
        if (r04 != null) {
            11T.A0A(context2);
            LDi.A04(context2, r04);
        }
        2OB r05 = this.A0G;
        if (r05 != null) {
            11T.A0A(context2);
            LDi.A03(context2, r05);
        }
        2OB r06 = this.A0H;
        if (r06 != null) {
            11T.A0A(context2);
            LDi.A03(context2, r06);
        }
        View A0M = JQz.A0M(this, 2131362544);
        11T.A0A(context2);
        2Me A02 = LDi.A02(context2);
        2MR r07 = 2MR.A0p;
        AbH.A1K(A0M, A02.A01(r07));
        LDi.A04(context2, (TextView) DKG.A0B(this, 2131362534));
        AbH.A1K(JQz.A0M(this, 2131362543), LDi.A02(context2).A01(r07));
        2OB r08 = this.A0F;
        if (r08 != null) {
            LDi.A04(context2, r08);
        }
        2OB r09 = this.A0K;
        if (r09 != null) {
            LDi.A04(context2, r09);
        }
        2OB r010 = this.A0L;
        if (r010 != null) {
            LDi.A04(context2, r010);
        }
        View view = this.A00;
        if (view != null) {
            AbH.A1K(view, LDi.A02(context2).A01(r07));
        }
        2OB r011 = this.A0I;
        if (r011 != null) {
            LDi.A03(context2, r011);
        }
        2OB r012 = this.A0J;
        if (r012 != null) {
            LDi.A04(context2, r012);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String A00(FbTextView fbTextView) {
        return fbTextView.getVisibility() != 0 ? "" : fbTextView.getText().toString();
    }

    public static final void A01(JZG jzg) {
        2OB r0;
        MoreInfoContactRow moreInfoContactRow;
        MoreInfoContactRow moreInfoContactRow2;
        MoreInfoContactRow moreInfoContactRow3;
        2OB r02 = jzg.A0K;
        int i = 0;
        int i2 = ((r02 == null || r02.getVisibility() != 0) && ((r0 = jzg.A0L) == null || r0.getVisibility() != 0)) ? 8 : 0;
        2OB r03 = jzg.A0F;
        if (r03 != null) {
            r03.setVisibility(i2);
        }
        View view = jzg.A00;
        if (view != null) {
            view.setVisibility(i2);
        }
        2OB r04 = jzg.A0M;
        boolean A0A = 1JF.A0A(r04 != null ? r04.getText() : null);
        int A00 = DKG.A00(A0A ? 1 : 0);
        for (View view2 : jzg.A0O) {
            view2.setVisibility(A00);
        }
        int i3 = !A0A ? 1 : 0;
        View view3 = jzg.A02;
        if (view3 != null) {
            view3.setVisibility(DKG.A00(i3));
        }
        MoreInfoContactRow moreInfoContactRow4 = jzg.A09;
        if ((moreInfoContactRow4 == null || moreInfoContactRow4.getVisibility() != 0) && (((moreInfoContactRow = jzg.A0A) == null || moreInfoContactRow.getVisibility() != 0) && (((moreInfoContactRow2 = jzg.A0B) == null || moreInfoContactRow2.getVisibility() != 0) && ((moreInfoContactRow3 = jzg.A0C) == null || moreInfoContactRow3.getVisibility() != 0)))) {
            i = 8;
        }
        View view4 = jzg.A04;
        if (view4 != null) {
            view4.setVisibility(i);
        }
        View view5 = jzg.A03;
        if (view5 != null) {
            view5.setVisibility(i);
        }
        A02(jzg);
        jzg.invalidate();
    }

    public static final void A02(JZG jzg) {
        GlyphButton glyphButton = jzg.A0E;
        String string = (glyphButton == null || glyphButton.getVisibility() != 0) ? "" : jzg.getResources().getString(2131951650);
        11T.A0D(string);
        FbTextView fbTextView = jzg.A0M;
        String str = null;
        String A00 = fbTextView != null ? A00(fbTextView) : null;
        FbTextView fbTextView2 = jzg.A0G;
        String A002 = fbTextView2 != null ? A00(fbTextView2) : null;
        FbTextView fbTextView3 = jzg.A0H;
        String A003 = fbTextView3 != null ? A00(fbTextView3) : null;
        View view = jzg.A02;
        if (view != null) {
            view.setContentDescription(0Pz.A0z(A00, ". ", string, A002, A003));
        }
        String string2 = jzg.getResources().getString(2131951649);
        11T.A0A(string2);
        FbTextView fbTextView4 = jzg.A0K;
        String A004 = fbTextView4 != null ? A00(fbTextView4) : null;
        FbTextView fbTextView5 = jzg.A0L;
        if (fbTextView5 != null) {
            str = A00(fbTextView5);
        }
        View view2 = jzg.A01;
        if (view2 != null) {
            view2.setContentDescription(0Pz.A0v(string2, ". ", A004, str));
        }
    }
}
