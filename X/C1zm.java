package X;

import android.net.Uri;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.GraphQLMessageThreadCannotReplyReason;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadSubType;
import com.facebook.graphql.enums.GraphQLMessengerGroupThreadWarningType;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.communitymessaging.threadfull.model.ThreadFullnessState;
import com.facebook.messaging.events.model.EventData;
import com.facebook.messaging.games.pushnotification.model.GamesPushNotificationSettings;
import com.facebook.messaging.model.business.MessageSuggestedReply;
import com.facebook.messaging.model.messages.MessageDraft;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.AdsConversionsQPData;
import com.facebook.messaging.model.threads.GroupThreadData;
import com.facebook.messaging.model.threads.LearningSpaceThreadData;
import com.facebook.messaging.model.threads.MarketplaceThreadData;
import com.facebook.messaging.model.threads.MontageThreadPreview;
import com.facebook.messaging.model.threads.NewFriendBumpThreadData;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ProfessionalMetadata;
import com.facebook.messaging.model.threads.RelatedPageThreadData;
import com.facebook.messaging.model.threads.RequestAppointmentData;
import com.facebook.messaging.model.threads.ThreadBookingRequests;
import com.facebook.messaging.model.threads.ThreadConnectivityData;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadMediaPreview;
import com.facebook.messaging.model.threads.ThreadRtcCallInfoData;
import com.facebook.messaging.model.threads.ThreadRtcRoomInfoData;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.model.threads.ads.AdContextData;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.threadview.notificationbanner.model.animated.AnimatedThreadActivityBannerDataModel;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.theme.custom.model.CompositeThreadThemeInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1zm, reason: invalid class name */
/* loaded from: 1zm.class */
public final class C1zm {
    public static volatile 5pW A2q;
    public static volatile 3Gi A2r;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public long A0P;
    public Uri A0Q;
    public Uri A0R;
    public Uri A0S;
    public Uri A0T;
    public Uri A0U;
    public Uri A0V;
    public TriState A0W;
    public GraphQLMessageThreadCannotReplyReason A0X;
    public GraphQLMessengerGroupThreadSubType A0Y;
    public GraphQLMessengerGroupThreadWarningType A0Z;
    public CallToAction A0a;
    public CallToAction A0b;
    public ThreadFullnessState A0c;
    public EventData A0d;
    public GamesPushNotificationSettings A0e;
    public MessageSuggestedReply A0f;
    public 1F9 A0g;
    public MessageDraft A0h;
    public ParticipantInfo A0i;
    public ThreadKey A0j;
    public ThreadKey A0k;
    public ThreadKey A0l;
    public ThreadKey A0m;
    public ThreadKey A0n;
    public AdsConversionsQPData A0o;
    public GroupThreadData A0p;
    public LearningSpaceThreadData A0q;
    public MarketplaceThreadData A0r;
    public MontageThreadPreview A0s;
    public NewFriendBumpThreadData A0t;
    public NotificationSetting A0u;
    public NotificationSetting A0v;
    public AnonymousClass214 A0w;
    public ProfessionalMetadata A0x;
    public RelatedPageThreadData A0y;
    public RequestAppointmentData A0z;
    public ThreadBookingRequests A10;
    public ThreadConnectivityData A11;
    public ThreadCustomization A12;
    public ThreadMediaPreview A13;
    public AnonymousClass219 A14;
    public ThreadRtcCallInfoData A15;
    public ThreadRtcRoomInfoData A16;
    public C20a A17;
    public AdContextData A18;
    public MontageBucketPreview A19;
    public C1zu A1A;
    public AnimatedThreadActivityBannerDataModel A1B;
    public Capabilities A1C;
    public HeterogeneousMap A1D;
    public CompositeThreadThemeInfo A1E;
    public ImmutableList A1F;
    public ImmutableList A1G;
    public ImmutableList A1H;
    public ImmutableList A1I;
    public ImmutableList A1J;
    public ImmutableList A1K;
    public ImmutableList A1L;
    public ImmutableList A1M;
    public ImmutableList A1N;
    public ImmutableList A1O;
    public ImmutableList A1P;
    public ImmutableList A1Q;
    public ImmutableMap A1R;
    public ImmutableMap A1S;
    public ImmutableSet A1T;
    public Boolean A1U;
    public Integer A1V;
    public Integer A1W;
    public Integer A1X;
    public Integer A1Y;
    public Integer A1Z;
    public Integer A1a;
    public Integer A1b;
    public Integer A1c;
    public Integer A1d;
    public Long A1e;
    public Long A1f;
    public Long A1g;
    public Long A1h;
    public Long A1i;
    public Long A1j;
    public Long A1k;
    public Long A1l;
    public Long A1m;
    public String A1n;
    public String A1o;
    public String A1p;
    public String A1q;
    public String A1r;
    public String A1s;
    public String A1t;
    public String A1u;
    public String A1v;
    public String A1w;
    public String A1x;
    public String A1y;
    public String A1z;
    public String A20;
    public String A21;
    public String A22;
    public String A23;
    public String A24;
    public String A25;
    public String A26;
    public String A27;
    public String A28;
    public String A29;
    public String A2A;
    public String A2B;
    public String A2C;
    public String A2D;
    public String A2E;
    public Set A2F;
    public boolean A2G;
    public boolean A2H;
    public boolean A2I;
    public boolean A2J;
    public boolean A2K;
    public boolean A2L;
    public boolean A2M;
    public boolean A2N;
    public boolean A2O;
    public boolean A2P;
    public boolean A2Q;
    public boolean A2R;
    public boolean A2S;
    public boolean A2T;
    public boolean A2U;
    public boolean A2V;
    public boolean A2W;
    public boolean A2X;
    public boolean A2Y;
    public boolean A2Z;
    public boolean A2a;
    public boolean A2b;
    public boolean A2c;
    public boolean A2d;
    public boolean A2e;
    public boolean A2f;
    public boolean A2g;
    public boolean A2h;
    public boolean A2i;
    public boolean A2j;
    public boolean A2k;
    public boolean A2l;
    public boolean A2m;
    public boolean A2n;
    public boolean A2o;
    public boolean A2p;

