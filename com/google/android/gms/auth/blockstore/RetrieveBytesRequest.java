package com.google.android.gms.auth.blockstore;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: RetrieveBytesRequest.class */
public final class RetrieveBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(75);
    public final List A00;
    public final boolean A01;

    public RetrieveBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            AbstractC00481b7.A09(z2, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.A01 = z;
        this.A00 = AnonymousClass001.A0s();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                AbstractC00481b7.A06(A0i, "Element in keys cannot be null or empty");
                this.A00.add(A0i);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A09(parcel, Collections.unmodifiableList(this.A00), 1);
        AbstractC01153q8.A06(parcel, 2, this.A01);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
