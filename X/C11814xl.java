package X;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.analytics.reliability.AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.send.SendError;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xl.class */
public final class C11814xl {
    public static final 1G2 A09 = 1NK.A24.A0D("rich_media_reliability_serialized");
    public final C00i A01 = new 1BQ(99390);
    public final C00i A04 = new 1BQ(32769);
    public final C00i A08 = new 1BQ(16772);
    public final C00i A03 = new 1BQ(33013);
    public final C00i A02 = new 1BQ(16511);
    public final C00i A05 = new 1BV(67682);
    public LinkedHashMap A00 = null;
    public final Set A07 = new HashSet();
    public final Set A06 = new HashSet();

    public static AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo A00(C11814xl c11814xl, Message message) {
        String str = message.A1m;
        if (!1JF.A0A(str)) {
            return new AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo(message.A0V, ((C00653oY) c11814xl.A04.get()).A01(message), str, 1BL.A08(c11814xl.A01));
        }
        if (!A05(message)) {
            return null;
        }
        long A08 = 1BL.A08(c11814xl.A01);
        String A01 = ((C00653oY) c11814xl.A04.get()).A01(message);
        ThreadKey threadKey = message.A0V;
        ImmutableList immutableList = message.A0z;
        String A012 = 4YU.A0a(immutableList, 0).A01();
        MediaResourceSendSource mediaResourceSendSource = 4YU.A0a(immutableList, 0).A0W;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(mediaResourceSendSource.A00.analyticsName);
        String str2 = mediaResourceSendSource.A02;
        if (str2 != null) {
            A0k.append("#");
            A0k.append(str2);
        }
        String obj = A0k.toString();
        String str3 = 4YU.A0a(immutableList, 0).A0W.A01.analyticsName;
        MediaResourceCameraPosition mediaResourceCameraPosition = 4YU.A0a(immutableList, 0).A0V;
        String obj2 = mediaResourceCameraPosition == MediaResourceCameraPosition.A01 ? C5ev.UNKNOWN.analyticsName : mediaResourceCameraPosition.toString();
        MediaResource A0a = 4YU.A0a(immutableList, 0);
        Uri uri = A0a.A0E;
        return new AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo(threadKey, A01, A012, obj, str3, obj2, (uri == null || uri.getPath() == null || !uri.getPath().contains("rtc-snapshot-")) ? A0a.A0j : "VIDEO_CALL", immutableList.size(), A08);
    }

    public static void A01(AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo, C11814xl c11814xl, Message message) {
        if (A05(message)) {
            ImmutableList immutableList = message.A0z;
            1Du it = immutableList.iterator();
            int i = 0;
            while (it.hasNext()) {
                i = (int) (i + 4YU.A0Z(it).A07);
            }
            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.sizeInBytesOriginally = i;
            MediaResource mediaResource = (MediaResource) 1BK.A0r(immutableList);
            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mediaType = mediaResource.A0Q.name().toLowerCase(Locale.US);
            String str = mediaResource.A0s;
            if (str != null) {
                aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mimeType = str;
            }
            C5ew c5ew = mediaResource.A0P;
            if (c5ew != null) {
                aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.photoQualityOption = c5ew.name();
            }
            String str2 = message.A1g;
            if (str2 != null) {
                Set set = c11814xl.A07;
                if (set.contains(str2)) {
                    0fH.A0h(mediaResource.A0u, "AggregatedRichMediaReliabilityLogger", "Marking %s as two phase offlineId (at creation)");
                    aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.isTwoPhase = true;
                    set.remove(str2);
                }
            }
            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.originalHeight = mediaResource.A00;
            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.originalWidth = mediaResource.A04;
            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.originalVideoBitrate = mediaResource.A03;
            aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mediaDurationMs = mediaResource.A08;
        }
    }

