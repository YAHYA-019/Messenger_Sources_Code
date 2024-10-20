package com.facebook.messaging.model.threads;

import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Du;
import X.2Gt;
import X.AnonymousClass001;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: ThreadsCollection.class */
public final class ThreadsCollection implements Parcelable {
    public static final ThreadsCollection A03;
    public static final Parcelable.Creator CREATOR;
    public ImmutableList A00;
    public final ImmutableList A01;
    public final boolean A02;

    static {
        ImmutableList of = ImmutableList.of();
        11T.A0A(of);
        A03 = new ThreadsCollection(of, true);
        CREATOR = new C2xc(38);
    }

    public ThreadsCollection(Parcel parcel) {
        ArrayList readArrayList = parcel.readArrayList(ThreadSummary.class.getClassLoader());
        11T.A0I(readArrayList, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.messaging.model.threads.ThreadSummary>");
        this.A01 = 1BL.A0a(readArrayList);
        this.A02 = AnonymousClass001.A1N(parcel.readInt());
    }

    public ThreadsCollection(ImmutableList immutableList, boolean z) {
        11T.A0F(immutableList, 1);
        this.A01 = immutableList;
        this.A02 = z;
        1Du it = immutableList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (!((ThreadSummary) it.next()).A2j) {
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        1Du it2 = immutableList.iterator();
        ThreadSummary threadSummary = null;
        while (true) {
            ThreadSummary threadSummary2 = threadSummary;
            if (!it2.hasNext()) {
                return;
            }
            ThreadSummary threadSummary3 = (ThreadSummary) it2.next();
            if (threadSummary2 != null) {
                long j = threadSummary3.A0N;
                long j2 = threadSummary2.A0N;
                if (j > j2) {
                    0fH.A0o("ThreadsCollection", String.format("Threads were not in order, this[%s] timestamp=%d, last[%s] timestampMs=%d", threadSummary3.A0n, Long.valueOf(j), threadSummary2.A0n, Long.valueOf(j2)));
                    return;
                }
            }
            threadSummary = threadSummary3;
        }
    }

    public final ImmutableList A00() {
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = this.A01.iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) ((ThreadSummary) it.next()).A0n);
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            ThreadsCollection threadsCollection = (ThreadsCollection) obj;
            if (this.A02 != threadsCollection.A02 || !11T.A0O(this.A01, threadsCollection.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Boolean.valueOf(this.A02)});
    }

    public String toString() {
        ArrayList A0s = AnonymousClass001.A0s();
        1Du it = this.A01.iterator();
        while (it.hasNext()) {
            ThreadSummary threadSummary = (ThreadSummary) it.next();
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(threadSummary.A0n);
            A0k.append(':');
            A0k.append(2Gt.A0F(threadSummary));
            1BK.A1N(A0k, A0s);
        }
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("includesFirstThreadInFolder", this.A02);
        stringHelper.add("threadInfo", A0s);
        return 11T.A02(stringHelper);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
