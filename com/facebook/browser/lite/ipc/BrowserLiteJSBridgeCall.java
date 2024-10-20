package com.facebook.browser.lite.ipc;

import X.1BK;
import X.4YV;
import X.DKf;
import X.KpF;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BrowserLiteJSBridgeCall.class */
public class BrowserLiteJSBridgeCall implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(54);
    public KpF A00;
    public final Context A01;
    public final Bundle A02;
    public final Bundle A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public BrowserLiteJSBridgeCall(Context context, Bundle bundle, Bundle bundle2, String str, String str2, String str3) {
        this.A01 = context;
        this.A04 = str;
        this.A02 = bundle;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = bundle2;
    }

    public BrowserLiteJSBridgeCall(Parcel parcel) {
        this.A01 = null;
        this.A04 = parcel.readString();
        this.A02 = parcel.readBundle();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = parcel.readBundle(4YV.A0e(this));
    }

    public Object A04(String str) {
        Bundle bundle = this.A02;
        if (bundle.containsKey(str)) {
            return bundle.get(str);
        }
        return null;
    }

    public Object A05(String str) {
        Bundle bundle = this.A03;
        if (bundle.containsKey(str)) {
            return bundle.get(str);
        }
        return null;
    }

    public void A06(int i, String str) {
        if (this.A00 != null) {
            Bundle A05 = 1BK.A05();
            A05.putInt("errorCode", i);
            if (str != null) {
                A05.putString("errorMessage", str);
            }
            this.A00.A00(A05, this, i);
        }
    }

    public void AGv(Bundle bundle) {
        KpF kpF = this.A00;
        if (kpF != null) {
            kpF.A00(bundle, this, 0);
        }
    }

    public String Aaz() {
        return (String) A05("callbackID");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeBundle(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeBundle(this.A03);
    }
}
