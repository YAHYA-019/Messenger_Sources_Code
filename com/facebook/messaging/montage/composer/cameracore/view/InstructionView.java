package com.facebook.messaging.montage.composer.cameracore.view;

import X.0FI;
import X.11T;
import X.2OB;
import X.5YB;
import X.DKC;
import X.DKF;
import X.DKG;
import X.GOo;
import X.H9Z;
import X.Iqm;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomLinearLayout;
import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: InstructionView.class */
public class InstructionView extends CustomLinearLayout implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A06(InstructionView.class);
    public FbDraweeView A00;
    public FbTextView A01;
    public final Runnable A02;

    public InstructionView(Context context) {
        this(context, null, 0);
    }

    public InstructionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InstructionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = new Iqm(this);
    }

    public /* synthetic */ InstructionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public final void A0E(EnumSet enumSet) {
        11T.A0F(enumSet, 0);
        removeCallbacks(this.A02);
        boolean contains = enumSet.contains(H9Z.A03);
        2OB r0 = this.A01;
        if (contains) {
            if (r0 != null) {
                r0.setVisibility(0);
            }
        } else if (r0 != null) {
            r0.setVisibility(8);
        }
        boolean contains2 = enumSet.contains(H9Z.A02);
        5YB r02 = this.A00;
        if (contains2) {
            if (r02 != null) {
                r02.setVisibility(0);
            }
        } else if (r02 != null) {
            r02.setVisibility(8);
        }
        animate().alpha(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-820299196);
        removeCallbacks(this.A02);
        super.onDetachedFromWindow();
        0FI.A0C(826670034, A06);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(-343571581);
        super.onFinishInflate();
        this.A00 = DKC.A0M(this, 2131362839);
        this.A01 = GOo.A0X(this, 2131362840);
        0FI.A0C(-1380278858, A06);
    }
}
