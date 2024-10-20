package com.facebook.messaging.analytics.reliability;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.io.Serializable;

/* loaded from: AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.class */
public class AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo implements Serializable {
    public String cameraMode;
    public String cameraPosition;
    public int downsizedHeight;
    public int downsizedWidth;
    public String entryPoint;
    public String exceptionInfo;
    public boolean isSendByServer;
    public boolean isTwoPhase;
    public long mediaDurationMs;
    public String mediaFbId;
    public String mediaSource;
    public String mediaType;
    public final String messageType;
    public String mimeType;
    public int numberOfSubAttachments;
    public int originalHeight;
    public int originalVideoBitrate;
    public int originalWidth;
    public String parentMessageId;
    public String photoQualityOption;
    public int preparationAttempts;
    public String sendSource;
    public int sizeInBytesOfSubAttachments;
    public int sizeInBytesOriginally;
    public final long startTimestamp;
    public String stickerId;
    public final String threadKey;
    public final String threadType;
    public int transcodedBitrate;
    public int mqttAttempts = 0;
    public int graphAttempts = 0;
    public int numOfFailure = 0;
    public String outcome = "u";
    public int interopState = 0;

    public AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo(ThreadKey threadKey, String str, String str2, long j) {
        this.preparationAttempts = -1;
        this.startTimestamp = j;
        this.messageType = str;
        String str3 = null;
        this.threadType = threadKey != null ? threadKey.A06.toString() : null;
        this.threadKey = threadKey != null ? threadKey.A0u() : str3;
        this.stickerId = str2;
        this.preparationAttempts = 0;
    }

    public AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo(ThreadKey threadKey, String str, String str2, String str3, String str4, int i, long j) {
        this.preparationAttempts = -1;
        this.startTimestamp = j;
        this.messageType = str;
        String str5 = null;
        this.threadType = threadKey != null ? threadKey.A06.toString() : null;
        this.threadKey = threadKey != null ? threadKey.A0u() : str5;
        this.sendSource = str2;
        this.entryPoint = str3;
        this.mediaSource = str4;
        this.numberOfSubAttachments = i;
        this.preparationAttempts = 1;
    }

    public AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo(ThreadKey threadKey, String str, String str2, String str3, String str4, String str5, String str6, int i, long j) {
        this.preparationAttempts = -1;
        this.startTimestamp = j;
        this.messageType = str;
        String str7 = null;
        this.threadType = threadKey != null ? threadKey.A06.toString() : null;
        this.threadKey = threadKey != null ? threadKey.A0u() : str7;
        this.sendSource = str2;
        this.entryPoint = str3;
        this.mediaSource = str4;
        this.cameraPosition = str5;
        this.cameraMode = str6;
        this.numberOfSubAttachments = i;
        this.preparationAttempts = 1;
    }
}
