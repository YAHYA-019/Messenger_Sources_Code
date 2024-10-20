package com.facebook.messaging.model.messages;

import X.0S2;
import X.11T;
import X.1Du;
import X.1Mu;
import X.5PK;
import X.5PR;
import X.5PY;
import X.5Pa;
import X.5Pk;
import X.5Pm;
import X.C1pq;
import X.C1q8;
import X.C4Ny;
import X.C5qt;
import X.FJ8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.audio.transcriptions.model.MessageTranscription;
import com.facebook.messaging.business.commerce.model.retail.CommerceData;
import com.facebook.messaging.magicwords.model.MagicWordRange;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messagemetadata.MessageMetadataAtTextRange;
import com.facebook.messaging.model.mms.MmsData;
import com.facebook.messaging.model.payment.PaymentRequestData;
import com.facebook.messaging.model.payment.PaymentTransactionData;
import com.facebook.messaging.model.send.PendingSendQueueKey;
import com.facebook.messaging.model.send.SendError;
import com.facebook.messaging.model.share.SentShareAttachment;
import com.facebook.messaging.model.share.Share;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.montageattribution.MontageAttributionData;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.messaging.montage.model.montagereactions.MontageReactions;
import com.facebook.messaging.pinnedmessages.model.PinnedMessageMetadata;
import com.facebook.messaging.powerups.model.MessagePowerup;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.share.model.ComposerAppAttribution;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionsCount;
import com.facebook.xapp.messaging.threadview.model.aigenerated.AIGeneratedMetadata;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;
import com.facebook.xapp.messaging.threadview.model.groupedmessages.GroupedMessageForwardMetadata;
import com.facebook.xapp.messaging.threadview.model.highlightstab.HighlightsTabMetadata;
import com.facebook.xapp.messaging.threadview.model.mustache.MustacheActionMetadata;
import com.facebook.xapp.messaging.threadview.model.note.NoteMetadata;
import com.facebook.xapp.messaging.threadview.model.xma.logging.XmaContentLoggingMetadata;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: Message.class */
public final class Message implements Parcelable {
    public static volatile MessageReactions A28;
    public static volatile 5Pa A29;
    public static volatile 5PK A2A;
    public static volatile 5Pk A2B;
    public static volatile C1q8 A2C;
    public static volatile Publicity A2D;
    public static volatile MmsData A2E;
    public static volatile SendError A2F;
    public static volatile MontageReactions A2G;
    public static volatile MessagePowerup A2H;
    public static volatile 5PY A2I;
    public static volatile SecretString A2J;
    public static volatile SecretString A2K;
    public static volatile SecretString A2L;
    public static volatile SecretString A2M;
    public static final Parcelable.Creator CREATOR = new C4Ny(17);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final CommerceData A07;
    public final 5Pm A08;
    public final ContentAppAttribution A09;
    public final AdminMessageCta A0A;
    public final 5PR A0B;
    public final GenericAdminMessageInfo A0C;
    public final MessageReactions A0D;
    public final 5Pa A0E;
    public final MessageRepliedTo A0F;
    public final 5PK A0G;
    public final 5Pk A0H;
    public final C1q8 A0I;
    public final ParticipantInfo A0J;
    public final ParticipantInfo A0K;
    public final Publicity A0L;
    public final MmsData A0M;
    public final PaymentRequestData A0N;
    public final PaymentTransactionData A0O;
    public final PendingSendQueueKey A0P;
    public final SendError A0Q;
    public final SentShareAttachment A0R;
    public final ThreadKey A0S;
    public final ThreadKey A0T;
    public final ThreadKey A0U;
    public final ThreadKey A0V;
    public final MontageAttributionData A0W;
    public final MontageMetadata A0X;
    public final MontageReactions A0Y;
    public final PinnedMessageMetadata A0Z;
    public final MessagePowerup A0a;
    public final 5PY A0b;
    public final SecretString A0c;
    public final SecretString A0d;
    public final SecretString A0e;
    public final SecretString A0f;
    public final ComposerAppAttribution A0g;
    public final Capabilities A0h;
    public final MessageReactionsCount A0i;
    public final AIGeneratedMetadata A0j;
    public final BotResponseMetadata A0k;
    public final GroupedMessageForwardMetadata A0l;
    public final HighlightsTabMetadata A0m;
    public final MustacheActionMetadata A0n;
    public final NoteMetadata A0o;
    public final XmaContentLoggingMetadata A0p;
    public final ImmutableList A0q;
    public final ImmutableList A0r;
    public final ImmutableList A0s;
    public final ImmutableList A0t;
    public final ImmutableList A0u;
    public final ImmutableList A0v;
    public final ImmutableList A0w;
    public final ImmutableList A0x;
    public final ImmutableList A0y;
    public final ImmutableList A0z;
    public final ImmutableList A10;
    public final ImmutableList A11;
    public final ImmutableMap A12;
    public final ImmutableMap A13;
    public final ImmutableMap A14;
    public final ImmutableMap A15;
    public final Boolean A16;
    public final Boolean A17;
    public final Boolean A18;
    public final Boolean A19;
    public final Integer A1A;
    public final Integer A1B;
    public final Integer A1C;
    public final Integer A1D;
    public final Integer A1E;
    public final Integer A1F;
    public final Integer A1G;
    public final Integer A1H;
    public final Long A1I;
    public final Long A1J;
    public final Long A1K;
    public final Long A1L;
    public final Long A1M;
    public final String A1N;
    public final String A1O;
    public final String A1P;
    public final String A1Q;
    public final String A1R;
    public final String A1S;
    public final String A1T;
    public final String A1U;
    public final String A1V;
    public final String A1W;
    public final String A1X;
    public final String A1Y;
    public final String A1Z;
    public final String A1a;
    public final String A1b;
    public final String A1c;
    public final String A1d;
    public final String A1e;
    public final String A1f;
    public final String A1g;
    public final String A1h;
    public final String A1i;
    public final String A1j;
    public final String A1k;
    public final String A1l;
    public final String A1m;
    public final String A1n;
    public final String A1o;
    public final String A1p;
    public final String A1q;
    public final String A1r;
    public final Set A1s;
    public final boolean A1t;
    public final boolean A1u;
    public final boolean A1v;
    public final boolean A1w;
    public final boolean A1x;
    public final boolean A1y;
    public final boolean A1z;
    public final boolean A20;
    public final boolean A21;
    public final boolean A22;
    public final boolean A23;
    public final boolean A24;
    public final boolean A25;
    public final boolean A26;
    public final boolean A27;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x061a, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A01, r301.A0V) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Message(X.5PI r302) {
        /*
            Method dump skipped, instructions count: 1600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.messages.Message.<init>(X.5PI):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Message(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        XmaContentLoggingMetadata xmaContentLoggingMetadata = null;
        if (parcel.readInt() == 0) {
            this.A0j = null;
        } else {
            this.A0j = (AIGeneratedMetadata) AIGeneratedMetadata.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1N = null;
        } else {
            this.A1N = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = (AdminMessageCta) parcel.readParcelable(classLoader);
        }
        int readInt = parcel.readInt();
        ParticipantInfo[] participantInfoArr = new ParticipantInfo[readInt];
        for (int i = 0; i < readInt; i++) {
            participantInfoArr[i] = parcel.readParcelable(classLoader);
        }
        this.A0q = ImmutableList.copyOf(participantInfoArr);
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = 5PR.values()[parcel.readInt()];
        }
        int readInt2 = parcel.readInt();
        Attachment[] attachmentArr = new Attachment[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            attachmentArr[i2] = parcel.readParcelable(classLoader);
        }
        this.A0r = ImmutableList.copyOf(attachmentArr);
        if (parcel.readInt() == 0) {
            this.A1O = null;
        } else {
            this.A1O = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0s = null;
        } else {
            int readInt3 = parcel.readInt();
            String[] strArr = new String[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                strArr[i3] = parcel.readString();
            }
            this.A0s = ImmutableList.copyOf(strArr);
        }
        if (parcel.readInt() == 0) {
            this.A0k = null;
        } else {
            this.A0k = (BotResponseMetadata) BotResponseMetadata.CREATOR.createFromParcel(parcel);
        }
        HashMap hashMap = new HashMap();
        int readInt4 = parcel.readInt();
        for (int i4 = 0; i4 < readInt4; i4++) {
            hashMap.put(parcel.readString(), ThreadKey.CREATOR.createFromParcel(parcel));
        }
        this.A12 = ImmutableMap.copyOf((Map) hashMap);
        if (parcel.readInt() == 0) {
            this.A0G = null;
        } else {
            this.A0G = 5PK.values()[parcel.readInt()];
        }
        HashMap hashMap2 = new HashMap();
        int readInt5 = parcel.readInt();
        for (int i5 = 0; i5 < readInt5; i5++) {
            hashMap2.put(parcel.readString(), parcel.readString());
        }
        this.A13 = ImmutableMap.copyOf((Map) hashMap2);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (CommerceData) CommerceData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1P = null;
        } else {
            this.A1P = parcel.readString();
        }
        this.A02 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0g = null;
        } else {
            this.A0g = (ComposerAppAttribution) ComposerAppAttribution.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = (ContentAppAttribution) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1Q = null;
        } else {
            this.A1Q = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1R = null;
        } else {
            this.A1R = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1I = null;
        } else {
            this.A1I = Long.valueOf(parcel.readLong());
        }
        this.A1A = Integer.valueOf(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A0t = null;
        } else {
            int readInt6 = parcel.readInt();
            String[] strArr2 = new String[readInt6];
            for (int i6 = 0; i6 < readInt6; i6++) {
                strArr2[i6] = parcel.readString();
            }
            this.A0t = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A1J = null;
        } else {
            this.A1J = Long.valueOf(parcel.readLong());
        }
        HashMap hashMap3 = new HashMap();
        int readInt7 = parcel.readInt();
        for (int i7 = 0; i7 < readInt7; i7++) {
            hashMap3.put(parcel.readString(), parcel.readString());
        }
        this.A14 = ImmutableMap.copyOf((Map) hashMap3);
        if (parcel.readInt() == 0) {
            this.A1S = null;
        } else {
            this.A1S = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1B = null;
        } else {
            this.A1B = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A1T = null;
        } else {
            this.A1T = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1U = null;
        } else {
            this.A1U = parcel.readString();
        }
        boolean z = true;
        this.A1t = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = (GenericAdminMessageInfo) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0J = null;
        } else {
            this.A0J = (ParticipantInfo) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0l = null;
        } else {
            this.A0l = (GroupedMessageForwardMetadata) GroupedMessageForwardMetadata.CREATOR.createFromParcel(parcel);
        }
        this.A1u = parcel.readInt() == 1;
        this.A1v = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0m = null;
        } else {
            this.A0m = (HighlightsTabMetadata) HighlightsTabMetadata.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1V = null;
        } else {
            this.A1V = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = (SecretString) parcel.readParcelable(classLoader);
        }
        this.A1w = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A16 = null;
        } else {
            this.A16 = Boolean.valueOf(parcel.readInt() == 1);
        }
        this.A1x = parcel.readInt() == 1;
        this.A1y = parcel.readInt() == 1;
        this.A1z = parcel.readInt() == 1;
        this.A20 = parcel.readInt() == 1;
        this.A21 = parcel.readInt() == 1;
        this.A22 = parcel.readInt() == 1;
        this.A23 = parcel.readInt() == 1;
        this.A24 = parcel.readInt() == 1;
        this.A25 = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A17 = null;
        } else {
            this.A17 = Boolean.valueOf(parcel.readInt() == 1);
        }
        if (parcel.readInt() == 0) {
            this.A1W = null;
        } else {
            this.A1W = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1K = null;
        } else {
            this.A1K = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A0u = null;
        } else {
            int readInt8 = parcel.readInt();
            MagicWordRange[] magicWordRangeArr = new MagicWordRange[readInt8];
            for (int i8 = 0; i8 < readInt8; i8++) {
                magicWordRangeArr[i8] = MagicWordRange.CREATOR.createFromParcel(parcel);
            }
            this.A0u = ImmutableList.copyOf(magicWordRangeArr);
        }
        if (parcel.readInt() == 0) {
            this.A0b = null;
        } else {
            this.A0b = 5PY.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1L = null;
        } else {
            this.A1L = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A0i = null;
        } else {
            this.A0i = (MessageReactionsCount) MessageReactionsCount.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = 5Pa.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = (MessageRepliedTo) MessageRepliedTo.CREATOR.createFromParcel(parcel);
        }
        int readInt9 = parcel.readInt();
        MessageMetadataAtTextRange[] messageMetadataAtTextRangeArr = new MessageMetadataAtTextRange[readInt9];
        for (int i9 = 0; i9 < readInt9; i9++) {
            messageMetadataAtTextRangeArr[i9] = MessageMetadataAtTextRange.CREATOR.createFromParcel(parcel);
        }
        this.A0v = ImmutableList.copyOf(messageMetadataAtTextRangeArr);
        if (parcel.readInt() == 0) {
            this.A0M = null;
        } else {
            this.A0M = (MmsData) MmsData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = (MontageAttributionData) MontageAttributionData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1X = null;
        } else {
            this.A1X = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1Y = null;
        } else {
            this.A1Y = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0w = null;
        } else {
            int readInt10 = parcel.readInt();
            MontageFeedbackOverlay[] montageFeedbackOverlayArr = new MontageFeedbackOverlay[readInt10];
            for (int i10 = 0; i10 < readInt10; i10++) {
                montageFeedbackOverlayArr[i10] = parcel.readParcelable(classLoader);
            }
            this.A0w = ImmutableList.copyOf(montageFeedbackOverlayArr);
        }
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = (MontageMetadata) MontageMetadata.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = (MontageReactions) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1C = null;
        } else {
            this.A1C = 0S2.A00(1)[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1Z = null;
        } else {
            this.A1Z = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1D = null;
        } else {
            this.A1D = 0S2.A00(2)[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1E = null;
        } else {
            this.A1E = 0S2.A00(2)[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1a = null;
        } else {
            this.A1a = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1F = null;
        } else {
            this.A1F = 0S2.A00(5)[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1b = null;
        } else {
            this.A1b = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1c = null;
        } else {
            this.A1c = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = C1q8.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1d = null;
        } else {
            this.A1d = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0n = null;
        } else {
            this.A0n = (MustacheActionMetadata) MustacheActionMetadata.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0o = null;
        } else {
            this.A0o = (NoteMetadata) NoteMetadata.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1e = null;
        } else {
            this.A1e = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1f = null;
        } else {
            this.A1f = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1g = null;
        } else {
            this.A1g = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1h = null;
        } else {
            this.A1h = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0N = null;
        } else {
            this.A0N = (PaymentRequestData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0O = null;
        } else {
            this.A0O = (PaymentTransactionData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = (PinnedMessageMetadata) PinnedMessageMetadata.CREATOR.createFromParcel(parcel);
        }
        HashMap hashMap4 = new HashMap();
        int readInt11 = parcel.readInt();
        for (int i11 = 0; i11 < readInt11; i11++) {
            hashMap4.put(C5qt.values()[parcel.readInt()], parcel.readParcelable(classLoader));
        }
        this.A15 = ImmutableMap.copyOf((Map) hashMap4);
        if (parcel.readInt() == 0) {
            this.A1i = null;
        } else {
            this.A1i = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = (MessagePowerup) MessagePowerup.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0x = null;
        } else {
            int readInt12 = parcel.readInt();
            ProfileRange[] profileRangeArr = new ProfileRange[readInt12];
            for (int i12 = 0; i12 < readInt12; i12++) {
                profileRangeArr[i12] = parcel.readParcelable(classLoader);
            }
            this.A0x = ImmutableList.copyOf(profileRangeArr);
        }
        if (parcel.readInt() == 0) {
            this.A0y = null;
        } else {
            int readInt13 = parcel.readInt();
            ProfileRange[] profileRangeArr2 = new ProfileRange[readInt13];
            for (int i13 = 0; i13 < readInt13; i13++) {
                profileRangeArr2[i13] = parcel.readParcelable(classLoader);
            }
            this.A0y = ImmutableList.copyOf(profileRangeArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0L = null;
        } else {
            this.A0L = (Publicity) Publicity.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0D = null;
        } else {
            this.A0D = (MessageReactions) parcel.readParcelable(classLoader);
        }
        this.A03 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1j = null;
        } else {
            this.A1j = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1k = null;
        } else {
            this.A1k = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1G = null;
        } else {
            this.A1G = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = 5Pk.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = (SendError) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0P = null;
        } else {
            this.A0P = (PendingSendQueueKey) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0K = null;
        } else {
            this.A0K = (ParticipantInfo) parcel.readParcelable(classLoader);
        }
        int readInt14 = parcel.readInt();
        MediaResource[] mediaResourceArr = new MediaResource[readInt14];
        for (int i14 = 0; i14 < readInt14; i14++) {
            mediaResourceArr[i14] = parcel.readParcelable(classLoader);
        }
        this.A0z = ImmutableList.copyOf(mediaResourceArr);
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = (SentShareAttachment) SentShareAttachment.CREATOR.createFromParcel(parcel);
        }
        this.A04 = parcel.readLong();
        int readInt15 = parcel.readInt();
        Share[] shareArr = new Share[readInt15];
        for (int i15 = 0; i15 < readInt15; i15++) {
            shareArr[i15] = Share.CREATOR.createFromParcel(parcel);
        }
        this.A10 = ImmutableList.copyOf(shareArr);
        this.A26 = parcel.readInt() == 1;
        this.A18 = Boolean.valueOf(parcel.readInt() == 1);
        this.A19 = Boolean.valueOf(parcel.readInt() == 1);
        this.A27 = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A0d = null;
        } else {
            this.A0d = (SecretString) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1l = null;
        } else {
            this.A1l = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1m = null;
        } else {
            this.A1m = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1n = null;
        } else {
            this.A1n = parcel.readString();
        }
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1o = null;
        } else {
            this.A1o = parcel.readString();
        }
        this.A1H = Integer.valueOf(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A0e = null;
        } else {
            this.A0e = (SecretString) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0h = null;
        } else {
            this.A0h = (Capabilities) Capabilities.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1M = null;
        } else {
            this.A1M = Long.valueOf(parcel.readLong());
        }
        this.A05 = parcel.readLong();
        int readInt16 = parcel.readInt();
        MessageTranscription[] messageTranscriptionArr = new MessageTranscription[readInt16];
        for (int i16 = 0; i16 < readInt16; i16++) {
            messageTranscriptionArr[i16] = MessageTranscription.CREATOR.createFromParcel(parcel);
        }
        this.A11 = ImmutableList.copyOf(messageTranscriptionArr);
        if (parcel.readInt() == 0) {
            this.A1p = null;
        } else {
            this.A1p = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0f = null;
        } else {
            this.A0f = (SecretString) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1q = null;
        } else {
            this.A1q = parcel.readString();
        }
        this.A06 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1r = null;
        } else {
            this.A1r = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = FJ8.A01(parcel);
        }
        this.A0p = parcel.readInt() != 0 ? (XmaContentLoggingMetadata) XmaContentLoggingMetadata.CREATOR.createFromParcel(parcel) : xmaContentLoggingMetadata;
        HashSet hashSet = new HashSet();
        int readInt17 = parcel.readInt();
        for (int i17 = 0; i17 < readInt17; i17++) {
            hashSet.add(parcel.readString());
        }
        this.A1s = Collections.unmodifiableSet(hashSet);
    }

    public MessageReactions A00() {
        if (this.A1s.contains("reactions")) {
            return this.A0D;
        }
        if (A28 == null) {
            synchronized (this) {
                if (A28 == null) {
                    A28 = new MessageReactions((1Mu) new HashMultimap());
                }
            }
        }
        return A28;
    }

    public 5Pa A01() {
        if (this.A1s.contains("messageRenderingType")) {
            return this.A0E;
        }
        if (A29 == null) {
            synchronized (this) {
                if (A29 == null) {
                    A29 = 5Pa.A02;
                }
            }
        }
        return A29;
    }

    public 5PK A02() {
        if (this.A1s.contains("channelSource")) {
            return this.A0G;
        }
        if (A2A == null) {
            synchronized (this) {
                if (A2A == null) {
                    A2A = 5PK.A01;
                }
            }
        }
        return A2A;
    }

    public 5Pk A03() {
        if (this.A1s.contains("sendChannel")) {
            return this.A0H;
        }
        if (A2B == null) {
            synchronized (this) {
                if (A2B == null) {
                    A2B = 5Pk.A04;
                }
            }
        }
        return A2B;
    }

    public C1q8 A04() {
        if (this.A1s.contains("msgType")) {
            return this.A0I;
        }
        if (A2C == null) {
            synchronized (this) {
                if (A2C == null) {
                    A2C = C1q8.A0N;
                }
            }
        }
        return A2C;
    }

    public ParticipantInfo A05() {
        return this.A0K;
    }

    public Publicity A06() {
        if (this.A1s.contains("publicity")) {
            return this.A0L;
        }
        if (A2D == null) {
            synchronized (this) {
                if (A2D == null) {
                    A2D = Publicity.A03;
                }
            }
        }
        return A2D;
    }

    public MmsData A07() {
        if (this.A1s.contains("mmsData")) {
            return this.A0M;
        }
        if (A2E == null) {
            synchronized (this) {
                if (A2E == null) {
                    A2E = MmsData.A04;
                }
            }
        }
        return A2E;
    }

    public SendError A08() {
        if (this.A1s.contains("sendError")) {
            return this.A0Q;
        }
        if (A2F == null) {
            synchronized (this) {
                if (A2F == null) {
                    A2F = SendError.A08;
                }
            }
        }
        return A2F;
    }

    public ThreadKey A09() {
        return this.A0V;
    }

    public MontageReactions A0A() {
        if (this.A1s.contains("montageReactions")) {
            return this.A0Y;
        }
        if (A2G == null) {
            synchronized (this) {
                if (A2G == null) {
                    A2G = new MontageReactions((1Mu) new HashMultimap());
                }
            }
        }
        return A2G;
    }

    public MessagePowerup A0B() {
        if (this.A1s.contains("powerup")) {
            return this.A0a;
        }
        if (A2H == null) {
            synchronized (this) {
                if (A2H == null) {
                    A2H = new MessagePowerup(null, new HashSet());
                }
            }
        }
        return A2H;
    }

    public 5PY A0C() {
        if (this.A1s.contains("messageHiddenState")) {
            return this.A0b;
        }
        if (A2I == null) {
            synchronized (this) {
                if (A2I == null) {
                    A2I = 5PY.A03;
                }
            }
        }
        return A2I;
    }

    public SecretString A0D() {
        if (this.A1s.contains("iout")) {
            return this.A0c;
        }
        if (A2J == null) {
            synchronized (this) {
                if (A2J == null) {
                    A2J = new SecretString((String) null);
                }
            }
        }
        return A2J;
    }

    public SecretString A0E() {
        if (this.A1s.contains("snippet")) {
            return this.A0d;
        }
        if (A2K == null) {
            synchronized (this) {
                if (A2K == null) {
                    A2K = new SecretString((String) null);
                }
            }
        }
        return A2K;
    }

    public SecretString A0F() {
        if (this.A1s.contains("text")) {
            return this.A0e;
        }
        if (A2L == null) {
            synchronized (this) {
                if (A2L == null) {
                    A2L = new SecretString((String) null);
                }
            }
        }
        return A2L;
    }

    public SecretString A0G() {
        if (this.A1s.contains("translationText")) {
            return this.A0f;
        }
        if (A2M == null) {
            synchronized (this) {
                if (A2M == null) {
                    A2M = new SecretString((String) null);
                }
            }
        }
        return A2M;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            if (!11T.A0O(this.A0j, message.A0j) || !11T.A0O(this.A1N, message.A1N) || !11T.A0O(this.A0A, message.A0A) || !11T.A0O(this.A0q, message.A0q) || this.A00 != message.A00 || this.A0B != message.A0B || !11T.A0O(this.A0r, message.A0r) || !11T.A0O(this.A1O, message.A1O) || !11T.A0O(this.A0s, message.A0s) || !11T.A0O(this.A0k, message.A0k) || !11T.A0O(this.A12, message.A12) || A02() != message.A02() || !11T.A0O(this.A13, message.A13) || !11T.A0O(this.A07, message.A07) || !11T.A0O(this.A1P, message.A1P) || this.A02 != message.A02 || !11T.A0O(this.A0g, message.A0g) || !11T.A0O(this.A09, message.A09) || !11T.A0O(this.A1Q, message.A1Q) || !11T.A0O(this.A1R, message.A1R) || !11T.A0O(this.A0S, message.A0S) || !11T.A0O(this.A1I, message.A1I) || !11T.A0O(this.A1A, message.A1A) || !11T.A0O(this.A0t, message.A0t) || !11T.A0O(this.A1J, message.A1J) || !11T.A0O(this.A14, message.A14) || !11T.A0O(this.A1S, message.A1S) || !11T.A0O(this.A1B, message.A1B) || !11T.A0O(this.A1T, message.A1T) || !11T.A0O(this.A1U, message.A1U) || this.A1t != message.A1t || !11T.A0O(this.A0C, message.A0C) || !11T.A0O(this.A0J, message.A0J) || !11T.A0O(this.A0l, message.A0l) || this.A1u != message.A1u || this.A1v != message.A1v || !11T.A0O(this.A0m, message.A0m) || !11T.A0O(this.A1V, message.A1V) || !11T.A0O(A0D(), message.A0D()) || this.A1w != message.A1w || !11T.A0O(this.A16, message.A16) || this.A1x != message.A1x || this.A1y != message.A1y || this.A1z != message.A1z || this.A20 != message.A20 || this.A21 != message.A21 || this.A22 != message.A22 || this.A23 != message.A23 || this.A24 != message.A24 || this.A25 != message.A25 || !11T.A0O(this.A17, message.A17) || !11T.A0O(this.A1W, message.A1W) || !11T.A0O(this.A1K, message.A1K) || !11T.A0O(this.A0u, message.A0u) || A0C() != message.A0C() || !11T.A0O(this.A1L, message.A1L) || !11T.A0O(this.A0i, message.A0i) || A01() != message.A01() || !11T.A0O(this.A0F, message.A0F) || !11T.A0O(this.A0v, message.A0v) || !11T.A0O(A07(), message.A07()) || !11T.A0O(this.A0W, message.A0W) || !11T.A0O(this.A1X, message.A1X) || !11T.A0O(this.A1Y, message.A1Y) || !11T.A0O(this.A0w, message.A0w) || !11T.A0O(this.A0X, message.A0X) || !11T.A0O(A0A(), message.A0A()) || this.A1C != message.A1C || !11T.A0O(this.A1Z, message.A1Z) || this.A1D != message.A1D || this.A1E != message.A1E || !11T.A0O(this.A1a, message.A1a) || this.A1F != message.A1F || !11T.A0O(this.A1b, message.A1b) || !11T.A0O(this.A1c, message.A1c) || A04() != message.A04() || !11T.A0O(this.A1d, message.A1d) || !11T.A0O(this.A0n, message.A0n) || !11T.A0O(this.A0o, message.A0o) || !11T.A0O(this.A1e, message.A1e) || !11T.A0O(this.A1f, message.A1f) || !11T.A0O(this.A1g, message.A1g) || !11T.A0O(this.A1h, message.A1h) || !11T.A0O(this.A0T, message.A0T) || !11T.A0O(this.A0N, message.A0N) || !11T.A0O(this.A0O, message.A0O) || !11T.A0O(this.A0Z, message.A0Z) || !11T.A0O(this.A15, message.A15) || !11T.A0O(this.A1i, message.A1i) || !11T.A0O(A0B(), message.A0B()) || !11T.A0O(this.A0x, message.A0x) || !11T.A0O(this.A0y, message.A0y) || !11T.A0O(A06(), message.A06()) || !11T.A0O(A00(), message.A00()) || this.A03 != message.A03 || !11T.A0O(this.A1j, message.A1j) || !11T.A0O(this.A1k, message.A1k) || !11T.A0O(this.A1G, message.A1G) || A03() != message.A03() || !11T.A0O(A08(), message.A08()) || !11T.A0O(this.A0P, message.A0P) || !11T.A0O(this.A0K, message.A0K) || !11T.A0O(this.A0z, message.A0z) || !11T.A0O(this.A0R, message.A0R) || this.A04 != message.A04 || !11T.A0O(this.A10, message.A10) || this.A26 != message.A26 || !11T.A0O(this.A18, message.A18) || !11T.A0O(this.A19, message.A19) || this.A27 != message.A27 || !11T.A0O(A0E(), message.A0E()) || !11T.A0O(this.A1l, message.A1l) || !11T.A0O(this.A1m, message.A1m) || !11T.A0O(this.A1n, message.A1n) || this.A01 != message.A01 || !11T.A0O(this.A0U, message.A0U) || !11T.A0O(this.A1o, message.A1o) || !11T.A0O(this.A1H, message.A1H) || !11T.A0O(A0F(), message.A0F()) || !11T.A0O(this.A0h, message.A0h) || !11T.A0O(this.A0V, message.A0V) || !11T.A0O(this.A1M, message.A1M) || this.A05 != message.A05 || !11T.A0O(this.A11, message.A11) || !11T.A0O(this.A1p, message.A1p) || !11T.A0O(A0G(), message.A0G()) || !11T.A0O(this.A1q, message.A1q) || this.A06 != message.A06 || !11T.A0O(this.A1r, message.A1r) || !11T.A0O(this.A08, message.A08) || !11T.A0O(this.A0p, message.A0p)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = (C1pq.A04(this.A0q, C1pq.A04(this.A0A, C1pq.A04(this.A1N, C1pq.A04(this.A0j, 1)))) * 31) + this.A00;
        5PR r0 = this.A0B;
        int i = -1;
        int A042 = C1pq.A04(this.A12, C1pq.A04(this.A0k, C1pq.A04(this.A0s, C1pq.A04(this.A1O, C1pq.A04(this.A0r, (A04 * 31) + (r0 == null ? -1 : r0.ordinal()))))));
        5PK A02 = A02();
        int A043 = C1pq.A04(this.A0u, C1pq.A04(this.A1K, C1pq.A04(this.A1W, C1pq.A04(this.A17, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A16, C1pq.A02(C1pq.A04(A0D(), C1pq.A04(this.A1V, C1pq.A04(this.A0m, C1pq.A02(C1pq.A02(C1pq.A04(this.A0l, C1pq.A04(this.A0J, C1pq.A04(this.A0C, C1pq.A02(C1pq.A04(this.A1U, C1pq.A04(this.A1T, C1pq.A04(this.A1B, C1pq.A04(this.A1S, C1pq.A04(this.A14, C1pq.A04(this.A1J, C1pq.A04(this.A0t, C1pq.A04(this.A1A, C1pq.A04(this.A1I, C1pq.A04(this.A0S, C1pq.A04(this.A1R, C1pq.A04(this.A1Q, C1pq.A04(this.A09, C1pq.A04(this.A0g, C1pq.A01(C1pq.A04(this.A1P, C1pq.A04(this.A07, C1pq.A04(this.A13, (A042 * 31) + (A02 == null ? -1 : A02.ordinal())))), this.A02))))))))))))))), this.A1t)))), this.A1u), this.A1v)))), this.A1w)), this.A1x), this.A1y), this.A1z), this.A20), this.A21), this.A22), this.A23), this.A24), this.A25)))));
        5PY A0C = A0C();
        int A044 = C1pq.A04(this.A0i, C1pq.A04(this.A1L, (A043 * 31) + (A0C == null ? -1 : A0C.ordinal())));
        5Pa A01 = A01();
        int A045 = C1pq.A04(A0A(), C1pq.A04(this.A0X, C1pq.A04(this.A0w, C1pq.A04(this.A1Y, C1pq.A04(this.A1X, C1pq.A04(this.A0W, C1pq.A04(A07(), C1pq.A04(this.A0v, C1pq.A04(this.A0F, (A044 * 31) + (A01 == null ? -1 : A01.ordinal()))))))))));
        Integer num = this.A1C;
        int A046 = C1pq.A04(this.A1Z, (A045 * 31) + (num == null ? -1 : num.intValue()));
        Integer num2 = this.A1D;
        int intValue = (A046 * 31) + (num2 == null ? -1 : num2.intValue());
        Integer num3 = this.A1E;
        int A047 = C1pq.A04(this.A1a, (intValue * 31) + (num3 == null ? -1 : num3.intValue()));
        Integer num4 = this.A1F;
        int A048 = C1pq.A04(this.A1c, C1pq.A04(this.A1b, (A047 * 31) + (num4 == null ? -1 : num4.intValue())));
        C1q8 A049 = A04();
        int A0410 = C1pq.A04(this.A1G, C1pq.A04(this.A1k, C1pq.A04(this.A1j, C1pq.A01(C1pq.A04(A00(), C1pq.A04(A06(), C1pq.A04(this.A0y, C1pq.A04(this.A0x, C1pq.A04(A0B(), C1pq.A04(this.A1i, C1pq.A04(this.A15, C1pq.A04(this.A0Z, C1pq.A04(this.A0O, C1pq.A04(this.A0N, C1pq.A04(this.A0T, C1pq.A04(this.A1h, C1pq.A04(this.A1g, C1pq.A04(this.A1f, C1pq.A04(this.A1e, C1pq.A04(this.A0o, C1pq.A04(this.A0n, C1pq.A04(this.A1d, (A048 * 31) + (A049 == null ? -1 : A049.ordinal()))))))))))))))))))), this.A03))));
        5Pk A03 = A03();
        if (A03 != null) {
            i = A03.ordinal();
        }
        return C1pq.A04(this.A0p, C1pq.A04(this.A08, C1pq.A04(this.A1r, C1pq.A01(C1pq.A04(this.A1q, C1pq.A04(A0G(), C1pq.A04(this.A1p, C1pq.A04(this.A11, C1pq.A01(C1pq.A04(this.A1M, C1pq.A04(this.A0V, C1pq.A04(this.A0h, C1pq.A04(A0F(), C1pq.A04(this.A1H, C1pq.A04(this.A1o, C1pq.A04(this.A0U, (C1pq.A04(this.A1n, C1pq.A04(this.A1m, C1pq.A04(this.A1l, C1pq.A04(A0E(), C1pq.A02(C1pq.A04(this.A19, C1pq.A04(this.A18, C1pq.A02(C1pq.A04(this.A10, C1pq.A01(C1pq.A04(this.A0R, C1pq.A04(this.A0z, C1pq.A04(this.A0K, C1pq.A04(this.A0P, C1pq.A04(A08(), (A0410 * 31) + i))))), this.A04)), this.A26))), this.A27))))) * 31) + this.A01))))))), this.A05))))), this.A06))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AIGeneratedMetadata aIGeneratedMetadata = this.A0j;
        if (aIGeneratedMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIGeneratedMetadata.writeToParcel(parcel, i);
        }
        String str = this.A1N;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        AdminMessageCta adminMessageCta = this.A0A;
        if (adminMessageCta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(adminMessageCta, i);
        }
        ImmutableList immutableList = this.A0q;
        parcel.writeInt(immutableList.size());
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((ParticipantInfo) it.next(), i);
        }
        parcel.writeInt(this.A00);
        5PR r0 = this.A0B;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r0.ordinal());
        }
        ImmutableList immutableList2 = this.A0r;
        parcel.writeInt(immutableList2.size());
        1Du it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((Attachment) it2.next(), i);
        }
        String str2 = this.A1O;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        ImmutableList immutableList3 = this.A0s;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList3.size());
            1Du it3 = immutableList3.iterator();
            while (it3.hasNext()) {
                parcel.writeString((String) it3.next());
            }
        }
        BotResponseMetadata botResponseMetadata = this.A0k;
        if (botResponseMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            botResponseMetadata.writeToParcel(parcel, i);
        }
        ImmutableMap immutableMap = this.A12;
        parcel.writeInt(immutableMap.size());
        1Du it4 = immutableMap.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            parcel.writeString((String) entry.getKey());
            ((ThreadKey) entry.getValue()).writeToParcel(parcel, i);
        }
        5PK r02 = this.A0G;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r02.ordinal());
        }
        ImmutableMap immutableMap2 = this.A13;
        parcel.writeInt(immutableMap2.size());
        1Du it5 = immutableMap2.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it5.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeString((String) entry2.getValue());
        }
        CommerceData commerceData = this.A07;
        if (commerceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commerceData.writeToParcel(parcel, i);
        }
        String str3 = this.A1P;
        if (str3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str3);
        }
        parcel.writeLong(this.A02);
        ComposerAppAttribution composerAppAttribution = this.A0g;
        if (composerAppAttribution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            composerAppAttribution.writeToParcel(parcel, i);
        }
        ContentAppAttribution contentAppAttribution = this.A09;
        if (contentAppAttribution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(contentAppAttribution, i);
        }
        String str4 = this.A1Q;
        if (str4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str4);
        }
        String str5 = this.A1R;
        if (str5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str5);
        }
        ThreadKey threadKey = this.A0S;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        Long l = this.A1I;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.A1A.intValue());
        ImmutableList immutableList4 = this.A0t;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList4.size());
            1Du it6 = immutableList4.iterator();
            while (it6.hasNext()) {
                parcel.writeString((String) it6.next());
            }
        }
        Long l2 = this.A1J;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        ImmutableMap immutableMap3 = this.A14;
        parcel.writeInt(immutableMap3.size());
        1Du it7 = immutableMap3.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it7.next();
            parcel.writeString((String) entry3.getKey());
            parcel.writeString((String) entry3.getValue());
        }
        String str6 = this.A1S;
        if (str6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str6);
        }
        Integer num = this.A1B;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        String str7 = this.A1T;
        if (str7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str7);
        }
        String str8 = this.A1U;
        if (str8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str8);
        }
        parcel.writeInt(this.A1t ? 1 : 0);
        GenericAdminMessageInfo genericAdminMessageInfo = this.A0C;
        if (genericAdminMessageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(genericAdminMessageInfo, i);
        }
        ParticipantInfo participantInfo = this.A0J;
        if (participantInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(participantInfo, i);
        }
        GroupedMessageForwardMetadata groupedMessageForwardMetadata = this.A0l;
        if (groupedMessageForwardMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupedMessageForwardMetadata.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A1u ? 1 : 0);
        parcel.writeInt(this.A1v ? 1 : 0);
        HighlightsTabMetadata highlightsTabMetadata = this.A0m;
        if (highlightsTabMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            highlightsTabMetadata.writeToParcel(parcel, i);
        }
        String str9 = this.A1V;
        if (str9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str9);
        }
        SecretString secretString = this.A0c;
        if (secretString == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(secretString, i);
        }
        parcel.writeInt(this.A1w ? 1 : 0);
        Boolean bool = this.A16;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A1x ? 1 : 0);
        parcel.writeInt(this.A1y ? 1 : 0);
        parcel.writeInt(this.A1z ? 1 : 0);
        parcel.writeInt(this.A20 ? 1 : 0);
        parcel.writeInt(this.A21 ? 1 : 0);
        parcel.writeInt(this.A22 ? 1 : 0);
        parcel.writeInt(this.A23 ? 1 : 0);
        parcel.writeInt(this.A24 ? 1 : 0);
        parcel.writeInt(this.A25 ? 1 : 0);
        Boolean bool2 = this.A17;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        String str10 = this.A1W;
        if (str10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str10);
        }
        Long l3 = this.A1K;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        ImmutableList immutableList5 = this.A0u;
        if (immutableList5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList5.size());
            1Du it8 = immutableList5.iterator();
            while (it8.hasNext()) {
                ((MagicWordRange) it8.next()).writeToParcel(parcel, i);
            }
        }
        5PY r03 = this.A0b;
        if (r03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r03.ordinal());
        }
        Long l4 = this.A1L;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        MessageReactionsCount messageReactionsCount = this.A0i;
        if (messageReactionsCount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageReactionsCount.writeToParcel(parcel, i);
        }
        5Pa r04 = this.A0E;
        if (r04 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r04.ordinal());
        }
        MessageRepliedTo messageRepliedTo = this.A0F;
        if (messageRepliedTo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageRepliedTo.writeToParcel(parcel, i);
        }
        ImmutableList immutableList6 = this.A0v;
        parcel.writeInt(immutableList6.size());
        1Du it9 = immutableList6.iterator();
        while (it9.hasNext()) {
            ((MessageMetadataAtTextRange) it9.next()).writeToParcel(parcel, i);
        }
        MmsData mmsData = this.A0M;
        if (mmsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mmsData.writeToParcel(parcel, i);
        }
        MontageAttributionData montageAttributionData = this.A0W;
        if (montageAttributionData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            montageAttributionData.writeToParcel(parcel, i);
        }
        String str11 = this.A1X;
        if (str11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str11);
        }
        String str12 = this.A1Y;
        if (str12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str12);
        }
        ImmutableList immutableList7 = this.A0w;
        if (immutableList7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList7.size());
            1Du it10 = immutableList7.iterator();
            while (it10.hasNext()) {
                parcel.writeParcelable((MontageFeedbackOverlay) it10.next(), i);
            }
        }
        MontageMetadata montageMetadata = this.A0X;
        if (montageMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            montageMetadata.writeToParcel(parcel, i);
        }
        MontageReactions montageReactions = this.A0Y;
        if (montageReactions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(montageReactions, i);
        }
        Integer num2 = this.A1C;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        String str13 = this.A1Z;
        if (str13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str13);
        }
        Integer num3 = this.A1D;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.A1E;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        String str14 = this.A1a;
        if (str14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str14);
        }
        Integer num5 = this.A1F;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        String str15 = this.A1b;
        if (str15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str15);
        }
        String str16 = this.A1c;
        if (str16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str16);
        }
        C1q8 c1q8 = this.A0I;
        if (c1q8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(c1q8.ordinal());
        }
        String str17 = this.A1d;
        if (str17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str17);
        }
        MustacheActionMetadata mustacheActionMetadata = this.A0n;
        if (mustacheActionMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mustacheActionMetadata.writeToParcel(parcel, i);
        }
        NoteMetadata noteMetadata = this.A0o;
        if (noteMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noteMetadata.writeToParcel(parcel, i);
        }
        String str18 = this.A1e;
        if (str18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str18);
        }
        String str19 = this.A1f;
        if (str19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str19);
        }
        String str20 = this.A1g;
        if (str20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str20);
        }
        String str21 = this.A1h;
        if (str21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str21);
        }
        ThreadKey threadKey2 = this.A0T;
        if (threadKey2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey2.writeToParcel(parcel, i);
        }
        PaymentRequestData paymentRequestData = this.A0N;
        if (paymentRequestData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(paymentRequestData, i);
        }
        PaymentTransactionData paymentTransactionData = this.A0O;
        if (paymentTransactionData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(paymentTransactionData, i);
        }
        PinnedMessageMetadata pinnedMessageMetadata = this.A0Z;
        if (pinnedMessageMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pinnedMessageMetadata.writeToParcel(parcel, i);
        }
        ImmutableMap immutableMap4 = this.A15;
        parcel.writeInt(immutableMap4.size());
        1Du it11 = immutableMap4.entrySet().iterator();
        while (it11.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it11.next();
            parcel.writeInt(((C5qt) entry4.getKey()).ordinal());
            parcel.writeParcelable((Parcelable) entry4.getValue(), i);
        }
        String str22 = this.A1i;
        if (str22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str22);
        }
        MessagePowerup messagePowerup = this.A0a;
        if (messagePowerup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagePowerup.writeToParcel(parcel, i);
        }
        ImmutableList immutableList8 = this.A0x;
        if (immutableList8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList8.size());
            1Du it12 = immutableList8.iterator();
            while (it12.hasNext()) {
                parcel.writeParcelable((ProfileRange) it12.next(), i);
            }
        }
        ImmutableList immutableList9 = this.A0y;
        if (immutableList9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList9.size());
            1Du it13 = immutableList9.iterator();
            while (it13.hasNext()) {
                parcel.writeParcelable((ProfileRange) it13.next(), i);
            }
        }
        Publicity publicity = this.A0L;
        if (publicity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            publicity.writeToParcel(parcel, i);
        }
        MessageReactions messageReactions = this.A0D;
        if (messageReactions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(messageReactions, i);
        }
        parcel.writeLong(this.A03);
        String str23 = this.A1j;
        if (str23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str23);
        }
        String str24 = this.A1k;
        if (str24 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str24);
        }
        Integer num6 = this.A1G;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        5Pk r05 = this.A0H;
        if (r05 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r05.ordinal());
        }
        SendError sendError = this.A0Q;
        if (sendError == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(sendError, i);
        }
        PendingSendQueueKey pendingSendQueueKey = this.A0P;
        if (pendingSendQueueKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(pendingSendQueueKey, i);
        }
        ParticipantInfo participantInfo2 = this.A0K;
        if (participantInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(participantInfo2, i);
        }
        ImmutableList immutableList10 = this.A0z;
        parcel.writeInt(immutableList10.size());
        1Du it14 = immutableList10.iterator();
        while (it14.hasNext()) {
            parcel.writeParcelable((MediaResource) it14.next(), i);
        }
        SentShareAttachment sentShareAttachment = this.A0R;
        if (sentShareAttachment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sentShareAttachment.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.A04);
        ImmutableList immutableList11 = this.A10;
        parcel.writeInt(immutableList11.size());
        1Du it15 = immutableList11.iterator();
        while (it15.hasNext()) {
            ((Share) it15.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A26 ? 1 : 0);
        parcel.writeInt(this.A18.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A19.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A27 ? 1 : 0);
        SecretString secretString2 = this.A0d;
        if (secretString2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(secretString2, i);
        }
        String str25 = this.A1l;
        if (str25 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str25);
        }
        String str26 = this.A1m;
        if (str26 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str26);
        }
        String str27 = this.A1n;
        if (str27 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str27);
        }
        parcel.writeInt(this.A01);
        ThreadKey threadKey3 = this.A0U;
        if (threadKey3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey3.writeToParcel(parcel, i);
        }
        String str28 = this.A1o;
        if (str28 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str28);
        }
        parcel.writeInt(this.A1H.intValue());
        SecretString secretString3 = this.A0e;
        if (secretString3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(secretString3, i);
        }
        Capabilities capabilities = this.A0h;
        if (capabilities == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            capabilities.writeToParcel(parcel, i);
        }
        ThreadKey threadKey4 = this.A0V;
        if (threadKey4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey4.writeToParcel(parcel, i);
        }
        Long l5 = this.A1M;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        parcel.writeLong(this.A05);
        ImmutableList immutableList12 = this.A11;
        parcel.writeInt(immutableList12.size());
        1Du it16 = immutableList12.iterator();
        while (it16.hasNext()) {
            ((MessageTranscription) it16.next()).writeToParcel(parcel, i);
        }
        String str29 = this.A1p;
        if (str29 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str29);
        }
        SecretString secretString4 = this.A0f;
        if (secretString4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(secretString4, i);
        }
        String str30 = this.A1q;
        if (str30 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str30);
        }
        parcel.writeLong(this.A06);
        String str31 = this.A1r;
        if (str31 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str31);
        }
        5Pm r06 = this.A08;
        if (r06 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, r06);
        }
        XmaContentLoggingMetadata xmaContentLoggingMetadata = this.A0p;
        if (xmaContentLoggingMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xmaContentLoggingMetadata.writeToParcel(parcel, i);
        }
        Set set = this.A1s;
        parcel.writeInt(set.size());
        Iterator it17 = set.iterator();
        while (it17.hasNext()) {
            parcel.writeString((String) it17.next());
        }
    }
}
