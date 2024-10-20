package androidx.preference;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* loaded from: EditTextPreference.class */
public class EditTextPreference extends DialogPreference {
    public String A00;

    /* loaded from: EditTextPreference$SavedState.class */
    public final class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(20);
        public String A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r304v4, types: [java.lang.Object, X.LRO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(android.content.Context r302, android.util.AttributeSet r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 2130969409(0x7f040341, float:1.75475E38)
            android.util.TypedValue r0 = X.JR1.A0Y(r0, r1)
            r304 = r0
            r0 = r304
            int r0 = r0.resourceId
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L68
            r0 = 2130969409(0x7f040341, float:1.75475E38)
            r306 = r0
        L16:
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r306
            r0.<init>(r1, r2, r3)
            int[] r0 = X.KdO.A03
            r304 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r306
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r307 = r0
            r0 = r307
            r1 = 0
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r305 = r0
            r0 = r307
            r1 = 0
            r2 = r305
            boolean r0 = r0.getBoolean(r1, r2)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L62
            X.LRO r0 = X.LRO.A00
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L59
            X.LRO r0 = new X.LRO
            r304 = r0
            r0 = r304
            r0.<init>()
            r0 = r304
            X.LRO.A00 = r0
        L59:
            r0 = r301
            r1 = r304
            r0.A0A = r1
            r0 = r301
            r0.A06()
        L62:
            r0 = r307
            r0.recycle()
            return
        L68:
            r0 = 16842898(0x1010092, float:2.3693967E-38)
            r306 = r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
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

    public void A0O(String str) {
        boolean A0K = A0K();
        this.A00 = str;
        A0H(str);
        boolean A0K2 = A0K();
        if (A0K2 != A0K) {
            A0I(A0K2);
        }
        A06();
    }
}
