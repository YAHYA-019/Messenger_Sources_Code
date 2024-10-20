package com.facebook.rtc.connectionservice;

import X.0Q8;
import X.11T;
import X.AnonymousClass001;
import X.GTT;
import X.I9W;
import X.IDO;
import X.IDc;
import X.JIs;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;

/* loaded from: RtcSelfManagedConnectionService.class */
public class RtcSelfManagedConnectionService extends ConnectionService {
    public I9W A00;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r306v3 ??, still in use, count: 2, list:
          (r306v3 ??) from 0x0035: PHI (r306v2 ??) = (r306v1 ??), (r306v3 ??) binds: [B:6:0x0022, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
          (r306v3 ?? I:X.I9W) from 0x0032: SPUT (r306v3 ?? I:X.I9W) A[Catch: all -> 0x004b] X.I9W.A04 X.I9W
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // android.app.Service
    public void onCreate() {
        /*
            r301 = this;
            r0 = r301
            r1 = -675629722(0xffffffffd7bab566, float:-4.1057653E14)
            int r0 = X.C08o.A00(r0, r1)
            r302 = r0
            r0 = 498265768(0x1db2eea8, float:4.7362972E-21)
            r303 = r0
            r0 = r303
            int r0 = X.0FI.A04(r0)
            r304 = r0
            r0 = r301
            super.onCreate()
            X.Hvp r0 = X.I9W.A05
            r305 = r0
            r0 = r305
            monitor-enter(r0)
            X.I9W r0 = X.I9W.A04     // Catch: java.lang.Throwable -> L4b
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L35
            X.I9W r0 = new X.I9W     // Catch: java.lang.Throwable -> L4b
            r306 = r0
            r0 = r306
            r1 = r301
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
            r0 = r306
            X.I9W.A04 = r0     // Catch: java.lang.Throwable -> L4b
        L35:
            r0 = r305
            monitor-exit(r0)
            r0 = r301
            r1 = r306
            r0.A00 = r1
            r0 = -186337422(0xfffffffff4e4b772, float:-1.4496636E32)
            r1 = r304
            X.0FI.A0A(r0, r1)
            r0 = -1087602652(0xffffffffbf2c8024, float:-0.6738303)
            r1 = r302
            X.C08o.A02(r0, r1)
            return
        L4b:
            r306 = move-exception
            r0 = r305
            monitor-exit(r0)
            r0 = r306
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.connectionservice.RtcSelfManagedConnectionService.onCreate():void");
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        11T.A0F(connectionRequest, 1);
        IDO ido = IDO.A00;
        ido.A03("RtcSelfManagedConnectionService", "onCreateIncomingConnection", (Throwable) null);
        I9W i9w = this.A00;
        if (i9w == null) {
            11T.A0L("rtcSelfManagedConnectionManager");
            throw 0Q8.createAndThrow();
        }
        GTT A03 = i9w.A03(connectionRequest, false);
        if (A03 != null) {
            ido.A03("RtcSelfManagedConnectionService", "Incoming connection created", (Throwable) null);
            return A03;
        }
        Connection createFailedConnection = Connection.createFailedConnection(new DisconnectCause(1));
        11T.A0D(createFailedConnection);
        return createFailedConnection;
    }

    @Override // android.telecom.ConnectionService
    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        11T.A0F(connectionRequest, 1);
        IDO.A00.A03("RtcSelfManagedConnectionService", "onCreateIncomingConnectionFailed", (Throwable) null);
        I9W i9w = this.A00;
        if (i9w == null) {
            11T.A0L("rtcSelfManagedConnectionManager");
            throw 0Q8.createAndThrow();
        }
        Bundle extras = connectionRequest.getExtras();
        if (extras == null || (string = extras.getString("call_id")) == null) {
            return;
        }
        for (IDc iDc : i9w.A02) {
            if (string.equals(iDc.A07)) {
                IDO.A01("ConnectionServiceCoordinatorImpl", "onCreateIncomingConnectionFailed: callback.onCallNotPermitted()");
                JIs jIs = iDc.A04;
                if (jIs != null) {
                    jIs.BmL();
                }
                iDc.A04 = null;
                iDc.A07 = null;
                Object remove = iDc.A0C.remove(string);
                if (remove == null) {
                    throw AnonymousClass001.A0N("onCreateIncomingConnectionFailed for untracked call");
                }
                IDc.A03((String) remove, true, false);
            }
        }
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        11T.A0F(connectionRequest, 1);
        IDO ido = IDO.A00;
        ido.A03("RtcSelfManagedConnectionService", "onCreateOutgoingConnection", (Throwable) null);
        I9W i9w = this.A00;
        if (i9w == null) {
            11T.A0L("rtcSelfManagedConnectionManager");
            throw 0Q8.createAndThrow();
        }
        GTT A03 = i9w.A03(connectionRequest, true);
        if (A03 != null) {
            ido.A03("RtcSelfManagedConnectionService", "Outgoing connection created", (Throwable) null);
            return A03;
        }
        Connection createFailedConnection = Connection.createFailedConnection(new DisconnectCause(1));
        11T.A0D(createFailedConnection);
        return createFailedConnection;
    }

    @Override // android.telecom.ConnectionService
    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String string;
        11T.A0F(connectionRequest, 1);
        IDO.A00.A03("RtcSelfManagedConnectionService", "onCreateOutgoingConnectionFailed", (Throwable) null);
        I9W i9w = this.A00;
        if (i9w == null) {
            11T.A0L("rtcSelfManagedConnectionManager");
            throw 0Q8.createAndThrow();
        }
        Bundle extras = connectionRequest.getExtras();
        if (extras == null || (string = extras.getString("call_id")) == null) {
            return;
        }
        for (IDc iDc : i9w.A02) {
            if (string.equals(iDc.A07)) {
                IDO.A01("ConnectionServiceCoordinatorImpl", "onCreateOutgoingConnectionFailed: callback.onCallNotPermitted()");
                JIs jIs = iDc.A05;
                if (jIs != null) {
                    jIs.BmL();
                }
                iDc.A05 = null;
                iDc.A07 = null;
                Object remove = iDc.A0C.remove(string);
                if (remove == null) {
                    throw AnonymousClass001.A0N("onCreateOutgoingConnectionFailed for untracked call");
                }
                IDc.A03((String) remove, false, false);
            }
        }
    }
}
