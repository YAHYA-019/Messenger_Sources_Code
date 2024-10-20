package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;

/* loaded from: JN3.class */
public interface JN3 {
    void addEffect(MediaEffect mediaEffect);

    void addEffect(Integer num, MediaEffect mediaEffect);

    void configure(HfF hfF);

    void disableTrack(int i);

    void enableTrack(int i);

    int getWarmupDurationInSec();

    boolean isEffectSupported(MediaEffect mediaEffect);

    ByteBuffer process(ByteBuffer[] byteBufferArr, long j);

    void removeEffect(MediaEffect mediaEffect);

    void removeEffect(Integer num, MediaEffect mediaEffect);

    void warmup(ByteBuffer[] byteBufferArr, long j);
}
