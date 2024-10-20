package com.facebook.messaging.rtc.safetywarning;

import X.11T;
import X.1BL;
import X.1Du;
import X.2MQ;
import X.4YV;
import X.AbG;
import X.AbI;
import X.AnonymousClass001;
import X.Bxe;
import X.C1pq;
import X.C3o5;
import X.CSS;
import X.JDB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: SafetyWarningInterstitialViewState.class */
public final class SafetyWarningInterstitialViewState implements Parcelable, JDB {
    public static volatile 2MQ A08;
    public static volatile 2MQ A09;
    public static final Parcelable.Creator CREATOR = CSS.A00(63);
    public final 2MQ A00;
    public final 2MQ A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Set A07;

    public SafetyWarningInterstitialViewState(Bxe bxe) {
        this.A00 = bxe.A00;
        String str = bxe.A03;
        C1pq.A08("acceptText", str);
        this.A03 = str;
        String str2 = bxe.A04;
        C1pq.A08("primaryText", str2);
        this.A04 = str2;
        this.A01 = bxe.A01;
        String str3 = bxe.A05;
        C1pq.A08("rejectText", str3);
        this.A05 = str3;
        String str4 = bxe.A06;
        C1pq.A08("secondaryText", str4);
        this.A06 = str4;
        ImmutableList immutableList = bxe.A02;
        C1pq.A08("userKeys", immutableList);
        this.A02 = immutableList;
        this.A07 = Collections.unmodifiableSet(bxe.A07);
    }

    public SafetyWarningInterstitialViewState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        2MQ r306 = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = 2MQ.values()[parcel.readInt()];
        }
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? 2MQ.values()[parcel.readInt()] : r306;
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        int readInt = parcel.readInt();
        UserKey[] userKeyArr = new UserKey[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, userKeyArr, i2);
        }
        this.A02 = ImmutableList.copyOf(userKeyArr);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public 2MQ A00() {
        if (this.A07.contains("acceptIcon")) {
            return this.A00;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = 2MQ.A1i;
                }
            }
        }
        return A08;
    }

    public 2MQ A01() {
        if (this.A07.contains("rejectIcon")) {
            return this.A01;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = 2MQ.A1i;
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SafetyWarningInterstitialViewState)) {
                return false;
            }
            SafetyWarningInterstitialViewState safetyWarningInterstitialViewState = (SafetyWarningInterstitialViewState) obj;
            if (A00() != safetyWarningInterstitialViewState.A00() || !11T.A0O(this.A03, safetyWarningInterstitialViewState.A03) || !11T.A0O(this.A04, safetyWarningInterstitialViewState.A04) || A01() != safetyWarningInterstitialViewState.A01() || !11T.A0O(this.A05, safetyWarningInterstitialViewState.A05) || !11T.A0O(this.A06, safetyWarningInterstitialViewState.A06) || !11T.A0O(this.A02, safetyWarningInterstitialViewState.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A04, C1pq.A04(this.A03, C3o5.A03(A00()) + 31));
        2MQ A01 = A01();
        if (A01 != null) {
            i = A01.ordinal();
        }
        return C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A05, (A04 * 31) + i)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        C3o5.A0e(parcel, this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable(AbG.A0v(A0b), i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
