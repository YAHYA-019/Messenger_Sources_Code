package com.facebook.spherical.video.model;

import X.0S2;
import X.11T;
import X.4YV;
import X.6VJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKe;
import X.HBk;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.spherical.model.PanoBounds;
import com.facebook.spherical.video.hotspot.model.HotspotParams;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: SphericalVideoParams.class */
public final class SphericalVideoParams implements Parcelable {
    public static volatile Integer A0D;
    public static final Parcelable.Creator CREATOR = new FKe(34);
    public final HBk A00;
    public final 6VJ A01;
    public final double A02;
    public final double A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final PanoBounds A07;
    public final HotspotParams A08;
    public final GuidedTourParams A09;
    public final Integer A0A;
    public final Set A0B;
    public final boolean A0C;

    public SphericalVideoParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Integer num = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = 6VJ.values()[parcel.readInt()];
        }
        int i = 0;
        this.A0C = 4YV.A1U(parcel.readInt());
        this.A02 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (GuidedTourParams) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (HotspotParams) HotspotParams.CREATOR.createFromParcel(parcel);
        }
        this.A04 = parcel.readFloat();
        this.A05 = parcel.readFloat();
        this.A06 = parcel.readFloat();
        this.A03 = parcel.readDouble();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (PanoBounds) PanoBounds.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = HBk.values()[parcel.readInt()];
        }
        this.A0A = parcel.readInt() != 0 ? 0S2.A00(3)[parcel.readInt()] : num;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0B = Collections.unmodifiableSet(A0v);
    }

    public SphericalVideoParams(PanoBounds panoBounds, HBk hBk, HotspotParams hotspotParams, GuidedTourParams guidedTourParams, 6VJ r306, Set set, double d, double d2, float f, float f2, float f3, boolean z) {
        this.A01 = r306;
        this.A0C = z;
        this.A02 = d;
        this.A09 = guidedTourParams;
        this.A08 = hotspotParams;
        this.A04 = f;
        this.A05 = f2;
        this.A06 = f3;
        this.A03 = d2;
        this.A07 = panoBounds;
        this.A00 = hBk;
        this.A0A = null;
        this.A0B = Collections.unmodifiableSet(set);
    }

    private Integer A00() {
        if (this.A0B.contains("stereoMode")) {
            return this.A0A;
        }
        if (A0D == null) {
            synchronized (this) {
                if (A0D == null) {
                    A0D = 0S2.A00;
                }
            }
        }
        return A0D;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SphericalVideoParams)) {
                return false;
            }
            SphericalVideoParams sphericalVideoParams = (SphericalVideoParams) obj;
            if (this.A01 != sphericalVideoParams.A01 || this.A0C != sphericalVideoParams.A0C || this.A02 != sphericalVideoParams.A02 || !11T.A0O(this.A09, sphericalVideoParams.A09) || !11T.A0O(this.A08, sphericalVideoParams.A08) || this.A04 != sphericalVideoParams.A04 || this.A05 != sphericalVideoParams.A05 || this.A06 != sphericalVideoParams.A06 || this.A03 != sphericalVideoParams.A03 || !11T.A0O(this.A07, sphericalVideoParams.A07) || this.A00 != sphericalVideoParams.A00 || A00() != sphericalVideoParams.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = (C1pq.A04(this.A07, C1pq.A00(this.A03, (((((C1pq.A04(this.A08, C1pq.A04(this.A09, C1pq.A00(this.A02, C1pq.A02(C3o5.A03(this.A01) + 31, this.A0C)))) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A05)) * 31) + Float.floatToIntBits(this.A06))) * 31) + C3o5.A03(this.A00);
        Integer A00 = A00();
        if (A00 != null) {
            i = A00.intValue();
        }
        return (A04 * 31) + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A01);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeDouble(this.A02);
        C3o5.A0d(parcel, this.A09, i);
        HotspotParams hotspotParams = this.A08;
        if (hotspotParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hotspotParams.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A05);
        parcel.writeFloat(this.A06);
        parcel.writeDouble(this.A03);
        PanoBounds panoBounds = this.A07;
        if (panoBounds == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            panoBounds.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A00);
        C3o5.A0f(parcel, this.A0A);
        Iterator A0S = C3o5.A0S(parcel, this.A0B);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
