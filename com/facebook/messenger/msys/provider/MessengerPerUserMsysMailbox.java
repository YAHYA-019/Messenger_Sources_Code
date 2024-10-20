package com.facebook.messenger.msys.provider;

import X.0fH;
import X.11T;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1G1;
import X.1Lo;
import X.1MV;
import X.1PA;
import X.1Uj;
import X.1Y8;
import X.1fC;
import X.1fU;
import X.C00i;
import X.C1ge;
import X.C1iw;
import X.C1qM;
import X.C1yS;
import X.C1yi;
import X.C2sj;
import X.C3b5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messenger.platform_logger.mplsyncmonitor.MPLSyncMonitor;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AppState;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mcs.SyncHandler;
import java.util.ArrayList;
import java.util.List;

/* loaded from: MessengerPerUserMsysMailbox.class */
public final class MessengerPerUserMsysMailbox extends 1Uj {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A07;
    public final C00i A09;
    public final String A0A;
    public final boolean A0D;
    public volatile C1ge A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;
    public volatile NotificationCenter mOldNotificationCenter;
    public final C00i A05 = new 1BQ(66703);
    public final C00i A0E = new 1BQ(66687);
    public final C00i A06 = new 1BQ(16385);
    public final C00i A02 = new 1BQ(16387);
    public final C00i A04 = new 1BQ(66426);
    public final C00i A03 = new 1BQ(66441);
    public final List A0C = new ArrayList();
    public final List A0B = new ArrayList();
    public volatile boolean A0I = true;
    public final C00i A08 = new 1BV((1BY) null, 16671);

    public MessengerPerUserMsysMailbox(1BO r302, FbUserSession fbUserSession) {
        boolean z = true;
        this.A00 = new 1BY(r302);
        this.A01 = fbUserSession;
        this.A0D = fbUserSession != FbUserSession.A01 ? false : z;
        Integer num = 1Lo.A05;
        this.A07 = new 1MV(fbUserSession, (1BY) null, 65779);
        this.A09 = new 1MV(fbUserSession, (1BY) null, 16888);
        this.A0A = ((1G1) fbUserSession).A05;
    }

