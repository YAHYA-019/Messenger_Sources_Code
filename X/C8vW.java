package X;

import com.facebook.messaging.model.messages.GenericAdminMessageInfo;
import com.google.common.base.Objects;

/* renamed from: X.8vW, reason: invalid class name */
/* loaded from: 8vW.class */
public final class C8vW extends 62R implements AnonymousClass624 {
    public final GenericAdminMessageInfo A00;
    public final String A01;
    public final String A02;

    public C8vW(GenericAdminMessageInfo genericAdminMessageInfo, String str, String str2) {
        this.A01 = str;
        this.A00 = genericAdminMessageInfo;
        this.A02 = str2;
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return 1JF.A01(this.A01);
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return C62b.A02;
    }

    @Override // X.AnonymousClass624
    public boolean BVc(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (anonymousClass624.getClass() == C8vW.class) {
            C8vW c8vW = (C8vW) anonymousClass624;
            if (Objects.equal(this.A02, c8vW.A02)) {
                z = 4YV.A1Z(this.A00, c8vW.A00);
            }
        }
        return z;
    }

    @Override // X.AnonymousClass624
    public boolean BVk(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (C62b.A02 == anonymousClass624.B8O() && anonymousClass624.getClass() == C8vW.class) {
            z = Objects.equal(Long.valueOf(1JF.A01(this.A01)), Long.valueOf(anonymousClass624.AsR()));
        }
        return z;
    }
}
