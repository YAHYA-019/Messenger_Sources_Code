package com.google.android.material.timepicker;

import X.4YU;
import X.AbF;
import X.DKH;
import X.EHK;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: ChipTextInputComboView.class */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextWatcher A00;
    public TextView A01;
    public final EditText A02;
    public final Chip A03;
    public final TextInputLayout A04;

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(2132542487, (ViewGroup) this, false);
        this.A03 = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(2132542488, (ViewGroup) this, false);
        this.A04 = textInputLayout;
        EditText editText = textInputLayout.A0V;
        this.A02 = editText;
        editText.setVisibility(4);
        EHK ehk = new EHK(this);
        this.A00 = ehk;
        editText.addTextChangedListener(ehk);
        this.A02.setImeHintLocales(4YU.A0B(getContext()).getLocales());
        addView(chip);
        addView(textInputLayout);
        this.A01 = AbF.A06(this, 2131365471);
        editText.setSaveEnabled(false);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.A03.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.setImeHintLocales(4YU.A0B(getContext()).getLocales());
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        Chip chip = this.A03;
        chip.setChecked(z);
        EditText editText = this.A02;
        int i = 0;
        int i2 = 4;
        if (z) {
            i2 = 0;
        }
        editText.setVisibility(i2);
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            editText.requestFocus();
            if (TextUtils.isEmpty(editText.getText())) {
                return;
            }
            DKH.A17(editText);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.A03.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.A03.toggle();
    }
}
