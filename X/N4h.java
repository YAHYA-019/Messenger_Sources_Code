package X;

import com.facebook.audience.model.interfaces.StoryDestinationConfiguration;
import com.facebook.composer.mediaeffect.model.ComposerMediaTemplate;
import com.facebook.composer.minutiae.model.MinutiaeObject;
import com.facebook.graphql.model.GraphQLStory;
import com.facebook.graphql.model.GraphQLTextWithEntities;
import com.facebook.inspiration.composer.smartgallery.model.SingleStackingMediaData;
import com.facebook.ipc.composer.config.ComposerConfiguration;
import com.facebook.ipc.composer.model.AvatarFeatureData;
import com.facebook.ipc.composer.model.CollaborativePromptsModel;
import com.facebook.ipc.composer.model.CommunityGivingModel;
import com.facebook.ipc.composer.model.ComposerActionItemsData;
import com.facebook.ipc.composer.model.ComposerBirthdayData;
import com.facebook.ipc.composer.model.ComposerBizData;
import com.facebook.ipc.composer.model.ComposerCallToAction;
import com.facebook.ipc.composer.model.ComposerCommerceInfo;
import com.facebook.ipc.composer.model.ComposerDifferentVoiceData;
import com.facebook.ipc.composer.model.ComposerFanRecognitionModel;
import com.facebook.ipc.composer.model.ComposerFileData;
import com.facebook.ipc.composer.model.ComposerFunFactModel;
import com.facebook.ipc.composer.model.ComposerFundraiserForStoryData;
import com.facebook.ipc.composer.model.ComposerGetGiftCardPurchasesModel;
import com.facebook.ipc.composer.model.ComposerGifFileModel;
import com.facebook.ipc.composer.model.ComposerGratitudePostModel;
import com.facebook.ipc.composer.model.ComposerGroupConfiguration;
import com.facebook.ipc.composer.model.ComposerGroupsChatsPostData;
import com.facebook.ipc.composer.model.ComposerGroupsWelcomePostData;
import com.facebook.ipc.composer.model.ComposerLaunchLoggingParams;
import com.facebook.ipc.composer.model.ComposerLocalCommunityPostModel;
import com.facebook.ipc.composer.model.ComposerLocationInfo;
import com.facebook.ipc.composer.model.ComposerLookingForPlayersModel;
import com.facebook.ipc.composer.model.ComposerMajorLifeEventData;
import com.facebook.ipc.composer.model.ComposerMemeRemixData;
import com.facebook.ipc.composer.model.ComposerMemorialPostData;
import com.facebook.ipc.composer.model.ComposerMusicData;
import com.facebook.ipc.composer.model.ComposerOfferData;
import com.facebook.ipc.composer.model.ComposerPageRecommendationModel;
import com.facebook.ipc.composer.model.ComposerPageTargetData;
import com.facebook.ipc.composer.model.ComposerPollData;
import com.facebook.ipc.composer.model.ComposerShareParams;
import com.facebook.ipc.composer.model.ComposerTargetData;
import com.facebook.ipc.composer.model.ComposerTextData;
import com.facebook.ipc.composer.model.ComposerThreedInfo;
import com.facebook.ipc.composer.model.ComposerVideoMeetupPostData;
import com.facebook.ipc.composer.model.EventsShareMetadataParam;
import com.facebook.ipc.composer.model.GoodwillProductSystem;
import com.facebook.ipc.composer.model.GoodwillVideo;
import com.facebook.ipc.composer.model.InlineSproutsSurfaceInfo;
import com.facebook.ipc.composer.model.MarketingMessagesTopic;
import com.facebook.ipc.composer.model.NewsFeedShareAnalyticsData;
import com.facebook.ipc.composer.model.PlatformConfiguration;
import com.facebook.ipc.composer.model.ProductItemAttachment;
import com.facebook.ipc.composer.model.SerializedComposerPluginConfig;
import com.facebook.ipc.composer.model.ThrowbackCameraRollMediaInfo;
import com.facebook.ipc.composer.model.ThrowbackCard;
import com.facebook.ipc.composer.model.WorkDraftForData;
import com.facebook.ipc.composer.model.editprefilled.EditComposerPreFilledData;
import com.facebook.ipc.composer.model.richtext.ComposerRichTextStyle;
import com.facebook.ipc.inspiration.config.InspirationConfiguration;
import com.facebook.pages.common.brandedcontent.model.PageUnit;
import com.facebook.photos.simplepicker.controller.data.model.Folder;
import com.facebook.privacy.uafprivacyoption.UAFPrivacyOption;
import com.facebook.share.model.ComposerAppAttribution;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N4h.class */
public final class N4h {
    public static volatile N0b A21;
    public int A00;
    public StoryDestinationConfiguration A01;
    public ComposerMediaTemplate A02;
    public MinutiaeObject A03;
    public GraphQLStory A04;
    public GraphQLTextWithEntities A05;
    public SingleStackingMediaData A06;
    public AvatarFeatureData A07;
    public CollaborativePromptsModel A08;
    public CommunityGivingModel A09;
    public ComposerActionItemsData A0A;
    public ComposerBirthdayData A0B;
    public ComposerBizData A0C;
    public ComposerCallToAction A0D;
    public ComposerCommerceInfo A0E;
    public ComposerDifferentVoiceData A0F;
    public ComposerFanRecognitionModel A0G;
    public ComposerFileData A0H;
    public ComposerFunFactModel A0I;
    public ComposerFundraiserForStoryData A0J;
    public ComposerGetGiftCardPurchasesModel A0K;
    public ComposerGifFileModel A0L;
    public ComposerGratitudePostModel A0M;
    public ComposerGroupConfiguration A0N;
    public ComposerGroupsChatsPostData A0O;
    public ComposerGroupsWelcomePostData A0P;
    public ComposerLaunchLoggingParams A0Q;
    public ComposerLocalCommunityPostModel A0R;
    public ComposerLocationInfo A0S;
    public ComposerLookingForPlayersModel A0T;
    public ComposerMajorLifeEventData A0U;
    public ComposerMemeRemixData A0V;
    public ComposerMemorialPostData A0W;
    public ComposerMusicData A0X;
    public ComposerOfferData A0Y;
    public ComposerPageRecommendationModel A0Z;
    public ComposerPageTargetData A0a;
    public ComposerPollData A0b;
    public ComposerShareParams A0c;
    public ComposerTargetData A0d;
    public ComposerTextData A0e;
    public ComposerThreedInfo A0f;
    public MfQ A0g;
    public ComposerVideoMeetupPostData A0h;
    public Qnt A0i;
    public EventsShareMetadataParam A0j;
    public GoodwillProductSystem A0k;
    public GoodwillVideo A0l;
    public InlineSproutsSurfaceInfo A0m;
    public MarketingMessagesTopic A0n;
    public NewsFeedShareAnalyticsData A0o;
    public PlatformConfiguration A0p;
    public ProductItemAttachment A0q;
    public SerializedComposerPluginConfig A0r;
    public ThrowbackCameraRollMediaInfo A0s;
    public ThrowbackCard A0t;
    public WorkDraftForData A0u;
    public EditComposerPreFilledData A0v;
    public ComposerRichTextStyle A0w;
    public InspirationConfiguration A0x;
    public PageUnit A0y;
    public AqT A0z;
    public Folder A10;
    public UAFPrivacyOption A11;
    public ComposerAppAttribution A12;
    public ImmutableList A13;
    public ImmutableList A14;
    public ImmutableList A15;
    public ImmutableList A16;
    public ImmutableList A17;
    public ImmutableList A18;
    public ImmutableList A19;
    public ImmutableList A1A;
    public Long A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public String A1M;
    public String A1N;
    public String A1O;
    public String A1P;
    public String A1Q;
    public String A1R;
    public String A1S;
    public String A1T;
    public Set A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;
    public boolean A1y;
    public boolean A1z;
    public boolean A20;

