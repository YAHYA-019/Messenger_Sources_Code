package com.facebook.messaging.montage.logging;

import X.11T;
import X.1BJ;
import X.1BL;
import X.1Du;
import X.4YT;
import X.7zU;
import X.AbE;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.C6r6;
import X.CSV;
import X.DKH;
import X.GOn;
import X.GOq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: MontagePostReliabilityLogging.class */
public final class MontagePostReliabilityLogging implements Parcelable {
    public static volatile String A0D;
    public static final Parcelable.Creator CREATOR = new CSV(97);
    public final C6r6 A00;
    public final ImmutableMap A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final Set A0C;

    public MontagePostReliabilityLogging(C6r6 c6r6, ImmutableMap immutableMap, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Set set) {
        C1pq.A08("composerEntryPicker", str);
        this.A03 = str;
        C1pq.A08("composerPostSource", str2);
        this.A04 = str2;
        C1pq.A08("contentType", str3);
        this.A05 = str3;
        this.A00 = c6r6;
        C1pq.A08("entryPointName", str4);
        this.A06 = str4;
        C1pq.A08("offlineThreadingId", str5);
        this.A07 = str5;
        this.A01 = immutableMap;
        this.A02 = num;
        C1pq.A08("sessionId", str6);
        this.A08 = str6;
        C1pq.A08(AbE.A00(204), str7);
        this.A09 = str7;
        this.A0A = str8;
        C1pq.A08("targetType", str9);
        this.A0B = str9;
        this.A0C = Collections.unmodifiableSet(set);
    }

    public MontagePostReliabilityLogging(Parcel parcel) {
        this.A03 = 7zU.A0l(parcel, this);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = C6r6.values()[parcel.readInt()];
        }
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= readInt) {
                    break;
                }
                GOn.A1Y(parcel.readString(), A0u, parcel.readLong());
                i2 = i3 + 1;
            }
            this.A01 = ImmutableMap.copyOf((Map) A0u);
        }
        this.A02 = parcel.readInt() != 0 ? 7zU.A0e(parcel, 4) : num;
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = C3o5.A0O(parcel);
        this.A0B = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0C = Collections.unmodifiableSet(A0v);
    }

    public String A00() {
        if (this.A0C.contains("targetId")) {
            return this.A0A;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL;
                }
            }
        }
        return A0D;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontagePostReliabilityLogging)) {
                return false;
            }
            MontagePostReliabilityLogging montagePostReliabilityLogging = (MontagePostReliabilityLogging) obj;
            if (!11T.A0O(this.A03, montagePostReliabilityLogging.A03) || !11T.A0O(this.A04, montagePostReliabilityLogging.A04) || !11T.A0O(this.A05, montagePostReliabilityLogging.A05) || this.A00 != montagePostReliabilityLogging.A00 || !11T.A0O(this.A06, montagePostReliabilityLogging.A06) || !11T.A0O(this.A07, montagePostReliabilityLogging.A07) || !11T.A0O(this.A01, montagePostReliabilityLogging.A01) || this.A02 != montagePostReliabilityLogging.A02 || !11T.A0O(this.A08, montagePostReliabilityLogging.A08) || !11T.A0O(this.A09, montagePostReliabilityLogging.A09) || !11T.A0O(A00(), montagePostReliabilityLogging.A00()) || !11T.A0O(this.A0B, montagePostReliabilityLogging.A0B)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A01, C1pq.A04(this.A07, C1pq.A04(this.A06, (C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A03(this.A03))) * 31) + C3o5.A03(this.A00))));
        Integer num = this.A02;
        if (num != null) {
            i = num.intValue();
        }
        return C1pq.A04(this.A0B, C1pq.A04(A00(), C1pq.A04(this.A09, C1pq.A04(this.A08, (A04 * 31) + i))));
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MontagePostReliabilityLogging{composerEntryPicker=");
        A0k.append(this.A03);
        A0k.append(", composerPostSource=");
        A0k.append(this.A04);
        A0k.append(AbE.A00(220));
        A0k.append(this.A05);
        A0k.append(", entryPoint=");
        A0k.append(this.A00);
        A0k.append(", entryPointName=");
        A0k.append(this.A06);
        A0k.append(1BJ.A00(242));
        A0k.append(this.A07);
        A0k.append(", payload=");
        A0k.append(this.A01);
        A0k.append(", postLoggingStatus=");
        Integer num = this.A02;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "INIT";
                    break;
                case 2:
                    str = "POST";
                    break;
                case 3:
                    str = "CANCEL";
                    break;
                default:
                    str = "ENTRY";
                    break;
            }
        } else {
            str = "null";
        }
        A0k.append(str);
        A0k.append(4YT.A00(45));
        A0k.append(this.A08);
        A0k.append(", sourceSurface=");
        A0k.append(this.A09);
        A0k.append(4YT.A00(206));
        A0k.append(A00());
        A0k.append(4YT.A00(207));
        return GOq.A12(this.A0B, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        C3o5.A0e(parcel, this.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        ImmutableMap immutableMap = this.A01;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0g);
                parcel.writeString(AnonymousClass001.A0j(A0z));
                parcel.writeLong(C3o5.A08(A0z));
            }
        }
        C3o5.A0f(parcel, this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        1BL.A13(parcel, this.A0A);
        parcel.writeString(this.A0B);
        Iterator A0S = C3o5.A0S(parcel, this.A0C);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
