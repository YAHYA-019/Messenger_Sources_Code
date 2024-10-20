package X;

import android.media.MediaFormat;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: I51.class */
public final class I51 {
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0B;
    public long A0C;
    public IiE A0F;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0Y;
    public boolean A0S = false;
    public boolean A0U = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0W = false;
    public boolean A0T = false;
    public String A0J = null;
    public String A0I = null;
    public String A0H = null;
    public String A0G = null;
    public String A0K = null;
    public int A00 = 0;
    public boolean A0X = false;
    public long A0D = 0;
    public boolean A0V = false;
    public long A0A = 0;
    public MediaFormat A0E = null;
    public long A01 = 0;

    public I51() {
        long j = -1;
        this.A03 = j;
        this.A06 = j;
        this.A0C = j;
        this.A09 = j;
        this.A08 = j;
        this.A07 = j;
        this.A05 = j;
        this.A0B = j;
        this.A02 = j;
        this.A04 = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r302 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(java.lang.Object r301, java.lang.Object r302) {
        /*
            r0 = r301
            if (r0 != 0) goto L10
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 == 0) goto Le
        La:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        Le:
            r0 = r303
            return r0
        L10:
            r0 = r302
            if (r0 == 0) goto La
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I51.A00(java.lang.Object, java.lang.Object):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            I51 i51 = (I51) obj;
            if (this.A0S != i51.A0S || this.A0U != i51.A0U || this.A0O != i51.A0O || this.A0P != i51.A0P || this.A0Q != i51.A0Q || this.A0R != i51.A0R || this.A0V != i51.A0V || this.A0W != i51.A0W || this.A03 != i51.A03 || this.A06 != i51.A06 || this.A0C != i51.A0C || this.A09 != i51.A09 || this.A08 != i51.A08 || this.A07 != i51.A07 || this.A0B != i51.A0B || this.A0T != i51.A0T || this.A02 != i51.A02 || this.A00 != i51.A00 || this.A0X != i51.A0X || this.A0D != i51.A0D || this.A0Y != i51.A0Y || !A00(this.A0J, i51.A0J) || !A00(this.A0I, i51.A0I) || !A00(this.A0H, i51.A0H) || !A00(this.A0G, i51.A0G) || !A00(this.A0K, i51.A0K) || !A00(this.A0L, i51.A0L) || !A00(this.A0N, i51.A0N) || !A00(this.A0M, i51.A0M) || this.A04 != i51.A04 || this.A0A != i51.A0A || !A00(this.A0E, i51.A0E) || this.A01 != i51.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[40];
        Boolean valueOf = Boolean.valueOf(this.A0S);
        Boolean valueOf2 = Boolean.valueOf(this.A0U);
        Boolean valueOf3 = Boolean.valueOf(this.A0O);
        Boolean valueOf4 = Boolean.valueOf(this.A0P);
        Boolean valueOf5 = Boolean.valueOf(this.A0Q);
        Boolean valueOf6 = Boolean.valueOf(this.A0R);
        Boolean A0d = 1BK.A0d();
        Boolean valueOf7 = Boolean.valueOf(this.A0V);
        Boolean valueOf8 = Boolean.valueOf(this.A0W);
        Long A0i = 4YV.A0i();
        boolean A1W = 1BK.A1W(new Object[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, A0d, valueOf7, valueOf8, A0i, A0i, A0i, A0i, A0i, A0i, Long.valueOf(this.A03), Long.valueOf(this.A06), Long.valueOf(this.A0C), Long.valueOf(this.A09), Long.valueOf(this.A08), Long.valueOf(this.A07), Long.valueOf(this.A0B), Boolean.valueOf(this.A0T), Long.valueOf(this.A02), this.A0J, this.A0I, this.A0H}, objArr);
        String str = this.A0G;
        String str2 = this.A0K;
        Integer valueOf9 = Integer.valueOf(this.A00);
        Boolean valueOf10 = Boolean.valueOf(this.A0X);
        Long valueOf11 = Long.valueOf(this.A0D);
        String str3 = this.A0L;
        String str4 = this.A0N;
        String str5 = this.A0M;
        Boolean valueOf12 = Boolean.valueOf(this.A0Y);
        Long valueOf13 = Long.valueOf(this.A04);
        Long valueOf14 = Long.valueOf(this.A0A);
        Object obj = this.A0E;
        if (obj == null) {
            obj = "noOutputFormat";
        }
        System.arraycopy(new Object[]{str, str2, valueOf9, valueOf10, valueOf11, str3, str4, str5, valueOf12, valueOf13, valueOf14, obj, Long.valueOf(this.A01)}, A1W ? 1 : 0, objArr, 27, 13);
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put("isAudioTrackPresent", this.A0S);
            A12.put("isInitComplete", this.A0U);
            A12.put("codecMuxerAudioTrackIndexIsSet", this.A0O);
            A12.put("codecMuxerVideoTrackIndexIsSet", this.A0P);
            A12.put("gotAudioDataBuffer", this.A0Q);
            A12.put("gotVideoDataBuffer", this.A0R);
            A12.put("isAudioVideoTrackReset", false);
            long j = -1;
            A12.put("startTimeUs", j);
            A12.put("endTimeUs", j);
            A12.put("adjustedEndTimeUs", j);
            A12.put("syncStartTimeUs", j);
            A12.put("firstVideoSampleTimeUs", j);
            A12.put("lastVideoSampleTimeUs", j);
            A12.put("firstAudioSampleTimeUs", this.A03);
            A12.put("lastAudioSampleTimeUs", this.A06);
            A12.put("numVideoSamplesMuxed", this.A0C);
            A12.put("numAudioSamplesMuxed", this.A09);
            A12.put("numAudioSamplesErrored", this.A08);
            A12.put("lastVideoSampleMuxedUs", this.A07);
            A12.put("lastAudioSampleMuxedUs", this.A05);
            A12.put("numVideoSamplesErrored", this.A0B);
            A12.put("isEncoderCompleted", this.A0T);
            A12.put("bytesInTranscodeFile", this.A02);
            A12.putOpt("muxerName", this.A0J);
            A12.putOpt("encoderName", this.A0I);
            A12.putOpt("decoderName", this.A0H);
            A12.putOpt("profileName", this.A0K);
            A12.put("targetBitRate", this.A00);
            A12.put("isNonIncrementalTimestamp", this.A0X);
            A12.put("timestampDifference", this.A0D);
            A12.putOpt("videoTranscodeInnerException", this.A0L);
            A12.putOpt("videoTranscodeInnerExceptionCause", this.A0N);
            A12.putOpt("videoTranscodeInnerExceptionCallStack", this.A0M);
            A12.put("isPassThroughTranscoderUsed", this.A0Y);
            A12.put("isMediaCompositionInput", this.A0V);
            A12.put("framePtsUs", this.A04);
            A12.put("numOfRetriesToSucceedEncoder", this.A0A);
            A12.put("audioTranscodeDurationNs", this.A01);
        } catch (JSONException unused) {
        }
        return A12.toString();
    }
}