    public N4h() {
        this.A1U = AnonymousClass001.A0v();
        this.A14 = ImmutableList.of();
        this.A15 = ImmutableList.of();
        this.A16 = ImmutableList.of();
        this.A17 = ImmutableList.of();
        this.A18 = ImmutableList.of();
        this.A19 = ImmutableList.of();
        this.A1v = true;
        this.A1S = "";
    }

    public N4h(NAp nAp) {
        this.A1U = AnonymousClass001.A0v();
        nAp.getClass();
        if (nAp instanceof ComposerConfiguration) {
            ComposerConfiguration composerConfiguration = (ComposerConfiguration) nAp;
            A02(this, composerConfiguration);
            this.A0g = composerConfiguration.A0g;
            this.A13 = composerConfiguration.A13;
            this.A14 = composerConfiguration.A14;
            this.A1E = composerConfiguration.A1E;
            this.A0i = composerConfiguration.A0i;
            this.A1Y = composerConfiguration.A1Y;
            this.A1Z = composerConfiguration.A1Z;
            this.A1a = composerConfiguration.A1a;
            this.A1b = composerConfiguration.A1b;
            this.A1c = composerConfiguration.A1c;
            this.A0v = composerConfiguration.A0v;
            this.A15 = composerConfiguration.A15;
            this.A0j = composerConfiguration.A0j;
            this.A1F = composerConfiguration.A1F;
            this.A1G = composerConfiguration.A1G;
            this.A1H = composerConfiguration.A1H;
            this.A0k = composerConfiguration.A0k;
            this.A0l = composerConfiguration.A0l;
            this.A0M = composerConfiguration.A0M;
            this.A16 = composerConfiguration.A16;
            A00(this, composerConfiguration);
            this.A0e = composerConfiguration.A0e;
            A03(this, composerConfiguration);
            this.A17 = composerConfiguration.A17;
            A01(this, composerConfiguration);
            this.A18 = composerConfiguration.A18;
            this.A0z = composerConfiguration.A0z;
            this.A0d = composerConfiguration.A0d;
            this.A05 = composerConfiguration.A05;
            this.A0t = composerConfiguration.A0t;
            this.A0h = composerConfiguration.A0h;
            this.A0x = composerConfiguration.A0x;
            this.A1L = composerConfiguration.A1L;
            this.A19 = composerConfiguration.A19;
            A04(this, composerConfiguration);
            this.A0Q = composerConfiguration.A0Q;
            A05(this, composerConfiguration, composerConfiguration.A1M);
            this.A01 = composerConfiguration.A01;
            this.A1R = composerConfiguration.A1R;
            this.A1S = composerConfiguration.A1S;
            this.A0f = composerConfiguration.A0f;
            this.A0s = composerConfiguration.A0s;
            this.A1T = composerConfiguration.A1T;
            this.A0u = composerConfiguration.A0u;
            this.A1U = AbF.A1E(composerConfiguration.A1U);
            return;
        }
        ComposerConfiguration composerConfiguration2 = (ComposerConfiguration) nAp;
        A02(this, composerConfiguration2);
        MfQ AdW = nAp.AdW();
        this.A0g = AdW;
        C1pq.A08("composerType", AdW);
        A06(this, "composerType");
        this.A13 = composerConfiguration2.A13;
        ImmutableList immutableList = composerConfiguration2.A14;
        this.A14 = immutableList;
        C1pq.A08("customRichTextStyles", immutableList);
        this.A1E = composerConfiguration2.A1E;
        this.A0i = composerConfiguration2.A0i;
        this.A1Y = composerConfiguration2.A1Y;
        this.A1Z = composerConfiguration2.A1Z;
        this.A1a = composerConfiguration2.A1a;
        this.A1b = composerConfiguration2.A1b;
        this.A1c = composerConfiguration2.A1c;
        this.A0v = composerConfiguration2.A0v;
        ImmutableList immutableList2 = composerConfiguration2.A15;
        this.A15 = immutableList2;
        C1pq.A08("editPostFeatureCapabilities", immutableList2);
        this.A0j = composerConfiguration2.A0j;
        this.A1F = composerConfiguration2.A1F;
        this.A1G = composerConfiguration2.A1G;
        this.A1H = composerConfiguration2.A1H;
        this.A0k = composerConfiguration2.A0k;
        this.A0l = composerConfiguration2.A0l;
        this.A0M = composerConfiguration2.A0M;
        ImmutableList immutableList3 = composerConfiguration2.A16;
        this.A16 = immutableList3;
        C1pq.A08("groupCommerceCategories", immutableList3);
        A00(this, composerConfiguration2);
        ComposerTextData Aqc = nAp.Aqc();
        this.A0e = Aqc;
        C1pq.A08("initialComposerTextData", Aqc);
        A06(this, "initialComposerTextData");
        A03(this, composerConfiguration2);
        A0A(composerConfiguration2.A17);
        A01(this, composerConfiguration2);
        ImmutableList immutableList4 = composerConfiguration2.A18;
        this.A18 = immutableList4;
        C1pq.A08("initialTaggedUsers", immutableList4);
        this.A0z = composerConfiguration2.A0z;
        A09(nAp.Aqh());
        GraphQLTextWithEntities Aqi = nAp.Aqi();
        this.A05 = Aqi;
        C1pq.A08("initialText", Aqi);
        A06(this, "initialText");
        this.A0t = composerConfiguration2.A0t;
        this.A0h = composerConfiguration2.A0h;
        this.A0x = composerConfiguration2.A0x;
        this.A1L = composerConfiguration2.A1L;
        ImmutableList immutableList5 = composerConfiguration2.A19;
        this.A19 = immutableList5;
        C1pq.A08("interceptionConfigs", immutableList5);
        A04(this, composerConfiguration2);
        A08(nAp.AtP());
        A05(this, composerConfiguration2, composerConfiguration2.A1M);
        StoryDestinationConfiguration BCn = nAp.BCn();
        this.A01 = BCn;
        C1pq.A08("storyDestinationConfig", BCn);
        A06(this, "storyDestinationConfig");
        this.A1R = composerConfiguration2.A1R;
        String str = composerConfiguration2.A1S;
        this.A1S = str;
        C1pq.A08("threadId", str);
        this.A0f = composerConfiguration2.A0f;
        this.A0s = composerConfiguration2.A0s;
        this.A1T = composerConfiguration2.A1T;
        this.A0u = composerConfiguration2.A0u;
    }

