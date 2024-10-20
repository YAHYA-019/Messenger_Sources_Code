package com.facebook.messaging.caa.common.ui;

import X.11T;
import X.AnonymousClass001;
import X.EWQ;
import X.GYR;
import android.content.Context;
import android.graphics.Color;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: MaaMessengerBrandingBackgroundDrawable.class */
public final class MaaMessengerBrandingBackgroundDrawable extends GYR {
    public static final String COLOR_1 = "#0099FF";
    public static final String COLOR_2 = "#A033FF";
    public static final String COLOR_3 = "#FF5280";
    public static final String COLOR_4 = "#FF7061";
    public static final EWQ Companion = new Object();
    public static final float POSITION_1 = 0.0f;
    public static final float POSITION_2 = 0.6f;
    public static final float POSITION_3 = 0.9f;
    public static final float POSITION_4 = 1.0f;
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaaMessengerBrandingBackgroundDrawable(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.context = context;
    }

    public Drawable getBrandingDrawable() {
        int A03 = AnonymousClass001.A03(getDisplayMetrics().first);
        float A032 = AnonymousClass001.A03(r0.second) * 0.35f;
        RadialGradient radialGradient = new RadialGradient(0.0f, A032, (float) Math.hypot(A03, A032), new int[]{Color.parseColor(COLOR_1), Color.parseColor(COLOR_2), Color.parseColor(COLOR_3), Color.parseColor(COLOR_4)}, new float[]{0.0f, 0.6f, 0.9f, 1.0f}, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(radialGradient);
        return shapeDrawable;
    }

    public Drawable getIconDrawable() {
        return this.context.getDrawable(2132346579);
    }
}
