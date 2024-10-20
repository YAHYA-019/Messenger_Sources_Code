package com.google.android.material.internal;

import X.C0Ad;
import X.C2957Jek;
import X.DQB;
import X.LGb;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.customview.view.AbsSavedState;

/* loaded from: CheckableImageButton.class */
public class CheckableImageButton extends DQB implements Checkable {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public boolean A02;

    /* loaded from: CheckableImageButton$SavedState.class */
    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new LGb(4);
        public boolean A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970619);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = true;
        this.A01 = true;
        C0Ad.A0B(this, new C2957Jek(this, 4));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] onCreateDrawableState(int i) {
        if (!this.A02) {
            return super/*android.widget.ImageView*/.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super/*android.widget.ImageView*/.onCreateDrawableState(i + 1), A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        setChecked(savedState.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, com.google.android.material.internal.CheckableImageButton$SavedState] */
    public Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super/*android.view.View*/.onSaveInstanceState());
        absSavedState.A00 = this.A02;
        return absSavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.A00 || this.A02 == z) {
            return;
        }
        this.A02 = z;
        refreshDrawableState();
        sendAccessibilityEvent(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        if (this.A01) {
            super/*android.view.View*/.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.A02);
    }
}
