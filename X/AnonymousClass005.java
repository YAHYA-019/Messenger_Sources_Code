package X;

import android.text.TextUtils;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.005, reason: invalid class name */
/* loaded from: 005.class */
public final class AnonymousClass005 implements 0gG {
    public byte A00;
    public byte A01;
    public byte A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public final File A0A;

    public AnonymousClass005(File file) {
        this.A0A = file;
    }

    private byte A00(ByteBuffer byteBuffer) {
        if (byteBuffer.position() >= this.A05) {
            byteBuffer.position(this.A04);
        }
        return byteBuffer.get();
    }

    private int A01(ByteBuffer byteBuffer) {
        int i = 0;
        int i2 = 0;
        int i3 = 24;
        do {
            i2 += (A00(byteBuffer) & 255) << i3;
            i3 -= 8;
            i++;
        } while (i < 4);
        return i2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0gf, java.lang.Exception] */
    public static C0gf A02(Exception exc, String str) {
        return new Exception(0Pz.A0W(str, A03(exc)), exc);
    }

    public static String A03(Exception exc) {
        try {
            String A01 = 04A.A01(exc);
            if (TextUtils.isEmpty(A01.trim())) {
                return "No stack trace";
            }
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(exc);
            return AnonymousClass001.A0d(04A.A00(A01, 1000), A0k);
        } catch (Throwable th) {
            C0iy.A00().Bwu("LooperHistoryCollectStackTrace", th, null);
            return 0Pz.A0W(exc.getMessage(), ": truncated trace");
        }
    }

    private JSONObject A04(0hV r302, ByteBuffer byteBuffer, boolean z) {
        String str;
        JSONObject A12 = AnonymousClass001.A12();
        int A01 = A01(byteBuffer);
        JSONObject A122 = AnonymousClass001.A12();
        A122.put("msg_target", r302.A01(A05(byteBuffer)));
        String A012 = r302.A01(A05(byteBuffer));
        if (A012 != null) {
            A122.put("msg_callback", A012);
        }
        A122.put("msg_what", A01(byteBuffer));
        String A013 = r302.A01(A05(byteBuffer));
        if (A013 != null) {
            A122.put("msg_obj", A013);
        }
        short A05 = A05(byteBuffer);
        if (A05 > 0) {
            A122.put("wait_time_ms", (int) A05);
        }
        A12.put("msg", A122);
        A12.put("current-gap_ms", A01);
        long j = 0;
        int i = 56;
        int i2 = 0;
        do {
            j += (A00(byteBuffer) & 255) << i;
            i -= 8;
            i2++;
        } while (i2 < 8);
        A12.put("unix_start_time_ms", j);
        A12.put("finished", z);
        byte A00 = A00(byteBuffer);
        if (A00 != 1) {
            str = A00 == 2 ? "bg" : "fg";
            return A12;
        }
        A12.put("app_starting_status", str);
        return A12;
    }

