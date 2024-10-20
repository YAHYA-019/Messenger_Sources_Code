package X;

import com.facebook.graphql.enums.GraphQLInspirationsAccountSettingsSaveSource;
import com.facebook.graphql.enums.GraphQLXFBMusicPickerSongMonetizationInfo;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.google.common.collect.ImmutableList;

/* loaded from: N43.class */
public final class N43 {
    public static volatile MqB A0r;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public EQi A0G;
    public GraphQLInspirationsAccountSettingsSaveSource A0H;
    public GraphQLXFBMusicPickerSongMonetizationInfo A0I;
    public ImmutableList A0J;
    public ImmutableList A0K;
    public ImmutableList A0L;
    public Long A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
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

    public N43() {
        this.A0J = ImmutableList.of();
        this.A0O = "";
        this.A0P = "";
        this.A03 = 0;
        this.A0Q = "";
        this.A04 = -1;
        this.A05 = -1;
        this.A0V = "";
        this.A0W = "";
        this.A07 = -1;
        this.A08 = -1;
        this.A0B = -1;
        this.A0C = -1;
        this.A0D = -1;
        this.A0c = "";
    }

    public N43(NAk nAk) {
        MusicTrackParams musicTrackParams;
        nAk.getClass();
        if (nAk instanceof MusicTrackParams) {
            musicTrackParams = (MusicTrackParams) nAk;
            this.A0N = musicTrackParams.A0N;
            this.A0J = musicTrackParams.A0J;
            this.A0K = musicTrackParams.A0K;
            this.A0O = musicTrackParams.A0O;
            this.A0P = musicTrackParams.A0P;
            this.A03 = musicTrackParams.A03;
            this.A0Q = musicTrackParams.A0Q;
            A00(this, musicTrackParams);
            this.A0V = musicTrackParams.A0V;
            this.A0L = musicTrackParams.A0L;
            this.A00 = musicTrackParams.A00;
            this.A0W = musicTrackParams.A0W;
            A01(this, musicTrackParams);
            this.A0H = musicTrackParams.A0H;
            this.A0a = musicTrackParams.A0a;
            this.A0M = musicTrackParams.A0M;
            this.A0q = musicTrackParams.A0q;
            this.A0b = musicTrackParams.A0b;
            this.A0I = musicTrackParams.A0I;
            this.A0c = musicTrackParams.A0c;
        } else {
            musicTrackParams = (MusicTrackParams) nAk;
            this.A0N = musicTrackParams.A0N;
            A04(musicTrackParams.A0J);
            this.A0K = musicTrackParams.A0K;
            A05(musicTrackParams.A0O);
            A06(musicTrackParams.A0P);
            this.A03 = musicTrackParams.A03;
            String str = musicTrackParams.A0Q;
            this.A0Q = str;
            C1pq.A08("browseSessionId", str);
            A00(this, musicTrackParams);
            A07(musicTrackParams.A0V);
            this.A0L = musicTrackParams.A0L;
            this.A00 = musicTrackParams.A00;
            A02(musicTrackParams.A0W);
            A01(this, musicTrackParams);
            this.A0H = musicTrackParams.A0H;
            this.A0a = musicTrackParams.A0a;
            this.A0M = musicTrackParams.A0M;
            this.A0q = musicTrackParams.A0q;
            this.A0b = musicTrackParams.A0b;
            this.A0I = musicTrackParams.A0I;
            A08(musicTrackParams.A0c);
        }
        this.A0d = musicTrackParams.A0d;
        this.A0E = musicTrackParams.A0E;
        this.A0F = musicTrackParams.A0F;
        this.A02 = musicTrackParams.A02;
    }

    public static void A00(N43 n43, MusicTrackParams musicTrackParams) {
        n43.A04 = musicTrackParams.A04;
        n43.A0R = musicTrackParams.A0R;
        n43.A0S = musicTrackParams.A0S;
        n43.A0T = musicTrackParams.A0T;
        n43.A0e = musicTrackParams.A0e;
        n43.A05 = musicTrackParams.A05;
        n43.A06 = musicTrackParams.A06;
        n43.A0f = musicTrackParams.A0f;
        n43.A0g = musicTrackParams.A0g;
        n43.A0h = musicTrackParams.A0h;
        n43.A0i = musicTrackParams.A0i;
        n43.A0j = musicTrackParams.A0j;
        n43.A0k = musicTrackParams.A0k;
        n43.A0l = musicTrackParams.A0l;
        n43.A0m = musicTrackParams.A0m;
        n43.A0n = musicTrackParams.A0n;
        n43.A0o = musicTrackParams.A0o;
        n43.A0p = musicTrackParams.A0p;
        n43.A0U = musicTrackParams.A0U;
    }

    public static void A01(N43 n43, MusicTrackParams musicTrackParams) {
        n43.A0G = musicTrackParams.A0G;
        n43.A07 = musicTrackParams.A07;
        n43.A08 = musicTrackParams.A08;
        n43.A09 = musicTrackParams.A09;
        n43.A0A = musicTrackParams.A0A;
        n43.A0X = musicTrackParams.A0X;
        n43.A0B = musicTrackParams.A0B;
        n43.A0C = musicTrackParams.A0C;
        n43.A0Y = musicTrackParams.A0Y;
        n43.A0D = musicTrackParams.A0D;
        n43.A0Z = musicTrackParams.A0Z;
        n43.A01 = musicTrackParams.A01;
    }

    public N43 A02(String str) {
        this.A0W = str;
        C1pq.A08("musicPickerMode", str);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.MqB, java.lang.Object] */
    public void A03(int i) {
        if (A0r == null) {
            synchronized (this) {
                if (A0r == null) {
                    A0r = new Object();
                }
            }
        }
        if (i <= 0) {
            ((C01s) 1Bi.A03(16511)).D0v("MusicTrackParamsSpec-MusicTrackDurationInMsPreprocessor-IllegalDuration", 0Pz.A0T("value=", i));
        }
        this.A08 = Integer.valueOf(i).intValue();
    }

    public void A04(ImmutableList immutableList) {
        this.A0J = immutableList;
        C1pq.A08("allHighlightTimesInMs", immutableList);
    }

    public void A05(String str) {
        this.A0O = str;
        C1pq.A08("artistName", str);
    }

    public void A06(String str) {
        this.A0P = str;
        C1pq.A08("audioLibraryProduct", str);
    }

    public void A07(String str) {
        this.A0V = str;
        C1pq.A08("musicAssetId", str);
    }

    public void A08(String str) {
        this.A0c = str;
        C1pq.A08("title", str);
    }

    public /* bridge */ /* synthetic */ void A09(String str) {
        this.A0Q = str;
        C1pq.A08("browseSessionId", str);
    }
}
