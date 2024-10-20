package androidx.preference;

import X.LGo;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
import java.util.Set;

/* loaded from: MultiSelectListPreference.class */
public class MultiSelectListPreference extends DialogPreference {
    public Set A00;
    public CharSequence[] A01;
    public CharSequence[] A02;

    /* loaded from: MultiSelectListPreference$SavedState.class */
    public final class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(22);
        public Set A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00.size());
            Set set = this.A00;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultiSelectListPreference(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 2130969352(0x7f040308, float:1.7547383E38)
            android.util.TypedValue r0 = X.JR1.A0Y(r0, r1)
            r304 = r0
            r0 = r304
            int r0 = r0.resourceId
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L79
            r0 = 2130969352(0x7f040308, float:1.7547383E38)
            r306 = r0
        L16:
            r0 = 0
            r307 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r306
            r0.<init>(r1, r2, r3)
            java.util.HashSet r0 = X.AnonymousClass001.A0v()
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A00 = r1
            int[] r0 = X.KdO.A05
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r306
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r308 = r0
            r0 = 2
            r305 = r0
            r0 = r308
            r1 = r305
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L4f
            r0 = r308
            r1 = 0
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            r304 = r0
        L4f:
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = 3
            r305 = r0
            r0 = 1
            r307 = r0
            r0 = r308
            r1 = r305
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L6e
            r0 = r308
            r1 = r307
            java.lang.CharSequence[] r0 = r0.getTextArray(r1)
            r304 = r0
        L6e:
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r308
            r0.recycle()
            return
        L79:
            r0 = 16842897(0x1010091, float:2.3693964E-38)
            r306 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void A0B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.A0B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.A0B(savedState.getSuperState());
        A0O(savedState.A00);
    }

    public void A0O(Set set) {
        Set set2 = this.A00;
        set2.clear();
        set2.addAll(set);
        if (A0L()) {
            Set<String> set3 = null;
            if (A0L()) {
                set3 = this.A0C.A00().getStringSet(this.A0H, null);
            }
            if (!set.equals(set3)) {
                SharedPreferences.Editor edit = this.A0C.A00().edit();
                edit.putStringSet(this.A0H, set);
                edit.apply();
            }
        }
        A06();
    }
}
