package androidx.activity.result;

import X.0qE;
import X.11T;
import X.AnonymousClass001;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ActivityResult.class */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qE(0);
    public final int A00;
    public final Intent A01;

    public ActivityResult(int i, Intent intent) {
        this.A00 = i;
        this.A01 = intent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ActivityResult{resultCode=");
        int i = this.A00;
        A0k.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        A0k.append(", data=");
        A0k.append(this.A01);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        Intent intent = this.A01;
        int i2 = 1;
        if (intent == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
