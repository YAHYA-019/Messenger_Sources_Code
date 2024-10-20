package com.facebook.http.protocol;

import X.82M;
import X.C5om;
import X.DKB;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: ApiErrorResult.class */
public class ApiErrorResult implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new 82M(5);
    public final int mErrorCode;
    public final String mErrorData;
    public final C5om mErrorDomain;
    public final String mErrorMessage;
    public final int mErrorSubCode;
    public final String mErrorUserMessage;
    public final String mErrorUserTitle;
    public final String mFbRequestId;
    public final boolean mIsTransientDefaultValue;
    public final String mJsonResponse;
    public final String mSummary;

    public ApiErrorResult(C5om c5om, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, boolean z) {
        this.mErrorCode = i;
        this.mErrorSubCode = i2;
        this.mErrorMessage = str;
        this.mErrorData = str2;
        this.mErrorUserTitle = str3;
        this.mErrorUserMessage = str4;
        this.mErrorDomain = c5om;
        this.mJsonResponse = str5;
        this.mIsTransientDefaultValue = z;
        this.mFbRequestId = str6;
        this.mSummary = str7;
    }

    public ApiErrorResult(Parcel parcel) {
        this.mErrorCode = parcel.readInt();
        this.mErrorSubCode = parcel.readInt();
        this.mErrorMessage = parcel.readString();
        this.mErrorData = parcel.readString();
        this.mErrorUserTitle = parcel.readString();
        this.mErrorUserMessage = parcel.readString();
        this.mJsonResponse = parcel.readString();
        this.mErrorDomain = (C5om) Enum.valueOf(C5om.class, parcel.readString());
        this.mIsTransientDefaultValue = (parcel.dataAvail() <= 0 || parcel.readInt() != 1) ? false : true;
        this.mFbRequestId = parcel.readString();
        this.mSummary = parcel.readString();
    }

    public int A00() {
        return this.mErrorCode;
    }

    public C5om A01() {
        return this.mErrorDomain;
    }

    public String A02() {
        return this.mErrorData;
    }

    public String A03() {
        return this.mErrorMessage;
    }

    public String A04() {
        return this.mErrorUserMessage;
    }

    public String A05() {
        return this.mFbRequestId;
    }

    public boolean A06() {
        String str = this.mJsonResponse;
        if (str != null) {
            try {
                return new JSONObject(str).getJSONObject("error").getBoolean(DKB.A00(432));
            } catch (JSONException unused) {
            }
        }
        return this.mIsTransientDefaultValue;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mErrorCode);
        parcel.writeInt(this.mErrorSubCode);
        parcel.writeString(this.mErrorMessage);
        parcel.writeString(this.mErrorData);
        parcel.writeString(this.mErrorUserTitle);
        parcel.writeString(this.mErrorUserMessage);
        parcel.writeString(this.mJsonResponse);
        parcel.writeString(this.mErrorDomain.toString());
        parcel.writeInt(this.mIsTransientDefaultValue ? 1 : 0);
        parcel.writeString(this.mFbRequestId);
        parcel.writeString(this.mSummary);
    }
}
