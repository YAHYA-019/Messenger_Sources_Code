package X;

/* loaded from: Hnp.class */
public final class Hnp {
    public final Integer A00;
    public final Long A01;

    public Hnp(Integer num, Long l) {
        this.A00 = num;
        this.A01 = l;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioVideoConfig{audioSampleRateHz=");
        A0k.append((Object) null);
        A0k.append(", recordWithoutEffects=");
        A0k.append((Object) null);
        A0k.append(", motionFactor=");
        A0k.append(this.A00);
        A0k.append(", maximumDurationUs=");
        A0k.append(this.A01);
        A0k.append(", bitrate=");
        A0k.append((Object) null);
        A0k.append(", deviceOutputType=");
        A0k.append((Object) null);
        A0k.append(", customVideoFrameRate=");
        A0k.append((Object) null);
        A0k.append(", enableOrientation=");
        A0k.append((Object) null);
        A0k.append(", enableNativeVideoRecording=");
        A0k.append((Object) null);
        A0k.append(", videoMimeType=");
        A0k.append((String) null);
        A0k.append(", muxingFormat=");
        A0k.append((Object) null);
        A0k.append(", aacProfile=");
        A0k.append((Object) null);
        A0k.append(", useSupernovaCustomAudio=");
        A0k.append((Object) null);
        A0k.append(", useRealTimeBasedPresentationTimeCounting=");
        A0k.append((Object) null);
        return AnonymousClass001.A0f(A0k);
    }
}
