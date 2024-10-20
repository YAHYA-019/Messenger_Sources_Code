package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

/* loaded from: JZb.class */
public final class JZb extends Spinner {
    public static final int[] A08 = {R.attr.spinnerMode};
    public int A00;
    public SpinnerAdapter A01;
    public MLA A02;
    public LKe A03;
    public final Context A04;
    public final Rect A05;
    public final C53h A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (r313 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JZb(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZb.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public int A00(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int A0C = JQx.A0C(max, 15 - (min - max), 0); A0C < min; A0C++) {
            int itemViewType = spinnerAdapter.getItemViewType(A0C);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(A0C, view, this);
            if (view.getLayoutParams() == null) {
                AbH.A1J(view, -2);
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.A05;
            drawable.getPadding(rect);
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C53h c53h = this.A06;
        if (c53h != null) {
            c53h.A00();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        MLA mla = this.A02;
        return mla != null ? mla.ApQ() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        MLA mla = this.A02;
        return mla != null ? mla.BJD() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.A02 != null ? this.A00 : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        MLA mla = this.A02;
        return mla != null ? mla.AYU() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.A04;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        MLA mla = this.A02;
        return mla != null ? mla.ApL() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-876323291);
        super.onDetachedFromWindow();
        MLA mla = this.A02;
        if (mla != null && mla.BW7()) {
            mla.dismiss();
        }
        0FI.A0C(152169190, A06);
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 == null || View.MeasureSpec.getMode(i) != ((-1) << (-1))) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getBackground(), getAdapter())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.A00 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new LKj(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r0.BW7() == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.appcompat.widget.AppCompatSpinner$SavedState] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r301 = this;
            r0 = r301
            android.os.Parcelable r0 = super.onSaveInstanceState()
            r302 = r0
            androidx.appcompat.widget.AppCompatSpinner$SavedState r0 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            r303 = r0
            r0 = r303
            r1 = r302
            r0.<init>(r1)
            r0 = r301
            X.MLA r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L25
            r0 = r302
            boolean r0 = r0.BW7()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L2a
        L25:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L2a:
            r0 = r303
            r1 = r305
            r0.A00 = r1
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZb.onSaveInstanceState():android.os.Parcelable");
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A05 = 0FI.A05(-455843648);
        LKe lKe = this.A03;
        if (lKe == null || !lKe.onTouch(this, motionEvent)) {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -93545254;
        } else {
            onTouchEvent = true;
            i = 1183333584;
        }
        0FI.A0B(i, A05);
        return onTouchEvent;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        MLA mla = this.A02;
        if (mla == null) {
            return super.performClick();
        }
        if (mla.BW7()) {
            return true;
        }
        mla.CzJ(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.widget.ListAdapter, java.lang.Object, X.LLJ] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        MLA mla = this.A02;
        if (mla != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            ((LLJ) obj).A01 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                ((LLJ) obj).A00 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!0Ig.A00(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            mla.Cla((ListAdapter) obj);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C53h c53h = this.A06;
        if (c53h != null) {
            c53h.A01();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C53h c53h = this.A06;
        if (c53h != null) {
            c53h.A02(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        MLA mla = this.A02;
        if (mla == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            mla.CpX(i);
            mla.CpW(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        MLA mla = this.A02;
        if (mla != null) {
            mla.Cw3(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.A02 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        MLA mla = this.A02;
        if (mla != null) {
            mla.CmB(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C53a.A00(this.A04, i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        MLA mla = this.A02;
        if (mla != null) {
            mla.CtU(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }
}
