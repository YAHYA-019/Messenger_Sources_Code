package com.facebook.messaging.model.threads;

import X.1BL;
import X.AnonymousClass002;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLPagesPlatformNativeBookingStatus;

/* loaded from: BookingRequestDetail.class */
public final class BookingRequestDetail implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(60);
    public final long A00;
    public final GraphQLPagesPlatformNativeBookingStatus A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public BookingRequestDetail(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        String readString = parcel.readString();
        GraphQLPagesPlatformNativeBookingStatus graphQLPagesPlatformNativeBookingStatus = GraphQLPagesPlatformNativeBookingStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        this.A01 = readString != null ? (GraphQLPagesPlatformNativeBookingStatus) EnumHelper.A00(graphQLPagesPlatformNativeBookingStatus, readString) : graphQLPagesPlatformNativeBookingStatus;
        this.A02 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
    }

    public BookingRequestDetail(GraphQLPagesPlatformNativeBookingStatus graphQLPagesPlatformNativeBookingStatus, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j) {
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = graphQLPagesPlatformNativeBookingStatus;
        this.A02 = str;
        this.A00 = j;
        this.A05 = str4;
        this.A04 = str3;
        this.A03 = str2;
        this.A06 = str5;
        this.A09 = str8;
        this.A0A = str9;
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
            BookingRequestDetail bookingRequestDetail = (BookingRequestDetail) obj;
            if (this.A00 != bookingRequestDetail.A00) {
                return false;
            }
            String str = this.A07;
            String str2 = bookingRequestDetail.A07;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            String str3 = this.A08;
            String str4 = bookingRequestDetail.A08;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            if (this.A01 != bookingRequestDetail.A01) {
                return false;
            }
            String str5 = this.A02;
            String str6 = bookingRequestDetail.A02;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
            String str7 = this.A05;
            String str8 = bookingRequestDetail.A05;
            if (str7 != null) {
                if (!str7.equals(str8)) {
                    return false;
                }
            } else if (str8 != null) {
                return false;
            }
            String str9 = this.A04;
            String str10 = bookingRequestDetail.A04;
            if (str9 != null) {
                if (!str9.equals(str10)) {
                    return false;
                }
            } else if (str10 != null) {
                return false;
            }
            String str11 = this.A03;
            String str12 = bookingRequestDetail.A03;
            if (str11 != null) {
                if (!str11.equals(str12)) {
                    return false;
                }
            } else if (str12 != null) {
                return false;
            }
            String str13 = this.A06;
            String str14 = bookingRequestDetail.A06;
            if (str13 != null) {
                if (!str13.equals(str14)) {
                    return false;
                }
            } else if (str14 != null) {
                return false;
            }
            String str15 = this.A09;
            String str16 = bookingRequestDetail.A09;
            if (str15 != null) {
                if (!str15.equals(str16)) {
                    return false;
                }
            } else if (str16 != null) {
                return false;
            }
            String str17 = this.A0A;
            String str18 = bookingRequestDetail.A0A;
            if (str17 != null) {
                return str17.equals(str18);
            }
            if (str18 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A06 = ((1BL.A06(this.A07) * 31) + 1BL.A06(this.A08)) * 31;
        GraphQLPagesPlatformNativeBookingStatus graphQLPagesPlatformNativeBookingStatus = this.A01;
        int A02 = (((((((((AnonymousClass002.A02(this.A00, (((A06 + (graphQLPagesPlatformNativeBookingStatus != null ? graphQLPagesPlatformNativeBookingStatus.hashCode() : 0)) * 31) + 1BL.A06(this.A02)) * 31) + 1BL.A06(this.A05)) * 31) + 1BL.A06(this.A04)) * 31) + 1BL.A06(this.A03)) * 31) + 1BL.A06(this.A06)) * 31) + 1BL.A06(this.A09)) * 31;
        String str = this.A0A;
        if (str != null) {
            i = str.hashCode();
        }
        return A02 + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r304 == null) goto L6;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            java.lang.String r0 = r0.A07
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            java.lang.String r0 = r0.A08
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            com.facebook.graphql.enums.GraphQLPagesPlatformNativeBookingStatus r0 = r0.A01
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2b
            r0 = r304
            java.lang.String r0 = r0.toString()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L32
        L2b:
            com.facebook.graphql.enums.GraphQLPagesPlatformNativeBookingStatus r0 = com.facebook.graphql.enums.GraphQLPagesPlatformNativeBookingStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = r0.toString()
            r304 = r0
        L32:
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            java.lang.String r0 = r0.A02
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            long r0 = r0.A00
            r305 = r0
            r0 = r302
            r1 = r305
            r0.writeLong(r1)
            r0 = r301
            java.lang.String r0 = r0.A05
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            java.lang.String r0 = r0.A04
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            java.lang.String r0 = r0.A03
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            java.lang.String r0 = r0.A06
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            java.lang.String r0 = r0.A09
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            r0 = r301
            java.lang.String r0 = r0.A0A
            r304 = r0
            r0 = r302
            r1 = r304
            r0.writeString(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threads.BookingRequestDetail.writeToParcel(android.os.Parcel, int):void");
    }
}
