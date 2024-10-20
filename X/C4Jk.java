package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.4Jk, reason: invalid class name */
/* loaded from: 4Jk.class */
public final /* synthetic */ class C4Jk extends 01I implements C0Bg {
    public static final C4Jk A00 = new C4Jk();

    public C4Jk() {
        super(6, C4Jl.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // X.C0Bg
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        4IX r0 = (4IX) obj2;
        C4Ii c4Ii = (C4Ii) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        C4Ja c4Ja = (C4Ja) obj5;
        C4Ji c4Ji = (C4Ji) obj6;
        11T.A0F(context, 0);
        11T.A0F(r0, 1);
        11T.A0F(c4Ii, 2);
        11T.A0F(workDatabase, 3);
        11T.A0F(c4Ja, 4);
        11T.A0F(c4Ji, 5);
        C4Jm c4Jm = new C4Jm(context, r0, workDatabase);
        C4Jp.A00(context, SystemJobService.class, true);
        4IS.A00().A02(4KZ.A00, "Created SystemJobScheduler and enabled SystemJobService");
        return C0s8.A14(c4Jm, new C4Js(context, r0, c4Ji, new C4Jq(c4Ji, c4Ii), c4Ja, c4Ii));
    }
}
