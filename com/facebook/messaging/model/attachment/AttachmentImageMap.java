package com.facebook.messaging.model.attachment;

import X.48N;
import X.C2w;
import X.C4Ny;
import X.C66a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Map;

/* loaded from: AttachmentImageMap.class */
public final class AttachmentImageMap implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(11);
    public final C66a A00;
    public final ImmutableMap A01;

    public AttachmentImageMap(C66a c66a, Map map) {
        this.A01 = ImmutableMap.copyOf(map);
        this.A00 = c66a;
    }

    public AttachmentImageMap(C2w c2w) {
        this.A01 = ImmutableMap.copyOf(c2w.A01);
        this.A00 = c2w.A00;
    }

    public AttachmentImageMap(Parcel parcel) {
        this.A01 = ImmutableMap.copyOf((Map) parcel.readHashMap(48N.class.getClassLoader()));
        this.A00 = C66a.A00(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AttachmentImageMap attachmentImageMap = (AttachmentImageMap) obj;
            if (!Objects.equal(this.A01, attachmentImageMap.A01) || !Objects.equal(this.A00, attachmentImageMap.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A01);
        C66a c66a = this.A00;
        parcel.writeString(c66a != null ? c66a.stringValue : null);
    }
}
