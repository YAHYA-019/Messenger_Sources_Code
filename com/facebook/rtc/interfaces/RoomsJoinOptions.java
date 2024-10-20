package com.facebook.rtc.interfaces;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbE;
import X.AbH;
import X.AbJ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: RoomsJoinOptions.class */
public final class RoomsJoinOptions implements Parcelable {
    public static volatile RtcCallVideoOptions A0G;
    public static final Parcelable.Creator CREATOR = new FKW(92);
    public final int A00;
    public final LinkLogMetadata A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final RtcCallVideoOptions A0E;
    public final Set A0F;

    public RoomsJoinOptions(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Long l = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = Integer.valueOf(parcel.readInt());
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A02 = ImmutableList.copyOf(strArr);
        }
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (LinkLogMetadata) parcel.readParcelable(A0e);
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbH.A00(parcel, strArr2, i3);
            }
            this.A03 = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = (RtcCallVideoOptions) RtcCallVideoOptions.CREATOR.createFromParcel(parcel);
        }
        this.A0D = AbJ.A1V(parcel);
        this.A05 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : l;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0F = Collections.unmodifiableSet(A0v);
    }

    public RoomsJoinOptions(LinkLogMetadata linkLogMetadata, RtcCallVideoOptions rtcCallVideoOptions, ImmutableList immutableList, ImmutableList immutableList2, Integer num, Long l, String str, String str2, String str3, String str4, Set set, int i, boolean z, boolean z2, boolean z3) {
        this.A06 = str;
        this.A07 = str2;
        this.A04 = num;
        this.A02 = immutableList;
        this.A0A = z;
        this.A0B = false;
        this.A0C = z2;
        this.A01 = linkLogMetadata;
        this.A00 = i;
        this.A08 = str3;
        this.A09 = str4;
        this.A03 = immutableList2;
        this.A0E = rtcCallVideoOptions;
        this.A0D = z3;
        this.A05 = l;
        this.A0F = Collections.unmodifiableSet(set);
    }

    public RtcCallVideoOptions A00() {
        if (this.A0F.contains("rtcCallVideoOptions")) {
            return this.A0E;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = new RtcCallVideoOptions(true, false);
                }
            }
        }
        return A0G;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RoomsJoinOptions)) {
                return false;
            }
            RoomsJoinOptions roomsJoinOptions = (RoomsJoinOptions) obj;
            if (!11T.A0O(this.A06, roomsJoinOptions.A06) || !11T.A0O(this.A07, roomsJoinOptions.A07) || !11T.A0O(this.A04, roomsJoinOptions.A04) || !11T.A0O(this.A02, roomsJoinOptions.A02) || this.A0A != roomsJoinOptions.A0A || this.A0B != roomsJoinOptions.A0B || this.A0C != roomsJoinOptions.A0C || !11T.A0O(this.A01, roomsJoinOptions.A01) || this.A00 != roomsJoinOptions.A00 || !11T.A0O(this.A08, roomsJoinOptions.A08) || !11T.A0O(this.A09, roomsJoinOptions.A09) || !11T.A0O(this.A03, roomsJoinOptions.A03) || !11T.A0O(A00(), roomsJoinOptions.A00()) || this.A0D != roomsJoinOptions.A0D || !11T.A0O(this.A05, roomsJoinOptions.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A02(C1pq.A04(A00(), C1pq.A04(this.A03, C1pq.A04(this.A09, C1pq.A04(this.A08, (C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A04(this.A07, C1pq.A03(this.A06)))), this.A0A), this.A0B), this.A0C)) * 31) + this.A00)))), this.A0D));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RoomsJoinOptions{authorizedAppId=");
        A0k.append(this.A06);
        A0k.append(AbE.A00(217));
        A0k.append(this.A07);
        A0k.append(", expectedParticipantCount=");
        A0k.append(this.A04);
        A0k.append(", expectedParticipantIds=");
        A0k.append(this.A02);
        A0k.append(", isAutoJoinRequest=");
        A0k.append(this.A0A);
        A0k.append(", isCallTransferRequest=");
        A0k.append(this.A0B);
        A0k.append(", isFbFamilyApp=");
        A0k.append(this.A0C);
        A0k.append(", joinMetadata=");
        A0k.append(this.A01);
        A0k.append(", joinSurface=");
        A0k.append(this.A00);
        A0k.append(", linkUrl=");
        A0k.append(this.A08);
        A0k.append(", originalUserId=");
        A0k.append(this.A09);
        A0k.append(", participantsToRing=");
        A0k.append(this.A03);
        A0k.append(", rtcCallVideoOptions=");
        A0k.append(A00());
        A0k.append(", shouldLaunchInVideoChatHead=");
        A0k.append(this.A0D);
        A0k.append(", tTRCTraceId=");
        return AbstractC2327GOs.A0U(this.A05, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        C3o5.A0f(parcel, this.A04);
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                C3o5.A0h(parcel, A0b);
            }
        }
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        C3o5.A0d(parcel, this.A01, i);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        ImmutableList immutableList2 = this.A03;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                C3o5.A0h(parcel, A0b2);
            }
        }
        RtcCallVideoOptions rtcCallVideoOptions = this.A0E;
        if (rtcCallVideoOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rtcCallVideoOptions.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0D ? 1 : 0);
        C3o5.A0g(parcel, this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A0F);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
