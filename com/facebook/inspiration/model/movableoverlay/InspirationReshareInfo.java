package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EPI;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.events.story.ipc.EventsInspirationConfiguration;
import com.facebook.groups.share.api.config.GroupInspirationConfiguration;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationReshareInfo.class */
public final class InspirationReshareInfo implements Parcelable {
    public static volatile EPI A0F;
    public static volatile InspirationReshareBackgroundCreationInfo A0G;
    public static volatile InspirationOverlayPosition A0H;
    public static final Parcelable.Creator CREATOR = FKc.A00(42);
    public final EventsInspirationConfiguration A00;
    public final GroupInspirationConfiguration A01;
    public final EPI A02;
    public final InspirationAnswerReshareInfo A03;
    public final InspirationChannelMessageReshareInfo A04;
    public final InspirationChannelReshareInfo A05;
    public final InspirationFundraiserReshareInfo A06;
    public final InspirationPostAndStoryReshareInfo A07;
    public final InspirationReshareBackgroundCreationInfo A08;
    public final InspirationStaticStickerReshareInfo A09;
    public final InspirationOverlayPosition A0A;
    public final Set A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public InspirationReshareInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = (InspirationReshareBackgroundCreationInfo) parcel.readParcelable(A0e);
        }
        int i = 0;
        this.A0C = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (EventsInspirationConfiguration) EventsInspirationConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (GroupInspirationConfiguration) GroupInspirationConfiguration.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (InspirationAnswerReshareInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (InspirationChannelMessageReshareInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (InspirationChannelReshareInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (InspirationFundraiserReshareInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (InspirationPostAndStoryReshareInfo) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (InspirationStaticStickerReshareInfo) parcel.readParcelable(A0e);
        }
        this.A0D = 1BM.A07(parcel);
        this.A0E = AbJ.A1V(parcel);
        this.A0A = parcel.readInt() != 0 ? DKG.A0W(parcel) : inspirationOverlayPosition;
        this.A02 = DKH.A0Q(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0B = Collections.unmodifiableSet(A0v);
    }

    public InspirationReshareInfo(EventsInspirationConfiguration eventsInspirationConfiguration, GroupInspirationConfiguration groupInspirationConfiguration, EPI epi, InspirationAnswerReshareInfo inspirationAnswerReshareInfo, InspirationChannelMessageReshareInfo inspirationChannelMessageReshareInfo, InspirationChannelReshareInfo inspirationChannelReshareInfo, InspirationFundraiserReshareInfo inspirationFundraiserReshareInfo, InspirationPostAndStoryReshareInfo inspirationPostAndStoryReshareInfo, InspirationReshareBackgroundCreationInfo inspirationReshareBackgroundCreationInfo, InspirationStaticStickerReshareInfo inspirationStaticStickerReshareInfo, InspirationOverlayPosition inspirationOverlayPosition, Set set, boolean z, boolean z2, boolean z3) {
        this.A08 = inspirationReshareBackgroundCreationInfo;
        this.A0C = z;
        this.A00 = eventsInspirationConfiguration;
        this.A01 = groupInspirationConfiguration;
        this.A03 = inspirationAnswerReshareInfo;
        this.A04 = inspirationChannelMessageReshareInfo;
        this.A05 = inspirationChannelReshareInfo;
        this.A06 = inspirationFundraiserReshareInfo;
        this.A07 = inspirationPostAndStoryReshareInfo;
        this.A09 = inspirationStaticStickerReshareInfo;
        this.A0D = z2;
        this.A0E = z3;
        this.A0A = inspirationOverlayPosition;
        this.A02 = epi;
        this.A0B = Collections.unmodifiableSet(set);
        switch (A00().ordinal()) {
            case 5:
                if (this.A03 == null) {
                    throw AnonymousClass001.A0N("InspirationAnswerReshareInfo needed for Answer sticker type.");
                }
                return;
            case 13:
                if (this.A05 == null) {
                    throw AnonymousClass001.A0N("InspirationChannelReshareInfo needed for Channel sticker type.");
                }
                return;
            case 14:
                if (this.A04 == null) {
                    throw AnonymousClass001.A0N("InspirationChannelMessageReshareInfo needed for Channel Message sticker type.");
                }
                return;
            case 23:
                if (this.A00 == null) {
                    throw AnonymousClass001.A0N("InspirationPostAndStoryReshareInfo needed for Event sticker type.");
                }
                return;
            case 29:
                if (this.A06 == null) {
                    throw AnonymousClass001.A0N("InspirationFundraiserReshareInfo needed for Fundraiser sticker type.");
                }
                return;
            case ActionId.IN_PROGRESS /* 49 */:
            case 50:
                if (this.A07 == null) {
                    throw AnonymousClass001.A0N("InspirationPostAndStoryReshareInfo needed for Reshare sticker type.");
                }
                return;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                if (this.A01 == null) {
                    throw AnonymousClass001.A0N("GroupInspirationConfiguration needed for Share Group sticker type.");
                }
                return;
            case ActionId.QUEUEING_FAIL /* 56 */:
                if (this.A09 == null) {
                    throw AnonymousClass001.A0N("InspirationStaticStickerReshareInfo needed for Static sticker type.");
                }
                return;
            default:
                return;
        }
    }

    public EPI A00() {
        if (this.A0B.contains("stickerType")) {
            return this.A02;
        }
        if (A0F == null) {
            synchronized (this) {
                if (A0F == null) {
                    A0F = EPI.A0p;
                }
            }
        }
        return A0F;
    }

    public InspirationReshareBackgroundCreationInfo A01() {
        if (this.A0B.contains("backgroundCreationInfo")) {
            return this.A08;
        }
        if (A0G == null) {
            synchronized (this) {
                if (A0G == null) {
                    A0G = new InspirationReshareBackgroundCreationInfo(null, null, null, AnonymousClass001.A0v(), -1.0f, -1);
                }
            }
        }
        return A0G;
    }

    public InspirationOverlayPosition A02() {
        if (DKF.A1b(this.A0B)) {
            return this.A0A;
        }
        if (A0H == null) {
            synchronized (this) {
                if (A0H == null) {
                    A0H = DKG.A0V();
                }
            }
        }
        return A0H;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationReshareInfo)) {
                return false;
            }
            InspirationReshareInfo inspirationReshareInfo = (InspirationReshareInfo) obj;
            if (!11T.A0O(A01(), inspirationReshareInfo.A01()) || this.A0C != inspirationReshareInfo.A0C || !11T.A0O(this.A00, inspirationReshareInfo.A00) || !11T.A0O(this.A01, inspirationReshareInfo.A01) || !11T.A0O(this.A03, inspirationReshareInfo.A03) || !11T.A0O(this.A04, inspirationReshareInfo.A04) || !11T.A0O(this.A05, inspirationReshareInfo.A05) || !11T.A0O(this.A06, inspirationReshareInfo.A06) || !11T.A0O(this.A07, inspirationReshareInfo.A07) || !11T.A0O(this.A09, inspirationReshareInfo.A09) || this.A0D != inspirationReshareInfo.A0D || this.A0E != inspirationReshareInfo.A0E || !11T.A0O(A02(), inspirationReshareInfo.A02()) || A00() != inspirationReshareInfo.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(A02(), C1pq.A02(C1pq.A02(C1pq.A04(this.A09, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A02(C1pq.A03(A01()), this.A0C))))))))), this.A0D), this.A0E));
        return (A04 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A08, i);
        parcel.writeInt(this.A0C ? 1 : 0);
        EventsInspirationConfiguration eventsInspirationConfiguration = this.A00;
        if (eventsInspirationConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventsInspirationConfiguration.writeToParcel(parcel, i);
        }
        GroupInspirationConfiguration groupInspirationConfiguration = this.A01;
        if (groupInspirationConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupInspirationConfiguration.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A03, i);
        C3o5.A0d(parcel, this.A04, i);
        C3o5.A0d(parcel, this.A05, i);
        C3o5.A0d(parcel, this.A06, i);
        C3o5.A0d(parcel, this.A07, i);
        C3o5.A0d(parcel, this.A09, i);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        DKH.A0z(parcel, this.A0A, i);
        C3o5.A0e(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A0B);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
