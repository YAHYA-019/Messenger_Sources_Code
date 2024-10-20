package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Hue.class */
public final class Hue {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final JHr A0A;
    public volatile Hjk A0B;
    public volatile float A0C;
    public final Hok A05 = new Hok();
    public volatile I5B A0D = new I5B(0, 0);
    public final java.util.Map A08 = Collections.synchronizedMap(new IdentityHashMap());
    public final AtomicReference A09 = new AtomicReference();
    public final HP2 A06 = new HP2();
    public final IPQ A07 = new IPQ(new IPM(this));

    public Hue(JHr jHr, int i) {
        this.A0A = jHr;
        this.A02 = i;
    }

    public void A00() {
        IPK ipk = (IPK) this.A09.getAndSet(null);
        if (ipk != null) {
            ipk.release();
        }
        this.A05.A00();
        if (this.A0B != null) {
            Hjk hjk = this.A0B;
            HsS hsS = hjk.A02;
            if (hsS != null) {
                hsS.A01();
                hjk.A02 = null;
            }
            hjk.A03.A01();
            this.A0B = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01() {
        ByteBuffer byteBuffer;
        Hok hok = this.A05;
        synchronized (hok) {
            List list = hok.A03;
            byteBuffer = list.isEmpty() ? null : (ByteBuffer) list.remove(0);
        }
        if (byteBuffer == null) {
            IPK ipk = (IPK) this.A09.get();
            if (ipk != null) {
                ArrayList arrayList = this.A06.A00;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((JLy) arrayList.get(i)).CbL(ipk);
                }
                return;
            }
            return;
        }
        AtomicReference atomicReference = this.A09;
        IPK ipk2 = (IPK) atomicReference.getAndSet(null);
        if (ipk2 != null) {
            ipk2.release();
        }
        Number A0o = 1BK.A0o(byteBuffer, this.A08);
        A0o.getClass();
        IPK A00 = this.A07.A00();
        I0F i0f = (I0F) A00.get();
        int capacity = byteBuffer.capacity();
        int i2 = this.A00;
        int i3 = capacity / i2;
        int i4 = this.A02;
        long longValue = A0o.longValue();
        int i5 = this.A03;
        Hd7[] hd7Arr = i0f.A0C;
        if (hd7Arr == 0) {
            throw AnonymousClass001.A0N("FrameData has been initialized with 0 planes");
        }
        if (0 >= hd7Arr.length) {
            throw AnonymousClass001.A0L("planeIndex is greater then the number of planes available");
        }
        if (hd7Arr[0] == 0) {
            hd7Arr[0] = new Object();
        }
        Hd7 hd7 = hd7Arr[0];
        hd7.A02 = byteBuffer;
        hd7.A00 = 0;
        hd7.A01 = i3;
        i0f.A03 = i4;
        i0f.A07 = longValue;
        i0f.A09 = false;
        i0f.A04 = i5;
        i0f.A02 = i2;
        try {
            ArrayList arrayList2 = this.A06.A00;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((JLy) arrayList2.get(i6)).CbL(A00);
            }
        } finally {
            atomicReference.set(A00);
        }
    }

    public void A02(int i, int i2) {
        int i3 = this.A01;
        if (i3 != 0 && !this.A04) {
            I5B ATv = this.A0A.ATv(i, i2, i3);
            i = ATv.A01;
            i2 = ATv.A00;
        }
        if (this.A03 == i && this.A00 == i2) {
            return;
        }
        this.A03 = i;
        this.A00 = i2;
        this.A0C = 1.0f / i;
        this.A0D = this.A0A.ATu(i, i2);
        Hok hok = this.A05;
        int i4 = this.A0D.A01 * this.A0D.A00 * 4;
        synchronized (hok) {
            if (hok.A00 != i4) {
                hok.A00();
            }
            hok.A00 = i4;
        }
    }

    public void A03(JMr jMr, List list) {
        ArrayList arrayList = this.A06.A00;
        arrayList.clear();
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((JLy) it.next()).Cp8(jMr);
        }
    }

    public boolean A04(I5I i5i, boolean z) {
        ByteBuffer byteBuffer;
        Hjk hjk = this.A0B;
        if (hjk == null) {
            return false;
        }
        if (z && this.A09.get() != null) {
            return false;
        }
        IPK ipk = (IPK) this.A09.getAndSet(null);
        if (ipk != null) {
            ipk.release();
        }
        Hok hok = this.A05;
        synchronized (hok) {
            List list = hok.A02;
            if (list.isEmpty() && hok.A01 < 3) {
                byteBuffer = ByteBuffer.allocateDirect(hok.A00);
                byteBuffer.order(ByteOrder.nativeOrder());
                hok.A01++;
                byteBuffer.rewind();
            } else if (list.isEmpty()) {
                List list2 = hok.A03;
                if (list2.isEmpty()) {
                    throw AnonymousClass001.A0N(0Pz.A0d("Max buffers (", ") already out and in use", 3));
                }
                byteBuffer = (ByteBuffer) list2.remove(0);
            } else {
                byteBuffer = (ByteBuffer) list.remove(0);
            }
        }
        AnonymousClass001.A18(byteBuffer, i5i.A00, this.A08);
        byteBuffer.rewind();
        int i = this.A0D.A01;
        int i2 = this.A0D.A00;
        float f = this.A0C;
        HsS hsS = hjk.A02;
        if (hsS != null && (hjk.A01 != i || hjk.A00 != i2)) {
            hsS.A01();
            hjk.A02 = null;
        }
        hjk.A01 = i;
        hjk.A00 = i2;
        boolean A03 = i5i.A03();
        if (A03 != hjk.A04) {
            hjk.A04 = A03;
            hjk.A03.A01();
            hjk.A03 = hjk.A08.AIZ(hjk.A06, hjk.A05, hjk.A04);
        }
        HsS hsS2 = hjk.A02;
        if (hsS2 == null) {
            hsS2 = new HsS(i, i2, false);
            hjk.A02 = hsS2;
        }
        GLES20.glBindFramebuffer(36160, hsS2.A00);
        HsS hsS3 = hjk.A02;
        GLES20.glViewport(0, 0, hsS3.A02, hsS3.A01);
        I9C A00 = hjk.A03.A00();
        A00.A05("uSurfaceTransformMatrix", i5i.A04);
        A00.A05("uSceneTransformMatrix", i5i.A03);
        A00.A05("uVideoTransformMatrix", i5i.A05);
        A00.A04("sTexture", i5i.A00());
        if (hjk.A09) {
            A00.A03("uInverseSize", f);
        }
        A00.A02(hjk.A07);
        GOp.A1T(byteBuffer, i, i2);
        GLES20.glBindFramebuffer(36160, 0);
        synchronized (hok) {
            if (byteBuffer.capacity() == hok.A00) {
                hok.A03.add(byteBuffer);
            }
        }
        return true;
    }
}
