package androidx.preference;

import X.JR1;
import X.JiB;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: PreferenceCategory.class */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, JR1.A0Y(context, 2130971370).resourceId != 0 ? 2130971370 : 16842892);
    }

    @Override // androidx.preference.Preference
    public void A0D(JiB jiB) {
        super.A0D(jiB);
        jiB.A0I.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public boolean A0J() {
        return false;
    }

    @Override // androidx.preference.Preference
    public boolean A0K() {
        return !super.A0J();
    }
}
