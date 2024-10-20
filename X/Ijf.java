package X;

import android.media.MediaFormat;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.io.IOException;

/* loaded from: Ijf.class */
public final class Ijf implements JGz {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public String A08;

    /* JADX WARN: Type inference failed for: r0v20, types: [X.Ijf, java.lang.Object] */
    public static Ijf A00(JKb jKb, String str) {
        int i;
        JN4 AIh = jKb.AIh();
        try {
            try {
                AIh.Cnx(str);
                MediaFormat mediaFormat = I9s.A01(AIh).A01;
                ?? obj = new Object();
                if (mediaFormat.containsKey(Property.ICON_TEXT_FIT_HEIGHT)) {
                    obj.A04 = mediaFormat.getInteger(Property.ICON_TEXT_FIT_HEIGHT);
                    if (mediaFormat.containsKey(Property.ICON_TEXT_FIT_WIDTH)) {
                        obj.A06 = mediaFormat.getInteger(Property.ICON_TEXT_FIT_WIDTH);
                        if (mediaFormat.containsKey("frame-rate")) {
                            obj.A03 = mediaFormat.getInteger("frame-rate");
                            if (mediaFormat.containsKey("durationUs")) {
                                obj.A07 = mediaFormat.getLong("durationUs");
                                if (mediaFormat.containsKey("rotation-degrees")) {
                                    obj.A05 = mediaFormat.getInteger("rotation-degrees");
                                } else if (mediaFormat.containsKey("rotation")) {
                                    obj.A05 = mediaFormat.getInteger("rotation");
                                } else {
                                    obj.A05 = 0;
                                }
                                if (mediaFormat.containsKey("mime")) {
                                    String string = mediaFormat.getString("mime");
                                    if (string != null) {
                                        obj.A08 = string;
                                        if (mediaFormat.containsKey("profile")) {
                                            obj.A02 = mediaFormat.getInteger("profile");
                                            if (mediaFormat.containsKey("color-transfer")) {
                                                mediaFormat.getInteger("color-range");
                                                obj.A01 = mediaFormat.getInteger("color-transfer");
                                                i = mediaFormat.getInteger("color-standard");
                                            } else {
                                                obj.A01 = 3;
                                                i = 1;
                                            }
                                            obj.A00 = i;
                                            return obj;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                AIh.release();
                return null;
            } catch (H3n | H3r | IOException unused) {
                AIh.release();
                return null;
            }
        } finally {
            AIh.release();
        }
    }

    @Override // X.JGz
    public boolean BSC(JGz jGz) {
        boolean z = false;
        if (jGz instanceof Ijf) {
            Ijf ijf = (Ijf) jGz;
            if (this.A04 == ijf.A04 && this.A06 == ijf.A06 && this.A05 == ijf.A05 && this.A02 == ijf.A02 && this.A01 == ijf.A01 && TextUtils.equals(this.A08, ijf.A08)) {
                z = true;
            }
        }
        return z;
    }
}
