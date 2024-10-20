package X;

import com.facebook.inspiration.audiosharing.model.AudioTranscriptionParam;
import com.facebook.inspiration.model.InspirationEffectWithSource;
import com.facebook.inspiration.model.InspirationVideoSegment;
import com.facebook.inspiration.model.VideoSegmentContext;
import com.facebook.ipc.inspiration.model.zoomcrop.InspirationZoomCropParams;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.ipc.media.data.metaverse.MetaGalleryMetadata;
import com.facebook.photos.creativeediting.model.VideoTrimParams;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: N3R.class */
public final class N3R {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public AudioTranscriptionParam A04;
    public InspirationEffectWithSource A05;
    public EMG A06;
    public VideoSegmentContext A07;
    public InspirationZoomCropParams A08;
    public InspirationZoomCropParams A09;
    public InspirationZoomCropParams A0A;
    public MediaData A0B;
    public MediaData A0C;
    public MediaData A0D;
    public MetaGalleryMetadata A0E;
    public VideoTrimParams A0F;
    public VideoTrimParams A0G;
    public ImmutableList A0H;
    public Boolean A0I;
    public Integer A0J;
    public Integer A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public Set A0O;
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

    public N3R() {
        this.A0O = AnonymousClass001.A0v();
        this.A01 = -1;
        this.A00 = 1.0f;
        this.A0Q = true;
        this.A0H = ImmutableList.of();
    }

    public N3R(InspirationVideoSegment inspirationVideoSegment) {
        this.A0O = AnonymousClass001.A0v();
        inspirationVideoSegment.getClass();
        this.A04 = inspirationVideoSegment.A04;
        this.A01 = inspirationVideoSegment.A01;
        this.A08 = inspirationVideoSegment.A08;
        this.A00 = inspirationVideoSegment.A00;
        this.A0B = inspirationVideoSegment.A0B;
        this.A0P = inspirationVideoSegment.A0P;
        this.A0L = inspirationVideoSegment.A0L;
        this.A0Q = inspirationVideoSegment.A0Q;
        this.A06 = inspirationVideoSegment.A06;
        this.A0R = inspirationVideoSegment.A0R;
        this.A0S = inspirationVideoSegment.A0S;
        this.A0I = inspirationVideoSegment.A0I;
        this.A0T = inspirationVideoSegment.A0T;
        this.A0U = inspirationVideoSegment.A0U;
        this.A0V = inspirationVideoSegment.A0V;
        this.A0W = inspirationVideoSegment.A0W;
        this.A0X = inspirationVideoSegment.A0X;
        this.A0Y = inspirationVideoSegment.A0Y;
        this.A0Z = inspirationVideoSegment.A0Z;
        this.A0C = inspirationVideoSegment.A0C;
        this.A0D = inspirationVideoSegment.A0D;
        this.A09 = inspirationVideoSegment.A09;
        this.A05 = inspirationVideoSegment.A05;
        this.A0F = inspirationVideoSegment.A0F;
        this.A0J = inspirationVideoSegment.A0J;
        this.A0K = inspirationVideoSegment.A0K;
        this.A0M = inspirationVideoSegment.A0M;
        this.A0N = inspirationVideoSegment.A0N;
        this.A02 = inspirationVideoSegment.A02;
        this.A03 = inspirationVideoSegment.A03;
        this.A0H = inspirationVideoSegment.A0H;
        this.A0E = inspirationVideoSegment.A0E;
        this.A07 = inspirationVideoSegment.A07;
        this.A0G = inspirationVideoSegment.A0G;
        this.A0A = inspirationVideoSegment.A0A;
        this.A0O = AbF.A1E(inspirationVideoSegment.A0O);
    }

    public static void A00(N3R n3r, String str) {
        if (n3r.A0O.contains(str)) {
            return;
        }
        HashSet A1E = AbF.A1E(n3r.A0O);
        n3r.A0O = A1E;
        A1E.add(str);
    }

    public N3R A01(VideoSegmentContext videoSegmentContext) {
        this.A07 = videoSegmentContext;
        C1pq.A08("videoSegmentContext", videoSegmentContext);
        A00(this, "videoSegmentContext");
        return this;
    }

    public /* bridge */ /* synthetic */ void A02(EMG emg) {
        this.A06 = emg;
        C1pq.A08("inspirationMediaSource", emg);
        A00(this, "inspirationMediaSource");
    }

    public void A03(MediaData mediaData) {
        this.A0C = mediaData;
        C1pq.A08("mediaData", mediaData);
        A00(this, "mediaData");
    }
}
