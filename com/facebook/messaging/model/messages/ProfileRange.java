package com.facebook.messaging.model.messages;

import X.0fH;
import X.24X;
import X.2DM;
import X.4YU;
import X.82M;
import X.AnonymousClass244;
import X.K92;
import X.K93;
import X.K94;
import X.Lra;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.JSONUtil;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: ProfileRange.class */
public class ProfileRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(45);
    public final String id;
    public final int length;
    public final int offset;
    public final String type;

    public ProfileRange(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.id = readString;
        this.offset = parcel.readInt();
        this.length = parcel.readInt();
        String readString2 = parcel.readString();
        readString2.getClass();
        this.type = readString2;
    }

    public ProfileRange(Integer num, String str, int i, int i2) {
        String str2;
        this.id = str;
        this.offset = i;
        this.length = i2;
        switch (num.intValue()) {
            case 1:
                str2 = K92.__redex_internal_original_name;
                break;
            case 2:
                str2 = "t";
                break;
            case 3:
                str2 = "a";
                break;
            case 4:
                str2 = K93.__redex_internal_original_name;
                break;
            case 5:
                str2 = "ai";
                break;
            case 6:
                str2 = "im";
                break;
            case 7:
                str2 = "ad";
                break;
            case 8:
                str2 = "cu";
                break;
            case 9:
                str2 = "ca";
                break;
            default:
                str2 = "n";
                break;
        }
        this.type = str2;
    }

    public ProfileRange(String str, int i, int i2, String str2) {
        this.id = str;
        this.offset = i;
        this.length = i2;
        this.type = str2;
    }

    public static ProfileRange A00(24X r301) {
        24X A0D = r301.A0D("i");
        24X A0D2 = r301.A0D(K94.__redex_internal_original_name);
        24X A0D3 = r301.A0D(Lra.__redex_internal_original_name);
        24X A0D4 = r301.A0D("t");
        String A0H = JSONUtil.A0H(A0D, null);
        int A02 = JSONUtil.A02(A0D2, 0);
        int A022 = JSONUtil.A02(A0D3, 0);
        ProfileRange profileRange = null;
        String A0H2 = JSONUtil.A0H(A0D4, null);
        if (A0D2 != null && A0D3 != null && A0H != null && A0H2 != null && A0D2.A0Q() && A0D3.A0Q() && A02 >= 0 && A022 >= 0 && ((A02 + A022) >>> 32) == 0) {
            profileRange = new ProfileRange(A0H, A02, A022, A0H2);
        }
        return profileRange;
    }

    public static ImmutableList A01(AnonymousClass244 anonymousClass244, String str) {
        ImmutableList.Builder builder = ImmutableList.builder();
        try {
            24X A0I = anonymousClass244.A0I(str);
            if (A0I != null) {
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    ProfileRange A00 = A00((24X) it.next());
                    if (A00 != null) {
                        builder.m11011add((Object) A00);
                    }
                }
            }
        } catch (IOException e) {
            0fH.A0r("ProfileRange", "Error while parsing ProfileRanges", e);
        }
        return builder.build();
    }

    public 2DM A02() {
        2DM A0f = 4YU.A0f();
        A0f.A0i(K94.__redex_internal_original_name, this.offset);
        A0f.A0i(Lra.__redex_internal_original_name, this.length);
        A0f.A0o("i", this.id);
        A0f.A0o("t", this.type);
        return A0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.offset);
        parcel.writeInt(this.length);
        parcel.writeString(this.type);
    }
}
