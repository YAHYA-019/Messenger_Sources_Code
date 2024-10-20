package X;

import java.util.ArrayList;

/* renamed from: X.3eo, reason: invalid class name */
/* loaded from: 3eo.class */
public final class C3eo implements Runnable {
    public static final String __redex_internal_original_name = "FbPhoneIdSyncStatsReporter$StatsReportingRunnable";
    public final /* synthetic */ 1Ij A00;

    public C3eo(1Ij r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        int i;
        String str;
        String obj;
        String str2;
        1Ij r0 = this.A00;
        synchronized (r0) {
            arrayList = r0.A00;
            r0.A00 = AnonymousClass001.A0s();
            r0.A01 = false;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            39S r02 = (C3O9) arrayList.get(i);
            if (r02 instanceof 39S) {
                39S r03 = r02;
                AbstractC01593ro A3u = C33r.A00(1BK.A06(r0.A02)).A00.A3u("phoneid_sync_stats", true);
                if (A3u.A0B()) {
                    A3u.A02(r03.A00, "phone_id");
                    A3u.A06("src_pkg", r03.A03);
                    A3u.A06("status", r03.A00());
                    long j = r03.A00;
                    if (j == -1) {
                        throw AnonymousClass001.A0L("End timestamp not initialized yet.");
                    }
                    A3u.A04("duration", (int) (j - r03.A02));
                    A3u.A02(r03.A02, "prev_phone_id");
                    A3u.A06("sync_medium", r03.A01);
                    A3u.A0A();
                    str = "FbPhoneIdSyncStatsReporter";
                    obj = r03.toString();
                    str2 = "Reported response %s to analytics";
                    0fH.A0g(obj, str, str2);
                } else {
                    continue;
                }
            } else {
                if (!(r02 instanceof 39R)) {
                    throw AnonymousClass001.A0L("Unsupported Response type");
                }
                39R r04 = (39R) r02;
                AbstractC01593ro A3u2 = C33r.A00(1BK.A06(r0.A02)).A00.A3u("sfdid_sync_stats", false);
                if (A3u2.A0B()) {
                    3MN r05 = r04.A01;
                    3MN r06 = r04.A00;
                    A3u2.A06("src_pkg", r04.A03);
                    A3u2.A06("status", r04.A00());
                    A3u2.A02(r05 == null ? null : Long.valueOf(r05.A00), "creation_time");
                    A3u2.A06("generator_pkg", r05 == null ? null : r05.A02);
                    A3u2.A06("prev_generator_pkg", r06 == null ? null : r06.A02);
                    A3u2.A06("generator_action", r05 == null ? null : r05.A01);
                    A3u2.A06("prev_generator_action", r06 != null ? r06.A01 : null);
                    A3u2.A0A();
                    str = "FbPhoneIdSyncStatsReporter";
                    obj = r04.toString();
                    str2 = "Reported SFDID %s to analytics";
                    0fH.A0g(obj, str, str2);
                }
            }
        }
    }
}
