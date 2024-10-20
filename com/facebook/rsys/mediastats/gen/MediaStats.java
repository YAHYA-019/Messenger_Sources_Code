package com.facebook.rsys.mediastats.gen;

import X.1BK;
import X.1BL;
import X.2JQ;
import X.4YU;
import X.7zP;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOo;
import X.GOq;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: MediaStats.class */
public class MediaStats {
    public static 2JQ CONVERTER = IR0.A00(ActionId.APP_MAIN);
    public static long sMcfTypeId;
    public final Float audioBitrateKbps;
    public final Long audioBytesReceived;
    public final Long audioBytesSent;
    public final String audioCodec;
    public final Long audioCtpLatencyMs;
    public final Long audioCtpRoundtripLatencyMs;
    public final Long audioE2eDelayMS;
    public final Long audioEstimatedPlayoutTimestampMS;
    public final Long audioFecPacketsReceived;
    public final Long audioJitterMS;
    public final Long audioLevel;
    public final Long audioNackCount;
    public final Long audioPacketsLost;
    public final Long audioPacketsReceived;
    public final Long audioRetransmittedPacketsSent;
    public final Float audioSamplingRateKhz;
    public final String audioSsrc;
    public final Float audioTargetBitrateKbps;
    public final Long availableOutgoingBitrate;
    public final Long avgRttMs;
    public final int channelType;
    public final Long concealedSamples;
    public final String connectionType;
    public final Long curRttMs;
    public final String currentIpVersion;
    public final Integer localNetworkCost;
    public final String localType;
    public final Long maxBitrateKbps;
    public final int mediaPath;
    public final String mimeType;
    public final Long minBitrateKbps;
    public final Integer noiseSuppressionMode;
    public final Boolean nsCpuFallbackStatus;
    public final Long nsInferenceTime;
    public final Integer remoteNetworkCost;
    public final String remoteType;
    public final ScreenShareStats screenShareStats;
    public final Long startBitrateKbps;
    public final int streamDirection;
    public final String streamId;
    public final int streamType;
    public final Long totalSamplesReceived;
    public final String userId;
    public final ArrayList videoStreams;

    public MediaStats(String str, String str2, int i, int i2, int i3, String str3, ArrayList arrayList, String str4, Long l, Float f, Long l2, String str5, Float f2, Float f3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, String str6, String str7, Long l16, Long l17, Integer num, String str8, Integer num2, String str9, int i4, Long l18, Long l19, Long l20, Long l21, Long l22, Boolean bool, Integer num3, ScreenShareStats screenShareStats) {
        7zP.A1S(str, str2, arrayList);
        this.streamId = str;
        this.userId = str2;
        this.channelType = i;
        this.streamDirection = i2;
        this.streamType = i3;
        this.mimeType = str3;
        this.videoStreams = arrayList;
        this.audioSsrc = str4;
        this.audioEstimatedPlayoutTimestampMS = l;
        this.audioSamplingRateKhz = f;
        this.audioE2eDelayMS = l2;
        this.audioCodec = str5;
        this.audioBitrateKbps = f2;
        this.audioTargetBitrateKbps = f3;
        this.audioBytesReceived = l3;
        this.audioBytesSent = l4;
        this.audioPacketsReceived = l5;
        this.audioPacketsLost = l6;
        this.audioFecPacketsReceived = l7;
        this.audioNackCount = l8;
        this.audioRetransmittedPacketsSent = l9;
        this.audioJitterMS = l10;
        this.audioCtpLatencyMs = l11;
        this.audioCtpRoundtripLatencyMs = l12;
        this.minBitrateKbps = l13;
        this.startBitrateKbps = l14;
        this.maxBitrateKbps = l15;
        this.connectionType = str6;
        this.currentIpVersion = str7;
        this.avgRttMs = l16;
        this.curRttMs = l17;
        this.localNetworkCost = num;
        this.localType = str8;
        this.remoteNetworkCost = num2;
        this.remoteType = str9;
        this.mediaPath = i4;
        this.concealedSamples = l18;
        this.totalSamplesReceived = l19;
        this.audioLevel = l20;
        this.availableOutgoingBitrate = l21;
        this.nsInferenceTime = l22;
        this.nsCpuFallbackStatus = bool;
        this.noiseSuppressionMode = num3;
        this.screenShareStats = screenShareStats;
    }

