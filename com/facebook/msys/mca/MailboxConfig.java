package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: MailboxConfig.class */
public class MailboxConfig {
    public static final MailboxConfig $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MailboxConfig(SlimMailbox slimMailbox, AccountSession accountSession, NetworkSession networkSession, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10, int i, boolean z11, DasmConfigCreator dasmConfigCreator, List list, List list2, boolean z12, int i2, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, MailboxDatabaseConfig mailboxDatabaseConfig, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, int i3, int i4, boolean z21) {
        this.mNativeHolder = initNativeHolder(slimMailbox, accountSession, networkSession, str, str2, str3, true, false, z3, z4, z5, j, true, 500L, false, false, 500L, false, false, i, z11, dasmConfigCreator, list, list2, false, i2, false, z14, z15, false, z17, z18, false, z20, mailboxDatabaseConfig, mailboxMessengerMediaSendManagerConfig, i3, i4, false);
    }

    private native NativeHolder initNativeHolder(SlimMailbox slimMailbox, AccountSession accountSession, NetworkSession networkSession, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10, int i, boolean z11, DasmConfigCreator dasmConfigCreator, List list, List list2, boolean z12, int i2, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, MailboxDatabaseConfig mailboxDatabaseConfig, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, int i3, int i4, boolean z21);
}
