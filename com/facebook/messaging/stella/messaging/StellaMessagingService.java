package com.facebook.messaging.stella.messaging;

import X.0EV;
import X.0FI;
import X.0S2;
import X.0TL;
import X.0fH;
import X.1BK;
import X.1BL;
import X.5Nz;
import X.5O0;
import X.C4F;
import X.C7lm;
import X.CP4;
import X.GOo;
import X.JQz;
import X.KNP;
import X.L27;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableMap;
import java.util.List;

/* loaded from: StellaMessagingService.class */
public class StellaMessagingService extends 0TL {
    public FbUserSession A00;
    public C4F A01;
    public final L27 A02;
    public final AnonymousClass1 A03;

    /* renamed from: com.facebook.messaging.stella.messaging.StellaMessagingService$1, reason: invalid class name */
    /* loaded from: StellaMessagingService$1.class */
    public final class AnonymousClass1 extends Binder implements IInterface {
        public AnonymousClass1() {
            int A03 = 0FI.A03(-1996661785);
            attachInterface(this, "com.facebook.messaging.stella.messaging.api.StellaMessagingInterface");
            0FI.A09(2020058675, A03);
        }

        public AnonymousClass1() {
            this();
            0FI.A09(-1001829877, 0FI.A03(-663066960));
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(-2083926391, 0FI.A03(1266686909));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v30, types: [com.facebook.messaging.stella.messaging.StellaMessagingService, android.content.Context] */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            String error;
            int i4;
            int A03 = 0FI.A03(108380635);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.messaging.stella.messaging.api.StellaMessagingInterface");
                    if (i == 1) {
                        String readString = parcel.readString();
                        int A032 = 0FI.A03(-1580344350);
                        5Nz r0 = new 5Nz(C7lm.A00(readString), "MessagingService");
                        r0.A02();
                        ?? r02 = StellaMessagingService.this;
                        Pair A00 = r02.A02.A00(r02, null, r02.A00);
                        if (A00 == L27.A02) {
                            0fH.A0l("StellaMessagingService", "Received request");
                            Binder.clearCallingIdentity();
                            error = r02.A01.A00((Context) r02, r02.A00, r0, readString);
                            5O0.A01(r0, ((5O0) r0).A00);
                            i4 = -324637460;
                        } else {
                            0fH.A0n("StellaMessagingService", "Request not allowed");
                            r0.A05(0S2.A0R, (String) A00.second, true);
                            5O0.A01(r0, ((5O0) r0).A00);
                            error = CP4.error(GOo.A03(A00), (String) A00.second);
                            i4 = 1634797589;
                        }
                        0FI.A09(i4, A032);
                        parcel2.writeNoException();
                        parcel2.writeString(error);
                        i3 = 1725701352;
                        0FI.A09(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.messaging.stella.messaging.api.StellaMessagingInterface");
                    i3 = -1233218522;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(1534919511, A03);
            return onTransact;
        }
    }

    public StellaMessagingService() {
        List list = L27.A03;
        0EV r0 = new 0EV();
        r0.A05("com.facebook.orca.fbpermission.MANAGE_MESSAGING");
        this.A02 = new L27(r0.A00());
        this.A03 = new AnonymousClass1();
    }

    public IBinder A01(Intent intent) {
        return this.A03;
    }

    public void A02() {
        super/*X.1AO*/.A02();
        this.A00 = 1BL.A0F();
        ImmutableMap.Builder A0c = 1BK.A0c();
        JQz.A1G(A0c, KNP.SEND_MESSAGE_ACTION, 83492);
        JQz.A1G(A0c, KNP.MARK_THREAD_READ_ACTION, 83493);
        JQz.A1G(A0c, KNP.FETCH_UNREAD_MESSAGES_ACTION, 83491);
        JQz.A1G(A0c, KNP.LOAD_THREADS, 83208);
        JQz.A1G(A0c, KNP.LOAD_MESSAGES, 83611);
        JQz.A1G(A0c, KNP.FETCH_MESSAGE_AUDIO_ACTION, 84973);
        JQz.A1G(A0c, KNP.FETCH_MESSAGE_IMAGE_ACTION, 84974);
        JQz.A1G(A0c, KNP.GET_CALL_HISTORY_ACTION, 83495);
        JQz.A1G(A0c, KNP.FETCH_LOGS_ACTION, 100310);
        this.A01 = new C4F(2342156111592953530L, A0c.build());
    }

    public final String A04() {
        return "com.facebook.orca.fbpermission.MANAGE_MESSAGING";
    }
}
