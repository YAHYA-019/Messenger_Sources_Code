package com.facebook.messaging.profile.common;

import X.11T;
import X.1BL;
import X.1F9;
import X.4YV;
import X.AbF;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ProfileBottomSheetFragmentParams.class */
public final class ProfileBottomSheetFragmentParams implements Parcelable {
    public static volatile User A07;
    public static final Parcelable.Creator CREATOR = CSS.A00(25);
    public final 1F9 A00;
    public final ParcelableSecondaryData A01;
    public final String A02;
    public final String A03;
    public final MigColorScheme A04;
    public final User A05;
    public final Set A06;

    public ProfileBottomSheetFragmentParams(1F9 r302, MigColorScheme migColorScheme, User user, ParcelableSecondaryData parcelableSecondaryData, String str, String str2, Set set) {
        this.A04 = migColorScheme;
        C1pq.A08("entryPoint", str);
        this.A02 = str;
        this.A01 = parcelableSecondaryData;
        this.A00 = r302;
        this.A03 = str2;
        this.A05 = user;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public ProfileBottomSheetFragmentParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        User user = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (MigColorScheme) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (ParcelableSecondaryData) ParcelableSecondaryData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = 1F9.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A05 = parcel.readInt() != 0 ? (User) parcel.readParcelable(A0e) : user;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    public User A00() {
        if (this.A06.contains(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
            return this.A05;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = AbF.A0w(AbF.A0y());
                }
            }
        }
        return A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProfileBottomSheetFragmentParams)) {
                return false;
            }
            ProfileBottomSheetFragmentParams profileBottomSheetFragmentParams = (ProfileBottomSheetFragmentParams) obj;
            if (!11T.A0O(this.A04, profileBottomSheetFragmentParams.A04) || !11T.A0O(this.A02, profileBottomSheetFragmentParams.A02) || !11T.A0O(this.A01, profileBottomSheetFragmentParams.A01) || this.A00 != profileBottomSheetFragmentParams.A00 || !11T.A0O(this.A03, profileBottomSheetFragmentParams.A03) || !11T.A0O(A00(), profileBottomSheetFragmentParams.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A03(this.A04)));
        return C1pq.A04(A00(), C1pq.A04(this.A03, (A04 * 31) + C3o5.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A04, i);
        parcel.writeString(this.A02);
        ParcelableSecondaryData parcelableSecondaryData = this.A01;
        if (parcelableSecondaryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelableSecondaryData.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A03);
        C3o5.A0d(parcel, this.A05, i);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
