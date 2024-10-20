package com.google.android.gms.auth.blockstore;

import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.JQy;
import X.LGn;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: RetrieveBytesResponse.class */
public final class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(76);
    public final Bundle A00;
    public final List A01;
    public final Map A02;

    /* loaded from: RetrieveBytesResponse$BlockstoreData.class */
    public final class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGn.A00(74);
        public final String A00;
        public final byte[] A01;

        public BlockstoreData(byte[] bArr, String str) {
            this.A01 = bArr;
            this.A00 = str;
        }

        public byte[] A00() {
            return this.A01;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.A01, ((BlockstoreData) obj).A01);
        }

        public int hashCode() {
            return Arrays.hashCode(AnonymousClass001.A1a(Arrays.hashCode(this.A01)));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A0B(parcel, this.A01, 1);
            JQy.A16(parcel, this.A00, A0E);
        }
    }

    public RetrieveBytesResponse(List list, Bundle bundle) {
        this.A00 = bundle;
        this.A01 = list;
        HashMap A0u = AnonymousClass001.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            A0u.put(blockstoreData.A00, blockstoreData);
        }
        this.A02 = A0u;
    }

    public Map A00() {
        return Collections.unmodifiableMap(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A02(this.A00, parcel, 1);
        AbstractC01153q8.A0A(parcel, this.A01, 2);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
