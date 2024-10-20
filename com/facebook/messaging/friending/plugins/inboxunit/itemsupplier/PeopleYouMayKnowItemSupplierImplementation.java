package com.facebook.messaging.friending.plugins.inboxunit.itemsupplier;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Si;
import X.2VJ;
import X.2VM;
import X.2VN;
import X.2VO;
import X.2VP;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: PeopleYouMayKnowItemSupplierImplementation.class */
public final class PeopleYouMayKnowItemSupplierImplementation {
    public ListenableFuture A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 2VN A06;
    public final 2VP A07;
    public final 2Si A08;
    public final AtomicBoolean A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;
    public final AtomicInteger A0C;
    public final AtomicLong A0D;
    public final Context A0E;
    public final FbUserSession A0F;
    public final 1Br A0G;

    public PeopleYouMayKnowItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304) {
        11T.A0F(r304, 1);
        11T.A0F(fbUserSession, 3);
        this.A08 = r304;
        this.A0E = context;
        this.A0F = fbUserSession;
        this.A0G = 1Bq.A00(82490);
        this.A05 = 1Bu.A00(33214);
        this.A01 = 1Bq.A00(99390);
        this.A0D = new AtomicLong(0L);
        this.A0A = new AtomicBoolean(false);
        this.A04 = 1Lm.A00(context, fbUserSession, 33213);
        this.A0B = new AtomicBoolean(false);
        this.A03 = 1Bq.A00(65837);
        this.A02 = 1Bu.A01(context, 65841);
        this.A09 = new AtomicBoolean(false);
        this.A0C = new AtomicInteger(0);
        this.A06 = new 2VM(this);
        this.A07 = new 2VO(this);
    }

    public static final 2VJ A00(PeopleYouMayKnowItemSupplierImplementation peopleYouMayKnowItemSupplierImplementation) {
        return (2VJ) peopleYouMayKnowItemSupplierImplementation.A0G.A00.get();
    }
}
