package com.facebook.fbservice.results;

import X.0eM;
import X.1JW;
import X.3dP;
import X.AnonymousClass235;
import X.C0dw;
import X.C2xc;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.google.common.base.MoreObjects;
import java.util.Iterator;
import java.util.List;

/* loaded from: DataFetchDisposition.class */
public final class DataFetchDisposition implements Parcelable {
    public static final DataFetchDisposition A09;
    public static final DataFetchDisposition A0A;
    public static final DataFetchDisposition A0B;
    public static final DataFetchDisposition A0C;
    public static final DataFetchDisposition A0D;
    public static final DataFetchDisposition A0E;
    public static final DataFetchDisposition A0F;
    public static final DataFetchDisposition A0G;
    public static final DataFetchDisposition A0H;
    public static final DataFetchDisposition A0I = new DataFetchDisposition();
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final TriState A01;
    public final TriState A02;
    public final TriState A03;
    public final TriState A04;
    public final TriState A05;
    public final TriState A06;
    public final AnonymousClass235 A07;
    public final boolean A08;

    static {
        TriState triState = TriState.UNSET;
        AnonymousClass235 anonymousClass235 = AnonymousClass235.SERVER;
        TriState triState2 = TriState.YES;
        TriState triState3 = TriState.NO;
        A0H = new DataFetchDisposition(triState, triState2, triState, triState3, triState, triState3, anonymousClass235, 2);
        AnonymousClass235 anonymousClass2352 = AnonymousClass235.IN_MEMORY_CACHE;
        A0D = new DataFetchDisposition(triState, triState3, triState, triState3, triState, triState3, anonymousClass2352, 0);
        A0C = new DataFetchDisposition(triState, triState3, triState, triState2, triState, triState3, anonymousClass2352, 0);
        AnonymousClass235 anonymousClass2353 = AnonymousClass235.LOCAL_DISK_CACHE;
        A0F = new DataFetchDisposition(triState, triState3, triState, triState3, triState, triState3, anonymousClass2353, 1);
        A0G = new DataFetchDisposition(triState, triState3, triState2, triState3, triState, triState3, anonymousClass2353, 1);
        A0E = new DataFetchDisposition(triState, triState3, triState, triState2, triState, triState3, anonymousClass2353, 1);
        AnonymousClass235 anonymousClass2354 = AnonymousClass235.LOCAL_UNSPECIFIED_CACHE;
        A0B = new DataFetchDisposition(triState, triState3, triState, triState3, triState, triState3, anonymousClass2354, 1);
        new DataFetchDisposition(triState, triState3, triState, triState2, triState, triState3, anonymousClass2354, 1);
        A09 = new DataFetchDisposition(triState2, triState3, triState, triState2, triState, triState3, anonymousClass2354, 1);
        A0A = new DataFetchDisposition(triState, triState3, triState2, triState, triState, triState3, anonymousClass2354, 1);
        new DataFetchDisposition(triState, triState2, triState, triState3, triState, triState3, AnonymousClass235.SMS, 1);
        CREATOR = new C2xc(6);
    }

    public DataFetchDisposition() {
        this.A08 = false;
        this.A07 = null;
        TriState triState = TriState.UNSET;
        this.A02 = triState;
        this.A04 = triState;
        this.A03 = triState;
        this.A01 = triState;
        this.A05 = triState;
        this.A06 = triState;
        this.A00 = -1;
    }

    public DataFetchDisposition(Parcel parcel) {
        this.A08 = C53v.A0S(parcel);
        this.A07 = (AnonymousClass235) parcel.readSerializable();
        this.A02 = (TriState) parcel.readSerializable();
        this.A04 = (TriState) parcel.readSerializable();
        this.A03 = (TriState) parcel.readSerializable();
        this.A01 = (TriState) parcel.readSerializable();
        this.A05 = (TriState) parcel.readSerializable();
        this.A06 = (TriState) parcel.readSerializable();
        this.A00 = parcel.readInt();
    }

    public DataFetchDisposition(TriState triState, TriState triState2, TriState triState3, TriState triState4, TriState triState5, TriState triState6, AnonymousClass235 anonymousClass235, int i) {
        this.A08 = true;
        anonymousClass235.getClass();
        this.A07 = anonymousClass235;
        triState2.getClass();
        this.A02 = triState2;
        triState4.getClass();
        this.A04 = triState4;
        triState3.getClass();
        this.A03 = triState3;
        triState.getClass();
        this.A01 = triState;
        triState5.getClass();
        this.A05 = triState5;
        triState6.getClass();
        this.A06 = triState6;
        this.A00 = i;
    }

    public static DataFetchDisposition A00(List list) {
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                return (DataFetchDisposition) list.get(0);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() != A0I) {
                    AnonymousClass235 anonymousClass235 = AnonymousClass235.COMPOSED;
                    TriState A00 = 0eM.A00(0eM.A00, TriState.NO, 1JW.A04(new 3dP(2), list));
                    List A04 = 1JW.A04(new 3dP(3), list);
                    C0dw c0dw = 0eM.A01;
                    TriState triState = TriState.YES;
                    TriState A002 = 0eM.A00(c0dw, triState, A04);
                    TriState A003 = 0eM.A00(c0dw, triState, 1JW.A04(new 3dP(4), list));
                    TriState A004 = 0eM.A00(c0dw, triState, 1JW.A04(new 3dP(5), list));
                    TriState A005 = 0eM.A00(c0dw, triState, 1JW.A04(new 3dP(6), list));
                    TriState A006 = 0eM.A00(c0dw, triState, 1JW.A04(new 3dP(7), list));
                    int i = ((DataFetchDisposition) list.get(0)).A00;
                    for (int i2 = 1; i2 < list.size(); i2++) {
                        int i3 = ((DataFetchDisposition) list.get(i2)).A00;
                        if (i < i3) {
                            i = i3;
                        }
                    }
                    return new DataFetchDisposition(A004, A00, A003, A002, A005, A006, anonymousClass235, i);
                }
            }
        }
        return A0I;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("dataSource", this.A07);
        stringHelper.add("fromAuthoritativeData", this.A02);
        stringHelper.add("isStaleData", this.A04);
        stringHelper.add("isIncompleteData", this.A03);
        stringHelper.add("fellbackToCachedDataAfterFailedToHitServer", this.A01);
        stringHelper.add("needsInitialFetch", this.A05);
        stringHelper.add("wasFetchSynchronous", this.A06);
        stringHelper.add("performanceCategory", this.A00);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeSerializable(this.A07);
        parcel.writeSerializable(this.A02);
        parcel.writeSerializable(this.A04);
        parcel.writeSerializable(this.A03);
        parcel.writeSerializable(this.A01);
        parcel.writeSerializable(this.A05);
        parcel.writeSerializable(this.A06);
        parcel.writeInt(this.A00);
    }
}
