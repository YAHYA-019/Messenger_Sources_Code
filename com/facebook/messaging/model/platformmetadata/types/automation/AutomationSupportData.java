package com.facebook.messaging.model.platformmetadata.types.automation;

import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: AutomationSupportData.class */
public final class AutomationSupportData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(52);
    public final String A00;

    public AutomationSupportData(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AutomationSupportData)) {
            return false;
        }
        return Objects.equal(this.A00, ((AutomationSupportData) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
