package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.485, reason: invalid class name */
/* loaded from: 485.class */
public final class AnonymousClass485 extends 2Lg {
    public /* bridge */ /* synthetic */ Object A02() {
        AnonymousClass486 anonymousClass486 = new AnonymousClass486();
        anonymousClass486.A00 = 1aU.A00;
        anonymousClass486.A01 = 1aU.A01;
        anonymousClass486.A02 = 1aU.A02;
        return anonymousClass486;
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        AnonymousClass486 anonymousClass486 = (AnonymousClass486) obj2;
        if (obj != null && anonymousClass486 != null) {
            r302.AxQ().A03("app_init_ms", anonymousClass486.A00);
            r302.AxQ().A03("time_since_app_init_ms", r302.AyF() - anonymousClass486.A00);
            r302.AxQ().A03("first_foreground_ms", anonymousClass486.A01);
            r302.AxQ().A03("last_foreground_ms", anonymousClass486.A02);
            r302.AxQ().A06("startup_status", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID);
            r302.AxQ().A06("is_first_foreground", false);
            r302.AxQ().A03("time_since_foreground_ms", r302.AyF() - anonymousClass486.A02);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "startup_stats";
    }

    public int B5R() {
        return 12;
    }

    public Class BBP() {
        return AnonymousClass486.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }
}
