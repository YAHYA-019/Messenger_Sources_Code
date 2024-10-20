package androidx.work.multiprocess.parcelable;

import X.AnonymousClass001;
import X.C4Ka;
import X.C4Kb;
import X.Kjz;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: ParcelableWorkQuery.class */
public final class ParcelableWorkQuery implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(41);
    public final Kjz A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v0 */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v2, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r312v0 */
    /* JADX WARN: Type inference failed for: r312v1 */
    /* JADX WARN: Type inference failed for: r312v2, types: [java.util.AbstractCollection] */
    public ParcelableWorkQuery(Parcel parcel) {
        boolean emptyList = Collections.emptyList();
        int readInt = parcel.readInt();
        int i = 0;
        if (readInt > 0) {
            emptyList = AnonymousClass001.A0t(readInt);
            int i2 = 0;
            do {
                emptyList.add(UUID.fromString(parcel.readString()));
                i2++;
            } while (i2 < readInt);
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        boolean emptyList2 = Collections.emptyList();
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            emptyList2 = AnonymousClass001.A0t(readInt2);
            do {
                emptyList2.add(C4Ka.A02(parcel.readInt()));
                i++;
            } while (i < readInt2);
        }
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList A0s3 = AnonymousClass001.A0s();
        ArrayList A0s4 = AnonymousClass001.A0s();
        A0s.addAll(emptyList);
        A0s2.addAll(createStringArrayList);
        A0s3.addAll(createStringArrayList2);
        A0s4.addAll(emptyList2);
        if (A0s.isEmpty() && A0s2.isEmpty() && A0s3.isEmpty() && A0s4.isEmpty()) {
            throw AnonymousClass001.A0L("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }
        this.A00 = new Kjz(A0s, A0s4, A0s3, A0s2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Kjz kjz = this.A00;
        List list = kjz.A00;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().toString());
            }
        }
        parcel.writeStringList(kjz.A03);
        parcel.writeStringList(kjz.A02);
        List list2 = kjz.A01;
        parcel.writeInt(list2.size());
        if (list2.isEmpty()) {
            return;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(C4Ka.A00((C4Kb) it2.next()));
        }
    }
}
