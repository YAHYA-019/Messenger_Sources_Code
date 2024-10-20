package com.facebook.messaging.communitymessaging.events.extension.eventrsvp.viewdata.uimodel;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C96f;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EventRsvpState.class */
public final class EventRsvpState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(75);
    public final C96f A00;
    public final C96f A01;
    public final String A02;

    public EventRsvpState(C96f c96f, C96f c96f2, String str) {
        1BL.A1F(str, c96f);
        this.A02 = str;
        this.A00 = c96f;
        this.A01 = c96f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventRsvpState)) {
                return false;
            }
            EventRsvpState eventRsvpState = (EventRsvpState) obj;
            if (!11T.A0O(this.A02, eventRsvpState.A02) || this.A00 != eventRsvpState.A00 || this.A01 != eventRsvpState.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A00, 4YV.A02(this.A02)) + AnonymousClass001.A02(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        1BL.A12(parcel, this.A00);
        C96f c96f = this.A01;
        if (c96f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, c96f);
        }
    }
}
