package com.facebook.dialtone.switcher;

import X.1BK;
import X.1BQ;
import X.1BV;
import X.2MR;
import X.2Me;
import X.2Mg;
import X.3Eh;
import X.4YU;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.AbF;
import X.AbH;
import X.AbstractC00603o4;
import X.AnonymousClass423;
import X.C00i;
import X.C09s;
import X.C1Ur;
import X.C1uu;
import X.C3o5;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKF;
import X.DKG;
import X.DKH;
import X.DKI;
import X.Ecb;
import X.FA2;
import X.FXr;
import X.FYE;
import X.Fcg;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LightingColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.resources.ui.FbButton;
import com.facebook.resources.ui.FbTextView;
import com.facebook.resources.ui.FbToggleButton;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.zero.cms.ZeroCmsUtil;
import com.mapbox.mapboxsdk.R;

/* loaded from: DialtoneManualSwitcher.class */
public class DialtoneManualSwitcher extends CustomLinearLayout {
    public int A00;
    public int A01;
    public Ecb A02;
    public GlyphView A03;
    public GlyphView A04;
    public GlyphView A05;
    public GlyphView A06;
    public GlyphView A07;
    public GlyphView A08;
    public 2MR A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public FbButton A0F;
    public FbTextView A0G;
    public FbTextView A0H;
    public FbTextView A0I;
    public FbTextView A0J;
    public FbToggleButton A0K;
    public boolean A0L;
    public boolean A0M;
    public int A0N;
    public final View.OnClickListener A0O;
    public final C00i A0P;
    public final C00i A0Q;
    public final C00i A0R;
    public final C00i A0S;
    public final C00i A0T;

    public DialtoneManualSwitcher(Context context) {
        super(context);
        this.A0R = 1BQ.A00();
        this.A0S = DKF.A0M();
        this.A0T = DKD.A0N();
        this.A0P = 1BQ.A02(99773);
        this.A0Q = DKD.A0Q();
        this.A0L = false;
        this.A0O = FXr.A02(this, 32);
        A03();
    }

