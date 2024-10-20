package com.facebook.messaging.sharing.broadcastflow.logging;

import X.11T;
import X.1BJ;
import X.1BL;
import X.1Du;
import X.4YT;
import X.4YU;
import X.7zN;
import X.7zO;
import X.AbG;
import X.AbN;
import X.AnonymousClass001;
import X.AnonymousClass550;
import X.BOR;
import X.BOi;
import X.C1pq;
import X.C3o5;
import X.CSU;
import X.DKB;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: BroadcastFlowMnetItem.class */
public final class BroadcastFlowMnetItem implements Parcelable {
    public static volatile BOi A0S;
    public static final Parcelable.Creator CREATOR = CSU.A00(57);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final BOi A05;
    public final BOR A06;
    public final ImmutableMap A07;
    public final Boolean A08;
    public final Long A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final Set A0R;

    public BroadcastFlowMnetItem(BOi bOi, BOR bor, ImmutableMap immutableMap, Boolean bool, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set set, int i, int i2, int i3, int i4, long j) {
        this.A00 = i;
        this.A0B = str;
        C1pq.A08("bcfSessionId", str2);
        this.A0C = str2;
        this.A09 = l;
        this.A0D = str3;
        this.A01 = i2;
        this.A08 = bool;
        this.A0E = str4;
        this.A0F = str5;
        this.A0G = str6;
        this.A05 = bOi;
        this.A07 = immutableMap;
        this.A02 = i3;
        this.A0H = str7;
        this.A0I = str8;
        this.A0J = str9;
        this.A0K = str10;
        this.A0L = str11;
        C1pq.A08("shareSource", str12);
        this.A0M = str12;
        C1pq.A08("sheetState", bor);
        this.A06 = bor;
        this.A0N = str13;
        this.A0O = str14;
        this.A0P = str15;
        this.A04 = j;
        this.A0Q = str16;
        this.A03 = i4;
        this.A0A = l2;
        this.A0R = Collections.unmodifiableSet(set);
    }

