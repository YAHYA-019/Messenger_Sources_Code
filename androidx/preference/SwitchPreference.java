package androidx.preference;

import X.JiB;
import X.LLF;
import android.R;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

/* loaded from: SwitchPreference.class */
public class SwitchPreference extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final LLF A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchPreference(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(View view, SwitchPreference switchPreference) {
        boolean z = view instanceof Switch;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) switchPreference).A02);
        }
        if (z) {
            Switch r0 = (Switch) view;
            r0.setTextOn(switchPreference.A01);
            r0.setTextOff(switchPreference.A00);
            r0.setOnCheckedChangeListener(switchPreference.A02);
        }
    }

    @Override // androidx.preference.Preference
    public void A0D(JiB jiB) {
        super.A0D(jiB);
        A00(jiB.A0A(R.id.switch_widget), this);
        A0O(jiB.A0A(R.id.summary));
    }
}
