package com.facebook.abtest.qe.protocol.sync.user;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: SyncMultiQuickExperimentUserInfoResult.class */
public final class SyncMultiQuickExperimentUserInfoResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(50);
    public final ArrayList A00;

    public SyncMultiQuickExperimentUserInfoResult(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        while (parcel.dataAvail() > 0) {
            A0s.add(new SyncQuickExperimentUserInfoResult(parcel));
        }
        this.A00 = A0s;
    }

    public SyncMultiQuickExperimentUserInfoResult(ArrayList arrayList) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0s.add(it.next());
        }
        this.A00 = A0s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((SyncQuickExperimentUserInfoResult) it.next()).writeToParcel(parcel, i);
        }
    }
}