    public static native MediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaStats)) {
                return false;
            }
            MediaStats mediaStats = (MediaStats) obj;
            if (!this.streamId.equals(mediaStats.streamId) || !this.userId.equals(mediaStats.userId) || this.channelType != mediaStats.channelType || this.streamDirection != mediaStats.streamDirection || this.streamType != mediaStats.streamType) {
                return false;
            }
            String str = this.mimeType;
            String str2 = mediaStats.mimeType;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.videoStreams.equals(mediaStats.videoStreams)) {
                return false;
            }
            String str3 = this.audioSsrc;
            String str4 = mediaStats.audioSsrc;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            Long l = this.audioEstimatedPlayoutTimestampMS;
            Long l2 = mediaStats.audioEstimatedPlayoutTimestampMS;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Float f = this.audioSamplingRateKhz;
            Float f2 = mediaStats.audioSamplingRateKhz;
            if (f == null) {
                if (f2 != null) {
                    return false;
                }
            } else if (!f.equals(f2)) {
                return false;
            }
            Long l3 = this.audioE2eDelayMS;
            Long l4 = mediaStats.audioE2eDelayMS;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            String str5 = this.audioCodec;
            String str6 = mediaStats.audioCodec;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            Float f3 = this.audioBitrateKbps;
            Float f4 = mediaStats.audioBitrateKbps;
            if (f3 == null) {
                if (f4 != null) {
                    return false;
                }
            } else if (!f3.equals(f4)) {
                return false;
            }
            Float f5 = this.audioTargetBitrateKbps;
            Float f6 = mediaStats.audioTargetBitrateKbps;
            if (f5 == null) {
                if (f6 != null) {
                    return false;
                }
            } else if (!f5.equals(f6)) {
                return false;
            }
            Long l5 = this.audioBytesReceived;
            Long l6 = mediaStats.audioBytesReceived;
            if (l5 == null) {
                if (l6 != null) {
                    return false;
                }
            } else if (!l5.equals(l6)) {
                return false;
            }
            Long l7 = this.audioBytesSent;
            Long l8 = mediaStats.audioBytesSent;
            if (l7 == null) {
                if (l8 != null) {
                    return false;
                }
            } else if (!l7.equals(l8)) {
                return false;
            }
            Long l9 = this.audioPacketsReceived;
            Long l10 = mediaStats.audioPacketsReceived;
            if (l9 == null) {
                if (l10 != null) {
                    return false;
                }
            } else if (!l9.equals(l10)) {
                return false;
            }
            Long l11 = this.audioPacketsLost;
            Long l12 = mediaStats.audioPacketsLost;
            if (l11 == null) {
                if (l12 != null) {
                    return false;
                }
            } else if (!l11.equals(l12)) {
                return false;
            }
            Long l13 = this.audioFecPacketsReceived;
            Long l14 = mediaStats.audioFecPacketsReceived;
            if (l13 == null) {
                if (l14 != null) {
                    return false;
                }
            } else if (!l13.equals(l14)) {
                return false;
            }
            Long l15 = this.audioNackCount;
            Long l16 = mediaStats.audioNackCount;
            if (l15 == null) {
                if (l16 != null) {
                    return false;
                }
            } else if (!l15.equals(l16)) {
                return false;
            }
            Long l17 = this.audioRetransmittedPacketsSent;
            Long l18 = mediaStats.audioRetransmittedPacketsSent;
            if (l17 == null) {
                if (l18 != null) {
                    return false;
                }
            } else if (!l17.equals(l18)) {
                return false;
            }
            Long l19 = this.audioJitterMS;
            Long l20 = mediaStats.audioJitterMS;
            if (l19 == null) {
                if (l20 != null) {
                    return false;
                }
            } else if (!l19.equals(l20)) {
                return false;
            }
            Long l21 = this.audioCtpLatencyMs;
            Long l22 = mediaStats.audioCtpLatencyMs;
            if (l21 == null) {
                if (l22 != null) {
                    return false;
                }
            } else if (!l21.equals(l22)) {
                return false;
            }
            Long l23 = this.audioCtpRoundtripLatencyMs;
            Long l24 = mediaStats.audioCtpRoundtripLatencyMs;
            if (l23 == null) {
                if (l24 != null) {
                    return false;
                }
            } else if (!l23.equals(l24)) {
                return false;
            }
            Long l25 = this.minBitrateKbps;
            Long l26 = mediaStats.minBitrateKbps;
            if (l25 == null) {
                if (l26 != null) {
                    return false;
                }
            } else if (!l25.equals(l26)) {
                return false;
            }
            Long l27 = this.startBitrateKbps;
            Long l28 = mediaStats.startBitrateKbps;
            if (l27 == null) {
                if (l28 != null) {
                    return false;
                }
            } else if (!l27.equals(l28)) {
                return false;
            }
            Long l29 = this.maxBitrateKbps;
            Long l30 = mediaStats.maxBitrateKbps;
            if (l29 == null) {
                if (l30 != null) {
                    return false;
                }
            } else if (!l29.equals(l30)) {
                return false;
            }
            String str7 = this.connectionType;
            String str8 = mediaStats.connectionType;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.currentIpVersion;
            String str10 = mediaStats.currentIpVersion;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            Long l31 = this.avgRttMs;
            Long l32 = mediaStats.avgRttMs;
            if (l31 == null) {
                if (l32 != null) {
                    return false;
                }
            } else if (!l31.equals(l32)) {
                return false;
            }
            Long l33 = this.curRttMs;
            Long l34 = mediaStats.curRttMs;
            if (l33 == null) {
                if (l34 != null) {
                    return false;
                }
            } else if (!l33.equals(l34)) {
                return false;
            }
            Integer num = this.localNetworkCost;
            Integer num2 = mediaStats.localNetworkCost;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str11 = this.localType;
            String str12 = mediaStats.localType;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            Integer num3 = this.remoteNetworkCost;
            Integer num4 = mediaStats.remoteNetworkCost;
            if (num3 == null) {
                if (num4 != null) {
                    return false;
                }
            } else if (!num3.equals(num4)) {
                return false;
            }
            String str13 = this.remoteType;
            String str14 = mediaStats.remoteType;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            if (this.mediaPath != mediaStats.mediaPath) {
                return false;
            }
            Long l35 = this.concealedSamples;
            Long l36 = mediaStats.concealedSamples;
            if (l35 == null) {
                if (l36 != null) {
                    return false;
                }
            } else if (!l35.equals(l36)) {
                return false;
            }
            Long l37 = this.totalSamplesReceived;
            Long l38 = mediaStats.totalSamplesReceived;
            if (l37 == null) {
                if (l38 != null) {
                    return false;
                }
            } else if (!l37.equals(l38)) {
                return false;
            }
            Long l39 = this.audioLevel;
            Long l40 = mediaStats.audioLevel;
            if (l39 == null) {
                if (l40 != null) {
                    return false;
                }
            } else if (!l39.equals(l40)) {
                return false;
            }
            Long l41 = this.availableOutgoingBitrate;
            Long l42 = mediaStats.availableOutgoingBitrate;
            if (l41 == null) {
                if (l42 != null) {
                    return false;
                }
            } else if (!l41.equals(l42)) {
                return false;
            }
            Long l43 = this.nsInferenceTime;
            Long l44 = mediaStats.nsInferenceTime;
            if (l43 == null) {
                if (l44 != null) {
                    return false;
                }
            } else if (!l43.equals(l44)) {
                return false;
            }
            Boolean bool = this.nsCpuFallbackStatus;
            Boolean bool2 = mediaStats.nsCpuFallbackStatus;
            if (bool == null) {
                if (bool2 != null) {
                    return false;
                }
            } else if (!bool.equals(bool2)) {
                return false;
            }
            Integer num5 = this.noiseSuppressionMode;
            Integer num6 = mediaStats.noiseSuppressionMode;
            if (num5 == null) {
                if (num6 != null) {
                    return false;
                }
            } else if (!num5.equals(num6)) {
                return false;
            }
            ScreenShareStats screenShareStats = this.screenShareStats;
            ScreenShareStats screenShareStats2 = mediaStats.screenShareStats;
            if (screenShareStats == null) {
                if (screenShareStats2 != null) {
                    return false;
                }
            } else if (!screenShareStats.equals(screenShareStats2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass002.A05(this.videoStreams, (((((((AnonymousClass002.A07(this.userId, AbstractC2326GOr.A07(this.streamId)) + this.channelType) * 31) + this.streamDirection) * 31) + this.streamType) * 31) + 1BL.A05(this.mimeType)) * 31) + 1BL.A05(this.audioSsrc)) * 31) + AnonymousClass001.A02(this.audioEstimatedPlayoutTimestampMS)) * 31) + AnonymousClass001.A02(this.audioSamplingRateKhz)) * 31) + AnonymousClass001.A02(this.audioE2eDelayMS)) * 31) + 1BL.A05(this.audioCodec)) * 31) + AnonymousClass001.A02(this.audioBitrateKbps)) * 31) + AnonymousClass001.A02(this.audioTargetBitrateKbps)) * 31) + AnonymousClass001.A02(this.audioBytesReceived)) * 31) + AnonymousClass001.A02(this.audioBytesSent)) * 31) + AnonymousClass001.A02(this.audioPacketsReceived)) * 31) + AnonymousClass001.A02(this.audioPacketsLost)) * 31) + AnonymousClass001.A02(this.audioFecPacketsReceived)) * 31) + AnonymousClass001.A02(this.audioNackCount)) * 31) + AnonymousClass001.A02(this.audioRetransmittedPacketsSent)) * 31) + AnonymousClass001.A02(this.audioJitterMS)) * 31) + AnonymousClass001.A02(this.audioCtpLatencyMs)) * 31) + AnonymousClass001.A02(this.audioCtpRoundtripLatencyMs)) * 31) + AnonymousClass001.A02(this.minBitrateKbps)) * 31) + AnonymousClass001.A02(this.startBitrateKbps)) * 31) + AnonymousClass001.A02(this.maxBitrateKbps)) * 31) + 1BL.A05(this.connectionType)) * 31) + 1BL.A05(this.currentIpVersion)) * 31) + AnonymousClass001.A02(this.avgRttMs)) * 31) + AnonymousClass001.A02(this.curRttMs)) * 31) + AnonymousClass001.A02(this.localNetworkCost)) * 31) + 1BL.A05(this.localType)) * 31) + AnonymousClass001.A02(this.remoteNetworkCost)) * 31) + 1BL.A05(this.remoteType)) * 31) + this.mediaPath) * 31) + AnonymousClass001.A02(this.concealedSamples)) * 31) + AnonymousClass001.A02(this.totalSamplesReceived)) * 31) + AnonymousClass001.A02(this.audioLevel)) * 31) + AnonymousClass001.A02(this.availableOutgoingBitrate)) * 31) + AnonymousClass001.A02(this.nsInferenceTime)) * 31) + AnonymousClass001.A02(this.nsCpuFallbackStatus)) * 31) + AnonymousClass001.A02(this.noiseSuppressionMode)) * 31) + 4YU.A03(this.screenShareStats);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MediaStats{");
        4YU.A1S("streamId=", this.streamId, A0k);
        4YU.A1S(",userId=", this.userId, A0k);
        GOo.A1P(",channelType=", A0k, this.channelType);
        GOo.A1P(",streamDirection=", A0k, this.streamDirection);
        GOo.A1P(",streamType=", A0k, this.streamType);
        4YU.A1S(",mimeType=", this.mimeType, A0k);
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append(",videoStreams=");
        A0k2.append(this.videoStreams);
        1BK.A1R(A0k, A0k2);
        4YU.A1S(",audioSsrc=", this.audioSsrc, A0k);
        StringBuilder A0k3 = AnonymousClass001.A0k();
        A0k3.append(",audioEstimatedPlayoutTimestampMS=");
        StringBuilder A0j = AbstractC2326GOr.A0j(this.audioEstimatedPlayoutTimestampMS, A0k3, A0k);
        A0j.append(",audioSamplingRateKhz=");
        StringBuilder A0j2 = AbstractC2326GOr.A0j(this.audioSamplingRateKhz, A0j, A0k);
        A0j2.append(",audioE2eDelayMS=");
        A0j2.append(this.audioE2eDelayMS);
        1BK.A1R(A0k, A0j2);
        4YU.A1S(",audioCodec=", this.audioCodec, A0k);
        StringBuilder A0k4 = AnonymousClass001.A0k();
        A0k4.append(",audioBitrateKbps=");
        StringBuilder A0j3 = AbstractC2326GOr.A0j(this.audioBitrateKbps, A0k4, A0k);
        A0j3.append(",audioTargetBitrateKbps=");
        StringBuilder A0j4 = AbstractC2326GOr.A0j(this.audioTargetBitrateKbps, A0j3, A0k);
        A0j4.append(",audioBytesReceived=");
        StringBuilder A0j5 = AbstractC2326GOr.A0j(this.audioBytesReceived, A0j4, A0k);
        A0j5.append(",audioBytesSent=");
        StringBuilder A0j6 = AbstractC2326GOr.A0j(this.audioBytesSent, A0j5, A0k);
        A0j6.append(",audioPacketsReceived=");
        StringBuilder A0j7 = AbstractC2326GOr.A0j(this.audioPacketsReceived, A0j6, A0k);
        A0j7.append(",audioPacketsLost=");
        StringBuilder A0j8 = AbstractC2326GOr.A0j(this.audioPacketsLost, A0j7, A0k);
        A0j8.append(",audioFecPacketsReceived=");
        StringBuilder A0j9 = AbstractC2326GOr.A0j(this.audioFecPacketsReceived, A0j8, A0k);
        A0j9.append(",audioNackCount=");
        StringBuilder A0j10 = AbstractC2326GOr.A0j(this.audioNackCount, A0j9, A0k);
        A0j10.append(",audioRetransmittedPacketsSent=");
        StringBuilder A0j11 = AbstractC2326GOr.A0j(this.audioRetransmittedPacketsSent, A0j10, A0k);
        A0j11.append(",audioJitterMS=");
        StringBuilder A0j12 = AbstractC2326GOr.A0j(this.audioJitterMS, A0j11, A0k);
        A0j12.append(",audioCtpLatencyMs=");
        StringBuilder A0j13 = AbstractC2326GOr.A0j(this.audioCtpLatencyMs, A0j12, A0k);
        A0j13.append(",audioCtpRoundtripLatencyMs=");
        StringBuilder A0j14 = AbstractC2326GOr.A0j(this.audioCtpRoundtripLatencyMs, A0j13, A0k);
        A0j14.append(",minBitrateKbps=");
        StringBuilder A0j15 = AbstractC2326GOr.A0j(this.minBitrateKbps, A0j14, A0k);
        A0j15.append(",startBitrateKbps=");
        StringBuilder A0j16 = AbstractC2326GOr.A0j(this.startBitrateKbps, A0j15, A0k);
        A0j16.append(",maxBitrateKbps=");
        A0j16.append(this.maxBitrateKbps);
        1BK.A1R(A0k, A0j16);
        4YU.A1S(",connectionType=", this.connectionType, A0k);
        4YU.A1S(",currentIpVersion=", this.currentIpVersion, A0k);
        StringBuilder A0k5 = AnonymousClass001.A0k();
        A0k5.append(",avgRttMs=");
        StringBuilder A0j17 = AbstractC2326GOr.A0j(this.avgRttMs, A0k5, A0k);
        A0j17.append(",curRttMs=");
        StringBuilder A0j18 = AbstractC2326GOr.A0j(this.curRttMs, A0j17, A0k);
        A0j18.append(",localNetworkCost=");
        A0j18.append(this.localNetworkCost);
        1BK.A1R(A0k, A0j18);
        4YU.A1S(",localType=", this.localType, A0k);
        StringBuilder A0k6 = AnonymousClass001.A0k();
        A0k6.append(",remoteNetworkCost=");
        A0k6.append(this.remoteNetworkCost);
        1BK.A1R(A0k, A0k6);
        4YU.A1S(",remoteType=", this.remoteType, A0k);
        GOo.A1P(",mediaPath=", A0k, this.mediaPath);
        StringBuilder A0k7 = AnonymousClass001.A0k();
        A0k7.append(",concealedSamples=");
        StringBuilder A0j19 = AbstractC2326GOr.A0j(this.concealedSamples, A0k7, A0k);
        A0j19.append(",totalSamplesReceived=");
        StringBuilder A0j20 = AbstractC2326GOr.A0j(this.totalSamplesReceived, A0j19, A0k);
        A0j20.append(",audioLevel=");
        StringBuilder A0j21 = AbstractC2326GOr.A0j(this.audioLevel, A0j20, A0k);
        A0j21.append(",availableOutgoingBitrate=");
        StringBuilder A0j22 = AbstractC2326GOr.A0j(this.availableOutgoingBitrate, A0j21, A0k);
        A0j22.append(",nsInferenceTime=");
        StringBuilder A0j23 = AbstractC2326GOr.A0j(this.nsInferenceTime, A0j22, A0k);
        A0j23.append(",nsCpuFallbackStatus=");
        StringBuilder A0j24 = AbstractC2326GOr.A0j(this.nsCpuFallbackStatus, A0j23, A0k);
        A0j24.append(",noiseSuppressionMode=");
        StringBuilder A0j25 = AbstractC2326GOr.A0j(this.noiseSuppressionMode, A0j24, A0k);
        A0j25.append(",screenShareStats=");
        return GOq.A12(AnonymousClass001.A0a(this.screenShareStats, A0j25), A0k);
    }
}
