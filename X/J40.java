package X;

import java.util.List;

/* loaded from: J40.class */
public final class J40 implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerLogger$logVideoPlaybackFallback$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ IHX A01;
    public final /* synthetic */ 7uY A02;
    public final /* synthetic */ 6Uz A03;
    public final /* synthetic */ 6Uz A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public J40(IHX ihx, 7uY r303, 6Uz r304, 6Uz r305, String str, String str2, List list, long j) {
        this.A01 = ihx;
        this.A03 = r304;
        this.A04 = r305;
        this.A00 = j;
        this.A06 = str;
        this.A07 = list;
        this.A05 = str2;
        this.A02 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JNa jNa = this.A01.A02;
        6Uz r0 = this.A03;
        6Uz r02 = this.A04;
        long j = this.A00;
        String str = this.A06;
        List list = this.A07;
        jNa.Bbq(this.A02, r0, r02, str, this.A05, list != null ? list.size() : -1, j);
    }
}