    public static void A00(MessengerPerUserMsysMailbox messengerPerUserMsysMailbox, final Mailbox mailbox) {
        boolean z;
        final AccountSession accountSession;
        C1iw c1iw;
        synchronized (messengerPerUserMsysMailbox) {
            z = messengerPerUserMsysMailbox.A0I;
        }
        C1yi c1yi = (C1yi) messengerPerUserMsysMailbox.A0E.get();
        if (z) {
            C1yi.A00(c1yi, "[app_state]: backgrounded");
            accountSession = mailbox.getAccountSession();
            c1iw = new C1iw() { // from class: X.5gl
                public static final String __redex_internal_original_name = "MsysAppStateHandler$4";

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("getSyncHandlerToNotifyEnterAppBackground");
                }

                @Override // java.lang.Runnable
                public void run() {
                    Mailbox mailbox2 = Mailbox.this;
                    mailbox2.updateAppStateToBackground();
                    final SyncHandler syncHandler = mailbox2.getSyncHandler();
                    AccountSession accountSession2 = accountSession;
                    if (syncHandler != null) {
                        Execution.executeAsync(new C1iw() { // from class: X.5gm
                            public static final String __redex_internal_original_name = "MsysAppStateHandler$2";

                            {
                                super("notifyEnterAppBackground");
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                SyncHandler.this.reportAppState();
                            }
                        }, accountSession2, 2);
                    } else {
                        android.util.Log.e("MsysAppStateHandler", "SyncHandler is null when attempting to notify Msys of app background.");
                    }
                    AppState A00 = MsysInfraNoSqliteObjectHolder.A00();
                    if (A00 != null) {
                        A00.notifyAppEnterBackground(C1ha.A00());
                    } else {
                        android.util.Log.e("MsysAppStateHandler", "appState or notificationCenter is null when attempting to notify Msys of app background.");
                    }
                }
            };
        } else {
            C1yi.A00(c1yi, "[app_state]: foregrounded");
            accountSession = mailbox.getAccountSession();
            c1iw = new C1iw() { // from class: X.4gs
                public static final String __redex_internal_original_name = "MsysAppStateHandler$3";

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("getSyncHandlerToNotifyEnterAppForeground");
                }

                @Override // java.lang.Runnable
                public void run() {
                    Mailbox mailbox2 = Mailbox.this;
                    mailbox2.updateAppStateToForeground();
                    final SyncHandler syncHandler = mailbox2.getSyncHandler();
                    AccountSession accountSession2 = accountSession;
                    if (syncHandler != null) {
                        Execution.executeAsync(new C1iw() { // from class: X.4gt
                            public static final String __redex_internal_original_name = "MsysAppStateHandler$1";

                            {
                                super("notifyEnterAppForeground");
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                SyncHandler syncHandler2 = SyncHandler.this;
                                syncHandler2.notifyAppEnterForeground();
                                syncHandler2.reportAppState();
                            }
                        }, accountSession2, 2);
                    } else {
                        android.util.Log.e("MsysAppStateHandler", "SyncHandler is null when attempting to notify Msys of app foreground.");
                    }
                    AppState A00 = MsysInfraNoSqliteObjectHolder.A00();
                    if (A00 != null) {
                        A00.notifyAppEnterForeground(C1ha.A00());
                    } else {
                        android.util.Log.e("MsysAppStateHandler", "appState or notificationCenter is null when attempting to notify Msys of app foreground.");
                    }
                }
            };
        }
        Execution.executeAsync(c1iw, accountSession, 1);
    }

    public static void A01(MessengerPerUserMsysMailbox messengerPerUserMsysMailbox, Runnable runnable) {
        synchronized (messengerPerUserMsysMailbox) {
            messengerPerUserMsysMailbox.mOldNotificationCenter = null;
        }
        1fC r0 = (1fC) messengerPerUserMsysMailbox.A07.get();
        synchronized (r0) {
            1fU r02 = (1fU) 1Lo.A06(r0.A01, 16752);
            synchronized (r02) {
                1Y8 r03 = (1Y8) r02.A02.get();
                synchronized (r03) {
                    r03.A00 = null;
                }
                r02.A00 = null;
            }
            r0.A00 = null;
        }
        messengerPerUserMsysMailbox.A03.get();
        synchronized (MPLSyncMonitor.class) {
            MPLSyncMonitor.mailbox = null;
        }
        C1yS c1yS = (C1yS) messengerPerUserMsysMailbox.A05.get();
        synchronized (c1yS) {
            if (!C1yS.A01(c1yS)) {
                if (c1yS.A0F != null) {
                    Context context = FbInjector.A03;
                    11T.A0A(context);
                    Object systemService = context.getSystemService("connectivity");
                    11T.A0I(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    try {
                        try {
                            ConnectivityManager.NetworkCallback networkCallback = c1yS.A0F;
                            11T.A0D(networkCallback);
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                        } catch (Exception e) {
                            0fH.A0p("MessengerMsysBroadcastReceiver", "Could not unregister network callback", e);
                        }
                        c1yS.A0F = null;
                    } catch (Throwable th) {
                        c1yS.A0F = null;
                        throw th;
                    }
                }
                if (c1yS.A0G != null) {
                    Execution.executeAsync(new C2sj(MqttNetworkSessionPlugin.get()), null, 3);
                    1PA r04 = c1yS.A0G;
                    11T.A0D(r04);
                    r04.A01();
                    c1yS.A0G = null;
                    if (c1yS.A0I != null) {
                        1PA r05 = c1yS.A0I;
                        11T.A0D(r05);
                        r05.A01();
                        c1yS.A0I = null;
                    }
                    if (c1yS.A0H != null) {
                        1PA r06 = c1yS.A0H;
                        11T.A0D(r06);
                        r06.A01();
                        c1yS.A0H = null;
                    }
                    0fH.A0j("MessengerMsysBroadcastReceiver", "receiver unregistered");
                }
            }
        }
        runnable.run();
    }

    public boolean A04(MailboxCallback mailboxCallback) {
        return A07(mailboxCallback);
    }

    public boolean A05(MailboxCallback mailboxCallback) {
        if (this.A0D) {
            return false;
        }
        synchronized (this) {
            if (this.A0G) {
                0fH.A0j("com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox", "Ignore mailbox call after cleanup started.");
                return false;
            }
            C1ge c1ge = this.A0F;
            if (c1ge != null) {
                return c1ge.A05(new C3b5(mailboxCallback, this, 28));
            }
            synchronized (this) {
                List list = this.A0B;
                list.add(mailboxCallback);
                0fH.A0g(Integer.valueOf(list.size()), "com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox", "mailbox not ready, wait for init finish, size: %d");
            }
            return true;
        }
    }

    public boolean A06(MailboxCallback mailboxCallback) {
        if (this.A0D) {
            return false;
        }
        synchronized (this) {
            if (this.A0G) {
                0fH.A0j("com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox", "Ignore mailbox call after cleanup started.");
                return false;
            }
            C1ge c1ge = this.A0F;
            if (c1ge != null) {
                return c1ge.A06(new C3b5(mailboxCallback, this, 28));
            }
            synchronized (this) {
                List list = this.A0B;
                list.add(mailboxCallback);
                0fH.A0g(Integer.valueOf(list.size()), "com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox", "mailbox not ready, wait for init finish, size: %d");
            }
            return true;
        }
    }

    public boolean A07(MailboxCallback mailboxCallback) {
        if (this.A0D) {
            return false;
        }
        synchronized (this) {
            if (this.A0G) {
                0fH.A0g(Log.getStackTraceString(new RuntimeException()), "com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox", "Ignore slim mailbox call after cleanup started. Stack: %s");
                return false;
            }
            C1ge c1ge = this.A0F;
            if (c1ge != null) {
                return c1ge.A07(mailboxCallback);
            }
            synchronized (this) {
                List list = this.A0C;
                list.add(mailboxCallback);
                0fH.A0g(Integer.valueOf(list.size()), "com.facebook.messenger.msys.provider.MessengerPerUserMsysMailbox", "slim mailbox not ready, wait for init finish, size: %d");
            }
            return true;
        }
    }

    public void A08(C1qM c1qM) {
        if (this.A0D) {
            return;
        }
        A06(new C3b5(c1qM, this, 29));
    }
}
