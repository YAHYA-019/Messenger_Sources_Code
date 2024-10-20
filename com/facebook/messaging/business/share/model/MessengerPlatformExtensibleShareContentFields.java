package com.facebook.messaging.business.share.model;

import X.0S2;
import X.AnonymousClass001;
import X.C9o;
import X.CFn;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessengerPlatformExtensibleShareContentFields.class */
public final class MessengerPlatformExtensibleShareContentFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(46);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;

    public MessengerPlatformExtensibleShareContentFields(CFn cFn) {
        cFn.A01.getClass();
        cFn.A00.getClass();
        this.A0F = cFn.A0F;
        this.A0I = cFn.A0I;
        this.A01 = cFn.A01;
        this.A0G = cFn.A0G;
        this.A08 = cFn.A08;
        this.A09 = cFn.A09;
        this.A04 = cFn.A04;
        this.A05 = cFn.A05;
        this.A0H = cFn.A0H;
        this.A0D = cFn.A0D;
        this.A00 = cFn.A00;
        this.A07 = cFn.A06;
        this.A0E = cFn.A0E;
        this.A02 = cFn.A02;
        this.A0C = cFn.A0C;
        this.A06 = cFn.A07;
        this.A03 = cFn.A03;
        this.A0B = cFn.A0B;
        this.A0A = cFn.A0A;
    }

    public MessengerPlatformExtensibleShareContentFields(Parcel parcel) {
        Integer num;
        this.A0F = parcel.readString();
        this.A0I = parcel.readString();
        String readString = parcel.readString();
        if (readString.equals("SOURCE_ANDROID_SDK_SHARE")) {
            num = 0S2.A00;
        } else if (readString.equals("SOURCE_JS_SDK_SHARE")) {
            num = 0S2.A01;
        } else if (readString.equals("SOURCE_MENU_SHARE")) {
            num = 0S2.A0C;
        } else if (readString.equals("SOURCE_CTA_EXTENSIBLE_SHARE")) {
            num = 0S2.A0N;
        } else if (readString.equals("SOURCE_M_SUGGESTION_SHARE")) {
            num = 0S2.A0Y;
        } else {
            if (!readString.equals("SOURCE_ANDROID_NATIVE_SHARE")) {
                throw AnonymousClass001.A0L(readString);
            }
            num = 0S2.A0j;
        }
        this.A01 = num;
        this.A0G = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A0H = parcel.readString();
        this.A0D = parcel.readString();
        this.A00 = C9o.A00(parcel.readString());
        this.A07 = parcel.readString();
        this.A0E = parcel.readString();
        this.A02 = parcel.readString();
        this.A0C = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0A = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        switch (this.A01.intValue()) {
            case 1:
                str = "SOURCE_JS_SDK_SHARE";
                break;
            case 2:
                str = "SOURCE_MENU_SHARE";
                break;
            case 3:
                str = "SOURCE_CTA_EXTENSIBLE_SHARE";
                break;
            case 4:
                str = "SOURCE_M_SUGGESTION_SHARE";
                break;
            case 5:
                str = "SOURCE_ANDROID_NATIVE_SHARE";
                break;
            default:
                str = "SOURCE_ANDROID_SDK_SHARE";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeString(C9o.A01(this.A00));
        parcel.writeString(this.A07);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
    }
}
