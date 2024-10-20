package X;

import com.facebook.feed.logging.waterfall.VpvWaterfallLogger;
import java.util.Collections;

/* renamed from: X.3es, reason: invalid class name */
/* loaded from: 3es.class */
public final class C3es implements Runnable {
    public static final String __redex_internal_original_name = "VpvWaterfallLogger$sendWaterfallToMarauder$1";
    public final /* synthetic */ VpvWaterfallLogger A00;

    public C3es(VpvWaterfallLogger vpvWaterfallLogger) {
        this.A00 = vpvWaterfallLogger;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [X.2J3, X.33i] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        VpvWaterfallLogger vpvWaterfallLogger = this.A00;
        try {
            str = ((AnonymousClass244) 1Br.A0B(vpvWaterfallLogger.A02)).A0W(Collections.synchronizedList(vpvWaterfallLogger.A06));
        } catch (2LD e) {
            C01s A04 = 1Br.A04(vpvWaterfallLogger.A01);
            0BS A01 = 0BR.A01("JSON exception in VpvWaterfall aggregation", "");
            A01.A04 = e;
            A04.D0u(new 0BR(A01));
            str = null;
        }
        2Jy r0 = new 2Jy("viewport_waterfall");
        r0.A0D("par", str);
        r0.A0D("pigeon_reserved_keyword_module", "native_newsfeed");
        boolean AZk = vpvWaterfallLogger.A05.AZk(2342153976997283429L);
        C1kw c1kw = (C1kw) 1Br.A0B(vpvWaterfallLogger.A03);
        if (C33i.A00 == null) {
            synchronized (C33i.class) {
                if (C33i.A00 == null) {
                    C33i.A00 = new C2J3(c1kw);
                }
            }
        }
        C33i c33i = C33i.A00;
        if (AZk) {
            c33i.A00.Bb1(r0);
        } else {
            c33i.A02(r0);
        }
    }
}
