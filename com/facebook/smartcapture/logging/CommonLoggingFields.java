package com.facebook.smartcapture.logging;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.Qpv;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Map;

/* loaded from: CommonLoggingFields.class */
public final class CommonLoggingFields implements Parcelable {
    public Map _tagsMap;
    public Qpv featureLevel;
    public String flowType;
    public String product;
    public String sessionId;
    public String submissionId;
    public Bundle tags;
    public static final Companion Companion = new Object();
    public static final CommonLoggingFields NO_OP_LOGGING_FIELDS = new CommonLoggingFields(Qpv.A02, "", "", null, null, null);
    public static final Parcelable.Creator CREATOR = new Companion.CREATOR.1();

    public CommonLoggingFields(Qpv qpv, String str, String str2, String str3, Bundle bundle, String str4) {
        1BL.A1H(qpv, str, str2);
        this.featureLevel = qpv;
        this.flowType = str;
        this.product = str2;
        this.sessionId = str3;
        this.tags = bundle;
        this._tagsMap = Companion.access$bundleToMap(Companion, bundle);
        this.submissionId = str4;
    }

    public CommonLoggingFields(Parcel parcel) {
        11T.A0F(parcel, 1);
        Qpv readSerializable = parcel.readSerializable();
        if (readSerializable == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.featureLevel = readSerializable;
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.flowType = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.product = readString2;
        this.sessionId = parcel.readString();
        Bundle readBundle = parcel.readBundle(String.class.getClassLoader());
        this.tags = readBundle;
        this._tagsMap = Companion.access$bundleToMap(Companion, readBundle);
        this.submissionId = parcel.readString();
    }

    public static final Parcelable.Creator getCREATOR() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Qpv getFeatureLevel() {
        return this.featureLevel;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSubmissionId() {
        return this.submissionId;
    }

    public final Bundle getTags() {
        return this.tags;
    }

    public final Map getTagsMap() {
        Map unmodifiableMap = Collections.unmodifiableMap(this._tagsMap);
        11T.A0A(unmodifiableMap);
        return unmodifiableMap;
    }

    public final void setFeatureLevel(Qpv qpv) {
        11T.A0F(qpv, 0);
        this.featureLevel = qpv;
    }

    public final void setFlowType(String str) {
        11T.A0F(str, 0);
        this.flowType = str;
    }

    public final void setProduct(String str) {
        11T.A0F(str, 0);
        this.product = str;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }

    public final void setSubmissionId(String str) {
        this.submissionId = str;
    }

    public final void setTags(Bundle bundle) {
        this.tags = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.featureLevel);
        parcel.writeString(this.flowType);
        parcel.writeString(this.product);
        parcel.writeString(this.sessionId);
        parcel.writeBundle(this.tags);
        parcel.writeString(this.submissionId);
    }
}
