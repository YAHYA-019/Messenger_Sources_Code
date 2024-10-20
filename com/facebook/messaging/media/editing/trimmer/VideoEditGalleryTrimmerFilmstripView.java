package com.facebook.messaging.media.editing.trimmer;

import X.C09s;
import X.C2rp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: VideoEditGalleryTrimmerFilmstripView.class */
public class VideoEditGalleryTrimmerFilmstripView extends CustomFrameLayout {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public DraweeStripView A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public View A0A;
    public View A0B;

    public VideoEditGalleryTrimmerFilmstripView(Context context) {
        super(context);
        A00(context);
    }

    public VideoEditGalleryTrimmerFilmstripView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public VideoEditGalleryTrimmerFilmstripView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        A0U(2132542615);
        this.A05 = (DraweeStripView) C09s.A01(this, 2131364234);
        this.A04 = C09s.A01(this, 2131364112);
        this.A03 = C09s.A01(this, 2131364114);
        this.A0A = C09s.A01(this, 2131364113);
        this.A0B = C09s.A01(this, 2131364115);
        this.A01 = C09s.A01(this, 2131364111);
        this.A02 = C09s.A01(this, 2131364116);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279298);
        this.A00 = dimensionPixelSize;
        this.A07 = dimensionPixelSize * 2;
        this.A09 = -1;
        this.A06 = -1;
        this.A08 = -1;
        C2rp.A01(this.A04);
        C2rp.A01(this.A03);
    }

    public void A0V(int i) {
        this.A06 = i;
        View view = this.A03;
        view.offsetLeftAndRight(i - (view.getLeft() + this.A00));
        this.A0B.setLeft(this.A03.getRight() - (this.A03.getWidth() / 2));
        this.A01.setRight(this.A03.getRight() - this.A00);
        this.A0B.setRight(this.A05.getWidth() - this.A07);
    }

    public void A0W(int i) {
        this.A08 = i;
        this.A02.setVisibility(0);
        View view = this.A02;
        view.offsetLeftAndRight(this.A08 - (view != null ? view.getLeft() + (this.A02.getWidth() / 2) : 0));
    }

    public void A0X(int i) {
        this.A09 = i;
        View view = this.A04;
        view.offsetLeftAndRight(i - (view.getRight() - this.A00));
        this.A0A.setRight(this.A04.getLeft() + (this.A04.getWidth() / 2));
        this.A01.setLeft(this.A04.getLeft() + this.A00);
        this.A0A.setLeft(this.A07);
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.A09;
        if (i5 != -1) {
            A0X(i5);
        }
        int i6 = this.A06;
        if (i6 != -1) {
            A0V(i6);
        }
        int i7 = this.A08;
        if (i7 != -1) {
            A0W(i7);
        }
    }
}
