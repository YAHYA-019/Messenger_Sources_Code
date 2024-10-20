package androidx.preference;

import X.JiB;
import X.LLE;
import android.R;
import android.view.View;
import android.widget.Checkable;
import android.widget.CompoundButton;

/* loaded from: CheckBoxPreference.class */
public class CheckBoxPreference extends TwoStatePreference {
    public final LLE A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CheckBoxPreference(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 2130969053(0x7f0401dd, float:1.7546777E38)
            android.util.TypedValue r0 = X.JR1.A0Y(r0, r1)
            r304 = r0
            r0 = r304
            int r0 = r0.resourceId
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L96
            r0 = 2130969053(0x7f0401dd, float:1.7546777E38)
            r306 = r0
        L16:
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r306
            r0.<init>(r1, r2, r3)
            X.LLE r0 = new X.LLE
            r304 = r0
            r0 = r304
            r1 = r301
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0.A00 = r1
            int[] r0 = X.KdO.A01
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r306
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r307 = r0
            r0 = r307
            r1 = 5
            r2 = 0
            java.lang.String r0 = X.JR1.A0t(r0, r1, r2)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r301
            boolean r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L57
            r0 = r301
            r0.A06()
        L57:
            r0 = 4
            r306 = r0
            r0 = r307
            r1 = r306
            r2 = 1
            java.lang.String r0 = X.JR1.A0t(r0, r1, r2)
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r301
            boolean r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L77
            r0 = r301
            r0.A06()
        L77:
            r0 = r307
            r1 = 2
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r305 = r0
            r0 = r307
            r1 = 3
            r2 = r305
            boolean r0 = r0.getBoolean(r1, r2)
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r307
            r0.recycle()
            return
        L96:
            r0 = 16842895(0x101008f, float:2.369396E-38)
            r306 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A00(View view, CheckBoxPreference checkBoxPreference) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(((TwoStatePreference) checkBoxPreference).A02);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(checkBoxPreference.A00);
        }
    }

    @Override // androidx.preference.Preference
    public void A0D(JiB jiB) {
        super.A0D(jiB);
        A00(jiB.A0A(R.id.checkbox), this);
        A0O(jiB.A0A(R.id.summary));
    }
}