    public C1zm() {
        this.A2F = new HashSet();
        this.A1G = ImmutableList.of();
        this.A1T = RegularImmutableSet.A05;
        this.A2a = false;
        this.A2k = true;
        long j = -1;
        this.A0A = j;
        this.A1z = "";
        ImmutableMap immutableMap = RegularImmutableMap.A03;
        this.A1R = immutableMap;
        this.A1L = ImmutableList.of();
        this.A1Q = ImmutableList.of();
        this.A0L = j;
        this.A1S = immutableMap;
        this.A02 = -1;
    }

    public C1zm(C20o c20o) {
        this.A2F = new HashSet();
        c20o.getClass();
        if (c20o instanceof ThreadSummary) {
            ThreadSummary threadSummary = (ThreadSummary) c20o;
            this.A1V = threadSummary.A1V;
            this.A04 = threadSummary.A04;
            this.A1n = threadSummary.A1n;
            this.A18 = threadSummary.A18;
            this.A1o = threadSummary.A1o;
            this.A1p = threadSummary.A1p;
            this.A1q = threadSummary.A1q;
            this.A0o = threadSummary.A0o;
            this.A1F = threadSummary.A1F;
            this.A1B = threadSummary.A1B;
            this.A05 = threadSummary.A05;
            this.A2G = threadSummary.A2G;
            this.A0Q = threadSummary.A0Q;
            this.A1G = threadSummary.A1G;
            this.A0u = threadSummary.A0u;
            this.A2H = threadSummary.A2H;
            this.A0X = threadSummary.A0X;
            this.A1C = threadSummary.A1C;
            this.A1W = threadSummary.A1W;
            this.A1T = threadSummary.A1T;
            this.A1H = threadSummary.A1H;
            this.A06 = threadSummary.A06;
            this.A1r = threadSummary.A1r;
            this.A0R = threadSummary.A0R;
            this.A07 = threadSummary.A07;
            this.A1E = threadSummary.A1E;
            this.A1e = threadSummary.A1e;
            this.A1s = threadSummary.A1s;
            this.A0j = threadSummary.A0j;
            this.A1f = threadSummary.A1f;
            this.A1g = threadSummary.A1g;
            this.A2I = threadSummary.A2I;
            this.A2J = threadSummary.A2J;
            this.A1t = threadSummary.A1t;
            this.A0h = threadSummary.A0h;
            this.A1X = threadSummary.A1X;
            this.A0d = threadSummary.A0d;
            this.A0g = threadSummary.A0g;
            this.A2K = threadSummary.A2K;
            this.A0e = threadSummary.A0e;
            this.A00 = threadSummary.A00;
            this.A1Y = threadSummary.A1Y;
            this.A0p = threadSummary.A0p;
            this.A0Y = threadSummary.A0Y;
            this.A0Z = threadSummary.A0Z;
            this.A2L = threadSummary.A2L;
            this.A2M = threadSummary.A2M;
            this.A2N = threadSummary.A2N;
            this.A2O = threadSummary.A2O;
            this.A2P = threadSummary.A2P;
            this.A2Q = threadSummary.A2Q;
            this.A2R = threadSummary.A2R;
            this.A2S = threadSummary.A2S;
            this.A2T = threadSummary.A2T;
            this.A2U = threadSummary.A2U;
            this.A2V = threadSummary.A2V;
            this.A2W = threadSummary.A2W;
            this.A2X = threadSummary.A2X;
            this.A2Y = threadSummary.A2Y;
            this.A2Z = threadSummary.A2Z;
            this.A2a = threadSummary.A2a;
            this.A2b = threadSummary.A2b;
            this.A2c = threadSummary.A2c;
            this.A2d = threadSummary.A2d;
            this.A2e = threadSummary.A2e;
            this.A2f = threadSummary.A2f;
            this.A2g = threadSummary.A2g;
            this.A2h = threadSummary.A2h;
            this.A01 = threadSummary.A01;
            this.A2i = threadSummary.A2i;
            this.A2j = threadSummary.A2j;
            this.A0W = threadSummary.A0W;
            this.A1Z = threadSummary.A1Z;
            this.A1U = threadSummary.A1U;
            this.A2k = threadSummary.A2k;
            this.A2l = threadSummary.A2l;
            this.A2m = threadSummary.A2m;
            this.A2n = threadSummary.A2n;
            this.A2o = threadSummary.A2o;
            this.A08 = threadSummary.A08;
            this.A0S = threadSummary.A0S;
            this.A1h = threadSummary.A1h;
            this.A09 = threadSummary.A09;
            this.A1u = threadSummary.A1u;
            this.A0a = threadSummary.A0a;
            this.A1v = threadSummary.A1v;
            this.A1w = threadSummary.A1w;
            this.A1x = threadSummary.A1x;
            this.A1y = threadSummary.A1y;
            this.A1I = threadSummary.A1I;
            this.A0A = threadSummary.A0A;
            this.A1J = threadSummary.A1J;
            this.A0B = threadSummary.A0B;
            this.A0C = threadSummary.A0C;
            this.A0D = threadSummary.A0D;
            this.A0b = threadSummary.A0b;
            this.A0q = threadSummary.A0q;
            this.A1a = threadSummary.A1a;
            this.A1z = threadSummary.A1z;
            this.A1R = threadSummary.A1R;
            this.A0r = threadSummary.A0r;
            this.A13 = threadSummary.A13;
            this.A0E = threadSummary.A0E;
            this.A0f = threadSummary.A0f;
            this.A1D = threadSummary.A1D;
            this.A17 = threadSummary.A17;
            this.A19 = threadSummary.A19;
            this.A0k = threadSummary.A0k;
            this.A0s = threadSummary.A0s;
            this.A20 = threadSummary.A20;
            this.A0t = threadSummary.A0t;
            this.A1i = threadSummary.A1i;
            this.A1b = threadSummary.A1b;
            this.A0v = threadSummary.A0v;
            this.A1j = threadSummary.A1j;
            this.A1K = threadSummary.A1K;
            this.A0w = threadSummary.A0w;
            this.A0F = threadSummary.A0F;
            this.A21 = threadSummary.A21;
            this.A0G = threadSummary.A0G;
            this.A0l = threadSummary.A0l;
            this.A22 = threadSummary.A22;
            this.A0T = threadSummary.A0T;
            this.A1L = threadSummary.A1L;
            this.A1M = threadSummary.A1M;
            this.A0U = threadSummary.A0U;
            this.A23 = threadSummary.A23;
            this.A0V = threadSummary.A0V;
            this.A24 = threadSummary.A24;
            this.A25 = threadSummary.A25;
            this.A26 = threadSummary.A26;
            this.A0H = threadSummary.A0H;
            this.A0x = threadSummary.A0x;
            this.A27 = threadSummary.A27;
            this.A0I = threadSummary.A0I;
            this.A1N = threadSummary.A1N;
            this.A1O = threadSummary.A1O;
            this.A1P = threadSummary.A1P;
            this.A1k = threadSummary.A1k;
            this.A0y = threadSummary.A0y;
            this.A0J = threadSummary.A0J;
            this.A0z = threadSummary.A0z;
            this.A0K = threadSummary.A0K;
            this.A1c = threadSummary.A1c;
            this.A1l = threadSummary.A1l;
            this.A28 = threadSummary.A28;
            this.A29 = threadSummary.A29;
            this.A0m = threadSummary.A0m;
            this.A1Q = threadSummary.A1Q;
            this.A0L = threadSummary.A0L;
            this.A2p = threadSummary.A2p;
            this.A1m = threadSummary.A1m;
            this.A2A = threadSummary.A2A;
            this.A0i = threadSummary.A0i;
            this.A1d = threadSummary.A1d;
            this.A10 = threadSummary.A10;
            this.A11 = threadSummary.A11;
            this.A12 = threadSummary.A12;
            this.A0c = threadSummary.A0c;
            this.A0n = threadSummary.A0n;
            this.A2B = threadSummary.A2B;
            this.A0M = threadSummary.A0M;
            this.A15 = threadSummary.A15;
            this.A16 = threadSummary.A16;
            this.A1A = threadSummary.A1A;
            this.A1S = threadSummary.A1S;
            this.A2C = threadSummary.A2C;
            this.A0N = threadSummary.A0N;
            this.A02 = threadSummary.A02;
            this.A03 = threadSummary.A03;
            this.A0O = threadSummary.A0O;
            this.A2D = threadSummary.A2D;
            this.A14 = threadSummary.A14;
            this.A0P = threadSummary.A0P;
            this.A2E = threadSummary.A2E;
            this.A2F = new HashSet(threadSummary.A2F);
            return;
        }
        ThreadSummary threadSummary2 = (ThreadSummary) c20o;
        this.A1V = threadSummary2.A1V;
        this.A04 = threadSummary2.A04;
        this.A1n = threadSummary2.A1n;
        this.A18 = threadSummary2.A18;
        this.A1o = threadSummary2.A1o;
        this.A1p = threadSummary2.A1p;
        this.A1q = threadSummary2.A1q;
        this.A0o = threadSummary2.A0o;
        this.A1F = threadSummary2.A1F;
        this.A1B = threadSummary2.A1B;
        this.A05 = threadSummary2.A05;
        this.A2G = threadSummary2.A2G;
        this.A0Q = threadSummary2.A0Q;
        ImmutableList immutableList = threadSummary2.A1G;
        this.A1G = immutableList;
        C1pq.A08("botParticipants", immutableList);
        A05(c20o.Aap());
        this.A2H = threadSummary2.A2H;
        GraphQLMessageThreadCannotReplyReason AbY = c20o.AbY();
        this.A0X = AbY;
        C1pq.A08("cannotReplyReason", AbY);
        A00(this, "cannotReplyReason");
        this.A1C = threadSummary2.A1C;
        this.A1W = threadSummary2.A1W;
        A0H(threadSummary2.A1T);
        this.A1H = threadSummary2.A1H;
        this.A06 = threadSummary2.A06;
        this.A1r = threadSummary2.A1r;
        this.A0R = threadSummary2.A0R;
        this.A07 = threadSummary2.A07;
        A0D(c20o.AdX());
        this.A1e = threadSummary2.A1e;
        this.A1s = threadSummary2.A1s;
        this.A0j = threadSummary2.A0j;
        this.A1f = threadSummary2.A1f;
        this.A1g = threadSummary2.A1g;
        this.A2I = threadSummary2.A2I;
        this.A2J = threadSummary2.A2J;
        this.A1t = threadSummary2.A1t;
        this.A0h = threadSummary2.A0h;
        this.A1X = threadSummary2.A1X;
        this.A0d = threadSummary2.A0d;
        this.A0g = threadSummary2.A0g;
        this.A2K = threadSummary2.A2K;
        this.A0e = threadSummary2.A0e;
        this.A00 = threadSummary2.A00;
        this.A1Y = threadSummary2.A1Y;
        A04(c20o.AoK());
        this.A0Y = threadSummary2.A0Y;
        A02(c20o.AoL());
        this.A2L = threadSummary2.A2L;
        this.A2M = threadSummary2.A2M;
        this.A2N = threadSummary2.A2N;
        this.A2O = threadSummary2.A2O;
        this.A2P = threadSummary2.A2P;
        this.A2Q = threadSummary2.A2Q;
        this.A2R = threadSummary2.A2R;
        this.A2S = threadSummary2.A2S;
        this.A2T = threadSummary2.A2T;
        this.A2U = threadSummary2.A2U;
        this.A2V = threadSummary2.A2V;
        this.A2W = threadSummary2.A2W;
        this.A2X = threadSummary2.A2X;
        this.A2Y = threadSummary2.A2Y;
        this.A2Z = threadSummary2.A2Z;
        this.A2a = threadSummary2.A2a;
        this.A2b = threadSummary2.A2b;
        this.A2c = threadSummary2.A2c;
        this.A2d = threadSummary2.A2d;
        this.A2e = threadSummary2.A2e;
        this.A2f = threadSummary2.A2f;
        this.A2g = threadSummary2.A2g;
        this.A2h = threadSummary2.A2h;
        this.A01 = threadSummary2.A01;
        this.A2i = threadSummary2.A2i;
        this.A2j = threadSummary2.A2j;
        TriState BWg = c20o.BWg();
        this.A0W = BWg;
        C1pq.A08("isThreadQueueEnabled", BWg);
        A00(this, "isThreadQueueEnabled");
        this.A1Z = threadSummary2.A1Z;
        this.A1U = threadSummary2.A1U;
        this.A2k = threadSummary2.A2k;
        this.A2l = threadSummary2.A2l;
        this.A2m = threadSummary2.A2m;
        this.A2n = threadSummary2.A2n;
        this.A2o = threadSummary2.A2o;
        this.A08 = threadSummary2.A08;
        this.A0S = threadSummary2.A0S;
        this.A1h = threadSummary2.A1h;
        this.A09 = threadSummary2.A09;
        String At6 = c20o.At6();
        this.A1u = At6;
        C1pq.A08("lastMessageAdminTextType", At6);
        A00(this, "lastMessageAdminTextType");
        this.A0a = threadSummary2.A0a;
        A0J(c20o.At7());
        this.A1w = threadSummary2.A1w;
        this.A1x = threadSummary2.A1x;
        this.A1y = threadSummary2.A1y;
        this.A1I = threadSummary2.A1I;
        this.A0A = threadSummary2.A0A;
        this.A1J = c20o.At8();
        A00(this, "lastMissedCallParticipantIDs");
        this.A0B = threadSummary2.A0B;
        this.A0C = threadSummary2.A0C;
        this.A0D = threadSummary2.A0D;
        this.A0b = threadSummary2.A0b;
        this.A0q = threadSummary2.A0q;
        this.A1a = threadSummary2.A1a;
        String str = threadSummary2.A1z;
        this.A1z = str;
        C1pq.A08("loggedInUserId", str);
        A0F(threadSummary2.A1R);
        this.A0r = threadSummary2.A0r;
        this.A13 = threadSummary2.A13;
        this.A0E = threadSummary2.A0E;
        this.A0f = threadSummary2.A0f;
        A0C(c20o.AxS());
        A0B(c20o.Axu());
        this.A19 = threadSummary2.A19;
        this.A0k = threadSummary2.A0k;
        this.A0s = threadSummary2.A0s;
        this.A20 = threadSummary2.A20;
        this.A0t = threadSummary2.A0t;
        this.A1i = threadSummary2.A1i;
        this.A1b = Integer.valueOf(c20o.AzY());
        A00(this, "notificationGroupSetting");
        A06(c20o.AzZ());
        this.A1j = threadSummary2.A1j;
        this.A1K = threadSummary2.A1K;
        A07(c20o.B0N());
        this.A0F = threadSummary2.A0F;
        this.A21 = threadSummary2.A21;
        this.A0G = threadSummary2.A0G;
        this.A0l = threadSummary2.A0l;
        this.A22 = threadSummary2.A22;
        this.A0T = threadSummary2.A0T;
        A0E(threadSummary2.A1L);
        this.A1M = threadSummary2.A1M;
        this.A0U = threadSummary2.A0U;
        this.A23 = threadSummary2.A23;
        this.A0V = threadSummary2.A0V;
        this.A24 = threadSummary2.A24;
        this.A25 = threadSummary2.A25;
        A0K(c20o.B3q());
        this.A0H = threadSummary2.A0H;
        this.A0x = threadSummary2.A0x;
        this.A27 = threadSummary2.A27;
        this.A0I = threadSummary2.A0I;
        this.A1N = threadSummary2.A1N;
        this.A1O = threadSummary2.A1O;
        this.A1P = threadSummary2.A1P;
        this.A1k = threadSummary2.A1k;
        this.A0y = threadSummary2.A0y;
        this.A0J = threadSummary2.A0J;
        this.A0z = threadSummary2.A0z;
        this.A0K = threadSummary2.A0K;
        this.A1c = threadSummary2.A1c;
        this.A1l = threadSummary2.A1l;
        this.A28 = threadSummary2.A28;
        this.A29 = threadSummary2.A29;
        this.A0m = threadSummary2.A0m;
        ImmutableList immutableList2 = threadSummary2.A1Q;
        this.A1Q = immutableList2;
        C1pq.A08("senders", immutableList2);
        this.A0L = threadSummary2.A0L;
        this.A2p = threadSummary2.A2p;
        this.A1m = threadSummary2.A1m;
        this.A2A = threadSummary2.A2A;
        this.A0i = threadSummary2.A0i;
        this.A1d = threadSummary2.A1d;
        this.A10 = threadSummary2.A10;
        this.A11 = threadSummary2.A11;
        A08(c20o.BF2());
        ThreadFullnessState BF4 = c20o.BF4();
        this.A0c = BF4;
        C1pq.A08("threadFullnessState", BF4);
        A00(this, "threadFullnessState");
        A03(threadSummary2.A0n);
        this.A2B = threadSummary2.A2B;
        this.A0M = threadSummary2.A0M;
        A09(c20o.BFG());
        A0A(c20o.BFH());
        C1zu BFJ = c20o.BFJ();
        this.A1A = BFJ;
        C1pq.A08("threadStatus", BFJ);
        A00(this, "threadStatus");
        A0G(threadSummary2.A1S);
        this.A2C = threadSummary2.A2C;
        this.A0N = threadSummary2.A0N;
        this.A02 = threadSummary2.A02;
        this.A03 = threadSummary2.A03;
        this.A0O = threadSummary2.A0O;
        this.A2D = threadSummary2.A2D;
        AnonymousClass219 BIz = c20o.BIz();
        this.A14 = BIz;
        C1pq.A08("vanishModeSelectedMode", BIz);
        A00(this, "vanishModeSelectedMode");
        this.A0P = threadSummary2.A0P;
        this.A2E = threadSummary2.A2E;
    }

