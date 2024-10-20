package X;

import android.media.MediaFormat;
import com.facebook.libyuv.YUVColorConverter;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.List;

/* loaded from: Ij9.class */
public final class Ij9 implements JNU {
    public static final ImmutableSet A03 = ImmutableSet.A02(21, 19);
    public final I6y A02 = (I6y) 1Bi.A03(116365);
    public final JL0 A00 = (JL0) 1Bn.A0A(116360);
    public final YUVColorConverter A01 = (YUVColorConverter) 1Bi.A03(116357);

    public IiB AMo(long j) {
        throw AnonymousClass001.A0Q("dequeueNextInputBuffer");
    }

    public IiB AMq(long j) {
        throw AnonymousClass001.A0Q("dequeueNextOutputBuffer");
    }

    public String Agm() {
        return null;
    }

    public String Ajl() {
        return null;
    }

    public double AnW() {
        return 0.0d;
    }

    public MediaFormat B0h() {
        return null;
    }

    public int B0n() {
        throw AnonymousClass001.A0Q("targetRotationDegreesClockwise");
    }

    public boolean BWq() {
        return false;
    }

    public void CYm(MediaFormat mediaFormat) {
        mediaFormat.getString("mime");
        Preconditions.checkState(false);
        throw 0Q8.createAndThrow();
    }

    public void CYn(MediaFormat mediaFormat, List list) {
        CYm(mediaFormat);
        throw 0Q8.createAndThrow();
    }

    public void CYp(7Xo r302) {
        Preconditions.checkState(false);
        throw 0Q8.createAndThrow();
    }

    public void Cae(IiB iiB) {
        throw AnonymousClass001.A0Q("queueInputBuffer");
    }

    public void Ccs(IiB iiB) {
        throw AnonymousClass001.A0Q("releaseOutputBuffer");
    }

    public void D4n(long j) {
        C00j.A05("readNextFrame", -1106586432);
        try {
            throw AnonymousClass001.A0Q("readNextFrame");
        } catch (Throwable th) {
            C00j.A01(-1603323287);
            throw th;
        }
    }

    public void finish() {
    }

    public void release() {
    }
}
