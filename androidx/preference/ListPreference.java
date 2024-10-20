package androidx.preference;

import X.JR1;
import X.KdO;
import X.LGo;
import X.LRP;
import X.MEb;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;

/* loaded from: ListPreference.class */
public class ListPreference extends DialogPreference {
    public String A00;
    public CharSequence[] A01;
    public CharSequence[] A02;
    public String A03;
    public boolean A04;

    /* loaded from: ListPreference$SavedState.class */
    public final class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LGo.A00(21);
        public String A00;

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JR1.A0Y(context, 2130969352).resourceId != 0 ? 2130969352 : 16842897);
    }

    /* JADX WARN: Type inference failed for: r305v9, types: [java.lang.Object, X.LRP] */
    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, KdO.A04, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A01 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A02 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            MEb mEb = LRP.A00;
            MEb mEb2 = mEb;
            if (mEb == null) {
                ?? obj = new Object();
                LRP.A00 = obj;
                mEb2 = obj;
            }
            this.A0A = mEb2;
            A06();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, KdO.A06, i, 0);
        this.A03 = JR1.A0t(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public CharSequence A05() {
        MEb mEb = this.A0A;
        if (mEb != null) {
            return mEb.CZk(this);
        }
        CharSequence A0O = A0O();
        CharSequence A05 = super.A05();
        String str = this.A03;
        if (str != null) {
            if (A0O == null) {
                A0O = "";
            }
            String format = String.format(str, A0O);
            if (!TextUtils.equals(format, A05)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return A05;
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

    @Override // androidx.preference.Preference
    public void A0E(CharSequence charSequence) {
        super.A0E(charSequence);
        this.A03 = charSequence == null ? null : charSequence.toString();
    }

    public CharSequence A0O() {
        CharSequence[] charSequenceArr;
        String str = this.A00;
        if (str == null || (charSequenceArr = this.A02) == null) {
            return null;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
        } while (!TextUtils.equals(charSequenceArr[length].toString(), str));
        CharSequence[] charSequenceArr2 = this.A01;
        if (charSequenceArr2 != null) {
            return charSequenceArr2[length];
        }
        return null;
    }

    public void A0P(String str) {
        boolean z = !TextUtils.equals(this.A00, str);
        if (z || !this.A04) {
            this.A00 = str;
            this.A04 = true;
            A0H(str);
            if (z) {
                A06();
            }
        }
    }
}
