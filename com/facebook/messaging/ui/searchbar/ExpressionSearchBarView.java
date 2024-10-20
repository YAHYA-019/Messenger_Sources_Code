package com.facebook.messaging.ui.searchbar;

import X.11T;
import X.1Br;
import X.7zM;
import X.AbG;
import X.AbH;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C1u2;
import X.C1u3;
import X.DCy;
import X.DKF;
import X.DKG;
import X.GOo;
import X.HXy;
import X.IJ7;
import X.IKB;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbImageButton;
import com.facebook.ui.edittext.AnimatedHintsTextLayout;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FbImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: ExpressionSearchBarView.class */
public final class ExpressionSearchBarView extends CustomFrameLayout {
    public MigColorScheme A00;
    public HXy A01;
    public final EditText A02;
    public final 1Br A03;
    public final FbImageButton A04;
    public final FbImageButton A05;
    public final AnimatedHintsTextLayout A06;
    public final C01i A07;
    public final View A08;
    public final FbImageView A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionSearchBarView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpressionSearchBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressionSearchBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = 7zM.A0U();
        this.A07 = C01g.A01(new DCy(this, 17));
        A0U(2132541949);
        this.A06 = (AnimatedHintsTextLayout) 7zM.A0H(this, 2131367143);
        this.A02 = (EditText) 7zM.A0H(this, 2131367145);
        this.A05 = (FbImageButton) 7zM.A0H(this, 2131363030);
        this.A09 = (FbImageView) 7zM.A0H(this, 2131367173);
        FbImageButton fbImageButton = (FbImageButton) 7zM.A0H(this, 2131362336);
        this.A04 = fbImageButton;
        this.A08 = 7zM.A0H(this, 2131367144);
        GOo.A16(context, fbImageButton, 2131953159);
        LightColorScheme A00 = LightColorScheme.A00();
        this.A00 = A00;
        A00(this, A00);
        IKB.A00(this.A05, this, 32);
        IJ7.A00(this.A02, this, 6);
    }

    public /* synthetic */ ExpressionSearchBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final void A00(ExpressionSearchBarView expressionSearchBarView, MigColorScheme migColorScheme) {
        FbImageView fbImageView = expressionSearchBarView.A09;
        C00i c00i = expressionSearchBarView.A03.A00;
        GOo.A1E(fbImageView, C1u3.A4D, (C1u2) c00i.get(), migColorScheme.BEi());
        GOo.A1E(expressionSearchBarView.A05, C1u3.A1y, (C1u2) c00i.get(), migColorScheme.B4h());
        EditText editText = expressionSearchBarView.A02;
        AbH.A1M(editText, migColorScheme);
        editText.setHintTextColor(migColorScheme.B36());
        expressionSearchBarView.A08.setBackgroundTintList(ColorStateList.valueOf(migColorScheme.AmV()));
        FbImageButton fbImageButton = expressionSearchBarView.A04;
        GOo.A1E(fbImageButton, C1u3.A0U, (C1u2) c00i.get(), migColorScheme.B4h());
        AbG.A1H(fbImageButton, migColorScheme);
    }
}
