package androidx.work.impl.workers;

import X.11T;
import X.1BL;
import X.4IS;
import X.4IU;
import X.4JU;
import X.4JV;
import X.4JW;
import X.4KC;
import X.4KE;
import X.4KF;
import X.4KU;
import X.4KW;
import X.AnonymousClass001;
import X.C4Il;
import X.C4Ka;
import X.C4Kb;
import X.C4Kc;
import X.C4Ke;
import X.C4Kf;
import X.C4Kr;
import X.C4P3;
import X.C4Uh;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* loaded from: DiagnosticsWorker.class */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public C4Kr doWork() {
        4IU A00 = 4IU.A00(this.mAppContext);
        11T.A0A(A00);
        WorkDatabase workDatabase = A00.A04;
        11T.A0A(workDatabase);
        4KU A0E = workDatabase.A0E();
        4JW A0C = workDatabase.A0C();
        4JU A0F = workDatabase.A0F();
        4JV A0B = workDatabase.A0B();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        4KU r0 = A0E;
        TreeMap treeMap = 4KC.A08;
        4KE A002 = 4KF.A00("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        A002.ACB(1, currentTimeMillis);
        C4Il c4Il = r0.A02;
        c4Il.A06();
        Cursor A02 = c4Il.A02(A002);
        try {
            int A01 = 4KW.A01(A02, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A012 = 4KW.A01(A02, "state");
            int A013 = 4KW.A01(A02, "worker_class_name");
            int A014 = 4KW.A01(A02, "input_merger_class_name");
            int A015 = 4KW.A01(A02, "input");
            int A016 = 4KW.A01(A02, "output");
            int A017 = 4KW.A01(A02, "initial_delay");
            int A018 = 4KW.A01(A02, "interval_duration");
            int A019 = 4KW.A01(A02, "flex_duration");
            int A0110 = 4KW.A01(A02, "run_attempt_count");
            int A0111 = 4KW.A01(A02, "backoff_policy");
            int A0112 = 4KW.A01(A02, "backoff_delay_duration");
            int A0113 = 4KW.A01(A02, "last_enqueue_time");
            int A0114 = 4KW.A01(A02, "minimum_retention_duration");
            int A0115 = 4KW.A01(A02, "schedule_requested_at");
            int A0116 = 4KW.A01(A02, "run_in_foreground");
            int A0117 = 4KW.A01(A02, "out_of_quota_policy");
            int A0118 = 4KW.A01(A02, "period_count");
            int A0119 = 4KW.A01(A02, "generation");
            int A0120 = 4KW.A01(A02, "next_schedule_time_override");
            int A0121 = 4KW.A01(A02, "next_schedule_time_override_generation");
            int A0122 = 4KW.A01(A02, "stop_reason");
            int A0123 = 4KW.A01(A02, "required_network_type");
            int A0124 = 4KW.A01(A02, "requires_charging");
            int A0125 = 4KW.A01(A02, "requires_device_idle");
            int A0126 = 4KW.A01(A02, "requires_battery_not_low");
            int A0127 = 4KW.A01(A02, "requires_storage_not_low");
            int A0128 = 4KW.A01(A02, "trigger_content_update_delay");
            int A0129 = 4KW.A01(A02, "trigger_max_content_delay");
            int A0130 = 4KW.A01(A02, "content_uri_triggers");
            ArrayList A0t = AnonymousClass001.A0t(A02.getCount());
            while (A02.moveToNext()) {
                String string = A02.isNull(A01) ? null : A02.getString(A01);
                C4Kb A022 = C4Ka.A02(A02.getInt(A012));
                String string2 = A02.isNull(A013) ? null : A02.getString(A013);
                String string3 = A02.isNull(A014) ? null : A02.getString(A014);
                C4Kc A003 = C4Kc.A00(A02.isNull(A015) ? null : A02.getBlob(A015));
                C4Kc A004 = C4Kc.A00(A02.isNull(A016) ? null : A02.getBlob(A016));
                long j = A02.getLong(A017);
                long j2 = A02.getLong(A018);
                long j3 = A02.getLong(A019);
                int i = A02.getInt(A0110);
                Integer A03 = C4Ka.A03(A02.getInt(A0111));
                long j4 = A02.getLong(A0112);
                long j5 = A02.getLong(A0113);
                long j6 = A02.getLong(A0114);
                long j7 = A02.getLong(A0115);
                boolean A1N = AnonymousClass001.A1N(A02.getInt(A0116));
                A0t.add(new C4Kf(new C4Ke(C4Ka.A04(A02.getInt(A0123)), C4Ka.A06(A02.isNull(A0130) ? null : A02.getBlob(A0130)), A02.getLong(A0128), A02.getLong(A0129), AnonymousClass001.A1N(A02.getInt(A0124)), AnonymousClass001.A1N(A02.getInt(A0125)), AnonymousClass001.A1N(A02.getInt(A0126)), AnonymousClass001.A1N(A02.getInt(A0127))), A003, A004, A022, A03, C4Ka.A05(A02.getInt(A0117)), string, string2, string3, i, A02.getInt(A0118), A02.getInt(A0119), A02.getInt(A0121), A02.getInt(A0122), j, j2, j3, j4, j5, j6, j7, A02.getLong(A0120), A1N));
            }
            A02.close();
            A002.A00();
            ArrayList B8V = A0E.B8V();
            ArrayList AWK = A0E.AWK(200);
            if (!A0t.isEmpty()) {
                4IS.A00();
                String str = C4Uh.A00;
                Log.i(str, "Recently completed work:\n\n");
                4IS.A00();
                Log.i(str, C4Uh.A00(A0B, A0C, A0F, A0t));
            }
            if (!B8V.isEmpty()) {
                4IS.A00();
                String str2 = C4Uh.A00;
                Log.i(str2, "Running work:\n\n");
                4IS.A00();
                Log.i(str2, C4Uh.A00(A0B, A0C, A0F, B8V));
            }
            if (!AWK.isEmpty()) {
                4IS.A00();
                String str3 = C4Uh.A00;
                Log.i(str3, "Enqueued work:\n\n");
                4IS.A00();
                Log.i(str3, C4Uh.A00(A0B, A0C, A0F, AWK));
            }
            return new C4P3();
        } catch (Throwable th) {
            A02.close();
            A002.A00();
            throw th;
        }
    }
}
