package com.facebook.privacy.bloksprivacyselector.privacycache.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbN;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: UafPublishPrivacyDataCacheKey.class */
public final class UafPublishPrivacyDataCacheKey implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(60);
    public final int A00;
    public final String A01;
    public final boolean A02;

    /* loaded from: UafPublishPrivacyDataCacheKey$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            boolean z = false;
            int i = 0;
            String str = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == 106079) {
                            if (A1C.equals("key")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("key", str);
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != 351608024) {
                            if (hashCode == 1916632582 && A1C.equals("should_persist_on_disk")) {
                                z = abstractC01033pi.A1l();
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY)) {
                                i = abstractC01033pi.A1y();
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, UafPublishPrivacyDataCacheKey.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new UafPublishPrivacyDataCacheKey(str, z, i);
        }
    }

    /* loaded from: UafPublishPrivacyDataCacheKey$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            UafPublishPrivacyDataCacheKey uafPublishPrivacyDataCacheKey = (UafPublishPrivacyDataCacheKey) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "key", uafPublishPrivacyDataCacheKey.A01);
            boolean z = uafPublishPrivacyDataCacheKey.A02;
            r302.A0o("should_persist_on_disk");
            r302.A0v(z);
            int i = uafPublishPrivacyDataCacheKey.A00;
            r302.A0o(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY);
            r302.A0f(i);
            r302.A0Y();
        }
    }

    public UafPublishPrivacyDataCacheKey(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = AbN.A1U(parcel);
        this.A00 = parcel.readInt();
    }

    public UafPublishPrivacyDataCacheKey(String str, boolean z, int i) {
        C1pq.A08("key", str);
        this.A01 = str;
        this.A02 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UafPublishPrivacyDataCacheKey)) {
                return false;
            }
            UafPublishPrivacyDataCacheKey uafPublishPrivacyDataCacheKey = (UafPublishPrivacyDataCacheKey) obj;
            if (!11T.A0O(this.A01, uafPublishPrivacyDataCacheKey.A01) || this.A02 != uafPublishPrivacyDataCacheKey.A02 || this.A00 != uafPublishPrivacyDataCacheKey.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A02(C1pq.A03(this.A01), this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UafPublishPrivacyDataCacheKey{key=");
        A0k.append(this.A01);
        A0k.append(", shouldPersistOnDisk=");
        A0k.append(this.A02);
        A0k.append(", version=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
