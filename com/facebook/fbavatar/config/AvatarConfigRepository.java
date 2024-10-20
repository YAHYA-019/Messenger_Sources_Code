package com.facebook.fbavatar.config;

import X.0BY;
import X.0Du;
import X.0KV;
import X.0KW;
import X.0PX;
import X.0Ro;
import X.0S2;
import X.0Xs;
import X.0zV;
import X.11T;
import X.16K;
import X.AnonymousClass831;
import X.AnonymousClass836;
import X.C01g;
import X.C01i;
import X.C0oe;
import X.C21S;
import X.C2a2;
import X.C6jz;
import X.C6k1;
import X.C6k3;
import X.C6k5;
import X.C6oY;
import X.C74s;
import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AvatarConfigRepository.class */
public final class AvatarConfigRepository {
    public C6oY A00;
    public final FbUserSession A01;
    public final List A02;
    public final C01i A03;
    public final 0zV A04;
    public final 0zV A05;
    public final 0zV A06;
    public final 16K A07;
    public final 0Xs A08;
    public final List A09;
    public final AtomicBoolean A0A;
    public volatile boolean A0B;

    public AvatarConfigRepository(FbUserSession fbUserSession) {
        final int i = 1;
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A02 = new ArrayList();
        this.A09 = new ArrayList();
        this.A03 = C01g.A01(new AnonymousClass831(this, 1));
        this.A0A = new AtomicBoolean(false);
        final 0Ro A00 = 0Du.A00(C6jz.A00);
        this.A08 = A00;
        final C0oe c0oe = new C0oe(new 0BY(C6k1.class), A00, 2);
        final int i2 = 0;
        this.A06 = new 0zV(c0oe, i2) { // from class: X.84f
            public final int A00;
            public final Object A01;

            {
                this.A00 = i2;
                this.A01 = c0oe;
            }

            public Object collect(0zU r302, 0DR r303) {
                Object collect = ((0zV) this.A01).collect(AI7.A00(r302, this.A00 != 0 ? 5 : 4), r303);
                if (collect != 0Ds.A02) {
                    collect = 04S.A00;
                }
                return collect;
            }
        };
        0KW A002 = 0KV.A00(0S2.A00, 0, 0);
        this.A07 = A002;
        this.A05 = new 0PX((C2a2) null, A002);
        this.A04 = new 0zV(A00, i) { // from class: X.84f
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = A00;
            }

            public Object collect(0zU r302, 0DR r303) {
                Object collect = ((0zV) this.A01).collect(AI7.A00(r302, this.A00 != 0 ? 5 : 4), r303);
                if (collect != 0Ds.A02) {
                    collect = 04S.A00;
                }
                return collect;
            }
        };
        C6k3 c6k3 = (C6k3) this.A03.getValue();
        c6k3.A00 = new C6k5(this);
        c6k3.A00(new AnonymousClass836(c6k3, 1));
        C21S.A00(c6k3.A01, c6k3.A02);
    }

    public static final void A00(AvatarConfigRepository avatarConfigRepository, boolean z) {
        ArrayList arrayList = new ArrayList();
        List list = avatarConfigRepository.A09;
        synchronized (list) {
            arrayList.addAll(list);
            list.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C74s) it.next()).COu(z);
        }
        arrayList.clear();
        avatarConfigRepository.A0A.set(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (r0.length() == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.config.AvatarConfigRepository.A01(X.0DR):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0.A04 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02(X.C74s r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.List r0 = r0.A09
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            r0 = r303
            r1 = r302
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L3c
            r0 = r303
            monitor-exit(r0)
            r0 = r301
            boolean r0 = r0.A0B
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3b
            r0 = r301
            X.6oY r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L31
            r0 = r305
            java.lang.String r0 = r0.A04
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L36
        L31:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L36:
            r0 = r301
            r1 = r304
            A00(r0, r1)
        L3b:
            return
        L3c:
            r305 = move-exception
            r0 = r303
            monitor-exit(r0)
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbavatar.config.AvatarConfigRepository.A02(X.74s):void");
    }
}
