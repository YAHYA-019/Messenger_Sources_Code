package com.facebook.messaging.rtc.incall.impl.expression.sidebar;

import X.0Q8;
import X.11T;
import X.2OB;
import X.5BK;
import X.AbN;
import X.AbstractC00793on;
import X.C06974ih;
import X.C06984ii;
import X.C07004ik;
import X.C07014il;
import X.C09s;
import X.C1oo;
import X.DKF;
import X.DKG;
import X.GOo;
import X.GOq;
import X.GrD;
import X.HvZ;
import X.IZI;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.litho.LithoView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.FbImageView;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SidebarButton.class */
public final class SidebarButton extends CustomLinearLayout implements CallerContextable {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public Uri A04;
    public LithoView A05;
    public GrD A06;
    public CustomLinearLayout A07;
    public FbImageView A08;
    public Integer A09;
    public final CallerContext A0A;
    public final C06974ih A0B;
    public final FbTextView A0C;
    public final FbImageView A0D;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidebarButton(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidebarButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.TextView, com.facebook.resources.ui.FbTextView] */
    public SidebarButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        C07004ik A00 = C06984ii.A00();
        ((C07014il) A00).A04 = 5BK.A05;
        this.A0B = new C06974ih(A00);
        this.A0A = CallerContext.A06(SidebarButton.class);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2S, i, 0);
        11T.A0A(obtainStyledAttributes);
        A0D(2132543340);
        this.A0D = (FbImageView) C09s.A01(this, 2131367395);
        ?? A0X = GOo.A0X(this, 2131367397);
        this.A0C = A0X;
        this.A07 = (CustomLinearLayout) C09s.A01(this, 2131367393);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        A0X.setText(AbstractC00793on.A01(context, obtainStyledAttributes, 0));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ SidebarButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public final void A0E(boolean z) {
        2OB r0 = this.A0C;
        if (z) {
            HvZ.A01(r0);
        } else {
            HvZ.A00(r0);
        }
    }

    public final void A0F(boolean z) {
        if (isEnabled() != z) {
            setEnabled(z);
            float f = 0.3f;
            if (z) {
                f = 1.0f;
            }
            setAlpha(f);
        }
    }

    public final void A0G(boolean z) {
        this.A0D.setImageDrawable(z ? this.A01 : this.A03);
    }

    public final void A0H(boolean z) {
        String str;
        setVisibility(DKG.A00(z ? 1 : 0));
        if (z) {
            GrD grD = this.A06;
            if (grD == null) {
                str = "delegate";
            } else {
                Integer num = this.A09;
                if (num != null) {
                    String A02 = GrD.A02(num);
                    Set set = grD.A0n;
                    if (set.contains(A02)) {
                        return;
                    }
                    IZI A0c = GOq.A0c(grD.A0Y);
                    if (!IZI.A03(A0c)) {
                        AbN.A0X(A0c).A04(A0c.A01, "effects_entry_point_impression", A02);
                    }
                    set.add(A02);
                    return;
                }
                str = "buttonType";
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }
}
