package com.facebook.messaging.rtc.incall.impl.active.video;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.2MQ;
import X.2Re;
import X.2Wo;
import X.5Gh;
import X.5OF;
import X.5Ww;
import X.7zP;
import X.7zR;
import X.8Lr;
import X.AbM;
import X.AnonymousClass001;
import X.C09s;
import X.C0Ad;
import X.C1oo;
import X.C1u2;
import X.CH4;
import X.CPw;
import X.CpE;
import X.DKF;
import X.DKG;
import X.DRa;
import X.FJK;
import X.FYT;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.H0S;
import X.IKE;
import X.JKE;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.SwitchCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: VideoControls.class */
public final class VideoControls extends CustomFrameLayout {
    public View A00;
    public GlyphButton A01;
    public GlyphButton A02;
    public 8Lr A03;
    public JKE A04;
    public SwitchCompat A05;
    public 2Wo A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public CompoundButton.OnCheckedChangeListener A0A;
    public boolean A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final FJK A0E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoControls(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoControls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.facebook.widget.SwitchCompat, android.view.View] */
    public VideoControls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0D = 1Bu.A00(67640);
        this.A0C = 1Bu.A01(context, 85039);
        this.A03 = new 8Lr(7, (Object) null, false);
        this.A09 = -1;
        this.A0E = new H0S(this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2u, i, 0);
        11T.A0A(obtainStyledAttributes);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        A0U(2132542465);
        ?? r0 = (SwitchCompat) DKG.A0B(this, 2131363885);
        this.A05 = r0;
        1Br r02 = ((CH4) 1Br.A0B(this.A0C)).A02;
        C1u2 A0S = 7zP.A0S(r02);
        2MQ r03 = 2MQ.A0f;
        2Re r04 = 2Re.A04;
        Drawable drawable = context.getDrawable(A0S.A02(r03, r04));
        11T.A0I(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Drawable drawable2 = context.getDrawable(7zP.A0S(r02).A02(2MQ.A0g, r04));
        11T.A0I(drawable2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Drawable drawable3 = context.getDrawable(2132410419);
        if (drawable3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        LayerDrawable A00 = A00(drawable2, drawable3);
        Drawable drawable4 = context.getDrawable(2132410421);
        if (drawable4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        LayerDrawable A002 = A00(drawable, drawable4);
        Drawable drawable5 = context.getDrawable(2132410421);
        if (drawable5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        LayerDrawable A003 = A00(drawable2, drawable5);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, A00);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, A002);
        stateListDrawable.addState(new int[0], A003);
        r0.A0A = stateListDrawable;
        stateListDrawable.setState(r0.getDrawableState());
        r0.requestLayout();
        View requireViewById = requireViewById(2131363372);
        11T.A0A(requireViewById);
        this.A00 = requireViewById;
        GlyphButton glyphButton = (GlyphButton) DKG.A0B(this, 2131367817);
        this.A02 = glyphButton;
        CH4 ch4 = (CH4) 1Br.A0B(this.A0C);
        Resources A0E = GOn.A0E(this);
        CpE A004 = CpE.A00(2132410418, 0);
        CpE A005 = CpE.A00(2132410420, 0);
        CpE A006 = CpE.A00(7zP.A0S(ch4.A02).A02(2MQ.A0j, r04), 0);
        glyphButton.setImageDrawable(CPw.A03(A0E, A004, A005, A004, A005, A006, A006, A006, A006));
        GlyphButton glyphButton2 = (GlyphButton) DKG.A0B(this, 2131362319);
        this.A01 = glyphButton2;
        CH4 ch42 = (CH4) 1Br.A0B(this.A0C);
        CpE A007 = CpE.A00(2132410418, 0);
        CpE A008 = CpE.A00(2132410421, 0);
        CpE A009 = CpE.A00(2132410420, 0);
        CpE A0a = AbM.A0a(5Ww.A00().migIconName, 7zP.A0S(ch42.A02));
        glyphButton2.setImageDrawable(CPw.A03(A0E, A007, A009, A008, A009, A0a, A0a, A0a, A0a));
        View A01 = C09s.A01(this, 2131363659);
        11T.A0I(A01, "null cannot be cast to non-null type android.view.ViewStub");
        this.A06 = 2Wo.A00((ViewStub) A01);
        View.OnClickListener A0010 = IKE.A00(this, ActionId.MQTT_DISCONNECTED);
        this.A02.setOnClickListener(A0010);
        this.A01.setOnClickListener(A0010);
        if (z) {
            ImageView imageView = (ImageView) GOo.A0F(this.A06);
            CH4 ch43 = (CH4) 1Br.A0B(this.A0C);
            CpE A0011 = CpE.A00(2132410418, 0);
            CpE A0012 = CpE.A00(2132410420, 0);
            CpE A0013 = CpE.A00(7zP.A0S(ch43.A02).A02(r03, r04), 0);
            imageView.setImageDrawable(CPw.A03(A0E, A0011, A0012, A0011, A0012, A0013, A0013, A0013, A0013));
            imageView.setOnClickListener(A0010);
        } else {
            this.A05.setVisibility(0);
        }
        CompoundButton.OnCheckedChangeListener fyt = new FYT(this, 3);
        this.A0A = fyt;
        this.A05.setOnCheckedChangeListener(fyt);
        A0V(true, true, false);
        C0Ad.A0B(this.A05, new DRa(3));
    }

    public /* synthetic */ VideoControls(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final LayerDrawable A00(Drawable drawable, Drawable drawable2) {
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).setGravity(17);
        } else if (drawable instanceof 5OF) {
            ((5Gh) drawable).CpG(17);
        }
        return new LayerDrawable(new Drawable[]{drawable2, drawable});
    }

    public static final void A01(VideoControls videoControls) {
        GlyphButton glyphButton;
        int i = 0;
        if (videoControls.A0B) {
            8Lr r0 = videoControls.A03;
            if (r0.A01) {
                boolean A1X = 7zR.A1X(r0.A00);
                GlyphButton glyphButton2 = videoControls.A01;
                glyphButton2.setSelected(A1X);
                int i2 = 2131964778;
                if (A1X) {
                    i2 = 2131964777;
                }
                GOo.A16(videoControls.getContext(), glyphButton2, i2);
                glyphButton2.setSelected(A1X);
                glyphButton2.setVisibility(DKG.A00(videoControls.A08 ? 1 : 0));
                glyphButton = videoControls.A02;
                if (A1X) {
                    i = 8;
                }
                glyphButton.setVisibility(i);
            }
        }
        videoControls.A01.setVisibility(8);
        glyphButton = videoControls.A02;
        glyphButton.setVisibility(i);
    }

    /* JADX WARN: Type inference failed for: r0v60, types: [com.facebook.widget.SwitchCompat, android.widget.CompoundButton, android.view.View] */
    public final void A0V(boolean z, boolean z2, boolean z3) {
        ViewPropertyAnimator listener;
        int i = 0;
        if (z != this.A08) {
            ?? r0 = this.A05;
            r0.setOnCheckedChangeListener(null);
            if (this.A06.A00 != null) {
                if (z3) {
                    r0.setChecked(z);
                    r0.setVisibility(GOp.A01(z ? 1 : 0));
                    GOo.A1C((View) r0);
                    if (z) {
                        GOq.A0O((View) r0).setDuration(75).setStartDelay(175L).start();
                    } else {
                        r0.setAlpha(1.0f);
                    }
                } else {
                    GOo.A1C((View) r0);
                    r0.setAlpha(1.0f);
                    r0.A02(z);
                    r0.setVisibility(GOp.A01(z ? 1 : 0));
                }
            } else if (z3) {
                r0.setChecked(z);
            } else {
                GOo.A1C((View) r0);
                r0.A02(z);
            }
            r0.setOnCheckedChangeListener(this.A0A);
            this.A08 = z;
        }
        if (this.A07 != z2) {
            this.A07 = z2;
            View view = this.A00;
            if (z3) {
                if (view != null) {
                    GOo.A1C(view);
                    long j = 100;
                    if (z2) {
                        view.setVisibility(0);
                        listener = view.animate().alpha(1.0f).setDuration(150L).setStartDelay(j).setInterpolator((AccelerateDecelerateInterpolator) 1Br.A0B(this.A0D)).setListener(null);
                    } else {
                        listener = GOq.A0O(view).setDuration(j).setInterpolator((AccelerateDecelerateInterpolator) 1Br.A0B(this.A0D)).setListener(this.A0E);
                    }
                    listener.start();
                    return;
                }
            } else if (view != null) {
                GOo.A1C(view);
                view.setAlpha(1.0f);
                if (!z2) {
                    i = 4;
                }
                view.setVisibility(i);
                if (z2) {
                    return;
                }
                this.A01.setVisibility(8);
                return;
            }
            11T.A0L("controlButtonsLayout");
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (this.A09 != i5) {
            this.A09 = i5;
            this.A0B = 1BL.A1S((i5 > getResources().getDimension(2132279470) ? 1 : (i5 == getResources().getDimension(2132279470) ? 0 : -1)));
            A01(this);
        }
    }
}
