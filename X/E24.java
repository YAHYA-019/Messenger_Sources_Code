package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.MontageCard;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: E24.class */
public final class E24 extends 62R implements AnonymousClass624 {
    public final Message A00;
    public final MontageCard A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final long A06 = hashCode();

    public E24(Message message, MontageCard montageCard, Integer num, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = montageCard;
        this.A00 = message;
        this.A04 = z;
        this.A05 = z2;
        this.A02 = num;
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return Long.MIN_VALUE;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return C62b.A0H;
    }

    @Override // X.AnonymousClass624
    public boolean BVc(AnonymousClass624 anonymousClass624) {
        return equals(anonymousClass624);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (r301.A06 != ((X.E24) r302).A06) goto L8;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVk(X.AnonymousClass624 r302) {
        /*
            r301 = this;
            X.62b r0 = X.C62b.A0H
            r303 = r0
            r0 = r302
            X.62b r0 = r0.B8O()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L3d
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r303 = r0
            java.lang.Class<X.E24> r0 = X.E24.class
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L3d
            r0 = r301
            long r0 = r0.A06
            r305 = r0
            r0 = r302
            X.E24 r0 = (X.E24) r0
            r302 = r0
            r0 = r302
            long r0 = r0.A06
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L42
        L3d:
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L42:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E24.BVk(X.624):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            E24 e24 = (E24) obj;
            if (this.A05 != e24.A05 || !Objects.equal(this.A01, e24.A01) || !Objects.equal(this.A00, e24.A00) || !Objects.equal(this.A03, e24.A03) || this.A04 != e24.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, null, this.A01, this.A00.A1V, Boolean.valueOf(this.A04), Boolean.valueOf(this.A05)});
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A03, PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
    }
}
