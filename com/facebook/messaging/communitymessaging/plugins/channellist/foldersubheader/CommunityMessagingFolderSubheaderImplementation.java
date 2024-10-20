package com.facebook.messaging.communitymessaging.plugins.channellist.foldersubheader;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1G2;
import X.1G3;
import X.1NK;
import X.BD3;
import X.C06i;
import X.C21h;
import X.C3Ne;
import X.Czs;
import X.ILM;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: CommunityMessagingFolderSubheaderImplementation.class */
public final class CommunityMessagingFolderSubheaderImplementation {
    public final Context A00;
    public final C06i A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final LithoView A06;
    public final C3Ne A07;
    public final ThreadKey A08;
    public final C21h A09;
    public final 1G2 A0A;
    public final Czs A0B;
    public final Long A0C;
    public final AtomicBoolean A0D;
    public final AtomicLong A0E;
    public final AtomicLong A0F;

    public CommunityMessagingFolderSubheaderImplementation(Context context, FbUserSession fbUserSession, LithoView lithoView, C3Ne c3Ne, ThreadKey threadKey, Long l) {
        1BL.A1H(context, c3Ne, fbUserSession);
        11T.A0F(lithoView, 4);
        this.A00 = context;
        this.A07 = c3Ne;
        this.A02 = fbUserSession;
        this.A06 = lithoView;
        this.A0C = l;
        this.A08 = threadKey;
        this.A0F = new AtomicLong();
        this.A0E = new AtomicLong();
        this.A0D = new AtomicBoolean();
        this.A05 = 1Bq.A00(16485);
        this.A03 = 1Bq.A00(67396);
        this.A04 = 1BK.A0E();
        1G2 r0 = 1NK.A0e;
        long A0r = threadKey.A0r();
        if (Long.valueOf(A0r) == null) {
            throw 1BK.A0h();
        }
        this.A0A = 1G3.A00(r0, String.valueOf(A0r));
        this.A01 = new ILM(this, 3);
        this.A09 = new BD3(this);
        this.A0B = new Czs(this, 5);
    }
}
