package com.facebook.messaging.composer.mediaclips.avataraudiomessages.msys.data;

import X.11T;
import X.4YV;
import X.7zL;
import X.7zS;
import X.7zU;
import X.C0s8;
import X.CSQ;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.caa.common.ui.MaaMessengerBrandingBackgroundDrawable;
import java.util.List;

/* loaded from: AvatarAudioMessagePose.class */
public final class AvatarAudioMessagePose implements Parcelable {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public static final CSQ CREATOR = 7zL.A0v(13);
    public static final AvatarAudioMessagePose A0D = new AvatarAudioMessagePose("", "", "", "", "", "", "", "", 0, 0);
    public static final int A0A = Color.parseColor("#FF4C97");
    public static final int A0B = Color.parseColor("#192DFF");
    public static final int A0C = Color.parseColor(MaaMessengerBrandingBackgroundDrawable.COLOR_2);
    public static final int A0E = Color.parseColor("#FA89DE");
    public static final int A0F = Color.parseColor("#FF4C97");
    public static final int A0G = Color.parseColor("#668FFF");
    public static final int A0H = Color.parseColor("#192DFF");
    public static final int A0I = Color.parseColor("#A173FF");
    public static final int A0J = Color.parseColor(MaaMessengerBrandingBackgroundDrawable.COLOR_2);

    public AvatarAudioMessagePose(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, long j) {
        11T.A0F(str, 2);
        7zS.A18(4, str3, str6, str7);
        this.A00 = i;
        this.A03 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A09 = str4;
        this.A01 = str5;
        this.A07 = j;
        this.A05 = str6;
        this.A02 = str7;
        this.A04 = str8;
    }

    public final List A00() {
        Integer[] numArr;
        int i;
        int i2 = this.A00;
        if (i2 == 2) {
            numArr = new Integer[2];
            7zU.A1Z(numArr, A0E, 0);
            i = A0F;
        } else if (i2 == 3) {
            numArr = new Integer[2];
            7zU.A1Z(numArr, A0I, 0);
            i = A0J;
        } else {
            if (i2 != 4) {
                return null;
            }
            numArr = new Integer[2];
            7zU.A1Z(numArr, A0G, 0);
            i = A0H;
        }
        7zU.A1Z(numArr, i, 1);
        return C0s8.A14(numArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AvatarAudioMessagePose) {
            AvatarAudioMessagePose avatarAudioMessagePose = (AvatarAudioMessagePose) obj;
            if (avatarAudioMessagePose.A00 == this.A00 && 11T.A0O(this.A03, avatarAudioMessagePose.A03) && 11T.A0O(this.A06, avatarAudioMessagePose.A06) && 11T.A0O(this.A02, avatarAudioMessagePose.A02)) {
                z = 4YV.A1a(this.A05, avatarAudioMessagePose.A05, false);
            }
        }
        return z;
    }

    public int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
    }
}
