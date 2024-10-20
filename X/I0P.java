package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: I0P.class */
public final class I0P {
    public CamcorderProfile A00;
    public MediaRecorder A01;
    public F8q A02;
    public File A03;
    public boolean A06;
    public boolean A08;
    public HH5 A09;
    public HH6 A0A;
    public final C01s A0B;
    public final AnonymousClass536 A0C;
    public final ExecutorService A0D;
    public volatile I42 A0E;
    public boolean A07 = false;
    public AtomicBoolean A04 = new AtomicBoolean();
    public AtomicBoolean A05 = new AtomicBoolean();

    public I0P() {
        ExecutorService executorService = (ExecutorService) GOn.A16();
        AnonymousClass536 A0E = GOp.A0E();
        C01s A0I = 1BL.A0I();
        HH6 hh6 = (HH6) 1Bn.A0B(116199);
        F8q f8q = (F8q) 1Hv.A02(7zP.A0J(), 99435);
        HH5 hh5 = (HH5) 1Bn.A0B(116198);
        this.A0D = executorService;
        this.A0C = A0E;
        this.A0B = A0I;
        this.A0A = hh6;
        this.A02 = f8q;
        this.A09 = hh5;
    }

    public static HdM A00(I0P i0p, Integer num) {
        Uri uri;
        if (!i0p.A05.getAndSet(false)) {
            return null;
        }
        try {
            if (i0p.A01 == null) {
                i0p.A04.set(false);
                return null;
            }
            try {
                try {
                    if (i0p.A06) {
                        0fH.A0D(I0P.class, "Stopping media recorder");
                        i0p.A01.stop();
                        0fH.A0D(I0P.class, "Media recorder stopped");
                    }
                    uri = ((num == 0S2.A01 || num == 0S2.A0C) && !i0p.A08) ? Uri.fromFile(i0p.A03) : null;
                } catch (RuntimeException unused) {
                    uri = null;
                }
                try {
                    i0p.A0E.A05.lock();
                    i0p.A06 = false;
                    i0p.A01.reset();
                    i0p.A01.release();
                } catch (RuntimeException unused2) {
                    i0p.A06 = false;
                    i0p.A01.reset();
                    i0p.A01.release();
                    i0p.A01 = null;
                    i0p.A07 = false;
                    return new HdM(i0p.A00, uri, i0p.A0E.A03());
                }
                i0p.A01 = null;
                i0p.A07 = false;
                return new HdM(i0p.A00, uri, i0p.A0E.A03());
            } catch (Throwable th) {
                i0p.A06 = false;
                i0p.A01.reset();
                i0p.A01.release();
                i0p.A01 = null;
                throw th;
            }
        } finally {
            i0p.A04.set(false);
        }
    }
}
