package com.facebook.stickers.model;

import X.11T;
import X.82N;
import X.AnonymousClass001;
import X.C6xd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;

/* loaded from: StickerCapabilities.class */
public final class StickerCapabilities implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(7);
    public final TriState A00;
    public final TriState A01;
    public final TriState A02;
    public final TriState A03;
    public final TriState A04;
    public final TriState A05;
    public final TriState A06;

    public StickerCapabilities(Parcel parcel) {
        this.A00 = TriState.fromDbValue(parcel.readInt());
        this.A01 = TriState.fromDbValue(parcel.readInt());
        this.A02 = TriState.fromDbValue(parcel.readInt());
        this.A06 = TriState.fromDbValue(parcel.readInt());
        this.A05 = TriState.fromDbValue(parcel.readInt());
        this.A04 = TriState.fromDbValue(parcel.readInt());
        this.A03 = TriState.fromDbValue(parcel.readInt());
    }

    public StickerCapabilities(TriState triState, TriState triState2, TriState triState3, TriState triState4, TriState triState5, TriState triState6, TriState triState7) {
        if (triState == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A00 = triState;
        if (triState2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A01 = triState2;
        if (triState3 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = triState3;
        if (triState4 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A06 = triState4;
        if (triState5 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A05 = triState5;
        if (triState6 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = triState6;
        if (triState7 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A03 = triState7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r301.A03 == r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A00
            r302 = r0
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L4d
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A01
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L4d
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A02
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L4d
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A06
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L4d
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A05
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L4d
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A04
            r302 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L4d
            r0 = r301
            com.facebook.common.util.TriState r0 = r0.A03
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L52
        L4d:
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
        L52:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stickers.model.StickerCapabilities.A00():boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0007. Please report as an issue. */
    public final boolean A01(C6xd c6xd) {
        TriState triState;
        switch (c6xd == null ? -1 : c6xd.ordinal()) {
            case 0:
            case 1:
                triState = this.A02;
                return triState.asBoolean(false);
            case 2:
            case 8:
            case 9:
            case 10:
                triState = this.A00;
                return triState.asBoolean(false);
            case 3:
                triState = this.A01;
                return triState.asBoolean(false);
            case 4:
                triState = this.A05;
                return triState.asBoolean(false);
            case 5:
                triState = this.A06;
                return triState.asBoolean(false);
            case 6:
                triState = this.A04;
                return triState.asBoolean(false);
            case 7:
                triState = this.A03;
                return triState.asBoolean(false);
            default:
                return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof StickerCapabilities)) {
                return false;
            }
            StickerCapabilities stickerCapabilities = (StickerCapabilities) obj;
            if (this.A00 == stickerCapabilities.A00 && this.A01 == stickerCapabilities.A01 && this.A02 == stickerCapabilities.A02 && this.A06 == stickerCapabilities.A06 && this.A05 == stickerCapabilities.A05 && this.A04 == stickerCapabilities.A04 && this.A03 == stickerCapabilities.A03) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("StickerCapabilities{isCommentsCapable=");
        A0k.append(this.A00);
        A0k.append(", isComposerCapable=");
        A0k.append(this.A01);
        A0k.append(", isMessengerCapable=");
        A0k.append(this.A02);
        A0k.append(", isSmsCapable=");
        A0k.append(this.A06);
        A0k.append(", isPostsCapable=");
        A0k.append(this.A05);
        A0k.append(", isMontageCapable=");
        A0k.append(this.A04);
        A0k.append(", isMessengerKidsCapable=");
        A0k.append(this.A03);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00.getDbValue());
        parcel.writeInt(this.A01.getDbValue());
        parcel.writeInt(this.A02.getDbValue());
        parcel.writeInt(this.A06.getDbValue());
        parcel.writeInt(this.A05.getDbValue());
        parcel.writeInt(this.A04.getDbValue());
        parcel.writeInt(this.A03.getDbValue());
    }
}
