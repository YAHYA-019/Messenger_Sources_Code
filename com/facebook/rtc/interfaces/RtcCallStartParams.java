package com.facebook.rtc.interfaces;

import X.0S2;
import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.7zU;
import X.AbE;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKW;
import X.GOo;
import X.I4B;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.webrtc.models.FbWebrtcDataMessage;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: RtcCallStartParams.class */
public final class RtcCallStartParams implements Parcelable {
    public static volatile Integer A0S;
    public static volatile String A0T;
    public static final Parcelable.Creator CREATOR = new FKW(93);
    public final long A00;
    public final ThreadKey A01;
    public final CallSurfaceLoggingParams A02;
    public final RoomsJoinOptions A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableMap A07;
    public final Integer A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final Set A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public RtcCallStartParams(I4B i4b) {
        ImmutableList immutableList = i4b.A04;
        C1pq.A08("allParticipants", immutableList);
        this.A04 = immutableList;
        this.A07 = i4b.A07;
        this.A0A = i4b.A0A;
        this.A02 = i4b.A02;
        this.A08 = i4b.A08;
        this.A0B = i4b.A0B;
        ImmutableList immutableList2 = i4b.A05;
        C1pq.A08("dataMessages", immutableList2);
        this.A05 = immutableList2;
        this.A0C = i4b.A0C;
        this.A0D = i4b.A0D;
        this.A0J = i4b.A0J;
        this.A0K = i4b.A0K;
        this.A0L = i4b.A0L;
        this.A0M = i4b.A0M;
        String str = i4b.A0E;
        C1pq.A08("loggingTraceId", str);
        this.A0E = str;
        this.A0F = i4b.A0F;
        ImmutableList immutableList3 = i4b.A06;
        C1pq.A08("participantsToRing", immutableList3);
        this.A06 = immutableList3;
        this.A00 = i4b.A00;
        this.A03 = i4b.A03;
        this.A0G = i4b.A0G;
        this.A0N = i4b.A0N;
        this.A0O = i4b.A0O;
        this.A0P = i4b.A0P;
        this.A0Q = i4b.A0Q;
        this.A0R = i4b.A0R;
        this.A09 = i4b.A09;
        this.A01 = i4b.A01;
        String str2 = i4b.A0H;
        C1pq.A08("trigger", str2);
        this.A0H = str2;
        this.A0I = Collections.unmodifiableSet(i4b.A0I);
        String str3 = this.A0H;
        boolean z = (str3 == null || str3.length() == 0 || (this.A00 <= 0 && this.A01 == null && !this.A0L && !this.A0K && !this.A0R)) ? false : true;
        Object[] A1b = GOo.A1b(str3, this.A00);
        if (!z) {
            throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("Start params not well formed [trigger: %s] [peerId: %s], or ThreadKey is null", A1b));
        }
    }

    public RtcCallStartParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A04 = ImmutableList.copyOf(strArr);
        ThreadKey threadKey = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt2 = parcel.readInt();
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= readInt2) {
                    break;
                }
                A0u.put(parcel.readString(), parcel.readString());
                i3 = i4 + 1;
            }
            this.A07 = ImmutableMap.copyOf((Map) A0u);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (CallSurfaceLoggingParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = 7zU.A0e(parcel, 4);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        int readInt3 = parcel.readInt();
        FbWebrtcDataMessage[] fbWebrtcDataMessageArr = new FbWebrtcDataMessage[readInt3];
        int i5 = 0;
        while (i5 < readInt3) {
            i5 = AbI.A01(parcel, A0e, fbWebrtcDataMessageArr, i5);
        }
        this.A05 = ImmutableList.copyOf(fbWebrtcDataMessageArr);
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A0J = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0K = 1BM.A07(parcel);
        this.A0L = 1BM.A07(parcel);
        this.A0M = 1BM.A07(parcel);
        this.A0E = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        int readInt4 = parcel.readInt();
        String[] strArr2 = new String[readInt4];
        int i6 = 0;
        while (i6 < readInt4) {
            i6 = AbH.A00(parcel, strArr2, i6);
        }
        this.A06 = ImmutableList.copyOf(strArr2);
        this.A00 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (RoomsJoinOptions) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        this.A0N = 1BM.A07(parcel);
        this.A0O = 1BM.A07(parcel);
        this.A0P = 1BM.A07(parcel);
        this.A0Q = 1BM.A07(parcel);
        this.A0R = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = Long.valueOf(parcel.readLong());
        }
        this.A01 = parcel.readInt() != 0 ? (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel) : threadKey;
        this.A0H = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt5 = parcel.readInt();
        while (i < readInt5) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0I = Collections.unmodifiableSet(A0v);
    }

    public Integer A00() {
        if (this.A0I.contains("callType")) {
            return this.A08;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = 0S2.A00;
                }
            }
        }
        return A0S;
    }

    public String A01() {
        if (this.A0I.contains("connectFunnelOrigin")) {
            return this.A0B;
        }
        if (A0T == null) {
            synchronized (this) {
                if (A0T == null) {
                    A0T = AbE.A00(488);
                }
            }
        }
        return A0T;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RtcCallStartParams)) {
                return false;
            }
            RtcCallStartParams rtcCallStartParams = (RtcCallStartParams) obj;
            if (!11T.A0O(this.A04, rtcCallStartParams.A04) || !11T.A0O(this.A07, rtcCallStartParams.A07) || !11T.A0O(this.A0A, rtcCallStartParams.A0A) || !11T.A0O(this.A02, rtcCallStartParams.A02) || A00() != rtcCallStartParams.A00() || !11T.A0O(A01(), rtcCallStartParams.A01()) || !11T.A0O(this.A05, rtcCallStartParams.A05) || !11T.A0O(this.A0C, rtcCallStartParams.A0C) || !11T.A0O(this.A0D, rtcCallStartParams.A0D) || this.A0J != rtcCallStartParams.A0J || this.A0K != rtcCallStartParams.A0K || this.A0L != rtcCallStartParams.A0L || this.A0M != rtcCallStartParams.A0M || !11T.A0O(this.A0E, rtcCallStartParams.A0E) || !11T.A0O(this.A0F, rtcCallStartParams.A0F) || !11T.A0O(this.A06, rtcCallStartParams.A06) || this.A00 != rtcCallStartParams.A00 || !11T.A0O(this.A03, rtcCallStartParams.A03) || !11T.A0O(this.A0G, rtcCallStartParams.A0G) || this.A0N != rtcCallStartParams.A0N || this.A0O != rtcCallStartParams.A0O || this.A0P != rtcCallStartParams.A0P || this.A0Q != rtcCallStartParams.A0Q || this.A0R != rtcCallStartParams.A0R || !11T.A0O(this.A09, rtcCallStartParams.A09) || !11T.A0O(this.A01, rtcCallStartParams.A01) || !11T.A0O(this.A0H, rtcCallStartParams.A0H)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A04(this.A0A, C1pq.A04(this.A07, C1pq.A03(this.A04))));
        return C1pq.A04(this.A0H, C1pq.A04(this.A01, C1pq.A04(this.A09, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0G, C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A06, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A0D, C1pq.A04(this.A0C, C1pq.A04(this.A05, C1pq.A04(A01(), (A04 * 31) + C3o5.A04(A00()))))), this.A0J), this.A0K), this.A0L), this.A0M)))), this.A00))), this.A0N), this.A0O), this.A0P), this.A0Q), this.A0R))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A04);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        ImmutableMap immutableMap = this.A07;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                AbL.A0n(parcel, A0g);
            }
        }
        1BL.A13(parcel, this.A0A);
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0f(parcel, this.A08);
        1BL.A13(parcel, this.A0B);
        1Du A0b2 = 1BL.A0b(parcel, this.A05);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((FbWebrtcDataMessage) A0b2.next(), i);
        }
        1BL.A13(parcel, this.A0C);
        1BL.A13(parcel, this.A0D);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A0E);
        1BL.A13(parcel, this.A0F);
        1Du A0b3 = 1BL.A0b(parcel, this.A06);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        parcel.writeLong(this.A00);
        C3o5.A0d(parcel, this.A03, i);
        1BL.A13(parcel, this.A0G);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        C3o5.A0g(parcel, this.A09);
        ThreadKey threadKey = this.A01;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0H);
        Iterator A0S2 = C3o5.A0S(parcel, this.A0I);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
    }
}
