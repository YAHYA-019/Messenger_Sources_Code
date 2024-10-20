package com.facebook.exoplayer.bandwidthestimator.estimate;

import X.0Pz;
import X.5Lf;
import X.5Li;
import X.DLX;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

/* loaded from: VideoBandwidthEstimate.class */
public class VideoBandwidthEstimate implements 5Lf {
    public static final Map PERCENTILE_ZSCORE_MAP = new DLX(0);
    public AbrContextAwareConfiguration abrConfig;
    public long bandwidthBps;
    public 5Li bandwidthMeter;
    public final long bandwidthStdDev;
    public final long bandwidthWeight;
    public String bweModel;
    public final int numSamples;
    public final long ttfbMs;
    public final long ttfbStdDev;
    public final long ttfbWeight;

    public VideoBandwidthEstimate() {
        this.bweModel = "ewma";
        long j = -1;
        this.ttfbMs = j;
        this.ttfbWeight = j;
        this.ttfbStdDev = j;
        this.bandwidthBps = j;
        this.bandwidthWeight = j;
        this.bandwidthStdDev = j;
        this.numSamples = -1;
        this.abrConfig = null;
        this.bandwidthMeter = null;
    }

    public VideoBandwidthEstimate(long j, long j2, long j3, long j4, long j5, long j6, int i, AbrContextAwareConfiguration abrContextAwareConfiguration) {
        this.bweModel = "ewma";
        this.ttfbMs = j;
        this.ttfbWeight = j2;
        this.ttfbStdDev = j3;
        this.bandwidthBps = j4;
        this.bandwidthWeight = j5;
        this.bandwidthStdDev = j6;
        this.numSamples = i;
        this.abrConfig = abrContextAwareConfiguration;
        this.bandwidthMeter = null;
    }

    public long getEstimatedBitrate(long j, int i, String str) {
        if (j >= 0) {
            long estimatedThroughput = getEstimatedThroughput(i, str);
            long estimatedRequestTTFBMs = getEstimatedRequestTTFBMs(i, str);
            if (estimatedThroughput > 0 && estimatedRequestTTFBMs >= 0) {
                long j2 = (long) (((j * 8000.0d) / estimatedThroughput) + estimatedRequestTTFBMs);
                if (j2 > 0 && j > 0) {
                    return (j * 8000) / j2;
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r311 <= 0.0f) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r312 = r0.getMinTTFBMultiplier();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r312 > 0.0f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r312 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        r313 = 300.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r308 = r301.ttfbMs;
        r314 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (r302 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r302 >= 100) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r308 <= 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
    
        if (r302 >= 50) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        r314 = -1;
        r302 = 100 - r302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        r0 = (((r314 * ((java.lang.Number) com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.PERCENTILE_ZSCORE_MAP.get(java.lang.Integer.valueOf(r302))).floatValue()) * ((float) r301.ttfbStdDev)) / ((float) r308)) + 1.0f;
        r0 = r301.ttfbWeight;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        if (r0 <= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0136, code lost:
    
        r310 = java.lang.Math.max(1.0f - (((float) r0) / r313), 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0164, code lost:
    
        return r0 * java.lang.Math.max(java.lang.Math.min(r0 + r310, r311), r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        r313 = r0.abrSetting.ttfbWeightLimitForBWEDampening;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r313 > 0.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getEstimatedRequestTTFBMs(int r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.getEstimatedRequestTTFBMs(int, java.lang.String):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        r311 = r301.bandwidthBps;
        r313 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (r302 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r302 >= 100) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        if (r311 <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        if (r302 >= 50) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        r313 = -1;
        r302 = 100 - r302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        r0 = (float) r311;
        r0 = 1.0f - (((r313 * ((java.lang.Number) com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.PERCENTILE_ZSCORE_MAP.get(java.lang.Integer.valueOf(r302))).floatValue()) * ((float) r301.bandwidthStdDev)) / r0);
        r0 = r301.bandwidthWeight;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fc, code lost:
    
        if (r0 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ff, code lost:
    
        r305 = java.lang.Math.max(1.0f - (((float) r0) / r310), 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0116, code lost:
    
        r311 = r0 * java.lang.Math.min(java.lang.Math.max(r0 - r305, r306), r308);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0139, code lost:
    
        return r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r310 = r0.abrSetting.bwWeightLimitForBWEDampening;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r310 > 0.0f) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0022, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r306 <= 0.0f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        r308 = r0.getMaxBandwidthMultiplier();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r308 > 0.0f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r308 = 2.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r310 = 800.0f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getEstimatedThroughput(int r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate.getEstimatedThroughput(int, java.lang.String):long");
    }

    public String toString() {
        return 0Pz.A0z(0Pz.A0U("ttfb=", this.ttfbMs), 0Pz.A0U(", bw=", this.bandwidthBps / 1000), 0Pz.A0U(", ttfb_s=", this.ttfbStdDev), 0Pz.A0U(", bw_s=", this.bandwidthStdDev / 1000), 0Pz.A0T(", s=", this.numSamples));
    }
}
