package X;

import com.facebook.ui.media.attachments.source.MediaResourceCameraPosition;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;

/* loaded from: Hk8.class */
public final class Hk8 {
    public final int A00;
    public final int A01;
    public final C2608Gix A02;
    public final C5eq A03;
    public final C5ep A04;
    public final C5ew A05;
    public final MediaResourceCameraPosition A06;
    public final MediaResourceSendSource A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public Hk8(C2608Gix c2608Gix, C5eq c5eq, C5ep c5ep, C5ew c5ew, MediaResourceCameraPosition mediaResourceCameraPosition, MediaResourceSendSource mediaResourceSendSource, String str, String str2, String str3, int i, int i2) {
        String str4;
        this.A01 = i2;
        this.A04 = c5ep;
        this.A00 = i;
        this.A0A = str3;
        this.A09 = str2;
        this.A07 = mediaResourceSendSource;
        this.A06 = mediaResourceCameraPosition;
        this.A03 = c5eq;
        this.A08 = str;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str4 = "unknown";
                        this.A0B = str4;
                        this.A05 = c5ew;
                        this.A02 = c2608Gix;
                    }
                }
            }
            str4 = "landscape";
            this.A0B = str4;
            this.A05 = c5ew;
            this.A02 = c2608Gix;
        }
        str4 = "portrait";
        this.A0B = str4;
        this.A05 = c5ew;
        this.A02 = c2608Gix;
    }
}
