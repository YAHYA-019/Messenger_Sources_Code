package com.facebook.threadview;

import X.0S2;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.2OB;
import X.2Wo;
import X.66J;
import X.C00i;
import X.C09s;
import X.C1u2;
import X.C1u3;
import X.C1u4;
import X.C2rp;
import X.C6e4;
import X.IlP;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.FacebookProgressCircleView;

/* loaded from: ThreadViewVideoStateButton.class */
public class ThreadViewVideoStateButton extends CustomFrameLayout {
    public long A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public FbTextView A04;
    public FacebookProgressCircleView A05;
    public 2Wo A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public final 66J A0A;
    public final MigColorScheme A0B;

    public ThreadViewVideoStateButton(Context context) {
        super(context);
        this.A0B = LightColorScheme.A00();
        this.A0A = (66J) 1Bi.A03(66899);
        A00();
    }

    public ThreadViewVideoStateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = LightColorScheme.A00();
        this.A0A = (66J) 1Bi.A03(66899);
        A00();
    }

    public ThreadViewVideoStateButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0B = LightColorScheme.A00();
        this.A0A = (66J) 1Bi.A03(66899);
        A00();
    }

    private void A00() {
        this.A08 = new 1BQ(16839);
        this.A07 = new 1BQ(67074);
        this.A09 = new 1BV(67037);
        A0U(2132542978);
        this.A05 = (FacebookProgressCircleView) C09s.A01(this, 2131366168);
        this.A03 = (ImageView) C09s.A01(this, 2131366169);
        ImageView imageView = (ImageView) C09s.A01(this, 2131366170);
        this.A02 = imageView;
        C2rp.A02(imageView, 0S2.A01);
        2Wo A00 = 2Wo.A00((ViewStub) C09s.A01(this, 2131363531));
        this.A06 = A00;
        A00.A02 = new IlP(this, 2);
        C00i c00i = this.A09;
        c00i.getClass();
        C6e4 c6e4 = (C6e4) c00i.get();
        if (c6e4.A01() == 0 || c6e4.A00() == 0) {
            C00i c00i2 = this.A07;
            c00i2.getClass();
            c00i2.get();
            return;
        }
        C00i c00i3 = this.A07;
        c00i3.getClass();
        c00i3.get();
        ViewGroup.LayoutParams layoutParams = this.A02.getLayoutParams();
        Resources resources = getResources();
        layoutParams.width = (int) resources.getDimension(2132279303);
        layoutParams.height = (int) resources.getDimension(2132279303);
        ViewGroup.LayoutParams layoutParams2 = this.A05.getLayoutParams();
        layoutParams2.width = (int) resources.getDimension(2132279303);
        layoutParams2.height = (int) resources.getDimension(2132279303);
        this.A05.setSize((int) resources.getDimension(2132279303));
    }

    public static void A01(ThreadViewVideoStateButton threadViewVideoStateButton, int i) {
        threadViewVideoStateButton.A02.setVisibility(0);
        threadViewVideoStateButton.A03.setVisibility(0);
        threadViewVideoStateButton.A06.A02();
        View view = threadViewVideoStateButton.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        threadViewVideoStateButton.A02.setContentDescription(threadViewVideoStateButton.getResources().getString(i));
    }

    public void A0V() {
        String str;
        this.A05.setProgress(0L);
        this.A03.setVisibility(8);
        this.A02.setVisibility(8);
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        this.A06.A03();
        2OB r0 = this.A04;
        if (r0 != null) {
            66J r02 = this.A0A;
            Context context = getContext();
            long j = this.A00;
            11T.A0F(context, 0);
            if (j != 0) {
                str = r02.A00.A01((int) j);
                11T.A0A(str);
            } else {
                str = "";
            }
            String A0v = 1BK.A0v(context, str, 2131955452);
            11T.A0A(A0v);
            int length = A0v.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                int A00 = 11T.A00(A0v.charAt(i2), 32);
                boolean z2 = false;
                if (A00 <= 0) {
                    z2 = true;
                }
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            r0.setText(A0v.subSequence(i, length + 1).toString());
        }
        this.A02.setContentDescription(getResources().getString(2131967871));
    }

    public void A0W() {
        this.A05.setProgress(100);
        C00i c00i = this.A08;
        c00i.getClass();
        this.A03.setImageDrawable(((C1u2) c00i.get()).A09(C1u3.A51, C1u4.SIZE_32, -1));
        A01(this, 2131967881);
    }
}
