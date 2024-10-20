package com.google.android.material.timepicker;

import X.0FI;
import X.5XE;
import X.DOY;
import X.Kg1;
import X.LKO;
import X.LKZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.acra.constants.ActionId;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: TimePickerView.class */
public class TimePickerView extends ConstraintLayout {
    public final View.OnClickListener A00;
    public final Chip A01;
    public final Chip A02;
    public final MaterialButtonToggleGroup A03;
    public final ClockFaceView A04;
    public final ClockHandView A05;

    public TimePickerView(Context context) {
        this(context, null);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = LKO.A00(this, ActionId.MISSED_EVENT);
        LayoutInflater.from(context).inflate(2131558409, this);
        this.A04 = (ClockFaceView) findViewById(2131365465);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(2131365469);
        this.A03 = materialButtonToggleGroup;
        materialButtonToggleGroup.A08.add(new Kg1(this));
        this.A02 = (Chip) findViewById(2131365472);
        this.A01 = (Chip) findViewById(2131365470);
        this.A05 = (ClockHandView) findViewById(2131365466);
        View.OnTouchListener lkz = new LKZ(new GestureDetector(getContext(), (GestureDetector.OnGestureListener) new DOY(this, 1)), this, 1);
        this.A02.setOnTouchListener(lkz);
        this.A01.setOnTouchListener(lkz);
        Chip chip = this.A02;
        chip.setTag(2131367279, 12);
        Chip chip2 = this.A01;
        chip2.setTag(2131367279, 10);
        View.OnClickListener onClickListener = this.A00;
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
    }

    private void A00() {
        if (this.A03.getVisibility() == 0) {
            5XE r0 = new 5XE();
            r0.A0C(this);
            int i = 1;
            if (getLayoutDirection() == 0) {
                i = 2;
            }
            r0.A07(i);
            r0.A0A(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(1296839871);
        super.onAttachedToWindow();
        A00();
        0FI.A0C(-432852972, A06);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            A00();
        }
    }
}
