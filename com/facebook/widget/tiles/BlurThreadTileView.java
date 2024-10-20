package com.facebook.widget.tiles;

import X.0FI;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1ED;
import X.1Kd;
import X.2DX;
import X.2EU;
import X.5YD;
import X.AbH;
import X.C1oo;
import X.DKD;
import X.GOp;
import X.HYv;
import X.Ini;
import X.J5U;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: BlurThreadTileView.class */
public class BlurThreadTileView extends CustomFrameLayout {
    public int A00;
    public int A01;
    public View A02;
    public ImageView A03;
    public 2EU A04;
    public 2DX A05;
    public 5YD A06;
    public 1ED A07;
    public boolean A08;
    public boolean A09;
    public int A0A;
    public 1ED A0B;
    public final HYv A0C;

    public BlurThreadTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A09 = true;
        this.A0C = new HYv(this);
        A00(attributeSet, 0);
    }

    public BlurThreadTileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = true;
        this.A0C = new HYv(this);
        A00(attributeSet, i);
    }

    private void A00(AttributeSet attributeSet, int i) {
        Context context = getContext();
        this.A06 = (5YD) 1Bn.A0E(context, (1BY) null, 49774);
        this.A05 = GOp.A0H();
        this.A07 = (1ED) 1Bi.A03(16469);
        this.A0B = (1ED) 1Bi.A03(16470);
        LayoutInflater.from(context).inflate(2132541573, this);
        this.A03 = (ImageView) requireViewById(2131364565);
        this.A02 = findViewById(2131368066);
        this.A03.setScaleType(ImageView.ScaleType.CENTER_CROP);
        5YD r0 = this.A06;
        r0.getClass();
        r0.A08(context, attributeSet, i);
        5YD r02 = this.A06;
        r02.getClass();
        DisplayMetrics A08 = DKD.A08();
        r02.A07(Math.max(A08.heightPixels, A08.widthPixels));
        5YD r03 = this.A06;
        r03.getClass();
        r03.A06.setCallback(this);
        5YD r04 = this.A06;
        r04.getClass();
        r04.A07 = this.A0C;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0F);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        if (this.A08 != z) {
            this.A08 = z;
            if (this.A03.getDrawable() != null) {
                if (this.A08) {
                    A01(this);
                } else {
                    ImageView imageView = this.A03;
                    5YD r05 = this.A06;
                    r05.getClass();
                    imageView.setImageDrawable(r05.A06);
                }
            }
        }
        this.A00 = obtainStyledAttributes.getInteger(2, 20);
        this.A01 = obtainStyledAttributes.getInteger(1, 4);
        A0V(obtainStyledAttributes.getColor(3, 0));
        obtainStyledAttributes.recycle();
    }

    public static void A01(BlurThreadTileView blurThreadTileView) {
        blurThreadTileView.A03.setImageDrawable(null);
        5YD r0 = blurThreadTileView.A06;
        r0.getClass();
        if (r0.A06 != null) {
            1ED r02 = blurThreadTileView.A07;
            r02.getClass();
            ListenableFuture D3C = r02.D3C(new J5U(blurThreadTileView, 40));
            if (D3C != null) {
                Ini A01 = Ini.A01(blurThreadTileView, 55);
                1ED r03 = blurThreadTileView.A0B;
                r03.getClass();
                1Kd.A0F(A01, D3C, r03);
            }
        }
    }

    public void A0V(int i) {
        if (this.A0A != i) {
            this.A0A = i;
            AbH.A1K(this.A02, i);
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1309067427);
        super.onAttachedToWindow();
        5YD r0 = this.A06;
        r0.getClass();
        if (r0.A0D) {
            r0.A0D = false;
            r0.A0I.A00();
            5YD.A03(r0);
        }
        0FI.A0C(1411894273, A06);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(1995651356);
        this.A03.setImageDrawable(null);
        2EU.A04(this.A04);
        5YD r0 = this.A06;
        r0.getClass();
        r0.A06();
        super.onDetachedFromWindow();
        0FI.A0C(2106697944, A06);
    }
}
