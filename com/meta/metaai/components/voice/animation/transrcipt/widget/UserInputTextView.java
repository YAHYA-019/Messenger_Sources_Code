package com.meta.metaai.components.voice.animation.transrcipt.widget;

import X.11T;
import X.DKG;
import X.DQw;
import X.Egq;
import X.F6m;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: UserInputTextView.class */
public final class UserInputTextView extends DQw {
    public Egq A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserInputTextView(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInputTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        11T.A0F(context, 1);
    }

    public /* synthetic */ UserInputTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onVisibilityChanged(View view, int i) {
        11T.A0F(view, 0);
        super/*android.widget.TextView*/.onVisibilityChanged(view, i);
        Egq egq = this.A00;
        if (egq != null) {
            F6m f6m = egq.A00;
            if (i == 0) {
                F6m.A00(f6m);
            } else {
                f6m.A04 = false;
                Choreographer.getInstance().removeFrameCallback(f6m.A09);
            }
        }
    }
}