    public static void A00(C1zm c1zm, String str) {
        if (c1zm.A2F.contains(str)) {
            return;
        }
        HashSet hashSet = new HashSet(c1zm.A2F);
        c1zm.A2F = hashSet;
        hashSet.add(str);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.5pW] */
    public void A01(GraphQLMessageThreadCannotReplyReason graphQLMessageThreadCannotReplyReason) {
        if (A2q == null) {
            synchronized (this) {
                if (A2q == null) {
                    A2q = new Object();
                }
            }
        }
        if (graphQLMessageThreadCannotReplyReason == null) {
            graphQLMessageThreadCannotReplyReason = GraphQLMessageThreadCannotReplyReason.A0A;
        }
        this.A0X = graphQLMessageThreadCannotReplyReason;
        C1pq.A08("cannotReplyReason", graphQLMessageThreadCannotReplyReason);
        A00(this, "cannotReplyReason");
    }

    public void A02(GraphQLMessengerGroupThreadWarningType graphQLMessengerGroupThreadWarningType) {
        this.A0Z = graphQLMessengerGroupThreadWarningType;
        C1pq.A08("groupThreadWarningType", graphQLMessengerGroupThreadWarningType);
        A00(this, "groupThreadWarningType");
    }

    public void A03(ThreadKey threadKey) {
        this.A0n = threadKey;
        C1pq.A08("threadKey", threadKey);
    }

