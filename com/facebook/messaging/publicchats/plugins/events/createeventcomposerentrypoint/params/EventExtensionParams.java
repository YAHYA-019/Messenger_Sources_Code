package com.facebook.messaging.publicchats.plugins.events.createeventcomposerentrypoint.params;

import X.11T;
import X.1BL;
import X.7zM;
import X.C04v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: EventExtensionParams.class */
public final class EventExtensionParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(37);
    public final ThreadKey A00;
    public final String A01;

    public EventExtensionParams(ThreadKey threadKey, String str) {
        1BL.A1F(threadKey, str);
        this.A00 = threadKey;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventExtensionParams)) {
                return false;
            }
            EventExtensionParams eventExtensionParams = (EventExtensionParams) obj;
            if (!11T.A0O(this.A00, eventExtensionParams.A00) || !11T.A0O(this.A01, eventExtensionParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 1BL.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
