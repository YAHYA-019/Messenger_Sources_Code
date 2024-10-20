package X;

import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: I87.class */
public final class I87 {
    public final C00i A00 = 1BQ.A01();
    public static final ImmutableSet A02 = ImmutableSet.A02("video/avc", "video/mp4");
    public static final ImmutableSet A01 = ImmutableSet.A04("audio/3gpp", "audio/amr-wb", "audio/mp4a", "audio/vorbis");

    public static String A00(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0s.add(((HfE) it.next()).A02);
        }
        return 0Pz.A0E(list.size(), "", " tracks: ", new Joiner(", ").join(A0s));
    }

    public HfE A01(FFMpegMediaDemuxer fFMpegMediaDemuxer) {
        HfE hfE;
        ArrayList A0s = AnonymousClass001.A0s();
        int trackCount = fFMpegMediaDemuxer.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            FFMpegMediaFormat trackFormat = fFMpegMediaDemuxer.getTrackFormat(i);
            String A0b = AnonymousClass001.A0b("mime", trackFormat.mMap);
            if (A0b != null && A0b.startsWith("audio/")) {
                A0s.add(new HfE(trackFormat, A0b, i));
            }
        }
        if (!A0s.isEmpty()) {
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                hfE = (HfE) it.next();
                if (A01.contains(hfE.A02)) {
                    if (A0s.size() > 1) {
                        1BK.A09(this.A00).D0v("FFMpegBasedVideoTrackExtractor_multiple_audio_tracks", A00(A0s));
                        return hfE;
                    }
                }
            }
            throw new Exception(0Pz.A0W("Unsupported audio codec. Contained ", A00(A0s)));
        }
        hfE = null;
        return hfE;
    }
}
