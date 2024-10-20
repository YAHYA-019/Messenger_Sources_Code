package com.facebook.ffmpeg;

import X.7zL;
import X.7zM;
import X.AnonymousClass001;
import X.C05004ck;
import com.facebook.proxygen.TraceFieldType;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.legacy.MediaCodecVideoDecoder;

/* loaded from: FFMpegMediaFormat.class */
public class FFMpegMediaFormat {
    public static final C05004ck ALL_KEYS;
    public final Map mMap = AnonymousClass001.A0u();

    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.HashMap, X.4ck] */
    static {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("mime", String.class);
        A0u.put("language", String.class);
        A0u.put("sample-rate", Integer.class);
        A0u.put("channel-count", Integer.class);
        A0u.put(Property.ICON_TEXT_FIT_WIDTH, Integer.class);
        A0u.put(Property.ICON_TEXT_FIT_HEIGHT, Integer.class);
        A0u.put("max-width", Integer.class);
        A0u.put("max-height", Integer.class);
        A0u.put("max-input-size", Integer.class);
        A0u.put(TraceFieldType.Bitrate, Integer.class);
        A0u.put("color-format", Integer.class);
        A0u.put("frame-rate", Integer.class);
        A0u.put("i-frame-interval", Integer.class);
        A0u.put(MediaCodecVideoDecoder.FORMAT_KEY_STRIDE, Integer.class);
        A0u.put(MediaCodecVideoDecoder.FORMAT_KEY_SLICE_HEIGHT, Integer.class);
        A0u.put("repeat-previous-frame-after", Long.class);
        A0u.put("push-blank-buffers-on-shutdown", Integer.class);
        A0u.put("durationUs", Long.class);
        A0u.put("is-adts", Integer.class);
        A0u.put("channel-mask", Integer.class);
        A0u.put("aac-profile", Integer.class);
        A0u.put("flac-compression-level", Integer.class);
        A0u.put("is-autoselect", Integer.class);
        A0u.put("is-default", Integer.class);
        A0u.put("is-forced-subtitle", Integer.class);
        A0u.put("rotation", Integer.class);
        A0u.put("csd-0", ByteBuffer.class);
        A0u.put("csd-1", ByteBuffer.class);
        ALL_KEYS = new HashMap(A0u);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ffmpeg.FFMpegMediaFormat toFFMpegMediaFormat(android.media.MediaFormat r301) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegMediaFormat.toFFMpegMediaFormat(android.media.MediaFormat):com.facebook.ffmpeg.FFMpegMediaFormat");
    }

    public final boolean containsKey(String str) {
        return this.mMap.containsKey(str);
    }

    public final ByteBuffer getByteBuffer(String str) {
        return (ByteBuffer) this.mMap.get(str);
    }

    public final float getFloat(String str) {
        return 7zM.A00(this.mMap.get(str));
    }

    public final int getInteger(String str) {
        return AnonymousClass001.A03(this.mMap.get(str));
    }

    public final int getInteger(String str, int i) {
        try {
            return getInteger(str);
        } catch (ClassCastException | NullPointerException unused) {
            return i;
        }
    }

    public final long getLong(String str) {
        return AnonymousClass001.A05(this.mMap.get(str));
    }

    public final long getLong(String str, long j) {
        try {
            return getLong(str);
        } catch (ClassCastException | NullPointerException unused) {
            return j;
        }
    }

    public final String getString(String str) {
        return AnonymousClass001.A0b(str, this.mMap);
    }

    public final void setByteBuffer(String str, ByteBuffer byteBuffer) {
        this.mMap.put(str, byteBuffer);
    }

    public final void setFloat(String str, float f) {
        this.mMap.put(str, new Float(f));
    }

    public final void setInteger(String str, int i) {
        this.mMap.put(str, 7zL.A0z(i));
    }

    public final void setLong(String str, long j) {
        this.mMap.put(str, new Long(j));
    }

    public final void setString(String str, String str2) {
        this.mMap.put(str, str2);
    }

    public String toString() {
        return this.mMap.toString();
    }
}
