package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.tigon.iface.TigonRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.440, reason: invalid class name */
/* loaded from: 440.class */
public final class AnonymousClass440 implements C43c {
    @Override // X.C43c
    public void BbL(C43a c43a) {
        long j;
        long j2;
        long j3;
        java.util.Map map;
        Object obj;
        C01573rm c01573rm = C01573rm.A04;
        AtomicBoolean atomicBoolean = c01573rm.A03;
        if (atomicBoolean.get()) {
            long j4 = -1;
            long j5 = -1;
            43Z r0 = c43a.A02;
            if (r0 != null) {
                j4 = r0.A0D.longValue();
                j5 = r0.A0C.longValue();
            }
            String str = c43a.A08;
            C42g c42g = c43a.A05;
            TigonRequest tigonRequest = c43a.A06;
            1BK.A1M(c42g, tigonRequest);
            C42c c42c = (C42c) c42g.AtR(43O.A04);
            if (c42c == null) {
                synchronized (C01573rm.class) {
                    c01573rm.A00++;
                }
                return;
            }
            C42a c42a = (C42a) c42g.AtR(43O.A0D);
            if (c42a != null) {
                j = c42a.A04;
                j2 = c42a.A05;
                j3 = c42a.A03;
            } else {
                j = -1;
                j2 = -1;
                j3 = -1;
            }
            java.util.Map map2 = c42c.A01;
            int i = -1;
            try {
                String A0b = AnonymousClass001.A0b(TraceFieldType.StatusCode, map2);
                if (A0b != null) {
                    i = Integer.parseInt(A0b);
                }
            } catch (NumberFormatException unused) {
            }
            String A0b2 = AnonymousClass001.A0b(TraceFieldType.Error, map2);
            HashMap hashMap = null;
            if (str != null) {
                A0b2 = A0b2 == null ? str : 0Pz.A0Y(A0b2, str, ';');
            }
            C4Cr c4Cr = (C4Cr) c42g.AtR(43O.A08);
            ArrayList A0s = AnonymousClass001.A0s();
            if (c4Cr != null) {
                Iterator it = c4Cr.A00.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    11T.A0A(next);
                    4TG r02 = (4TG) next;
                    long j6 = r02.A00;
                    C40y c40y = r02.A01;
                    A0s.add(new Kiv(c40y.A00, j6, c40y.A01));
                }
            }
            AnonymousClass417 anonymousClass417 = (AnonymousClass417) tigonRequest.getLayerInformation(AnonymousClass413.A02);
            if (anonymousClass417 != null && (map = anonymousClass417.A01) != null && !map.isEmpty()) {
                hashMap = AnonymousClass001.A0u();
                Iterator A0y = AnonymousClass001.A0y(C01573rm.A05);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    Object key = A0z.getKey();
                    Object value = A0z.getValue();
                    if (map.containsKey(key)) {
                        obj = map.get(key);
                    } else if (map.containsKey(value)) {
                        obj = map.get(value);
                    }
                    hashMap.put(value, obj);
                }
            }
            long j7 = 0;
            try {
                String A0b3 = AnonymousClass001.A0b(MRk.A00(56), map2);
                if (A0b3 != null) {
                    j7 = Long.parseLong(A0b3);
                }
            } catch (NumberFormatException unused2) {
            }
            long j8 = 0;
            try {
                String A0b4 = AnonymousClass001.A0b(TraceFieldType.TTFB, map2);
                if (A0b4 != null) {
                    j8 = Long.parseLong(A0b4);
                }
            } catch (NumberFormatException unused3) {
            }
            long j9 = 0;
            try {
                String A0b5 = AnonymousClass001.A0b(TraceFieldType.TTLB, map2);
                if (A0b5 != null) {
                    j9 = Long.parseLong(A0b5);
                }
            } catch (NumberFormatException unused4) {
            }
            int i2 = 0;
            try {
                String A0b6 = AnonymousClass001.A0b(TraceFieldType.LocalPort, map2);
                if (A0b6 != null) {
                    i2 = Integer.parseInt(A0b6);
                }
            } catch (NumberFormatException unused5) {
            }
            String url = tigonRequest.url();
            String A0b7 = AnonymousClass001.A0b("request_friendly_name", map2);
            String A0b8 = AnonymousClass001.A0b(TraceFieldType.RangeRequest, map2);
            int i3 = 0;
            try {
                String A0b9 = AnonymousClass001.A0b(TraceFieldType.ReqHeaderCompSize, map2);
                if (A0b9 != null) {
                    i3 = Integer.parseInt(A0b9);
                }
            } catch (NumberFormatException unused6) {
            }
            int i4 = 0;
            try {
                String A0b10 = AnonymousClass001.A0b(TraceFieldType.ReqBodySize, map2);
                if (A0b10 != null) {
                    i4 = Integer.parseInt(A0b10);
                }
            } catch (NumberFormatException unused7) {
            }
            int i5 = 0;
            try {
                String A0b11 = AnonymousClass001.A0b(TraceFieldType.RspHeaderCompSize, map2);
                if (A0b11 != null) {
                    i5 = Integer.parseInt(A0b11);
                }
            } catch (NumberFormatException unused8) {
            }
            int i6 = 0;
            try {
                String A0b12 = AnonymousClass001.A0b(TraceFieldType.RspBodyCompSize, map2);
                if (A0b12 != null) {
                    i6 = Integer.parseInt(A0b12);
                }
            } catch (NumberFormatException unused9) {
            }
            boolean z = false;
            String A0b13 = AnonymousClass001.A0b(TraceFieldType.NewSession, map2);
            if (A0b13 != null) {
                Boolean valueOf = Boolean.valueOf(A0b13);
                11T.A0A(valueOf);
                z = valueOf.booleanValue();
            }
            long j10 = 0;
            try {
                String A0b14 = AnonymousClass001.A0b(TraceFieldType.ServerRtx, map2);
                if (A0b14 != null) {
                    j10 = Long.parseLong(A0b14);
                }
            } catch (NumberFormatException unused10) {
            }
            long j11 = 0;
            try {
                String A0b15 = AnonymousClass001.A0b(TraceFieldType.ServerUpstreamLatency, map2);
                if (A0b15 != null) {
                    j11 = Long.parseLong(A0b15);
                }
            } catch (NumberFormatException unused11) {
            }
            long j12 = 0;
            try {
                String A0b16 = AnonymousClass001.A0b(MRk.A00(60), map2);
                if (A0b16 != null) {
                    j12 = Long.parseLong(A0b16);
                }
            } catch (NumberFormatException unused12) {
            }
            long j13 = 0;
            try {
                String A0b17 = AnonymousClass001.A0b(MRk.A00(63), map2);
                if (A0b17 != null) {
                    j13 = Long.parseLong(A0b17);
                }
            } catch (NumberFormatException unused13) {
            }
            String A0b18 = AnonymousClass001.A0b(TraceFieldType.TransportType, map2);
            String A0b19 = AnonymousClass001.A0b(TraceFieldType.QuicServerCID, map2);
            String A0b20 = AnonymousClass001.A0b(TraceFieldType.QuicClientCID, map2);
            boolean z2 = false;
            String A0b21 = AnonymousClass001.A0b(TraceFieldType.IsPushRequest, map2);
            if (A0b21 != null) {
                Boolean valueOf2 = Boolean.valueOf(A0b21);
                11T.A0A(valueOf2);
                z2 = valueOf2.booleanValue();
            }
            long j14 = -1;
            try {
                String A0b22 = AnonymousClass001.A0b(MRk.A00(17), map2);
                if (A0b22 != null) {
                    j14 = Long.parseLong(A0b22);
                }
            } catch (NumberFormatException unused14) {
            }
            Kmb kmb = new Kmb(A0b2, url, A0b7, A0b8, A0b18, A0b19, A0b20, A0s, hashMap, i2, i3, i4, i5, i6, i, j, j, j7, j8, j9, j2, j3, j10, j11, j12, j13, j4, j5, j14, z, false, z2);
            synchronized (C01573rm.class) {
                c01573rm.A01.add(kmb);
                if (atomicBoolean.get()) {
                    Iterator it2 = c01573rm.A02.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw AnonymousClass001.A0Q("requestResponseInfoAdded");
                    }
                }
            }
        }
    }
}
