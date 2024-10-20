package com.facebook.messaging.events.reminder.model;

import X.11T;
import X.1BL;
import X.7zL;
import X.AbK;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLLightweightEventType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadEventReminder;

/* loaded from: EventReminderEditTimeParams.class */
public final class EventReminderEditTimeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(57);
    public final int A00;
    public final long A01;
    public final long A02;
    public final GraphQLLightweightEventType A03;
    public final ThreadKey A04;
    public final ThreadEventReminder A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public EventReminderEditTimeParams(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A0C = parcel.readString();
        this.A0B = parcel.readString();
        this.A0A = parcel.readString();
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A04 = AbK.A0X(parcel);
        this.A05 = (ThreadEventReminder) 1BL.A0C(parcel, ThreadEventReminder.class);
        this.A03 = (GraphQLLightweightEventType) C53v.A07(parcel, GraphQLLightweightEventType.class);
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A07 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        C53v.A0J(parcel, this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A07);
    }
}
