package com.facebook.widget.checkedimagebutton;

import X.C1oo;
import X.FKb;
import X.JHJ;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.facebook.messaging.rtc.incall.impl.active.drawer.controls.impl.AvatarPrimaryDrawerButton;
import com.facebook.resources.ui.FbImageButton;

/* loaded from: CheckedImageButton.class */
public class CheckedImageButton extends FbImageButton implements Checkable {
    public static final int[] A05 = {R.attr.state_checked};
    public JHJ A00;
    public CharSequence A01;
    public CharSequence A02;
    public boolean A03;
    public boolean A04;

    /* loaded from: CheckedImageButton$SavedState.class */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = FKb.A00(36);
        public boolean A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
        }
    }

    public CheckedImageButton(Context context) {
        super(context);
        this.A04 = false;
        setClickable(true);
        setFocusable(true);
    }

    public CheckedImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = false;
        A00(context, attributeSet);
    }

    public CheckedImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = false;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0L);
            setChecked(obtainStyledAttributes.getBoolean(0, false));
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                this.A01 = context.getText(resourceId);
            }
            if (resourceId2 != 0) {
                this.A02 = context.getText(resourceId2);
            }
            obtainStyledAttributes.recycle();
            setContentDescription(this.A03 ? this.A01 : this.A02);
        }
        setClickable(true);
        setFocusable(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A03;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A05);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.A00);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.facebook.widget.checkedimagebutton.CheckedImageButton$SavedState] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = isChecked();
        return baseSavedState;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!this.A04) {
            toggle();
        }
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (isChecked() != z) {
            this.A03 = z;
            setContentDescription(z ? this.A01 : this.A02);
            refreshDrawableState();
            JHJ jhj = this.A00;
            if (jhj != null) {
                jhj.Bnu(this, this.A03);
            }
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (this instanceof AvatarPrimaryDrawerButton) {
            return;
        }
        setChecked(!this.A03);
    }
}
