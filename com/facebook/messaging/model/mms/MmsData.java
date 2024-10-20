package com.facebook.messaging.model.mms;

import X.4YV;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: MmsData.class */
public final class MmsData implements Parcelable {
    public static final MmsData A04;
    public static final ImmutableList A05;
    public static final Parcelable.Creator CREATOR;
    public final long A00;
    public final long A01;
    public final ImmutableList A02;
    public final ImmutableList A03;

    static {
        ImmutableList of = ImmutableList.of();
        A05 = of;
        long j = -1;
        A04 = new MmsData(of, of, j, j);
        CREATOR = new 82M(48);
    }

    public MmsData(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = ImmutableList.copyOf((Collection) 4YV.A0y(parcel, MediaResource.class));
        this.A03 = C53v.A02(parcel, MediaResource.CREATOR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r303.size() == r302.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MmsData(com.google.common.collect.ImmutableList r302, com.google.common.collect.ImmutableList r303, long r304, long r306) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r304
            r0.A00 = r1
            r0 = r301
            r1 = r306
            r0.A01 = r1
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r303
            if (r0 == 0) goto L33
            r0 = r303
            int r0 = r0.size()
            r308 = r0
            r0 = r302
            int r0 = r0.size()
            r309 = r0
            r0 = 0
            r310 = r0
            r0 = r308
            r1 = r309
            if (r0 != r1) goto L36
        L33:
            r0 = 1
            r310 = r0
        L36:
            r0 = r310
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.mms.MmsData.<init>(com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r301.A02.isEmpty() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00() {
        /*
            r301 = this;
            r0 = r301
            long r0 = r0.A00
            r302 = r0
            r0 = -1
            long r0 = (long) r0
            r304 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L39
            r0 = r301
            long r0 = r0.A01
            r302 = r0
            r0 = r302
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L39
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A02
            r307 = r0
            r0 = r307
            boolean r0 = r0.isEmpty()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L39
        L33:
            r0 = 0
            r308 = r0
        L36:
            r0 = r308
            return r0
        L39:
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A02
            r307 = r0
            r0 = r307
            boolean r0 = r0.isEmpty()
            r306 = r0
            r0 = 1
            r308 = r0
            r0 = r306
            if (r0 != 0) goto L36
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.mms.MmsData.A00():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeList(this.A02);
        C53v.A0D(parcel, this.A03);
    }
}
