package androidx.work.multiprocess.parcelable;

import X.4YV;
import X.AbN;
import X.AnonymousClass001;
import X.C4Kl;
import X.LGo;
import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: ParcelableRuntimeExtras.class */
public final class ParcelableRuntimeExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(36);
    public C4Kl A00;

    public ParcelableRuntimeExtras(Parcel parcel) {
        ArrayList arrayList;
        ClassLoader A0e = 4YV.A0e(this);
        ArrayList<String> arrayList2 = null;
        Network network = AbN.A1U(parcel) ? (Network) parcel.readParcelable(A0e) : null;
        if (parcel.readInt() == 1) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(A0e);
            arrayList = AnonymousClass001.A0t(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add(parcelable);
            }
        } else {
            arrayList = null;
        }
        arrayList2 = parcel.readInt() == 1 ? parcel.createStringArrayList() : arrayList2;
        C4Kl c4Kl = new C4Kl();
        this.A00 = c4Kl;
        c4Kl.A00 = network;
        if (arrayList != null) {
            c4Kl.A02 = arrayList;
        }
        if (arrayList2 != null) {
            c4Kl.A01 = arrayList2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0046, code lost:
    
        if (r0.isEmpty() != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            X.4Kl r0 = r0.A00
            r304 = r0
            r0 = r304
            android.net.Network r0 = r0.A00
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            boolean r0 = X.AnonymousClass001.A1T(r0)
            r307 = r0
            r0 = r302
            r1 = r307
            r0.writeInt(r1)
            r0 = r307
            if (r0 == 0) goto L27
            r0 = r302
            r1 = r305
            r2 = r303
            r0.writeParcelable(r1, r2)
        L27:
            r0 = r304
            java.util.List r0 = r0.A02
            r308 = r0
            r0 = r304
            java.util.List r0 = r0.A01
            r309 = r0
            r0 = r308
            if (r0 == 0) goto L49
            r0 = r308
            boolean r0 = r0.isEmpty()
            r310 = r0
            r0 = 1
            r307 = r0
            r0 = r310
            if (r0 == 0) goto L4f
        L49:
            r0 = 0
            r307 = r0
            r0 = 0
            r311 = r0
        L4f:
            r0 = r302
            r1 = r307
            r0.writeInt(r1)
            r0 = r307
            if (r0 == 0) goto L96
            r0 = r308
            int r0 = r0.size()
            r312 = r0
            r0 = r312
            android.net.Uri[] r0 = new android.net.Uri[r0]
            r304 = r0
            r0 = 0
            r310 = r0
            r0 = 0
            r305 = r0
        L6f:
            r0 = r310
            r1 = r312
            if (r0 >= r1) goto L90
            r0 = r308
            r1 = r310
            java.lang.Object r0 = r0.get(r1)
            r311 = r0
            r0 = r304
            r1 = r310
            r2 = r311
            r0[r1] = r2
            r0 = r310
            r1 = 1
            int r0 = r0 + r1
            r310 = r0
            goto L6f
        L90:
            r0 = r302
            r1 = r304
            r2 = r303
            r0.writeParcelableArray(r1, r2)
        L96:
            r0 = r309
            if (r0 == 0) goto Lbb
            r0 = r309
            boolean r0 = r0.isEmpty()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto Lbb
        La9:
            r0 = r302
            r1 = r306
            r0.writeInt(r1)
            r0 = r306
            if (r0 == 0) goto Lba
            r0 = r302
            r1 = r309
            r0.writeStringList(r1)
        Lba:
            return
        Lbb:
            r0 = 0
            r306 = r0
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras.writeToParcel(android.os.Parcel, int):void");
    }
}
