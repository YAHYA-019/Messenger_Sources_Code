package X;

import android.graphics.RectF;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: Ilg.class */
public final class Ilg implements 7Fc {
    public final /* synthetic */ I7p A00;

    public Ilg(I7p i7p) {
        this.A00 = i7p;
    }

    public void CFk(Throwable th) {
        IEI iei = this.A00.A03.A00;
        Iterator it = iei.A01.A00.iterator();
        while (it.hasNext()) {
            ((JN6) it.next()).Czd(th);
        }
        IEI.A01(iei).Bb5(th);
    }

    public void CFn() {
        I7p i7p = this.A00;
        i7p.A01 += 1BL.A08(i7p.A06) - i7p.A00;
        C00i c00i = i7p.A07;
        4YU.A0G(c00i).post(i7p.A0B);
        4YU.A0G(c00i).post(i7p.A0A);
    }

    public void CFo() {
    }

    public void CFp() {
        I7p i7p = this.A00;
        i7p.A01 = 0L;
        i7p.A02 = 1BL.A08(i7p.A06);
        C00i c00i = i7p.A07;
        4YU.A0G(c00i).post(i7p.A0B);
        4YU.A0G(c00i).post(i7p.A0A);
    }

    public void CFq(MediaResource mediaResource, long j) {
        long j2;
        int i;
        I7p i7p = this.A00;
        i7p.A00 = 1BL.A08(i7p.A06);
        if (mediaResource == null) {
            Hlu hlu = i7p.A03;
            if (j < 0 || j > i7p.A08.longValue() + 100) {
                j = 0;
            }
            IEI.A01(hlu.A00).Bb2(TimeUnit.MILLISECONDS.toSeconds(j));
            return;
        }
        RectF rectF = MediaResource.A18;
        C5en A0p = AbI.A0p(mediaResource);
        A0p.A0P = 5HP.A03;
        A0p.A0V = new MediaResourceSendSource(C5es.A09, C5et.CAPTURE);
        A0p.A0N = C5ep.A07;
        ImmutableList.of();
        List list = i7p.A0C;
        boolean z = i7p.A0D;
        ImmutableList A02 = C7ui.A02(list, z);
        C1pq.A08("amplitudes", A02);
        long j3 = C7mp.A00;
        if (z) {
            j2 = 38;
            i = 1;
        } else {
            j2 = 50;
            i = 10;
        }
        A0p.A0W = new WaveformData(A02, (int) (j3 / (j2 * i)));
        IEI.A03(i7p.A03.A00, 4YU.A0Y(A0p));
    }

    public void CFr() {
    }
}
