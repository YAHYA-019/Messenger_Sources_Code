package com.facebook.messaging.accountswitch.halfsheet;

import X.0Q8;
import X.11T;
import X.4YU;
import X.7zR;
import X.AnonymousClass001;
import X.C2cn;
import X.C2qb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbFrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SwitchAccountsHalfSheetHeader.class */
public final class SwitchAccountsHalfSheetHeader extends FbFrameLayout {
    public View A00;
    public MigColorScheme A01;
    public MigColorScheme A02;
    public FbFrameLayout A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchAccountsHalfSheetHeader(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchAccountsHalfSheetHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountsHalfSheetHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A02 = 7zR.A0c(context);
        View.inflate(getContext(), 2132543437, this);
        MigColorScheme migColorScheme = this.A02;
        if (migColorScheme == null) {
            11T.A0L("userSelectedScheme");
            throw 0Q8.createAndThrow();
        }
        this.A01 = migColorScheme;
        this.A03 = (FbFrameLayout) findViewById(2131364440);
        this.A00 = findViewById(2131364439);
        A00(context, this);
    }

    public /* synthetic */ SwitchAccountsHalfSheetHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final void A00(Context context, SwitchAccountsHalfSheetHeader switchAccountsHalfSheetHeader) {
        Resources A0C = 4YU.A0C(context);
        MigColorScheme migColorScheme = switchAccountsHalfSheetHeader.A01;
        if (migColorScheme == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        float dimensionPixelSize = A0C.getDimensionPixelSize(2132279298);
        ShapeDrawable A03 = C2cn.A03(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f}, C2qb.A00(migColorScheme, migColorScheme.AjC()));
        FbFrameLayout fbFrameLayout = switchAccountsHalfSheetHeader.A03;
        if (fbFrameLayout == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        fbFrameLayout.setBackground(A03);
        Resources A0C2 = 4YU.A0C(context);
        MigColorScheme migColorScheme2 = switchAccountsHalfSheetHeader.A01;
        if (migColorScheme2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        ShapeDrawable A02 = C2cn.A02(A0C2.getDimensionPixelSize(2132279309), migColorScheme2.Atp());
        View view = switchAccountsHalfSheetHeader.A00;
        if (view == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        view.setBackground(A02);
    }
}
