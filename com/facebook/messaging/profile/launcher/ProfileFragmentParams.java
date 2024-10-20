package com.facebook.messaging.profile.launcher;

import X.11T;
import X.1BL;
import X.1F9;
import X.4YV;
import X.AbF;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.facebook.xapp.messaging.profile.logging.ContextualProfileLoggingData;
import com.google.common.collect.RegularImmutableMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ProfileFragmentParams.class */
public final class ProfileFragmentParams implements Parcelable {
    public static volatile User A07;
    public static volatile ContextualProfileLoggingData A08;
    public static final Parcelable.Creator CREATOR = CSS.A00(26);
    public final 1F9 A00;
    public final MigColorScheme A01;
    public final User A02;
    public final ParcelableSecondaryData A03;
    public final ContextualProfileLoggingData A04;
    public final String A05;
    public final Set A06;

    public ProfileFragmentParams(1F9 r302, MigColorScheme migColorScheme, User user, ParcelableSecondaryData parcelableSecondaryData, ContextualProfileLoggingData contextualProfileLoggingData, String str, Set set) {
        this.A01 = migColorScheme;
        this.A03 = parcelableSecondaryData;
        this.A00 = r302;
        this.A04 = contextualProfileLoggingData;
        this.A05 = str;
        this.A02 = user;
        this.A06 = Collections.unmodifiableSet(set);
    }

    public ProfileFragmentParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        User user = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MigColorScheme) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (ParcelableSecondaryData) ParcelableSecondaryData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = 1F9.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (ContextualProfileLoggingData) ContextualProfileLoggingData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? (User) parcel.readParcelable(A0e) : user;
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
            return this.A02;
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

    public ContextualProfileLoggingData A01() {
        if (this.A06.contains("loggingData")) {
            return this.A04;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = AbM.A0m((ThreadKey) null, RegularImmutableMap.A03, "unknown", "");
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProfileFragmentParams)) {
                return false;
            }
            ProfileFragmentParams profileFragmentParams = (ProfileFragmentParams) obj;
            if (!11T.A0O(this.A01, profileFragmentParams.A01) || !11T.A0O(this.A03, profileFragmentParams.A03) || this.A00 != profileFragmentParams.A00 || !11T.A0O(A01(), profileFragmentParams.A01()) || !11T.A0O(this.A05, profileFragmentParams.A05) || !11T.A0O(A00(), profileFragmentParams.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A03(this.A01));
        return C1pq.A04(A00(), C1pq.A04(this.A05, C1pq.A04(A01(), (A04 * 31) + C3o5.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A01, i);
        ParcelableSecondaryData parcelableSecondaryData = this.A03;
        if (parcelableSecondaryData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelableSecondaryData.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A00);
        ContextualProfileLoggingData contextualProfileLoggingData = this.A04;
        if (contextualProfileLoggingData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contextualProfileLoggingData.writeToParcel(parcel, i);
        }
        1BL.A13(parcel, this.A05);
        C3o5.A0d(parcel, this.A02, i);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