    public DialtoneManualSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0R = 1BQ.A00();
        this.A0S = DKF.A0M();
        this.A0T = DKD.A0N();
        this.A0P = 1BQ.A02(99773);
        this.A0Q = DKD.A0Q();
        this.A0L = false;
        this.A0O = FXr.A02(this, 32);
        A03();
    }

    public DialtoneManualSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0R = 1BQ.A00();
        this.A0S = DKF.A0M();
        this.A0T = DKD.A0N();
        this.A0P = 1BQ.A02(99773);
        this.A0Q = DKD.A0Q();
        this.A0L = false;
        this.A0O = FXr.A02(this, 32);
        A03();
    }

    public static float A00(DialtoneManualSwitcher dialtoneManualSwitcher) {
        int length = dialtoneManualSwitcher.A0J.getText().length() + dialtoneManualSwitcher.A0I.getText().length();
        int i = dialtoneManualSwitcher.A0N;
        Resources resources = dialtoneManualSwitcher.getResources();
        int i2 = 2132279352;
        if (length > i) {
            i2 = 2132279337;
        }
        return resources.getDimension(i2);
    }

    public static int A01(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getWidth();
    }

    private void A02() {
        if (DKG.A0K(this).A06() && !DKH.A1Z(this) && 1BK.A0N(this.A0R).AZk(36310675734922146L)) {
            this.A0F.setVisibility(8);
            this.A0K.setVisibility(0);
            A0C(2MR.A0j, true);
            A07(this.A0K);
            FbToggleButton fbToggleButton = this.A0K;
            Resources resources = getResources();
            int A01 = 7zN.A01(resources);
            fbToggleButton.setPadding(A01, 0, A01, 0);
            DKF.A17(resources, fbToggleButton, 2132279390);
            return;
        }
        if (DKG.A0K(this).A06()) {
            FbButton fbButton = this.A0F;
            Resources resources2 = getResources();
            int A012 = 7zN.A01(resources2);
            fbButton.setPadding(A012, 0, A012, 0);
            DKF.A17(resources2, fbButton, 2132279390);
        }
        A07(this.A0F);
        this.A0F.setOnClickListener(this.A0O);
        A04(Typeface.DEFAULT_BOLD, this, 2MR.A1j);
        if (this.A0M) {
            if (!4YU.A0d(DKG.A0K(this).A03).A04("banner_notifications")) {
                this.A0M = false;
                this.A06.setVisibility(8);
            }
            if (this.A0M) {
                Resources resources3 = getResources();
                ViewGroup.MarginLayoutParams A0I = DKC.A0I(this.A0F);
                A0I.setMargins(0, DKC.A04(resources3), resources3.getDimensionPixelSize(2132279309), 0);
                this.A0F.setLayoutParams(A0I);
                this.A06.A00(7zM.A02(getContext(), 2MR.A1B));
                this.A06.setVisibility(0);
                this.A06.bringToFront();
            }
        }
    }

    private void A03() {
        this.A0D = DKD.A0R();
        this.A0B = 1BV.A00(32882);
        this.A0E = AbH.A0N();
        Context context = getContext();
        this.A0C = AbF.A0Q(context, 98587);
        this.A0A = 1BV.A00(98469);
        Resources resources = getResources();
        this.A0M = false;
        C00i c00i = this.A0R;
        this.A0N = C1Ur.A00(C3o5.A0F(c00i), 20, 36592150699508168L);
        this.A01 = C1Ur.A00(C3o5.A0F(c00i), 15, 36592150699639241L);
        A0D(2132541854);
        View requireViewById = requireViewById(2131363633);
        if (1BK.A0N(c00i).AZk(36310675730006888L)) {
            requireViewById.setClickable(true);
            requireViewById.setFocusable(true);
        }
        ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
        this.A0G = (FbTextView) C09s.A01(this, 2131363632);
        this.A0H = (FbTextView) C09s.A01(this, 2131368483);
        this.A0J = (FbTextView) C09s.A01(this, 2131367819);
        this.A0I = (FbTextView) C09s.A01(this, 2131362378);
        this.A0K = (FbToggleButton) C09s.A01(this, 2131367820);
        this.A0F = (FbButton) C09s.A01(this, 2131362928);
        this.A04 = (GlyphView) C09s.A01(this, 2131363677);
        this.A05 = (GlyphView) C09s.A01(this, 2131364348);
        this.A03 = (GlyphView) C09s.A01(this, 2131362996);
        this.A07 = (GlyphView) C09s.A01(this, 2131368202);
        this.A08 = (GlyphView) C09s.A01(this, 2131368425);
        this.A06 = (GlyphView) C09s.A01(this, 2131366008);
        FXr.A03(this.A0K, this, 33);
        this.A0F.setOnClickListener(this.A0O);
        FXr.A03(this.A04, this, 34);
        this.A0J.setTextSize(0, A00(this));
        this.A0G.setVisibility(0);
        this.A0H.setVisibility(8);
        this.A0K.setBackgroundDrawable(context.getDrawable(2132410643));
        this.A0K.setGravity(17);
        DKF.A17(resources, this.A0K, 2132279337);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        this.A0K.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(2132279305);
        this.A0F.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        DKF.A17(resources, this.A0F, 2132279337);
        layoutParams.height = resources.getDimensionPixelSize(2132279387);
        requireViewById.setLayoutParams(layoutParams);
        this.A04.setVisibility(8);
        this.A05.setVisibility(8);
        this.A03.setVisibility(8);
        this.A07.setVisibility(8);
        this.A08.setVisibility(8);
        this.A06.setVisibility(8);
        A09(this);
        String A03 = DKF.A0i(this.A0S).A03("toggle_flex_plus_banner_button", 2131967375);
        this.A0K.setTextOn(A03);
        this.A0K.setTextOff(A03);
        this.A0K.setTransformationMethod(null);
        this.A0F.setVisibility(8);
    }

    public static void A04(Typeface typeface, DialtoneManualSwitcher dialtoneManualSwitcher, 2MR r303) {
        int i;
        String str;
        Context context = dialtoneManualSwitcher.getContext();
        2Mg r0 = 2Me.A02;
        int A03 = r0.A03(context, r303);
        C1uu c1uu = (C1uu) dialtoneManualSwitcher.A0Q.get();
        int i2 = 2132345462;
        if (DKG.A0K(dialtoneManualSwitcher).A08()) {
            i2 = 2132345492;
        }
        Drawable A01 = c1uu.A01(i2, A03);
        if (A01 != null) {
            int lineHeight = dialtoneManualSwitcher.A0J.getLineHeight();
            A01.setBounds(0, 0, lineHeight, lineHeight);
            dialtoneManualSwitcher.A0F.setCompoundDrawablesWithIntrinsicBounds(A01, (Drawable) null, (Drawable) null, (Drawable) null);
            AnonymousClass423 A0K = DKG.A0K(dialtoneManualSwitcher);
            boolean A08 = A0K.A08();
            ZeroCmsUtil A0i = DKF.A0i(A0K.A02);
            if (A08) {
                i = 2131953204;
                str = AbstractC00603o4.A00(419);
            } else {
                i = 2131953202;
                str = "banner_carrier_page_buy_data";
            }
            String A032 = A0i.A03(str, i);
            dialtoneManualSwitcher.A0L = false;
            dialtoneManualSwitcher.A0F.setText(A032);
            DKF.A14(context, dialtoneManualSwitcher.A0F, r303, r0);
            dialtoneManualSwitcher.A0F.setCompoundDrawablePadding(dialtoneManualSwitcher.getResources().getDimensionPixelSize(2132279305));
            dialtoneManualSwitcher.A0F.setTypeface(typeface);
            dialtoneManualSwitcher.A0F.setVisibility(0);
            dialtoneManualSwitcher.A09 = r303;
            dialtoneManualSwitcher.A0F.getViewTreeObserver().addOnGlobalLayoutListener(new FYE(dialtoneManualSwitcher, 1));
        }
    }

    public static void A05(Typeface typeface, DialtoneManualSwitcher dialtoneManualSwitcher, 2MR r303, CharSequence charSequence, float f, float f2) {
        dialtoneManualSwitcher.A0J.setText(charSequence);
        dialtoneManualSwitcher.A0J.setContentDescription(charSequence);
        DKF.A14(dialtoneManualSwitcher.getContext(), dialtoneManualSwitcher.A0J, r303, 2Me.A02);
        dialtoneManualSwitcher.A0J.setAlpha(f2);
        dialtoneManualSwitcher.A0J.setTypeface(typeface);
        dialtoneManualSwitcher.A0J.setTextSize(0, f);
    }

    private void A06(View view, View view2, int i) {
        Resources resources = getResources();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, resources.getDimensionPixelSize(2132279455));
        ((ViewGroup.LayoutParams) layoutParams).height = resources.getDimensionPixelSize(2132279333);
        if (view2 != null) {
            layoutParams.addRule(16, view2.getId());
            layoutParams.setMargins(0, 0, i, 0);
            layoutParams.setMarginEnd(i);
        } else {
            layoutParams.addRule(11);
            layoutParams.addRule(21);
        }
        layoutParams.addRule(15);
        view.setLayoutParams(layoutParams);
    }

    private void A07(Button button) {
        View findViewById = findViewById(2131363633);
        if (findViewById != null) {
            boolean A06 = DKG.A0K(this).A06();
            int i = 14;
            if (A06) {
                i = 6;
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Resources resources = getResources();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, resources.getDimensionPixelSize(2132279455));
            layoutParams2.addRule(11);
            int i2 = 2132279387;
            if (A06) {
                i2 = 2132279328;
            }
            layoutParams.height = resources.getDimensionPixelSize(i2);
            findViewById.setLayoutParams(layoutParams);
            int i3 = 2132279333;
            if (A06) {
                i3 = 2132279321;
            }
            ((ViewGroup.LayoutParams) layoutParams2).height = resources.getDimensionPixelSize(i3);
            layoutParams2.addRule(21);
            layoutParams2.addRule(15);
            button.setLayoutParams(layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            DKH.A0w(resources, gradientDrawable, i);
            gradientDrawable.setColor(7zM.A02(getContext(), 2MR.A1x));
            button.setBackground(gradientDrawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006d  */
    /* JADX WARN: Type inference failed for: r0v99, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A08(com.facebook.dialtone.switcher.DialtoneManualSwitcher r301) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dialtone.switcher.DialtoneManualSwitcher.A08(com.facebook.dialtone.switcher.DialtoneManualSwitcher):void");
    }

    public static void A09(DialtoneManualSwitcher dialtoneManualSwitcher) {
        Resources resources = dialtoneManualSwitcher.getResources();
        int i = 0;
        View view = null;
        if (dialtoneManualSwitcher.A04.getVisibility() == 0) {
            dialtoneManualSwitcher.A06(dialtoneManualSwitcher.A04, null, 0);
            view = dialtoneManualSwitcher.A04;
            i = 7zN.A01(resources);
        }
        if (dialtoneManualSwitcher.A0K.getVisibility() == 0) {
            dialtoneManualSwitcher.A06(dialtoneManualSwitcher.A0K, view, i);
            view = dialtoneManualSwitcher.A0K;
            i = resources.getDimensionPixelSize(2132279305);
        }
        if (dialtoneManualSwitcher.A0F.getVisibility() == 0) {
            dialtoneManualSwitcher.A06(dialtoneManualSwitcher.A0F, view, i);
        }
    }

    public static void A0A(DialtoneManualSwitcher dialtoneManualSwitcher) {
        FbToggleButton fbToggleButton = dialtoneManualSwitcher.A0K;
        Context context = dialtoneManualSwitcher.getContext();
        2MR r0 = 2MR.A0j;
        2Mg r02 = 2Me.A02;
        DKF.A14(context, fbToggleButton, r0, r02);
        boolean A0i = DKI.A0i(context, dialtoneManualSwitcher, r02);
        dialtoneManualSwitcher.setBackgroundColor(r02.A03(context, 2MR.A0S));
        View findViewById = dialtoneManualSwitcher.findViewById(2131363633);
        if (findViewById != null) {
            findViewById.setPadding(25, A0i ? 1 : 0, 25, A0i ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0B(DialtoneManualSwitcher dialtoneManualSwitcher, 2MR r302, 2MR r303, String str, int i) {
        byte b;
        2MR r310;
        Typeface typeface;
        if (DKG.A0K(dialtoneManualSwitcher).A03() || DKG.A0K(dialtoneManualSwitcher).A05()) {
            b = true;
            r310 = 2MR.A03;
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            b = false;
            r310 = r302;
            typeface = Typeface.DEFAULT;
        }
        A05(typeface, dialtoneManualSwitcher, r310, str, A00(dialtoneManualSwitcher), 1.0f);
        Resources resources = dialtoneManualSwitcher.getResources();
        dialtoneManualSwitcher.A0I.setVisibility(8);
        A09(dialtoneManualSwitcher);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f = 2.0f;
        if (b != false) {
            f = 6.0f;
        }
        DKH.A0w(resources, gradientDrawable, f);
        Context context = dialtoneManualSwitcher.getContext();
        2Mg r0 = 2Me.A02;
        gradientDrawable.setStroke(2, r0.A03(context, r303));
        gradientDrawable.setColor(b != false ? r0.A03(context, 2MR.A1x) : context.getColor(i));
        dialtoneManualSwitcher.A0F.setBackground(gradientDrawable);
        dialtoneManualSwitcher.A0K.setBackground(gradientDrawable);
        dialtoneManualSwitcher.A04.A00(r302.lightModeFallBackColorInt);
        dialtoneManualSwitcher.setBackgroundResource(i);
        if (b == true) {
            FbToggleButton fbToggleButton = dialtoneManualSwitcher.A0K;
            2MR r02 = 2MR.A0j;
            DKF.A14(context, fbToggleButton, r02, r0);
            boolean A0i = DKI.A0i(context, dialtoneManualSwitcher, r0);
            dialtoneManualSwitcher.setBackgroundColor(r0.A01(context));
            DKF.A14(context, dialtoneManualSwitcher.A0F, r02, r0);
            View findViewById = dialtoneManualSwitcher.findViewById(2131363633);
            if (findViewById != null) {
                findViewById.setPadding(25, A0i ? 1 : 0, 25, A0i ? 1 : 0);
            }
        }
    }

    private void A0C(2MR r302, boolean z) {
        String A03 = DKF.A0i(this.A0S).A03("banner_carrier_page_buy_data", 2131953202);
        this.A0K.setText(A03);
        this.A0K.setTextOff(A03);
        this.A0K.setTextOn(A03);
        DKF.A14(getContext(), this.A0K, r302, 2Me.A02);
        if (z) {
            this.A0K.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Resources resources = getResources();
        FbToggleButton fbToggleButton = this.A0K;
        int A05 = 7zQ.A05(A03);
        int i = 2132279337;
        if (A05 > this.A01) {
            i = 2132279297;
        }
        fbToggleButton.setTextSize(0, resources.getDimension(i));
        int i2 = 2132279306;
        if (A05 > this.A01) {
            i2 = 2132279301;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        this.A0K.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.A0K.setVisibility(0);
    }

    public void A0E(String str) {
        C00i c00i = this.A0T;
        boolean A04 = 4YU.A0d(c00i).A04("freemium_models_fup_banner");
        2MR r0 = 2MR.A1j;
        float dimension = getResources().getDimension(2132279390);
        float f = 1.0f;
        if (A04) {
            f = 0.2f;
        }
        A05(Typeface.DEFAULT_BOLD, this, r0, str, dimension, f);
        setBackgroundColor(7zM.A02(getContext(), 2MR.A2d));
        if (DKH.A1Z(this)) {
            A02();
        }
        if (4YU.A0d(c00i).A04("freemium_models_banner_tooltip")) {
            A08(this);
        }
        this.A0K.setVisibility(8);
        this.A0I.setVisibility(8);
        this.A0G.setVisibility(4);
    }

    public void A0F(String str) {
        GlyphView glyphView;
        this.A05.setVisibility(8);
        this.A03.setVisibility(8);
        this.A07.setVisibility(8);
        FbRelativeLayout fbRelativeLayout = (FbRelativeLayout) findViewById(2131363633);
        if (fbRelativeLayout != null) {
            A05(Typeface.DEFAULT_BOLD, this, 2MR.A1j, str, getResources().getDimension(2132279390), 1.0f);
            Context context = getContext();
            2MR r0 = 2MR.A0S;
            2Mg r02 = 2Me.A02;
            AbH.A1K(fbRelativeLayout, r02.A03(context, r0));
            if (DKH.A1Z(this) || 4YU.A0d(this.A0T).A04("native_url_interstitial")) {
                A02();
            }
            C00i c00i = this.A0T;
            if (!4YU.A0d(c00i).A04("zorp_paid_mode_banner")) {
                C00i c00i2 = this.A0R;
                if (1BK.A0N(c00i2).AZk(2342153684947108751L)) {
                    2MR r03 = 2MR.A1g;
                    Drawable A03 = ((Fcg) DKC.A0y()).A03(context, 3Eh.ACO);
                    if (A03 != null) {
                        A03.setColorFilter(new LightingColorFilter(r02.A03(context, r03), r02.A03(context, r03)));
                        int lineHeight = this.A0J.getLineHeight();
                        A03.setBounds(0, 0, lineHeight, lineHeight);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0J.getText());
                        if (1BK.A0N(c00i2).AZk(36310675732104065L)) {
                            this.A05.setVisibility(0);
                        } else {
                            spannableStringBuilder.insert(0, (CharSequence) "   ");
                            spannableStringBuilder.setSpan(new ImageSpan(A03, 2), 0, 1, 33);
                        }
                        this.A0J.setText(spannableStringBuilder);
                        FXr.A03(this.A05, this, 29);
                        this.A05.setClickable(true);
                    }
                }
                if (((FA2) this.A0A.get()).A03()) {
                    int currentTextColor = this.A0J.getCurrentTextColor();
                    if (1BK.A0N(((FA2) this.A0A.get()).A00).AZk(36310675732759433L)) {
                        FXr.A03(this.A03, this, 39);
                        this.A03.A00(currentTextColor);
                        this.A03.setVisibility(0);
                        glyphView = this.A03;
                    } else if (1BK.A0N(((FA2) this.A0A.get()).A00).AZk(36310675732693896L)) {
                        FXr.A03(this.A07, this, 40);
                        this.A07.A00(currentTextColor);
                        this.A07.setVisibility(0);
                        glyphView = this.A07;
                    }
                    glyphView.setClickable(true);
                }
                FXr.A03(this.A0J, this, 35);
            }
            AbH.A1K(this.A0H, r02.A03(context, 2MR.A2c));
            this.A0H.setVisibility(0);
            if (DKH.A1Z(this) || ((!DKH.A1Z(this) && !4YU.A0d(c00i).A04("native_url_interstitial")) || !1BK.A0N(this.A0R).AZk(36310675734922146L))) {
                this.A0K.setVisibility(8);
            }
            this.A0I.setVisibility(8);
            this.A0G.setVisibility(4);
            this.A04.setVisibility(8);
            if (4YU.A0d(c00i).A04("banner_touch_target_expansion")) {
                C00i c00i3 = this.A0D;
                if (c00i3 == null || !DKE.A1X(c00i3)) {
                    View.OnClickListener A02 = FXr.A02(this, 36);
                    this.A0J.setOnClickListener(A02);
                    fbRelativeLayout.setOnClickListener(A02);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (X.DKG.A0K(r301).A05() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(java.lang.String r302, int r303) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dialtone.switcher.DialtoneManualSwitcher.A0G(java.lang.String, int):void");
    }
}
