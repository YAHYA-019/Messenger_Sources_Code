package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quickpromotion.debug.SeguePreviewSettingsActivity;

/* loaded from: Fox.class */
public final class Fox implements 1HN, 1HO {
    public final int A00;
    public final Object A01;

    public Fox(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        if (this.A00 == 0) {
            ((GG0) this.A01).C36();
            return;
        }
        11T.A0F(r303, 1);
        if (r303.equals(4GI.A0A)) {
            SeguePreviewSettingsActivity.A01((SeguePreviewSettingsActivity) this.A01);
        }
    }
}
