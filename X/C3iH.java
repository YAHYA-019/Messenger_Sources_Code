package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3iH, reason: invalid class name */
/* loaded from: 3iH.class */
public final class C3iH implements Runnable {
    public static final String __redex_internal_original_name = "ScheduleFdidConfigUpdateRunnable";
    public final int A00;
    public final C5Cf A01;
    public final MobileConfigManagerHolderImpl A02;
    public final ScheduledExecutorService A03;

    public C3iH(C5Cf c5Cf, MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, ScheduledExecutorService scheduledExecutorService, int i) {
        this.A00 = i;
        this.A02 = mobileConfigManagerHolderImpl;
        this.A03 = scheduledExecutorService;
        this.A01 = c5Cf;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5Cf c5Cf = this.A01;
        String A01 = AbstractC05454dv.A01();
        if (!A01.equals("EMPTY_FAMILY_DEVICE_ID")) {
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = this.A02;
            mobileConfigManagerHolderImpl.setFamilyDeviceId(A01);
            mobileConfigManagerHolderImpl.updateConfigs(new C05924fb());
            return;
        }
        int i = this.A00;
        if (i <= 0) {
            0fH.A0B(C3iH.class, "Used up all retries. Fail to update configs with non-empty fdid.");
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this.A03;
        scheduledExecutorService.schedule(new C3iH(c5Cf, this.A02, scheduledExecutorService, i - 1), 100, TimeUnit.MILLISECONDS);
    }
}
