package com.facebook.exoplayer.formatevaluator.configuration;

import X.11T;
import X.5Kd;
import X.5Kq;
import X.5LT;
import X.5Lz;
import X.5MJ;
import X.Kiw;
import android.net.ConnectivityManager;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Locale;

/* loaded from: AbrContextAwareConfiguration.class */
public final class AbrContextAwareConfiguration {
    public final 5Kd abrSetting;
    public final 5LT connectivityManagerHolder;
    public final boolean enableForegroundPrefetchQualityExperimentation;
    public final boolean isBackgroundPrefetch;
    public final boolean isIGClips;
    public final boolean isIGStory;
    public final boolean isLive;
    public final boolean isPrefetch;
    public final boolean isSponsored;
    public final boolean isStory;
    public final boolean isThumbnail;
    public final 5Lz playbackPreferences;

    public AbrContextAwareConfiguration(5Kd r302, 5LT r303, 5Lz r304, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        11T.A0F(r302, 1);
        11T.A0F(r304, 3);
        this.abrSetting = r302;
        this.connectivityManagerHolder = r303;
        this.playbackPreferences = r304;
        this.isLive = z;
        String A02 = r304.A02();
        String A03 = r304.A03();
        boolean z5 = false;
        this.isStory = "fb_stories".equalsIgnoreCase(A02) || (this.abrSetting.treatShortFormAsStories && ("fb_shorts_viewer".equalsIgnoreCase(A03) || "fb_shorts_native_in_feed_unit".equalsIgnoreCase(A03)));
        this.isIGStory = "reel_feed_timeline".equalsIgnoreCase(A02);
        if (A02 != null) {
            String lowerCase = A02.toLowerCase(Locale.ROOT);
            11T.A0A(lowerCase);
            11T.A0F("clips_viewer_", 1);
            z5 = lowerCase.startsWith("clips_viewer_");
        }
        this.isIGClips = z5;
        this.isThumbnail = r304.A0D();
        synchronized (r304) {
            z3 = r304.A07;
        }
        this.isSponsored = z3;
        synchronized (r304) {
            z4 = r304.A05;
        }
        this.isBackgroundPrefetch = z4;
        this.enableForegroundPrefetchQualityExperimentation = r304.A04;
        this.isPrefetch = z2;
    }

