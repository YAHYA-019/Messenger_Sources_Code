package com.facebook.messaging.omnipicker.datamodel;

import X.11T;
import X.1BK;
import X.1BL;
import X.1BM;
import X.1Bi;
import X.1Du;
import X.1Wa;
import X.4YU;
import X.4YV;
import X.7zN;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.BLj;
import X.C1pq;
import X.C3o5;
import X.CIr;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: M4OmnipickerParam.class */
public final class M4OmnipickerParam implements Parcelable {
    public static volatile ImmutableList A0g;
    public static volatile Integer A0h;
    public static volatile Integer A0i;
    public static volatile Integer A0j;
    public static final Parcelable.Creator CREATOR = CST.A00(94);
    public final ThreadKey A00;
    public final BLj A01;
    public final ImmutableList A02;
    public final ImmutableMap A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final MediaResource A0W;
    public final ImmutableList A0X;
    public final Integer A0Y;
    public final Integer A0Z;
    public final Integer A0a;
    public final String A0b;
    public final Set A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;

    public M4OmnipickerParam(CIr cIr) {
        this.A04 = cIr.A07;
        this.A05 = cIr.A08;
        this.A06 = cIr.A09;
        String str = cIr.A0A;
        C1pq.A08("bcfShareSource", str);
        this.A07 = str;
        this.A08 = cIr.A0B;
        BLj bLj = cIr.A01;
        C1pq.A08("entryPoint", bLj);
        this.A01 = bLj;
        this.A09 = cIr.A0C;
        this.A0A = cIr.A0D;
        this.A0b = null;
        this.A0B = cIr.A0E;
        this.A0W = null;
        this.A0Y = cIr.A04;
        this.A0Z = cIr.A05;
        this.A0G = cIr.A0K;
        this.A0H = cIr.A0L;
        this.A0I = cIr.A0M;
        this.A0J = cIr.A0N;
        this.A0K = cIr.A0O;
        this.A0L = cIr.A0P;
        this.A0M = cIr.A0Q;
        this.A0N = cIr.A0R;
        this.A0O = cIr.A0S;
        this.A0P = cIr.A0T;
        this.A0Q = cIr.A0U;
        this.A0R = false;
        this.A0S = false;
        this.A0T = false;
        this.A03 = cIr.A03;
        this.A0C = cIr.A0F;
        this.A0a = cIr.A06;
        this.A0d = false;
        this.A0U = cIr.A0V;
        this.A0V = cIr.A0W;
        this.A0e = false;
        this.A0f = false;
        this.A00 = cIr.A00;
        this.A0D = cIr.A0G;
        this.A0E = cIr.A0H;
        this.A0F = cIr.A0I;
        this.A02 = null;
        this.A0X = cIr.A02;
        this.A0c = Collections.unmodifiableSet(cIr.A0J);
        if (A02() <= 0) {
            throw 1BK.A0g();
        }
    }

