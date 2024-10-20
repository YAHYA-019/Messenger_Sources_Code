package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: Lan.class */
public final class Lan implements 6bI {
    public 6bI A00;
    public Lal A01;
    public String A02;

    public void AHL(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i) {
        this.A00.AHL(mediaCrypto, mediaFormat, surface, obj, 0);
    }

    public int AMn() {
        return this.A00.AMn();
    }

    public int AMt(MediaCodec.BufferInfo bufferInfo) {
        return this.A00.AMt(bufferInfo);
    }

    public ByteBuffer Aqp(int i) {
        return this.A00.Aqp(i);
    }

    public ByteBuffer B0f(int i) {
        return this.A00.B0f(i);
    }

    public MediaFormat B0h() {
        return this.A00.B0h();
    }

    public Pair B2T() {
        return this.A00.B2T();
    }

    public int BGW() {
        return this.A00.BGW();
    }

    public boolean BVY(int i) {
        return this.A00.BVY(i);
    }

    public boolean Bf5() {
        return this.A00.Bf5();
    }

    public void Cad(int i, int i2, int i3, long j, int i4) {
        this.A00.Cad(i, 0, i3, j, i4);
    }

    public void Cah(6WF r302, int i, int i2, int i3, long j) {
        this.A00.Cah(r302, i, 0, 0, j);
    }

    public void Ccq(int i, long j) {
        this.A00.Ccq(i, j);
    }

    public void Ccr(int i, boolean z) {
        this.A00.Ccr(i, false);
    }

    public void Crs(Handler handler, MFw mFw) {
        this.A00.Crs(handler, mFw);
    }

    public void CsA(Surface surface) {
        this.A00.CsA(surface);
    }

    public void CsH(Bundle bundle) {
        this.A00.CsH(bundle);
    }

    public void CwO(int i) {
        this.A00.CwO(i);
    }

    public void flush() {
        this.A00.flush();
    }

    public void release() {
        Lal lal = this.A01;
        6bI r0 = this.A00;
        String str = this.A02;
        C5ho c5ho = C5ho.A06;
        boolean z = lal.A02;
        c5ho.A02(lal.A00.A00, lal.A01, r0, 0S2.A01, str, z);
    }

    public void reset() {
        this.A00.reset();
    }

    public void start() {
        this.A00.start();
    }

    public void stop() {
        this.A00.stop();
    }
}