    /* JADX WARN: Type inference failed for: r0v201, types: [X.2J3, X.7b5] */
    public static void A02(AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo, C11814xl c11814xl, SendError sendError, String str) {
        synchronized (c11814xl) {
            2Jy A0H = 4YU.A0H(AbstractC00603o4.A00(286));
            A0H.A0D("otd", str);
            A0H.A0D("msgType", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.messageType);
            A0H.A0D("threadType", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.threadType);
            A0H.A0D("threadKey", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.threadKey);
            A0H.A0D("entry_point", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.entryPoint);
            A0H.A0D(GOm.A00(1), aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mediaSource);
            A0H.A0D("media_camera_position", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.cameraPosition);
            A0H.A0D("media_camera_mode", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.cameraMode);
            A0H.A0B("mqttAttempts", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mqttAttempts);
            A0H.A0B("graphAttempts", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.graphAttempts);
            A0H.A0B("preparationAttempts", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.preparationAttempts);
            A0H.A0B("numOfFailure", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.numOfFailure);
            A0H.A0B("attachmentCount", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.numberOfSubAttachments);
            A0H.A0B("totalSize", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.sizeInBytesOfSubAttachments);
            A0H.A0B("original_size", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.sizeInBytesOriginally);
            A0H.A0D("mediaType", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mediaType);
            A0H.A0D("mimeType", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mimeType);
            A0H.A0D("photoQualityOption", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.photoQualityOption);
            A0H.A0D("outcome", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.outcome);
            if (sendError == null) {
                A0H.A0B("sendSuccess", 1);
                A0H.A0C("sendLatency", 1BL.A08(c11814xl.A01) - aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.startTimestamp);
            } else {
                A0H.A0B("sendSuccess", 0);
                A0H.A09(sendError, "finalError");
                A0H.A0C("failLatency", 1BL.A08(c11814xl.A01) - aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.startTimestamp);
            }
            A0H.A0C("startTime", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.startTimestamp);
            A0H.A0C("duration", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mediaDurationMs);
            A0H.A0B("original_height", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.originalHeight);
            A0H.A0B("original_width", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.originalWidth);
            A0H.A0B("original_video_bitrate", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.originalVideoBitrate);
            A0H.A0B("downsized_height", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.downsizedHeight);
            A0H.A0B("downsized_width", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.downsizedWidth);
            A0H.A0B("transcoded_bitrate", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.transcodedBitrate);
            A0H.A0D("sticker_id", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.stickerId);
            A0H.A0F("use_double_phase", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.isTwoPhase);
            A0H.A0D("failure_exception", C7ke.A00(aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.exceptionInfo));
            A0H.A0D("parent_msg_id", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.parentMessageId);
            A0H.A0D("send_message_by_server", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.isSendByServer ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT);
            A0H.A0D("media_fbid", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mediaFbId);
            A0H.A0D("message_offline_id", str);
            A0H.A0B("interop_state", aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.interopState);
            String str2 = aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.isTwoPhase ? "of two" : "of one";
            String str3 = aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.mediaFbId;
            24X A00 = 2Jy.A00(A0H, "sendLatency");
            Long valueOf = A00 == null ? null : Long.valueOf(A00.A07());
            if (0fH.A01.BTv(4)) {
                0fH.A0l("AggregatedRichMediaReliabilityLogger", StringFormatUtil.formatStrLocaleSafe("first phase (%s) offlineThreadID: %s mediaFbId %s latency %d", str2, str, str3, valueOf));
            }
            C1kw A06 = 1BK.A06(c11814xl.A08);
            if (C7b5.A00 == null) {
                synchronized (C7b5.class) {
                    if (C7b5.A00 == null) {
                        C7b5.A00 = new C2J3(A06);
                    }
                }
            }
            C7b5.A00.A03(A0H);
        }
    }

    public static void A03(C11814xl c11814xl) {
        synchronized (c11814xl) {
            try {
                if (c11814xl.A00 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        objectOutputStream.writeObject(c11814xl.A00);
                        objectOutputStream.flush();
                        String str = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0));
                        objectOutputStream.close();
                        1Ql edit = ((FbSharedPreferences) c11814xl.A03.get()).edit();
                        edit.CaL(A09, str);
                        edit.commit();
                    } catch (IOException e) {
                        1BK.A09(c11814xl.A02).softReport("rich_media_reliabilities_serialization_failed", e);
                        1Ql A0V = 1BL.A0V(c11814xl.A03);
                        A0V.Cdj(A09);
                        A0V.commit();
                    }
                }
            } finally {
            }
        }
    }

    public static boolean A04(C11814xl c11814xl) {
        boolean z;
        synchronized (c11814xl) {
            if (c11814xl.A00 == null) {
                C00i c00i = c11814xl.A03;
                c00i.get();
                c11814xl.A00 = 1BK.A1C();
                FbSharedPreferences A0R = 1BK.A0R(c00i);
                1G2 r0 = A09;
                String BD0 = A0R.BD0(r0);
                if (BD0 != null) {
                    try {
                        Iterator A0x = AnonymousClass001.A0x((LinkedHashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(BD0, 0))).readObject());
                        while (A0x.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(A0x);
                            AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo = (AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo) A0z.getValue();
                            if (1BL.A08(c11814xl.A01) - aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.startTimestamp < 259200000) {
                                c11814xl.A00.put(AnonymousClass001.A0j(A0z), aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo);
                            }
                        }
                    } catch (Exception unused) {
                        1Ql A0V = 1BL.A0V(c00i);
                        A0V.Cdj(r0);
                        A0V.commit();
                    }
                }
            }
            z = false;
            if (c11814xl.A00 != null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0.contains(null) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A05(com.facebook.messaging.model.messages.Message r301) {
        /*
            r0 = r301
            com.google.common.collect.ImmutableList r0 = r0.A0z
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L1e
            r0 = r301
            boolean r0 = r0.isEmpty()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1e
            r0 = r301
            r1 = 0
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L20
        L1e:
            r0 = 0
            r302 = r0
        L20:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11814xl.A05(com.facebook.messaging.model.messages.Message):boolean");
    }

    public static boolean A06(Message message) {
        if (A05(message) || (!1JF.A0A(message.A1m))) {
            return true;
        }
        ImmutableList immutableList = message.A0r;
        return (immutableList == null || immutableList.isEmpty() || immutableList.contains(null)) ? false : true;
    }

    public void A07(String str, Throwable th) {
        synchronized (this) {
            if (!1JF.A0B(str) && A04(this)) {
                AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo = (AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo) this.A00.get(str);
                if (aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo != null) {
                    aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.exceptionInfo = th.toString();
                    A03(this);
                }
            }
        }
    }

    public void A08(String str, boolean z) {
        synchronized (this) {
            if (A04(this) && str != null) {
                AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo = (AggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo) this.A00.get(str);
                if (aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo != null) {
                    aggregatedRichMediaReliabilityLogger$RichMediaReliabilityInfo.isSendByServer = z;
                    A03(this);
                }
            }
        }
    }
}
