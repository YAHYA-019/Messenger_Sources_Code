package X;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Executor;

/* loaded from: Lk1.class */
public final /* synthetic */ class Lk1 implements Runnable {
    public static final String __redex_internal_original_name = "DelayMetCommandHandler$$ExternalSyntheticLambda0";
    public final /* synthetic */ LRo A00;

    @Override // java.lang.Runnable
    public final void run() {
        4IS A00;
        String str;
        StringBuilder A0k;
        LRo lRo = this.A00;
        C4Ki c4Ki = lRo.A08;
        String str2 = c4Ki.A01;
        if (lRo.A00 < 2) {
            lRo.A00 = 2;
            4IS A002 = 4IS.A00();
            str = LRo.A0E;
            A002.A02(str, 0Pz.A0W("Stopping work for WorkSpec ", str2));
            Context context = lRo.A04;
            Intent A0D = C3o5.A0D(context, SystemAlarmService.class);
            A0D.setAction("ACTION_STOP_WORK");
            LRl.A00(A0D, c4Ki);
            Executor executor = lRo.A09;
            LRm lRm = lRo.A06;
            int i = lRo.A03;
            LrV.A00(A0D, lRm, executor, i);
            boolean A05 = lRm.A04.A05(str2);
            A00 = 4IS.A00();
            if (A05) {
                A00.A02(str, 0Pz.A0j("WorkSpec ", str2, " needs to be rescheduled"));
                Intent A0D2 = C3o5.A0D(context, SystemAlarmService.class);
                A0D2.setAction("ACTION_SCHEDULE_WORK");
                LRl.A00(A0D2, c4Ki);
                LrV.A00(A0D2, lRm, executor, i);
                return;
            }
            A0k = AnonymousClass001.A0k();
            A0k.append("Processor does not have WorkSpec ");
            A0k.append(str2);
            str2 = ". No need to reschedule";
        } else {
            A00 = 4IS.A00();
            str = LRo.A0E;
            A0k = AnonymousClass001.A0k();
            A0k.append("Already stopped work for ");
        }
        A00.A02(str, AnonymousClass001.A0d(str2, A0k));
    }
}
