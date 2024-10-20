package androidx.preference;

import X.0Pz;
import X.0QO;
import X.AnonymousClass001;
import X.JQx;
import X.KdO;
import X.LGo;
import X.Ljw;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import java.util.List;

/* loaded from: PreferenceGroup.class */
public abstract class PreferenceGroup extends Preference {
    public int A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public final 0QO A04;
    public final List A05;
    public final Handler A06;
    public final Runnable A07;

    /* loaded from: PreferenceGroup$SavedState.class */
    public final class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(24);
        public int A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = new 0QO(0);
        this.A06 = AnonymousClass001.A07();
        this.A02 = true;
        this.A03 = 0;
        this.A01 = false;
        int i2 = (-1) >>> 1;
        this.A00 = i2;
        this.A07 = new Ljw(this);
        this.A05 = AnonymousClass001.A0s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KdO.A08, i, 0);
        this.A02 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            A0P(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, i2)));
        }
        obtainStyledAttributes.recycle();
    }

    public static void A00(Preference preference, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Preference.A03(preference);
            if (preference.A0B == preferenceGroup) {
                preference.A0B = null;
            }
            if (preferenceGroup.A05.remove(preference)) {
                String str = preference.A0H;
                if (str != null) {
                    preferenceGroup.A04.put(str, Long.valueOf(preference.A04()));
                    Handler handler = preferenceGroup.A06;
                    Runnable runnable = preferenceGroup.A07;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (preferenceGroup.A01) {
                    preference.A08();
                }
            }
        }
    }

    @Override // androidx.preference.Preference
    public void A07() {
        super.A07();
        this.A01 = true;
        List list = this.A05;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((Preference) list.get(i2)).A07();
            i = i2 + 1;
        }
    }

    @Override // androidx.preference.Preference
    public void A09(Bundle bundle) {
        super.A09(bundle);
        List list = this.A05;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((Preference) list.get(i2)).A09(bundle);
            i = i2 + 1;
        }
    }

    @Override // androidx.preference.Preference
    public void A0A(Bundle bundle) {
        super.A0A(bundle);
        List list = this.A05;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((Preference) list.get(i2)).A0A(bundle);
            i = i2 + 1;
        }
    }

    @Override // androidx.preference.Preference
    public void A0B(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(SavedState.class)) {
            SavedState savedState = (SavedState) parcelable;
            this.A00 = savedState.A00;
            parcelable = savedState.getSuperState();
        }
        super.A0B(parcelable);
    }

    @Override // androidx.preference.Preference
    public void A0I(boolean z) {
        super.A0I(z);
        List list = this.A05;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            Preference preference = (Preference) list.get(i2);
            if (preference.A0O == z) {
                preference.A0O = !z;
                preference.A0I(preference.A0K());
                preference.A06();
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return r308;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.preference.Preference A0O(java.lang.CharSequence r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L74
            r0 = r301
            java.lang.String r0 = r0.A0H
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L15
            r0 = r301
            return r0
        L15:
            r0 = r301
            java.util.List r0 = r0.A05
            r305 = r0
            r0 = r305
            int r0 = r0.size()
            r306 = r0
            r0 = 0
            r307 = r0
        L27:
            r0 = r307
            r1 = r306
            if (r0 >= r1) goto L72
            r0 = r305
            r1 = r307
            java.lang.Object r0 = r0.get(r1)
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r308 = r0
            r0 = r308
            java.lang.String r0 = r0.A0H
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L66
            r0 = r308
            boolean r0 = r0 instanceof androidx.preference.PreferenceGroup
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L69
            r0 = r308
            androidx.preference.PreferenceGroup r0 = (androidx.preference.PreferenceGroup) r0
            r1 = r302
            androidx.preference.Preference r0 = r0.A0O(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L69
        L66:
            r0 = r308
            return r0
        L69:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L27
        L72:
            r0 = 0
            return r0
        L74:
            java.lang.String r0 = "Key cannot be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0O(java.lang.CharSequence):androidx.preference.Preference");
    }

    public void A0P(int i) {
        if (i != ((-1) >>> 1) && !JQx.A1V(this.A0H)) {
            Log.e("PreferenceGroup", 0Pz.A0W(AnonymousClass001.A0X(this), " should have a key defined if it contains an expandable preference"));
        }
        this.A00 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Q(androidx.preference.Preference r302) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0Q(androidx.preference.Preference):void");
    }
}
