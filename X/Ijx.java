package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: Ijx.class */
public final class Ijx implements JN9 {
    public boolean A00;
    public final /* synthetic */ Ik3 A01;

    public Ijx(Ik3 ik3) {
        this.A01 = ik3;
    }

    @Override // X.JN9
    public long AM0(long j) {
        Ik3 ik3 = this.A01;
        if (ik3.A01 != null) {
            LinkedBlockingQueue linkedBlockingQueue = ik3.A04;
            linkedBlockingQueue.getClass();
            linkedBlockingQueue.offer(ik3.A01);
            ik3.A01 = null;
        }
        IjV ijV = (IjV) ik3.A06.poll();
        ik3.A01 = ijV;
        long j2 = -1;
        if (ijV != null) {
            MediaCodec.BufferInfo bufferInfo = ijV.A00;
            if (bufferInfo == null || (bufferInfo.flags & 4) == 0) {
                return bufferInfo.presentationTimeUs;
            }
            this.A00 = true;
            LinkedBlockingQueue linkedBlockingQueue2 = ik3.A04;
            linkedBlockingQueue2.getClass();
            linkedBlockingQueue2.offer(ik3.A01);
            ik3.A01 = null;
        }
        return j2;
    }

    @Override // X.JN9
    public IjV AMp(long j) {
        LinkedBlockingQueue linkedBlockingQueue = this.A01.A04;
        linkedBlockingQueue.getClass();
        return (IjV) linkedBlockingQueue.poll(j, TimeUnit.MICROSECONDS);
    }

    @Override // X.JN9
    public long Agj() {
        IjV ijV = this.A01.A01;
        return ijV == null ? -1 : ijV.A00.presentationTimeUs;
    }

    @Override // X.JN9
    public String Agk() {
        return null;
    }

    @Override // X.JN9
    public String Agm() {
        return "VideoTranscoderPassThrough";
    }

    @Override // X.JN9
    public boolean BWq() {
        return this.A00;
    }

    @Override // X.JN9
    public void CYo(MediaFormat mediaFormat, I9e i9e, List list, int i, boolean z) {
        Ik3 ik3 = this.A01;
        ik3.A00 = mediaFormat;
        ik3.A03.countDown();
        int i2 = 0;
        do {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(1048576);
            ArrayList arrayList = ik3.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0s();
                ik3.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            IjV ijV = new IjV(0, allocateDirect, new MediaCodec.BufferInfo());
            LinkedBlockingQueue linkedBlockingQueue = ik3.A04;
            linkedBlockingQueue.getClass();
            linkedBlockingQueue.offer(ijV);
            i2++;
        } while (i2 < 5);
    }

    @Override // X.JN9
    public void Caf(IjV ijV) {
        this.A01.A06.offer(ijV);
    }

    @Override // X.JN9
    public boolean Cys() {
        return false;
    }

    @Override // X.JN9
    public void D6c(int i, Bitmap bitmap) {
    }

    @Override // X.JN9
    public void finish() {
        Ik3 ik3 = this.A01;
        ArrayList arrayList = ik3.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
        LinkedBlockingQueue linkedBlockingQueue = ik3.A04;
        linkedBlockingQueue.getClass();
        linkedBlockingQueue.clear();
        ik3.A06.clear();
        ik3.A04 = null;
    }

    @Override // X.JN9
    public void flush() {
    }
}
