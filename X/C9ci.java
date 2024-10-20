package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;

/* renamed from: X.9ci, reason: invalid class name */
/* loaded from: 9ci.class */
public final class C9ci {
    public final C3Z5 A00;
    public final 96A A01;
    public final MontageBucketPreview A02;
    public final MontageCard A03;
    public final MigColorScheme A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        if (r318 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9ci(X.96A r302, com.facebook.messaging.montage.model.MontageBucketPreview r303, com.facebook.messaging.montage.model.MontageCard r304, com.facebook.mig.scheme.interfaces.MigColorScheme r305, java.lang.Integer r306, java.lang.String r307, int r308, boolean r309, boolean r310, boolean r311) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A01 = r1
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r310
            r312 = r0
            r0 = r301
            r1 = r310
            r0.A06 = r1
            r0 = r311
            r312 = r0
            r0 = r301
            r1 = r311
            r0.A07 = r1
            r0 = r301
            r1 = r304
            r0.A03 = r1
            r0 = r301
            r1 = r306
            r0.A05 = r1
            r0 = r303
            if (r0 == 0) goto Lc7
            r0 = r303
            com.facebook.messaging.montage.model.MontageBucketKey r0 = r0.A02
            r313 = r0
            r0 = r313
            long r0 = r0.A00
            r314 = r0
        L3e:
            r0 = r302
            int r0 = r0.ordinal()
            r316 = r0
            r0 = 4
            r312 = r0
            r0 = r316
            r1 = r312
            if (r0 == r1) goto Lc0
            r0 = 3
            r312 = r0
            r0 = r316
            r1 = r312
            if (r0 == r1) goto Lb9
            r0 = 2
            r312 = r0
            r0 = r316
            r1 = r312
            if (r0 == r1) goto Lb2
            java.lang.String r0 = ""
            r317 = r0
        L66:
            r0 = r303
            if (r0 == 0) goto L7c
            r0 = r303
            com.facebook.messaging.montage.model.MontageCard r0 = r0.A04
            r313 = r0
            r0 = r313
            java.lang.String r0 = r0.A0H
            r318 = r0
            r0 = r318
            if (r0 != 0) goto L80
        L7c:
            java.lang.String r0 = ""
            r318 = r0
        L80:
            X.3E3 r0 = X.3E3.A02
            r319 = r0
            X.3Z5 r0 = new X.3Z5
            r313 = r0
            r0 = r313
            r1 = r319
            r2 = r307
            r3 = r317
            r4 = r318
            r5 = r308
            r6 = r314
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r301
            r1 = r313
            r0.A00 = r1
            r0 = r309
            r312 = r0
            r0 = r301
            r1 = r309
            r0.A08 = r1
            r0 = r301
            r1 = r305
            r0.A04 = r1
            return
        Lb2:
            java.lang.String r0 = "seen"
            r317 = r0
            goto L66
        Lb9:
            java.lang.String r0 = "unseen"
            r317 = r0
            goto L66
        Lc0:
            java.lang.String r0 = "myday"
            r317 = r0
            goto L66
        Lc7:
            r0 = 0
            r314 = r0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9ci.<init>(X.96A, com.facebook.messaging.montage.model.MontageBucketPreview, com.facebook.messaging.montage.model.MontageCard, com.facebook.mig.scheme.interfaces.MigColorScheme, java.lang.Integer, java.lang.String, int, boolean, boolean, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9ci c9ci = (C9ci) obj;
            if (this.A01 != c9ci.A01 || !Objects.equal(this.A02, c9ci.A02) || !Objects.equal(this.A03, c9ci.A03) || this.A08 != c9ci.A08 || this.A06 != c9ci.A06 || this.A07 != c9ci.A07 || !this.A04.equals(c9ci.A04) || this.A00.A00 != c9ci.A00.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A03, Boolean.valueOf(this.A08), Boolean.valueOf(this.A06), Boolean.valueOf(this.A07)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A01);
        stringHelper.add("montageThreadInfo", this.A02);
        stringHelper.add("previewCard", this.A03);
        stringHelper.add("isUserOnline", this.A08);
        stringHelper.add("isUnseen", false);
        stringHelper.add("canPlayVideo", this.A06);
        stringHelper.add("storyTilesVisible", this.A07);
        return stringHelper.toString();
    }
}
