package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.endtoend.EndToEnd;
import com.facebook.fbui.widget.layout.ImageBlockLayout;
import com.facebook.resources.ui.FbTextView;

/* renamed from: X.Deq, reason: case insensitive filesystem */
/* loaded from: Deq.class */
public final class C2137Deq extends FIU {
    public static final View.OnTouchListener A0D = FYA.A00;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Handler A04;
    public View A05;
    public ImageView A06;
    public ImageView A07;
    public ImageBlockLayout A08;
    public FbTextView A09;
    public FbTextView A0A;
    public boolean A0B;
    public final C01i A0C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2137Deq(android.content.Context r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2137Deq.<init>(android.content.Context, int, int):void");
    }

    public static final ImageBlockLayout A00(C2137Deq c2137Deq) {
        ImageBlockLayout imageBlockLayout = c2137Deq.A08;
        if (imageBlockLayout != null) {
            return imageBlockLayout;
        }
        11T.A0L("container");
        throw 0Q8.createAndThrow();
    }

    public void A06() {
        super.A06();
        if (this.A0B) {
            Handler handler = this.A04;
            if (handler == null) {
                11T.A0L("handler");
                throw 0Q8.createAndThrow();
            }
            handler.removeCallbacks((Runnable) this.A0C.getValue());
            this.A0B = false;
        }
    }

    public void A07() {
        if (((FIU) this).A0X || !EndToEnd.isRunningEndToEndTest()) {
            super.A07();
            if (((FIU) this).A0Z) {
                return;
            }
            if (this.A0B) {
                Handler handler = this.A04;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) this.A0C.getValue());
                }
                11T.A0L("handler");
                throw 0Q8.createAndThrow();
            }
            if (this.A03 > 0) {
                Handler handler2 = this.A04;
                if (handler2 != null) {
                    handler2.postDelayed((Runnable) this.A0C.getValue(), this.A03);
                    this.A0B = true;
                    return;
                }
                11T.A0L("handler");
                throw 0Q8.createAndThrow();
            }
        }
    }

    public void A0H(Integer num) {
        11T.A0F(num, 0);
        if (num == 0S2.A0C) {
            throw AnonymousClass001.A0N("Tooltips should be anchored to a view.");
        }
        super.A0H(num);
    }

    public final View A0K(int i) {
        View view = this.A05;
        if (view != null) {
            return view.findViewById(i);
        }
        11T.A0L("layoutView");
        throw 0Q8.createAndThrow();
    }

    public final void A0L() {
        2OB r0 = this.A0A;
        String str = "title";
        if (r0 != null) {
            ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
            11T.A0I(layoutParams, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
            ViewGroup.LayoutParams layoutParams2 = (DP9) layoutParams;
            if (((DP9) layoutParams2).A00 != 1) {
                ((DP9) layoutParams2).A00 = 1;
                r0.setLayoutParams(layoutParams2);
            }
            if (r0.getGravity() != 1) {
                r0.setGravity(1);
            }
            2OB r02 = this.A09;
            str = "description";
            if (r02 != null) {
                ViewGroup.LayoutParams layoutParams3 = (DP9) DKC.A0H(r02, "null cannot be cast to non-null type com.facebook.fbui.widget.layout.ImageBlockLayout.LayoutParams");
                if (((DP9) layoutParams3).A00 != 1) {
                    ((DP9) layoutParams3).A00 = 1;
                    r02.setLayoutParams(layoutParams3);
                }
                if (r02.getGravity() != 1) {
                    r02.setGravity(1);
                    return;
                }
                return;
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void A0M(float f) {
        2OB r0 = this.A09;
        if (r0 == null) {
            11T.A0L("description");
            throw 0Q8.createAndThrow();
        }
        r0.setTextSize(2, f);
    }

    public final void A0N(int i) {
        2OB r0 = this.A09;
        if (r0 == null) {
            11T.A0L("description");
            throw 0Q8.createAndThrow();
        }
        r0.setText(i);
        r0.setVisibility(0);
    }

    public final void A0O(int i) {
        2OB r0 = this.A0A;
        if (r0 == null) {
            11T.A0L("title");
            throw 0Q8.createAndThrow();
        }
        r0.setText(i);
        r0.setVisibility(0);
    }

    public final void A0P(int i, float f) {
        2OB r0 = this.A0A;
        if (r0 == null) {
            11T.A0L("title");
            throw 0Q8.createAndThrow();
        }
        r0.setTextSize(i, f);
    }

    public final void A0Q(Drawable drawable) {
        int paddingLeft = A00(this).getPaddingLeft();
        int paddingTop = A00(this).getPaddingTop();
        int paddingRight = A00(this).getPaddingRight();
        int paddingBottom = A00(this).getPaddingBottom();
        A00(this).setBackgroundDrawable(drawable);
        A00(this).setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public final void A0R(Drawable drawable) {
        ImageView imageView = this.A06;
        if (imageView == null) {
            11T.A0L("nubAbove");
            throw 0Q8.createAndThrow();
        }
        imageView.setImageDrawable(drawable);
    }

    public final void A0S(Drawable drawable) {
        ImageView imageView = this.A07;
        if (imageView == null) {
            11T.A0L("nubBelow");
            throw 0Q8.createAndThrow();
        }
        imageView.setImageDrawable(drawable);
    }

    public void A0T(GEd gEd) {
        ((FIU) this).A0J.setOnClickListener(new FXs(gEd, this, 10));
    }

    public final void A0U(CharSequence charSequence) {
        2OB r0 = this.A09;
        if (r0 == null) {
            11T.A0L("description");
            throw 0Q8.createAndThrow();
        }
        r0.setText(charSequence);
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        r0.setVisibility(i);
    }

    public final void A0V(Integer num) {
        2OB r0 = this.A0A;
        if (r0 == null) {
            11T.A0L("title");
            throw 0Q8.createAndThrow();
        }
        C2rp.A02(r0, num);
    }
}
