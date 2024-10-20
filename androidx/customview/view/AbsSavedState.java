package androidx.customview.view;

import X.0Fs;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AbsSavedState.class */
public abstract class AbsSavedState implements Parcelable {
    public static final AbsSavedState A01 = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator CREATOR = new 0Fs();
    public final Parcelable A00;

    public AbsSavedState() {
        this.A00 = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw AnonymousClass001.A0L("superState must not be null");
        }
        this.A00 = parcelable == A01 ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
