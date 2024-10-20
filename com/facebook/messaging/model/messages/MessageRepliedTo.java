package com.facebook.messaging.model.messages;

import X.0J6;
import X.1BL;
import X.1JF;
import X.5PY;
import X.5Pm;
import X.5Q0;
import X.82M;
import X.C1q7;
import X.C1q8;
import X.C53v;
import X.C63c;
import X.FJ8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.share.Share;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/* loaded from: MessageRepliedTo.class */
public final class MessageRepliedTo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(43);
    public final long A00;
    public final long A01;
    public final 5Pm A02;
    public final C1q8 A03;
    public final ParticipantInfo A04;
    public final C63c A05;
    public final 5PY A06;
    public final ImmutableList A07;
    public final ImmutableList A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0087, code lost:
    
        if (r303 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageRepliedTo(X.5Pm r302, X.C1q8 r303, com.facebook.messaging.model.messages.ParticipantInfo r304, X.C63c r305, X.5PY r306, com.google.common.collect.ImmutableList r307, com.google.common.collect.ImmutableList r308, java.lang.String r309, java.lang.String r310, java.lang.String r311, java.lang.String r312, java.lang.String r313, java.lang.String r314, long r315, boolean r317) {
        /*
            r301 = this;
            r0 = -1
            long r0 = (long) r0
            r318 = r0
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r309
            r0.A09 = r1
            r0 = r301
            r1 = r311
            r0.A0B = r1
            r0 = r301
            r1 = r304
            r0.A04 = r1
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r301
            r1 = r305
            r0.A05 = r1
            r0 = r301
            r1 = r314
            r0.A0E = r1
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r307
            r0.A07 = r1
            r0 = r301
            r1 = r308
            r0.A08 = r1
            r0 = r301
            r1 = r313
            r0.A0D = r1
            r0 = r301
            r1 = r315
            r0.A01 = r1
            r0 = r301
            r1 = r312
            r0.A0C = r1
            r0 = r301
            r1 = r310
            r0.A0A = r1
            r0 = r301
            r1 = r318
            r0.A00 = r1
            r0 = r317
            r320 = r0
            r0 = r301
            r1 = r317
            r0.A0F = r1
            r0 = r301
            r1 = r306
            r0.A06 = r1
            java.lang.String r0 = "DELETED"
            r321 = r0
            r0 = r321
            r1 = r312
            boolean r0 = r0.equals(r1)
            r322 = r0
            r0 = 1
            r323 = r0
            r0 = r309
            if (r0 == 0) goto L8a
            r0 = r311
            if (r0 == 0) goto L8a
            r0 = 1
            r320 = r0
            r0 = r303
            if (r0 != 0) goto L90
        L8a:
            r0 = 0
            r320 = r0
            r0 = 0
            r321 = r0
        L90:
            r0 = r322
            if (r0 != 0) goto L9d
            r0 = r320
            if (r0 != 0) goto L9d
            r0 = 0
            r323 = r0
        L9d:
            r0 = r323
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.messages.MessageRepliedTo.<init>(X.5Pm, X.1q8, com.facebook.messaging.model.messages.ParticipantInfo, X.63c, X.5PY, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00e3, code lost:
    
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageRepliedTo(X.6B1 r302) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.messages.MessageRepliedTo.<init>(X.6B1):void");
    }

    public MessageRepliedTo(Parcel parcel) {
        this.A09 = parcel.readString();
        this.A0B = parcel.readString();
        this.A04 = (ParticipantInfo) 1BL.A0C(parcel, ParticipantInfo.class);
        this.A03 = (C1q8) parcel.readSerializable();
        C63c c63c = (C63c) parcel.readSerializable();
        c63c.getClass();
        this.A05 = c63c;
        this.A0E = parcel.readString();
        this.A02 = FJ8.A01(parcel);
        this.A07 = C53v.A02(parcel, Attachment.CREATOR);
        this.A08 = C53v.A02(parcel, Share.CREATOR);
        this.A0D = parcel.readString();
        this.A01 = parcel.readLong();
        String readString = parcel.readString();
        readString.getClass();
        this.A0C = readString;
        this.A0A = parcel.readString();
        this.A00 = parcel.readLong();
        this.A0F = C53v.A0S(parcel);
        5PY readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.A06 = readSerializable;
    }

    public static MessageRepliedTo A00(Message message, C63c c63c) {
        String str = message.A1V;
        String str2 = null;
        if (1JF.A0B(str)) {
            return null;
        }
        ParticipantInfo participantInfo = message.A0K;
        participantInfo.getClass();
        if (1JF.A0B(participantInfo.A00())) {
            return null;
        }
        String A00 = participantInfo.A00();
        String str3 = message.A0F().A00;
        C1q8 A04 = message.A04();
        5Pm r0 = message.A08;
        ImmutableList immutableList = message.A0r;
        ImmutableList immutableList2 = message.A10;
        String str4 = message.A1m;
        long j = message.A06;
        String str5 = 5Q0.A06(message) ? "DELETED" : "VALID";
        if (C1q7.A0Q(message)) {
            GenericAdminMessageInfo genericAdminMessageInfo = message.A0C;
            genericAdminMessageInfo.getClass();
            GenericAdminMessageExtensibleData genericAdminMessageExtensibleData = genericAdminMessageInfo.A0E;
            if (genericAdminMessageExtensibleData == null) {
                genericAdminMessageExtensibleData = null;
            }
            genericAdminMessageExtensibleData.getClass();
            str2 = ((GroupPollingInfoProperties) genericAdminMessageExtensibleData).A02;
        }
        return new MessageRepliedTo(r0, A04, participantInfo, c63c, message.A0C(), immutableList, immutableList2, str, str2, A00, str5, str4, str3, j, message.A18.booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r301.A01 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01() {
        /*
            r301 = this;
            r0 = 2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.A0C
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3a
            java.lang.String r0 = "DELETED"
            r302 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.equals(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L3a
            r0 = r301
            long r0 = r0.A01
            r305 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r309
            if (r0 == 0) goto L3c
        L3a:
            r0 = 1
            r304 = r0
        L3c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.messages.MessageRepliedTo.A01():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MessageRepliedTo messageRepliedTo = (MessageRepliedTo) obj;
            if (!Objects.equal(this.A09, messageRepliedTo.A09) || !Objects.equal(this.A0B, messageRepliedTo.A0B) || !Objects.equal(this.A04, messageRepliedTo.A04) || this.A03 != messageRepliedTo.A03 || !Objects.equal(this.A05, messageRepliedTo.A05) || !Objects.equal(this.A0E, messageRepliedTo.A0E) || !Objects.equal(this.A02, messageRepliedTo.A02) || !Objects.equal(this.A07, messageRepliedTo.A07) || !Objects.equal(this.A08, messageRepliedTo.A08) || !Objects.equal(this.A0D, messageRepliedTo.A0D) || this.A01 != messageRepliedTo.A01 || !Objects.equal(this.A0C, messageRepliedTo.A0C) || !Objects.equal(this.A0A, messageRepliedTo.A0A) || !Objects.equal(Long.valueOf(this.A00), Long.valueOf(messageRepliedTo.A00)) || !Objects.equal(Boolean.valueOf(this.A0F), Boolean.valueOf(messageRepliedTo.A0F)) || !Objects.equal(this.A06, messageRepliedTo.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.A09;
        String str2 = this.A0B;
        C1q8 c1q8 = this.A03;
        C63c c63c = this.A05;
        String str3 = this.A0E;
        5Pm r0 = this.A02;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int hashCode3 = c1q8 == null ? 0 : c1q8.hashCode();
        int hashCode4 = c63c == null ? 0 : c63c.hashCode();
        int hashCode5 = ((((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + (r0 == null ? 0 : r0.hashCode());
        return ((((hashCode5 + 31) * 31) + 0J6.A03(this.A07, this.A08, this.A0D, Long.valueOf(this.A01), this.A0C)) * 31) + 0J6.A03(this.A0A, Long.valueOf(this.A00), this.A04, Boolean.valueOf(this.A0F), this.A06);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A04, i);
        parcel.writeSerializable(this.A03);
        parcel.writeSerializable(this.A05);
        parcel.writeString(this.A0E);
        FJ8.A0A(parcel, this.A02);
        C53v.A0D(parcel, this.A07);
        C53v.A0D(parcel, this.A08);
        parcel.writeString(this.A0D);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeSerializable(this.A06);
    }
}
