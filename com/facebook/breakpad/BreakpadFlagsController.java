package com.facebook.breakpad;

import X.0fH;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1GD;
import X.1Nq;
import X.2yD;
import X.C00i;
import X.C0k1;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;

/* loaded from: BreakpadFlagsController.class */
public final class BreakpadFlagsController implements 1Nq {
    public 1BY A00;
    public final C00i A02 = new 1BQ(16385);
    public final Context A01 = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);

    public BreakpadFlagsController(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static void A00(BreakpadFlagsController breakpadFlagsController) {
        String str;
        C00i c00i = breakpadFlagsController.A02;
        2yD r0 = (2yD) c00i.get();
        1GD r02 = 1GD.A05;
        boolean AZr = r0.AZr(r02, 36310323535413419L);
        Context context = breakpadFlagsController.A01;
        if (AZr) {
            long availableBytes = new StatFs(Environment.getDataDirectory().getPath()).getAvailableBytes();
            if (availableBytes <= 2147483648L) {
                C0k1.A02(context, "breakpad_coredump_enabled", false);
                0fH.A0i(Long.valueOf(availableBytes), "CoreDumpController", "coredumps were note enabled because there is not enough free space!: %d");
                C0k1.A02(context, "android_unified_custom_data", ((2yD) c00i.get()).AZr(r02, 36310323535478956L));
                C0k1.A02(context, "breakpad_write_only_crash_thread", ((2yD) c00i.get()).AZr(r02, 36310323535544493L));
                C0k1.A01(context, "breakpad_record_libs", (int) ((2yD) c00i.get()).Av9(r02, 36591798512517217L));
                C0k1.A01(context, "breakpad_dump_maps", 0);
                C0k1.A02(context, "breakpad_all_maps_interesting", ((2yD) c00i.get()).AZr(r02, 36310323535675566L));
                C0k1.A02(context, "breakpad_libunwindstack_enabled", ((2yD) c00i.get()).AZr(r02, 36310323535872175L));
                C0k1.A02(context, "breakpad_tombstone_sessionid_enabled", false);
                C0k1.A02(context, "breakpad_proc_smaps_enabled", ((2yD) c00i.get()).AZr(r02, 36310323536134320L));
                C0k1.A02(context, "breakpad_disable_custom_data", ((2yD) c00i.get()).AZr(r02, 36310323536265393L));
            }
            C0k1.A02(context, "breakpad_coredump_enabled", true);
            str = "coredumps will be enabled next restart!";
        } else {
            C0k1.A02(context, "breakpad_coredump_enabled", false);
            BreakpadManager.ensureLoadLibrary();
            BreakpadManager.disableCoreDumpingImpl();
            str = "coredumps disabled!";
        }
        0fH.A0m("CoreDumpController", str);
        C0k1.A02(context, "android_unified_custom_data", ((2yD) c00i.get()).AZr(r02, 36310323535478956L));
        C0k1.A02(context, "breakpad_write_only_crash_thread", ((2yD) c00i.get()).AZr(r02, 36310323535544493L));
        C0k1.A01(context, "breakpad_record_libs", (int) ((2yD) c00i.get()).Av9(r02, 36591798512517217L));
        C0k1.A01(context, "breakpad_dump_maps", 0);
        C0k1.A02(context, "breakpad_all_maps_interesting", ((2yD) c00i.get()).AZr(r02, 36310323535675566L));
        C0k1.A02(context, "breakpad_libunwindstack_enabled", ((2yD) c00i.get()).AZr(r02, 36310323535872175L));
        C0k1.A02(context, "breakpad_tombstone_sessionid_enabled", false);
        C0k1.A02(context, "breakpad_proc_smaps_enabled", ((2yD) c00i.get()).AZr(r02, 36310323536134320L));
        C0k1.A02(context, "breakpad_disable_custom_data", ((2yD) c00i.get()).AZr(r02, 36310323536265393L));
    }

    public int Adi() {
        return 409;
    }

    public void BqJ(int i) {
        A00(this);
    }
}
