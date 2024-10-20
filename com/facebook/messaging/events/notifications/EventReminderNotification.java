package com.facebook.messaging.events.notifications;

import X.7zL;
import X.AbK;
import X.C53v;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLLightweightEventType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: EventReminderNotification.class */
public final class EventReminderNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(56);
    public boolean A00;
    public final GraphQLLightweightEventType A01;
    public final ThreadKey A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public EventReminderNotification(Parcel parcel) {
        super(parcel);
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
        this.A01 = (GraphQLLightweightEventType) EnumHelper.A00(GraphQLLightweightEventType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, parcel.readString());
        this.A02 = AbK.A0X(parcel);
        this.A04 = parcel.readString();
    }

    public EventReminderNotification(GraphQLLightweightEventType graphQLLightweightEventType, ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, String str4) {
        super(C5ap.A06, pushProperty);
        this.A05 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A01 = graphQLLightweightEventType;
        this.A02 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeString(this.A01.toString());
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
    }
}
