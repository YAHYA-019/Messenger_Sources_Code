package com.facebook.graphql.executor;

import X.0AE;
import X.1JW;
import X.82M;
import X.AbstractC08294mh;
import X.C23u;
import X.EnumC08284mf;
import X.FJ8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphservice.interfaces.Summary;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: GraphQLResult.class */
public class GraphQLResult extends AbstractC08294mh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(3);
    public 0AE A00;
    public Set A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final Map A05;
    public final Map A06;
    public final boolean A07;
    public final Class A08;
    public final transient long A09;
    public final transient long A0A;

    public GraphQLResult(0AE r302, EnumC08284mf enumC08284mf, Summary summary, Object obj, String str, String str2, List list, Map map, Map map2, Set set, long j, long j2, long j3, boolean z) {
        super(enumC08284mf, summary, obj, j);
        this.A08 = obj == null ? null : obj.getClass();
        this.A01 = set;
        this.A06 = map;
        this.A05 = map2;
        this.A0A = j2;
        this.A09 = j3;
        this.A07 = z;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = r302;
        this.A04 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GraphQLResult(X.EnumC08284mf r302, com.facebook.graphservice.interfaces.Summary r303, java.lang.Object r304, long r305) {
        /*
            r301 = this;
            r0 = -1
            long r0 = (long) r0
            r307 = r0
            r0 = r301
            r1 = 0
            r2 = r302
            r3 = r303
            r4 = r304
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = r305
            r12 = r307
            r13 = r307
            r14 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.executor.GraphQLResult.<init>(X.4mf, com.facebook.graphservice.interfaces.Summary, java.lang.Object, long):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GraphQLResult(android.os.Parcel r302) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.executor.GraphQLResult.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object obj = super.A03;
        boolean z = true;
        if (obj instanceof List) {
            parcel.writeInt(1);
            FJ8.A0B(parcel, (List) obj);
        } else {
            if (obj != null && !(obj instanceof C23u)) {
                z = false;
            }
            Preconditions.checkState(z);
            parcel.writeInt(0);
            FJ8.A0A(parcel, (C23u) obj);
        }
        parcel.writeSerializable(super.A01);
        parcel.writeLong(super.A00);
        parcel.writeSerializable(this.A08);
        Set set = this.A01;
        parcel.writeList(set == null ? null : 1JW.A02(set));
        parcel.writeMap(this.A06);
        parcel.writeMap(this.A05);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeList(this.A04);
    }
}
