package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: Ik0.class */
public final class Ik0 implements JNR {
    public final /* synthetic */ Ik3 A00;

    public Ik0(Ik3 ik3) {
        this.A00 = ik3;
    }

    public void A5a(MediaEffect mediaEffect, int i) {
    }

    public void A7a(int i) {
    }

    public IjV AMr(long j) {
        Ik3 ik3 = this.A00;
        if (ik3.A08) {
            ik3.A08 = false;
            IjV ijV = new IjV(-1, (ByteBuffer) null, new MediaCodec.BufferInfo());
            ijV.A01 = true;
            return ijV;
        }
        if (!ik3.A07) {
            ik3.A07 = true;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = ik3.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                ik3.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            IjV ijV2 = new IjV(0, allocateDirect, new MediaCodec.BufferInfo());
            MediaFormat mediaFormat = ik3.A00;
            mediaFormat.getClass();
            if (R3j.A00(mediaFormat, ijV2)) {
                return ijV2;
            }
        }
        return (IjV) ik3.A05.poll(250000L, TimeUnit.MICROSECONDS);
    }

    public void ANx(long j) {
        Ik3 ik3 = this.A00;
        IjV ijV = ik3.A01;
        if (ijV != null) {
            ijV.A00.presentationTimeUs = j;
            ik3.A05.offer(ijV);
            ik3.A01 = null;
        }
    }

    public String Ajl() {
        return "VideoTranscoderPassThrough";
    }

    public MediaFormat B0h() {
        try {
            this.A00.A03.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MediaFormat mediaFormat = this.A00.A00;
        mediaFormat.getClass();
        return mediaFormat;
    }

    public int B0n() {
        MediaFormat B0h = B0h();
        String str = "rotation-degrees";
        if (!B0h.containsKey(str)) {
            str = "rotation";
            if (!B0h.containsKey(str)) {
                return 0;
            }
        }
        return B0h.getInteger(str);
    }

    public void CYq(Context context, Hqj hqj, I8v i8v, HLh hLh, I9e i9e, int i) {
    }

    public void Ccu(IjV ijV) {
        LinkedBlockingQueue linkedBlockingQueue;
        if (ijV.A02 < 0 || (linkedBlockingQueue = this.A00.A04) == null) {
            return;
        }
        linkedBlockingQueue.offer(ijV);
    }

    public void CeD(MediaEffect mediaEffect, int i) {
    }

    public void CfH(int i) {
    }

    public void CfX(long j) {
    }

    public void D0a() {
        IjV ijV = new IjV(0, (ByteBuffer) null, new MediaCodec.BufferInfo());
        ijV.CmM(0, 0, 0L, 4);
        this.A00.A05.offer(ijV);
    }

    public void finish() {
        this.A00.A05.clear();
    }

    public void flush() {
    }
}
