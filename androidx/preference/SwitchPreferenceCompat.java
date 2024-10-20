package androidx.preference;

import X.JR1;
import X.JiB;
import X.KdO;
import X.LLG;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: SwitchPreferenceCompat.class */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final LLG A02;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130971893);
        this.A02 = new LLG(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KdO.A0C, 2130971893, 0);
        ((TwoStatePreference) this).A01 = JR1.A0t(obtainStyledAttributes, 7, 0);
        if (((TwoStatePreference) this).A02) {
            A06();
        }
        ((TwoStatePreference) this).A00 = JR1.A0t(obtainStyledAttributes, 6, 1);
        if (!((TwoStatePreference) this).A02) {
            A06();
        }
        this.A01 = JR1.A0t(obtainStyledAttributes, 9, 3);
        A06();
        this.A00 = JR1.A0t(obtainStyledAttributes, 8, 4);
        A06();
        ((TwoStatePreference) this).A03 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(View view, SwitchPreferenceCompat switchPreferenceCompat) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) switchPreferenceCompat).A02);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            SwitchCompat.A09(switchCompat, switchPreferenceCompat.A01);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                SwitchCompat.A06(switchCompat);
            }
            SwitchCompat.A08(switchCompat, switchPreferenceCompat.A00);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                SwitchCompat.A05(switchCompat);
            }
            switchCompat.setOnCheckedChangeListener(switchPreferenceCompat.A02);
        }
    }

    @Override // androidx.preference.Preference
    public void A0D(JiB jiB) {
        super.A0D(jiB);
        A00(jiB.A0A(2131367815), this);
        A0O(jiB.A0A(R.id.summary));
    }
}
