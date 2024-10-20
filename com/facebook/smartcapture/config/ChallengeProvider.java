package com.facebook.smartcapture.config;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.FKe;
import X.Qq2;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: ChallengeProvider.class */
public final class ChallengeProvider implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(23);
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;

    public ChallengeProvider(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A03 = A0s;
        parcel.readList(A0s, Qq2.class.getClassLoader());
        Class cls = Integer.TYPE;
        this.A00 = (Integer) 4YV.A0l(parcel, cls);
        this.A02 = (Integer) 4YV.A0l(parcel, cls);
        this.A01 = (Integer) 4YV.A0l(parcel, cls);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ChallengeProvider{mSteps=");
        A0k.append(TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, this.A03));
        A0k.append(", mPhotoQuality=");
        A0k.append(this.A00);
        A0k.append(", mVideoQuality=");
        A0k.append(this.A02);
        A0k.append(", mVideoBitrate=");
        A0k.append(this.A01);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.A03);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A01);
    }
}
