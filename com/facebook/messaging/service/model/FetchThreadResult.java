package com.facebook.messaging.service.model;

import X.1BL;
import X.4YV;
import X.5Xx;
import X.82M;
import X.AnonymousClass001;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadMetadata;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: FetchThreadResult.class */
public final class FetchThreadResult implements Parcelable {
    public static final FetchThreadResult A0C = new FetchThreadResult(DataFetchDisposition.A0I, null, null, null, 5Xx.A03, ImmutableList.of(), null, null, null, -1, false, false);
    public static final Parcelable.Creator CREATOR = new 82M(86);
    public Map A00;
    public final long A01;
    public final DataFetchDisposition A02;
    public final MessagesCollection A03;
    public final ThreadMetadata A04;
    public final ThreadSummary A05;
    public final 5Xx A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public FetchThreadResult(Parcel parcel) {
        String readString = parcel.readString();
        this.A06 = readString == null ? 5Xx.A03 : 5Xx.valueOf(readString);
        DataFetchDisposition dataFetchDisposition = (DataFetchDisposition) 1BL.A0C(parcel, DataFetchDisposition.class);
        this.A02 = dataFetchDisposition == null ? DataFetchDisposition.A0I : dataFetchDisposition;
        this.A05 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
        this.A04 = (ThreadMetadata) 1BL.A0C(parcel, ThreadMetadata.class);
        this.A03 = (MessagesCollection) 1BL.A0C(parcel, MessagesCollection.class);
        HashMap A0u = AnonymousClass001.A0u();
        parcel.readMap(A0u, Map.class.getClassLoader());
        this.A00 = ImmutableMap.copyOf((Map) A0u);
        ArrayList A0y = 4YV.A0y(parcel, User.class);
        this.A07 = A0y != null ? ImmutableList.copyOf((Collection) A0y) : ImmutableList.of();
        this.A01 = parcel.readLong();
        this.A0B = C53v.A0S(parcel);
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0A = C53v.A0S(parcel);
    }

    public FetchThreadResult(DataFetchDisposition dataFetchDisposition, MessagesCollection messagesCollection, ThreadMetadata threadMetadata, ThreadSummary threadSummary, 5Xx r306, ImmutableList immutableList, String str, String str2, Map map, long j, boolean z, boolean z2) {
        this.A06 = r306;
        this.A02 = dataFetchDisposition;
        this.A05 = threadSummary;
        this.A04 = threadMetadata;
        this.A03 = messagesCollection;
        this.A07 = immutableList;
        this.A00 = map;
        this.A01 = j;
        this.A0B = z;
        this.A0A = z2;
        this.A09 = str;
        this.A08 = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r0 == X.C1yg.MARKETPLACE) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(com.facebook.messaging.service.model.FetchThreadParams r301, com.facebook.messaging.service.model.FetchThreadResult r302) {
        /*
            r0 = r301
            java.lang.Class r0 = r0.getClass()
            r0 = r302
            if (r0 == 0) goto L61
            r0 = r302
            com.facebook.messaging.model.threads.ThreadSummary r0 = r0.A05
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L61
            r0 = r303
            boolean r0 = r0.A2b
            r304 = r0
            r0 = r303
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            X.1yg r0 = r0.A06
            r305 = r0
            X.1yg r0 = X.C1yg.ONE_TO_ONE
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L44
            X.1yg r0 = X.C1yg.GROUP
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L44
            X.1yg r0 = X.C1yg.MARKETPLACE
            r303 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L47
        L44:
            r0 = 1
            r307 = r0
        L47:
            r0 = r301
            boolean r0 = r0.A00
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L5e
            r0 = r304
            if (r0 != 0) goto L5e
            r0 = r307
            if (r0 == 0) goto L5e
            r0 = 1
            r306 = r0
        L5e:
            r0 = r306
            return r0
        L61:
            r0 = r301
            boolean r0 = r0.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.service.model.FetchThreadResult.A00(com.facebook.messaging.service.model.FetchThreadParams, com.facebook.messaging.service.model.FetchThreadResult):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06.toString());
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeMap(this.A00);
        parcel.writeList(this.A07);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
