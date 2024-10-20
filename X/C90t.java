package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.90t, reason: invalid class name */
/* loaded from: 90t.class */
public final class C90t extends 2Lg {
    public final C00i A00 = 1BQ.A02(33075);

    public static 0Gn A00(0Gn r301, 1Qb r302, String str, int i, int i2) {
        r301.A02(str, i - i2);
        return r302.AxQ();
    }

    public /* bridge */ /* synthetic */ Object A02() {
        C00i c00i = this.A00;
        return new 9Vk(((1KR) c00i.get()).A07.get(), ((1KR) c00i.get()).A01.get(), ((1KR) c00i.get()).A06.get(), ((1KR) c00i.get()).A02.get(), ((1KR) c00i.get()).A04.get(), ((1KR) c00i.get()).A03.get(), ((1KR) c00i.get()).A08.get(), ((1KR) c00i.get()).A05.get(), ((1KR) c00i.get()).A00.get());
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        ListenableFuture listenableFuture;
        9Vk r0 = (9Vk) obj;
        9Vk r02 = (9Vk) obj2;
        synchronized (this) {
            if (r0 == null || r02 == null) {
                listenableFuture = 1hM.A01;
            } else {
                A00(A00(A00(A00(A00(A00(A00(A00(r302.AxQ(), r302, "start_op_count", r02.A07, r0.A07), r302, "activity_listener_count", r02.A00, r0.A00), r302, "quick_event_listener_count", r02.A06, r0.A06), r302, "broadcast_receiver_count", r02.A01, r0.A01), r302, "executed_app_job_count", r02.A03, r0.A03), r302, "controller_callback_count", r02.A02, r0.A02), r302, "tigon_request_count", r02.A08, r0.A08), r302, "pigeon_write_count", r02.A04, r0.A04).A02("qpl_listener_count", r02.A05);
                listenableFuture = 1hM.A01;
            }
        }
        return listenableFuture;
    }

    public String B5Q() {
        return "fb4a_startup_stats";
    }

    public int B5R() {
        return 28;
    }

    public Class BBP() {
        return 9Vk.class;
    }

    public boolean BS6(2Lc r302) {
        return true;
    }
}
