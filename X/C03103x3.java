package X;

import android.os.Build;
import com.facebook.memorytimeline.renderthread.RenderThreadStatsMemoryTimelineMetricSource$NativeImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3x3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3x3.class */
public final class C03103x3 implements 0Cq {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Pattern A0F = Pattern.compile("(\\d+\\.\\d+)\\s([KkMmGg]B|bytes)");
    public final Pattern A0E = Pattern.compile("numLayers\\s+=\\s+(\\d+)");
    public final 2NA A0D = new 2NA() { // from class: X.3x4
        public String Asm() {
            return "raw_render_thread_stats";
        }

        public String getValue() {
            return null;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:22:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long A00(java.util.regex.Matcher r301) {
        /*
            r0 = r301
            int r0 = r0.groupCount()
            r302 = r0
            r0 = 2
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r303
            if (r0 < r1) goto La3
            r0 = r301
            r1 = r303
            java.lang.String r0 = r0.group(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto La3
            r0 = 0
            r307 = r0
            r0 = r306
            r1 = 0
            char r0 = r0.charAt(r1)
            r302 = r0
            r0 = 71
            r303 = r0
            r0 = 0
            r308 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L8b
            r0 = 75
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L83
            r0 = 77
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L7b
            r0 = 98
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L73
            r0 = 103(0x67, float:1.44E-43)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L8b
            r0 = 107(0x6b, float:1.5E-43)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L83
            r0 = 109(0x6d, float:1.53E-43)
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L7b
            r0 = 0
            r310 = r0
        L62:
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r303
            java.lang.String r0 = r0.group(r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La3
            goto L93
        L73:
            r0 = 4562146422526312448(0x3f50000000000000, double:9.765625E-4)
            r310 = r0
            goto L62
        L7b:
            r0 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r310 = r0
            goto L62
        L83:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r310 = r0
            goto L62
        L8b:
            r0 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            r310 = r0
            goto L62
        L93:
            r0 = r307
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> La5
            r308 = r0
        L9a:
            r0 = r308
            r1 = r310
            double r0 = r0 * r1
            long r0 = java.lang.Math.round(r0)
            return r0
        La3:
            r0 = r304
            return r0
        La5:
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03103x3.A00(java.util.regex.Matcher):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Collection getDataPoints() {
        boolean z;
        boolean z2;
        String nativeGetNativeRenderThreadStats = RenderThreadStatsMemoryTimelineMetricSource$NativeImpl.nativeGetNativeRenderThreadStats(Build.VERSION.SDK_INT);
        ArrayList arrayList = new ArrayList();
        if (nativeGetNativeRenderThreadStats != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new StringReader(nativeGetNativeRenderThreadStats));
                try {
                    this.A00 = bufferedReader.readLine();
                    while (true) {
                        String str = this.A00;
                        if (str == null) {
                            break;
                        }
                        if (str.equals("CPU Caches:")) {
                            String readLine = bufferedReader.readLine();
                            this.A00 = readLine;
                            boolean z3 = false;
                            long j = 0;
                            while (readLine != null && readLine.startsWith(" ")) {
                                Matcher matcher = this.A0F.matcher(readLine);
                                if (matcher.find()) {
                                    if (this.A00.contains("Glyph Cache:")) {
                                        arrayList.add(new 0M9(0Cu.A0B, A00(matcher)));
                                        this.A02 = true;
                                        z3 = true;
                                    } else {
                                        j += A00(matcher);
                                    }
                                }
                                readLine = bufferedReader.readLine();
                                this.A00 = readLine;
                            }
                            if (j > 0 || this.A08) {
                                arrayList.add(new 0M9(0Cu.A0C, j));
                                this.A08 = true;
                            }
                            if (this.A02 && !z3) {
                                1BL.A14(0Cu.A0B, arrayList, 0L);
                            }
                        } else if (str.equals("GPU Caches:")) {
                            String readLine2 = bufferedReader.readLine();
                            this.A00 = readLine2;
                            boolean z4 = false;
                            long j2 = 0;
                            long j3 = 0;
                            long j4 = 0;
                            long j5 = 0;
                            while (readLine2 != null && readLine2.startsWith(" ")) {
                                if (readLine2.equals("  Other:")) {
                                    z4 = true;
                                } else if (readLine2.equals("  SW Path Mask:")) {
                                    z4 = 2;
                                } else if (readLine2.equals("  Image:")) {
                                    z4 = 3;
                                } else if (readLine2.equals("  Scratch:")) {
                                    z4 = 4;
                                } else {
                                    Matcher matcher2 = this.A0F.matcher(readLine2);
                                    if (matcher2.find()) {
                                        if (z4) {
                                            j2 += A00(matcher2);
                                        } else if (z4 == 2) {
                                            j3 += A00(matcher2);
                                        } else if (z4 == 3) {
                                            j4 += A00(matcher2);
                                        } else if (z4 == 4) {
                                            j5 += A00(matcher2);
                                        }
                                    }
                                }
                                readLine2 = bufferedReader.readLine();
                                this.A00 = readLine2;
                            }
                            if (j2 > 0 || this.A09) {
                                arrayList.add(new 0M9(0Cu.A0O, j2));
                                this.A09 = true;
                            }
                            if (j3 > 0 || this.A04) {
                                arrayList.add(new 0M9(0Cu.A0N, j3));
                                this.A04 = true;
                            }
                            if (j4 > 0 || this.A03) {
                                arrayList.add(new 0M9(0Cu.A0M, j4));
                                this.A03 = true;
                            }
                            if (j5 > 0 || this.A0A) {
                                arrayList.add(new 0M9(0Cu.A0P, j5));
                                this.A0A = true;
                            }
                        } else if (str.equals("Total CPU memory usage:")) {
                            String readLine3 = bufferedReader.readLine();
                            this.A00 = readLine3;
                            long j6 = 0;
                            long j7 = 0;
                            while (readLine3 != null && readLine3.startsWith(" ")) {
                                Matcher matcher3 = this.A0F.matcher(readLine3);
                                if (matcher3.find()) {
                                    j6 += A00(matcher3);
                                }
                                if (matcher3.find()) {
                                    j7 += A00(matcher3);
                                }
                                readLine3 = bufferedReader.readLine();
                                this.A00 = readLine3;
                            }
                            if (j6 > 0 || this.A0B) {
                                arrayList.add(new 0M9(0Cu.A0D, j6));
                                this.A0B = true;
                            }
                            if (j7 > 0 || this.A01) {
                                1BL.A14(0Cu.A0E, arrayList, j6);
                                this.A01 = true;
                            }
                        } else if (str.equals("Total GPU memory usage:")) {
                            String readLine4 = bufferedReader.readLine();
                            this.A00 = readLine4;
                            long j8 = 0;
                            long j9 = 0;
                            while (readLine4 != null && readLine4.startsWith(" ")) {
                                Matcher matcher4 = this.A0F.matcher(readLine4);
                                if (matcher4.find()) {
                                    j8 += A00(matcher4);
                                }
                                if (matcher4.find()) {
                                    j9 += A00(matcher4);
                                }
                                readLine4 = bufferedReader.readLine();
                                this.A00 = readLine4;
                            }
                            if (j8 > 0 || this.A0C) {
                                arrayList.add(new 0M9(0Cu.A0R, j8));
                                this.A0C = true;
                            }
                            if (j9 > 0 || this.A05) {
                                arrayList.add(new 0M9(0Cu.A0Q, j9));
                                this.A05 = true;
                            }
                        } else if (str.equals("Layer Info:")) {
                            String readLine5 = bufferedReader.readLine();
                            this.A00 = readLine5;
                            long j10 = 0;
                            boolean z5 = false;
                            int i = 0;
                            while (true) {
                                z = true;
                                if (readLine5 == null || !readLine5.startsWith(" ")) {
                                    break;
                                }
                                if (!z5) {
                                    Matcher matcher5 = this.A0F.matcher(readLine5);
                                    if (matcher5.find()) {
                                        j10 = A00(matcher5);
                                        Matcher matcher6 = this.A0E.matcher(this.A00);
                                        if (matcher6.find() && matcher6.groupCount() >= 1) {
                                            String group = matcher6.group(1);
                                            if (group != null) {
                                                try {
                                                    i = Integer.parseInt(group);
                                                } catch (NumberFormatException unused) {
                                                }
                                                z5 = true;
                                            }
                                        }
                                        i = 0;
                                        z5 = true;
                                    }
                                }
                                readLine5 = bufferedReader.readLine();
                                this.A00 = readLine5;
                            }
                            if (j10 > 0 || this.A07) {
                                1BL.A14(0Cu.A0a, arrayList, j10);
                                this.A07 = true;
                            }
                            if (i > 0 || this.A06) {
                                new 0M9(0Cu.A0b, i);
                                arrayList.add(z2);
                                this.A06 = z;
                            }
                        } else if (str.equals("Other Caches:")) {
                            String readLine6 = bufferedReader.readLine();
                            this.A00 = readLine6;
                            long j11 = 0;
                            boolean z6 = false;
                            int i2 = 0;
                            while (true) {
                                z = true;
                                if (readLine6 == null || !readLine6.startsWith(" ")) {
                                    break;
                                }
                                if (!z6 && readLine6.startsWith("  Layers Total")) {
                                    Matcher matcher7 = this.A0F.matcher(readLine6);
                                    if (matcher7.find()) {
                                        j11 = A00(matcher7);
                                        Matcher matcher8 = this.A0E.matcher(this.A00);
                                        if (matcher8.find() && matcher8.groupCount() >= 1) {
                                            String group2 = matcher8.group(1);
                                            if (group2 != null) {
                                                try {
                                                    i2 = Integer.parseInt(group2);
                                                } catch (NumberFormatException unused2) {
                                                }
                                                z6 = true;
                                            }
                                        }
                                        i2 = 0;
                                        z6 = true;
                                    }
                                }
                                readLine6 = bufferedReader.readLine();
                                this.A00 = readLine6;
                            }
                            if (j11 > 0 || this.A07) {
                                1BL.A14(0Cu.A0a, arrayList, j11);
                                this.A07 = true;
                            }
                            if (i2 > 0 || this.A06) {
                                new 0M9(0Cu.A0b, i2);
                                arrayList.add(z2);
                                this.A06 = z;
                            }
                        } else if (str.equals("Font Cache (CPU):")) {
                            String readLine7 = bufferedReader.readLine();
                            this.A00 = readLine7;
                            boolean z7 = false;
                            while (readLine7 != null && readLine7.startsWith(" ")) {
                                if (!z7) {
                                    Matcher matcher9 = this.A0F.matcher(readLine7);
                                    if (matcher9.find()) {
                                        arrayList.add(new 0M9(0Cu.A0B, A00(matcher9)));
                                        z7 = true;
                                    }
                                }
                                readLine7 = bufferedReader.readLine();
                                this.A00 = readLine7;
                            }
                        } else {
                            this.A00 = bufferedReader.readLine();
                        }
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (IOException unused3) {
            }
        }
        this.A00 = null;
        return arrayList;
    }

    public /* synthetic */ java.util.Map getIndexedDataPoints() {
        return null;
    }

    public boolean shouldCollectMetrics(int i) {
        boolean z = false;
        if ((i & 1048576) != 0) {
            z = true;
        }
        return z;
    }

    public /* synthetic */ boolean shouldCollectMetrics(int i, 0M7 r303) {
        return 0M8.A00(r303, this, i);
    }

    public /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }
}
