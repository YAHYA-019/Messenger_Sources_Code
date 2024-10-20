package com.facebook.payments.logging;

import X.AbstractC11504wo;
import X.C53v;
import X.F5s;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: PaymentsLoggingSessionData.class */
public class PaymentsLoggingSessionData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(63);
    public final String externalSessionId;
    public final ImmutableMap loggingExtraData;
    public final PaymentsFlowName paymentsFlowName;
    public final String sessionId;
    public final String source;

    public PaymentsLoggingSessionData() {
        this.paymentsFlowName = null;
        this.sessionId = null;
        this.source = null;
        this.externalSessionId = null;
        this.loggingExtraData = RegularImmutableMap.A03;
    }

    public PaymentsLoggingSessionData(F5s f5s) {
        this.paymentsFlowName = f5s.A03;
        String str = f5s.A01;
        this.sessionId = str == null ? AbstractC11504wo.A01() : str;
        this.source = f5s.A02;
        this.externalSessionId = null;
        ImmutableMap immutableMap = f5s.A00;
        this.loggingExtraData = immutableMap == null ? RegularImmutableMap.A03 : immutableMap;
    }

    public PaymentsLoggingSessionData(Parcel parcel) {
        this.paymentsFlowName = (PaymentsFlowName) C53v.A07(parcel, PaymentsFlowName.class);
        this.sessionId = parcel.readString();
        this.source = parcel.readString();
        this.externalSessionId = parcel.readString();
        this.loggingExtraData = C53v.A05(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.paymentsFlowName);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.source);
        parcel.writeString(this.externalSessionId);
        parcel.writeMap(this.loggingExtraData);
    }
}
