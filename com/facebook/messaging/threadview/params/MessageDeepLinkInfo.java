package com.facebook.messaging.threadview.params;

import X.11T;
import X.1BL;
import X.1Du;
import X.82M;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.search.data.model.MessageSearchMatchRangesModel;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MessageDeepLinkInfo.class */
public final class MessageDeepLinkInfo implements Parcelable {
    public static volatile ImmutableList A08;
    public static volatile ImmutableList A09;
    public static final Parcelable.Creator CREATOR = new 82M(91);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final Set A07;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageDeepLinkInfo(Parcel parcel) {
        getClass().getClassLoader();
        int i = 0;
        this.A04 = parcel.readInt() != 1 ? false : true;
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            int readInt = parcel.readInt();
            HighlightRange[] highlightRangeArr = new HighlightRange[readInt];
            for (int i2 = 0; i2 < readInt; i2++) {
                highlightRangeArr[i2] = HighlightRange.CREATOR.createFromParcel(parcel);
            }
            this.A05 = ImmutableList.copyOf(highlightRangeArr);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            MessageSearchMatchRangesModel[] messageSearchMatchRangesModelArr = new MessageSearchMatchRangesModel[readInt2];
            for (int i3 = 0; i3 < readInt2; i3++) {
                messageSearchMatchRangesModelArr[i3] = MessageSearchMatchRangesModel.CREATOR.createFromParcel(parcel);
            }
            immutableList = ImmutableList.copyOf(messageSearchMatchRangesModelArr);
        }
        this.A06 = immutableList;
        this.A00 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A01 = parcel.readLong();
        HashSet hashSet = new HashSet();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A07 = Collections.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006e, code lost:
    
        if (r301.A01 != (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageDeepLinkInfo(com.google.common.collect.ImmutableList r302, com.google.common.collect.ImmutableList r303, java.lang.String r304, java.lang.String r305, java.util.Set r306, long r307, long r309, boolean r311) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r311
            r312 = r0
            r0 = r301
            r1 = r311
            r0.A04 = r1
            r0 = r301
            r1 = r302
            r0.A05 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A06 = r1
            r0 = r301
            r1 = r307
            r0.A00 = r1
            java.lang.String r0 = "query"
            r1 = r305
            X.C1pq.A08(r0, r1)
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r309
            r0.A01 = r1
            r0 = r306
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r313 = r0
            r0 = r301
            r1 = r313
            r0.A07 = r1
            r0 = r301
            java.lang.String r0 = r0.A02
            r313 = r0
            r0 = r313
            boolean r0 = X.1JF.A0B(r0)
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L71
            r0 = r301
            long r0 = r0.A01
            r314 = r0
            r0 = -1
            long r0 = (long) r0
            r316 = r0
            r0 = r314
            r1 = r316
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r318 = r0
            r0 = 0
            r312 = r0
            r0 = 0
            r313 = r0
            r0 = r318
            if (r0 == 0) goto L74
        L71:
            r0 = 1
            r312 = r0
        L74:
            r0 = r312
            X.02W.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadview.params.MessageDeepLinkInfo.<init>(com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, java.lang.String, java.lang.String, java.util.Set, long, long, boolean):void");
    }

    public ImmutableList A00() {
        if (this.A07.contains("highlightRanges")) {
            return this.A05;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = ImmutableList.of();
                }
            }
        }
        return A08;
    }

    public ImmutableList A01() {
        if (this.A07.contains("messageSearchMatchRanges")) {
            return this.A06;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = ImmutableList.of();
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
            if (!(obj instanceof MessageDeepLinkInfo)) {
                return false;
            }
            MessageDeepLinkInfo messageDeepLinkInfo = (MessageDeepLinkInfo) obj;
            if (this.A04 != messageDeepLinkInfo.A04 || !11T.A0O(A00(), messageDeepLinkInfo.A00()) || !11T.A0O(this.A02, messageDeepLinkInfo.A02) || !11T.A0O(A01(), messageDeepLinkInfo.A01()) || this.A00 != messageDeepLinkInfo.A00 || !11T.A0O(this.A03, messageDeepLinkInfo.A03) || this.A01 != messageDeepLinkInfo.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return C1pq.A01(C1pq.A04(this.A03, C1pq.A01(C1pq.A04(A01(), C1pq.A04(this.A02, C1pq.A04(A00(), i + 31))), this.A00)), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        ImmutableList immutableList = this.A05;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                ((HighlightRange) A0b.next()).writeToParcel(parcel, i);
            }
        }
        String str = this.A02;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        ImmutableList immutableList2 = this.A06;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                ((MessageSearchMatchRangesModel) A0b2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        Set set = this.A07;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3o5.A0h(parcel, it);
        }
    }
}
