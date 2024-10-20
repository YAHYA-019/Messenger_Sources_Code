package com.facebook.messaging.rtc.incall.impl.mediasync.titleview;

import X.11T;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.4YU;
import X.5XE;
import X.7zM;
import X.7zP;
import X.C09s;
import X.C0Ad;
import X.C15h;
import X.C1u3;
import X.DKF;
import X.DKG;
import X.GOo;
import X.GVi;
import X.HVO;
import X.I9A;
import X.ICR;
import X.IKl;
import X.IQh;
import X.J5m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.resources.ui.FbFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MediaSyncTitleExternalView.class */
public final class MediaSyncTitleExternalView extends FbFrameLayout implements CallerContextable {
    public static final CallerContext A0G = CallerContext.A06(MediaSyncTitleExternalView.class);
    public 5XE A00;
    public HVO A01;
    public I9A A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final ConstraintLayout A06;
    public final 5XE A07;
    public final FbDraweeView A08;
    public final GlyphButton A09;
    public final GlyphButton A0A;
    public final GlyphButton A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final C15h A0F;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncTitleExternalView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaSyncTitleExternalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaSyncTitleExternalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0E = 7zM.A0U();
        this.A0F = J5m.A00;
        this.A0D = GOo.A0L();
        Context A08 = 4YU.A08(this);
        this.A0C = 1Bu.A01(A08, 67593);
        LayoutInflater.from(A08).inflate(2132542514, this);
        this.A05 = DKF.A0E(this, 2131365548);
        this.A04 = DKF.A0E(this, 2131365547);
        this.A03 = DKF.A0E(this, 2131365529);
        this.A08 = (FbDraweeView) C09s.A01(this, 2131365525);
        GlyphButton glyphButton = (GlyphButton) C09s.A01(this, ICR.A00(this.A0C).AZk(36314390871613353L) ? 2131365537 : 2131365531);
        this.A0B = glyphButton;
        glyphButton.setImageDrawable(7zP.A0S(this.A0E).A07(C1u3.A2N));
        ConstraintLayout constraintLayout = (ConstraintLayout) C09s.A01(this, 2131363324);
        this.A06 = constraintLayout;
        5XE r0 = new 5XE();
        this.A07 = r0;
        r0.A0C(constraintLayout);
        if (ICR.A00(this.A0C).AZk(36314390871613353L) && constraintLayout != null) {
            5XE r02 = new 5XE();
            this.A00 = r02;
            r02.A0C(constraintLayout);
            5XE r03 = this.A00;
            11T.A0D(r03);
            r03.A09(2131365548, 3, 2131365537, 4);
            5XE r04 = this.A00;
            11T.A0D(r04);
            r04.A09(2131365548, 4, 2131365547, 3);
            5XE r05 = this.A00;
            11T.A0D(r05);
            r05.A09(2131365547, 3, 2131365548, 4);
            5XE r06 = this.A00;
            11T.A0D(r06);
            r06.A09(2131365547, 4, 2131365529, 3);
            5XE r07 = this.A00;
            11T.A0D(r07);
            r07.A09(2131365529, 3, 2131365547, 4);
            5XE r08 = this.A00;
            11T.A0D(r08);
            r08.A0A(constraintLayout);
        }
        GlyphButton glyphButton2 = (GlyphButton) C09s.A01(this, 2131365528);
        this.A09 = glyphButton2;
        glyphButton2.setImageDrawable(7zP.A0S(this.A0E).A07(C1u3.A4D));
        GlyphButton glyphButton3 = (GlyphButton) C09s.A01(this, 2131365546);
        this.A0A = glyphButton3;
        glyphButton3.setImageDrawable(7zP.A0S(this.A0E).A07(C1u3.A1y));
        IQh iQh = new IQh(this);
        ((IKl) 1Bn.A0A(116034)).A01(glyphButton, iQh);
        ((IKl) 1Bn.A0A(116034)).A01(glyphButton2, iQh);
        ((IKl) 1Bn.A0A(116034)).A01(glyphButton3, iQh);
        C0Ad.A0B(this, new GVi(this, 2));
    }

    public /* synthetic */ MediaSyncTitleExternalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
