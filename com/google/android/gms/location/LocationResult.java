package com.google.android.gms.location;

import X.1BK;
import X.1BL;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.LGm;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: LocationResult.class */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = LGm.A00(35);
    public final List A00;

    public LocationResult(List list) {
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).A00;
        int size = list.size();
        List list2 = this.A00;
        if (size != list2.size()) {
            return false;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.A00.iterator();
        int i = 17;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = (i2 * 31) + 1BL.A01(((Location) it.next()).getTime());
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder A0l = AnonymousClass001.A0l(1BK.A02(valueOf) + 27);
        A0l.append("LocationResult[locations: ");
        A0l.append(valueOf);
        return AnonymousClass001.A0d("]", A0l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0A(parcel, this.A00, 1);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
