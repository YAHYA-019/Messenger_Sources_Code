package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.3ds, reason: invalid class name */
/* loaded from: 3ds.class */
public final class C3ds implements 1K9 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 1XD A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ Integer A03;

    public C3ds(1XD r302, ImmutableList immutableList, Integer num, long j) {
        this.A01 = r302;
        this.A02 = immutableList;
        this.A03 = num;
        this.A00 = j;
    }

    public void onFailure(Throwable th) {
    }

    public void onSuccess(Object obj) {
        int i;
        String str;
        1XD r0 = this.A01;
        int size = r0.A02().size();
        5Dp r02 = (5Dp) r0.A03.get();
        ImmutableList immutableList = this.A02;
        int size2 = immutableList.size();
        Integer num = this.A03;
        long j = this.A00;
        2Jy r03 = new 2Jy("offline_mode_queue_processing_finished");
        r03.A0D("pigeon_reserved_keyword_module", "offline");
        r03.A0C("time_taken_ms", r02.A03.now() - j);
        r03.A0B("requests_submitted", size2);
        r03.A0B("requests_dropped", r02.A00);
        r03.A0B("requests_still_pending", size);
        r03.A0B("requests_total", immutableList.size());
        switch (num.intValue()) {
            case 0:
                str = "COLD_START";
                break;
            case 1:
                i = 73;
                str = AnonymousClass000.A00(i);
                break;
            default:
                i = 150;
                str = AnonymousClass000.A00(i);
                break;
        }
        r03.A0D("trigger", str);
        C33s.A00(r02.A01).A03(r03);
        r02.A00 = 0;
    }
}
