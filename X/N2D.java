package X;

import com.facebook.inspiration.audiosharing.model.AudioTranscriptionParam;
import com.facebook.inspiration.model.InspirationVideoEditingData;
import com.facebook.photos.creativeediting.model.MusicTrackParams;
import com.facebook.photos.creativeediting.model.VideoTrimParams;
import com.facebook.photos.creativeediting.model.audio.AudioTrackParams;

/* loaded from: N2D.class */
public final class N2D {
    public AudioTranscriptionParam A00;
    public MusicTrackParams A01;
    public VideoTrimParams A02;
    public AudioTrackParams A03;
    public AudioTrackParams A04;
    public Float A05;
    public Float A06;
    public boolean A07;
    public boolean A08;

    public N2D() {
    }

    public N2D(NAj nAj) {
        nAj.getClass();
        InspirationVideoEditingData inspirationVideoEditingData = (InspirationVideoEditingData) nAj;
        this.A05 = inspirationVideoEditingData.A05;
        this.A03 = inspirationVideoEditingData.A03;
        this.A00 = inspirationVideoEditingData.A00;
        this.A07 = inspirationVideoEditingData.A07;
        this.A08 = inspirationVideoEditingData.A08;
        this.A01 = inspirationVideoEditingData.A01;
        this.A04 = inspirationVideoEditingData.A04;
        this.A02 = inspirationVideoEditingData.A02;
        this.A06 = inspirationVideoEditingData.A06;
    }
}
