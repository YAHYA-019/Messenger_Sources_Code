package com.facebook.messaging.professionalservices.booking.protocol;

import X.1BL;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AppointmentQueryConfig$QueryScenario.class */
public enum AppointmentQueryConfig$QueryScenario implements Parcelable {
    PAGE_ADMIN_QUERY_APPOINTMENT_REQUESTS_WITH_A_USER,
    PAGE_ADMIN_QUERY_APPOINTMENTS_WITH_A_USER,
    PAGE_ADMIN_QUERY_PAST_APPOINTMENTS,
    PAGE_ADMIN_QUERY_APPOINTMENT_REQUESTS,
    PAGE_ADMIN_QUERY_UPCOMING_APPOINTMENTS,
    USER_QUERY_APPOINTMENTS,
    USER_QUERY_APPOINTMENTS_WITH_A_PAGE,
    QUERY_AN_APPOINTMENT_DETAILS;

    public static final Parcelable.Creator CREATOR = CSS.A00(23);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A12(parcel, this);
    }
}
