package com.facebook.messaging.model.threads;

import X.0S2;
import X.11T;
import X.1Du;
import X.1F9;
import X.1Ks;
import X.21A;
import X.AnonymousClass001;
import X.AnonymousClass214;
import X.AnonymousClass217;
import X.AnonymousClass219;
import X.C1pq;
import X.C1zm;
import X.C1zu;
import X.C20a;
import X.C20o;
import X.C20r;
import X.C2xc;
import X.EnumC00893pQ;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.GraphQLMessageThreadCannotReplyReason;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadWarningType;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.communitymessaging.threadfull.model.ThreadFullnessState;
import com.facebook.messaging.events.model.EventData;
import com.facebook.messaging.games.pushnotification.model.GamesPushNotificationSettings;
import com.facebook.messaging.magicwords.model.MagicWord;
import com.facebook.messaging.model.business.MessageSuggestedReply;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ads.AdContextData;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.threadview.notificationbanner.model.animated.AnimatedThreadActivityBannerDataModel;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemePayload;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: ThreadSummary.class */
public final class ThreadSummary implements C20o, Parcelable {
    public static volatile TriState A2q;
    public static volatile GraphQLMessageThreadCannotReplyReason A2r;
    public static volatile GraphQLMessengerGroupThreadWarningType A2s;
    public static volatile ThreadFullnessState A2t;
    public static volatile GroupThreadData A2u;
    public static volatile NotificationSetting A2v;
    public static volatile NotificationSetting A2w;
    public static volatile AnonymousClass214 A2x;
    public static volatile ThreadCustomization A2y;
    public static volatile AnonymousClass219 A2z;
    public static volatile ThreadRtcCallInfoData A30;
    public static volatile ThreadRtcRoomInfoData A31;
    public static volatile C20a A32;
    public static volatile C1zu A33;
    public static volatile HeterogeneousMap A34;
    public static volatile CompositeThreadThemeInfo A35;
    public static volatile ImmutableList A36;
    public static volatile Integer A37;
    public static volatile String A38;
    public static volatile String A39;
    public static volatile String A3A;
    public static final Parcelable.Creator CREATOR = new C2xc(37);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final Uri A0Q;
    public final Uri A0R;
    public final Uri A0S;
    public final Uri A0T;
    public final Uri A0U;
    public final Uri A0V;
    public final TriState A0W;
    public final GraphQLMessageThreadCannotReplyReason A0X;
    public final GraphQLMessengerGroupThreadSubType A0Y;
    public final GraphQLMessengerGroupThreadWarningType A0Z;
    public final CallToAction A0a;
    public final CallToAction A0b;
    public final ThreadFullnessState A0c;
    public final EventData A0d;
    public final GamesPushNotificationSettings A0e;
    public final MessageSuggestedReply A0f;
    public final 1F9 A0g;
    public final MessageDraft A0h;
    public final ParticipantInfo A0i;
    public final ThreadKey A0j;
    public final ThreadKey A0k;
    public final ThreadKey A0l;
    public final ThreadKey A0m;
    public final ThreadKey A0n;
    public final AdsConversionsQPData A0o;
    public final GroupThreadData A0p;
    public final LearningSpaceThreadData A0q;
    public final MarketplaceThreadData A0r;
    public final MontageThreadPreview A0s;
    public final NewFriendBumpThreadData A0t;
    public final NotificationSetting A0u;
    public final NotificationSetting A0v;
    public final AnonymousClass214 A0w;
    public final ProfessionalMetadata A0x;
    public final RelatedPageThreadData A0y;
    public final RequestAppointmentData A0z;
    public final ThreadBookingRequests A10;
    public final ThreadConnectivityData A11;
    public final ThreadCustomization A12;
    public final ThreadMediaPreview A13;
    public final AnonymousClass219 A14;
    public final ThreadRtcCallInfoData A15;
    public final ThreadRtcRoomInfoData A16;
    public final C20a A17;
    public final AdContextData A18;
    public final MontageBucketPreview A19;
    public final C1zu A1A;
    public final AnimatedThreadActivityBannerDataModel A1B;
    public final Capabilities A1C;
    public final HeterogeneousMap A1D;
    public final CompositeThreadThemeInfo A1E;
    public final ImmutableList A1F;
    public final ImmutableList A1G;
    public final ImmutableList A1H;
    public final ImmutableList A1I;
    public final ImmutableList A1J;
    public final ImmutableList A1K;
    public final ImmutableList A1L;
    public final ImmutableList A1M;
    public final ImmutableList A1N;
    public final ImmutableList A1O;
    public final ImmutableList A1P;
    public final ImmutableList A1Q;
    public final ImmutableMap A1R;
    public final ImmutableMap A1S;
    public final ImmutableSet A1T;
    public final Boolean A1U;
    public final Integer A1V;
    public final Integer A1W;
    public final Integer A1X;
    public final Integer A1Y;
    public final Integer A1Z;
    public final Integer A1a;
    public final Integer A1b;
    public final Integer A1c;
    public final Integer A1d;
    public final Long A1e;
    public final Long A1f;
    public final Long A1g;
    public final Long A1h;
    public final Long A1i;
    public final Long A1j;
    public final Long A1k;
    public final Long A1l;
    public final Long A1m;
    public final String A1n;
    public final String A1o;
    public final String A1p;
    public final String A1q;
    public final String A1r;
    public final String A1s;
    public final String A1t;
    public final String A1u;
    public final String A1v;
    public final String A1w;
    public final String A1x;
    public final String A1y;
    public final String A1z;
    public final String A20;
    public final String A21;
    public final String A22;
    public final String A23;
    public final String A24;
    public final String A25;
    public final String A26;
    public final String A27;
    public final String A28;
    public final String A29;
    public final String A2A;
    public final String A2B;
    public final String A2C;
    public final String A2D;
    public final String A2E;
    public final Set A2F;
    public final boolean A2G;
    public final boolean A2H;
    public final boolean A2I;
    public final boolean A2J;
    public final boolean A2K;
    public final boolean A2L;
    public final boolean A2M;
    public final boolean A2N;
    public final boolean A2O;
    public final boolean A2P;
    public final boolean A2Q;
    public final boolean A2R;
    public final boolean A2S;
    public final boolean A2T;
    public final boolean A2U;
    public final boolean A2V;
    public final boolean A2W;
    public final boolean A2X;
    public final boolean A2Y;
    public final boolean A2Z;
    public final boolean A2a;
    public final boolean A2b;
    public final boolean A2c;
    public final boolean A2d;
    public final boolean A2e;
    public final boolean A2f;
    public final boolean A2g;
    public final boolean A2h;
    public final boolean A2i;
    public final boolean A2j;
    public final boolean A2k;
    public final boolean A2l;
    public final boolean A2m;
    public final boolean A2n;
    public final boolean A2o;
    public final boolean A2p;

