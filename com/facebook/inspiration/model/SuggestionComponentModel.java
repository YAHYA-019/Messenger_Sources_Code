package com.facebook.inspiration.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: SuggestionComponentModel.class */
public final class SuggestionComponentModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(93);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public SuggestionComponentModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public SuggestionComponentModel(String str, String str2, String str3, String str4) {
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        this.A00 = str;
        C1pq.A08("title", str2);
        this.A01 = str2;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        this.A02 = str3;
        C1pq.A08(TraceFieldType.Uri, str4);
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SuggestionComponentModel)) {
                return false;
            }
            SuggestionComponentModel suggestionComponentModel = (SuggestionComponentModel) obj;
            if (!11T.A0O(this.A00, suggestionComponentModel.A00) || !11T.A0O(this.A01, suggestionComponentModel.A01) || !11T.A0O(this.A02, suggestionComponentModel.A02) || !11T.A0O(this.A03, suggestionComponentModel.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
