package com.facebook.messaging.montage.model.cards;

import X.4YV;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MontageFeedbackOverlay.class */
public final class MontageFeedbackOverlay implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(58);
    public final MontageBloksSticker A00;
    public final MontageChannelSticker A01;
    public final MontageEventsSticker A02;
    public final MontageFeedbackPoll A03;
    public final MontageFundraiserSticker A04;
    public final MontageLinkSticker A05;
    public final MontageReactionSticker A06;
    public final MontageReshareContentSticker A07;
    public final MontageResharedFbShortsSticker A08;
    public final MontageSliderSticker A09;
    public final MontageTagSticker A0A;

    public MontageFeedbackOverlay(Parcel parcel) {
        this.A03 = (MontageFeedbackPoll) 4YV.A0l(parcel, MontageFeedbackPoll.class);
        this.A06 = (MontageReactionSticker) 4YV.A0l(parcel, MontageReactionSticker.class);
        this.A09 = (MontageSliderSticker) 4YV.A0l(parcel, MontageSliderSticker.class);
        this.A02 = (MontageEventsSticker) 4YV.A0l(parcel, MontageEventsSticker.class);
        this.A05 = (MontageLinkSticker) 4YV.A0l(parcel, MontageLinkSticker.class);
        this.A04 = (MontageFundraiserSticker) 4YV.A0l(parcel, MontageFundraiserSticker.class);
        this.A07 = (MontageReshareContentSticker) 4YV.A0l(parcel, MontageReshareContentSticker.class);
        this.A0A = (MontageTagSticker) 4YV.A0l(parcel, MontageTagSticker.class);
        this.A00 = (MontageBloksSticker) 4YV.A0l(parcel, MontageBloksSticker.class);
        this.A01 = (MontageChannelSticker) 4YV.A0l(parcel, MontageChannelSticker.class);
        this.A08 = (MontageResharedFbShortsSticker) 4YV.A0l(parcel, MontageResharedFbShortsSticker.class);
    }

    public MontageFeedbackOverlay(MontageBloksSticker montageBloksSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = montageBloksSticker;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageChannelSticker montageChannelSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = montageChannelSticker;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageEventsSticker montageEventsSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = montageEventsSticker;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageFeedbackPoll montageFeedbackPoll) {
        this.A03 = montageFeedbackPoll;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageFundraiserSticker montageFundraiserSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = montageFundraiserSticker;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageLinkSticker montageLinkSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = montageLinkSticker;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageReactionSticker montageReactionSticker) {
        this.A03 = null;
        this.A06 = montageReactionSticker;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageReshareContentSticker montageReshareContentSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = montageReshareContentSticker;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageResharedFbShortsSticker montageResharedFbShortsSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = montageResharedFbShortsSticker;
    }

    public MontageFeedbackOverlay(MontageSliderSticker montageSliderSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = montageSliderSticker;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = null;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    public MontageFeedbackOverlay(MontageTagSticker montageTagSticker) {
        this.A03 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A07 = null;
        this.A0A = montageTagSticker;
        this.A00 = null;
        this.A01 = null;
        this.A08 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A06);
        parcel.writeValue(this.A09);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A05);
        parcel.writeValue(this.A04);
        parcel.writeValue(this.A07);
        parcel.writeValue(this.A0A);
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        parcel.writeValue(this.A08);
    }
}
