package androidx.preference;

import X.LGo;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;

/* loaded from: TwoStatePreference.class */
public abstract class TwoStatePreference extends Preference {
    public CharSequence A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    /* loaded from: TwoStatePreference$SavedState.class */
    public final class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(26);
        public boolean A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public void A0B(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.A0B(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.A0B(savedState.getSuperState());
        A0P(savedState.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0O(android.view.View r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof android.widget.TextView
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L44
            r0 = r302
            android.widget.TextView r0 = (android.widget.TextView) r0
            r302 = r0
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L45
            r0 = r301
            java.lang.CharSequence r0 = r0.A01
            r305 = r0
            r0 = r305
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L45
            r0 = r301
            java.lang.CharSequence r0 = r0.A01
            r306 = r0
        L2f:
            r0 = r302
            r1 = r306
            r0.setText(r1)
        L35:
            r0 = r302
            int r0 = r0.getVisibility()
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L44
            r0 = r302
            r1 = r304
            r0.setVisibility(r1)
        L44:
            return
        L45:
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L67
            r0 = r301
            java.lang.CharSequence r0 = r0.A00
            r305 = r0
            r0 = r305
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L67
            r0 = r301
            java.lang.CharSequence r0 = r0.A00
            r306 = r0
            goto L2f
        L67:
            r0 = r301
            java.lang.CharSequence r0 = r0.A05()
            r306 = r0
            r0 = r306
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2f
            r0 = 8
            r304 = r0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.A0O(android.view.View):void");
    }

    public void A0P(boolean z) {
        boolean z2 = true;
        if (this.A02 == z) {
            z2 = false;
            if (this.A04) {
                return;
            }
        }
        this.A02 = z;
        this.A04 = true;
        A0N(z);
        if (z2) {
            A0I(A0K());
            A06();
        }
    }
}
