package com.facebook.messaging.rtc.meetups.speakeasy.model;

import X.0S2;
import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zU;
import X.AbI;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: JoinableVideoChatAvailabilitySettings.class */
public final class JoinableVideoChatAvailabilitySettings implements Parcelable {
    public static volatile Integer A04;
    public static volatile String A05;
    public static final Parcelable.Creator CREATOR = CSS.A00(59);
    public final ImmutableList A00;
    public final Integer A01;
    public final String A02;
    public final Set A03;

    public JoinableVideoChatAvailabilitySettings(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readInt() != 0 ? 7zU.A0e(parcel, 6) : null;
        this.A02 = C3o5.A0O(parcel);
        int readInt = parcel.readInt();
        CallLinkParticipant[] callLinkParticipantArr = new CallLinkParticipant[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, callLinkParticipantArr, i2);
        }
        this.A00 = ImmutableList.copyOf(callLinkParticipantArr);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public JoinableVideoChatAvailabilitySettings(ImmutableList immutableList, Integer num, String str, Set set) {
        this.A01 = num;
        this.A02 = str;
        C1pq.A08("whitelistedParticipants", immutableList);
        this.A00 = immutableList;
        this.A03 = Collections.unmodifiableSet(set);
    }

    private String A00() {
        if (this.A03.contains("visibilityMode")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A05;
    }

    public Integer A01() {
        if (this.A03.contains("joinPermission")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = 0S2.A00;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof JoinableVideoChatAvailabilitySettings)) {
                return false;
            }
            JoinableVideoChatAvailabilitySettings joinableVideoChatAvailabilitySettings = (JoinableVideoChatAvailabilitySettings) obj;
            if (A01() != joinableVideoChatAvailabilitySettings.A01() || !11T.A0O(A00(), joinableVideoChatAvailabilitySettings.A00()) || !11T.A0O(this.A00, joinableVideoChatAvailabilitySettings.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(A00(), C3o5.A04(A01()) + 31));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((CallLinkParticipant) A0b.next(), i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
