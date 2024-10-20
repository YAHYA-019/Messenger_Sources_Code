package com.facebook.widget.loadingindicator;

import X.0S2;
import X.1BK;
import X.1Bi;
import X.3yG;
import X.AnonymousClass001;
import X.C00j;
import X.C0dr;
import X.C1oo;
import X.C3063Jhx;
import X.DKD;
import X.DKF;
import X.GDV;
import X.RNM;
import X.SCU;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.widget.CustomFrameLayout;
import com.google.common.base.Preconditions;

/* loaded from: LoadingIndicatorView.class */
public class LoadingIndicatorView extends CustomFrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public C0dr A09;
    public RNM A0A;
    public Integer A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public long A0F;
    public final Handler A0G;

    public LoadingIndicatorView(Context context) {
        this(context, null);
    }

    public LoadingIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0G = AnonymousClass001.A07();
        this.A09 = (C0dr) 1Bi.A03(84488);
        C00j.A05("LoadingIndicatorView.createContentView", 1994233085);
        try {
            Context context2 = getContext();
            this.A08 = new ProgressBar(new ContextThemeWrapper(context2, 2132608793));
            int A01 = 3yG.A01(20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(A01, A01, 17);
            int A012 = 3yG.A01(8.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = A012;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = A012;
            addView(this.A08, layoutParams);
            C00j.A01(-1819978332);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1s, i, 0);
            int i2 = obtainStyledAttributes.getInt(8, 17);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.A08.getLayoutParams();
            layoutParams2.gravity = i2;
            this.A08.setLayoutParams(layoutParams2);
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                View view = this.A07;
                if (view != null) {
                    removeView(view);
                }
                View A0B = DKF.A0B(DKD.A0A(this), resourceId);
                this.A07 = A0B;
                addView(A0B);
                A01(this, this.A0C, true);
            }
            this.A0B = obtainStyledAttributes.getInteger(1, 0) == 0 ? 0S2.A01 : 0S2.A00;
            int integer = obtainStyledAttributes.getInteger(6, 0);
            this.A03 = integer;
            this.A02 = integer == 0 ? 2132345567 : 2132345568;
            this.A0E = getResources().getString(2131957342);
            this.A04 = obtainStyledAttributes.getLayoutDimension(7, -2);
            this.A01 = obtainStyledAttributes.getLayoutDimension(5, -2);
            this.A06 = obtainStyledAttributes.getLayoutDimension(3, 0);
            this.A05 = obtainStyledAttributes.getLayoutDimension(2, 0);
            TypedValue typedValue = new TypedValue();
            context2.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
            this.A00 = obtainStyledAttributes.getColor(4, typedValue.data);
            obtainStyledAttributes.recycle();
            A01(this, 0S2.A0C, false);
        } catch (Throwable th) {
            C00j.A01(-1667115487);
            throw th;
        }
    }

    public static void A00(GDV gdv, LoadingIndicatorView loadingIndicatorView) {
        long j = 0;
        if (loadingIndicatorView.A0F > 0) {
            long now = loadingIndicatorView.A09.now() - loadingIndicatorView.A0F;
            long j2 = now < 500 ? 500 - now : 0L;
            loadingIndicatorView.A0F = 0L;
            j = j2;
        }
        A01(loadingIndicatorView, 0S2.A00, false);
        loadingIndicatorView.A0G.postDelayed(new SCU(gdv, loadingIndicatorView), j);
    }

    public static void A01(LoadingIndicatorView loadingIndicatorView, Integer num, boolean z) {
        int i;
        int i2;
        int visibility;
        if (num != null) {
            if (z || loadingIndicatorView.A0C != num) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    i = 0;
                    i2 = 4;
                    RNM rnm = loadingIndicatorView.A0A;
                    visibility = rnm != null ? rnm.A00.getVisibility() : 8;
                    if (loadingIndicatorView.A0C == 0S2.A01) {
                        visibility = 4;
                    }
                } else if (intValue == 1) {
                    Preconditions.checkNotNull(loadingIndicatorView.A0A, "notifyLoadingFailed() should be called before updating the state to ERROR");
                    i = 4;
                    i2 = 4;
                    visibility = 0;
                } else {
                    if (intValue != 2) {
                        throw 1BK.A0i("Incorrect loading state is given: ", "LOADING");
                    }
                    View view = loadingIndicatorView.A07;
                    if (view instanceof ViewStub) {
                        loadingIndicatorView.A07 = ((ViewStub) view).inflate();
                    }
                    i = 8;
                    i2 = 0;
                    visibility = 8;
                }
                loadingIndicatorView.A08.setVisibility(i);
                View view2 = loadingIndicatorView.A07;
                if (view2 != null && !(view2 instanceof ViewStub)) {
                    view2.setVisibility(i2);
                }
                RNM rnm2 = loadingIndicatorView.A0A;
                if (rnm2 != null) {
                    rnm2.A00.setVisibility(visibility);
                }
                loadingIndicatorView.A0C = num;
            }
        }
    }

    public void A0V() {
        A01(this, 0S2.A00, false);
        this.A0F = this.A09.now();
        if (getLayoutParams() instanceof C3063Jhx) {
            ((C3063Jhx) getLayoutParams()).A01 = true;
        }
    }

    public void A0W(GDV gdv, LoadingIndicatorState loadingIndicatorState) {
        String str = loadingIndicatorState.A02;
        if (str == null) {
            str = getResources().getString(2131957317);
        }
        this.A0D = str;
        String str2 = loadingIndicatorState.A03;
        if (str2 == null) {
            str2 = getResources().getString(2131957342);
        }
        this.A0E = str2;
        int i = loadingIndicatorState.A00;
        if (i == 0) {
            i = 2132345568;
            if (this.A03 == 0) {
                i = 2132345567;
            }
        }
        this.A02 = i;
        A00(gdv, this);
    }
}
