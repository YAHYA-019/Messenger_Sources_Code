package com.facebook.auth.credentials;

import X.0Pz;
import X.AnonymousClass001;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.base.Joiner;
import java.util.ArrayList;

/* loaded from: SessionCookie.class */
public class SessionCookie implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(22);
    public String mName = null;
    public String mValue = "";
    public String mExpires = null;
    public String mDomain = "";
    public boolean mSecure = false;
    public String mPath = "";
    public boolean mHttpOnly = false;
    public String mSameSite = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str = this.mName;
        if (str == null) {
            return null;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(0Pz.A0j(str, InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, this.mValue));
        String str2 = this.mExpires;
        if (str2 != null) {
            A0s.add(0Pz.A0j("Expires", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, str2));
        }
        A0s.add(0Pz.A0j("Domain", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, this.mDomain));
        A0s.add(0Pz.A0j("Path", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, this.mPath));
        if (this.mHttpOnly) {
            A0s.add("HttpOnly");
        }
        if (!TextUtils.isEmpty(this.mSameSite)) {
            A0s.add(0Pz.A0j("SameSite", InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, this.mSameSite));
        }
        if (this.mSecure) {
            A0s.add("secure");
        }
        return new Joiner("; ").join(A0s.iterator());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeString(this.mValue);
        parcel.writeString(this.mExpires);
        parcel.writeString(this.mDomain);
        parcel.writeByte(this.mSecure ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mPath);
        parcel.writeByte(this.mHttpOnly ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mSameSite);
    }
}
