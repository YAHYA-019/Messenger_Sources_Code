package com.facebook.platform.server.protocol;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: ProxiedAppMethodParams.class */
public class ProxiedAppMethodParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(44);
    public final String A00;
    public final String A01;
    public final String A02;

    public ProxiedAppMethodParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public ProxiedAppMethodParams(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public void A00(List list) {
        list.add(new BasicNameValuePair("proxied_app_id", this.A01));
        String str = this.A02;
        if (str != null) {
            list.add(new BasicNameValuePair("proxied_app_name", str));
        }
        list.add(new BasicNameValuePair("android_key_hash", this.A00));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }
}
