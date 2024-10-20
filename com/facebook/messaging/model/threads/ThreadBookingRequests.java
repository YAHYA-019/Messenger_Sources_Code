package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.1Du;
import X.AnonymousClass002;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLPagesPlatformNativeBookingStatus;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

/* loaded from: ThreadBookingRequests.class */
public final class ThreadBookingRequests implements Parcelable {
    public final ImmutableMap A00;
    public final ImmutableMap A01;
    public final String A02;
    public final String A03;
    public static final Parcelable.Creator CREATOR = new CSV(73);
    public static final ImmutableList A04 = ImmutableList.of((Object) GraphQLPagesPlatformNativeBookingStatus.REQUESTED, (Object) GraphQLPagesPlatformNativeBookingStatus.PENDING, (Object) GraphQLPagesPlatformNativeBookingStatus.CONFIRMED);

    public ThreadBookingRequests(Parcel parcel) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(4);
        1Du it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            builder.put(next, Integer.valueOf(parcel.readInt()));
            Parcelable A0C = 1BL.A0C(parcel, BookingRequestDetail.class);
            if (A0C != null) {
                builder2.put(next, A0C);
            }
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        this.A00 = build;
        ImmutableMap build2 = builder2.build();
        11T.A0A(build2);
        this.A01 = build2;
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public ThreadBookingRequests(String str, String str2, HashMap hashMap, HashMap hashMap2) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(4);
        builder.putAll(hashMap2.entrySet());
        ImmutableMap build = builder.build();
        11T.A0A(build);
        this.A01 = build;
        builder2.putAll(hashMap.entrySet());
        ImmutableMap build2 = builder2.build();
        11T.A0A(build2);
        this.A00 = build2;
        this.A03 = str2;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            ThreadBookingRequests threadBookingRequests = (ThreadBookingRequests) obj;
            if (!this.A00.equals(threadBookingRequests.A00) || !this.A01.equals(threadBookingRequests.A01)) {
                return false;
            }
            String str = this.A03;
            String str2 = threadBookingRequests.A03;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            String str3 = this.A02;
            String str4 = threadBookingRequests.A02;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A05 = AnonymousClass002.A05(this.A01, this.A00.hashCode() * 31);
        String str = this.A03;
        int hashCode = (A05 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A02;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1Du it = A04.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ImmutableMap immutableMap = this.A00;
            11T.A0D(immutableMap);
            Number number = (Number) immutableMap.get(next);
            parcel.writeInt(number != null ? number.intValue() : 0);
            ImmutableMap immutableMap2 = this.A01;
            11T.A0D(immutableMap2);
            parcel.writeParcelable((Parcelable) immutableMap2.get(next), i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }
}