    public void A04(GroupThreadData groupThreadData) {
        this.A0p = groupThreadData;
        C1pq.A08("groupThreadData", groupThreadData);
        A00(this, "groupThreadData");
    }

    public void A05(NotificationSetting notificationSetting) {
        this.A0u = notificationSetting;
        C1pq.A08("callNotificationSetting", notificationSetting);
        A00(this, "callNotificationSetting");
    }

    public void A06(NotificationSetting notificationSetting) {
        this.A0v = notificationSetting;
        C1pq.A08("notificationSetting", notificationSetting);
        A00(this, "notificationSetting");
    }

    public void A07(AnonymousClass214 anonymousClass214) {
        this.A0w = anonymousClass214;
        C1pq.A08("optimisticGroupState", anonymousClass214);
        A00(this, "optimisticGroupState");
    }

    public void A08(ThreadCustomization threadCustomization) {
        this.A12 = threadCustomization;
        C1pq.A08("threadCustomization", threadCustomization);
        A00(this, "threadCustomization");
    }

    public void A09(ThreadRtcCallInfoData threadRtcCallInfoData) {
        this.A15 = threadRtcCallInfoData;
        C1pq.A08("threadRtcCallInfoData", threadRtcCallInfoData);
        A00(this, "threadRtcCallInfoData");
    }