    public static void A00(N4h n4h, ComposerConfiguration composerConfiguration) {
        n4h.A0N = composerConfiguration.A0N;
        n4h.A0A = composerConfiguration.A0A;
        n4h.A12 = composerConfiguration.A12;
        n4h.A08 = composerConfiguration.A08;
        n4h.A09 = composerConfiguration.A09;
        n4h.A0D = composerConfiguration.A0D;
        n4h.A0G = composerConfiguration.A0G;
        n4h.A0L = composerConfiguration.A0L;
        n4h.A0X = composerConfiguration.A0X;
    }

    public static void A01(N4h n4h, ComposerConfiguration composerConfiguration) {
        n4h.A0Y = composerConfiguration.A0Y;
        n4h.A0Z = composerConfiguration.A0Z;
        n4h.A0a = composerConfiguration.A0a;
        n4h.A0b = composerConfiguration.A0b;
        n4h.A1J = composerConfiguration.A1J;
        n4h.A11 = composerConfiguration.A11;
        n4h.A1B = composerConfiguration.A1B;
        n4h.A0w = composerConfiguration.A0w;
        n4h.A1K = composerConfiguration.A1K;
        n4h.A0c = composerConfiguration.A0c;
        n4h.A0y = composerConfiguration.A0y;
    }

