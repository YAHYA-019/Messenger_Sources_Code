package X;

import com.facebook.inspiration.capture.multicapture.remix.model.InspirationRemixData;
import com.facebook.inspiration.model.ClipZoomCropParamsBackup;
import com.facebook.inspiration.model.InspirationFbShortsGallerySelectedMediasModel;
import com.facebook.inspiration.model.InspirationMultiCaptureState;
import com.facebook.inspiration.model.InspirationVideoSegment;
import com.facebook.inspiration.model.InspirationVideoTemplate;
import com.facebook.inspiration.model.SoundSyncState;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N40.class */
public final class N40 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public InspirationRemixData A07;
    public ClipZoomCropParamsBackup A08;
    public QpO A09;
    public InspirationFbShortsGallerySelectedMediasModel A0A;
    public InspirationVideoSegment A0B;
    public InspirationVideoTemplate A0C;
    public SoundSyncState A0D;
    public MediaData A0E;
    public MusicTrackParams A0F;
    public ImmutableList A0G;
    public ImmutableList A0H;
    public ImmutableList A0I;
    public ImmutableList A0J;
    public String A0K;
    public Set A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;

    public N40() {
        this.A0L = AnonymousClass001.A0v();
        this.A0H = ImmutableList.of();
        this.A01 = -1;
        this.A02 = -1;
        this.A03 = -1;
        this.A05 = 0;
        this.A0J = ImmutableList.of();
    }

    public N40(NAn nAn) {
        this.A0L = AnonymousClass001.A0v();
        nAn.getClass();
        if (nAn instanceof InspirationMultiCaptureState) {
            InspirationMultiCaptureState inspirationMultiCaptureState = (InspirationMultiCaptureState) nAn;
            this.A0G = inspirationMultiCaptureState.A0G;
            this.A0B = inspirationMultiCaptureState.A0B;
            this.A09 = inspirationMultiCaptureState.A09;
            this.A08 = inspirationMultiCaptureState.A08;
            this.A0F = inspirationMultiCaptureState.A0F;
            this.A0C = inspirationMultiCaptureState.A0C;
            this.A0A = inspirationMultiCaptureState.A0A;
            this.A0M = inspirationMultiCaptureState.A0M;
            this.A00 = inspirationMultiCaptureState.A00;
            this.A0N = inspirationMultiCaptureState.A0N;
            this.A0O = inspirationMultiCaptureState.A0O;
            this.A0H = inspirationMultiCaptureState.A0H;
            A01(this, inspirationMultiCaptureState);
            this.A07 = inspirationMultiCaptureState.A07;
            A00(this, inspirationMultiCaptureState);
            this.A0J = inspirationMultiCaptureState.A0J;
            this.A0L = AbF.A1E(inspirationMultiCaptureState.A0L);
            return;
        }
        InspirationMultiCaptureState inspirationMultiCaptureState2 = (InspirationMultiCaptureState) nAn;
        this.A0G = inspirationMultiCaptureState2.A0G;
        this.A0B = inspirationMultiCaptureState2.A0B;
        A03(nAn.AYB());
        this.A08 = inspirationMultiCaptureState2.A08;
        this.A0F = inspirationMultiCaptureState2.A0F;
        this.A0C = inspirationMultiCaptureState2.A0C;
        this.A0A = inspirationMultiCaptureState2.A0A;
        this.A0M = inspirationMultiCaptureState2.A0M;
        this.A00 = inspirationMultiCaptureState2.A00;
        this.A0N = inspirationMultiCaptureState2.A0N;
        this.A0O = inspirationMultiCaptureState2.A0O;
        ImmutableList immutableList = inspirationMultiCaptureState2.A0H;
        this.A0H = immutableList;
        C1pq.A08("igluEffects", immutableList);
        A01(this, inspirationMultiCaptureState2);
        A02(nAn.B6n());
        A00(this, inspirationMultiCaptureState2);
        A04(inspirationMultiCaptureState2.A0J);
    }

    public static void A00(N40 n40, InspirationMultiCaptureState inspirationMultiCaptureState) {
        n40.A01 = inspirationMultiCaptureState.A01;
        n40.A02 = inspirationMultiCaptureState.A02;
        n40.A03 = inspirationMultiCaptureState.A03;
        n40.A0Z = inspirationMultiCaptureState.A0Z;
        n40.A04 = inspirationMultiCaptureState.A04;
        n40.A0D = inspirationMultiCaptureState.A0D;
        n40.A0E = inspirationMultiCaptureState.A0E;
        n40.A05 = inspirationMultiCaptureState.A05;
        n40.A06 = inspirationMultiCaptureState.A06;
        n40.A0I = inspirationMultiCaptureState.A0I;
    }

    public static void A01(N40 n40, InspirationMultiCaptureState inspirationMultiCaptureState) {
        n40.A0P = inspirationMultiCaptureState.A0P;
        n40.A0Q = inspirationMultiCaptureState.A0Q;
        n40.A0R = inspirationMultiCaptureState.A0R;
        n40.A0S = inspirationMultiCaptureState.A0S;
        n40.A0T = inspirationMultiCaptureState.A0T;
        n40.A0U = inspirationMultiCaptureState.A0U;
        n40.A0V = inspirationMultiCaptureState.A0V;
        n40.A0W = inspirationMultiCaptureState.A0W;
        n40.A0X = inspirationMultiCaptureState.A0X;
        n40.A0Y = inspirationMultiCaptureState.A0Y;
        n40.A0K = inspirationMultiCaptureState.A0K;
    }

    public void A02(InspirationRemixData inspirationRemixData) {
        this.A07 = inspirationRemixData;
        C1pq.A08("remixData", inspirationRemixData);
        if (this.A0L.contains("remixData")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0L);
        this.A0L = A1E;
        A1E.add("remixData");
    }

    public void A03(QpO qpO) {
        this.A09 = qpO;
        C1pq.A08("autoAddMusicPillState", qpO);
        if (this.A0L.contains("autoAddMusicPillState")) {
            return;
        }
        HashSet A1E = AbF.A1E(this.A0L);
        this.A0L = A1E;
        A1E.add("autoAddMusicPillState");
    }

    public void A04(ImmutableList immutableList) {
        this.A0J = immutableList;
        C1pq.A08("videoSegments", immutableList);
    }
}
