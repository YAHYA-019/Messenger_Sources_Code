package com.facebook.messaging.model.threads;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.C53v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLLightweightEventType;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableMap;

/* loaded from: ThreadEventReminder.class */
public final class ThreadEventReminder implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(75);
    public final long A00;
    public final long A01;
    public final GraphQLLightweightEventType A02;
    public final ThreadKey A03;
    public final UserKey A04;
    public final ImmutableMap A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public ThreadEventReminder(Parcel parcel) {
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = readString;
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A0B = 4YV.A1V(parcel.readInt(), 1);
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A09 = readString2;
        int readInt = parcel.readInt();
        if (readInt != -1) {
            ImmutableMap.Builder A0c = 1BK.A0c();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < readInt) {
                    Parcelable A0C = 1BL.A0C(parcel, UserKey.class);
                    if (A0C == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    GraphQLStringDefUtil A00 = GraphQLStringDefUtil.A00();
                    String readString3 = parcel.readString();
                    if (readString3 == null) {
                        throw AnonymousClass001.A0N("Required value was null.");
                    }
                    A0c.put(A0C, A00.ATw("GraphQLLightweightEventGuestStatus", readString3));
                    i = i2 + 1;
                } else {
                    ImmutableMap build = A0c.build();
                    if (build != null) {
                        this.A05 = build;
                        this.A0A = C53v.A0S(parcel);
                        String readString4 = parcel.readString();
                        if (readString4 == null) {
                            throw AnonymousClass001.A0N("Required value was null.");
                        }
                        GraphQLLightweightEventType graphQLLightweightEventType = GraphQLLightweightEventType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                        GraphQLLightweightEventType graphQLLightweightEventType2 = (GraphQLLightweightEventType) EnumHelper.A00(graphQLLightweightEventType, readString4);
                        if (graphQLLightweightEventType2 == graphQLLightweightEventType) {
                            graphQLLightweightEventType2 = GraphQLLightweightEventType.EVENT;
                        } else {
                            11T.A0D(graphQLLightweightEventType2);
                        }
                        this.A02 = graphQLLightweightEventType2;
                        String readString5 = parcel.readString();
                        if (readString5 == null) {
                            throw AnonymousClass001.A0N("Required value was null.");
                        }
                        this.A07 = readString5;
                        Parcelable A0C2 = 1BL.A0C(parcel, UserKey.class);
                        if (A0C2 == null) {
                            throw AnonymousClass001.A0N("Required value was null.");
                        }
                        this.A04 = (UserKey) A0C2;
                        Parcelable A0C3 = 1BL.A0C(parcel, ThreadKey.class);
                        if (A0C3 == null) {
                            throw AnonymousClass001.A0N("Required value was null.");
                        }
                        this.A03 = (ThreadKey) A0C3;
                        String readString6 = parcel.readString();
                        if (readString6 == null) {
                            throw AnonymousClass001.A0N("Required value was null.");
                        }
                        this.A08 = readString6;
                        return;
                    }
                }
            }
        }
        throw AnonymousClass001.A0N("Required value was null.");
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ThreadEventReminder threadEventReminder = (ThreadEventReminder) obj;
        11T.A0F(threadEventReminder, 0);
        long j = this.A00;
        long j2 = threadEventReminder.A00;
        if (j < j2) {
            return -1;
        }
        return AnonymousClass001.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1))) ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ThreadEventReminder) && 11T.A0O(this.A06, ((ThreadEventReminder) obj).A06);
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A06(this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006a, code lost:
    
        if (r304 == null) goto L9;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threads.ThreadEventReminder.writeToParcel(android.os.Parcel, int):void");
    }
}