    public static void A02(N4h n4h, ComposerConfiguration composerConfiguration) {
        n4h.A1V = composerConfiguration.A1V;
        n4h.A1C = composerConfiguration.A1C;
        n4h.A04 = composerConfiguration.A04;
        n4h.A07 = composerConfiguration.A07;
        n4h.A0B = composerConfiguration.A0B;
        n4h.A1D = composerConfiguration.A1D;
        n4h.A1W = composerConfiguration.A1W;
        n4h.A1X = composerConfiguration.A1X;
        n4h.A0E = composerConfiguration.A0E;
        n4h.A0C = composerConfiguration.A0C;
        n4h.A02 = composerConfiguration.A02;
    }

    public static void A03(N4h n4h, ComposerConfiguration composerConfiguration) {
        n4h.A0F = composerConfiguration.A0F;
        n4h.A0H = composerConfiguration.A0H;
        n4h.A10 = composerConfiguration.A10;
        n4h.A1I = composerConfiguration.A1I;
        n4h.A0I = composerConfiguration.A0I;
        n4h.A0J = composerConfiguration.A0J;
        n4h.A0K = composerConfiguration.A0K;
        n4h.A0O = composerConfiguration.A0O;
        n4h.A0P = composerConfiguration.A0P;
        n4h.A1d = composerConfiguration.A1d;
        n4h.A0S = composerConfiguration.A0S;
        n4h.A0T = composerConfiguration.A0T;
        n4h.A0U = composerConfiguration.A0U;
        n4h.A0n = composerConfiguration.A0n;
    }

