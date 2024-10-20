package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ie, reason: invalid class name */
/* loaded from: 1ie.class */
public final class C1ie implements C1ib {
    public 3oP A01 = null;
    public 3oP A00 = null;
    public final C00i A03 = new 1BQ(16520);
    public boolean A02 = false;

    public static 3oP A00(C03b c03b) {
        int markerId = c03b.getMarkerId();
        int ArT = c03b.ArT();
        short AVI = c03b.AVI();
        return new 3oP(c03b.AWy(), c03b.B3n(), markerId, ArT, c03b.AyF(), c03b.AiY(), AVI);
    }

    public static void A01(C03b c03b, 3oP r302) {
        AnonymousClass040 AWy = c03b.AWy();
        AnonymousClass040 anonymousClass040 = r302.A04;
        synchronized (AWy) {
            AWy.A08 = null;
            AWy.A07 = null;
            AWy.A05.addAll(anonymousClass040.A05);
            AWy.A06.addAll(anonymousClass040.A06);
            double[] copyOf = Arrays.copyOf(AWy.A0A, Math.max(AWy.A00 + anonymousClass040.A00, 15));
            AWy.A0A = copyOf;
            System.arraycopy(anonymousClass040.A0A, 0, copyOf, AWy.A00, anonymousClass040.A00);
            long[] copyOf2 = Arrays.copyOf(AWy.A0B, Math.max(AWy.A02 + anonymousClass040.A02, 15));
            AWy.A0B = copyOf2;
            System.arraycopy(anonymousClass040.A0B, 0, copyOf2, AWy.A02, anonymousClass040.A02);
            byte[] copyOf3 = Arrays.copyOf(AWy.A09, Math.max(AWy.A03 + anonymousClass040.A03, 20));
            AWy.A09 = copyOf3;
            System.arraycopy(anonymousClass040.A09, 0, copyOf3, AWy.A03, anonymousClass040.A03);
            AWy.A00 += anonymousClass040.A00;
            AWy.A02 += anonymousClass040.A02;
            AWy.A03 += anonymousClass040.A03;
        }
    }

    public static void A02(C03b c03b, 3oP r302, long j) {
        AnonymousClass044 anonymousClass044 = r302.A05;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= anonymousClass044.A01) {
                return;
            }
            AnonymousClass044 B3n = c03b.B3n();
            if (B3n != null) {
                long millis = TimeUnit.NANOSECONDS.toMillis(anonymousClass044.A03[i2]) + j;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                int i3 = anonymousClass044.A02[i2];
                B3n.A00(anonymousClass044.A04[i2], anonymousClass044.A05[i2], anonymousClass044.A06[i2], timeUnit, i3, millis);
            }
            i = i2 + 1;
        }
    }

    @Override // X.C1ib
    public void D9w(C03b c03b) {
        short AVI;
        boolean z;
        int i;
        boolean z2;
        long j;
        String str;
        3oP r0;
        int markerId = c03b.getMarkerId();
        if (markerId == 3997703 || markerId == 3997705 || markerId == 3997704 || markerId == 1902195 || markerId == 1916706 || markerId == 1908952 || markerId == 1911396) {
            int markerId2 = c03b.getMarkerId();
            if ((markerId2 == 3997703 || markerId2 == 3997705 || markerId2 == 3997704) && (AVI = c03b.AVI()) != 4158 && AVI != 212 && AVI != 10294 && AVI != 10087 && AVI != 10088) {
                this.A00 = A00(c03b);
            } else {
                if (c03b.getMarkerId() != 1902195) {
                    3oP r02 = this.A00;
                    if (r02 == null || this.A01 == null) {
                        return;
                    }
                    A02(c03b, r02, 0L);
                    3oP r03 = this.A01;
                    A02(c03b, r03, r03.A03 - this.A00.A03);
                    A01(c03b, this.A00);
                    A01(c03b, this.A01);
                    this.A00 = null;
                    this.A01 = null;
                    z = false;
                    this.A02 = z;
                }
                if (this.A00 == null || (!this.A02 && c03b.AyF() >= this.A00.A03)) {
                    this.A01 = A00(c03b);
                }
            }
            if (this.A00 != null && (r0 = this.A01) != null && (!"true".equals(r0.A04.A02("play_request_sent")) || this.A01.A03 < this.A00.A03)) {
                this.A01 = null;
            }
            3oP r04 = this.A00;
            if (r04 == null || this.A01 == null) {
                return;
            }
            switch (r04.A01) {
                case 3997703:
                    i = 1916706;
                    break;
                case 3997704:
                    i = 1908952;
                    break;
                case 3997705:
                    i = 1911396;
                    break;
                default:
                    return;
            }
            C00i c00i = this.A03;
            QuickPerformanceLogger A0V = 1BK.A0V(c00i);
            int i2 = this.A01.A00;
            long j2 = this.A00.A03;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            A0V.markerStart(i, i2, j2, timeUnit);
            3oP r321 = this.A00;
            long j3 = r321.A03 + r321.A02;
            3oP r05 = this.A01;
            long j4 = r05.A03 + r05.A02;
            z = true;
            if (j3 > j4) {
                z2 = true;
                j = j3;
                j3 = j4;
            } else {
                z2 = false;
                j = j4;
            }
            short s = r321.A06;
            if (s == 2) {
                r321 = r05;
            }
            short s2 = r321.A06;
            str = "START_UP";
            String str2 = s != 2 ? r05.A06 != 2 ? "AUTOPLAY_STARTUP" : str : "VIDEO_AUTOPLAY";
            MarkerEditor withMarker = 1BK.A0U(c00i).withMarker(i, this.A01.A00);
            withMarker.point("early_event_end", j3);
            withMarker.annotate("early_event", z2 ? "VIDEO_AUTOPLAY" : "START_UP");
            withMarker.annotate("action_cause", str2);
            String A02 = this.A01.A04.A02("player_origin_1");
            if (A02 == null) {
                A02 = "";
            }
            withMarker.annotate("player_origin_merged", A02);
            String A022 = this.A01.A04.A02("player_sub_origin_1");
            if (A022 == null) {
                A022 = "";
            }
            withMarker.annotate("player_sub_origin_merged", A022);
            String A023 = this.A01.A04.A02("video_id_1");
            if (A023 == null) {
                A023 = "";
            }
            withMarker.annotate(AbstractC00603o4.A00(317), A023);
            String A024 = this.A01.A04.A02("was_cached");
            if (A024 == null) {
                A024 = "";
            }
            withMarker.annotate("was_cached", A024);
            withMarker.markerEditingCompleted();
            1BK.A0V(c00i).markerEnd(i, this.A01.A00, s2, j, timeUnit);
            this.A02 = z;
        }
    }
}
