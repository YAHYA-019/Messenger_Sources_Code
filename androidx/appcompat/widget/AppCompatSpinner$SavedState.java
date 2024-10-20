package androidx.appcompat.widget;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: AppCompatSpinner$SavedState.class */
public final class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = LGo.A00(13);
    public boolean A00;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
