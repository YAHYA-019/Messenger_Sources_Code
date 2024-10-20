package X;

import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.service.models.FetchStickersParams;
import com.facebook.stickers.service.models.FetchStickersResult;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6pf, reason: invalid class name */
/* loaded from: 6pf.class */
public final class C6pf {
    public boolean A00;
    public final BlueServiceOperationFactory A01;
    public final 1Mv A02;
    public final ScheduledExecutorService A04;
    public final Object A03 = new Object();
    public final C00i A05 = new 1BQ(16385);
    public final Runnable A06 = new Runnable() { // from class: X.6pg
        public static final String __redex_internal_original_name = "FetchStickerCoordinator$1";

        @Override // java.lang.Runnable
        public void run() {
            final ArrayListMultimap arrayListMultimap;
            final C6pf c6pf = C6pf.this;
            synchronized (c6pf.A03) {
                c6pf.A00 = false;
                1Mv r0 = c6pf.A02;
                arrayListMultimap = new ArrayListMultimap(r0);
                r0.clear();
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayListMultimap.keySet());
            Bundle bundle = new Bundle();
            bundle.putParcelable("fetchStickersParams", new FetchStickersParams(0S2.A01, copyOf));
            1Kd.A0F(new 4rX() { // from class: X.6pi
                public /* bridge */ /* synthetic */ void A02(Object obj) {
                    0fH.A0A(C6pf.class, "Stickers fetched successfully");
                    1Du it = ((FetchStickersResult) ((OperationResult) obj).A07()).A00.iterator();
                    while (it.hasNext()) {
                        Sticker sticker = (Sticker) it.next();
                        1Mv r02 = arrayListMultimap;
                        String str = sticker.A0F;
                        List AUg = r02.AUg(str);
                        if (AUg != null) {
                            Iterator it2 = AUg.iterator();
                            while (it2.hasNext()) {
                                ((1FX) it2.next()).set(sticker);
                            }
                        }
                        r02.Cdx(str);
                    }
                    1Mv r03 = arrayListMultimap;
                    if (!r03.isEmpty()) {
                        0fH.A0T(C6pf.class, "did not receive results for stickers: %s", new Object[]{r03.keySet()});
                    }
                    Iterator it3 = r03.values().iterator();
                    while (it3.hasNext()) {
                        ((1FX) it3.next()).setException(AnonymousClass001.A0T("Failed to fetch sticker"));
                    }
                }
            }, 1Ho.A00(c6pf.A01.newInstance_DEPRECATED("fetch_stickers", bundle), true), c6pf.A04);
        }
    };

    public C6pf() {
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0A(33031);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16464);
        this.A01 = blueServiceOperationFactory;
        this.A04 = scheduledExecutorService;
        this.A02 = new ArrayListMultimap();
    }

    public static void A00(C6pf c6pf, SettableFuture settableFuture, String str) {
        synchronized (c6pf.A03) {
            c6pf.A02.CZw(str, settableFuture);
            if (c6pf.A00) {
                return;
            }
            c6pf.A00 = true;
            c6pf.A04.schedule(c6pf.A06, 50, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public SettableFuture A01(String str) {
        ?? obj = new Object();
        if (str != null) {
            if (!((2yD) this.A05.get()).AZk(36311392982207270L)) {
                A00(this, obj, str);
                return obj;
            }
            1Qc r0 = (1Qc) 1Bi.A03(65837);
            J1F j1f = new J1F(this, (SettableFuture) obj, str);
            1QB r02 = (1QB) 1Bn.A0A(65841);
            r02.A02(j1f);
            r02.A04("FetchStickerCoordinator");
            r02.A03("Foreground");
            r0.A03(r02.A01(), "None");
        }
        return obj;
    }
}
