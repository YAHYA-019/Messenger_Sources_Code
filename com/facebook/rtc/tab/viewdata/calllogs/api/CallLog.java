package com.facebook.rtc.tab.viewdata.calllogs.api;

import X.11T;
import X.1BK;
import X.1BL;
import X.7zN;
import X.7zP;
import X.7zV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.FKW;
import X.GOm;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: CallLog.class */
public final class CallLog extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(97);
    public final long A00;
    public final ThreadKey A01;
    public final long A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public CallLog(ThreadKey threadKey, Integer num, String str, String str2, String str3, String str4, List list, long j, long j2, boolean z, boolean z2) {
        1BL.A1H(threadKey, str, str2);
        7zP.A1O(num, 6, list);
        this.A01 = threadKey;
        this.A07 = str;
        this.A06 = str2;
        this.A00 = j;
        this.A02 = j2;
        this.A03 = num;
        this.A0A = z;
        this.A09 = z2;
        this.A05 = str3;
        this.A04 = str4;
        this.A08 = list;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "OUTGOING";
            case 2:
                return "MISSED";
            default:
                return "INCOMING";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallLog)) {
                return false;
            }
            CallLog callLog = (CallLog) obj;
            if (!11T.A0O(this.A01, callLog.A01) || !11T.A0O(this.A07, callLog.A07) || !11T.A0O(this.A06, callLog.A06) || this.A00 != callLog.A00 || this.A02 != callLog.A02 || this.A03 != callLog.A03 || this.A0A != callLog.A0A || this.A09 != callLog.A09 || !11T.A0O(this.A05, callLog.A05) || !11T.A0O(this.A04, callLog.A04) || !11T.A0O(this.A08, callLog.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = AnonymousClass002.A02(this.A02, AnonymousClass002.A02(this.A00, AnonymousClass002.A07(this.A06, AnonymousClass002.A07(this.A07, 1BL.A03(this.A01)))));
        Integer num = this.A03;
        return 1BK.A03(this.A08, (((((((7zV.A03(num, A00(num), A02) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + 1BL.A05(this.A05)) * 31) + 7zN.A05(this.A04)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallLog(threadKey=");
        A0k.append(this.A01);
        A0k.append(GOm.A00(34));
        A0k.append(this.A07);
        A0k.append(", messageId=");
        A0k.append(this.A06);
        A0k.append(", callTime=");
        A0k.append(this.A00);
        A0k.append(", callDuration=");
        A0k.append(this.A02);
        A0k.append(", callState=");
        Integer num = this.A03;
        A0k.append(num != null ? A00(num) : "null");
        A0k.append(", isVideo=");
        A0k.append(this.A0A);
        A0k.append(", isSeen=");
        A0k.append(this.A09);
        A0k.append(", itemTitle=");
        A0k.append(this.A05);
        A0k.append(", itemSubtitle=");
        A0k.append(this.A04);
        A0k.append(", groupedCallLogIDs=");
        return AnonymousClass002.A0K(this.A08, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeString(A00(this.A03));
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeStringList(this.A08);
    }
}
