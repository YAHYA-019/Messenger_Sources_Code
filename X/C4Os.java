package X;

import android.os.Handler;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4Os, reason: invalid class name */
/* loaded from: 4Os.class */
public final class C4Os extends 2Lg {
    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        0XH r0 = (0XH) obj;
        if (r0 != null && !r0.A0B && r0.A0C) {
            if (r0.A08 <= r0.A06 - r0.A0F) {
                r302.AxQ().A02("message_count", r0.A00);
                C3o5.A0G(r302.AxQ(), r302, "total_messages_duration", r0.A08).A03("longest_message_duration", r0.A03);
                String str = r0.A0A;
                if (str != null) {
                    r302.AxQ().A06("st200ms_longest_message_origin", str);
                }
                r302.AxQ().A02("native_poll_once_count", r0.A01);
                C3o5.A0G(r302.AxQ(), r302, "native_poll_once_duration", r0.A07).A02("st200ms_messages_count", r0.A02);
                C3o5.A0G(r302.AxQ(), r302, "longest_wait_time", r0.A05).A06("longest_wait_message", r0.A09);
                r302.AxQ().A03("longest_wait_message_duration", r0.A04);
            }
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "mqd_stats";
    }

    public int B5R() {
        return 54;
    }

    public Class BBP() {
        return 0XH.class;
    }

    public boolean BS6(2Lc r302) {
        return r302.A05;
    }

    public /* bridge */ /* synthetic */ Object D1A(int i, int i2) {
        0XH r307;
        0XI A00 = 0XI.A00();
        C0un c0un = A00.A00;
        if (c0un == null) {
            0fH.A0j("MQD", "MqdStatsTracker abort. not ready");
            r307 = null;
        } else {
            if (c0un.A03) {
                A00.A01.clear();
                A00.A00.A03 = false;
            }
            long j = i2 == 0 ? i : i2 << (i + 32);
            ConcurrentHashMap concurrentHashMap = A00.A01;
            Long valueOf = Long.valueOf(j);
            0XH r0 = (0XH) concurrentHashMap.get(valueOf);
            if (r0 != null) {
                r0.A0B = true;
            }
            r307 = new 0XH(i, i2);
            concurrentHashMap.put(valueOf, r307);
            C0un c0un2 = A00.A00;
            if (!c0un2.A03) {
                c0un2.A00 = SystemClock.uptimeMillis();
                if (!c0un2.A02) {
                    c0un2.A02 = true;
                    Handler handler = c0un2.A01;
                    if (handler == null) {
                        handler = AnonymousClass001.A07();
                        c0un2.A01 = handler;
                    }
                    handler.postDelayed(new 0XG(c0un2), LocationComponentOptions.STALE_STATE_DELAY_MS);
                    return r307;
                }
            }
        }
        return r307;
    }

    public /* bridge */ /* synthetic */ void D2e(Object obj) {
        0XH r0 = (0XH) obj;
        if (r0 != null) {
            0XI A00 = 0XI.A00();
            int i = r0.A0E;
            int i2 = r0.A0D;
            if (A00.A00 != null) {
                long j = i2 == 0 ? i : i2 << (i + 32);
                ConcurrentHashMap concurrentHashMap = A00.A01;
                0XH r02 = (0XH) concurrentHashMap.remove(Long.valueOf(j));
                if (r02 != null) {
                    r02.A0C = true;
                    r02.A06 = SystemClock.uptimeMillis();
                    C14f c14f = A00.A00.A04;
                    if (((0Wp) c14f).A05 == -1) {
                        long uptimeMillis = SystemClock.uptimeMillis() - ((0Wp) c14f).A02;
                        r02.A00++;
                        r02.A08 += uptimeMillis;
                    }
                }
                if (concurrentHashMap.isEmpty()) {
                    C0un c0un = A00.A00;
                    if (c0un.A02) {
                        c0un.A02 = false;
                        Handler handler = c0un.A01;
                        if (handler == null) {
                            handler = AnonymousClass001.A07();
                            c0un.A01 = handler;
                        }
                        handler.removeCallbacks(new 0XG(c0un));
                    }
                }
            }
        }
    }
}
