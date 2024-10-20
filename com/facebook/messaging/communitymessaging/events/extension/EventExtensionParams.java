package com.facebook.messaging.communitymessaging.events.extension;

import X.11T;
import X.1BL;
import X.7zN;
import X.7zQ;
import X.7zR;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLEventCreationEntryPoint;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.Calendar;

/* loaded from: EventExtensionParams.class */
public final class EventExtensionParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(73);
    public final long A00;
    public final GraphQLEventCreationEntryPoint A01;
    public final ThreadKey A02;
    public final String A03;
    public final Calendar A04;
    public final String A05;

    public EventExtensionParams(GraphQLEventCreationEntryPoint graphQLEventCreationEntryPoint, ThreadKey threadKey, String str, String str2, Calendar calendar, long j) {
        7zR.A1O(threadKey, graphQLEventCreationEntryPoint);
        this.A00 = j;
        this.A02 = threadKey;
        this.A01 = graphQLEventCreationEntryPoint;
        this.A04 = calendar;
        this.A03 = str;
        this.A05 = str2;
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
            if (this.A00 != eventExtensionParams.A00 || !11T.A0O(this.A02, eventExtensionParams.A02) || this.A01 != eventExtensionParams.A01 || !11T.A0O(this.A04, eventExtensionParams.A04) || !11T.A0O(this.A03, eventExtensionParams.A03) || !11T.A0O(this.A05, eventExtensionParams.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A02, 7zQ.A02(this.A00))) + AnonymousClass001.A02(this.A04)) * 31) + 1BL.A05(this.A03)) * 31) + 7zN.A05(this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeParcelable(this.A02, i);
        1BL.A12(parcel, this.A01);
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
    }
}
