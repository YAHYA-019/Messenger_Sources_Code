package com.facebook.messaging.stella.calling;

import X.0EV;
import X.0FI;
import X.0S2;
import X.0TL;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1Bi;
import X.21W;
import X.2Pj;
import X.5Nz;
import X.5O0;
import X.AbE;
import X.C00i;
import X.C06404gp;
import X.C08o;
import X.C10924uz;
import X.C4F;
import X.C7lm;
import X.CP4;
import X.DKC;
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
import org.json.JSONException;

/* loaded from: StellaCallingService.class */
public class StellaCallingService extends 0TL {
    public static boolean A06;
    public FbUserSession A00;
    public C4F A01;
    public final C00i A02 = 1BQ.A02(17011);
    public final C00i A03 = 1BQ.A02(66536);
    public final L27 A04;
    public final AnonymousClass1 A05;

    /* renamed from: com.facebook.messaging.stella.calling.StellaCallingService$1, reason: invalid class name */
    /* loaded from: StellaCallingService$1.class */
    public final class AnonymousClass1 extends Binder implements IInterface {
        public AnonymousClass1() {
            int A03 = 0FI.A03(582118658);
            attachInterface(this, "com.facebook.messaging.stella.calling.api.StellaCallingInterface");
            0FI.A09(-957368123, A03);
        }

        public AnonymousClass1() {
            this();
            0FI.A09(780872211, 0FI.A03(232462494));
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            0FI.A09(-877105042, 0FI.A03(-907732846));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v31, types: [android.content.Context, com.facebook.messaging.stella.calling.StellaCallingService, android.app.Service] */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            String error;
            int i4;
            int A03 = 0FI.A03(-599555116);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.messaging.stella.calling.api.StellaCallingInterface");
                    if (i == 1) {
                        String readString = parcel.readString();
                        int A032 = 0FI.A03(-1879572019);
                        5Nz r0 = new 5Nz(C7lm.A00(readString), "CallingService");
                        r0.A02();
                        ?? r02 = StellaCallingService.this;
                        Pair A00 = r02.A04.A00(r02, null, r02.A00);
                        if (A00 == L27.A02) {
                            0fH.A0l("StellaCallingService", "Received request");
                            Binder.clearCallingIdentity();
                            if (1BK.A0K().AZk(36313102379521725L)) {
                                try {
                                    if (DKC.A1F(readString).getString("action").equals("CALL_ACTION")) {
                                        0fH.A0l("StellaCallingService", "showForegroundNotification");
                                        if (r02.getSystemService("notification") != null) {
                                            C10924uz c10924uz = new C10924uz((Context) r02, (String) null);
                                            c10924uz.A0L("Ray-Ban Stories");
                                            c10924uz.A0K("Call initiated from Ray-Ban");
                                            c10924uz.A03 = -2;
                                            c10924uz.A0B(2132347260);
                                            c10924uz.A0h = true;
                                            if (((21W) r02.A03.get()).A07()) {
                                                C00i c00i = r02.A02;
                                                if (((2Pj) c00i.get()).A0D() != null) {
                                                    c10924uz.A0S = ((2Pj) c00i.get()).A0D();
                                                }
                                            }
                                            C08o.A04(c10924uz.A07(), r02, 20027);
                                        }
                                    }
                                } catch (JSONException e) {
                                    0fH.A0r("StellaCallingService", "Operation failed", e);
                                }
                            }
                            error = r02.A01.A00((Context) r02, r02.A00, r0, readString);
                            5O0.A01(r0, ((5O0) r0).A00);
                            i4 = 1682085925;
                        } else {
                            0fH.A0n("StellaCallingService", "Request not allowed");
                            r0.A05(0S2.A0R, (String) A00.second, true);
                            5O0.A01(r0, (short) 3376);
                            error = CP4.error(GOo.A03(A00), (String) A00.second);
                            i4 = 1740650210;
                        }
                        0FI.A09(i4, A032);
                        parcel2.writeNoException();
                        parcel2.writeString(error);
                        i3 = 1790451145;
                        0FI.A09(i3, A03);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.messaging.stella.calling.api.StellaCallingInterface");
                    i3 = 1857990045;
                    0FI.A09(i3, A03);
                    return true;
                }
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            0FI.A09(-1853052624, A03);
            return onTransact;
        }
    }

    public StellaCallingService() {
        List list = L27.A03;
        0EV r0 = new 0EV();
        r0.A05("com.facebook.orca.fbpermission.MANAGE_CALLING");
        this.A04 = new L27(r0.A00());
        this.A05 = new AnonymousClass1();
    }

    public IBinder A01(Intent intent) {
        return this.A05;
    }

    public void A02() {
        super/*X.1AO*/.A02();
        A06 = true;
        this.A00 = 1BL.A0F();
        ImmutableMap.Builder A0c = 1BK.A0c();
        JQz.A1G(A0c, KNP.CALL_ACTION, 83490);
        JQz.A1G(A0c, KNP.ANSWER_CALL_ACTION, 85078);
        JQz.A1G(A0c, KNP.END_CALL_ACTION, 85131);
        JQz.A1G(A0c, KNP.DECLINE_CALL_ACTION, 85070);
        JQz.A1G(A0c, KNP.GET_CALL_STATE_ACTION, 83555);
        JQz.A1G(A0c, KNP.CHECK_STATE_FOR_ENABLE_STELLA_ACTION, 83502);
        JQz.A1G(A0c, KNP.STELLA_OPT_IN_OUT_ACTION, 83502);
        JQz.A1G(A0c, KNP.OPT_OUT_ACTION, 83494);
        JQz.A1G(A0c, KNP.CONNECTED_USER_ACTIVE, 83496);
        if (C06404gp.A01.A01()) {
            0fH.A0l("StellaCallingService", "Call engine is enabled. Add engine handlers.");
            A0c.put(KNP.CALL_ENGINE_DISPATCH_ACTION, 1Bi.A03(116358));
        }
        this.A01 = new C4F(2342156111592887993L, A0c.build());
    }

    public void A03() {
        A06 = false;
        super/*X.1AO*/.A03();
    }

    public final String A04() {
        return "com.facebook.orca.fbpermission.MANAGE_CALLING";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart(Intent intent, int i) {
        super/*androidx.lifecycle.LifecycleService*/.onStart(intent, i);
        if (intent.hasExtra(AbE.A00(740))) {
            0fH.A0l("StellaCallingService", "stopForegroundNotification");
            C08o.A05(this);
            stopSelf();
        }
    }
}
