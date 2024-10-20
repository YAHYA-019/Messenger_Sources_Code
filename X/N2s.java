package X;

import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import com.facebook.inspiration.model.movableoverlay.music.InspirationMusicStickerInfo;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N2s.class */
public final class N2s {
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public InspirationOverlayPosition A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public Set A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;

    public N2s() {
        this.A0K = AnonymousClass001.A0v();
        this.A0A = "";
        this.A0B = "";
        this.A0E = "";
        this.A04 = 0;
        this.A05 = -1;
        this.A0I = "";
        this.A0J = "";
    }

    public N2s(InspirationMusicStickerInfo inspirationMusicStickerInfo) {
        this.A0K = AnonymousClass001.A0v();
        this.A0A = inspirationMusicStickerInfo.A0A;
        this.A0B = inspirationMusicStickerInfo.A0B;
        this.A01 = inspirationMusicStickerInfo.A01;
        this.A02 = inspirationMusicStickerInfo.A02;
        this.A0C = inspirationMusicStickerInfo.A0C;
        this.A03 = inspirationMusicStickerInfo.A03;
        this.A0L = inspirationMusicStickerInfo.A0L;
        this.A0M = inspirationMusicStickerInfo.A0M;
        this.A0N = inspirationMusicStickerInfo.A0N;
        this.A0O = inspirationMusicStickerInfo.A0O;
        this.A0P = inspirationMusicStickerInfo.A0P;
        this.A0D = inspirationMusicStickerInfo.A0D;
        this.A0E = inspirationMusicStickerInfo.A0E;
        this.A04 = inspirationMusicStickerInfo.A04;
        this.A05 = inspirationMusicStickerInfo.A05;
        this.A06 = inspirationMusicStickerInfo.A06;
        this.A0F = inspirationMusicStickerInfo.A0F;
        this.A07 = inspirationMusicStickerInfo.A07;
        this.A0G = inspirationMusicStickerInfo.A0G;
        this.A08 = inspirationMusicStickerInfo.A08;
        this.A0H = inspirationMusicStickerInfo.A0H;
        this.A09 = inspirationMusicStickerInfo.A09;
        this.A00 = inspirationMusicStickerInfo.A00;
        this.A0I = inspirationMusicStickerInfo.A0I;
        this.A0J = inspirationMusicStickerInfo.A0J;
        this.A0K = AbF.A1E(inspirationMusicStickerInfo.A0K);
    }

    public void A00(InspirationOverlayPosition inspirationOverlayPosition) {
        this.A09 = inspirationOverlayPosition;
        C1pq.A08("overlayPosition", inspirationOverlayPosition);
        if (this.A0K.contains("overlayPosition")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0K);
        this.A0K = A1E;
        A1E.add("overlayPosition");
    }

    public void A01(String str) {
        this.A0B = str;
        C1pq.A08("artistName", str);
    }

    public void A02(String str) {
        this.A0I = str;
        C1pq.A08("songTitle", str);
    }
}
