package com.facebook.messaging.service.model;

import X.1BL;
import X.4YV;
import X.C1n3;
import X.C53v;
import X.CSS;
import X.D3Y;
import X.DAj;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: FetchThreadKeyByParticipantsParams.class */
public final class FetchThreadKeyByParticipantsParams implements Parcelable {
    public static final Comparator A07 = new DAj(4);
    public static final Parcelable.Creator CREATOR = CSS.A00(97);
    public final UserKey A00;
    public final ImmutableSet A03;
    public final ImmutableSet A04;
    public final boolean A05;
    public final boolean A06;
    public final Predicate A02 = new D3Y(this, 23);
    public final Predicate A01 = new D3Y(this, 24);

    public FetchThreadKeyByParticipantsParams(Parcel parcel) {
        this.A00 = (UserKey) 1BL.A0C(parcel, UserKey.class);
        ArrayList A0y = 4YV.A0y(parcel, List.class);
        HashSet A04 = A0y == null ? null : C1n3.A04(A0y);
        A04.getClass();
        this.A03 = ImmutableSet.A07(A04);
        ArrayList A0y2 = 4YV.A0y(parcel, List.class);
        HashSet A042 = A0y2 == null ? null : C1n3.A04(A0y2);
        A042.getClass();
        this.A04 = ImmutableSet.A07(A042);
        this.A06 = C53v.A0S(parcel);
        this.A05 = C53v.A0S(parcel);
    }

    public FetchThreadKeyByParticipantsParams(UserKey userKey, Set set, Set set2, boolean z, boolean z2) {
        this.A00 = userKey;
        this.A03 = ImmutableSet.A07(set);
        this.A04 = ImmutableSet.A07(set2);
        this.A06 = z;
        this.A05 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r301.A0n.A12() != r302.A05) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(com.facebook.messaging.model.threads.ThreadSummary r301, com.facebook.messaging.service.model.FetchThreadKeyByParticipantsParams r302) {
        /*
            r0 = r301
            X.214 r0 = r0.B0N()
            r303 = r0
            X.214 r0 = X.AnonymousClass214.A03
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L4a
            r0 = r301
            boolean r0 = r0.A2i
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4a
            r0 = r301
            boolean r0 = X.2Gt.A08(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2f
            r0 = r302
            boolean r0 = r0.A06
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L4a
        L2f:
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r304 = r0
            r0 = r304
            boolean r0 = r0.A12()
            r306 = r0
            r0 = r302
            boolean r0 = r0.A05
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L4f
        L4a:
            r0 = 0
            r305 = r0
            r0 = 0
            r304 = r0
        L4f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.service.model.FetchThreadKeyByParticipantsParams.A00(com.facebook.messaging.model.threads.ThreadSummary, com.facebook.messaging.service.model.FetchThreadKeyByParticipantsParams):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        C53v.A0R(parcel, this.A03);
        C53v.A0R(parcel, this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
