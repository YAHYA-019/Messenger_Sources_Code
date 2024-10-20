package com.google.android.exoplayer2.metadata.scte35;

import X.0Pz;
import X.6Y2;
import X.6Yl;
import X.AnonymousClass001;
import com.google.android.exoplayer2.metadata.Metadata;

/* loaded from: SpliceCommand.class */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] BL1() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ 6Yl BL2() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void CXq(6Y2 r302) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 0Pz.A0W("SCTE-35 splice command: type=", AnonymousClass001.A0X(this));
    }
}
