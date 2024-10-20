package X;

import com.facebook.crossposting.contentcompatibility.model.CrossPostingMetadata;
import com.facebook.inspiration.composer.smartgallery.model.SingleStackingMediaStatusInfo;
import com.facebook.inspiration.model.InspirationState;
import com.facebook.inspiration.model.InspirationTTSVoiceType;
import com.facebook.inspiration.model.InspirationTimelineEditorBackupData;
import com.facebook.inspiration.model.InspirationVideoEditingData;
import com.facebook.ipc.composer.model.ComposerLocation;
import com.facebook.ipc.locationcomponents.locationpicker.model.LocationPickerResultLocation;
import com.facebook.photos.creativeediting.model.VideoTrimParams;
import com.facebook.photos.creativeediting.model.audio.AudioTrackParams;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N4G.class */
public final class N4G {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public CrossPostingMetadata A08;
    public SingleStackingMediaStatusInfo A09;
    public MfV A0A;
    public EnumC3473Mer A0B;
    public EnumC3474Mes A0C;
    public EnumC3485Mf3 A0D;
    public EnumC3486Mf5 A0E;
    public InspirationTTSVoiceType A0F;
    public InspirationTimelineEditorBackupData A0G;
    public InspirationVideoEditingData A0H;
    public ComposerLocation A0I;
    public LocationPickerResultLocation A0J;
    public VideoTrimParams A0K;
    public AudioTrackParams A0L;
    public ImmutableList A0M;
    public ImmutableList A0N;
    public ImmutableList A0O;
    public ImmutableMap A0P;
    public ImmutableMap A0Q;
    public ImmutableMap A0R;
    public Boolean A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public Set A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
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

    public N4G() {
        this.A0a = AnonymousClass001.A0v();
        this.A0M = ImmutableList.of();
        this.A0N = ImmutableList.of();
        this.A04 = 0;
        this.A0V = "unknown";
        this.A0l = true;
        this.A10 = true;
        this.A05 = 0;
        this.A00 = 0.5f;
        this.A01 = 0.75f;
        this.A0W = "unknown";
        this.A02 = 1.0f;
        this.A0O = ImmutableList.of();
        this.A07 = 0;
    }

    public N4G(NAo nAo) {
        this.A0a = AnonymousClass001.A0v();
        nAo.getClass();
        if (nAo instanceof InspirationState) {
            InspirationState inspirationState = (InspirationState) nAo;
            this.A0T = inspirationState.A0T;
            this.A0B = inspirationState.A0B;
            this.A0P = inspirationState.A0P;
            this.A0L = inspirationState.A0L;
            this.A0K = inspirationState.A0K;
            this.A0M = inspirationState.A0M;
            this.A0N = inspirationState.A0N;
            this.A03 = inspirationState.A03;
            this.A04 = inspirationState.A04;
            this.A0C = inspirationState.A0C;
            this.A0U = inspirationState.A0U;
            this.A0V = inspirationState.A0V;
            this.A0A = inspirationState.A0A;
            A00(this, inspirationState);
            A01(this, inspirationState, inspirationState.A0p);
            this.A0W = inspirationState.A0W;
            this.A0D = inspirationState.A0D;
            this.A02 = inspirationState.A02;
            this.A06 = inspirationState.A06;
            this.A19 = inspirationState.A19;
            this.A1A = inspirationState.A1A;
            this.A1B = inspirationState.A1B;
            this.A1C = inspirationState.A1C;
            this.A09 = inspirationState.A09;
            this.A0O = inspirationState.A0O;
            this.A0X = inspirationState.A0X;
            this.A0G = inspirationState.A0G;
            this.A07 = inspirationState.A07;
            this.A0F = inspirationState.A0F;
            this.A0Y = inspirationState.A0Y;
            this.A0Z = inspirationState.A0Z;
            this.A0H = inspirationState.A0H;
            this.A0E = inspirationState.A0E;
            this.A08 = inspirationState.A08;
            this.A0a = AbF.A1E(inspirationState.A0a);
            return;
        }
        InspirationState inspirationState2 = (InspirationState) nAo;
        this.A0T = inspirationState2.A0T;
        this.A0B = inspirationState2.A0B;
        this.A0P = inspirationState2.A0P;
        this.A0L = inspirationState2.A0L;
        this.A0K = inspirationState2.A0K;
        ImmutableList immutableList = inspirationState2.A0M;
        this.A0M = immutableList;
        C1pq.A08("cameraAddYoursTemplateOverlayParams", immutableList);
        A08(inspirationState2.A0N);
        this.A03 = inspirationState2.A03;
        this.A04 = inspirationState2.A04;
        this.A0C = inspirationState2.A0C;
        this.A0U = inspirationState2.A0U;
        A0A(inspirationState2.A0V);
        A04(nAo.AnE());
        A00(this, inspirationState2);
        A01(this, inspirationState2, inspirationState2.A0p);
        A0B(inspirationState2.A0W);
        A05(nAo.AyW());
        this.A02 = inspirationState2.A02;
        this.A06 = inspirationState2.A06;
        this.A19 = inspirationState2.A19;
        this.A1A = inspirationState2.A1A;
        this.A1B = inspirationState2.A1B;
        this.A1C = inspirationState2.A1C;
        this.A09 = inspirationState2.A09;
        A09(inspirationState2.A0O);
        this.A0X = inspirationState2.A0X;
        this.A0G = inspirationState2.A0G;
        this.A07 = inspirationState2.A07;
        A07(nAo.BHK());
        this.A0Y = inspirationState2.A0Y;
        this.A0Z = inspirationState2.A0Z;
        this.A0H = inspirationState2.A0H;
        A06(nAo.BJS());
        this.A08 = inspirationState2.A08;
    }

