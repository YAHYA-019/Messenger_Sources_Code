package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: Hsw.class */
public final class Hsw {
    public 5Vj A00;
    public boolean A01;
    public final 5Vh A02;
    public final IH6 A03;
    public final JJ4 A04;
    public final AtomicInteger A05 = GOn.A1K(1);
    public final AtomicReference A06;
    public final Handler A07;
    public final HeroPlayerSetting A08;
    public final Runnable A09;
    public final Runnable A0A;
    public final ReentrantLock A0B;
    public volatile int A0C;

    public Hsw(Handler handler, 5Vh r303, IhE ihE, JJ4 jj4, HeroPlayerSetting heroPlayerSetting) {
        this.A07 = handler;
        this.A02 = r303;
        AtomicReference A1L = GOn.A1L(6Um.A08);
        this.A06 = A1L;
        this.A03 = new IH6(ihE, A1L);
        this.A08 = heroPlayerSetting;
        this.A04 = jj4;
        this.A0B = new ReentrantLock();
        this.A0A = new IuA(this);
        this.A09 = new Iu9(this);
    }

    public final void A00() {
        if (this.A01) {
            if (this.A08.offloadGrootAudioFocus) {
                this.A07.post(this.A09);
                return;
            }
            try {
                ReentrantLock reentrantLock = this.A0B;
                boolean tryLock = reentrantLock.tryLock(1L, TimeUnit.SECONDS);
                try {
                    this.A09.run();
                    if (tryLock) {
                        reentrantLock.unlock();
                    }
                } catch (Throwable th) {
                    if (tryLock) {
                        reentrantLock.unlock();
                    }
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void A01() {
        if (this.A01) {
            return;
        }
        if (this.A08.offloadGrootAudioFocus) {
            this.A07.post(this.A0A);
            return;
        }
        ReentrantLock reentrantLock = this.A0B;
        reentrantLock.lock();
        try {
            this.A0A.run();
        } finally {
            reentrantLock.unlock();
        }
    }
}