    private short A05(ByteBuffer byteBuffer) {
        int i = 0;
        short s = 0;
        int i2 = 8;
        do {
            s = (short) (s + ((A00(byteBuffer) & 255) << i2));
            i2 -= 8;
            i++;
        } while (i < 2);
        return s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0228  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v100, types: [int] */
    /* JADX WARN: Type inference failed for: r0v108, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44, types: [int] */
    /* JADX WARN: Type inference failed for: r304v0, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06(X.0hV r302, java.nio.ByteBuffer r303, org.json.JSONObject r304) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass005.A06(X.0hV, java.nio.ByteBuffer, org.json.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(java.nio.ByteBuffer r302, org.json.JSONObject r303, boolean r304) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            int r0 = r0.A01(r1)
            r305 = r0
            r0 = r301
            r1 = r302
            int r0 = r0.A01(r1)
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L67
            r0 = r303
            java.lang.String r1 = "duration_ms"
            r2 = r305
            org.json.JSONObject r0 = r0.put(r1, r2)
            java.lang.String r0 = "duration_cpu_ms"
            r307 = r0
            r0 = r303
            r1 = r307
            r2 = r306
            org.json.JSONObject r0 = r0.put(r1, r2)
            r0 = r301
            r1 = r302
            byte r0 = r0.A00(r1)
            r308 = r0
            java.lang.String r0 = "app_in_progress_status"
            r309 = r0
            java.lang.String r0 = "app_finishing_status"
            r310 = r0
            r0 = 1
            r306 = r0
            r0 = r308
            r1 = r306
            if (r0 != r1) goto L68
            r0 = r304
            if (r0 != 0) goto L49
            r0 = r310
            r309 = r0
        L49:
            java.lang.String r0 = "fg"
            r307 = r0
        L4d:
            r0 = r303
            r1 = r309
            r2 = r307
            org.json.JSONObject r0 = r0.put(r1, r2)
        L56:
            r0 = r304
            if (r0 != 0) goto L67
            java.lang.String r0 = "finished"
            r307 = r0
            r0 = r303
            r1 = r307
            r2 = r306
            org.json.JSONObject r0 = r0.put(r1, r2)
        L67:
            return
        L68:
            r0 = 2
            r311 = r0
            r0 = r308
            r1 = r311
            if (r0 != r1) goto L56
            r0 = r304
            if (r0 != 0) goto L7a
            r0 = r310
            r309 = r0
        L7a:
            java.lang.String r0 = "bg"
            r307 = r0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass005.A07(java.nio.ByteBuffer, org.json.JSONObject, boolean):void");
    }

    public Integer Ayh() {
        return 0S2.A17;
    }

    public /* synthetic */ boolean BN1(Integer num) {
        return false;
    }

    public void CXo(C0qh c0qh, C0gq c0gq) {
        Throwable th;
        int i;
        File file = this.A0A;
        if (file != null) {
            File file2 = new File(file, "looper.bin");
            if (file2.exists()) {
                0hV r0 = new 0hV(file, true);
                long length = file2.length();
                int i2 = 44;
                if (length <= 32767) {
                    i2 = 42;
                }
                this.A04 = i2;
                try {
                    try {
                        FileChannel channel = AnonymousClass001.A0H(file2).getChannel();
                        ByteBuffer allocate = ByteBuffer.allocate(this.A04);
                        channel.read(allocate);
                        byte A01 = AnonymousClass001.A01(allocate);
                        this.A02 = A01;
                        if (A01 == 11) {
                            allocate.get();
                            int i3 = length <= 32767 ? allocate.getShort() : allocate.getInt();
                            this.A08 = allocate.getLong();
                            int i4 = allocate.getInt();
                            this.A05 = i4;
                            if (i4 == length && i3 >= this.A04 && i3 < i4) {
                                this.A06 = allocate.getInt();
                                this.A03 = allocate.getInt();
                                this.A07 = allocate.getLong();
                                this.A00 = allocate.get();
                                this.A09 = allocate.getLong();
                                this.A01 = allocate.get();
                                ByteBuffer allocate2 = ByteBuffer.allocate(this.A05);
                                allocate2.position(this.A04);
                                channel.read(allocate2);
                                allocate2.position(this.A04);
                                0jV r02 = C0g6.A8j;
                                JSONObject A12 = AnonymousClass001.A12();
                                ArrayList A0s = AnonymousClass001.A0s();
                                allocate2.position(i3);
                                JSONObject jSONObject = null;
                                int i5 = 0;
                                do {
                                    try {
                                        byte A00 = A00(allocate2);
                                        int i6 = i5 + 1;
                                        if (A00 == 0) {
                                            break;
                                        }
                                        int position = allocate2.position();
                                        if (A00 == 1) {
                                            jSONObject = A04(r0, allocate2, true);
                                            A07(allocate2, jSONObject, false);
                                        } else if (A00 == 5) {
                                            jSONObject = A04(r0, allocate2, true);
                                            A07(allocate2, jSONObject, false);
                                            A06(r0, allocate2, jSONObject);
                                        } else if (A00 == 2) {
                                            jSONObject = A04(r0, allocate2, false);
                                        } else {
                                            if (A00 != 3) {
                                                if (A00 != 4) {
                                                    if (A00 != 7) {
                                                        if (A00 != 6) {
                                                            break;
                                                        }
                                                        A07(allocate2, jSONObject, true);
                                                        A06(r0, allocate2, jSONObject);
                                                    } else {
                                                        A07(allocate2, jSONObject, true);
                                                    }
                                                } else {
                                                    A07(allocate2, jSONObject, false);
                                                    A06(r0, allocate2, jSONObject);
                                                }
                                            } else {
                                                A07(allocate2, jSONObject, false);
                                            }
                                            jSONObject = null;
                                        }
                                        int position2 = allocate2.position();
                                        if (position2 > position) {
                                            i = position2 - position;
                                        } else {
                                            i6 += this.A05 - position;
                                            i = position2 - this.A04;
                                        }
                                        i5 = i6 + i;
                                        if (jSONObject != null) {
                                            A0s.add(0, jSONObject);
                                        }
                                        if (allocate2.position() == i3) {
                                            break;
                                        }
                                    } catch (BufferUnderflowException e) {
                                        C0iy.A00().Bwu("LooperHistoryCollectJsonUnderflow", e, null);
                                        throw A02(e, "Exception reading history buffer:");
                                    } catch (JSONException e2) {
                                        C0iy.A00().Bwu("LooperHistoryCollectJsonEx", e2, null);
                                        throw A02(e2, "Exception creating JSON looper history:");
                                    } catch (Exception e3) {
                                        C0iy.A00().Bwu("LooperHistoryCollectJsonOther", e3, null);
                                        throw A02(e3, "Exception getting looper history:");
                                    }
                                } while (i5 <= this.A05);
                                long j = this.A08;
                                if (!A0s.isEmpty()) {
                                    JSONObject jSONObject2 = (JSONObject) A0s.get(0);
                                    long j2 = jSONObject2.getInt("current-gap_ms");
                                    if (jSONObject2.has("duration_ms")) {
                                        j2 += jSONObject2.getInt("duration_ms");
                                    }
                                    j = this.A08 + j2;
                                    Iterator it = A0s.iterator();
                                    while (it.hasNext()) {
                                        JSONObject jSONObject3 = (JSONObject) it.next();
                                        boolean z = jSONObject3.getBoolean("finished");
                                        long j3 = j2 - jSONObject3.getInt("current-gap_ms");
                                        if (z) {
                                            jSONObject3.put("current-from_ms_ago", j3);
                                        } else {
                                            jSONObject3.put("current-running_ms", j3);
                                            jSONObject3.remove("duration_ms");
                                            jSONObject3.remove("duration_cpu_ms");
                                        }
                                        jSONObject3.remove("current-gap_ms");
                                        jSONObject3.remove("finished");
                                    }
                                }
                                A12.put(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY, this.A02 & 255);
                                A12.put(AsyncBroadcastReceiverObserver.CURRENT_UPTIME_MS, j);
                                A12.put("config_duration", this.A05);
                                A12.put("config_threshold_ms", this.A06);
                                int i7 = this.A03;
                                if (i7 > 0) {
                                    A12.put("exec_monitor_threshold_ms", i7);
                                }
                                A12.put("app_status_change_unix_time_ms", this.A07);
                                byte b = this.A00;
                                A12.put("app_status", b == 1 ? "fg" : b == 2 ? "bg" : "unknown");
                                A12.put("prev_app_status_change_unix_time_ms", this.A09);
                                byte b2 = this.A01;
                                A12.put("prev_app_status", b2 == 1 ? "fg" : b2 == 2 ? "bg" : "unknown");
                                A12.put("history", new JSONArray((Collection) A0s));
                                c0qh.A05(r02, A12.toString());
                                return;
                            }
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("Exception reading header - ReadPos:");
                            A0k.append(i3);
                            A0k.append(" HeaderSize:");
                            A0k.append(this.A04);
                            A0k.append(" size:");
                            A0k.append(i4);
                            A0k.append(" fileLength:");
                            new Exception(AnonymousClass001.A0h(A0k, length));
                        } else {
                            StringBuilder A1D = 0Pz.A1D("Exception reading header - bufferVersion:", " collectorVersion:", A01);
                            A1D.append(11);
                            new Exception(A1D.toString());
                        }
                        throw th;
                    } catch (FileNotFoundException e4) {
                        C0iy.A00().Bwu("LooperHistoryCollectFileNotFound", e4, null);
                        throw A02(e4, "File not found:");
                    } catch (IOException e5) {
                        C0iy.A00().Bwu("LooperHistoryCollectIOEx", e5, null);
                        throw A02(e5, "Exception accessing file:");
                    } catch (IllegalArgumentException e6) {
                        C0iy.A00().Bwu("LooperHistoryCollectIllegalArg", e6, null);
                        throw A02(e6, "Exception creating header:");
                    }
                } catch (BufferUnderflowException e7) {
                    C0iy.A00().Bwu("LooperHistoryCollectBufUnderFlow", e7, null);
                    throw A02(e7, "Exception reading header:");
                }
            }
        }
    }
}
