package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKa;
import X.QoG;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ComposerMemorialPostData.class */
public final class ComposerMemorialPostData implements Parcelable {
    public static volatile QoG A03;
    public static final Parcelable.Creator CREATOR = FKa.A00(45);
    public final String A00;
    public final QoG A01;
    public final Set A02;

    public ComposerMemorialPostData(QoG qoG, String str, Set set) {
        this.A00 = str;
        this.A01 = qoG;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public ComposerMemorialPostData(Parcel parcel) {
        QoG qoG = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? QoG.values()[parcel.readInt()] : qoG;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public QoG A00() {
        if (this.A02.contains("memorialPostType")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = QoG.A03;
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerMemorialPostData)) {
                return false;
            }
            ComposerMemorialPostData composerMemorialPostData = (ComposerMemorialPostData) obj;
            if (!11T.A0O(this.A00, composerMemorialPostData.A00) || A00() != composerMemorialPostData.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A032 = C1pq.A03(this.A00);
        return (A032 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        C3o5.A0e(parcel, this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
