package X;

import android.R;

/* renamed from: X.1b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1b5.class */
public final class C00461b5 implements InterfaceC00471b6 {
    public final 1Br A00;
    public final boolean A01;
    public final boolean A02;

    public C00461b5() {
        1Br A00 = 1Bq.A00(16385);
        this.A00 = A00;
        this.A01 = ((2yD) A00.A00.get()).AZk(36314708697030790L);
        this.A02 = ((2yD) this.A00.A00.get()).AZk(2342157717910790279L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC00471b6
    public 1bY AKq() {
        return new 1bY("video_network_traffic_aggregation", new 1bN[]{new 1bN(new 1bQ("total_request_time_ms", 0L)), new 1bN(new 1bQ("total_connect_time_ms", 0L)), new 1bN(new 1bQ("ttfb_ms", 0L)), new 1bN(new 1bQ("ttlb_ms", 0L)), new 1bN(new 1bQ("upstream_latency_ms", 0L)), new 1bN(new 1bQ("request_body_bytes", 0L)), new 1bN(new 1bQ("response_body_bytes", 0L)), new 1bN(new 1bQ("response_body_bytes_on_wire", 0L)), new 1bN(new 1bR("is_new_connection"))}, new 1bK[]{new Object(), new 1bR(GOm.A00(22)), new 1bR("is_cell"), new 1bR("is_reels")}, R.^attr-private.__removed5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A02 == false) goto L6;
     */
    @Override // X.InterfaceC00471b6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEnabled() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.A02
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C00461b5.isEnabled():boolean");
    }
}
