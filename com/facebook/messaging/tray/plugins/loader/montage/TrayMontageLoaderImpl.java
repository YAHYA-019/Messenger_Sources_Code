package com.facebook.messaging.tray.plugins.loader.montage;

import X.11T;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2TM;
import X.C03083x1;
import X.C2xd;
import X.InterfaceC03063wz;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: TrayMontageLoaderImpl.class */
public final class TrayMontageLoaderImpl {
    public 2TM A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C03083x1 A06;
    public final Context A07;

    public TrayMontageLoaderImpl(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A07 = context;
        this.A01 = fbUserSession;
        this.A03 = 1Bu.A01(context, 67912);
        1Br A01 = 1Bu.A01(context, 1122);
        this.A04 = A01;
        this.A06 = ((C2xd) 1Br.A0B(A01)).A0F(fbUserSession, (InterfaceC03063wz) 1Br.A0B(this.A03));
        this.A05 = 1Bq.A00(68571);
        this.A02 = 1Bq.A00(66516);
        2TM r0 = 2TM.A03;
        11T.A0A(r0);
        this.A00 = r0;
    }
}