    public static void A00(N4G n4g, InspirationState inspirationState) {
        n4g.A0b = inspirationState.A0b;
        n4g.A0c = inspirationState.A0c;
        n4g.A0Q = inspirationState.A0Q;
        n4g.A0R = inspirationState.A0R;
        n4g.A0d = inspirationState.A0d;
        n4g.A0e = inspirationState.A0e;
        n4g.A0f = inspirationState.A0f;
        n4g.A0g = inspirationState.A0g;
        n4g.A0h = inspirationState.A0h;
        n4g.A0i = inspirationState.A0i;
        n4g.A0j = inspirationState.A0j;
        n4g.A0k = inspirationState.A0k;
        n4g.A0l = inspirationState.A0l;
        n4g.A0m = inspirationState.A0m;
        n4g.A0n = inspirationState.A0n;
        n4g.A0o = inspirationState.A0o;
    }

    public static void A01(N4G n4g, InspirationState inspirationState, boolean z) {
        n4g.A0p = z;
        n4g.A0q = inspirationState.A0q;
        n4g.A0r = inspirationState.A0r;
        n4g.A0s = inspirationState.A0s;
        n4g.A0t = inspirationState.A0t;
        n4g.A0u = inspirationState.A0u;
        n4g.A0v = inspirationState.A0v;
        n4g.A0w = inspirationState.A0w;
        n4g.A0x = inspirationState.A0x;
        n4g.A0y = inspirationState.A0y;
        n4g.A0z = inspirationState.A0z;
        n4g.A10 = inspirationState.A10;
        n4g.A11 = inspirationState.A11;
        n4g.A12 = inspirationState.A12;
        n4g.A13 = inspirationState.A13;
        n4g.A14 = inspirationState.A14;
        n4g.A15 = inspirationState.A15;
        n4g.A16 = inspirationState.A16;
        n4g.A17 = inspirationState.A17;
        n4g.A18 = inspirationState.A18;
        n4g.A0I = inspirationState.A0I;
        n4g.A0S = inspirationState.A0S;
        n4g.A0J = inspirationState.A0J;
        n4g.A05 = inspirationState.A05;
        n4g.A00 = inspirationState.A00;
        n4g.A01 = inspirationState.A01;
    }

    public static void A02(N4G n4g, String str) {
        if (n4g.A0a.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(n4g.A0a);
        n4g.A0a = A1E;
        A1E.add(str);
    }

    public final void A03() {
        A04(MfV.A0l);
    }

    public void A04(MfV mfV) {
        this.A0A = mfV;
        C1pq.A08("formatMode", mfV);
        A02(this, "formatMode");
    }

    public void A05(EnumC3485Mf3 enumC3485Mf3) {
        this.A0D = enumC3485Mf3;
        C1pq.A08("musicSource", enumC3485Mf3);
        A02(this, "musicSource");
    }

    public void A06(EnumC3486Mf5 enumC3486Mf5) {
        this.A0E = enumC3486Mf5;
        C1pq.A08("videoLengthState", enumC3486Mf5);
        A02(this, "videoLengthState");
    }

    public void A07(InspirationTTSVoiceType inspirationTTSVoiceType) {
        this.A0F = inspirationTTSVoiceType;
        C1pq.A08("ttsVoiceType", inspirationTTSVoiceType);
        A02(this, "ttsVoiceType");
    }

    public void A08(ImmutableList immutableList) {
        this.A0N = immutableList;
        C1pq.A08("cameraMovableOverlayParams", immutableList);
    }

    public void A09(ImmutableList immutableList) {
        this.A0O = immutableList;
        C1pq.A08("taggedPeopleBackup", immutableList);
    }

    public void A0A(String str) {
        this.A0V = str;
        C1pq.A08("formatChangeReason", str);
    }

    public void A0B(String str) {
        this.A0W = str;
        C1pq.A08("musicEditingEntry", str);
    }
}
