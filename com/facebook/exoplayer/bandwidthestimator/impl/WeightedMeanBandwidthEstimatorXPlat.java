package com.facebook.exoplayer.bandwidthestimator.impl;

import X.5Kd;
import X.5Lc;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import com.facebook.video.jni.VideoJni;

/* loaded from: WeightedMeanBandwidthEstimatorXPlat.class */
public class WeightedMeanBandwidthEstimatorXPlat implements 5Lc {
    public long mJniContext;
    public VideoJni mVideoJni;

    public WeightedMeanBandwidthEstimatorXPlat() {
        this.mJniContext = 0L;
        VideoJni videoJni = new VideoJni();
        this.mVideoJni = videoJni;
        this.mJniContext = videoJni.weightedMeanBandwidthEstimatorInit();
    }

    public void addSample(long j, long j2, long j3) {
        synchronized (this) {
            long j4 = -1;
            addSample(j, j2, j3, j4, j4, true, true);
        }
    }

    public void addSample(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        synchronized (this) {
            this.mVideoJni.weightedMeanBandwidthEstimatorEnqueueSample(this.mJniContext, j3, j, j2);
        }
    }

    public VideoBandwidthEstimate getBandwidthEstimate(AbrContextAwareConfiguration abrContextAwareConfiguration) {
        VideoBandwidthEstimate weightedMeanBandwidthEstimatorGetBandwidthEstimate;
        synchronized (this) {
            weightedMeanBandwidthEstimatorGetBandwidthEstimate = this.mVideoJni.weightedMeanBandwidthEstimatorGetBandwidthEstimate(this.mJniContext);
        }
        return weightedMeanBandwidthEstimatorGetBandwidthEstimate;
    }

    public void reset(5Kd r302) {
    }

    public void setParams(boolean z, double d, long j, long j2, long j3, double d2, double d3, long j4) {
        this.mVideoJni.weightedMeanBandwidthEstimatorSetParams(this.mJniContext, z, d, j, j2, j3, d2, d3, j4);
    }
}
