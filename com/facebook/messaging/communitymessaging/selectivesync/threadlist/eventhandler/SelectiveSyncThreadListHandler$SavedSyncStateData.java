package com.facebook.messaging.communitymessaging.selectivesync.threadlist.eventhandler;

import X.11T;
import X.1BL;
import X.1Hb;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3o5;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: SelectiveSyncThreadListHandler$SavedSyncStateData.class */
public final class SelectiveSyncThreadListHandler$SavedSyncStateData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(7);
    public final long A00;
    public final Map A01;

    public SelectiveSyncThreadListHandler$SavedSyncStateData(Map map, long j) {
        this.A00 = j;
        this.A01 = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SavedSyncStateData(stateSaveTimeMs: ");
        A0k.append(this.A00);
        A0k.append(", stateMap=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        Map map = this.A01;
        parcel.writeInt(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            1BL.A12(parcel, (1Hb) A0z.getKey());
            parcel.writeLong(C3o5.A08(A0z));
        }
    }
}
