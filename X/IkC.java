package X;

import android.content.Context;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: IkC.class */
public final class IkC implements JNK {
    public Hqj A00;
    public final Context A01;
    public final MediaFormat A02;
    public final JO9 A03;
    public final I51 A04;
    public final Ijj A05;
    public final Hkg A06;
    public final JJJ A07;
    public final ExecutorService A08;
    public volatile JNR A09;
    public volatile boolean A0A;
    public volatile Future A0B;

    public IkC(Context context, MediaFormat mediaFormat, Hqj hqj, JO9 jo9, I51 i51, Ijj ijj, Hkg hkg, JJJ jjj, ExecutorService executorService) {
        this.A04 = i51;
        this.A06 = hkg;
        this.A02 = mediaFormat;
        this.A08 = executorService;
        this.A03 = jo9;
        this.A01 = context;
        this.A05 = ijj;
        this.A07 = jjj;
        this.A00 = hqj;
    }

    public static void A00(IkC ikC) {
        if (ikC.A09 != null) {
            MediaFormat B0h = ikC.A09.B0h();
            Ijj ijj = ikC.A05;
            ijj.A04 = B0h;
            ijj.A00 = ikC.A09.B0n();
            I51 i51 = ikC.A04;
            i51.A0P = true;
            i51.A0E = B0h;
        }
    }

    public void A5a(MediaEffect mediaEffect, int i) {
        JNR jnr = this.A09;
        jnr.getClass();
        jnr.A5a(mediaEffect, i);
    }

    public void A7a(int i) {
        JNR jnr = this.A09;
        jnr.getClass();
        jnr.A7a(i);
    }

    public void ANx(long j) {
        if (j >= 0) {
            this.A09.ANx(j);
        }
    }

    public boolean BRC() {
        if (this.A0B == null || !this.A0B.isDone()) {
            return false;
        }
        this.A0B.get();
        return true;
    }

    public void CeD(MediaEffect mediaEffect, int i) {
        JNR jnr = this.A09;
        jnr.getClass();
        jnr.CeD(mediaEffect, i);
    }

    public void CfH(int i) {
        JNR jnr = this.A09;
        jnr.getClass();
        jnr.CfH(i);
    }

    public void CfX(long j) {
        if (j >= 0) {
            this.A09.CfX(j);
        }
    }

    public boolean D0b() {
        this.A09.D0a();
        return true;
    }

    public void D1M(I3g i3g, int i) {
        if (this.A0A && this.A06.A0A.A0u()) {
            return;
        }
        HAy hAy = HAy.A03;
        this.A0B = this.A08.submit((Callable) new J5A(i, 1, Hw1.A00(this.A01, this.A03, hAy, this.A06), i3g, this));
    }

    public void DA8() {
        if (this.A0B != null) {
            this.A0B.get();
        }
    }

    public void cancel() {
        this.A0A = true;
        if (this.A0B != null) {
            if (!this.A0B.isDone() && !this.A06.A0A.A0u()) {
                this.A0B.cancel(true);
            }
            try {
                this.A0B.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public void flush() {
        this.A09.flush();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.I3R] */
    public void release() {
        ?? obj = new Object();
        try {
            if (this.A09 != null) {
                this.A09.finish();
                this.A09 = null;
            }
        } catch (Throwable th) {
            I3R.A00((I3R) obj, th);
        }
        obj.A02();
    }
}
