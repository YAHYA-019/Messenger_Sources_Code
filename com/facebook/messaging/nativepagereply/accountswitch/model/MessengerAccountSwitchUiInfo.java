package com.facebook.messaging.nativepagereply.accountswitch.model;

import X.11T;
import X.1BL;
import X.AbF;
import X.AnonymousClass001;
import X.BLO;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MessengerAccountSwitchUiInfo.class */
public final class MessengerAccountSwitchUiInfo implements Parcelable {
    public static volatile BLO A06;
    public static final Parcelable.Creator CREATOR = CST.A00(40);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final BLO A04;
    public final Set A05;

    public MessengerAccountSwitchUiInfo(BLO blo, String str, String str2, String str3, Set set) {
        this.A00 = null;
        AbF.A1U(str);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = blo;
        C1pq.A08("userId", str3);
        this.A03 = str3;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public MessengerAccountSwitchUiInfo(Parcel parcel) {
        BLO blo = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? BLO.values()[parcel.readInt()] : blo;
        this.A03 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public BLO A00() {
        if (this.A05.contains("targetAccountType")) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = BLO.A05;
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessengerAccountSwitchUiInfo)) {
                return false;
            }
            MessengerAccountSwitchUiInfo messengerAccountSwitchUiInfo = (MessengerAccountSwitchUiInfo) obj;
            if (!11T.A0O(this.A00, messengerAccountSwitchUiInfo.A00) || !11T.A0O(this.A01, messengerAccountSwitchUiInfo.A01) || !11T.A0O(this.A02, messengerAccountSwitchUiInfo.A02) || A00() != messengerAccountSwitchUiInfo.A00() || !11T.A0O(this.A03, messengerAccountSwitchUiInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
        return C1pq.A04(this.A03, (A04 * 31) + C3o5.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        C3o5.A0e(parcel, this.A04);
        parcel.writeString(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
