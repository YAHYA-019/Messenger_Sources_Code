package com.facebook.msys.mca;

import java.util.concurrent.Executor;

/* loaded from: MailboxObservable.class */
public interface MailboxObservable {
    MailboxObservable addResultCallback(MailboxCallback mailboxCallback);

    MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback);

    MailboxObservable removeAllResultCallbacks();

    MailboxObservable removeResultCallback(MailboxCallback mailboxCallback);
}
