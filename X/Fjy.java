package X;

import com.facebook.messaging.model.messages.InstantGameInfoProperties;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.Objects;

/* loaded from: Fjy.class */
public final class Fjy implements AnonymousClass624 {
    public final InstantGameInfoProperties A00;
    public final ThreadKey A01;
    public final C7aB A02;
    public final boolean A03;

    public Fjy(InstantGameInfoProperties instantGameInfoProperties, ThreadKey threadKey, C7aB c7aB, boolean z) {
        this.A02 = c7aB;
        this.A03 = z;
        this.A00 = instantGameInfoProperties;
        this.A01 = threadKey;
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return this.A02.hashCode();
    }

    @Override // X.AnonymousClass625
    public Message B01() {
        return ((AnonymousClass625) 1BK.A0r(this.A02.A00)).B01();
    }

    @Override // X.AnonymousClass625
    public Integer B8N() {
        return 0S2.A0C;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return C62b.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r301.A03 != ((X.Fjy) r302).A03) goto L6;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVc(X.AnonymousClass624 r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r301
            boolean r0 = r0.A03
            r304 = r0
            r0 = r302
            X.Fjy r0 = (X.Fjy) r0
            r302 = r0
            r0 = r302
            boolean r0 = r0.A03
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L24
        L22:
            r0 = 0
            r303 = r0
        L24:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fjy.BVc(X.624):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r301.A02.hashCode() != r302.AsR()) goto L6;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVk(X.AnonymousClass624 r302) {
        /*
            r301 = this;
            X.62b r0 = X.C62b.A05
            r303 = r0
            r0 = r302
            X.62b r0 = r0.B8O()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L33
            r0 = r301
            X.7aB r0 = r0.A02
            r304 = r0
            r0 = r304
            int r0 = r0.hashCode()
            long r0 = (long) r0
            r305 = r0
            r0 = r302
            long r0 = r0.AsR()
            r307 = r0
            r0 = r305
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            if (r0 == 0) goto L38
        L33:
            r0 = 0
            r310 = r0
            r0 = 0
            r304 = r0
        L38:
            r0 = r310
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fjy.BVk(X.624):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (!Objects.equal(this.A02, ((Fjy) obj).A02) || r0.hashCode() != r0.hashCode()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A02, Boolean.valueOf(this.A03));
    }
}
