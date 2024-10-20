package com.facebookpay.otc.models;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.GOp;
import X.KMs;
import X.KOy;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: OtcOptionState.class */
public final class OtcOptionState implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(4);
    public final KMs A00;
    public final String A01;
    public final String A02;
    public final Map A03;
    public final boolean A04;

    public OtcOptionState(KMs kMs, String str, String str2, Map map) {
        1BL.A11(1, str, kMs, str2);
        this.A01 = str;
        this.A03 = map;
        this.A00 = kMs;
        this.A02 = str2;
        KMs kMs2 = KMs.A02;
        boolean z = true;
        if (kMs == kMs2) {
            if (!map.isEmpty()) {
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    if (GOp.A15(A0y) != kMs2) {
                        break;
                    }
                }
            }
            z = false;
        }
        this.A04 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OtcOptionState)) {
                return false;
            }
            OtcOptionState otcOptionState = (OtcOptionState) obj;
            if (!11T.A0O(this.A01, otcOptionState.A01) || !11T.A0O(this.A03, otcOptionState.A03) || this.A00 != otcOptionState.A00 || !11T.A0O(this.A02, otcOptionState.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A02, AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A03, 4YV.A02(this.A01))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OtcOptionState(otcSessionId=");
        A0k.append(this.A01);
        A0k.append(", componentOtcStates=");
        A0k.append(this.A03);
        A0k.append(", defaultComponentOtcState=");
        A0k.append(this.A00);
        A0k.append(", otcType=");
        return DKH.A0o(this.A02, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        Map map = this.A03;
        parcel.writeInt(map.size());
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            1BL.A12(parcel, (KOy) A0z.getKey());
            1BL.A12(parcel, (KMs) A0z.getValue());
        }
        1BL.A12(parcel, this.A00);
        parcel.writeString(this.A02);
    }
}