    public M4OmnipickerParam(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A01 = BLj.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0b = null;
        } else {
            this.A0b = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (MediaResource) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = AbI.A0z(parcel);
        }
        int i = 0;
        this.A0G = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0H = 1BM.A07(parcel);
        this.A0I = 1BM.A07(parcel);
        this.A0J = 1BM.A07(parcel);
        this.A0K = 1BM.A07(parcel);
        this.A0L = 1BM.A07(parcel);
        this.A0M = 1BM.A07(parcel);
        this.A0N = 1BM.A07(parcel);
        this.A0O = 1BM.A07(parcel);
        this.A0P = 1BM.A07(parcel);
        this.A0Q = 1BM.A07(parcel);
        this.A0R = 1BM.A07(parcel);
        this.A0S = 1BM.A07(parcel);
        this.A0T = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbL.A01(parcel, A0u, i2);
            }
            this.A03 = ImmutableMap.copyOf((Map) A0u);
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = AbI.A0z(parcel);
        }
        this.A0d = 1BM.A07(parcel);
        this.A0U = 1BM.A07(parcel);
        this.A0V = 1BM.A07(parcel);
        this.A0e = 1BM.A07(parcel);
        this.A0f = AbJ.A1V(parcel);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = parcel.readString();
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
            this.A02 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr = new String[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbH.A00(parcel, strArr, i3);
            }
            this.A02 = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            String[] strArr2 = new String[readInt3];
            int i4 = 0;
            while (i4 < readInt3) {
                i4 = AbH.A00(parcel, strArr2, i4);
            }
            immutableList = ImmutableList.copyOf(strArr2);
        }
        this.A0X = immutableList;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt4 = parcel.readInt();
        while (i < readInt4) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0c = Collections.unmodifiableSet(A0v);
    }

    public int A00() {
        Integer num;
        if (this.A0c.contains("headerButtonTextResId")) {
            num = this.A0Y;
        } else {
            if (A0h == null) {
                synchronized (this) {
                    if (A0h == null) {
                        A0h = 2131962464;
                    }
                }
            }
            num = A0h;
        }
        return num.intValue();
    }

    public int A01() {
        Integer num;
        if (this.A0c.contains("headerTextResId")) {
            num = this.A0Z;
        } else {
            if (A0i == null) {
                synchronized (this) {
                    if (A0i == null) {
                        int i = 2131960514;
                        if (((1Wa) 1Bi.A03(66347)).A00()) {
                            i = 2131960515;
                        }
                        A0i = Integer.valueOf(i);
                    }
                }
            }
            num = A0i;
        }
        return num.intValue();
    }

    public int A02() {
        Integer num;
        if (this.A0c.contains("pickedUserCountForGroupCreateOnly")) {
            num = this.A0a;
        } else {
            if (A0j == null) {
                synchronized (this) {
                    if (A0j == null) {
                        A0j = 2;
                    }
                }
            }
            num = A0j;
        }
        return num.intValue();
    }

    public ImmutableList A03() {
        if (this.A0c.contains("whitelistUserIds")) {
            return this.A0X;
        }
        if (A0g == null) {
            synchronized (this) {
                if (A0g == null) {
                    A0g = 1BK.A0b();
                }
            }
        }
        return A0g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof M4OmnipickerParam)) {
                return false;
            }
            M4OmnipickerParam m4OmnipickerParam = (M4OmnipickerParam) obj;
            if (!11T.A0O(this.A04, m4OmnipickerParam.A04) || !11T.A0O(this.A05, m4OmnipickerParam.A05) || !11T.A0O(this.A06, m4OmnipickerParam.A06) || !11T.A0O(this.A07, m4OmnipickerParam.A07) || !11T.A0O(this.A08, m4OmnipickerParam.A08) || this.A01 != m4OmnipickerParam.A01 || !11T.A0O(this.A09, m4OmnipickerParam.A09) || !11T.A0O(this.A0A, m4OmnipickerParam.A0A) || !11T.A0O(this.A0b, m4OmnipickerParam.A0b) || !11T.A0O(this.A0B, m4OmnipickerParam.A0B) || !11T.A0O(this.A0W, m4OmnipickerParam.A0W) || A00() != m4OmnipickerParam.A00() || A01() != m4OmnipickerParam.A01() || this.A0G != m4OmnipickerParam.A0G || this.A0H != m4OmnipickerParam.A0H || this.A0I != m4OmnipickerParam.A0I || this.A0J != m4OmnipickerParam.A0J || this.A0K != m4OmnipickerParam.A0K || this.A0L != m4OmnipickerParam.A0L || this.A0M != m4OmnipickerParam.A0M || this.A0N != m4OmnipickerParam.A0N || this.A0O != m4OmnipickerParam.A0O || this.A0P != m4OmnipickerParam.A0P || this.A0Q != m4OmnipickerParam.A0Q || this.A0R != m4OmnipickerParam.A0R || this.A0S != m4OmnipickerParam.A0S || this.A0T != m4OmnipickerParam.A0T || !11T.A0O(this.A03, m4OmnipickerParam.A03) || !11T.A0O(this.A0C, m4OmnipickerParam.A0C) || A02() != m4OmnipickerParam.A02() || this.A0d != m4OmnipickerParam.A0d || this.A0U != m4OmnipickerParam.A0U || this.A0V != m4OmnipickerParam.A0V || this.A0e != m4OmnipickerParam.A0e || this.A0f != m4OmnipickerParam.A0f || !11T.A0O(this.A00, m4OmnipickerParam.A00) || !11T.A0O(this.A0D, m4OmnipickerParam.A0D) || !11T.A0O(this.A0E, m4OmnipickerParam.A0E) || !11T.A0O(this.A0F, m4OmnipickerParam.A0F) || !11T.A0O(this.A02, m4OmnipickerParam.A02) || !11T.A0O(A03(), m4OmnipickerParam.A03())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A03(this.A04)))));
        return C1pq.A04(A03(), C1pq.A04(this.A02, C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A0D, C1pq.A04(this.A00, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((C1pq.A04(this.A0C, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((((C1pq.A04(this.A0W, C1pq.A04(this.A0B, C1pq.A04(this.A0b, C1pq.A04(this.A0A, C1pq.A04(this.A09, (A04 * 31) + C3o5.A03(this.A01)))))) * 31) + A00()) * 31) + A01(), this.A0G), this.A0H), this.A0I), this.A0J), this.A0K), this.A0L), this.A0M), this.A0N), this.A0O), this.A0P), this.A0Q), this.A0R), this.A0S), this.A0T))) * 31) + A02(), this.A0d), this.A0U), this.A0V), this.A0e), this.A0f)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        parcel.writeString(this.A07);
        1BL.A13(parcel, this.A08);
        7zN.A0z(parcel, this.A01);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0b);
        1BL.A13(parcel, this.A0B);
        C3o5.A0d(parcel, this.A0W, i);
        C3o5.A0f(parcel, this.A0Y);
        C3o5.A0f(parcel, this.A0Z);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        ImmutableMap immutableMap = this.A03;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbG.A1G(parcel, immutableMap);
            1Du A0i2 = 4YU.A0i(immutableMap);
            while (A0i2.hasNext()) {
                AbL.A0n(parcel, A0i2);
            }
        }
        1BL.A13(parcel, this.A0C);
        C3o5.A0f(parcel, this.A0a);
        parcel.writeInt(this.A0d ? 1 : 0);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeInt(this.A0e ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        ThreadKey threadKey = this.A00;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A0D);
        1BL.A13(parcel, this.A0E);
        1BL.A13(parcel, this.A0F);
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        ImmutableList immutableList2 = this.A0X;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0c);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
