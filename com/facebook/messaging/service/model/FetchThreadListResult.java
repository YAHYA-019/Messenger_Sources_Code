package com.facebook.messaging.service.model;

import X.1BL;
import X.1F9;
import X.1V0;
import X.AnonymousClass001;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.folders.FolderCounts;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ThreadMetadata;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.user.model.User;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: FetchThreadListResult.class */
public final class FetchThreadListResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(43);
    public final long A00;
    public final long A01;
    public final DataFetchDisposition A02;
    public final FolderCounts A03;
    public final 1F9 A04;
    public final ThreadKey A05;
    public final NotificationSetting A06;
    public final ThreadsCollection A07;
    public final ImmutableList A08;
    public final ImmutableList A09;
    public final ImmutableList A0A;
    public final ImmutableMap A0B;
    public final ImmutableSet A0C;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (r0 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FetchThreadListResult(X.1V0 r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            com.facebook.fbservice.results.DataFetchDisposition r0 = r0.A02
            java.lang.Class r0 = r0.getClass()
            r0 = r302
            com.facebook.fbservice.results.DataFetchDisposition r0 = r0.A02
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r302
            X.1F9 r0 = r0.A04
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A04 = r1
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A05
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A05 = r1
            r0 = r303
            if (r0 != 0) goto L37
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L3a
        L37:
            r0 = 1
            r305 = r0
        L3a:
            r0 = r305
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r302
            com.facebook.messaging.model.threads.ThreadsCollection r0 = r0.A07
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A07 = r1
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A09
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A09 = r1
            r0 = r302
            java.util.List r0 = r0.A0C
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A0A = r1
            r0 = r302
            com.google.common.collect.ImmutableList r0 = r0.A08
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A08 = r1
            r0 = r302
            com.facebook.messaging.model.folders.FolderCounts r0 = r0.A03
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r302
            com.facebook.messaging.model.threads.NotificationSetting r0 = r0.A06
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A06 = r1
            r0 = r302
            long r0 = r0.A01
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A01 = r1
            r0 = r302
            long r0 = r0.A00
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A00 = r1
            r0 = r302
            com.google.common.collect.ImmutableSet r0 = r0.A0B
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A0C = r1
            r0 = r302
            com.google.common.collect.ImmutableMap r0 = r0.A0A
            r303 = r0
            r0 = r301
            r1 = r303
            r0.A0B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.service.model.FetchThreadListResult.<init>(X.1V0):void");
    }

    public FetchThreadListResult(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, DataFetchDisposition.class);
        A0C.getClass();
        this.A02 = (DataFetchDisposition) A0C;
        String readString = parcel.readString();
        ImmutableSet immutableSet = null;
        this.A04 = readString == null ? null : 1F9.A00(readString);
        this.A05 = ThreadKey.A0K(parcel.readString(), true);
        Parcelable A0C2 = 1BL.A0C(parcel, ThreadsCollection.class);
        A0C2.getClass();
        this.A07 = (ThreadsCollection) A0C2;
        ArrayList readArrayList = parcel.readArrayList(ThreadMetadata.class.getClassLoader());
        readArrayList.getClass();
        this.A09 = ImmutableList.copyOf((Collection) readArrayList);
        ArrayList readArrayList2 = parcel.readArrayList(User.class.getClassLoader());
        readArrayList2.getClass();
        this.A0A = ImmutableList.copyOf((Collection) readArrayList2);
        ArrayList readArrayList3 = parcel.readArrayList(MessagesCollection.class.getClassLoader());
        readArrayList3.getClass();
        this.A08 = ImmutableList.copyOf((Collection) readArrayList3);
        Parcelable A0C3 = 1BL.A0C(parcel, FolderCounts.class);
        A0C3.getClass();
        this.A03 = (FolderCounts) A0C3;
        this.A06 = (NotificationSetting) 1BL.A0C(parcel, NotificationSetting.class);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        ArrayList readArrayList4 = parcel.readArrayList(ThreadKey.class.getClassLoader());
        this.A0C = readArrayList4 != null ? ImmutableSet.A07(readArrayList4) : immutableSet;
        HashMap A0u = AnonymousClass001.A0u();
        parcel.readMap(A0u, ThreadKey.class.getClassLoader());
        this.A0B = ImmutableMap.copyOf((Map) A0u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r305 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FetchThreadListResult(com.facebook.fbservice.results.DataFetchDisposition r302, com.facebook.messaging.model.folders.FolderCounts r303, X.1F9 r304, com.facebook.messaging.model.threadkey.ThreadKey r305, com.facebook.messaging.model.threads.NotificationSetting r306, com.facebook.messaging.model.threads.ThreadsCollection r307, com.google.common.collect.ImmutableList r308, com.google.common.collect.ImmutableList r309, com.google.common.collect.ImmutableMap r310, com.google.common.collect.ImmutableSet r311, java.util.List r312, long r313, long r315) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r304
            r0.A04 = r1
            r0 = r301
            r1 = r305
            r0.A05 = r1
            r0 = r304
            if (r0 != 0) goto L28
            r0 = 0
            r317 = r0
            r0 = 0
            r318 = r0
            r0 = r305
            if (r0 == 0) goto L2b
        L28:
            r0 = 1
            r317 = r0
        L2b:
            r0 = r317
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r301
            r1 = r307
            r0.A07 = r1
            r0 = r309
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            r318 = r0
            r0 = r301
            r1 = r318
            r0.A09 = r1
            r0 = r312
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
            r318 = r0
            r0 = r301
            r1 = r318
            r0.A0A = r1
            r0 = r301
            r1 = r308
            r0.A08 = r1
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r301
            r1 = r306
            r0.A06 = r1
            r0 = r301
            r1 = r315
            r0.A01 = r1
            r0 = r301
            r1 = r313
            r0.A00 = r1
            r0 = r301
            r1 = r311
            r0.A0C = r1
            r0 = r301
            r1 = r310
            r0.A0B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.service.model.FetchThreadListResult.<init>(com.facebook.fbservice.results.DataFetchDisposition, com.facebook.messaging.model.folders.FolderCounts, X.1F9, com.facebook.messaging.model.threadkey.ThreadKey, com.facebook.messaging.model.threads.NotificationSetting, com.facebook.messaging.model.threads.ThreadsCollection, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableMap, com.google.common.collect.ImmutableSet, java.util.List, long, long):void");
    }

    public static FetchThreadListResult A00(1F9 r301, ThreadKey threadKey, long j) {
        1V0 r0 = new 1V0();
        r0.A02 = DataFetchDisposition.A0I;
        r0.A04 = r301;
        r0.A05 = threadKey;
        r0.A00 = j;
        return new FetchThreadListResult(r0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof FetchThreadListResult)) {
                return false;
            }
            FetchThreadListResult fetchThreadListResult = (FetchThreadListResult) obj;
            if (Objects.equal(Long.valueOf(this.A00), Long.valueOf(fetchThreadListResult.A00)) && Objects.equal(this.A02, fetchThreadListResult.A02) && Objects.equal(this.A04, fetchThreadListResult.A04) && Objects.equal(this.A05, fetchThreadListResult.A05) && Objects.equal(this.A03, fetchThreadListResult.A03) && Objects.equal(this.A06, fetchThreadListResult.A06) && Objects.equal(this.A08, fetchThreadListResult.A08) && Objects.equal(Long.valueOf(this.A01), Long.valueOf(fetchThreadListResult.A01)) && Objects.equal(this.A07, fetchThreadListResult.A07) && Objects.equal(this.A09, fetchThreadListResult.A09) && Objects.equal(this.A0A, fetchThreadListResult.A0A) && Objects.equal(this.A0C, fetchThreadListResult.A0C)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A02, this.A04, this.A05, this.A03, this.A06, this.A08, Long.valueOf(this.A01), this.A07, this.A09, this.A0A, this.A0C});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        1F9 r0 = this.A04;
        ImmutableList immutableList = null;
        parcel.writeString(r0 == null ? null : r0.dbName);
        ThreadKey threadKey = this.A05;
        parcel.writeString(threadKey == null ? null : threadKey.A0u());
        parcel.writeParcelable(this.A07, i);
        parcel.writeList(this.A09);
        parcel.writeList(this.A0A);
        parcel.writeList(this.A08);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        ImmutableSet immutableSet = this.A0C;
        if (immutableSet != null) {
            immutableList = immutableSet.asList();
        }
        parcel.writeList(immutableList);
        parcel.writeMap(this.A0B);
    }
}
