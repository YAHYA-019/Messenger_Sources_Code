package com.facebook.xapp.messaging.browser.model;

import X.1BL;
import X.4YV;
import X.7zS;
import X.AbM;
import X.AnonymousClass001;
import X.C5id;
import X.DKF;
import X.FKb;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* loaded from: MessengerInAppBrowserLaunchParam.class */
public final class MessengerInAppBrowserLaunchParam implements Parcelable {
    public static final MessengerInAppBrowserLaunchParam A0E;
    public static final MessengerWebViewParams A0F;
    public static final Parcelable.Creator CREATOR;
    public final Bundle A00;
    public final ZonePolicy A01;
    public final C5id A02;
    public final MessengerWebViewParams A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    static {
        MessengerWebViewParams messengerWebViewParams = new MessengerWebViewParams(null, null, 1.0d, false, false, false, false, false, false, false);
        A0F = messengerWebViewParams;
        A0E = new MessengerInAppBrowserLaunchParam(null, ZonePolicy.A0B, C5id.A10, messengerWebViewParams, null, null, null, null, null, null, null, false, false, false);
        CREATOR = FKb.A00(45);
    }

    public MessengerInAppBrowserLaunchParam(Bundle bundle, ZonePolicy zonePolicy, C5id c5id, MessengerWebViewParams messengerWebViewParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        this.A03 = messengerWebViewParams == null ? A0F : messengerWebViewParams;
        this.A0B = z;
        Preconditions.checkNotNull(c5id, "source type must not be null");
        this.A02 = c5id;
        this.A08 = str5;
        this.A0A = str7;
        this.A09 = str6;
        this.A05 = str2;
        this.A04 = str;
        this.A00 = bundle;
        this.A06 = str3;
        this.A07 = str4;
        this.A0C = z2;
        this.A0D = z3;
        this.A01 = zonePolicy;
    }

    public MessengerInAppBrowserLaunchParam(Parcel parcel) {
        this.A03 = (MessengerWebViewParams) 1BL.A0C(parcel, MessengerWebViewParams.class);
        this.A0B = AnonymousClass001.A1N(parcel.readInt());
        this.A02 = C5id.valueOf(parcel.readString());
        this.A08 = parcel.readString();
        this.A0A = parcel.readString();
        this.A09 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A00 = parcel.readBundle(4YV.A0e(this));
        this.A0C = 7zS.A1Z(parcel);
        this.A0D = AbM.A1V(parcel);
        this.A01 = (ZonePolicy) 1BL.A0C(parcel, ZonePolicy.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof MessengerInAppBrowserLaunchParam)) {
            MessengerInAppBrowserLaunchParam messengerInAppBrowserLaunchParam = (MessengerInAppBrowserLaunchParam) obj;
            if (this.A03.equals(messengerInAppBrowserLaunchParam.A03)) {
                String str = this.A08;
                if (str == null) {
                    str = "";
                }
                String str2 = messengerInAppBrowserLaunchParam.A08;
                if (str2 == null) {
                    str2 = "";
                }
                if (str.equals(str2)) {
                    String str3 = this.A0A;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = messengerInAppBrowserLaunchParam.A0A;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (str3.equals(str4)) {
                        String str5 = this.A09;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = messengerInAppBrowserLaunchParam.A09;
                        if (str6 == null) {
                            str6 = "";
                        }
                        if (str5.equals(str6) && this.A0B == messengerInAppBrowserLaunchParam.A0B && this.A02.equals(messengerInAppBrowserLaunchParam.A02)) {
                            String str7 = this.A06;
                            if (str7 == null) {
                                str7 = "";
                            }
                            String str8 = messengerInAppBrowserLaunchParam.A06;
                            if (str8 == null) {
                                str8 = "";
                            }
                            if (str7.equals(str8)) {
                                String str9 = this.A07;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                String str10 = messengerInAppBrowserLaunchParam.A07;
                                if (str10 == null) {
                                    str10 = "";
                                }
                                if (str9.equals(str10)) {
                                    String str11 = this.A05;
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    String str12 = messengerInAppBrowserLaunchParam.A05;
                                    if (str12 == null) {
                                        str12 = "";
                                    }
                                    if (str11.equals(str12) && this.A0C == messengerInAppBrowserLaunchParam.A0C && this.A0D == messengerInAppBrowserLaunchParam.A0D) {
                                        ZonePolicy zonePolicy = this.A01;
                                        ZonePolicy zonePolicy2 = messengerInAppBrowserLaunchParam.A01;
                                        if (zonePolicy != null ? !(zonePolicy2 == null || !zonePolicy.purposePolicy.equals(zonePolicy2.purposePolicy)) : zonePolicy2 == null) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Boolean.valueOf(this.A0B), this.A02, this.A08, this.A0A, this.A09, this.A05, this.A04, this.A06, this.A07, this.A00, Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0D), this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        DKF.A1E(parcel, this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeBundle(this.A00);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }
}
