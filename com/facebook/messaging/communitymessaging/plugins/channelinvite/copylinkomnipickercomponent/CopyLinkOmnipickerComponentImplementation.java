package com.facebook.messaging.communitymessaging.plugins.channelinvite.copylinkomnipickercomponent;

import X.1BL;
import X.1Iw;
import X.AnonymousClass553;
import X.BME;
import X.Bcn;
import X.Cx1;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CopyLinkOmnipickerComponentImplementation.class */
public final class CopyLinkOmnipickerComponentImplementation {
    public final 1Iw A00;
    public final BME A01;
    public final Bcn A02;
    public final ThreadKey A03;
    public final ThreadSummary A04;
    public final AnonymousClass553 A05;
    public final MigColorScheme A06;
    public final String A07;

    public CopyLinkOmnipickerComponentImplementation(1Iw r302, BME bme, Bcn bcn, ThreadKey threadKey, ThreadSummary threadSummary, MigColorScheme migColorScheme, String str) {
        1BL.A1H(r302, migColorScheme, bme);
        1BL.A1G(threadKey, bcn);
        this.A00 = r302;
        this.A06 = migColorScheme;
        this.A01 = bme;
        this.A04 = threadSummary;
        this.A03 = threadKey;
        this.A02 = bcn;
        this.A07 = str;
        this.A05 = Cx1.A01(this, 15);
    }
}
