package com.facebook.messaging.montage.viewer.viewcontroller.model;

import X.11T;
import X.1BM;
import X.7zU;
import X.AbE;
import X.AbJ;
import X.AnonymousClass001;
import X.BLh;
import X.C1pq;
import X.C3o5;
import X.CST;
import X.I0O;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.forked.model.viewer.StoryViewerOverlayTracker;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MontageViewerPageFragmentModel.class */
public final class MontageViewerPageFragmentModel implements Parcelable {
    public static volatile StoryViewerOverlayTracker A0E;
    public static final Parcelable.Creator CREATOR = CST.A00(33);
    public final StoryViewerOverlayTracker A00;
    public final String A01;
    public final Set A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public MontageViewerPageFragmentModel(I0O i0o) {
        String str = i0o.A01;
        C1pq.A08("emojiReaction", str);
        this.A01 = str;
        this.A03 = i0o.A03;
        this.A04 = i0o.A04;
        this.A05 = i0o.A05;
        this.A06 = i0o.A06;
        this.A07 = i0o.A07;
        this.A08 = i0o.A08;
        this.A09 = i0o.A09;
        this.A0A = i0o.A0A;
        this.A0B = i0o.A0B;
        this.A0C = i0o.A0C;
        this.A0D = i0o.A0D;
        this.A00 = i0o.A00;
        this.A02 = Collections.unmodifiableSet(i0o.A02);
    }

    public MontageViewerPageFragmentModel(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        int i = 0;
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = 1BM.A07(parcel);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = 1BM.A07(parcel);
        this.A0A = 1BM.A07(parcel);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = AbJ.A1V(parcel);
        this.A00 = parcel.readInt() == 0 ? null : (StoryViewerOverlayTracker) StoryViewerOverlayTracker.CREATOR.createFromParcel(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    private StoryViewerOverlayTracker A00() {
        if (this.A02.contains(AbE.A00(656))) {
            return this.A00;
        }
        if (A0E == null) {
            synchronized (this) {
                if (A0E == null) {
                    A0E = new StoryViewerOverlayTracker(EnumSet.noneOf(BLh.class));
                }
            }
        }
        return A0E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageViewerPageFragmentModel)) {
                return false;
            }
            MontageViewerPageFragmentModel montageViewerPageFragmentModel = (MontageViewerPageFragmentModel) obj;
            if (!11T.A0O(this.A01, montageViewerPageFragmentModel.A01) || this.A03 != montageViewerPageFragmentModel.A03 || this.A04 != montageViewerPageFragmentModel.A04 || this.A05 != montageViewerPageFragmentModel.A05 || this.A06 != montageViewerPageFragmentModel.A06 || this.A07 != montageViewerPageFragmentModel.A07 || this.A08 != montageViewerPageFragmentModel.A08 || this.A09 != montageViewerPageFragmentModel.A09 || this.A0A != montageViewerPageFragmentModel.A0A || this.A0B != montageViewerPageFragmentModel.A0B || this.A0C != montageViewerPageFragmentModel.A0C || this.A0D != montageViewerPageFragmentModel.A0D || !11T.A0O(A00(), montageViewerPageFragmentModel.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A01), this.A03), this.A04), this.A05), this.A06), this.A07), this.A08), this.A09), this.A0A), this.A0B), this.A0C), this.A0D));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        StoryViewerOverlayTracker storyViewerOverlayTracker = this.A00;
        if (storyViewerOverlayTracker == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storyViewerOverlayTracker.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
