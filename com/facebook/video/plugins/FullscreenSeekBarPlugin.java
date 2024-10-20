package com.facebook.video.plugins;

import X.11T;
import X.DKF;
import X.DKG;
import X.H3O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewStub;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: FullscreenSeekBarPlugin.class */
public class FullscreenSeekBarPlugin extends H3O {
    public ViewGroup A00;
    public ViewStub A01;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullscreenSeekBarPlugin(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FullscreenSeekBarPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FullscreenSeekBarPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        ViewGroup viewGroup = (ViewGroup) findViewById(2131363324);
        ViewStub viewStub = (ViewStub) findViewById(2131364268);
        if (viewGroup == null || viewStub == null) {
            viewStub = null;
            this.A00 = null;
        } else {
            this.A00 = viewGroup;
        }
        this.A01 = viewStub;
    }

    public /* synthetic */ FullscreenSeekBarPlugin(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public String A0H() {
        return "FullscreenSeekBarPlugin";
    }
}
