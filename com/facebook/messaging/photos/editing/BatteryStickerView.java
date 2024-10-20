package com.facebook.messaging.photos.editing;

import X.1Bi;
import X.C4A7;
import X.DKC;
import X.GOn;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.forker.Process;
import com.mapbox.mapboxsdk.R;

/* loaded from: BatteryStickerView.class */
public class BatteryStickerView extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public LinearGradient A0D;
    public LinearGradient A0E;
    public LinearGradient A0F;
    public Paint A0G;
    public Paint A0H;
    public Path A0I;
    public Path A0J;
    public final C4A7 A0K;
    public static final int[] A0L = {Color.rgb(219, 255, 0), Color.rgb(8, 226, 0)};
    public static final int[] A0N = {Color.rgb(255, Process.SD_STDOUT, 0), Color.rgb(255, 210, 27)};
    public static final int[] A0M = {Color.rgb(255, 65, ActionId.CONTROLLER_INITIATED), Color.rgb(255, 28, 28)};

    public BatteryStickerView(Context context) {
        this(context, null, 0);
    }

    public BatteryStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BatteryStickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0K = (C4A7) 1Bi.A03(32928);
        Paint A0A = DKC.A0A(1);
        this.A0G = A0A;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        A0A.setStyle(style);
        this.A0G.setColor(-1);
        this.A0G.setAlpha(242);
        Resources resources = getResources();
        this.A0B = GOn.A07(resources, 2132279368);
        this.A0C = GOn.A07(resources, 2132279471);
        this.A01 = GOn.A07(resources, 2132279314);
        this.A03 = GOn.A07(resources, 2132279309);
        this.A04 = GOn.A07(resources, R.dimen.mapbox_four_dp);
        this.A02 = GOn.A07(resources, 2132279326);
        this.A05 = GOn.A07(resources, R.dimen.mapbox_eight_dp);
        this.A07 = GOn.A07(resources, 2132279327);
        this.A09 = GOn.A07(resources, R.dimen.mapbox_four_dp);
        this.A06 = GOn.A07(resources, 2132279469);
        this.A0A = GOn.A07(resources, 2132279470);
        this.A08 = GOn.A07(resources, R.dimen.mapbox_four_dp);
        float f = this.A0C - this.A05;
        Path A0B = DKC.A0B();
        int i2 = this.A0C;
        int i3 = this.A01;
        int i4 = i3 * 2;
        float f2 = (i2 - i4) - this.A05;
        float f3 = this.A0B - i4;
        A0B.moveTo(f, i3 + 0.0f);
        float f4 = -this.A01;
        A0B.rQuadTo(0.0f, f4, f4, f4);
        A0B.rLineTo(-f2, 0.0f);
        int i5 = this.A01;
        float f5 = -i5;
        A0B.rQuadTo(f5, 0.0f, f5, i5);
        A0B.rLineTo(0.0f, f3);
        float f6 = this.A01;
        A0B.rQuadTo(0.0f, f6, f6, f6);
        A0B.rLineTo(f2, 0.0f);
        float f7 = this.A01;
        A0B.rQuadTo(f7, 0.0f, f7, -r0);
        int i6 = this.A02;
        float f8 = (f3 - i6) / 2.0f;
        int i7 = this.A05;
        int i8 = this.A03;
        int i9 = i7 - i8;
        int i10 = this.A04;
        float f9 = i9 - i10;
        float f10 = (i6 - (i10 * 2)) - (i8 * 2);
        float f11 = -f8;
        A0B.rLineTo(0.0f, f11);
        int i11 = this.A03;
        float f12 = -i11;
        A0B.rQuadTo(0.0f, f12, i11, f12);
        A0B.rLineTo(f9, 0.0f);
        float f13 = this.A04;
        A0B.rQuadTo(f13, 0.0f, f13, -r0);
        A0B.rLineTo(0.0f, -f10);
        float f14 = -this.A04;
        A0B.rQuadTo(0.0f, f14, f14, f14);
        A0B.rLineTo(-f9, 0.0f);
        float f15 = -this.A03;
        A0B.rQuadTo(f15, 0.0f, f15, f15);
        A0B.rLineTo(0.0f, f11);
        this.A0I = A0B;
        int i12 = this.A06;
        float f16 = i12 / 2;
        float f17 = this.A0A;
        float f18 = i12;
        int[] iArr = A0L;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A0D = new LinearGradient(0.0f, f16, f17, f18, iArr, (float[]) null, tileMode);
        this.A0F = new LinearGradient(0.0f, r0 / 2, this.A0A, this.A06, A0N, (float[]) null, tileMode);
        this.A0E = new LinearGradient(0.0f, r0 / 2, this.A0A, this.A06, A0M, (float[]) null, tileMode);
        Paint A0A2 = DKC.A0A(1);
        this.A0H = A0A2;
        A0A2.setStyle(style);
        this.A0H.setAlpha(242);
        this.A00 = this.A0K.A01();
        A00(this);
    }

    public static void A00(BatteryStickerView batteryStickerView) {
        int i;
        int i2;
        float f = batteryStickerView.A00;
        if (f < 0.1f) {
            batteryStickerView.A00 = 0.1f;
            f = 0.1f;
        } else if (f > 0.5f) {
            batteryStickerView.A0H.setShader(batteryStickerView.A0D);
            i = batteryStickerView.A07;
            i2 = i;
            int i3 = (int) (batteryStickerView.A0A * batteryStickerView.A00);
            int i4 = batteryStickerView.A08;
            float f2 = i4;
            float f3 = i4 + i3;
            int i5 = batteryStickerView.A06;
            float f4 = i;
            float f5 = i2;
            Path A0B = DKC.A0B();
            float f6 = (i3 - f4) - f5;
            float f7 = i5 - (2.0f * f4);
            A0B.moveTo(f3, f2 + f5);
            float f8 = -f5;
            A0B.rQuadTo(0.0f, f8, f8, f8);
            A0B.rLineTo(-f6, 0.0f);
            float f9 = -f4;
            A0B.rQuadTo(f9, 0.0f, f9, f4);
            A0B.rLineTo(0.0f, f7);
            A0B.rQuadTo(0.0f, f4, f4, f4);
            A0B.rLineTo(f6, 0.0f);
            A0B.rQuadTo(f5, 0.0f, f5, f8);
            A0B.close();
            batteryStickerView.A0J = A0B;
        }
        batteryStickerView.A0H.setShader(f > 0.2f ? batteryStickerView.A0F : batteryStickerView.A0E);
        i = batteryStickerView.A07;
        i2 = batteryStickerView.A09;
        int i32 = (int) (batteryStickerView.A0A * batteryStickerView.A00);
        int i42 = batteryStickerView.A08;
        float f22 = i42;
        float f32 = i42 + i32;
        int i52 = batteryStickerView.A06;
        float f42 = i;
        float f52 = i2;
        Path A0B2 = DKC.A0B();
        float f62 = (i32 - f42) - f52;
        float f72 = i52 - (2.0f * f42);
        A0B2.moveTo(f32, f22 + f52);
        float f82 = -f52;
        A0B2.rQuadTo(0.0f, f82, f82, f82);
        A0B2.rLineTo(-f62, 0.0f);
        float f92 = -f42;
        A0B2.rQuadTo(f92, 0.0f, f92, f42);
        A0B2.rLineTo(0.0f, f72);
        A0B2.rQuadTo(0.0f, f42, f42, f42);
        A0B2.rLineTo(f62, 0.0f);
        A0B2.rQuadTo(f52, 0.0f, f52, f82);
        A0B2.close();
        batteryStickerView.A0J = A0B2;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.A0I, this.A0G);
        canvas.drawPath(this.A0J, this.A0H);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.A0C, this.A0B);
    }
}