    private final boolean getEnableInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveEnableInitialBitrateBoosterByNetworkQuality : r0.enableInitialBitrateBoosterByNetworkQuality;
    }

    private final float getInitialBitrateBoosterByNetworkQuality() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveInitialBitrateBoosterByNetworkQuality : r0.initialBitrateBoosterByNetworkQuality;
    }

    public final boolean enableAndroidAPIBitrate() {
        return this.abrSetting.enableAndroidAPIBitrate;
    }

    public final boolean enableConfRiskBwCache() {
        return this.abrSetting.enableConfRiskBwCache;
    }

    public final boolean enableMosOverride() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.enableMosOverrideLive : r0.enableMosOverride;
    }

    public final boolean enableQoERationalGamblerAbr(boolean z) {
        if (this.isLive) {
            return false;
        }
        5Kd r0 = this.abrSetting;
        return z ? r0.enableQoERationalGamblerABRForAudio : r0.enableQoERationalGamblerABR;
    }

    public final boolean enableSmartCacheOverride(boolean z) {
        if (!this.isLive && z && this.isStory) {
            return this.abrSetting.enableSmartCacheOverride;
        }
        return false;
    }

    public final boolean enableSmartCacheOverrideForPrefetch() {
        if (this.isLive || !this.isStory) {
            return false;
        }
        return this.abrSetting.enableSmartCachePrefetchOverride;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (isOnWifi() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean enableSmartCacheOverrideOnlyWhenHighMos() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isStory
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r301
            X.5Kd r0 = r0.abrSetting
            r303 = r0
            r0 = r303
            boolean r0 = r0.enableSmartCacheOverrideOnlyWhenHighMos
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r301
            boolean r0 = r0.isOnWifi()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L26:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.enableSmartCacheOverrideOnlyWhenHighMos():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (isOnWifi() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean enableSmartCacheOverrideOnlyWhenHighMosForPrefetch() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isStory
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r301
            X.5Kd r0 = r0.abrSetting
            r303 = r0
            r0 = r303
            boolean r0 = r0.enableSmartCacheOverrideOnlyWhenHighMosForPrefetch
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r301
            boolean r0 = r0.isOnWifi()
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L26:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.enableSmartCacheOverrideOnlyWhenHighMosForPrefetch():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (isOnWifi() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean enableWifiBasedRewardSidnee() {
        /*
            r301 = this;
            r0 = r301
            X.5Kd r0 = r0.abrSetting
            r302 = r0
            r0 = r302
            boolean r0 = r0.enableWifiBasedSidneeRewardTuning
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L19
            r0 = r301
            boolean r0 = r0.isOnWifi()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L19:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L1d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.enableWifiBasedRewardSidnee():boolean");
    }

    public final boolean enableXPlatBweParity() {
        return this.abrSetting.enableXPlatBweParity;
    }

    public final long getAbrDurationForIntentional() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveAbrDurationForIntentional : r0.abrDurationForIntentional;
    }

    public final int getAndroidBandwidthFallbackNumberOfSamples() {
        return this.abrSetting.androidBandwidthFallbackNumberOfSamples;
    }

    public final long getAocDefaultLimitIntentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitIntentionalKbps;
        }
        return 0L;
    }

    public final long getAocDefaultLimitUnintentionalKbps() {
        if (this.isLive) {
            return this.abrSetting.liveAocDefaultLimitUnintentionalKbps;
        }
        return 0L;
    }

    public final float getBWWeightLimitForBWEDampening() {
        return this.abrSetting.bwWeightLimitForBWEDampening;
    }

    public final double getBadVisualQualityRationalGamblerReward() {
        return this.abrSetting.badVisualQualityRationalGamblerReward;
    }

    public final double getBadVisualQualityRationalGamblerThreshold() {
        return this.abrSetting.badVisualQualityRationalGamblerThreshold;
    }

    public final boolean getBypassWidthLimitsSponsoredVerticalVideos() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsSponsoredVerticalVideos;
    }

    public final boolean getBypassWidthLimitsStories() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStories;
    }

    public final boolean getBypassWidthLimitsStoriesPrefetch() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.bypassWidthLimitsStoriesPrefetch;
    }

    public final ConnectivityManager getConnectivityManager() {
        5LT r0 = this.connectivityManagerHolder;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public final String getDataConnectionQuality() {
        String str;
        5LT r0 = this.connectivityManagerHolder;
        return (r0 == null || (str = r0.A01) == null) ? OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID : str;
    }

    public final int getDefaultBwRiskConfPct() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveDefaultBwRiskConfPct : r0.defaultBwRiskConfPct;
    }

    public final float getDropRenderFrameRatioForPreventAbrUp() {
        return this.abrSetting.dropRenderFrameRatioForPreventAbrUp;
    }

    public final boolean getEnableDeviceHealthPenalty() {
        return this.abrSetting.enableDeviceHealthPenalty;
    }

    public final boolean getEnableOverallMOSRewardSidnee() {
        return this.abrSetting.enableOverallMOSBasedRewardSidnee;
    }

    public final boolean getEnableSegmentBitrate() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.enableSegmentBitrate;
    }

    public final boolean getForceCurrentNoWatchableFormatFrameDrop() {
        return this.abrSetting.forceCurrentNoWatchableFormatFrameDrop;
    }

    public final float getFrameDropFactor() {
        return this.abrSetting.frameDropFactor;
    }

    public final double getGoodVisualQualityRationalGamblerReward() {
        return this.abrSetting.goodVisualQualityRationalGamblerReward;
    }

    public final double getGoodVisualQualityRationalGamblerThreshold() {
        return this.abrSetting.goodVisualQualityRationalGamblerThreshold;
    }

    public final double getGreatVisualQualityRationalGamblerReward() {
        return this.abrSetting.greatVisualQualityRationalGamblerReward;
    }

    public final double getGreatVisualQualityRationalGamblerThreshold() {
        return this.abrSetting.greatVisualQualityRationalGamblerThreshold;
    }

    public final boolean getHashUrlForUnique() {
        return this.abrSetting.hashUrlForUnique;
    }

    public final int getHighBwRiskConfPct(5Kq r302) {
        int i;
        int i2;
        int i3;
        11T.A0F(r302, 0);
        if (!this.isLive) {
            if (this.isBackgroundPrefetch && (i3 = this.abrSetting.backgroundPrefetchHighBwRiskConfPct) > 0) {
                return i3;
            }
            if (this.isSponsored) {
                5Kd r0 = this.abrSetting;
                i2 = r0.adHighBwRiskConfPct;
                if (i2 <= 0) {
                    int i4 = this.isPrefetch ? r0.adHighBwRiskConfPctPrefetch : r0.adHighBwRiskConfPctOnScreen;
                    if (i4 > 0) {
                        return i4;
                    }
                }
            }
            return (this.isPrefetch && this.enableForegroundPrefetchQualityExperimentation && (i = this.abrSetting.foregroundPrefetchHighBwRiskConfPct) > 0) ? i : this.abrSetting.highBwRiskConfPct;
        }
        5Kq r02 = 5Kq.A05;
        5Kd r03 = this.abrSetting;
        if (r302 != r02) {
            return r03.liveHighBwRiskConfPct;
        }
        i2 = r03.liveHighBwRiskConfPctUltraLowLatency;
        return i2;
    }

    public final double getHighOrBetterMosThreshold() {
        return this.abrSetting.highOrBetterMosThreshold;
    }

    public final boolean getHonorDefaultBandwidthForSR() {
        return this.abrSetting.honorDefaultBandwidthSR;
    }

    public final int getInitSegmentBandwidthExclusionLimitBytes() {
        return this.abrSetting.initSegmentBandwidthExclusionLimitBytes;
    }

    public final boolean getIsPrefetch() {
        return this.isPrefetch;
    }

    public final int getLatencyAdjustedLowestQualityIndex(int i, 5Kq r303) {
        int i2;
        11T.A0F(r303, 1);
        return (r303 != 5Kq.A05 || (i2 = this.abrSetting.ultraLowLatencyAdjustedLowestQualityIndex) < 0) ? i - 1 : Math.min(i2, i - 1);
    }

    public final int getLatencyBasedAbrTargetBufferSizeMs() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveAbrLatencyBasedAbrTargetBufferSizeMs : r0.latencyBasedTargetBufferSizeMs;
    }

    public final double getMaxAlphaLowPassEMABwDown() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxAlphaLowPassEMABwDown : r0.maxAlphaLowPassEMABwDown;
    }

    public final double getMaxAlphaLowPassEMABwUp() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxAlphaLowPassEMABwUp : r0.maxAlphaLowPassEMABwUp;
    }

    public final double getMaxAlphaLowPassEMABwVol() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxAlphaLowPassEMABwVol : r0.maxAlphaLowPassEMABwVol;
    }

    public final double getMaxAlphaLowPassEMATtfbDown() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxAlphaLowPassEMATtfbDown : r0.maxAlphaLowPassEMATtfbDown;
    }

    public final double getMaxAlphaLowPassEMATtfbUp() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxAlphaLowPassEMATtfbUp : r0.maxAlphaLowPassEMATtfbUp;
    }

    public final double getMaxAlphaLowPassEMATtfbVol() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxAlphaLowPassEMATtfbVol : r0.maxAlphaLowPassEMATtfbVol;
    }

    public final float getMaxBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxBandwidthMultiplier;
        }
        boolean z = this.isStory;
        5Kd r0 = this.abrSetting;
        return z ? r0.storiesMaxBandwidthMultiplier : r0.maxBandwidthMultiplier;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int getMaxInitialBitrate() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.getEnableInitialBitrateBoosterByNetworkQuality()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1e
            X.40H r0 = X.40H.A07
            r303 = r0
            r0 = r303
            r304 = r0
            r0 = r301
            java.lang.String r0 = r0.getDataConnectionQuality()     // Catch: java.lang.IllegalArgumentException -> L26
            r305 = r0
            r0 = r305
            X.40H r0 = X.40H.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L26
            r303 = r0
            goto L27
        L1e:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r306 = r0
            goto L5e
        L26:
        L27:
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L1e
            r0 = r303
            int r0 = r0.ordinal()
            r308 = r0
            r0 = 2
            r302 = r0
            r0 = 2
            r309 = r0
            r0 = r308
            r1 = r302
            if (r0 <= r1) goto L1e
            r0 = r308
            r1 = r302
            int r0 = r0 - r1
            r308 = r0
            r0 = r301
            float r0 = r0.getInitialBitrateBoosterByNetworkQuality()
            r309 = r0
            r0 = r309
            double r0 = (double) r0
            r310 = r0
            r0 = r308
            double r0 = (double) r0
            r312 = r0
            r0 = r310
            r1 = r312
            double r0 = java.lang.Math.pow(r0, r1)
            r306 = r0
        L5e:
            r0 = r301
            boolean r0 = r0.isLive
            r308 = r0
            r0 = r301
            X.5Kd r0 = r0.abrSetting
            r305 = r0
            r0 = r308
            if (r0 == 0) goto L7c
            r0 = r305
            int r0 = r0.liveInitialBitrate
            r302 = r0
        L75:
            r0 = r302
            double r0 = (double) r0
            r1 = r306
            double r0 = r0 * r1
            int r0 = (int) r0
            return r0
        L7c:
            r0 = r305
            int r0 = r0.maxInitialBitrate
            r302 = r0
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getMaxInitialBitrate():int");
    }

    public final int getMaxNumberSmallBwSamplesIgnored() {
        return this.abrSetting.maxNumberSmallBwSamplesIgnored;
    }

    public final long getMaxRationalGamblerABREvaluationDurationMs() {
        return this.abrSetting.maxRationalGamblerABREvaluationDurationMs;
    }

    public final double getMaxRationalGamblerMultiplier() {
        return this.abrSetting.maxRationalGamblerMultiplier;
    }

    public final float getMaxTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMaxTTFBMultiplier;
        }
        boolean z = this.isStory;
        5Kd r0 = this.abrSetting;
        return z ? r0.storiesMaxTTFBMultiplier : r0.maxTTFBMultiplier;
    }

    public final int getMaxWidthCell() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxWidthCell : r0.maxWidthCell;
    }

    public final int getMaxWidthInlinePlayer() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveMaxWidthInlinePlayer : r0.maxWidthInlinePlayer;
    }

    public final int getMaxWidthSphericalVideo() {
        return this.abrSetting.maxWidthSphericalVideo;
    }

    public final int getMaxWidthToPrefetch() {
        boolean z;
        if (this.abrSetting.bypassPrefetchWidthLimits) {
            return (-1) >>> 1;
        }
        5Lz r0 = this.playbackPreferences;
        synchronized (r0) {
            z = r0.A06;
        }
        if (z) {
            return this.abrSetting.maxWidthSphericalVideo;
        }
        boolean z2 = this.isLive;
        boolean isOnWifi = isOnWifi();
        if (z2) {
            5Kd r02 = this.abrSetting;
            return isOnWifi ? r02.liveMaxWidthToPrefetchWifi : r02.liveMaxWidthToPrefetchCell;
        }
        5Kd r03 = this.abrSetting;
        return isOnWifi ? r03.maxWidthToPrefetchAbr : r03.maxWidthToPrefetchAbrCell;
    }

    public final float getMinBandwidthMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinBandwidthMultiplier;
        }
        boolean z = this.isStory;
        5Kd r0 = this.abrSetting;
        return z ? r0.storiesMinBandwidthMultiplier : r0.minBandwidthMultiplier;
    }

    public final long getMinBufferDurationMsRationalGambler() {
        return this.abrSetting.minBufferDurationMsRationalGambler;
    }

    public final int getMinBufferedDurationMsForMosAwareCache() {
        if (this.isLive) {
            return 0;
        }
        return this.abrSetting.minBufferedDurationMsForMosAwareCache;
    }

    public final int getMinFramesDropForPreventAbrUp() {
        return this.abrSetting.minFramesDropForPreventAbrUp;
    }

    public final int getMinFramesRenderedForPreventAbrUp() {
        return this.abrSetting.minFramesRenderedForPreventAbrUp;
    }

    public final int getMinMosConstraintLimit() {
        return this.abrSetting.minMosConstraintLimit;
    }

    public final int getMinMosForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        5Kd r0 = this.abrSetting;
        return z ? r0.storiesMinMosForCachedQuality : r0.minMosForCachedQuality;
    }

    public final double getMinOverallMosForABR() {
        return this.abrSetting.minOverallMosForABR;
    }

    public final float getMinPartiallyCachedSpan() {
        return this.abrSetting.minPartiallyCachedSpan;
    }

    public final double getMinRationalGamblerMultiplier() {
        return this.abrSetting.minRationalGamblerMultiplier;
    }

    public final float getMinTTFBMultiplier() {
        if (this.isLive) {
            return this.abrSetting.liveMinTTFBMultiplier;
        }
        boolean z = this.isStory;
        5Kd r0 = this.abrSetting;
        return z ? r0.storiesMinTTFBMultiplier : r0.minTTFBMultiplier;
    }

    public final int getMinWatchableMos() {
        int i;
        return (!this.isIGClips || (i = this.abrSetting.igClipsMinWatchableMos) <= 0) ? this.abrSetting.minWatchableMos : i;
    }

    public final float getMinWidthMultiplierFrameDrop() {
        return this.abrSetting.minWidthMultiplierFrameDrop;
    }

    public final int getModBwRiskConfPct() {
        return this.abrSetting.modBwRiskConfPct;
    }

    public final double getModOverallMosForABR() {
        return this.abrSetting.modOverallMosForABR;
    }

    public final int getModWatchableMos() {
        if (this.isLive) {
            return 0;
        }
        return this.abrSetting.modWatchableMos;
    }

    public final int getMosDiffPctForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        5Kd r0 = this.abrSetting;
        return z ? r0.storiesMosDiffPctForCachedQuality : r0.mosDiffPctForCachedQuality;
    }

    public final long getPersonalizedAggressiveStallDuration() {
        return this.abrSetting.personalizedAggressiveStallDuration;
    }

    public final int getPersonalizedBWRiskConfPctAggressive() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedBWRiskConfPctAggressive : r0.personalizedBWRiskConfPctAggressive;
    }

    public final int getPersonalizedBWRiskConfPctConservative() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedBWRiskConfPctConservative : r0.personalizedBWRiskConfPctConservative;
    }

    public final int getPersonalizedBWRiskConfPctNormal() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedBWRiskConfPctNormal : r0.personalizedBWRiskConfPctNormal;
    }

    public final int getPersonalizedBWRiskConfPctVeryAggressive() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedBWRiskConfPctVeryAggressive : r0.personalizedBWRiskConfPctVeryAggressive;
    }

    public final int getPersonalizedBWRiskConfPctVeryConservative() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedBWRiskConfPctVeryConservative : r0.personalizedBWRiskConfPctVeryConservative;
    }

    public final long getPersonalizedConservativeStallDuration() {
        return this.abrSetting.personalizedConservativeStallDuration;
    }

    public final double getPersonalizedRiskMultiplierAggressive() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedRiskMultiplierAggressive : r0.personalizedRiskMultiplierAggressive;
    }

    public final double getPersonalizedRiskMultiplierConservative() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedRiskMultiplierConservative : r0.personalizedRiskMultiplierConservative;
    }

    public final double getPersonalizedRiskMultiplierVeryAggressive() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedRiskMultiplierVeryAggressive : r0.personalizedRiskMultiplierVeryAggressive;
    }

    public final double getPersonalizedRiskMultiplierVeryConservative() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedRiskMultiplierVeryConservative : r0.personalizedRiskMultiplierVeryConservative;
    }

    public final long getPersonalizedVeryAggressiveStallDuration() {
        return this.abrSetting.personalizedVeryAggressiveStallDuration;
    }

    public final double getPersonalizedVirtualBufferPercent() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.livePersonalizedVirtualBufferPercent : r0.personalizedVirtualBufferPercent;
    }

    public final 5Lz getPlaybackPreferences() {
        return this.playbackPreferences;
    }

    public final 5MJ getRationalGamblerConfig() {
        5Kd r0 = this.abrSetting;
        return (r0.enableAdsTuningSidnee && this.isSponsored) ? r0.adsRationalGamblerConfig : r0.rationalGamblerConfig;
    }

    public final double getRiskAdjFactor(boolean z, 5Kq r303) {
        11T.A0F(r303, 1);
        boolean z2 = this.isLive;
        if (z) {
            5Kd r0 = this.abrSetting;
            return z2 ? r0.liveAudioRiskAdjFactor : r0.audioRiskAdjFactor;
        }
        if (!z2) {
            return this.abrSetting.riskAdjFactor;
        }
        if (r303 == 5Kq.A02) {
            return this.abrSetting.liveUserLowLatencyRiskAdjFactor;
        }
        5Kq r02 = 5Kq.A05;
        5Kd r03 = this.abrSetting;
        return r303 == r02 ? r03.liveUserUltraLowLatencyRiskAdjFactor : r03.liveRiskAdjFactor;
    }

    public final float getRiskRewardRatioUpperBound() {
        if (this.isLive) {
            return this.abrSetting.liveRiskRewardRatioUpperBound;
        }
        if (this.isStory) {
            float f = this.abrSetting.riskRewardRatioUpperBoundSfv;
            if (f > 0.0d) {
                return f;
            }
        }
        return this.abrSetting.riskRewardRatioUpperBound;
    }

    public final float getScreenWidthMultiplierLandscapeVideo() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveScreenWidthMultiplierLandscapeVideo : r0.screenWidthMultiplierLandscapeVideo;
    }

    public final float getScreenWidthMultiplierPortraitVideo() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveScreenWidthMultiplierPortraitVideo : r0.screenWidthMultiplierPortraitVideo;
    }

    public final boolean getShouldAvoidOnCellular() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveShouldAvoidOnCellular : r0.enableAvoidOnCellular;
    }

    public final boolean getShouldCountFirstChunkOnly() {
        return this.abrSetting.shouldCountFirstChunkOnly;
    }

    public final boolean getShouldEnableAudioIbrCache() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveEnableAudioIbrCache : r0.enableAudioIbrCache;
    }

    public final boolean getShouldEnableBwOnlyEstimationForLongPoll() {
        return this.abrSetting.enableBwOnlyEstimationForLongPoll;
    }

    public final boolean getShouldEnableTtfbOnlyEstimation() {
        return this.abrSetting.enableTtfbOnlyEstimation;
    }

    public final boolean getShouldTreatShortFormAsStories() {
        return this.abrSetting.treatShortFormAsStories;
    }

    public final boolean getShouldUseServerSideGoodput() {
        return this.abrSetting.shouldUseServerSideGoodput;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        if (r0.getBoolean("enable_thermal_penalty") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if (r0.getBoolean("enable_battery_penalty") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
    
        if (r0.getBoolean("enable_memory_penalty") == false) goto L68;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5MM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [X.5MM, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.5MM getSidneeDeviceAwareAbrManagerConfig() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.getSidneeDeviceAwareAbrManagerConfig():X.5MM");
    }

    public final boolean getSkipCachedAsCurrent() {
        return this.abrSetting.skipCachedAsCurrent;
    }

    public final double getSmartCacheOverrideThreshold() {
        return this.abrSetting.smartCacheOverrideThreshold;
    }

    public final double getSmartCacheOverrideThresholdForPrefetch() {
        return this.abrSetting.smartCacheOverridePrefetchThreshold;
    }

    public final int getSsAbrSampleMaxValidTimeAcrossVideosMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeAcrossVideosMs;
    }

    public final int getSsAbrSampleMaxValidTimeMs() {
        return this.abrSetting.ssAbrSampleMaxValidTimeMs;
    }

    public final int getSystemicRiskAvgSegmentDurationMs() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveSystemicRiskAvgSegmentDurationMs : r0.systemicRiskAvgSegmentDurationMs;
    }

    public final double getSystemicRiskBitrateBoostFactor(boolean z) {
        if (!z) {
            return 1.0d;
        }
        boolean z2 = this.isLive;
        5Kd r0 = this.abrSetting;
        return z2 ? r0.liveSystemicRiskAudioBitrateBoostFactor : r0.systemicRiskAudioBitrateBoostFactor;
    }

    public final boolean getSystemicRiskEnableDynamicOtherBitrate(boolean z) {
        if (!z) {
            return false;
        }
        boolean z2 = this.isLive;
        5Kd r0 = this.abrSetting;
        return z2 ? r0.liveSystemicRiskAudioEnableDynOtherBitrate : r0.systemicRiskAudioEnableDynOtherBitrate;
    }

    public final double getSystemicRiskFactor(boolean z, 5Kq r303) {
        11T.A0F(r303, 1);
        boolean z2 = this.isLive;
        if (z) {
            5Kd r0 = this.abrSetting;
            return z2 ? r0.liveSystemicRiskAudioFactor : r0.systemicRiskAudioFactor;
        }
        if (z2) {
            if (r303 == 5Kq.A02) {
                return this.abrSetting.liveUserLowLatencySystemicRiskFactor;
            }
            5Kq r02 = 5Kq.A05;
            5Kd r03 = this.abrSetting;
            return r303 == r02 ? r03.liveUserUltraLowLatencySystemicRiskFactor : r03.liveSystemicRiskFactor;
        }
        if (this.isIGClips) {
            double d = this.abrSetting.systemRiskFactorForIgClips;
            if (d > 0.0d) {
                return d;
            }
        }
        if (isOnWifi() && this.isBackgroundPrefetch) {
            double d2 = this.abrSetting.systemicRiskFactorForBgPrefetch;
            if (d2 > 0.0d) {
                return d2;
            }
        }
        return this.abrSetting.systemicRiskFactor;
    }

    public final double getSystemicRiskLowMosFactor(boolean z) {
        boolean z2 = this.isLive;
        if (z) {
            5Kd r0 = this.abrSetting;
            return z2 ? r0.liveSystemicRiskAudioLowMosFactor : r0.systemicRiskAudioLowMosFactor;
        }
        if (z2) {
            return this.abrSetting.liveSystemicRiskLowMosFactor;
        }
        if (this.isIGClips) {
            double d = this.abrSetting.systemicRiskLowMosFactorForIgClips;
            if (d > 0.0d) {
                return d;
            }
        }
        if (isOnWifi() && this.isBackgroundPrefetch) {
            double d2 = this.abrSetting.systemicRiskLowMosFactorForBgPrefetch;
            if (d2 > 0.0d) {
                return d2;
            }
        }
        return this.abrSetting.systemicRiskLowMosFactor;
    }

    public final int getSystemicRiskMaxLookaheadDurationMs() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveSystemicRiskMaxLookaheadDurationMs : r0.systemicRiskMaxLookaheadDurationMs;
    }

    public final double getSystemicRiskModMosFactor() {
        return this.abrSetting.systemicRiskModMosFactor;
    }

    public final int getSystemicRiskOtherBitrate(boolean z) {
        if (!z) {
            return 0;
        }
        boolean z2 = this.isLive;
        5Kd r0 = this.abrSetting;
        return z2 ? r0.liveSystemicRiskAudioOtherBitrate : r0.systemicRiskAudioOtherBitrate;
    }

    public final float getTTFBWeightLimitForBWEDampening() {
        return this.abrSetting.ttfbWeightLimitForBWEDampening;
    }

    public final boolean getTreatCurrentNullAsLowBuffer() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveTreatCurrentNullAsLowBuffer : r0.treatCurrentNullAsLowBuffer;
    }

    public final int getTtfbMsecWithServerSideGoodput() {
        return this.abrSetting.ttfbMsecWithServerSideGoodput;
    }

    public final boolean getUseDefaultFormatForScreenWidthConstraints() {
        return this.abrSetting.useDefaultFormatAsBackupForScreenWidthConstraints;
    }

    public final boolean getUsePlaybackCsvqm() {
        return this.abrSetting.usePlaybackCsvqm;
    }

    public final boolean getUsePlaybackMosForLowMosABR() {
        return this.abrSetting.usePlaybackMosForLowMosABR;
    }

    public final double getVirtualBufferPercent(5Kq r302) {
        11T.A0F(r302, 0);
        if (r302 == 5Kq.A02) {
            return this.abrSetting.liveLSBVirtualBufferPercent;
        }
        if (r302 == 5Kq.A05) {
            return this.abrSetting.liveULSBVirtualBufferPercent;
        }
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveVirtualBufferPercent : r0.virtualBufferPercent;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isOnWifi() {
        5LT r0 = this.connectivityManagerHolder;
        if (r0 != null) {
            return r0.A02();
        }
        return false;
    }

    public final boolean isSystemicRiskIBR(boolean z, Kiw kiw) {
        if (!z) {
            return false;
        }
        boolean z2 = this.isLive;
        5Kd r0 = this.abrSetting;
        if (z2) {
            if (r0.liveSystemicRiskAudioEnableABR) {
                return false;
            }
        } else if (r0.systemicRiskAudioEnableABR && kiw != null && kiw.A02) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301.abrSetting.overrideCacheWhenHighMos == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean overrideCacheWhenHighMos() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isStory
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r301
            X.5Kd r0 = r0.abrSetting
            r303 = r0
            r0 = r303
            boolean r0 = r0.overrideCacheWhenHighMos
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L19:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L1d:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.overrideCacheWhenHighMos():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301.abrSetting.overrideCacheWhenHighMosForPrefetch == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean overrideCacheWhenHighMosForPrefetch() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.isStory
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r301
            X.5Kd r0 = r0.abrSetting
            r303 = r0
            r0 = r303
            boolean r0 = r0.overrideCacheWhenHighMosForPrefetch
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L1d
        L19:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L1d:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration.overrideCacheWhenHighMosForPrefetch():boolean");
    }

    public final boolean shouldAlwaysPlayCachedData() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.alwaysPlayLiveCachedData : r0.alwaysPlayVodCachedData;
    }

    public final boolean shouldAvoidOnABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.shouldEnableAvoidOnABR;
    }

    public final boolean shouldDeprecateLiveInitialABR() {
        return this.abrSetting.shouldDeprecateLiveInitialABR;
    }

    public final boolean shouldExcludeCDNResponseTimeForLongPoll() {
        return this.abrSetting.removeCDNResponseTimeForLongPoll;
    }

    public final boolean shouldLogInbandTelemetryBweDebugString() {
        return this.abrSetting.shouldLogInbandTelemetryBweDebugString;
    }

    public final boolean shouldLowestSelectorIgnoreCurrent() {
        return this.isThumbnail;
    }

    public final boolean shouldUseLogarithmicRisk() {
        return this.abrSetting.useLogarithmicRisk;
    }

    public final boolean shouldUseLowPassEMAAsymmetryForBWEstimation() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveShouldUseLowPassEMAAsymmetryForBWEstimation : r0.shouldUseLowPassEMAAsymmetryForBWEstimation;
    }

    public final boolean shouldUseLowPassEMAForBWEstimation() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveShouldUseLowPassEMAForBWEstimation : r0.shouldUseLowPassEMAForBWEstimation;
    }

    public final boolean shouldUseLowPassWithWeightedEMAForBWEstimation() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveShouldUseLowPassWithWeightedEMAForBWEstimation : r0.shouldUseLowPassWithWeightedEMAForBWEstimation;
    }

    public final boolean shouldUseMosAwareCachedSelection() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useMosAwareCachedSelection;
    }

    public final boolean shouldUseRiskRewardRatio(boolean z) {
        if (z) {
            return false;
        }
        boolean z2 = this.isLive;
        5Kd r0 = this.abrSetting;
        return z2 ? r0.liveUseRiskRewardRatio : r0.useRiskRewardRatio;
    }

    public final boolean updateFormatsWithIntentionChange() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveUpdateFormatsWithIntentionChange : r0.updateFormatsWithIntentionChange;
    }

    public final boolean useMaxBitrateForABRIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForABRIfLower;
        }
        return false;
    }

    public final boolean useMaxBitrateForAOCIfLower() {
        if (this.isLive) {
            return this.abrSetting.liveUseMaxBitrateForAOCIfLower;
        }
        return false;
    }

    public final boolean useOverallMosForABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.useOverallMosForABR;
    }

    public final boolean usePersonalizedBWRiskConfPcts() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveUsePersonalizedBWRiskConfPcts : r0.usePersonalizedBWRiskConfPcts;
    }

    public final boolean usePersonalizedRiskMultipliers() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveUsePersonalizedRiskMultipliers : r0.usePersonalizedRiskMultipliers;
    }

    public final boolean usePersonalizedVirtualBuffer() {
        boolean z = this.isLive;
        5Kd r0 = this.abrSetting;
        return z ? r0.liveUsePersonalizedVirtualBuffer : r0.usePersonalizedVirtualBuffer;
    }
}
