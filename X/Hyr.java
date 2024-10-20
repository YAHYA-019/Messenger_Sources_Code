package X;

import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Iterator;

/* loaded from: Hyr.class */
public final class Hyr {
    public IDp A00;
    public final Hlt A03;
    public final 5Yc A02 = new IU8(this, 1);
    public final C00i A01 = 1BQ.A02(49777);

    public Hyr(Hlt hlt) {
        this.A03 = hlt;
    }

    public static void A00(Hyr hyr) {
        IDp iDp = hyr.A00;
        if (iDp == null) {
            Iterator A00 = Hx5.A00(hyr);
            while (A00.hasNext()) {
                ((JN6) A00.next()).CC7();
            }
            return;
        }
        long A05 = iDp.A05();
        long A04 = hyr.A00.A04();
        IEI iei = hyr.A03.A00;
        if (A05 >= 0) {
            Iterator it = iei.A01.A00.iterator();
            while (it.hasNext()) {
                ((JN6) it.next()).CCH(A05, A04);
            }
            return;
        }
        MediaResource mediaResource = iei.A04;
        if (mediaResource != null) {
            Hx5 hx5 = iei.A01;
            long j = mediaResource.A08;
            Iterator it2 = hx5.A00.iterator();
            while (it2.hasNext()) {
                ((JN6) it2.next()).CCH(j, j);
            }
        }
    }
}
