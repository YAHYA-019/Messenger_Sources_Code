package com.facebook.messaging.presence.unifiedpresence;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C2xc;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.presence.api.model.RichStatus;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;

/* loaded from: UnifiedPresenceViewLoggerItem.class */
public final class UnifiedPresenceViewLoggerItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(40);
    public final RichStatus A00;
    public final ImmutableMap A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final boolean A05;

    public UnifiedPresenceViewLoggerItem(Parcel parcel) {
        Object readValue = parcel.readValue(Boolean.TYPE.getClassLoader());
        11T.A0I(readValue, "null cannot be cast to non-null type kotlin.Boolean");
        this.A05 = AnonymousClass001.A1V(readValue);
        Class cls = Long.TYPE;
        this.A03 = (Long) parcel.readValue(cls.getClassLoader());
        this.A02 = (Long) parcel.readValue(cls.getClassLoader());
        this.A04 = (String) parcel.readValue(String.class.getClassLoader());
        ImmutableMap A05 = C53v.A05(parcel);
        11T.A0A(A05);
        this.A01 = A05;
        this.A00 = (RichStatus) 1BL.A0C(parcel, RichStatus.class);
    }

    public UnifiedPresenceViewLoggerItem(RichStatus richStatus, ImmutableMap immutableMap, Long l, Long l2, String str, boolean z) {
        this.A05 = z;
        this.A03 = l2;
        this.A02 = l;
        this.A04 = str;
        this.A01 = immutableMap;
        this.A00 = richStatus;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof UnifiedPresenceViewLoggerItem)) {
            UnifiedPresenceViewLoggerItem unifiedPresenceViewLoggerItem = (UnifiedPresenceViewLoggerItem) obj;
            if (this.A05 == unifiedPresenceViewLoggerItem.A05 && 11T.A0O(this.A03, unifiedPresenceViewLoggerItem.A03) && 11T.A0O(this.A02, unifiedPresenceViewLoggerItem.A02) && 11T.A0O(this.A04, unifiedPresenceViewLoggerItem.A04) && 11T.A0O(this.A01, unifiedPresenceViewLoggerItem.A01) && 11T.A0O(this.A00, unifiedPresenceViewLoggerItem.A00)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A05), this.A02, this.A04, this.A01, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeValue(Boolean.valueOf(this.A05));
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A04);
        parcel.writeMap(this.A01);
        parcel.writeParcelable(this.A00, 0);
    }
}
