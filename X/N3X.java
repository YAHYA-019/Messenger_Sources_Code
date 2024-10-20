package X;

import com.facebook.inspiration.model.movableoverlay.AddYoursParticipationInfo;
import com.facebook.inspiration.model.movableoverlay.AddYoursTemplateParticipationInfo;
import com.facebook.inspiration.model.movableoverlay.CreateStickerInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationBloksStickerInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationEventInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationFeelingsInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationFundraiserInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationGiphyInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationHashtagStickerOverlayInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationLazyStickerStyleInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationOverlayFeedRemixStickerInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationPollInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationProductInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationReshareInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationStaticStickerInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationStickerLocationInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationStickerNameInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationStickerParams;
import com.facebook.inspiration.model.movableoverlay.InspirationVoterRegistrationInfo;
import com.facebook.inspiration.model.movableoverlay.InspirationWeatherInfo;
import com.facebook.inspiration.model.movableoverlay.SnapbackStrategy;
import com.facebook.inspiration.model.movableoverlay.caption.InspirationCaptionStickerInfo;
import com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo;
import com.facebook.inspiration.model.movableoverlay.timedelements.InspirationTimedElementParams;
import com.facebook.ipc.composer.model.DateStickerOverlay;
import com.facebook.ipc.media.data.metaverse.MetaGalleryMetadata;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N3X.class */
public final class N3X {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public EnumC3498Mft A0C;
    public EnumC3498Mft A0D;
    public EPI A0E;
    public AddYoursParticipationInfo A0F;
    public AddYoursTemplateParticipationInfo A0G;
    public CreateStickerInfo A0H;
    public InspirationBloksStickerInfo A0I;
    public InspirationEventInfo A0J;
    public InspirationFeelingsInfo A0K;
    public InspirationFundraiserInfo A0L;
    public InspirationGiphyInfo A0M;
    public InspirationHashtagStickerOverlayInfo A0N;
    public InspirationLazyStickerStyleInfo A0O;
    public InspirationOverlayFeedRemixStickerInfo A0P;
    public InspirationPollInfo A0Q;
    public InspirationProductInfo A0R;
    public InspirationReshareInfo A0S;
    public InspirationStaticStickerInfo A0T;
    public InspirationStickerLocationInfo A0U;
    public InspirationStickerNameInfo A0V;
    public InspirationVoterRegistrationInfo A0W;
    public InspirationWeatherInfo A0X;
    public SnapbackStrategy A0Y;
    public InspirationCaptionStickerInfo A0Z;
    public InspirationMusicStickerInfo A0a;
    public InspirationTimedElementParams A0b;
    public DateStickerOverlay A0c;
    public MetaGalleryMetadata A0d;
    public PersistableRect A0e;
    public ImmutableList A0f;
    public ImmutableList A0g;
    public ImmutableList A0h;
    public Float A0i;
    public Float A0j;
    public Integer A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public Set A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;

    public N3X() {
        this.A0y = AnonymousClass001.A0v();
        this.A0f = ImmutableList.of();
        this.A0g = ImmutableList.of();
        this.A15 = true;
        this.A0r = "";
        this.A18 = true;
        this.A19 = true;
        this.A1A = true;
        this.A1B = true;
        this.A1C = true;
        this.A1E = true;
        this.A0v = "";
        this.A0x = "";
        this.A0h = ImmutableList.of();
    }

