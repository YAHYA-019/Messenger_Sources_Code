package com.facebook.interstitial.logging;

import X.0S2;
import X.11T;
import X.AnonymousClass001;
import X.EW7;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: LogInterstitialParams.class */
public final class LogInterstitialParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(75);
    public final ImmutableMap A00;
    public final Integer A01;
    public final String A02;

    public LogInterstitialParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (readString2.equals("IMPRESSION")) {
            num = 0S2.A00;
        } else if (readString2.equals("ACTION")) {
            num = 0S2.A01;
        } else if (readString2.equals("DISMISSAL")) {
            num = 0S2.A0C;
        } else {
            if (!readString2.equals("RESET_VIEW_STATE")) {
                throw AnonymousClass001.A0L(readString2);
            }
            num = 0S2.A0N;
        }
        this.A01 = num;
        HashMap readHashMap = parcel.readHashMap(String.class.getClassLoader());
        11T.A0I(readHashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) readHashMap);
        11T.A0A(copyOf);
        this.A00 = copyOf;
    }

    public LogInterstitialParams(ImmutableMap immutableMap, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(EW7.A00(this.A01));
        parcel.writeMap(this.A00);
    }
}
