package com.facebook.messaging.contactstab.plugins.loader.activenow;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1XZ;
import X.2UV;
import X.8HN;
import X.95Z;
import X.9Wz;
import X.C00i;
import X.C2dw;
import X.C90p;
import X.C9fj;
import X.C9w6;
import android.content.Context;

/* loaded from: ContactsTabActiveNowLoader.class */
public final class ContactsTabActiveNowLoader {
    public 95Z A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 9Wz A04;
    public final C90p A05;
    public final Context A06;
    public final C9w6 A07;

    public ContactsTabActiveNowLoader(Context context, 9Wz r303) {
        1BL.A1F(context, r303);
        this.A06 = context;
        this.A04 = r303;
        this.A01 = 1Bu.A01(context, 84478);
        this.A02 = 1Bq.A00(65723);
        this.A03 = 1Bu.A01(context, 33135);
        this.A00 = 95Z.A03;
        this.A05 = new C90p(this, 1);
        this.A07 = new C9w6(this, 1);
    }

    public static final void A00(ContactsTabActiveNowLoader contactsTabActiveNowLoader, C9fj c9fj) {
        if (((1XZ) 1Br.A0B(contactsTabActiveNowLoader.A02)).BUJ()) {
            contactsTabActiveNowLoader.A04.A00(c9fj, contactsTabActiveNowLoader.A00, "ACTIVE_NOW");
            return;
        }
        95Z r0 = 95Z.A04;
        contactsTabActiveNowLoader.A00 = r0;
        contactsTabActiveNowLoader.A04.A00(C9fj.A03, r0, "ACTIVE_NOW");
    }

    public final void A01() {
        ((2UV) 1Br.A0B(this.A01)).A01 = new 8HN(this, 1);
    }

    public final void A02() {
        C00i c00i = this.A02.A00;
        ((1XZ) c00i.get()).A5m(this);
        ((1XZ) c00i.get()).A77(this.A05);
        ((2UV) 1Br.A0B(this.A01)).D1t(1BK.A0d());
        ((C2dw) 1Br.A0B(this.A03)).A01(this.A07);
    }

    public final void A03() {
        C00i c00i = this.A02.A00;
        ((1XZ) c00i.get()).Cez(this.A05);
        ((1XZ) c00i.get()).CeM(this);
        ((2UV) 1Br.A0B(this.A01)).AEC();
        ((C2dw) 1Br.A0B(this.A03)).A00();
    }
}
