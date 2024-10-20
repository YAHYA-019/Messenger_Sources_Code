package com.facebook.messaging.contactstab.plugins.loader.montage;

import X.0Q8;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.6BX;
import X.6BY;
import X.6Bd;
import X.6Bf;
import X.6Bh;
import X.7zS;
import X.9Wz;
import X.C00i;
import X.C5ah;
import X.C95a;
import X.C9cr;
import X.C9kj;
import X.C9u3;
import X.C9w8;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: ContactsTabMontageLoader.class */
public final class ContactsTabMontageLoader {
    public C9u3 A00;
    public C95a A01;
    public 6BY A02;
    public 6BX A03;
    public boolean A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 9Wz A09;
    public final Context A0A;
    public final FbUserSession A0B;
    public final C9w8 A0C;

    public ContactsTabMontageLoader(Context context, FbUserSession fbUserSession, 9Wz r304) {
        7zS.A16(1, context, r304, fbUserSession);
        this.A0A = context;
        this.A09 = r304;
        this.A0B = fbUserSession;
        this.A05 = 1Lm.A00(context, fbUserSession, 49985);
        this.A07 = 1Lm.A00(context, fbUserSession, 49987);
        this.A08 = 1Lm.A00(context, fbUserSession, 68046);
        this.A06 = 1Lm.A00(context, fbUserSession, 68113);
        this.A0C = new C9w8(this, 1);
        this.A04 = true;
        C95a c95a = C95a.A04;
        this.A01 = c95a;
        this.A00 = C9u3.A00(new C9kj(), c95a);
    }

    private final 6BX A00() {
        if (this.A03 == null) {
            synchronized (this) {
                this.A03 = (6BX) 1Bu.A06(this.A0A, 67970);
            }
        }
        6BX r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        11T.A0L("montageListFetcher");
        throw 0Q8.createAndThrow();
    }

    public final void A01() {
        A00().D1g(this.A0C, C5ah.PREFETCH_STORIES_AND_WARMUP_VIDEO_PLAYER);
    }

    public final void A02() {
        C00i c00i = this.A05.A00;
        ((6Bd) c00i.get()).A02(this.A04);
        ((6Bf) 1Br.A0B(this.A07)).A05(this.A04);
        ((C9cr) 1Br.A0B(this.A06)).A03("ContactsTabMontageLoader");
        this.A02 = A00().D1g(this.A0C, C5ah.PREFETCH_STORIES_AND_WARMUP_VIDEO_PLAYER);
        C9kj c9kj = new C9kj(this.A00);
        6BY r0 = this.A02;
        if (r0 != null) {
            c9kj.A07 = r0;
            C9kj.A00(c9kj, "montageListResult");
            this.A00 = new C9u3(c9kj);
            ((6Bh) 1Br.A0B(this.A08)).A01 = true;
            9Wz r02 = this.A09;
            6BY r03 = this.A02;
            if (r03 != null) {
                r02.A00(r03, this.A01, "MONTAGE");
                ((6Bd) c00i.get()).A00();
                this.A04 = false;
                return;
            }
        }
        11T.A0L("currentMontageData");
        throw 0Q8.createAndThrow();
    }

    public final void A03() {
        ((6Bd) 1Br.A0B(this.A05)).A01("left_surface");
        ((6Bf) 1Br.A0B(this.A07)).A01();
        ((6Bh) 1Br.A0B(this.A08)).A01 = false;
        9Wz r0 = this.A09;
        6BY r02 = this.A02;
        if (r02 == null) {
            11T.A0L("currentMontageData");
            throw 0Q8.createAndThrow();
        }
        r0.A00(r02, this.A01, "MONTAGE");
        ((C9cr) 1Br.A0B(this.A06)).A00();
    }
}