    public N3X(InspirationStickerParams inspirationStickerParams) {
        this.A0y = AnonymousClass001.A0v();
        inspirationStickerParams.getClass();
        this.A0F = inspirationStickerParams.A0F;
        this.A0G = inspirationStickerParams.A0G;
        this.A0f = inspirationStickerParams.A0f;
        this.A0l = inspirationStickerParams.A0l;
        this.A0m = inspirationStickerParams.A0m;
        this.A0H = inspirationStickerParams.A0H;
        this.A0c = inspirationStickerParams.A0c;
        this.A0g = inspirationStickerParams.A0g;
        this.A0P = inspirationStickerParams.A0P;
        this.A0n = inspirationStickerParams.A0n;
        this.A0z = inspirationStickerParams.A0z;
        this.A10 = inspirationStickerParams.A10;
        this.A07 = inspirationStickerParams.A07;
        this.A01 = inspirationStickerParams.A01;
        this.A0I = inspirationStickerParams.A0I;
        this.A0Z = inspirationStickerParams.A0Z;
        this.A0J = inspirationStickerParams.A0J;
        this.A0K = inspirationStickerParams.A0K;
        this.A0L = inspirationStickerParams.A0L;
        this.A0M = inspirationStickerParams.A0M;
        this.A0N = inspirationStickerParams.A0N;
        this.A0a = inspirationStickerParams.A0a;
        this.A0R = inspirationStickerParams.A0R;
        this.A0T = inspirationStickerParams.A0T;
        this.A0o = inspirationStickerParams.A0o;
        this.A0W = inspirationStickerParams.A0W;
        this.A0X = inspirationStickerParams.A0X;
        this.A11 = inspirationStickerParams.A11;
        this.A12 = inspirationStickerParams.A12;
        this.A13 = inspirationStickerParams.A13;
        this.A14 = inspirationStickerParams.A14;
        this.A15 = inspirationStickerParams.A15;
        this.A16 = inspirationStickerParams.A16;
        this.A17 = inspirationStickerParams.A17;
        this.A0O = inspirationStickerParams.A0O;
        this.A02 = inspirationStickerParams.A02;
        this.A0i = inspirationStickerParams.A0i;
        this.A0e = inspirationStickerParams.A0e;
        this.A0k = inspirationStickerParams.A0k;
        this.A0j = inspirationStickerParams.A0j;
        this.A0V = inspirationStickerParams.A0V;
        this.A0Q = inspirationStickerParams.A0Q;
        this.A0p = inspirationStickerParams.A0p;
        this.A0q = inspirationStickerParams.A0q;
        this.A0S = inspirationStickerParams.A0S;
        this.A03 = inspirationStickerParams.A03;
        this.A00 = inspirationStickerParams.A00;
        this.A0C = inspirationStickerParams.A0C;
        this.A08 = inspirationStickerParams.A08;
        this.A0r = inspirationStickerParams.A0r;
        this.A18 = inspirationStickerParams.A18;
        this.A19 = inspirationStickerParams.A19;
        this.A1A = inspirationStickerParams.A1A;
        this.A1B = inspirationStickerParams.A1B;
        this.A1C = inspirationStickerParams.A1C;
        this.A1D = inspirationStickerParams.A1D;
        this.A1E = inspirationStickerParams.A1E;
        this.A0s = inspirationStickerParams.A0s;
        this.A0Y = inspirationStickerParams.A0Y;
        this.A0t = inspirationStickerParams.A0t;
        this.A09 = inspirationStickerParams.A09;
        this.A0u = inspirationStickerParams.A0u;
        this.A04 = inspirationStickerParams.A04;
        this.A0U = inspirationStickerParams.A0U;
        this.A0d = inspirationStickerParams.A0d;
        this.A0v = inspirationStickerParams.A0v;
        this.A0D = inspirationStickerParams.A0D;
        this.A0E = inspirationStickerParams.A0E;
        this.A0w = inspirationStickerParams.A0w;
        this.A0B = inspirationStickerParams.A0B;
        this.A0b = inspirationStickerParams.A0b;
        this.A05 = inspirationStickerParams.A05;
        this.A0x = inspirationStickerParams.A0x;
        this.A0h = inspirationStickerParams.A0h;
        this.A0A = inspirationStickerParams.A0A;
        this.A06 = inspirationStickerParams.A06;
        this.A0y = AbF.A1E(inspirationStickerParams.A0y);
    }

    public static void A00(N3X n3x, String str) {
        if (n3x.A0y.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(n3x.A0y);
        n3x.A0y = A1E;
        A1E.add(str);
    }

    public void A01(EnumC3498Mft enumC3498Mft) {
        this.A0D = enumC3498Mft;
        C1pq.A08("stickerSelectionSource", enumC3498Mft);
        A00(this, "stickerSelectionSource");
    }

    public void A02(EPI epi) {
        this.A0E = epi;
        C1pq.A08("stickerType", epi);
        A00(this, "stickerType");
    }

    public void A03(SnapbackStrategy snapbackStrategy) {
        this.A0Y = snapbackStrategy;
        C1pq.A08("snapbackStrategy", snapbackStrategy);
        A00(this, "snapbackStrategy");
    }

    public void A04(PersistableRect persistableRect) {
        this.A0e = persistableRect;
        C1pq.A08("mediaRect", persistableRect);
        A00(this, "mediaRect");
    }

    public void A05(ImmutableList immutableList) {
        this.A0h = immutableList;
        C1pq.A08("uris", immutableList);
    }

    public void A06(String str) {
        this.A0t = str;
        C1pq.A08("stickerCreationSource", str);
        A00(this, "stickerCreationSource");
    }

    public void A07(String str) {
        this.A0v = str;
        C1pq.A08("stickerName", str);
    }
}
