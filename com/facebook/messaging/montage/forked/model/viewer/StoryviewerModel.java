package com.facebook.messaging.montage.forked.model.viewer;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.BLh;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: StoryviewerModel.class */
public final class StoryviewerModel implements Parcelable {
    public static volatile StoryViewerOverlayTracker A07;
    public static final Parcelable.Creator CREATOR = CSV.A00(87);
    public final int A00;
    public final StoryviewerReply A01;
    public final boolean A02;
    public final boolean A03;
    public final StoryViewerOverlayTracker A04;
    public final String A05;
    public final Set A06;

    public StoryviewerModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        StoryViewerOverlayTracker storyViewerOverlayTracker = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (StoryviewerReply) parcel.readParcelable(A0e);
        }
        int i = 0;
        this.A02 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A03 = AbJ.A1V(parcel);
        this.A04 = parcel.readInt() != 0 ? (StoryViewerOverlayTracker) StoryViewerOverlayTracker.CREATOR.createFromParcel(parcel) : storyViewerOverlayTracker;
        this.A00 = parcel.readInt();
        this.A05 = C3o5.A0O(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A06 = Collections.unmodifiableSet(A0v);
    }

    private StoryViewerOverlayTracker A00() {
        if (this.A06.contains("overlayTracker")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = new StoryViewerOverlayTracker(EnumSet.noneOf(BLh.class));
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
            if (!(obj instanceof StoryviewerModel)) {
                return false;
            }
            StoryviewerModel storyviewerModel = (StoryviewerModel) obj;
            if (!11T.A0O(this.A01, storyviewerModel.A01) || this.A02 != storyviewerModel.A02 || this.A03 != storyviewerModel.A03 || !11T.A0O(A00(), storyviewerModel.A00()) || this.A00 != storyviewerModel.A00 || !11T.A0O(this.A05, storyviewerModel.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, (C1pq.A04(A00(), C1pq.A02(C1pq.A02(C1pq.A03(this.A01), this.A02), this.A03)) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A01, i);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        StoryViewerOverlayTracker storyViewerOverlayTracker = this.A04;
        if (storyViewerOverlayTracker == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyViewerOverlayTracker.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A06);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
