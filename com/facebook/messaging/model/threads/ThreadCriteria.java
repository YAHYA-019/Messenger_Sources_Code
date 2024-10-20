package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.1Du;
import X.5Vo;
import X.82M;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: ThreadCriteria.class */
public final class ThreadCriteria implements Parcelable {
    public static final 5Vo A02 = new Object();
    public static final Parcelable.Creator CREATOR = new 82M(51);
    public final ImmutableSet A00;
    public final String A01;

    public ThreadCriteria(Parcel parcel) {
        Object[] createTypedArray = parcel.createTypedArray(ThreadKey.CREATOR);
        ImmutableSet A08 = createTypedArray == null ? RegularImmutableSet.A05 : ImmutableSet.A08(createTypedArray);
        11T.A0C(A08);
        this.A00 = A08;
        this.A01 = parcel.readString();
    }

    public ThreadCriteria(String str, Collection collection) {
        ImmutableSet A07 = ImmutableSet.A07(collection);
        11T.A0A(A07);
        this.A00 = A07;
        this.A01 = str;
    }

    public final ThreadKey A00() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet.isEmpty()) {
            return null;
        }
        return (ThreadKey) immutableSet.iterator().next();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            ThreadCriteria threadCriteria = (ThreadCriteria) obj;
            ImmutableSet immutableSet = this.A00;
            ImmutableSet immutableSet2 = threadCriteria.A00;
            if (!(immutableSet instanceof Collection) || !(immutableSet2 instanceof Collection) || immutableSet.size() == immutableSet2.size()) {
                Iterator it = immutableSet.iterator();
                Iterator it2 = immutableSet2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !Objects.equal(it.next(), it2.next())) {
                            break;
                        }
                    } else if ((!it2.hasNext()) && 11T.A0O(this.A01, threadCriteria.A01)) {
                        return true;
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        String str = this.A01;
        if (str != null) {
            A0k.append("threadIdReferenceQuery: ");
            A0k.append(str);
        } else {
            A0k.append("threadkeys: [");
            1Du it = this.A00.iterator();
            while (it.hasNext()) {
                A0k.append(it.next());
                AnonymousClass001.A1H(A0k);
            }
            A0k.append(']');
        }
        return 11T.A02(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        ImmutableSet immutableSet = this.A00;
        parcel.writeTypedArray((Parcelable[]) immutableSet.toArray(new ThreadKey[immutableSet.size()]), i);
        parcel.writeString(this.A01);
    }
}