    public ThreadSummary(C1zm c1zm) {
        this.A1V = c1zm.A1V;
        this.A04 = c1zm.A04;
        this.A1n = c1zm.A1n;
        this.A18 = c1zm.A18;
        this.A1o = c1zm.A1o;
        this.A1p = c1zm.A1p;
        this.A1q = c1zm.A1q;
        this.A0o = c1zm.A0o;
        this.A1F = c1zm.A1F;
        this.A1B = c1zm.A1B;
        this.A05 = c1zm.A05;
        this.A2G = c1zm.A2G;
        this.A0Q = c1zm.A0Q;
        ImmutableList immutableList = c1zm.A1G;
        C1pq.A08("botParticipants", immutableList);
        this.A1G = immutableList;
        this.A0u = c1zm.A0u;
        this.A2H = c1zm.A2H;
        this.A0X = c1zm.A0X;
        this.A1C = c1zm.A1C;
        this.A1W = c1zm.A1W;
        ImmutableSet immutableSet = c1zm.A1T;
        C1pq.A08("communityChatFlags", immutableSet);
        this.A1T = immutableSet;
        this.A1H = c1zm.A1H;
        this.A06 = c1zm.A06;
        this.A1r = c1zm.A1r;
        this.A0R = c1zm.A0R;
        this.A07 = c1zm.A07;
        this.A1E = c1zm.A1E;
        this.A1e = c1zm.A1e;
        this.A1s = c1zm.A1s;
        this.A0j = c1zm.A0j;
        this.A1f = c1zm.A1f;
        this.A1g = c1zm.A1g;
        this.A2I = c1zm.A2I;
        this.A2J = c1zm.A2J;
        this.A1t = c1zm.A1t;
        this.A0h = c1zm.A0h;
        this.A1X = c1zm.A1X;
        this.A0d = c1zm.A0d;
        this.A0g = c1zm.A0g;
        this.A2K = c1zm.A2K;
        this.A0e = c1zm.A0e;
        this.A00 = c1zm.A00;
        this.A1Y = c1zm.A1Y;
        this.A0p = c1zm.A0p;
        this.A0Y = c1zm.A0Y;
        this.A0Z = c1zm.A0Z;
        this.A2L = c1zm.A2L;
        this.A2M = c1zm.A2M;
        this.A2N = c1zm.A2N;
        this.A2O = c1zm.A2O;
        this.A2P = c1zm.A2P;
        this.A2Q = c1zm.A2Q;
        this.A2R = c1zm.A2R;
        this.A2S = c1zm.A2S;
        this.A2T = c1zm.A2T;
        this.A2U = c1zm.A2U;
        this.A2V = c1zm.A2V;
        this.A2W = c1zm.A2W;
        this.A2X = c1zm.A2X;
        this.A2Y = c1zm.A2Y;
        this.A2Z = c1zm.A2Z;
        this.A2a = c1zm.A2a;
        this.A2b = c1zm.A2b;
        this.A2c = c1zm.A2c;
        this.A2d = c1zm.A2d;
        this.A2e = c1zm.A2e;
        this.A2f = c1zm.A2f;
        this.A2g = c1zm.A2g;
        this.A2h = c1zm.A2h;
        this.A01 = c1zm.A01;
        this.A2i = c1zm.A2i;
        this.A2j = c1zm.A2j;
        this.A0W = c1zm.A0W;
        this.A1Z = c1zm.A1Z;
        this.A1U = c1zm.A1U;
        this.A2k = c1zm.A2k;
        this.A2l = c1zm.A2l;
        this.A2m = c1zm.A2m;
        this.A2n = c1zm.A2n;
        this.A2o = c1zm.A2o;
        this.A08 = c1zm.A08;
        this.A0S = c1zm.A0S;
        this.A1h = c1zm.A1h;
        this.A09 = c1zm.A09;
        this.A1u = c1zm.A1u;
        this.A0a = c1zm.A0a;
        this.A1v = c1zm.A1v;
        this.A1w = c1zm.A1w;
        this.A1x = c1zm.A1x;
        this.A1y = c1zm.A1y;
        this.A1I = c1zm.A1I;
        this.A0A = c1zm.A0A;
        this.A1J = c1zm.A1J;
        this.A0B = c1zm.A0B;
        this.A0C = c1zm.A0C;
        this.A0D = c1zm.A0D;
        this.A0b = c1zm.A0b;
        this.A0q = c1zm.A0q;
        this.A1a = c1zm.A1a;
        String str = c1zm.A1z;
        C1pq.A08("loggedInUserId", str);
        this.A1z = str;
        ImmutableMap immutableMap = c1zm.A1R;
        C1pq.A08("magicWords", immutableMap);
        this.A1R = immutableMap;
        this.A0r = c1zm.A0r;
        this.A13 = c1zm.A13;
        this.A0E = c1zm.A0E;
        this.A0f = c1zm.A0f;
        this.A1D = c1zm.A1D;
        this.A17 = c1zm.A17;
        this.A19 = c1zm.A19;
        this.A0k = c1zm.A0k;
        this.A0s = c1zm.A0s;
        this.A20 = c1zm.A20;
        this.A0t = c1zm.A0t;
        this.A1i = c1zm.A1i;
        this.A1b = c1zm.A1b;
        this.A0v = c1zm.A0v;
        this.A1j = c1zm.A1j;
        this.A1K = c1zm.A1K;
        this.A0w = c1zm.A0w;
        this.A0F = c1zm.A0F;
        this.A21 = c1zm.A21;
        this.A0G = c1zm.A0G;
        this.A0l = c1zm.A0l;
        this.A22 = c1zm.A22;
        this.A0T = c1zm.A0T;
        ImmutableList immutableList2 = c1zm.A1L;
        C1pq.A08("participants", immutableList2);
        this.A1L = immutableList2;
        this.A1M = c1zm.A1M;
        this.A0U = c1zm.A0U;
        this.A23 = c1zm.A23;
        this.A0V = c1zm.A0V;
        this.A24 = c1zm.A24;
        this.A25 = c1zm.A25;
        this.A26 = c1zm.A26;
        this.A0H = c1zm.A0H;
        this.A0x = c1zm.A0x;
        this.A27 = c1zm.A27;
        this.A0I = c1zm.A0I;
        this.A1N = c1zm.A1N;
        this.A1O = c1zm.A1O;
        this.A1P = c1zm.A1P;
        this.A1k = c1zm.A1k;
        this.A0y = c1zm.A0y;
        this.A0J = c1zm.A0J;
        this.A0z = c1zm.A0z;
        this.A0K = c1zm.A0K;
        this.A1c = c1zm.A1c;
        this.A1l = c1zm.A1l;
        this.A28 = c1zm.A28;
        this.A29 = c1zm.A29;
        this.A0m = c1zm.A0m;
        ImmutableList immutableList3 = c1zm.A1Q;
        C1pq.A08("senders", immutableList3);
        this.A1Q = immutableList3;
        this.A0L = c1zm.A0L;
        this.A2p = c1zm.A2p;
        this.A1m = c1zm.A1m;
        this.A2A = c1zm.A2A;
        this.A0i = c1zm.A0i;
        this.A1d = c1zm.A1d;
        this.A10 = c1zm.A10;
        this.A11 = c1zm.A11;
        this.A12 = c1zm.A12;
        this.A0c = c1zm.A0c;
        ThreadKey threadKey = c1zm.A0n;
        C1pq.A08("threadKey", threadKey);
        this.A0n = threadKey;
        this.A2B = c1zm.A2B;
        this.A0M = c1zm.A0M;
        this.A15 = c1zm.A15;
        this.A16 = c1zm.A16;
        this.A1A = c1zm.A1A;
        ImmutableMap immutableMap2 = c1zm.A1S;
        C1pq.A08("threadThemePayloadMap", immutableMap2);
        this.A1S = immutableMap2;
        this.A2C = c1zm.A2C;
        this.A0N = c1zm.A0N;
        this.A02 = c1zm.A02;
        this.A03 = c1zm.A03;
        this.A0O = c1zm.A0O;
        this.A2D = c1zm.A2D;
        this.A14 = c1zm.A14;
        this.A0P = c1zm.A0P;
        this.A2E = c1zm.A2E;
        this.A2F = Collections.unmodifiableSet(c1zm.A2F);
        ThreadKey threadKey2 = this.A0n;
        if (threadKey2 == null) {
            throw AnonymousClass001.A0N("ThreadKey is not set for ThreadSummary");
        }
        if (this.A0g == null) {
            throw AnonymousClass001.A0N("Folder is not set for ThreadSummary");
        }
        if (ThreadKey.A0f(threadKey2) || ThreadKey.A0h(threadKey2) || ThreadKey.A0a(threadKey2) || ThreadKey.A0c(threadKey2) || ThreadKey.A0T(threadKey2)) {
            return;
        }
        JoinableInfo joinableInfo = AoK().A06;
        if (!(!joinableInfo.A06)) {
            throw AnonymousClass001.A0N("Check failed.");
        }
        if (!(!joinableInfo.A02.A02)) {
            throw AnonymousClass001.A0N("Check failed.");
        }
        if (BWg() == TriState.YES) {
            throw AnonymousClass001.A0N("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadSummary(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A1V = null;
        } else {
            this.A1V = Integer.valueOf(parcel.readInt());
        }
        this.A04 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1n = null;
        } else {
            this.A1n = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A18 = null;
        } else {
            this.A18 = (AdContextData) AdContextData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1o = null;
        } else {
            this.A1o = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1p = null;
        } else {
            this.A1p = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1q = null;
        } else {
            this.A1q = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0o = null;
        } else {
            this.A0o = (AdsConversionsQPData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1F = null;
        } else {
            int readInt = parcel.readInt();
            Uri[] uriArr = new Uri[readInt];
            for (int i = 0; i < readInt; i++) {
                uriArr[i] = parcel.readParcelable(classLoader);
            }
            this.A1F = ImmutableList.copyOf(uriArr);
        }
        if (parcel.readInt() == 0) {
            this.A1B = null;
        } else {
            this.A1B = (AnimatedThreadActivityBannerDataModel) AnimatedThreadActivityBannerDataModel.CREATOR.createFromParcel(parcel);
        }
        this.A05 = parcel.readLong();
        boolean z = true;
        this.A2G = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0Q = null;
        } else {
            this.A0Q = (Uri) parcel.readParcelable(classLoader);
        }
        int readInt2 = parcel.readInt();
        ThreadParticipant[] threadParticipantArr = new ThreadParticipant[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            threadParticipantArr[i2] = parcel.readParcelable(classLoader);
        }
        this.A1G = ImmutableList.copyOf(threadParticipantArr);
        if (parcel.readInt() == 0) {
            this.A0u = null;
        } else {
            this.A0u = (NotificationSetting) NotificationSetting.CREATOR.createFromParcel(parcel);
        }
        this.A2H = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0X = null;
        } else {
            this.A0X = GraphQLMessageThreadCannotReplyReason.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1C = null;
        } else {
            this.A1C = (Capabilities) Capabilities.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1W = null;
        } else {
            this.A1W = 0S2.A00(2)[parcel.readInt()];
        }
        int readInt3 = parcel.readInt();
        EnumC00893pQ[] enumC00893pQArr = new EnumC00893pQ[readInt3];
        for (int i3 = 0; i3 < readInt3; i3++) {
            enumC00893pQArr[i3] = EnumC00893pQ.values()[parcel.readInt()];
        }
        this.A1T = ImmutableSet.A08(enumC00893pQArr);
        if (parcel.readInt() == 0) {
            this.A1H = null;
        } else {
            int readInt4 = parcel.readInt();
            Uri[] uriArr2 = new Uri[readInt4];
            for (int i4 = 0; i4 < readInt4; i4++) {
                uriArr2[i4] = parcel.readParcelable(classLoader);
            }
            this.A1H = ImmutableList.copyOf(uriArr2);
        }
        this.A06 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1r = null;
        } else {
            this.A1r = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0R = null;
        } else {
            this.A0R = (Uri) parcel.readParcelable(classLoader);
        }
        this.A07 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1E = null;
        } else {
            this.A1E = (CompositeThreadThemeInfo) CompositeThreadThemeInfo.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1e = null;
        } else {
            this.A1e = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A1s = null;
        } else {
            this.A1s = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0j = null;
        } else {
            this.A0j = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1f = null;
        } else {
            this.A1f = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A1g = null;
        } else {
            this.A1g = Long.valueOf(parcel.readLong());
        }
        this.A2I = parcel.readInt() == 1;
        this.A2J = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A1t = null;
        } else {
            this.A1t = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0h = null;
        } else {
            this.A0h = (MessageDraft) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1X = null;
        } else {
            this.A1X = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A0d = null;
        } else {
            this.A0d = (EventData) EventData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0g = null;
        } else {
            this.A0g = 1F9.values()[parcel.readInt()];
        }
        this.A2K = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0e = null;
        } else {
            this.A0e = (GamesPushNotificationSettings) GamesPushNotificationSettings.CREATOR.createFromParcel(parcel);
        }
        this.A00 = parcel.readFloat();
        if (parcel.readInt() == 0) {
            this.A1Y = null;
        } else {
            this.A1Y = 0S2.A00(3)[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0p = null;
        } else {
            this.A0p = (GroupThreadData) GroupThreadData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0Y = null;
        } else {
            this.A0Y = GraphQLMessengerGroupThreadSubType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A0Z = null;
        } else {
            this.A0Z = GraphQLMessengerGroupThreadWarningType.values()[parcel.readInt()];
        }
        this.A2L = parcel.readInt() == 1;
        this.A2M = parcel.readInt() == 1;
        this.A2N = parcel.readInt() == 1;
        this.A2O = parcel.readInt() == 1;
        this.A2P = parcel.readInt() == 1;
        this.A2Q = parcel.readInt() == 1;
        this.A2R = parcel.readInt() == 1;
        this.A2S = parcel.readInt() == 1;
        this.A2T = parcel.readInt() == 1;
        this.A2U = parcel.readInt() == 1;
        this.A2V = parcel.readInt() == 1;
        this.A2W = parcel.readInt() == 1;
        this.A2X = parcel.readInt() == 1;
        this.A2Y = parcel.readInt() == 1;
        this.A2Z = parcel.readInt() == 1;
        this.A2a = parcel.readInt() == 1;
        this.A2b = parcel.readInt() == 1;
        this.A2c = parcel.readInt() == 1;
        this.A2d = parcel.readInt() == 1;
        this.A2e = parcel.readInt() == 1;
        this.A2f = parcel.readInt() == 1;
        this.A2g = parcel.readInt() == 1;
        this.A2h = parcel.readInt() == 1;
        this.A01 = parcel.readInt();
        this.A2i = parcel.readInt() == 1;
        this.A2j = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A0W = null;
        } else {
            this.A0W = TriState.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A1Z = null;
        } else {
            this.A1Z = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A1U = null;
        } else {
            this.A1U = Boolean.valueOf(parcel.readInt() == 1);
        }
        this.A2k = parcel.readInt() == 1;
        this.A2l = parcel.readInt() == 1;
        this.A2m = parcel.readInt() == 1;
        this.A2n = parcel.readInt() == 1;
        this.A2o = parcel.readInt() == 1;
        this.A08 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0S = null;
        } else {
            this.A0S = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1h = null;
        } else {
            this.A1h = Long.valueOf(parcel.readLong());
        }
        this.A09 = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1u = null;
        } else {
            this.A1u = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0a = null;
        } else {
            this.A0a = (CallToAction) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1v = null;
        } else {
            this.A1v = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1w = null;
        } else {
            this.A1w = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1x = null;
        } else {
            this.A1x = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1y = null;
        } else {
            this.A1y = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A1I = null;
        } else {
            int readInt5 = parcel.readInt();
            String[] strArr = new String[readInt5];
            for (int i5 = 0; i5 < readInt5; i5++) {
                strArr[i5] = parcel.readString();
            }
            this.A1I = ImmutableList.copyOf(strArr);
        }
        this.A0A = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1J = null;
        } else {
            int readInt6 = parcel.readInt();
            Long[] lArr = new Long[readInt6];
            for (int i6 = 0; i6 < readInt6; i6++) {
                lArr[i6] = Long.valueOf(parcel.readLong());
            }
            this.A1J = ImmutableList.copyOf(lArr);
        }
        this.A0B = parcel.readLong();
        this.A0C = parcel.readLong();
        this.A0D = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0b = null;
        } else {
            this.A0b = (CallToAction) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0q = null;
        } else {
            this.A0q = (LearningSpaceThreadData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1a = null;
        } else {
            this.A1a = Integer.valueOf(parcel.readInt());
        }
        this.A1z = parcel.readString();
        HashMap hashMap = new HashMap();
        int readInt7 = parcel.readInt();
        for (int i7 = 0; i7 < readInt7; i7++) {
            hashMap.put(parcel.readString(), MagicWord.CREATOR.createFromParcel(parcel));
        }
        this.A1R = ImmutableMap.copyOf((Map) hashMap);
        if (parcel.readInt() == 0) {
            this.A0r = null;
        } else {
            this.A0r = (MarketplaceThreadData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A13 = null;
        } else {
            this.A13 = (ThreadMediaPreview) ThreadMediaPreview.CREATOR.createFromParcel(parcel);
        }
        this.A0E = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0f = null;
        } else {
            this.A0f = (MessageSuggestedReply) MessageSuggestedReply.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1D = null;
        } else {
            this.A1D = (HeterogeneousMap) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A17 = null;
        } else {
            this.A17 = C20a.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A19 = null;
        } else {
            this.A19 = (MontageBucketPreview) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A0k = null;
        } else {
            this.A0k = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0s = null;
        } else {
            this.A0s = (MontageThreadPreview) MontageThreadPreview.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A20 = null;
        } else {
            this.A20 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0t = null;
        } else {
            this.A0t = (NewFriendBumpThreadData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1i = null;
        } else {
            this.A1i = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A1b = null;
        } else {
            this.A1b = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A0v = null;
        } else {
            this.A0v = (NotificationSetting) NotificationSetting.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A1j = null;
        } else {
            this.A1j = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A1K = null;
        } else {
            int readInt8 = parcel.readInt();
            Uri[] uriArr3 = new Uri[readInt8];
            for (int i8 = 0; i8 < readInt8; i8++) {
                uriArr3[i8] = parcel.readParcelable(classLoader);
            }
            this.A1K = ImmutableList.copyOf(uriArr3);
        }
        if (parcel.readInt() == 0) {
            this.A0w = null;
        } else {
            this.A0w = AnonymousClass214.values()[parcel.readInt()];
        }
        this.A0F = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A21 = null;
        } else {
            this.A21 = parcel.readString();
        }
        this.A0G = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0l = null;
        } else {
            this.A0l = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A22 = null;
        } else {
            this.A22 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0T = null;
        } else {
            this.A0T = (Uri) parcel.readParcelable(classLoader);
        }
        int readInt9 = parcel.readInt();
        ThreadParticipant[] threadParticipantArr2 = new ThreadParticipant[readInt9];
        for (int i9 = 0; i9 < readInt9; i9++) {
            threadParticipantArr2[i9] = parcel.readParcelable(classLoader);
        }
        this.A1L = ImmutableList.copyOf(threadParticipantArr2);
        if (parcel.readInt() == 0) {
            this.A1M = null;
        } else {
            int readInt10 = parcel.readInt();
            1Ks[] r0 = new 1Ks[readInt10];
            for (int i10 = 0; i10 < readInt10; i10++) {
                r0[i10] = 1Ks.values()[parcel.readInt()];
            }
            this.A1M = ImmutableList.copyOf(r0);
        }
        if (parcel.readInt() == 0) {
            this.A0U = null;
        } else {
            this.A0U = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A23 = null;
        } else {
            this.A23 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0V = null;
        } else {
            this.A0V = (Uri) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A24 = null;
        } else {
            this.A24 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A25 = null;
        } else {
            this.A25 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A26 = null;
        } else {
            this.A26 = parcel.readString();
        }
        this.A0H = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0x = null;
        } else {
            this.A0x = (ProfessionalMetadata) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A27 = null;
        } else {
            this.A27 = parcel.readString();
        }
        this.A0I = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1N = null;
        } else {
            int readInt11 = parcel.readInt();
            String[] strArr2 = new String[readInt11];
            for (int i11 = 0; i11 < readInt11; i11++) {
                strArr2[i11] = parcel.readString();
            }
            this.A1N = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A1O = null;
        } else {
            int readInt12 = parcel.readInt();
            String[] strArr3 = new String[readInt12];
            for (int i12 = 0; i12 < readInt12; i12++) {
                strArr3[i12] = parcel.readString();
            }
            this.A1O = ImmutableList.copyOf(strArr3);
        }
        if (parcel.readInt() == 0) {
            this.A1P = null;
        } else {
            int readInt13 = parcel.readInt();
            String[] strArr4 = new String[readInt13];
            for (int i13 = 0; i13 < readInt13; i13++) {
                strArr4[i13] = parcel.readString();
            }
            this.A1P = ImmutableList.copyOf(strArr4);
        }
        if (parcel.readInt() == 0) {
            this.A1k = null;
        } else {
            this.A1k = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A0y = null;
        } else {
            this.A0y = (RelatedPageThreadData) parcel.readParcelable(classLoader);
        }
        this.A0J = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A0z = null;
        } else {
            this.A0z = (RequestAppointmentData) parcel.readParcelable(classLoader);
        }
        this.A0K = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A1c = null;
        } else {
            this.A1c = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A1l = null;
        } else {
            this.A1l = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A28 = null;
        } else {
            this.A28 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A29 = null;
        } else {
            this.A29 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0m = null;
        } else {
            this.A0m = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        int readInt14 = parcel.readInt();
        ParticipantInfo[] participantInfoArr = new ParticipantInfo[readInt14];
        for (int i14 = 0; i14 < readInt14; i14++) {
            participantInfoArr[i14] = parcel.readParcelable(classLoader);
        }
        this.A1Q = ImmutableList.copyOf(participantInfoArr);
        this.A0L = parcel.readLong();
        this.A2p = parcel.readInt() != 1 ? false : z;
        if (parcel.readInt() == 0) {
            this.A1m = null;
        } else {
            this.A1m = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.A2A = null;
        } else {
            this.A2A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0i = null;
        } else {
            this.A0i = (ParticipantInfo) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1d = null;
        } else {
            this.A1d = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            this.A10 = null;
        } else {
            this.A10 = (ThreadBookingRequests) ThreadBookingRequests.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A11 = null;
        } else {
            this.A11 = (ThreadConnectivityData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A12 = null;
        } else {
            this.A12 = (ThreadCustomization) ThreadCustomization.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0c = null;
        } else {
            this.A0c = ThreadFullnessState.values()[parcel.readInt()];
        }
        this.A0n = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 0) {
            this.A2B = null;
        } else {
            this.A2B = parcel.readString();
        }
        this.A0M = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A15 = null;
        } else {
            this.A15 = (ThreadRtcCallInfoData) ThreadRtcCallInfoData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A16 = null;
        } else {
            this.A16 = (ThreadRtcRoomInfoData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A1A = null;
        } else {
            this.A1A = C1zu.values()[parcel.readInt()];
        }
        HashMap hashMap2 = new HashMap();
        int readInt15 = parcel.readInt();
        for (int i15 = 0; i15 < readInt15; i15++) {
            hashMap2.put(parcel.readString(), ThreadThemePayload.CREATOR.createFromParcel(parcel));
        }
        this.A1S = ImmutableMap.copyOf((Map) hashMap2);
        if (parcel.readInt() == 0) {
            this.A2C = null;
        } else {
            this.A2C = parcel.readString();
        }
        this.A0N = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0O = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.A2D = null;
        } else {
            this.A2D = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A14 = null;
        } else {
            this.A14 = AnonymousClass219.values()[parcel.readInt()];
        }
        this.A0P = parcel.readLong();
        this.A2E = parcel.readInt() != 0 ? parcel.readString() : str;
        HashSet hashSet = new HashSet();
        int readInt16 = parcel.readInt();
        for (int i16 = 0; i16 < readInt16; i16++) {
            hashSet.add(parcel.readString());
        }
        this.A2F = Collections.unmodifiableSet(hashSet);
    }

    @Override // X.C20o
    public NotificationSetting Aap() {
        if (this.A2F.contains("callNotificationSetting")) {
            return this.A0u;
        }
        if (A2v == null) {
            synchronized (this) {
                if (A2v == null) {
                    A2v = NotificationSetting.A06;
                }
            }
        }
        return A2v;
    }

    @Override // X.C20o
    public GraphQLMessageThreadCannotReplyReason AbY() {
        if (this.A2F.contains("cannotReplyReason")) {
            return this.A0X;
        }
        if (A2r == null) {
            synchronized (this) {
                if (A2r == null) {
                    A2r = GraphQLMessageThreadCannotReplyReason.A0A;
                }
            }
        }
        return A2r;
    }

    @Override // X.C20o
    public CompositeThreadThemeInfo AdX() {
        if (this.A2F.contains("compositeThreadThemeInfo")) {
            return this.A1E;
        }
        if (A35 == null) {
            synchronized (this) {
                if (A35 == null) {
                    A35 = C20r.A00;
                }
            }
        }
        return A35;
    }

    @Override // X.C20o
    public GroupThreadData AoK() {
        if (this.A2F.contains("groupThreadData")) {
            return this.A0p;
        }
        if (A2u == null) {
            synchronized (this) {
                if (A2u == null) {
                    A2u = new GroupThreadData(new 21A());
                }
            }
        }
        return A2u;
    }

    @Override // X.C20o
    public GraphQLMessengerGroupThreadWarningType AoL() {
        if (this.A2F.contains("groupThreadWarningType")) {
            return this.A0Z;
        }
        if (A2s == null) {
            synchronized (this) {
                if (A2s == null) {
                    A2s = GraphQLMessengerGroupThreadWarningType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                }
            }
        }
        return A2s;
    }

    @Override // X.C20o
    public String At6() {
        if (this.A2F.contains("lastMessageAdminTextType")) {
            return this.A1u;
        }
        if (A38 == null) {
            synchronized (this) {
                if (A38 == null) {
                    A38 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A38;
    }

    @Override // X.C20o
    public String At7() {
        if (this.A2F.contains("lastMessageBreadcrumbType")) {
            return this.A1v;
        }
        if (A39 == null) {
            synchronized (this) {
                if (A39 == null) {
                    A39 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A39;
    }

    @Override // X.C20o
    public ImmutableList At8() {
        if (this.A2F.contains("lastMissedCallParticipantIDs")) {
            return this.A1J;
        }
        if (A36 == null) {
            synchronized (this) {
                if (A36 == null) {
                    ImmutableList of = ImmutableList.of();
                    11T.A0A(of);
                    A36 = of;
                }
            }
        }
        return A36;
    }

    @Override // X.C20o
    public HeterogeneousMap AxS() {
        if (this.A2F.contains("metadata")) {
            return this.A1D;
        }
        if (A34 == null) {
            synchronized (this) {
                if (A34 == null) {
                    HeterogeneousMap heterogeneousMap = HeterogeneousMap.A02;
                    11T.A0I(heterogeneousMap, "null cannot be cast to non-null type com.facebook.xapp.messaging.map.HeterogeneousMap<T of com.facebook.xapp.messaging.map.HeterogeneousMap.Companion.empty>");
                    A34 = heterogeneousMap;
                }
            }
        }
        return A34;
    }

    @Override // X.C20o
    public C20a Axu() {
        if (this.A2F.contains("missedCallStatus")) {
            return this.A17;
        }
        if (A32 == null) {
            synchronized (this) {
                if (A32 == null) {
                    A32 = C20a.A03;
                }
            }
        }
        return A32;
    }

    @Override // X.C20o
    public int AzY() {
        Integer num;
        if (this.A2F.contains("notificationGroupSetting")) {
            num = this.A1b;
        } else {
            if (A37 == null) {
                synchronized (this) {
                    if (A37 == null) {
                        A37 = 0;
                    }
                }
            }
            num = A37;
        }
        return num.intValue();
    }

    @Override // X.C20o
    public NotificationSetting AzZ() {
        if (this.A2F.contains("notificationSetting")) {
            return this.A0v;
        }
        if (A2w == null) {
            synchronized (this) {
                if (A2w == null) {
                    A2w = NotificationSetting.A06;
                }
            }
        }
        return A2w;
    }

    @Override // X.C20o
    public AnonymousClass214 B0N() {
        if (this.A2F.contains("optimisticGroupState")) {
            return this.A0w;
        }
        if (A2x == null) {
            synchronized (this) {
                if (A2x == null) {
                    A2x = AnonymousClass214.A04;
                }
            }
        }
        return A2x;
    }

    @Override // X.C20o
    public String B3q() {
        if (this.A2F.contains("policyViolationContentVisibility")) {
            return this.A26;
        }
        if (A3A == null) {
            synchronized (this) {
                if (A3A == null) {
                    A3A = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A3A;
    }

    @Override // X.C20o
    public ThreadCustomization BF2() {
        if (this.A2F.contains("threadCustomization")) {
            return this.A12;
        }
        if (A2y == null) {
            synchronized (this) {
                if (A2y == null) {
                    A2y = ThreadCustomization.A03;
                }
            }
        }
        return A2y;
    }

    @Override // X.C20o
    public ThreadFullnessState BF4() {
        if (this.A2F.contains("threadFullnessState")) {
            return this.A0c;
        }
        if (A2t == null) {
            synchronized (this) {
                if (A2t == null) {
                    A2t = ThreadFullnessState.A04;
                }
            }
        }
        return A2t;
    }

    @Override // X.C20o
    public ThreadRtcCallInfoData BFG() {
        if (this.A2F.contains("threadRtcCallInfoData")) {
            return this.A15;
        }
        if (A30 == null) {
            synchronized (this) {
                if (A30 == null) {
                    A30 = ThreadRtcCallInfoData.A05;
                }
            }
        }
        return A30;
    }

    @Override // X.C20o
    public ThreadRtcRoomInfoData BFH() {
        if (this.A2F.contains("threadRtcRoomInfoData")) {
            return this.A16;
        }
        if (A31 == null) {
            synchronized (this) {
                if (A31 == null) {
                    A31 = AnonymousClass217.A00;
                }
            }
        }
        return A31;
    }

    @Override // X.C20o
    public C1zu BFJ() {
        if (this.A2F.contains("threadStatus")) {
            return this.A1A;
        }
        if (A33 == null) {
            synchronized (this) {
                if (A33 == null) {
                    A33 = C1zu.A03;
                }
            }
        }
        return A33;
    }

    @Override // X.C20o
    public AnonymousClass219 BIz() {
        if (this.A2F.contains("vanishModeSelectedMode")) {
            return this.A14;
        }
        if (A2z == null) {
            synchronized (this) {
                if (A2z == null) {
                    A2z = AnonymousClass219.A02;
                }
            }
        }
        return A2z;
    }

    @Override // X.C20o
    public TriState BWg() {
        if (this.A2F.contains("isThreadQueueEnabled")) {
            return this.A0W;
        }
        if (A2q == null) {
            synchronized (this) {
                if (A2q == null) {
                    A2q = TriState.UNSET;
                }
            }
        }
        return A2q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadSummary)) {
                return false;
            }
            ThreadSummary threadSummary = (ThreadSummary) obj;
            if (!11T.A0O(this.A1V, threadSummary.A1V) || this.A04 != threadSummary.A04 || !11T.A0O(this.A1n, threadSummary.A1n) || !11T.A0O(this.A18, threadSummary.A18) || !11T.A0O(this.A1o, threadSummary.A1o) || !11T.A0O(this.A1p, threadSummary.A1p) || !11T.A0O(this.A1q, threadSummary.A1q) || !11T.A0O(this.A0o, threadSummary.A0o) || !11T.A0O(this.A1F, threadSummary.A1F) || !11T.A0O(this.A1B, threadSummary.A1B) || this.A05 != threadSummary.A05 || this.A2G != threadSummary.A2G || !11T.A0O(this.A0Q, threadSummary.A0Q) || !11T.A0O(this.A1G, threadSummary.A1G) || !11T.A0O(Aap(), threadSummary.Aap()) || this.A2H != threadSummary.A2H || AbY() != threadSummary.AbY() || !11T.A0O(this.A1C, threadSummary.A1C) || this.A1W != threadSummary.A1W || !11T.A0O(this.A1T, threadSummary.A1T) || !11T.A0O(this.A1H, threadSummary.A1H) || this.A06 != threadSummary.A06 || !11T.A0O(this.A1r, threadSummary.A1r) || !11T.A0O(this.A0R, threadSummary.A0R) || this.A07 != threadSummary.A07 || !11T.A0O(AdX(), threadSummary.AdX()) || !11T.A0O(this.A1e, threadSummary.A1e) || !11T.A0O(this.A1s, threadSummary.A1s) || !11T.A0O(this.A0j, threadSummary.A0j) || !11T.A0O(this.A1f, threadSummary.A1f) || !11T.A0O(this.A1g, threadSummary.A1g) || this.A2I != threadSummary.A2I || this.A2J != threadSummary.A2J || !11T.A0O(this.A1t, threadSummary.A1t) || !11T.A0O(this.A0h, threadSummary.A0h) || !11T.A0O(this.A1X, threadSummary.A1X) || !11T.A0O(this.A0d, threadSummary.A0d) || this.A0g != threadSummary.A0g || this.A2K != threadSummary.A2K || !11T.A0O(this.A0e, threadSummary.A0e) || this.A00 != threadSummary.A00 || this.A1Y != threadSummary.A1Y || !11T.A0O(AoK(), threadSummary.AoK()) || this.A0Y != threadSummary.A0Y || AoL() != threadSummary.AoL() || this.A2L != threadSummary.A2L || this.A2M != threadSummary.A2M || this.A2N != threadSummary.A2N || this.A2O != threadSummary.A2O || this.A2P != threadSummary.A2P || this.A2Q != threadSummary.A2Q || this.A2R != threadSummary.A2R || this.A2S != threadSummary.A2S || this.A2T != threadSummary.A2T || this.A2U != threadSummary.A2U || this.A2V != threadSummary.A2V || this.A2W != threadSummary.A2W || this.A2X != threadSummary.A2X || this.A2Y != threadSummary.A2Y || this.A2Z != threadSummary.A2Z || this.A2a != threadSummary.A2a || this.A2b != threadSummary.A2b || this.A2c != threadSummary.A2c || this.A2d != threadSummary.A2d || this.A2e != threadSummary.A2e || this.A2f != threadSummary.A2f || this.A2g != threadSummary.A2g || this.A2h != threadSummary.A2h || this.A01 != threadSummary.A01 || this.A2i != threadSummary.A2i || this.A2j != threadSummary.A2j || BWg() != threadSummary.BWg() || !11T.A0O(this.A1Z, threadSummary.A1Z) || !11T.A0O(this.A1U, threadSummary.A1U) || this.A2k != threadSummary.A2k || this.A2l != threadSummary.A2l || this.A2m != threadSummary.A2m || this.A2n != threadSummary.A2n || this.A2o != threadSummary.A2o || this.A08 != threadSummary.A08 || !11T.A0O(this.A0S, threadSummary.A0S) || !11T.A0O(this.A1h, threadSummary.A1h) || this.A09 != threadSummary.A09 || !11T.A0O(At6(), threadSummary.At6()) || !11T.A0O(this.A0a, threadSummary.A0a) || !11T.A0O(At7(), threadSummary.At7()) || !11T.A0O(this.A1w, threadSummary.A1w) || !11T.A0O(this.A1x, threadSummary.A1x) || !11T.A0O(this.A1y, threadSummary.A1y) || !11T.A0O(this.A1I, threadSummary.A1I) || this.A0A != threadSummary.A0A || !11T.A0O(At8(), threadSummary.At8()) || this.A0B != threadSummary.A0B || this.A0C != threadSummary.A0C || this.A0D != threadSummary.A0D || !11T.A0O(this.A0b, threadSummary.A0b) || !11T.A0O(this.A0q, threadSummary.A0q) || !11T.A0O(this.A1a, threadSummary.A1a) || !11T.A0O(this.A1z, threadSummary.A1z) || !11T.A0O(this.A1R, threadSummary.A1R) || !11T.A0O(this.A0r, threadSummary.A0r) || !11T.A0O(this.A13, threadSummary.A13) || this.A0E != threadSummary.A0E || !11T.A0O(this.A0f, threadSummary.A0f) || !11T.A0O(AxS(), threadSummary.AxS()) || Axu() != threadSummary.Axu() || !11T.A0O(this.A19, threadSummary.A19) || !11T.A0O(this.A0k, threadSummary.A0k) || !11T.A0O(this.A0s, threadSummary.A0s) || !11T.A0O(this.A20, threadSummary.A20) || !11T.A0O(this.A0t, threadSummary.A0t) || !11T.A0O(this.A1i, threadSummary.A1i) || AzY() != threadSummary.AzY() || !11T.A0O(AzZ(), threadSummary.AzZ()) || !11T.A0O(this.A1j, threadSummary.A1j) || !11T.A0O(this.A1K, threadSummary.A1K) || B0N() != threadSummary.B0N() || this.A0F != threadSummary.A0F || !11T.A0O(this.A21, threadSummary.A21) || this.A0G != threadSummary.A0G || !11T.A0O(this.A0l, threadSummary.A0l) || !11T.A0O(this.A22, threadSummary.A22) || !11T.A0O(this.A0T, threadSummary.A0T) || !11T.A0O(this.A1L, threadSummary.A1L) || !11T.A0O(this.A1M, threadSummary.A1M) || !11T.A0O(this.A0U, threadSummary.A0U) || !11T.A0O(this.A23, threadSummary.A23) || !11T.A0O(this.A0V, threadSummary.A0V) || !11T.A0O(this.A24, threadSummary.A24) || !11T.A0O(this.A25, threadSummary.A25) || !11T.A0O(B3q(), threadSummary.B3q()) || this.A0H != threadSummary.A0H || !11T.A0O(this.A0x, threadSummary.A0x) || !11T.A0O(this.A27, threadSummary.A27) || this.A0I != threadSummary.A0I || !11T.A0O(this.A1N, threadSummary.A1N) || !11T.A0O(this.A1O, threadSummary.A1O) || !11T.A0O(this.A1P, threadSummary.A1P) || !11T.A0O(this.A1k, threadSummary.A1k) || !11T.A0O(this.A0y, threadSummary.A0y) || this.A0J != threadSummary.A0J || !11T.A0O(this.A0z, threadSummary.A0z) || this.A0K != threadSummary.A0K || !11T.A0O(this.A1c, threadSummary.A1c) || !11T.A0O(this.A1l, threadSummary.A1l) || !11T.A0O(this.A28, threadSummary.A28) || !11T.A0O(this.A29, threadSummary.A29) || !11T.A0O(this.A0m, threadSummary.A0m) || !11T.A0O(this.A1Q, threadSummary.A1Q) || this.A0L != threadSummary.A0L || this.A2p != threadSummary.A2p || !11T.A0O(this.A1m, threadSummary.A1m) || !11T.A0O(this.A2A, threadSummary.A2A) || !11T.A0O(this.A0i, threadSummary.A0i) || !11T.A0O(this.A1d, threadSummary.A1d) || !11T.A0O(this.A10, threadSummary.A10) || !11T.A0O(this.A11, threadSummary.A11) || !11T.A0O(BF2(), threadSummary.BF2()) || BF4() != threadSummary.BF4() || !11T.A0O(this.A0n, threadSummary.A0n) || !11T.A0O(this.A2B, threadSummary.A2B) || this.A0M != threadSummary.A0M || !11T.A0O(BFG(), threadSummary.BFG()) || !11T.A0O(BFH(), threadSummary.BFH()) || BFJ() != threadSummary.BFJ() || !11T.A0O(this.A1S, threadSummary.A1S) || !11T.A0O(this.A2C, threadSummary.A2C) || this.A0N != threadSummary.A0N || this.A02 != threadSummary.A02 || this.A03 != threadSummary.A03 || this.A0O != threadSummary.A0O || !11T.A0O(this.A2D, threadSummary.A2D) || BIz() != threadSummary.BIz() || this.A0P != threadSummary.A0P || !11T.A0O(this.A2E, threadSummary.A2E)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int ordinal;
        int intValue;
        int ordinal2;
        int intValue2;
        int ordinal3;
        int ordinal4;
        int ordinal5;
        int ordinal6;
        int ordinal7;
        int ordinal8;
        int ordinal9;
        int A02 = C1pq.A02(C1pq.A04(Aap(), C1pq.A04(this.A1G, C1pq.A04(this.A0Q, C1pq.A02(C1pq.A01(C1pq.A04(this.A1B, C1pq.A04(this.A1F, C1pq.A04(this.A0o, C1pq.A04(this.A1q, C1pq.A04(this.A1p, C1pq.A04(this.A1o, C1pq.A04(this.A18, C1pq.A04(this.A1n, C1pq.A01(C1pq.A04(this.A1V, 1), this.A04))))))))), this.A05), this.A2G)))), this.A2H);
        GraphQLMessageThreadCannotReplyReason AbY = AbY();
        int i = -1;
        if (AbY == null) {
            ordinal = -1;
            float f = 0.0f / 0.0f;
        } else {
            ordinal = AbY.ordinal();
        }
        int A04 = C1pq.A04(this.A1C, (A02 * 31) + ordinal);
        Integer num = this.A1W;
        if (num == null) {
            intValue = -1;
            float f2 = 0.0f / 0.0f;
        } else {
            intValue = num.intValue();
        }
        int A042 = C1pq.A04(this.A0d, C1pq.A04(this.A1X, C1pq.A04(this.A0h, C1pq.A04(this.A1t, C1pq.A02(C1pq.A02(C1pq.A04(this.A1g, C1pq.A04(this.A1f, C1pq.A04(this.A0j, C1pq.A04(this.A1s, C1pq.A04(this.A1e, C1pq.A04(AdX(), C1pq.A01(C1pq.A04(this.A0R, C1pq.A04(this.A1r, C1pq.A01(C1pq.A04(this.A1H, C1pq.A04(this.A1T, (A04 * 31) + intValue)), this.A06))), this.A07))))))), this.A2I), this.A2J)))));
        1F9 r0 = this.A0g;
        if (r0 == null) {
            ordinal2 = -1;
            float f3 = 0.0f / 0.0f;
        } else {
            ordinal2 = r0.ordinal();
        }
        int A043 = (C1pq.A04(this.A0e, C1pq.A02((A042 * 31) + ordinal2, this.A2K)) * 31) + Float.floatToIntBits(this.A00);
        Integer num2 = this.A1Y;
        if (num2 == null) {
            intValue2 = -1;
            float f4 = 0.0f / 0.0f;
        } else {
            intValue2 = num2.intValue();
        }
        int A044 = C1pq.A04(AoK(), (A043 * 31) + intValue2);
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = this.A0Y;
        if (graphQLMessengerGroupThreadSubType == null) {
            ordinal3 = -1;
            float f5 = 0.0f / 0.0f;
        } else {
            ordinal3 = graphQLMessengerGroupThreadSubType.ordinal();
        }
        int i2 = (A044 * 31) + ordinal3;
        GraphQLMessengerGroupThreadWarningType AoL = AoL();
        if (AoL == null) {
            ordinal4 = -1;
            float f6 = 0.0f / 0.0f;
        } else {
            ordinal4 = AoL.ordinal();
        }
        int A022 = C1pq.A02(C1pq.A02((C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((i2 * 31) + ordinal4, this.A2L), this.A2M), this.A2N), this.A2O), this.A2P), this.A2Q), this.A2R), this.A2S), this.A2T), this.A2U), this.A2V), this.A2W), this.A2X), this.A2Y), this.A2Z), this.A2a), this.A2b), this.A2c), this.A2d), this.A2e), this.A2f), this.A2g), this.A2h) * 31) + this.A01, this.A2i), this.A2j);
        TriState BWg = BWg();
        if (BWg == null) {
            ordinal5 = -1;
            float f7 = 0.0f / 0.0f;
        } else {
            ordinal5 = BWg.ordinal();
        }
        int A045 = C1pq.A04(AxS(), C1pq.A04(this.A0f, C1pq.A01(C1pq.A04(this.A13, C1pq.A04(this.A0r, C1pq.A04(this.A1R, C1pq.A04(this.A1z, C1pq.A04(this.A1a, C1pq.A04(this.A0q, C1pq.A04(this.A0b, C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A04(At8(), C1pq.A01(C1pq.A04(this.A1I, C1pq.A04(this.A1y, C1pq.A04(this.A1x, C1pq.A04(this.A1w, C1pq.A04(At7(), C1pq.A04(this.A0a, C1pq.A04(At6(), C1pq.A01(C1pq.A04(this.A1h, C1pq.A04(this.A0S, C1pq.A01(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A1U, C1pq.A04(this.A1Z, (A022 * 31) + ordinal5)), this.A2k), this.A2l), this.A2m), this.A2n), this.A2o), this.A08))), this.A09)))))))), this.A0A)), this.A0B), this.A0C), this.A0D)))))))), this.A0E)));
        C20a Axu = Axu();
        if (Axu == null) {
            ordinal6 = -1;
            float f8 = 0.0f / 0.0f;
        } else {
            ordinal6 = Axu.ordinal();
        }
        int A046 = C1pq.A04(this.A1K, C1pq.A04(this.A1j, C1pq.A04(AzZ(), (C1pq.A04(this.A1i, C1pq.A04(this.A0t, C1pq.A04(this.A20, C1pq.A04(this.A0s, C1pq.A04(this.A0k, C1pq.A04(this.A19, (A045 * 31) + ordinal6)))))) * 31) + AzY())));
        AnonymousClass214 B0N = B0N();
        if (B0N == null) {
            ordinal7 = -1;
            float f9 = 0.0f / 0.0f;
        } else {
            ordinal7 = B0N.ordinal();
        }
        int A047 = C1pq.A04(BF2(), C1pq.A04(this.A11, C1pq.A04(this.A10, C1pq.A04(this.A1d, C1pq.A04(this.A0i, C1pq.A04(this.A2A, C1pq.A04(this.A1m, C1pq.A02(C1pq.A01(C1pq.A04(this.A1Q, C1pq.A04(this.A0m, C1pq.A04(this.A29, C1pq.A04(this.A28, C1pq.A04(this.A1l, C1pq.A04(this.A1c, C1pq.A01(C1pq.A04(this.A0z, C1pq.A01(C1pq.A04(this.A0y, C1pq.A04(this.A1k, C1pq.A04(this.A1P, C1pq.A04(this.A1O, C1pq.A04(this.A1N, C1pq.A01(C1pq.A04(this.A27, C1pq.A04(this.A0x, C1pq.A01(C1pq.A04(B3q(), C1pq.A04(this.A25, C1pq.A04(this.A24, C1pq.A04(this.A0V, C1pq.A04(this.A23, C1pq.A04(this.A0U, C1pq.A04(this.A1M, C1pq.A04(this.A1L, C1pq.A04(this.A0T, C1pq.A04(this.A22, C1pq.A04(this.A0l, C1pq.A01(C1pq.A04(this.A21, C1pq.A01((A046 * 31) + ordinal7, this.A0F)), this.A0G)))))))))))), this.A0H))), this.A0I)))))), this.A0J)), this.A0K))))))), this.A0L), this.A2p))))))));
        ThreadFullnessState BF4 = BF4();
        if (BF4 == null) {
            ordinal8 = -1;
            float f10 = 0.0f / 0.0f;
        } else {
            ordinal8 = BF4.ordinal();
        }
        int A048 = C1pq.A04(BFH(), C1pq.A04(BFG(), C1pq.A01(C1pq.A04(this.A2B, C1pq.A04(this.A0n, (A047 * 31) + ordinal8)), this.A0M)));
        C1zu BFJ = BFJ();
        if (BFJ == null) {
            ordinal9 = -1;
            float f11 = 0.0f / 0.0f;
        } else {
            ordinal9 = BFJ.ordinal();
        }
        int A049 = C1pq.A04(this.A2D, C1pq.A01((((C1pq.A01(C1pq.A04(this.A2C, C1pq.A04(this.A1S, (A048 * 31) + ordinal9)), this.A0N) * 31) + this.A02) * 31) + this.A03, this.A0O));
        AnonymousClass219 BIz = BIz();
        if (BIz != null) {
            i = BIz.ordinal();
        }
        return C1pq.A04(this.A2E, C1pq.A01((A049 * 31) + i, this.A0P));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Integer num = this.A1V;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeLong(this.A04);
        String str = this.A1n;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        AdContextData adContextData = this.A18;
        if (adContextData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adContextData.writeToParcel(parcel, i);
        }
        String str2 = this.A1o;
        if (str2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str2);
        }
        String str3 = this.A1p;
        if (str3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str3);
        }
        String str4 = this.A1q;
        if (str4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str4);
        }
        AdsConversionsQPData adsConversionsQPData = this.A0o;
        if (adsConversionsQPData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(adsConversionsQPData, i);
        }
        ImmutableList immutableList = this.A1F;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList.size());
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Uri) it.next(), i);
            }
        }
        AnimatedThreadActivityBannerDataModel animatedThreadActivityBannerDataModel = this.A1B;
        if (animatedThreadActivityBannerDataModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            animatedThreadActivityBannerDataModel.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A2G ? 1 : 0);
        Uri uri = this.A0Q;
        if (uri == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri, i);
        }
        ImmutableList immutableList2 = this.A1G;
        parcel.writeInt(immutableList2.size());
        1Du it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((ThreadParticipant) it2.next(), i);
        }
        NotificationSetting notificationSetting = this.A0u;
        if (notificationSetting == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationSetting.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A2H ? 1 : 0);
        GraphQLMessageThreadCannotReplyReason graphQLMessageThreadCannotReplyReason = this.A0X;
        if (graphQLMessageThreadCannotReplyReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(graphQLMessageThreadCannotReplyReason.ordinal());
        }
        Capabilities capabilities = this.A1C;
        if (capabilities == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            capabilities.writeToParcel(parcel, i);
        }
        Integer num2 = this.A1W;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        ImmutableSet immutableSet = this.A1T;
        parcel.writeInt(immutableSet.size());
        1Du it3 = immutableSet.iterator();
        while (it3.hasNext()) {
            parcel.writeInt(((EnumC00893pQ) it3.next()).ordinal());
        }
        ImmutableList immutableList3 = this.A1H;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList3.size());
            1Du it4 = immutableList3.iterator();
            while (it4.hasNext()) {
                parcel.writeParcelable((Uri) it4.next(), i);
            }
        }
        parcel.writeLong(this.A06);
        String str5 = this.A1r;
        if (str5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str5);
        }
        Uri uri2 = this.A0R;
        if (uri2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri2, i);
        }
        parcel.writeLong(this.A07);
        CompositeThreadThemeInfo compositeThreadThemeInfo = this.A1E;
        if (compositeThreadThemeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compositeThreadThemeInfo.writeToParcel(parcel, i);
        }
        Long l = this.A1e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        String str6 = this.A1s;
        if (str6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str6);
        }
        ThreadKey threadKey = this.A0j;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        Long l2 = this.A1f;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.A1g;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeInt(this.A2I ? 1 : 0);
        parcel.writeInt(this.A2J ? 1 : 0);
        String str7 = this.A1t;
        if (str7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str7);
        }
        MessageDraft messageDraft = this.A0h;
        if (messageDraft == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(messageDraft, i);
        }
        Integer num3 = this.A1X;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        EventData eventData = this.A0d;
        if (eventData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventData.writeToParcel(parcel, i);
        }
        1F9 r0 = this.A0g;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(r0.ordinal());
        }
        parcel.writeInt(this.A2K ? 1 : 0);
        GamesPushNotificationSettings gamesPushNotificationSettings = this.A0e;
        if (gamesPushNotificationSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gamesPushNotificationSettings.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.A00);
        Integer num4 = this.A1Y;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        GroupThreadData groupThreadData = this.A0p;
        if (groupThreadData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupThreadData.writeToParcel(parcel, i);
        }
        GraphQLMessengerGroupThreadSubType graphQLMessengerGroupThreadSubType = this.A0Y;
        if (graphQLMessengerGroupThreadSubType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(graphQLMessengerGroupThreadSubType.ordinal());
        }
        GraphQLMessengerGroupThreadWarningType graphQLMessengerGroupThreadWarningType = this.A0Z;
        if (graphQLMessengerGroupThreadWarningType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(graphQLMessengerGroupThreadWarningType.ordinal());
        }
        parcel.writeInt(this.A2L ? 1 : 0);
        parcel.writeInt(this.A2M ? 1 : 0);
        parcel.writeInt(this.A2N ? 1 : 0);
        parcel.writeInt(this.A2O ? 1 : 0);
        parcel.writeInt(this.A2P ? 1 : 0);
        parcel.writeInt(this.A2Q ? 1 : 0);
        parcel.writeInt(this.A2R ? 1 : 0);
        parcel.writeInt(this.A2S ? 1 : 0);
        parcel.writeInt(this.A2T ? 1 : 0);
        parcel.writeInt(this.A2U ? 1 : 0);
        parcel.writeInt(this.A2V ? 1 : 0);
        parcel.writeInt(this.A2W ? 1 : 0);
        parcel.writeInt(this.A2X ? 1 : 0);
        parcel.writeInt(this.A2Y ? 1 : 0);
        parcel.writeInt(this.A2Z ? 1 : 0);
        parcel.writeInt(this.A2a ? 1 : 0);
        parcel.writeInt(this.A2b ? 1 : 0);
        parcel.writeInt(this.A2c ? 1 : 0);
        parcel.writeInt(this.A2d ? 1 : 0);
        parcel.writeInt(this.A2e ? 1 : 0);
        parcel.writeInt(this.A2f ? 1 : 0);
        parcel.writeInt(this.A2g ? 1 : 0);
        parcel.writeInt(this.A2h ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A2i ? 1 : 0);
        parcel.writeInt(this.A2j ? 1 : 0);
        TriState triState = this.A0W;
        if (triState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(triState.ordinal());
        }
        Integer num5 = this.A1Z;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Boolean bool = this.A1U;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A2k ? 1 : 0);
        parcel.writeInt(this.A2l ? 1 : 0);
        parcel.writeInt(this.A2m ? 1 : 0);
        parcel.writeInt(this.A2n ? 1 : 0);
        parcel.writeInt(this.A2o ? 1 : 0);
        parcel.writeLong(this.A08);
        Uri uri3 = this.A0S;
        if (uri3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri3, i);
        }
        Long l4 = this.A1h;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeLong(this.A09);
        String str8 = this.A1u;
        if (str8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str8);
        }
        CallToAction callToAction = this.A0a;
        if (callToAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(callToAction, i);
        }
        String str9 = this.A1v;
        if (str9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str9);
        }
        String str10 = this.A1w;
        if (str10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str10);
        }
        String str11 = this.A1x;
        if (str11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str11);
        }
        String str12 = this.A1y;
        if (str12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str12);
        }
        ImmutableList immutableList4 = this.A1I;
        if (immutableList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList4.size());
            1Du it5 = immutableList4.iterator();
            while (it5.hasNext()) {
                parcel.writeString((String) it5.next());
            }
        }
        parcel.writeLong(this.A0A);
        ImmutableList immutableList5 = this.A1J;
        if (immutableList5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList5.size());
            1Du it6 = immutableList5.iterator();
            while (it6.hasNext()) {
                parcel.writeLong(((Number) it6.next()).longValue());
            }
        }
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A0D);
        CallToAction callToAction2 = this.A0b;
        if (callToAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(callToAction2, i);
        }
        LearningSpaceThreadData learningSpaceThreadData = this.A0q;
        if (learningSpaceThreadData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(learningSpaceThreadData, i);
        }
        Integer num6 = this.A1a;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.A1z);
        ImmutableMap immutableMap = this.A1R;
        parcel.writeInt(immutableMap.size());
        1Du it7 = immutableMap.entrySet().iterator();
        while (it7.hasNext()) {
            Map.Entry entry = (Map.Entry) it7.next();
            parcel.writeString((String) entry.getKey());
            ((MagicWord) entry.getValue()).writeToParcel(parcel, i);
        }
        MarketplaceThreadData marketplaceThreadData = this.A0r;
        if (marketplaceThreadData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(marketplaceThreadData, i);
        }
        ThreadMediaPreview threadMediaPreview = this.A13;
        if (threadMediaPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadMediaPreview.writeToParcel(parcel, i);
        }
        parcel.writeLong(this.A0E);
        MessageSuggestedReply messageSuggestedReply = this.A0f;
        if (messageSuggestedReply == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messageSuggestedReply.writeToParcel(parcel, i);
        }
        HeterogeneousMap heterogeneousMap = this.A1D;
        if (heterogeneousMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(heterogeneousMap, i);
        }
        C20a c20a = this.A17;
        if (c20a == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(c20a.ordinal());
        }
        MontageBucketPreview montageBucketPreview = this.A19;
        if (montageBucketPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(montageBucketPreview, i);
        }
        ThreadKey threadKey2 = this.A0k;
        if (threadKey2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey2.writeToParcel(parcel, i);
        }
        MontageThreadPreview montageThreadPreview = this.A0s;
        if (montageThreadPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            montageThreadPreview.writeToParcel(parcel, i);
        }
        String str13 = this.A20;
        if (str13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str13);
        }
        NewFriendBumpThreadData newFriendBumpThreadData = this.A0t;
        if (newFriendBumpThreadData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(newFriendBumpThreadData, i);
        }
        Long l5 = this.A1i;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l5.longValue());
        }
        Integer num7 = this.A1b;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        NotificationSetting notificationSetting2 = this.A0v;
        if (notificationSetting2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationSetting2.writeToParcel(parcel, i);
        }
        Long l6 = this.A1j;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l6.longValue());
        }
        ImmutableList immutableList6 = this.A1K;
        if (immutableList6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList6.size());
            1Du it8 = immutableList6.iterator();
            while (it8.hasNext()) {
                parcel.writeParcelable((Uri) it8.next(), i);
            }
        }
        AnonymousClass214 anonymousClass214 = this.A0w;
        if (anonymousClass214 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(anonymousClass214.ordinal());
        }
        parcel.writeLong(this.A0F);
        String str14 = this.A21;
        if (str14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str14);
        }
        parcel.writeLong(this.A0G);
        ThreadKey threadKey3 = this.A0l;
        if (threadKey3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey3.writeToParcel(parcel, i);
        }
        String str15 = this.A22;
        if (str15 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str15);
        }
        Uri uri4 = this.A0T;
        if (uri4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri4, i);
        }
        ImmutableList immutableList7 = this.A1L;
        parcel.writeInt(immutableList7.size());
        1Du it9 = immutableList7.iterator();
        while (it9.hasNext()) {
            parcel.writeParcelable((ThreadParticipant) it9.next(), i);
        }
        ImmutableList immutableList8 = this.A1M;
        if (immutableList8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList8.size());
            1Du it10 = immutableList8.iterator();
            while (it10.hasNext()) {
                parcel.writeInt(((1Ks) it10.next()).ordinal());
            }
        }
        Uri uri5 = this.A0U;
        if (uri5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri5, i);
        }
        String str16 = this.A23;
        if (str16 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str16);
        }
        Uri uri6 = this.A0V;
        if (uri6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(uri6, i);
        }
        String str17 = this.A24;
        if (str17 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str17);
        }
        String str18 = this.A25;
        if (str18 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str18);
        }
        String str19 = this.A26;
        if (str19 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str19);
        }
        parcel.writeLong(this.A0H);
        ProfessionalMetadata professionalMetadata = this.A0x;
        if (professionalMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(professionalMetadata, i);
        }
        String str20 = this.A27;
        if (str20 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str20);
        }
        parcel.writeLong(this.A0I);
        ImmutableList immutableList9 = this.A1N;
        if (immutableList9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList9.size());
            1Du it11 = immutableList9.iterator();
            while (it11.hasNext()) {
                parcel.writeString((String) it11.next());
            }
        }
        ImmutableList immutableList10 = this.A1O;
        if (immutableList10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList10.size());
            1Du it12 = immutableList10.iterator();
            while (it12.hasNext()) {
                parcel.writeString((String) it12.next());
            }
        }
        ImmutableList immutableList11 = this.A1P;
        if (immutableList11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableList11.size());
            1Du it13 = immutableList11.iterator();
            while (it13.hasNext()) {
                parcel.writeString((String) it13.next());
            }
        }
        Long l7 = this.A1k;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l7.longValue());
        }
        RelatedPageThreadData relatedPageThreadData = this.A0y;
        if (relatedPageThreadData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(relatedPageThreadData, i);
        }
        parcel.writeLong(this.A0J);
        RequestAppointmentData requestAppointmentData = this.A0z;
        if (requestAppointmentData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(requestAppointmentData, i);
        }
        parcel.writeLong(this.A0K);
        Integer num8 = this.A1c;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Long l8 = this.A1l;
        if (l8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l8.longValue());
        }
        String str21 = this.A28;
        if (str21 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str21);
        }
        String str22 = this.A29;
        if (str22 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str22);
        }
        ThreadKey threadKey4 = this.A0m;
        if (threadKey4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey4.writeToParcel(parcel, i);
        }
        ImmutableList immutableList12 = this.A1Q;
        parcel.writeInt(immutableList12.size());
        1Du it14 = immutableList12.iterator();
        while (it14.hasNext()) {
            parcel.writeParcelable((ParticipantInfo) it14.next(), i);
        }
        parcel.writeLong(this.A0L);
        parcel.writeInt(this.A2p ? 1 : 0);
        Long l9 = this.A1m;
        if (l9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l9.longValue());
        }
        String str23 = this.A2A;
        if (str23 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str23);
        }
        ParticipantInfo participantInfo = this.A0i;
        if (participantInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(participantInfo, i);
        }
        Integer num9 = this.A1d;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        ThreadBookingRequests threadBookingRequests = this.A10;
        if (threadBookingRequests == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadBookingRequests.writeToParcel(parcel, i);
        }
        ThreadConnectivityData threadConnectivityData = this.A11;
        if (threadConnectivityData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(threadConnectivityData, i);
        }
        ThreadCustomization threadCustomization = this.A12;
        if (threadCustomization == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadCustomization.writeToParcel(parcel, i);
        }
        ThreadFullnessState threadFullnessState = this.A0c;
        if (threadFullnessState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(threadFullnessState.ordinal());
        }
        this.A0n.writeToParcel(parcel, i);
        String str24 = this.A2B;
        if (str24 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str24);
        }
        parcel.writeLong(this.A0M);
        ThreadRtcCallInfoData threadRtcCallInfoData = this.A15;
        if (threadRtcCallInfoData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadRtcCallInfoData.writeToParcel(parcel, i);
        }
        ThreadRtcRoomInfoData threadRtcRoomInfoData = this.A16;
        if (threadRtcRoomInfoData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(threadRtcRoomInfoData, i);
        }
        C1zu c1zu = this.A1A;
        if (c1zu == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(c1zu.ordinal());
        }
        ImmutableMap immutableMap2 = this.A1S;
        parcel.writeInt(immutableMap2.size());
        1Du it15 = immutableMap2.entrySet().iterator();
        while (it15.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it15.next();
            parcel.writeString((String) entry2.getKey());
            ((ThreadThemePayload) entry2.getValue()).writeToParcel(parcel, i);
        }
        String str25 = this.A2C;
        if (str25 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str25);
        }
        parcel.writeLong(this.A0N);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A0O);
        String str26 = this.A2D;
        if (str26 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str26);
        }
        AnonymousClass219 anonymousClass219 = this.A14;
        if (anonymousClass219 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(anonymousClass219.ordinal());
        }
        parcel.writeLong(this.A0P);
        String str27 = this.A2E;
        if (str27 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str27);
        }
        Set set = this.A2F;
        parcel.writeInt(set.size());
        Iterator it16 = set.iterator();
        while (it16.hasNext()) {
            parcel.writeString((String) it16.next());
        }
    }
}
