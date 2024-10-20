package X;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.analytics.memory.AddressSpace;
import com.mapbox.mapboxsdk.location.LocationComponentCompassEngine;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.0tl, reason: invalid class name */
/* loaded from: 0tl.class */
public final class C0tl implements 0hY {
    public final int A00;

    public C0tl(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object, X.05l] */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Object, X.0qN] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.lang.Object, X.05l] */
    /* JADX WARN: Type inference failed for: r0v165, types: [java.lang.Object, X.0qN] */
    /* JADX WARN: Type inference failed for: r0v182, types: [X.0FF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v188, types: [X.061, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.0qM] */
    public final Object AIl(final C0hg c0hg) {
        File file;
        Integer num;
        0gG[] r305;
        switch (this.A00) {
            case 0:
            case 15:
            case 31:
                File A02 = c0hg.A07().A02(c0hg.A07().A07);
                if (A02 != null) {
                    return new 0qQ(A02);
                }
                return null;
            case 1:
            case 17:
            case 33:
                file = c0hg.A07().A02(c0hg.A07().A07);
                if (file == null) {
                    return null;
                }
                final 0jH A07 = c0hg.A07();
                final File file2 = file;
                return new 0gG(A07, file2) { // from class: X.0qa
                    public final 0jH A00;
                    public final File A01;

                    {
                        this.A01 = file2;
                        this.A00 = A07;
                    }

                    public Integer Ayh() {
                        return 0S2.A1J;
                    }

                    public /* synthetic */ boolean BN1(Integer num2) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        File file3 = this.A01;
                        File A0D = AnonymousClass001.A0D(file3, "state.txt");
                        if (A0D.exists()) {
                            C0gw c0gw = new C0gw(A0D, false);
                            char A0B = c0gw.A0B();
                            boolean A00 = C0gy.A00(A0B);
                            String A0N = c0gw.A0N();
                            c0qh.A05(C0g6.A4U, file3.getName());
                            C0qh.A01(C0g6.A2u, c0qh, 0jH.A00(file3, ""));
                            c0qh.A02(C0g6.A03, A00);
                            c0qh.A05(C0g6.A4O, String.valueOf(A0B));
                            c0qh.A05(C0g6.A4R, A0N);
                            C0qh.A01(C0g6.A1F, c0qh, c0gw.A0K());
                            boolean A072 = C0gw.A07(c0qh, c0gw);
                            File A0D2 = AnonymousClass001.A0D(file3, "first_intent.txt");
                            if (A0D2.exists()) {
                                try {
                                    BufferedReader A0A = AnonymousClass001.A0A(A0D2);
                                    try {
                                        c0qh.A05(C0g6.A5j, A0A.readLine());
                                        A0A.close();
                                    } finally {
                                    }
                                } catch (IOException unused) {
                                }
                            }
                            C0g9 c0g9 = C0g6.A3G;
                            0jH r0 = this.A00;
                            C0qh.A01(c0g9, c0qh, r0.A00 - r0.A01);
                            c0qh.A05(C0g6.A7d, c0gw.A0S());
                            c0qh.A05(C0g6.A5Z, c0gw.A0Q());
                            c0qh.A05(C0g6.A8n, c0gw.A0T());
                            C0qh.A01(C0g6.A1w, c0qh, c0gw.A0J());
                            C0gu.A01(c0qh, c0gw, file3);
                            C0qh.A01(C0g6.A3H, c0qh, c0gw.A0L());
                            c0qh.A05(C0g6.A5l, String.valueOf(c0gw.A0W()));
                            Boolean A0M = c0gw.A0M();
                            if (A0M != null) {
                                c0qh.A02(C0g6.A0c, A0M.booleanValue());
                            }
                            C0gw.A04(c0qh, c0gw);
                            0FK A002 = C0gw.A00(c0gw, "last OnPause request received time ms", 207L);
                            if (A002 != null && !A002.A04) {
                                if (A002.A03) {
                                    C0qh.A01(C0g6.A20, c0qh, A002.A02);
                                    C0qh.A01(C0g6.A1z, c0qh, A002.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key last_on_pause_request_recv is not valid", new Object[]{A002});
                                    c0qh.A02(C0g6.A0T, A072);
                                }
                            }
                            0FK A003 = C0gw.A00(c0gw, "last OnPause request to leave app received time ms", 224L);
                            if (A003 != null && !A003.A04) {
                                if (A003.A03) {
                                    C0qh.A01(C0g6.A24, c0qh, A003.A02);
                                    C0qh.A01(C0g6.A23, c0qh, A003.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_recv\" is not valid", new Object[]{A003});
                                    c0qh.A02(C0g6.A0V, A072);
                                }
                            }
                            C0gw.A05(c0qh, c0gw);
                            0FK A004 = C0gw.A00(c0gw, "last OnPause request execute start time ms", 241L);
                            if (A004 != null && !A004.A04) {
                                if (A004.A03) {
                                    C0qh.A01(C0g6.A1y, c0qh, A004.A02);
                                    C0qh.A01(C0g6.A1x, c0qh, A004.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key \"last_on_pause_request_exec\" is not valid", new Object[]{A004});
                                    c0qh.A02(C0g6.A0S, A072);
                                }
                            }
                            0FK A005 = C0gw.A00(c0gw, "last OnPause request to leave app execute start time ms", 258L);
                            if (A005 != null && !A005.A04) {
                                if (A005.A03) {
                                    C0qh.A01(C0g6.A22, c0qh, A005.A02);
                                    C0qh.A01(C0g6.A21, c0qh, A005.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_exec\" is not valid", new Object[]{A005});
                                    c0qh.A02(C0g6.A0U, A072);
                                }
                            }
                            C0gw.A06(c0qh, c0gw);
                            int A0E = c0gw.A0E();
                            if (A0E > 0) {
                                C0qh.A01(C0g6.A13, c0qh, A0E);
                                C0qh.A01(C0g6.A14, c0qh, c0gw.A0G());
                                C0qh.A01(C0g6.A15, c0qh, c0gw.A0H());
                            }
                            C0o7 c0o7 = C0ft.A04;
                            if (c0o7 != null) {
                                c0qh.A02(C0g6.A0d, c0o7.A07);
                            }
                        }
                    }
                };
            case 2:
            case 5:
            case 7:
                file = c0hg.A07().A05;
                0RZ.A03(file, "Did you call SessionManager.init()?");
                final 0jH A072 = c0hg.A07();
                final File file22 = file;
                return new 0gG(A072, file22) { // from class: X.0qa
                    public final 0jH A00;
                    public final File A01;

                    {
                        this.A01 = file22;
                        this.A00 = A072;
                    }

                    public Integer Ayh() {
                        return 0S2.A1J;
                    }

                    public /* synthetic */ boolean BN1(Integer num2) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        File file3 = this.A01;
                        File A0D = AnonymousClass001.A0D(file3, "state.txt");
                        if (A0D.exists()) {
                            C0gw c0gw = new C0gw(A0D, false);
                            char A0B = c0gw.A0B();
                            boolean A00 = C0gy.A00(A0B);
                            String A0N = c0gw.A0N();
                            c0qh.A05(C0g6.A4U, file3.getName());
                            C0qh.A01(C0g6.A2u, c0qh, 0jH.A00(file3, ""));
                            c0qh.A02(C0g6.A03, A00);
                            c0qh.A05(C0g6.A4O, String.valueOf(A0B));
                            c0qh.A05(C0g6.A4R, A0N);
                            C0qh.A01(C0g6.A1F, c0qh, c0gw.A0K());
                            boolean A0722 = C0gw.A07(c0qh, c0gw);
                            File A0D2 = AnonymousClass001.A0D(file3, "first_intent.txt");
                            if (A0D2.exists()) {
                                try {
                                    BufferedReader A0A = AnonymousClass001.A0A(A0D2);
                                    try {
                                        c0qh.A05(C0g6.A5j, A0A.readLine());
                                        A0A.close();
                                    } finally {
                                    }
                                } catch (IOException unused) {
                                }
                            }
                            C0g9 c0g9 = C0g6.A3G;
                            0jH r0 = this.A00;
                            C0qh.A01(c0g9, c0qh, r0.A00 - r0.A01);
                            c0qh.A05(C0g6.A7d, c0gw.A0S());
                            c0qh.A05(C0g6.A5Z, c0gw.A0Q());
                            c0qh.A05(C0g6.A8n, c0gw.A0T());
                            C0qh.A01(C0g6.A1w, c0qh, c0gw.A0J());
                            C0gu.A01(c0qh, c0gw, file3);
                            C0qh.A01(C0g6.A3H, c0qh, c0gw.A0L());
                            c0qh.A05(C0g6.A5l, String.valueOf(c0gw.A0W()));
                            Boolean A0M = c0gw.A0M();
                            if (A0M != null) {
                                c0qh.A02(C0g6.A0c, A0M.booleanValue());
                            }
                            C0gw.A04(c0qh, c0gw);
                            0FK A002 = C0gw.A00(c0gw, "last OnPause request received time ms", 207L);
                            if (A002 != null && !A002.A04) {
                                if (A002.A03) {
                                    C0qh.A01(C0g6.A20, c0qh, A002.A02);
                                    C0qh.A01(C0g6.A1z, c0qh, A002.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key last_on_pause_request_recv is not valid", new Object[]{A002});
                                    c0qh.A02(C0g6.A0T, A0722);
                                }
                            }
                            0FK A003 = C0gw.A00(c0gw, "last OnPause request to leave app received time ms", 224L);
                            if (A003 != null && !A003.A04) {
                                if (A003.A03) {
                                    C0qh.A01(C0g6.A24, c0qh, A003.A02);
                                    C0qh.A01(C0g6.A23, c0qh, A003.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_recv\" is not valid", new Object[]{A003});
                                    c0qh.A02(C0g6.A0V, A0722);
                                }
                            }
                            C0gw.A05(c0qh, c0gw);
                            0FK A004 = C0gw.A00(c0gw, "last OnPause request execute start time ms", 241L);
                            if (A004 != null && !A004.A04) {
                                if (A004.A03) {
                                    C0qh.A01(C0g6.A1y, c0qh, A004.A02);
                                    C0qh.A01(C0g6.A1x, c0qh, A004.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key \"last_on_pause_request_exec\" is not valid", new Object[]{A004});
                                    c0qh.A02(C0g6.A0S, A0722);
                                }
                            }
                            0FK A005 = C0gw.A00(c0gw, "last OnPause request to leave app execute start time ms", 258L);
                            if (A005 != null && !A005.A04) {
                                if (A005.A03) {
                                    C0qh.A01(C0g6.A22, c0qh, A005.A02);
                                    C0qh.A01(C0g6.A21, c0qh, A005.A00);
                                } else {
                                    0fH.A17("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_exec\" is not valid", new Object[]{A005});
                                    c0qh.A02(C0g6.A0U, A0722);
                                }
                            }
                            C0gw.A06(c0qh, c0gw);
                            int A0E = c0gw.A0E();
                            if (A0E > 0) {
                                C0qh.A01(C0g6.A13, c0qh, A0E);
                                C0qh.A01(C0g6.A14, c0qh, c0gw.A0G());
                                C0qh.A01(C0g6.A15, c0qh, c0gw.A0H());
                            }
                            C0o7 c0o7 = C0ft.A04;
                            if (c0o7 != null) {
                                c0qh.A02(C0g6.A0d, c0o7.A07);
                            }
                        }
                    }
                };
            case 3:
                return new C05k(c0hg.A06(), 0iP.A0O, c0hg.A07(), 0hE.A04, 30);
            case 4:
                Application application = c0hg.A0K;
                ?? obj = new Object();
                obj.A00 = application;
                return obj;
            case 6:
            case 16:
            case 32:
            case 35:
                Application application2 = c0hg.A0K;
                ?? obj2 = new Object();
                ((0FF) obj2).A00 = application2;
                return obj2;
            case 8:
                final boolean z = false;
                return new 0gG(z) { // from class: X.0q9
                    public final boolean A00;

                    {
                        this.A00 = z;
                    }

                    public Integer Ayh() {
                        return 0S2.A0a;
                    }

                    public /* synthetic */ boolean BN1(Integer num2) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        0Dj.A00();
                        C0g9 c0g9 = C0g6.A3A;
                        long[] jArr = 0Dj.A01;
                        C0qh.A01(c0g9, c0qh, jArr[0]);
                        C0qh.A01(C0g6.A37, c0qh, jArr[1]);
                        C0qh.A01(C0g6.A35, c0qh, jArr[3]);
                        C0qh.A01(C0g6.A33, c0qh, jArr[6]);
                        C0qh.A01(C0g6.A38, c0qh, jArr[8] + jArr[9] + jArr[10] + jArr[11]);
                        C0qh.A01(C0g6.A36, c0qh, jArr[2] + jArr[4] + jArr[5] + jArr[12]);
                        C0qh.A01(C0g6.A39, c0qh, jArr[7]);
                        C0qh.A01(C0g6.A34, c0qh, jArr[13]);
                        if (this.A00) {
                            C0qh.A01(C0g6.A1q, c0qh, AddressSpace.getLargestChunkKb());
                        }
                        Runtime runtime = Runtime.getRuntime();
                        C0qh.A01(C0g6.A1o, c0qh, runtime.maxMemory());
                        C0qh.A01(C0g6.A1p, c0qh, runtime.totalMemory());
                        C0qh.A01(C0g6.A1n, c0qh, runtime.freeMemory());
                        if (!0Dk.A00) {
                            int[] iArr = {8192};
                            long[] jArr2 = new long[1];
                            if (C0dl.A01("/dev/memcg/memory.usage_in_bytes", iArr, jArr2)) {
                                long j = jArr2[0];
                                if (C0dl.A01("/dev/memcg/memory.memsw.usage_in_bytes", iArr, jArr2)) {
                                    long j2 = jArr2[0];
                                    C0qh.A01(C0g6.A2D, c0qh, j);
                                    C0qh.A01(C0g6.A2C, c0qh, j2);
                                }
                            }
                            0Dk.A00 = true;
                        }
                        long[] jArr3 = new long[1];
                        C0dl.A02("/proc/self/status", jArr3, 0Dl.A00);
                        C0qh.A01(C0g6.A3B, c0qh, jArr3[0]);
                    }
                };
            case 9:
                final Integer num2 = 0S2.A0M;
                final boolean z2 = true;
                0gG r0 = new 0gG(z2) { // from class: X.0q9
                    public final boolean A00;

                    {
                        this.A00 = z2;
                    }

                    public Integer Ayh() {
                        return 0S2.A0a;
                    }

                    public /* synthetic */ boolean BN1(Integer num22) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        0Dj.A00();
                        C0g9 c0g9 = C0g6.A3A;
                        long[] jArr = 0Dj.A01;
                        C0qh.A01(c0g9, c0qh, jArr[0]);
                        C0qh.A01(C0g6.A37, c0qh, jArr[1]);
                        C0qh.A01(C0g6.A35, c0qh, jArr[3]);
                        C0qh.A01(C0g6.A33, c0qh, jArr[6]);
                        C0qh.A01(C0g6.A38, c0qh, jArr[8] + jArr[9] + jArr[10] + jArr[11]);
                        C0qh.A01(C0g6.A36, c0qh, jArr[2] + jArr[4] + jArr[5] + jArr[12]);
                        C0qh.A01(C0g6.A39, c0qh, jArr[7]);
                        C0qh.A01(C0g6.A34, c0qh, jArr[13]);
                        if (this.A00) {
                            C0qh.A01(C0g6.A1q, c0qh, AddressSpace.getLargestChunkKb());
                        }
                        Runtime runtime = Runtime.getRuntime();
                        C0qh.A01(C0g6.A1o, c0qh, runtime.maxMemory());
                        C0qh.A01(C0g6.A1p, c0qh, runtime.totalMemory());
                        C0qh.A01(C0g6.A1n, c0qh, runtime.freeMemory());
                        if (!0Dk.A00) {
                            int[] iArr = {8192};
                            long[] jArr2 = new long[1];
                            if (C0dl.A01("/dev/memcg/memory.usage_in_bytes", iArr, jArr2)) {
                                long j = jArr2[0];
                                if (C0dl.A01("/dev/memcg/memory.memsw.usage_in_bytes", iArr, jArr2)) {
                                    long j2 = jArr2[0];
                                    C0qh.A01(C0g6.A2D, c0qh, j);
                                    C0qh.A01(C0g6.A2C, c0qh, j2);
                                }
                            }
                            0Dk.A00 = true;
                        }
                        long[] jArr3 = new long[1];
                        C0dl.A02("/proc/self/status", jArr3, 0Dl.A00);
                        C0qh.A01(C0g6.A3B, c0qh, jArr3[0]);
                    }
                };
                Object obj3 = new Object();
                Application application3 = c0hg.A0K;
                ?? obj4 = new Object();
                ((0qN) obj4).A00 = application3;
                final 0gG[] r02 = {r0, obj3, obj4, new Object(), new 0gG() { // from class: X.0q5
                    public final int A00 = Process.myPid();

                    static {
                        String str = C0vv.A02;
                    }

                    public Integer Ayh() {
                        return 0S2.A0T;
                    }

                    public boolean BN1(Integer num3) {
                        return AnonymousClass001.A1W(num3, 0S2.A00);
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        AnonymousClass029 A00 = C0vv.A00(Integer.toString(this.A00));
                        int i = A00.mOomAdj;
                        int i2 = (-1) << (-1);
                        if (i != i2) {
                            C0qh.A01(C0g6.A2P, c0qh, i);
                        }
                        C0qh.A01(C0g6.A2Q, c0qh, A00.A00);
                        int i3 = A00.mOomScore;
                        if (i3 != i2) {
                            C0qh.A01(C0g6.A2R, c0qh, i3);
                        }
                        C0qh.A01(C0g6.A2U, c0qh, A00.A02);
                        int i4 = A00.mOomScoreAdj;
                        if (i4 != i2) {
                            C0qh.A01(C0g6.A2S, c0qh, i4);
                        }
                        C0qh.A01(C0g6.A2T, c0qh, A00.A01);
                    }
                }};
                return new 0gG(num2, r02) { // from class: X.0qg
                    public final Integer A00;
                    public final 0gG[] A01;

                    {
                        this.A00 = num2;
                        this.A01 = r02;
                    }

                    public Integer Ayh() {
                        return this.A00;
                    }

                    public /* synthetic */ boolean BN1(Integer num3) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        0gG[] r03 = this.A01;
                        int length = r03.length;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= length) {
                                return;
                            }
                            0gG r04 = r03[i2];
                            try {
                                r04.CXo(c0qh, c0gq);
                            } catch (Throwable th) {
                                C0iy.A00().Bwu(0gL.A00(this.A00), th, null);
                                0jV r05 = C0g6.A6R;
                                String A0b = AnonymousClass001.A0b(r05, c0qh.A09);
                                if (A0b == null) {
                                    A0b = "";
                                }
                                c0qh.A05(r05, 0Pz.A10(A0b, "Error: ", 0gL.A00(r04.Ayh()), ": ", th.getMessage(), "\n"));
                            }
                            i = i2 + 1;
                        }
                    }
                };
            case 10:
                num = 0S2.A0t;
                C15h c15h = c0hg.A08;
                if (c15h == null) {
                    c15h = new C0u5(c0hg, 10);
                    c0hg.A08 = c15h;
                }
                ?? obj5 = new Object();
                obj5.A00 = c15h;
                final boolean z3 = true;
                0gG r03 = new 0gG(z3) { // from class: X.0q9
                    public final boolean A00;

                    {
                        this.A00 = z3;
                    }

                    public Integer Ayh() {
                        return 0S2.A0a;
                    }

                    public /* synthetic */ boolean BN1(Integer num22) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        0Dj.A00();
                        C0g9 c0g9 = C0g6.A3A;
                        long[] jArr = 0Dj.A01;
                        C0qh.A01(c0g9, c0qh, jArr[0]);
                        C0qh.A01(C0g6.A37, c0qh, jArr[1]);
                        C0qh.A01(C0g6.A35, c0qh, jArr[3]);
                        C0qh.A01(C0g6.A33, c0qh, jArr[6]);
                        C0qh.A01(C0g6.A38, c0qh, jArr[8] + jArr[9] + jArr[10] + jArr[11]);
                        C0qh.A01(C0g6.A36, c0qh, jArr[2] + jArr[4] + jArr[5] + jArr[12]);
                        C0qh.A01(C0g6.A39, c0qh, jArr[7]);
                        C0qh.A01(C0g6.A34, c0qh, jArr[13]);
                        if (this.A00) {
                            C0qh.A01(C0g6.A1q, c0qh, AddressSpace.getLargestChunkKb());
                        }
                        Runtime runtime = Runtime.getRuntime();
                        C0qh.A01(C0g6.A1o, c0qh, runtime.maxMemory());
                        C0qh.A01(C0g6.A1p, c0qh, runtime.totalMemory());
                        C0qh.A01(C0g6.A1n, c0qh, runtime.freeMemory());
                        if (!0Dk.A00) {
                            int[] iArr = {8192};
                            long[] jArr2 = new long[1];
                            if (C0dl.A01("/dev/memcg/memory.usage_in_bytes", iArr, jArr2)) {
                                long j = jArr2[0];
                                if (C0dl.A01("/dev/memcg/memory.memsw.usage_in_bytes", iArr, jArr2)) {
                                    long j2 = jArr2[0];
                                    C0qh.A01(C0g6.A2D, c0qh, j);
                                    C0qh.A01(C0g6.A2C, c0qh, j2);
                                }
                            }
                            0Dk.A00 = true;
                        }
                        long[] jArr3 = new long[1];
                        C0dl.A02("/proc/self/status", jArr3, 0Dl.A00);
                        C0qh.A01(C0g6.A3B, c0qh, jArr3[0]);
                    }
                };
                Object obj6 = new Object();
                Application application4 = c0hg.A0K;
                ?? obj7 = new Object();
                ((0qN) obj7).A00 = application4;
                r305 = new 0gG[]{obj5, r03, obj6, obj7, new Object(), new 0gG() { // from class: X.0q5
                    public final int A00 = Process.myPid();

                    static {
                        String str = C0vv.A02;
                    }

                    public Integer Ayh() {
                        return 0S2.A0T;
                    }

                    public boolean BN1(Integer num3) {
                        return AnonymousClass001.A1W(num3, 0S2.A00);
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        AnonymousClass029 A00 = C0vv.A00(Integer.toString(this.A00));
                        int i = A00.mOomAdj;
                        int i2 = (-1) << (-1);
                        if (i != i2) {
                            C0qh.A01(C0g6.A2P, c0qh, i);
                        }
                        C0qh.A01(C0g6.A2Q, c0qh, A00.A00);
                        int i3 = A00.mOomScore;
                        if (i3 != i2) {
                            C0qh.A01(C0g6.A2R, c0qh, i3);
                        }
                        C0qh.A01(C0g6.A2U, c0qh, A00.A02);
                        int i4 = A00.mOomScoreAdj;
                        if (i4 != i2) {
                            C0qh.A01(C0g6.A2S, c0qh, i4);
                        }
                        C0qh.A01(C0g6.A2T, c0qh, A00.A01);
                    }
                }};
                final Integer num3 = num;
                final 0gG[] r2 = r305;
                return new 0gG(num3, r2) { // from class: X.0qg
                    public final Integer A00;
                    public final 0gG[] A01;

                    {
                        this.A00 = num3;
                        this.A01 = r2;
                    }

                    public Integer Ayh() {
                        return this.A00;
                    }

                    public /* synthetic */ boolean BN1(Integer num32) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        0gG[] r032 = this.A01;
                        int length = r032.length;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= length) {
                                return;
                            }
                            0gG r04 = r032[i2];
                            try {
                                r04.CXo(c0qh, c0gq);
                            } catch (Throwable th) {
                                C0iy.A00().Bwu(0gL.A00(this.A00), th, null);
                                0jV r05 = C0g6.A6R;
                                String A0b = AnonymousClass001.A0b(r05, c0qh.A09);
                                if (A0b == null) {
                                    A0b = "";
                                }
                                c0qh.A05(r05, 0Pz.A10(A0b, "Error: ", 0gL.A00(r04.Ayh()), ": ", th.getMessage(), "\n"));
                            }
                            i = i2 + 1;
                        }
                    }
                };
            case 11:
                num = 0S2.A14;
                C15h c15h2 = c0hg.A08;
                if (c15h2 == null) {
                    c15h2 = new C0u5(c0hg, 10);
                    c0hg.A08 = c15h2;
                }
                ?? obj8 = new Object();
                obj8.A00 = c15h2;
                r305 = new 0gG[]{obj8};
                final Integer num32 = num;
                final 0gG[] r22 = r305;
                return new 0gG(num32, r22) { // from class: X.0qg
                    public final Integer A00;
                    public final 0gG[] A01;

                    {
                        this.A00 = num32;
                        this.A01 = r22;
                    }

                    public Integer Ayh() {
                        return this.A00;
                    }

                    public /* synthetic */ boolean BN1(Integer num322) {
                        return false;
                    }

                    public void CXo(C0qh c0qh, C0gq c0gq) {
                        0gG[] r032 = this.A01;
                        int length = r032.length;
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= length) {
                                return;
                            }
                            0gG r04 = r032[i2];
                            try {
                                r04.CXo(c0qh, c0gq);
                            } catch (Throwable th) {
                                C0iy.A00().Bwu(0gL.A00(this.A00), th, null);
                                0jV r05 = C0g6.A6R;
                                String A0b = AnonymousClass001.A0b(r05, c0qh.A09);
                                if (A0b == null) {
                                    A0b = "";
                                }
                                c0qh.A05(r05, 0Pz.A10(A0b, "Error: ", 0gL.A00(r04.Ayh()), ": ", th.getMessage(), "\n"));
                            }
                            i = i2 + 1;
                        }
                    }
                };
            case 12:
            case 13:
                c0hg.A0K.getPackageName();
                return new Object();
            case 14:
                return new C05n(c0hg.A0K, c0hg.A06(), 0iP.A0J);
            case 18:
            default:
                return null;
            case 19:
                final Application application5 = c0hg.A0K;
                final 0jH A073 = c0hg.A07();
                final 0gK A06 = c0hg.A06();
                return new C0iO(application5, A06, A073) { // from class: X.0hd
                    public final Application A00;
                    public final 0gK A01;
                    public final 0jH A02;

                    {
                        this.A00 = application5;
                        this.A02 = A073;
                        this.A01 = A06;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ int getHealthEventSamplingRate() {
                        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ C0l0 getLimiter() {
                        return null;
                    }

                    @Override // X.C0iO
                    public 0iP getName() {
                        return 0iP.A0Q;
                    }

                    @Override // X.C0iO
                    public void start() {
                        C0qh A00 = C0qh.A00();
                        HashMap A03 = C0fw.A03();
                        String str = (String) A03.get(ErrorReportingConstants.REPORT_SOURCE_OVERRIDE_PROP);
                        if (!TextUtils.isEmpty(str)) {
                            0fH.A0j("lacrima", "ReportSourceDetector... start");
                            A00.A05(C0g6.A98, str);
                            String A022 = C0fw.A02(A03);
                            if (TextUtils.isEmpty(A022)) {
                                File A0D = AnonymousClass001.A0D(this.A02.A06, "report_source");
                                A00.A06(0gD.A0F, C0gq.CRITICAL_REPORT, AnonymousClass001.A0D(A0D, ErrorReportingConstants.REPORT_SOURCE_REF_FILE_NAME));
                            } else {
                                A00.A05(C0g6.A9A, A022);
                            }
                        }
                        String str2 = (String) A03.get("fb.testing.build_target");
                        if (!TextUtils.isEmpty(str2)) {
                            0fH.A0g(str2, "lacrima", "Overriding mobile_build_target from prop: %s");
                            A00.A05(C0g6.A7I, str2);
                        }
                        String str3 = (String) A03.get("ig.ig_server_rev_hash");
                        if (!TextUtils.isEmpty(str3)) {
                            0fH.A0g(str3, "lacrima", "Saving Instagram Server Revision Hash: %s");
                            A00.A05(C0g6.A62, str3);
                        }
                        String A023 = 0WL.A02(ErrorReportingConstants.REPORT_FURY_TRACES_FILE_PROP);
                        if (!TextUtils.isEmpty(A023)) {
                            File filesDir = this.A00.getFilesDir();
                            A00.A06(0gD.A0A, C0gq.CRITICAL_REPORT, AnonymousClass001.A0D(filesDir, A023));
                        }
                        0gK r04 = this.A01;
                        r04.A0A(A00, C0gq.CRITICAL_REPORT, this);
                        r04.A0A(A00, C0gq.LARGE_REPORT, this);
                    }
                };
            case 20:
                return new 0qR(c0hg.A0K);
            case 21:
                final Application application6 = c0hg.A0K;
                return new 0gG(application6, c0hg, this) { // from class: X.117
                    public final Context A00;
                    public final /* synthetic */ C0hg A01;
                    public final /* synthetic */ C0tl A02;

                    {
                        this.A02 = this;
                        this.A01 = c0hg;
                        this.A00 = application6;
                    }

                    public static void A00(Context context, C0qh c0qh) {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null) {
                            c0qh.A02(C0g6.A06, packageManager.hasSystemFeature("android.hardware.ram.low"));
                        }
                    }

                    public static void A01(C0qh c0qh) {
                        c0qh.A05(C0g6.A9N, Build.VERSION.SECURITY_PATCH);
                    }

                    public Integer Ayh() {
                        return 0S2.A07;
                    }

                    public /* synthetic */ boolean BN1(Integer num4) {
                        return false;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:26:0x0195, code lost:
                    
                        if (r0.contains("/system/framework/core.jar") != false) goto L7;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0136  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void CXo(X.C0qh r302, X.C0gq r303) {
                        /*
                            Method dump skipped, instructions count: 418
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass117.CXo(X.0qh, X.0gq):void");
                    }
                };
            case 22:
                if (C0fu.A00() == null) {
                    0oU r04 = new 0oU(c0hg, this);
                    synchronized (C0fu.class) {
                        C0fu.A00 = r04;
                    }
                }
                final 0jH A074 = c0hg.A07();
                final 0gK A062 = c0hg.A06();
                return new C0iO(A062, A074) { // from class: X.0h2
                    public final 0gK A00;
                    public final 0jH A01;

                    {
                        this.A01 = A074;
                        this.A00 = A062;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ int getHealthEventSamplingRate() {
                        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ C0l0 getLimiter() {
                        return null;
                    }

                    @Override // X.C0iO
                    public 0iP getName() {
                        return 0iP.A0S;
                    }

                    @Override // X.C0iO
                    public void start() {
                        0fH.A0j("lacrima", "StartupDetector... start");
                        C0qh A00 = C0qh.A00();
                        A00.A05(C0g6.A4V, this.A01.A08);
                        0gK r05 = this.A00;
                        r05.A0A(A00, C0gq.CRITICAL_REPORT, this);
                        r05.A0A(A00, C0gq.LARGE_REPORT, this);
                    }
                };
            case 23:
                final 0jH A075 = c0hg.A07();
                final 0gK A063 = c0hg.A06();
                return new C0iO(A063, A075) { // from class: X.01z
                    public final 0gK A00;
                    public final 0jH A01;

                    {
                        this.A01 = A075;
                        this.A00 = A063;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ int getHealthEventSamplingRate() {
                        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ C0l0 getLimiter() {
                        return null;
                    }

                    @Override // X.C0iO
                    public 0iP getName() {
                        return 0iP.A0H;
                    }

                    @Override // X.C0iO
                    public void start() {
                        0fH.A0j("lacrima", "LateStartupDetector... start");
                        C0qh c0qh = new C0qh(null);
                        c0qh.A05(C0g6.A4V, this.A01.A08);
                        0gK r05 = this.A00;
                        C0gq c0gq = C0gq.CRITICAL_REPORT;
                        r05.A0E(c0gq, this);
                        r05.A09(c0qh, c0gq, this);
                        r05.A0D(c0gq, this);
                        C0gq c0gq2 = C0gq.LARGE_REPORT;
                        r05.A0E(c0gq2, this);
                        r05.A09(c0qh, c0gq2, this);
                        r05.A0D(c0gq2, this);
                    }
                };
            case 24:
                return new 0L5(c0hg.A06());
            case 25:
                return new 0iS(c0hg.A06());
            case 26:
                return new 0iF(c0hg.A06(), C0ft.A04);
            case 27:
                return new 06K(c0hg.A06());
            case 28:
                return new C0hj(c0hg.A06(), c0hg.A07());
            case 29:
                final 0jH A076 = c0hg.A07();
                return new C0iO(A076) { // from class: X.0jZ
                    public static C0jZ A01;
                    public final 0jH A00;

                    {
                        this.A00 = A076;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ int getHealthEventSamplingRate() {
                        return LocationComponentCompassEngine.SENSOR_DELAY_MICROS;
                    }

                    @Override // X.C0iO
                    public /* synthetic */ C0l0 getLimiter() {
                        return null;
                    }

                    @Override // X.C0iO
                    public 0iP getName() {
                        return 0iP.A06;
                    }

                    @Override // X.C0iO
                    public void start() {
                        A01 = this;
                    }
                };
            case 30:
                Application application7 = c0hg.A0K;
                ?? obj9 = new Object();
                ((0qM) obj9).A00 = application7;
                return obj9;
            case 34:
                return new C01x(c0hg.A06());
            case 36:
                return new 0qX(c0hg.A0K, 0S2.A01);
            case 37:
                File A022 = c0hg.A07().A02("");
                if (A022 != null) {
                    return new 0FG(A022);
                }
                return null;
        }
    }
}
