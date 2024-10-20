package com.facebook.payments.paymentmethods.model;

import X.1BK;
import X.1Du;
import X.4YU;
import X.AnonymousClass001;
import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: AdditionalFields.class */
public final class AdditionalFields implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(48);
    public final ImmutableMap A00;

    public AdditionalFields(Parcel parcel) {
        HashMap A0u = AnonymousClass001.A0u();
        parcel.readMap(A0u, C53v.class.getClassLoader());
        ImmutableMap.Builder A0c = 1BK.A0c();
        Iterator A0x = AnonymousClass001.A0x(A0u);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            A0c.put(A0z.getKey(), ImmutableList.copyOf((Collection) A0z.getValue()));
        }
        this.A00 = A0c.build();
    }

    public AdditionalFields(ImmutableMap.Builder builder) {
        this.A00 = builder.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (((java.util.AbstractCollection) r0.get(r302)).contains(r303) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00(com.facebook.common.locale.Country r302, com.facebook.payments.paymentmethods.model.VerifyField r303) {
        /*
            r301 = this;
            r0 = r301
            com.google.common.collect.ImmutableMap r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r302
            boolean r0 = r0.containsKey(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2b
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r306 = r0
            r0 = r306
            r1 = r303
            boolean r0 = r0.contains(r1)
            r307 = r0
            r0 = 1
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L31
        L2b:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L31:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.paymentmethods.model.AdditionalFields.A00(com.facebook.common.locale.Country, com.facebook.payments.paymentmethods.model.VerifyField):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableMap immutableMap = this.A00;
        HashMap A0u = AnonymousClass001.A0u();
        1Du A0i = 4YU.A0i(immutableMap);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            A0u.put(A0z.getKey(), 1BK.A17((Collection) A0z.getValue()));
        }
        parcel.writeMap(A0u);
    }
}
