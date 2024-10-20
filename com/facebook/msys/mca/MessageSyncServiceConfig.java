package com.facebook.msys.mca;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: MessageSyncServiceConfig.class */
public abstract class MessageSyncServiceConfig {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, String str2, AccountSession accountSession, SlimMailbox slimMailbox, MailboxDatabaseConfig mailboxDatabaseConfig, NetworkSession networkSession, DasmConfigCreator dasmConfigCreator, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, String str3, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10, boolean z11);
}
