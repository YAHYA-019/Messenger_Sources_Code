package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* loaded from: Hrs.class */
public final class Hrs {
    public boolean A00;
    public C2608Gix A01;
    public final View A02;

    public Hrs(View view) {
        this.A02 = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A00() {
        int i;
        View view;
        int i2;
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        RelativeLayout.LayoutParams layoutParams3;
        if (this.A01 != null) {
            view = this.A02;
            int A0A = GOq.A0A(view);
            C2608Gix c2608Gix = this.A01;
            int i3 = c2608Gix.A02;
            if (A0A == i3) {
                this.A00 = true;
                i = (int) c2608Gix.A00;
                boolean z = view.getLayoutParams() instanceof FrameLayout.LayoutParams;
                if (i3 == 1) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (z) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                        layoutParams5.gravity = 49;
                        ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = i;
                        layoutParams3 = layoutParams5;
                        view.setLayoutParams(layoutParams3);
                    }
                    if (!(layoutParams4 instanceof RelativeLayout.LayoutParams)) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = i;
                    i2 = 10;
                    layoutParams2 = layoutParams6;
                } else {
                    ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
                    if (z) {
                        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                        layoutParams8.gravity = 19;
                        layoutParams = layoutParams8;
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
                        layoutParams3 = layoutParams;
                        view.setLayoutParams(layoutParams3);
                    }
                    if (!(layoutParams7 instanceof RelativeLayout.LayoutParams)) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams9).leftMargin = i;
                    i2 = 9;
                    layoutParams2 = layoutParams9;
                }
                layoutParams2.addRule(15, 0);
                layoutParams2.addRule(10, 0);
                layoutParams2.addRule(9, 0);
                layoutParams2.addRule(i2);
                layoutParams3 = layoutParams2;
                view.setLayoutParams(layoutParams3);
            }
        }
        if (this.A00) {
            i = 0;
            this.A00 = false;
            view = this.A02;
            boolean z2 = view.getLayoutParams() instanceof FrameLayout.LayoutParams;
            ViewGroup.LayoutParams layoutParams10 = view.getLayoutParams();
            if (z2) {
                FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) layoutParams10;
                this.A00 = false;
                layoutParams11.gravity = 17;
                ((ViewGroup.MarginLayoutParams) layoutParams11).topMargin = 0;
                layoutParams = layoutParams11;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
                layoutParams3 = layoutParams;
                view.setLayoutParams(layoutParams3);
            }
            if (layoutParams10 instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams12).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams12).leftMargin = 0;
                i2 = 15;
                layoutParams2 = layoutParams12;
                layoutParams2.addRule(15, 0);
                layoutParams2.addRule(10, 0);
                layoutParams2.addRule(9, 0);
                layoutParams2.addRule(i2);
                layoutParams3 = layoutParams2;
                view.setLayoutParams(layoutParams3);
            }
        }
    }

    public void A01(C2608Gix c2608Gix) {
        if (2Go.A00(this.A01, c2608Gix)) {
            return;
        }
        this.A01 = c2608Gix;
        A00();
    }
}
