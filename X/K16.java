package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: K16.class */
public final class K16 extends LbO {
    public static HashMap A00 = AnonymousClass001.A0u();

    public long AW2(6Vl r302, long j) {
        if (((LbO) this).A0Z.A1D) {
            return super.AW2(r302, j);
        }
        L5F[] l5fArr = ((LbO) this).A0l;
        int length = l5fArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return j;
            }
            L5F l5f = l5fArr[i2];
            if (l5f.A02 != null) {
                long B9Y = l5f.A02.B9Y(l5f.A00);
                if (B9Y != 0) {
                    long A05 = l5f.A05(j);
                    long A002 = L5F.A00(l5f, A05);
                    if (A002 < j && (B9Y == -1 || A05 < ((l5f.A02.Amb() + l5f.A01) + B9Y) - 1)) {
                        A002 = L5F.A00(l5f, A05 + 1);
                    }
                    return r302.A00(j, A002, A002);
                }
            }
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0761, code lost:
    
        if (r345 <= r0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0917, code lost:
    
        if (r0.A00 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0942, code lost:
    
        if (r0 != 2) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x031d, code lost:
    
        if (r0.A00 != false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0504  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Az8(X.KjT r302, X.K15 r303, java.util.List r304, long r305, long r307, long r309, long r311) {
        /*
            Method dump skipped, instructions count: 3157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K16.Az8(X.KjT, X.K15, java.util.List, long, long, long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bo3(Lbf lbf, KkU kkU, 6ZG r304, long j, boolean z, boolean z2) {
        Object obj;
        6Dd r0;
        int i;
        long j2;
        boolean z3;
        7yK r02;
        Object obj2;
        Object obj3;
        boolean z4;
        boolean z5;
        String str;
        int i2;
        Lah lah;
        6XP r03 = ((LbO) this).A0Z;
        if (r03.A1E) {
            return super.Bo3(lbf, kkU, r304, j, z, true);
        }
        HashMap A0B = A0B();
        A0D(A0B);
        6DO r04 = lbf.A06.A07;
        boolean z6 = r04.A0U;
        A0B.put("is_predicted", Boolean.valueOf(z6));
        int i3 = r04.A02;
        Integer valueOf = Integer.valueOf(i3);
        A0B.put("segment_predicted_number", valueOf);
        6Dd r05 = kkU.A03;
        if (r05 != null) {
            A0B.put("exception", r05.getLocalizedMessage());
            StringWriter stringWriter = new StringWriter();
            r05.printStackTrace(new PrintWriter(stringWriter));
            A0B.put(AnonymousClass000.A00(9), stringWriter.toString());
        }
        boolean z7 = false;
        if (z) {
            boolean z8 = r03.A0R;
            if (!z8) {
                ((LbO) this).A0U++;
            }
            long j3 = ((LbO) this).A0T;
            long j4 = lbf.A02;
            boolean A1N = AnonymousClass001.A1N((j3 > j4 ? 1 : (j3 == j4 ? 0 : -1)));
            ((LbO) this).A0T = j4;
            boolean z9 = r05 instanceof 6Dd;
            if (z9) {
                6Dd r06 = r05;
                boolean A02 = 7uP.A02(r06.headerFields, r03.A02);
                A0B.put("response_code", Integer.valueOf(r06.responseCode));
                int i4 = r06.responseCode;
                if (i4 == 404) {
                    if (z8) {
                        ((LbO) this).A0U++;
                    }
                    if (lbf instanceof K14) {
                        long j5 = ((K14) lbf).A04;
                        if (j5 > 0) {
                            A0E(r06.headerFields, j5);
                        }
                    }
                }
                long j6 = 5;
                if (i4 == 404) {
                    if (((LbO) this).A0U < j6) {
                        Lah lah2 = ((LbO) this).A0f;
                        if (lah2 != null) {
                            z4 = true;
                            if (lah2.A01(lbf, true)) {
                                ((LbO) this).A0N = true;
                                A0B.put("cancel", "true");
                                A0B.put("reason", "requested_manifest_refresh");
                            }
                        }
                        if (((LbO) this).A0G.A0S) {
                            A0B.put("cancel", "true");
                            A0B.put("reason", "dynamic_manifest");
                            ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
                            return true;
                        }
                    }
                    if (!((LbO) this).A0G.A0S && z6 && r03.A0t) {
                        obj2 = "static_manifest_and_predicted";
                        A0B.put("reason", obj2);
                        z4 = true;
                        GOn.A1Z("cancel", A0B, z4);
                    }
                    ((LbO) this).A0I = r06;
                    obj2 = "fatal";
                    A0B.put("reason", obj2);
                    z4 = true;
                    GOn.A1Z("cancel", A0B, z4);
                } else {
                    if (i4 != 410 && i4 != 417 && i4 != 403) {
                        if (i4 == 504 && (lah = ((LbO) this).A0f) != null && lah.A01(lbf, A1N)) {
                            z4 = true;
                            ((LbO) this).A0N = true;
                            A0B.put("reason", "504");
                            GOn.A1Z("cancel", A0B, z4);
                        } else {
                            if (((LbO) this).A0U >= j6) {
                                ((LbO) this).A0I = r06;
                                A0B.put("reason", "too_many_retries");
                                z7 = true;
                                GOn.A1Z("cancel", A0B, true);
                                A0B.put("exception", r06);
                                ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
                                return z7;
                            }
                            if (i4 == 503) {
                                if (A02 || r03.A15) {
                                    ((LbO) this).A0S++;
                                    A0B.put("reason", "one_503");
                                    6DB r07 = ((LbO) this).A0Y;
                                    r07.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
                                    if (((LbO) this).A0W == 3 || (i2 = r03.A06) <= 0 || ((LbO) this).A0S < i2) {
                                        z5 = false;
                                        GOn.A1Z("cancel", A0B, false);
                                        str = "retrying_503_limit_NOT_reached";
                                    } else {
                                        ((LbO) this).A0I = r06;
                                        z5 = true;
                                        GOn.A1Z("cancel", A0B, true);
                                        A0B.put("exception", r06);
                                        str = "retrying_503_limit_reached";
                                    }
                                    r07.BZw(str, "DefaultDashChunkSourceUpgraded", A0B);
                                    return z5;
                                }
                            } else if (i4 == 416) {
                                if (A02) {
                                    obj2 = "416";
                                    A0B.put("reason", obj2);
                                    z4 = true;
                                    GOn.A1Z("cancel", A0B, z4);
                                }
                            } else if (i4 != 500 && A02 && r03.A0l) {
                                obj = "one_semantics";
                                A0B.put("reason", obj);
                                z4 = false;
                                GOn.A1Z("cancel", A0B, z4);
                            }
                        }
                    }
                    ((LbO) this).A0I = r06;
                    obj2 = "fatal";
                    A0B.put("reason", obj2);
                    z4 = true;
                    GOn.A1Z("cancel", A0B, z4);
                }
                ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
                return z4;
            }
            long j7 = r03.A0G;
            if (j7 > 0 && (r05 instanceof 6Db)) {
                ((LbO) this).A09++;
                long j8 = i3;
                long j9 = j8 - 1;
                HashMap hashMap = ((LbO) this).A0K;
                Object obj4 = hashMap.get(Long.valueOf(j9));
                int i5 = 0;
                while (obj4 != null) {
                    j9--;
                    i5++;
                    obj4 = hashMap.get(Long.valueOf(j9));
                }
                if (((LbO) this).A09 > j7 && i5 <= r03.A0H) {
                    z7 = true;
                }
                A0B.put("reason", "http_data_error");
                GOn.A1Z("cancel", A0B, z7);
                LbO.A05(this, valueOf, A0B, i5);
                ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
                if (z7) {
                    ((LbO) this).A09 = 0L;
                    GOn.A1Y(Long.valueOf(j8), hashMap, i3 + 1);
                    Lah lah3 = ((LbO) this).A0f;
                    if (lah3 != null) {
                        lah3.A01(lbf, true);
                    }
                    KpI kpI = ((LbO) this).A0o;
                    if (kpI != null) {
                        StringWriter stringWriter2 = new StringWriter();
                        ((Throwable) r05).printStackTrace(new PrintWriter(stringWriter2));
                        kpI.A00("NETWORK_SOURCE", "ERROR_IO", String.format("SkipSegmentOnError: PredictedNumber=%s, Exception=%s", DKG.A1b(stringWriter2, valueOf)));
                        return z7;
                    }
                }
                return z7;
            }
            Lah lah4 = ((LbO) this).A0f;
            if (lah4 == null || !lah4.A01(lbf, false)) {
                if (!((LbO) this).A0G.A0S && (lbf instanceof K15) && z9 && r05.responseCode == 404) {
                    L5F l5f = ((LbO) this).A0l[((LbO) this).A0H.BOa(lbf.A05)];
                    long B9Y = l5f.A02.B9Y(l5f.A00);
                    if (B9Y != -1 && B9Y != 0 && ((K15) lbf).A00() > ((l5f.A02.Amb() + l5f.A01) + B9Y) - 1) {
                        z7 = true;
                        ((LbO) this).A0Q = true;
                        obj3 = "missing_segment_workaround";
                    }
                }
                6Y9 r08 = ((LbO) this).A0H;
                6Yl r09 = lbf.A05;
                int BOa = r08.BOa(r09);
                L5F[] l5fArr = ((LbO) this).A0l;
                L5F l5f2 = l5fArr[BOa];
                L87 l87 = ((LbO) this).A0d;
                Krl A022 = l87.A02(l5f2.A03.A05);
                if (A022 == null || l5f2.A07.equals(A022)) {
                    6Y9 r010 = ((LbO) this).A0H;
                    List list = l5f2.A03.A05;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int length = r010.length();
                    int i6 = 0;
                    for (int i7 = 0; i7 < length; i7++) {
                        if (r010.BQv(i7, elapsedRealtime)) {
                            i6++;
                        }
                    }
                    HashSet A0v = AnonymousClass001.A0v();
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        AnonymousClass001.A1J(A0v, ((Krl) list.get(i8)).A00);
                    }
                    int size = A0v.size();
                    HashSet A0v2 = AnonymousClass001.A0v();
                    ArrayList A002 = L87.A00(l87, list);
                    for (int i9 = 0; i9 < A002.size(); i9++) {
                        AnonymousClass001.A1J(A0v2, ((Krl) A002.get(i9)).A00);
                    }
                    int size2 = size - A0v2.size();
                    int i10 = length - i6;
                    if (i10 > 1 || size - size2 > 1) {
                        if (z9 && ((i = (r0 = r05).responseCode) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503)) {
                            boolean z10 = true;
                            if (size - size2 > 1) {
                                j2 = 300000;
                            } else {
                                z10 = 2;
                                if (i10 > 1) {
                                    j2 = 60000;
                                    size = length;
                                    size2 = i6;
                                }
                            }
                            if (size - size2 > 1) {
                                if (z10 == 2) {
                                    6Y9 r011 = ((LbO) this).A0H;
                                    z3 = r011.ACP(r011.BOa(r09), j2);
                                } else {
                                    Krl krl = l5f2.A07;
                                    long elapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                                    String str2 = krl.A02;
                                    java.util.Map map = l87.A01;
                                    long j10 = elapsedRealtime2;
                                    if (map.containsKey(str2)) {
                                        j10 = Math.max(elapsedRealtime2, AnonymousClass001.A05(map.get(str2)));
                                    }
                                    AnonymousClass001.A18(str2, j10, map);
                                    int i11 = krl.A00;
                                    if (i11 != ((-1) << (-1))) {
                                        Integer valueOf2 = Integer.valueOf(i11);
                                        java.util.Map map2 = l87.A00;
                                        if (map2.containsKey(valueOf2)) {
                                            elapsedRealtime2 = Math.max(elapsedRealtime2, AnonymousClass001.A05(map2.get(valueOf2)));
                                        }
                                        AnonymousClass001.A18(valueOf2, elapsedRealtime2, map2);
                                    }
                                    z3 = true;
                                }
                                Boolean valueOf3 = Boolean.valueOf(z3);
                                AnonymousClass001.A1G("Track: blockListed=%s, chunk.trackFormat=%s, responseCode=%s", "DefaultDashChunkSourceUpgraded", 1BK.A1a(valueOf3, r09, r0.responseCode));
                                if (Boolean.FALSE.equals(valueOf3) && (r02 = C7to.A02.A00) != null) {
                                    String valueOf4 = String.valueOf(r0.responseCode);
                                    StringBuilder A0k = AnonymousClass001.A0k();
                                    A0k.append(r05.getMessage());
                                    A0k.append(", format=");
                                    A0k.append(r09);
                                    r02.Bwa(GOm.A00(15), valueOf4, AnonymousClass001.A0d(", blocklisting failed", A0k), r05, (java.util.Map) null);
                                }
                                ((LbO) this).A01 = z3 ? BOa : -1;
                                ((LbO) this).A0J = r05;
                                String str3 = l5fArr[BOa].A07.A03;
                                Integer valueOf5 = Integer.valueOf(BOa);
                                final Lbp lbp = new Lbp(r05, str3, String.format("Track:[%b, %d of %d, %s]", valueOf3, valueOf5, Integer.valueOf(((LbO) this).A0H.length()), r09.toString()), 1);
                                ((LbO) this).A0c.A0F(new C6aq() { // from class: X.Lbm
                                    @Override // X.C6aq
                                    public final void accept(Object obj5) {
                                        C6aq c6aq = C6aq.this;
                                        if (obj5 instanceof 6Vp) {
                                            c6aq.accept(obj5);
                                        }
                                    }
                                });
                                if (r03.A0T) {
                                    A0B.put("track_index", valueOf5);
                                    A0B.put("track_format", r09.toString());
                                    A0B.put("track_selection", 1BK.A0j(((LbO) this).A0H));
                                    A0B.put("block_succeeded", valueOf3);
                                    A0B.put(TraceFieldType.StatusCode, Integer.valueOf(r0.responseCode));
                                    ((LbO) this).A0Y.BZw("blockListedTrack", "DefaultDashChunkSourceUpgraded", A0B);
                                }
                                A0B.put("cancel", valueOf3);
                                ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
                                return z3;
                            }
                        }
                        obj = "no_fallback_resources_are_available";
                    } else {
                        obj = "no_fallback_options_are_available";
                    }
                    A0B.put("reason", obj);
                    z4 = false;
                    GOn.A1Z("cancel", A0B, z4);
                    ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
                    return z4;
                }
                obj2 = "base_url_has_changed";
            } else {
                obj2 = "fall_through_manifest_refrsh";
            }
            A0B.put("reason", obj2);
            z4 = true;
            GOn.A1Z("cancel", A0B, z4);
            ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
            return z4;
        }
        obj3 = "non_cancelable";
        A0B.put("reason", obj3);
        GOn.A1Z("cancel", A0B, z7);
        ((LbO) this).A0Y.BZw("on_chunk_load_error", "DefaultDashChunkSourceUpgraded", A0B);
        return z7;
    }
}