    public static void A04(N4h n4h, ComposerConfiguration composerConfiguration) {
        n4h.A1e = composerConfiguration.A1e;
        n4h.A1f = composerConfiguration.A1f;
        n4h.A1g = composerConfiguration.A1g;
        n4h.A1h = composerConfiguration.A1h;
        n4h.A1i = composerConfiguration.A1i;
        n4h.A1j = composerConfiguration.A1j;
        n4h.A1k = composerConfiguration.A1k;
        n4h.A1l = composerConfiguration.A1l;
        n4h.A1m = composerConfiguration.A1m;
        n4h.A1n = composerConfiguration.A1n;
        n4h.A1o = composerConfiguration.A1o;
        n4h.A1p = composerConfiguration.A1p;
        n4h.A1q = composerConfiguration.A1q;
        n4h.A1r = composerConfiguration.A1r;
    }

    public static void A05(N4h n4h, ComposerConfiguration composerConfiguration, String str) {
        n4h.A1M = str;
        n4h.A1N = composerConfiguration.A1N;
        n4h.A0R = composerConfiguration.A0R;
        n4h.A1A = composerConfiguration.A1A;
        n4h.A0V = composerConfiguration.A0V;
        n4h.A0W = composerConfiguration.A0W;
        n4h.A1O = composerConfiguration.A1O;
        n4h.A03 = composerConfiguration.A03;
        n4h.A00 = composerConfiguration.A00;
        n4h.A1P = composerConfiguration.A1P;
        n4h.A0o = composerConfiguration.A0o;
        n4h.A0p = composerConfiguration.A0p;
        n4h.A0r = composerConfiguration.A0r;
        n4h.A1Q = composerConfiguration.A1Q;
        n4h.A0q = composerConfiguration.A0q;
        n4h.A1s = composerConfiguration.A1s;
        n4h.A1t = composerConfiguration.A1t;
        n4h.A1u = composerConfiguration.A1u;
        n4h.A1v = composerConfiguration.A1v;
        n4h.A1w = composerConfiguration.A1w;
        n4h.A1x = composerConfiguration.A1x;
        n4h.A1y = composerConfiguration.A1y;
        n4h.A1z = composerConfiguration.A1z;
        n4h.A20 = composerConfiguration.A20;
        n4h.A06 = composerConfiguration.A06;
        n4h.A0m = composerConfiguration.A0m;
    }

    public static void A06(N4h n4h, String str) {
        if (n4h.A1U.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(n4h.A1U);
        n4h.A1U = A1E;
        A1E.add(str);
    }

    public void A07(GraphQLTextWithEntities graphQLTextWithEntities) {
        if (A21 == null) {
            synchronized (this) {
                if (A21 == null) {
                    A21 = new N0b();
                }
            }
        }
        N0b n0b = A21;
        if (graphQLTextWithEntities == null || graphQLTextWithEntities.A0X() == null) {
            graphQLTextWithEntities = n0b.A00;
        }
        this.A05 = graphQLTextWithEntities;
        C1pq.A08("initialText", graphQLTextWithEntities);
        A06(this, "initialText");
    }

    public void A08(ComposerLaunchLoggingParams composerLaunchLoggingParams) {
        this.A0Q = composerLaunchLoggingParams;
        C1pq.A08("launchLoggingParams", composerLaunchLoggingParams);
        A06(this, "launchLoggingParams");
    }

    public void A09(ComposerTargetData composerTargetData) {
        this.A0d = composerTargetData;
        C1pq.A08("initialTargetData", composerTargetData);
        A06(this, "initialTargetData");
    }

    public void A0A(ImmutableList immutableList) {
        this.A17 = immutableList;
        C1pq.A08("initialMedia", immutableList);
    }
}