    public void A0A(ThreadRtcRoomInfoData threadRtcRoomInfoData) {
        this.A16 = threadRtcRoomInfoData;
        C1pq.A08("threadRtcRoomInfoData", threadRtcRoomInfoData);
        A00(this, "threadRtcRoomInfoData");
    }

    public void A0B(C20a c20a) {
        this.A17 = c20a;
        C1pq.A08("missedCallStatus", c20a);
        A00(this, "missedCallStatus");
    }

    public void A0C(HeterogeneousMap heterogeneousMap) {
        this.A1D = heterogeneousMap;
        C1pq.A08("metadata", heterogeneousMap);
        A00(this, "metadata");
    }

    public void A0D(CompositeThreadThemeInfo compositeThreadThemeInfo) {
        this.A1E = compositeThreadThemeInfo;
        C1pq.A08("compositeThreadThemeInfo", compositeThreadThemeInfo);
        A00(this, "compositeThreadThemeInfo");
    }

    public void A0E(ImmutableList immutableList) {
        this.A1L = immutableList;
        C1pq.A08("participants", immutableList);
    }

    public void A0F(ImmutableMap immutableMap) {
        this.A1R = immutableMap;
        C1pq.A08("magicWords", immutableMap);
    }

    public void A0G(ImmutableMap immutableMap) {
        this.A1S = immutableMap;
        C1pq.A08("threadThemePayloadMap", immutableMap);
    }

    public void A0H(ImmutableSet immutableSet) {
        this.A1T = immutableSet;
        C1pq.A08("communityChatFlags", immutableSet);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.3Gi, java.lang.Object] */
    public void A0I(String str) {
        if (A2r == null) {
            synchronized (this) {
                if (A2r == null) {
                    A2r = new Object();
                }
            }
        }
        if (str == null) {
            str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
        this.A1u = str;
        C1pq.A08("lastMessageAdminTextType", str);
        A00(this, "lastMessageAdminTextType");
    }

    public void A0J(String str) {
        this.A1v = str;
        C1pq.A08("lastMessageBreadcrumbType", str);
        A00(this, "lastMessageBreadcrumbType");
    }

    public void A0K(String str) {
        this.A26 = str;
        C1pq.A08("policyViolationContentVisibility", str);
        A00(this, "policyViolationContentVisibility");
    }
}