    public BroadcastFlowMnetItem(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        this.A0C = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
        }
        this.A01 = parcel.readInt();
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = Boolean.valueOf(AbN.A1U(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = BOi.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= readInt) {
                    break;
                }
                A0u.put(7zO.A0j(parcel), AnonymousClass550.values()[parcel.readInt()]);
                i2 = i3 + 1;
            }
            this.A07 = ImmutableMap.copyOf((Map) A0u);
        }
        this.A02 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = parcel.readString();
        }
        this.A0M = parcel.readString();
        this.A06 = BOR.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = parcel.readString();
        }
        this.A04 = parcel.readLong();
        this.A0Q = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = parcel.readInt();
        this.A0A = AbN.A0h(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0R = Collections.unmodifiableSet(A0v);
    }

    public BOi A00() {
        if (this.A0R.contains("rankSection")) {
            return this.A05;
        }
        if (A0S == null) {
            synchronized (this) {
                if (A0S == null) {
                    A0S = BOi.A0O;
                }
            }
        }
        return A0S;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BroadcastFlowMnetItem)) {
                return false;
            }
            BroadcastFlowMnetItem broadcastFlowMnetItem = (BroadcastFlowMnetItem) obj;
            if (this.A00 != broadcastFlowMnetItem.A00 || !11T.A0O(this.A0B, broadcastFlowMnetItem.A0B) || !11T.A0O(this.A0C, broadcastFlowMnetItem.A0C) || !11T.A0O(this.A09, broadcastFlowMnetItem.A09) || !11T.A0O(this.A0D, broadcastFlowMnetItem.A0D) || this.A01 != broadcastFlowMnetItem.A01 || !11T.A0O(this.A08, broadcastFlowMnetItem.A08) || !11T.A0O(this.A0E, broadcastFlowMnetItem.A0E) || !11T.A0O(this.A0F, broadcastFlowMnetItem.A0F) || !11T.A0O(this.A0G, broadcastFlowMnetItem.A0G) || A00() != broadcastFlowMnetItem.A00() || !11T.A0O(this.A07, broadcastFlowMnetItem.A07) || this.A02 != broadcastFlowMnetItem.A02 || !11T.A0O(this.A0H, broadcastFlowMnetItem.A0H) || !11T.A0O(this.A0I, broadcastFlowMnetItem.A0I) || !11T.A0O(this.A0J, broadcastFlowMnetItem.A0J) || !11T.A0O(this.A0K, broadcastFlowMnetItem.A0K) || !11T.A0O(this.A0L, broadcastFlowMnetItem.A0L) || !11T.A0O(this.A0M, broadcastFlowMnetItem.A0M) || this.A06 != broadcastFlowMnetItem.A06 || !11T.A0O(this.A0N, broadcastFlowMnetItem.A0N) || !11T.A0O(this.A0O, broadcastFlowMnetItem.A0O) || !11T.A0O(this.A0P, broadcastFlowMnetItem.A0P) || this.A04 != broadcastFlowMnetItem.A04 || !11T.A0O(this.A0Q, broadcastFlowMnetItem.A0Q) || this.A03 != broadcastFlowMnetItem.A03 || !11T.A0O(this.A0A, broadcastFlowMnetItem.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A0M, C1pq.A04(this.A0L, C1pq.A04(this.A0K, C1pq.A04(this.A0J, C1pq.A04(this.A0I, C1pq.A04(this.A0H, (C1pq.A04(this.A07, (C1pq.A04(this.A0G, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A08, (C1pq.A04(this.A0D, C1pq.A04(this.A09, C1pq.A04(this.A0C, C1pq.A04(this.A0B, this.A00 + 31)))) * 31) + this.A01)))) * 31) + C3o5.A03(A00())) * 31) + this.A02))))));
        BOR bor = this.A06;
        if (bor != null) {
            i = bor.ordinal();
        }
        return C1pq.A04(this.A0A, (C1pq.A04(this.A0Q, C1pq.A01(C1pq.A04(this.A0P, C1pq.A04(this.A0O, C1pq.A04(this.A0N, (A04 * 31) + i))), this.A04)) * 31) + this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BroadcastFlowMnetItem{absolutePosition=");
        A0k.append(this.A00);
        A0k.append(", authorId=");
        A0k.append(this.A0B);
        A0k.append(", bcfSessionId=");
        A0k.append(this.A0C);
        A0k.append(", contactShareId=");
        A0k.append(this.A09);
        A0k.append(", contentType=");
        A0k.append(this.A0D);
        A0k.append(", entryPoint=");
        A0k.append(this.A01);
        A0k.append(", isE2eeShareEligible=");
        A0k.append(this.A08);
        A0k.append(DKB.A00(62));
        A0k.append(this.A0E);
        A0k.append(", postId=");
        A0k.append(this.A0F);
        A0k.append(", querySessionId=");
        A0k.append(this.A0G);
        A0k.append(", rankSection=");
        A0k.append(A00());
        A0k.append(1BJ.A00(611));
        A0k.append(this.A07);
        A0k.append(", relativePosition=");
        A0k.append(this.A02);
        A0k.append(DKB.A00(11));
        A0k.append(this.A0H);
        A0k.append(", reshareAuthorId=");
        A0k.append(this.A0I);
        A0k.append(", resharePostId=");
        A0k.append(this.A0J);
        A0k.append(", sectionType=");
        A0k.append(this.A0K);
        A0k.append(", shareSessionId=");
        A0k.append(this.A0L);
        A0k.append(", shareSource=");
        A0k.append(this.A0M);
        A0k.append(", sheetState=");
        A0k.append(this.A06);
        A0k.append(", sourceThreadId=");
        A0k.append(this.A0N);
        A0k.append(4YT.A00(206));
        A0k.append(this.A0O);
        A0k.append(4YT.A00(207));
        A0k.append(this.A0P);
        A0k.append(", threadId=");
        A0k.append(this.A04);
        A0k.append(", tileBadge=");
        A0k.append(this.A0Q);
        A0k.append(", transportType=");
        A0k.append(this.A03);
        A0k.append(", videoCallLinkId=");
        A0k.append(this.A0A);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A0B);
        parcel.writeString(this.A0C);
        C3o5.A0g(parcel, this.A09);
        1BL.A13(parcel, this.A0D);
        parcel.writeInt(this.A01);
        AbN.A0s(parcel, this.A08);
        1BL.A13(parcel, this.A0E);
        1BL.A13(parcel, this.A0F);
        1BL.A13(parcel, this.A0G);
        C3o5.A0e(parcel, this.A05);
        ImmutableMap immutableMap = this.A07;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbG.A1G(parcel, immutableMap);
            1Du A0i = 4YU.A0i(immutableMap);
            while (A0i.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0i);
                parcel.writeLong(AnonymousClass001.A05(A0z.getKey()));
                7zN.A0z(parcel, (AnonymousClass550) A0z.getValue());
            }
        }
        parcel.writeInt(this.A02);
        1BL.A13(parcel, this.A0H);
        1BL.A13(parcel, this.A0I);
        1BL.A13(parcel, this.A0J);
        1BL.A13(parcel, this.A0K);
        1BL.A13(parcel, this.A0L);
        parcel.writeString(this.A0M);
        7zN.A0z(parcel, this.A06);
        1BL.A13(parcel, this.A0N);
        1BL.A13(parcel, this.A0O);
        1BL.A13(parcel, this.A0P);
        parcel.writeLong(this.A04);
        1BL.A13(parcel, this.A0Q);
        parcel.writeInt(this.A03);
        C3o5.A0g(parcel, this.A0A);
        Iterator A0S2 = C3o5.A0S(parcel, this.A0R);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
    }
}
