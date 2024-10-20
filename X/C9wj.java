package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9wj, reason: invalid class name */
/* loaded from: 9wj.class */
public final class C9wj implements C7yh {
    public final 1Br A00;
    public final ThreadKey A01;
    public final A3s A02;
    public final MfU A03;

    public C9wj(ThreadKey threadKey) {
        11T.A0F(threadKey, 1);
        this.A01 = threadKey;
        this.A00 = 7zM.A0U();
        this.A03 = MfU.A0H;
        this.A02 = new A3s(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9Zq, java.lang.Object] */
    @Override // X.C7yh
    public C9c2 AKN(5vW r302) {
        ?? obj = new Object();
        obj.A00(this.A02);
        ((9Zq) obj).A05 = MfU.A0H;
        ((9Zq) obj).A03 = 2131959581;
        ((9Zq) obj).A00 = 2130971610;
        ((9Zq) obj).A02 = 7zP.A0S(this.A00).A03(C1u3.A0f);
        return new C9c2(obj);
    }

    @Override // X.C7yh
    public MfU BHV() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (r0.A00(r0) == false) goto L9;
     */
    @Override // X.C7yh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BRz(com.facebook.xapp.messaging.capability.vector.Capabilities r302, X.C5fv r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r303
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r303
            X.5wn r0 = X.7zO.A0g(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L53
            r0 = r305
            java.lang.String r0 = r0.A04
            r306 = r0
        L19:
            java.lang.String r0 = "2191329907595522"
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L4c
            X.6oT r0 = X.C6oS.A00
            r306 = r0
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A01
            X.1yg r0 = r0.A06
            r305 = r0
            r0 = r305
            X.11T.A09(r0)
            r0 = r306
            r1 = r305
            boolean r0 = r0.A00(r1)
            r307 = r0
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L51
        L4c:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L51:
            r0 = r304
            return r0
        L53:
            r0 = 0
            r307 = r0
            r0 = 0
            r306 = r0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9wj.BRz(com.facebook.xapp.messaging.capability.vector.Capabilities, X.5fv):boolean");
    }
}
