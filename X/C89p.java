package X;

import com.facebook.messaging.model.messages.Message;
import com.google.common.base.Objects;
import java.util.Arrays;

/* renamed from: X.89p, reason: invalid class name */
/* loaded from: 89p.class */
public final class C89p implements AnonymousClass624 {
    public final C7aB A00;
    public final boolean A01;
    public final boolean A02;

    public C89p(C7aB c7aB, boolean z, boolean z2) {
        this.A00 = c7aB;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return this.A00.hashCode();
    }

    @Override // X.AnonymousClass625
    public Message B01() {
        return ((AnonymousClass625) 1BK.A0r(this.A00.A00)).B01();
    }

    @Override // X.AnonymousClass625
    public Integer B8N() {
        return 0S2.A0C;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return C62b.A06;
    }

    @Override // X.AnonymousClass624
    public boolean BVc(AnonymousClass624 anonymousClass624) {
        return equals(anonymousClass624);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r301.A00.hashCode() != r302.AsR()) goto L6;
     */
    @Override // X.AnonymousClass624
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BVk(X.AnonymousClass624 r302) {
        /*
            r301 = this;
            X.62b r0 = X.C62b.A06
            r303 = r0
            r0 = r302
            X.62b r0 = r0.B8O()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L33
            r0 = r301
            X.7aB r0 = r0.A00
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
        throw new UnsupportedOperationException("Method not decompiled: X.C89p.BVk(X.624):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C89p c89p = (C89p) obj;
            if (this.A01 != c89p.A01) {
                return false;
            }
            C7aB c7aB = this.A00;
            C7aB c7aB2 = c89p.A00;
            if (!Objects.equal(c7aB, c7aB2)) {
                return false;
            }
            try {
                AnonymousClass622 anonymousClass622 = (AnonymousClass622) ((AnonymousClass623) c7aB.A00.get(r0.size() - 1));
                if (2oI.A06(anonymousClass622.A05)) {
                    return Objects.equal(anonymousClass622, (AnonymousClass622) ((AnonymousClass623) c7aB2.A00.get(r0.size() - 1)));
                }
            } catch (ClassCastException e) {
                0fH.A0t("RowExpandableAdminMessageItem", "Unable to convert most recent item in AdminMessageGroup to RowMessageItem, exception = ", e);
                return true;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(7zN.A1b(this.A00, this.A01));
    }
}
