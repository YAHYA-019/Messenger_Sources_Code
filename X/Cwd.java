package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messenger.notification.engine.MSGNotificationEngineContext;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.messenger.notification.engine.NotificationEngineValueProviderGetterCompletionCallback;

/* loaded from: Cwd.class */
public final class Cwd implements MSGNotificationEngineValueProvider.ProviderGetterCallback {
    public final 1Br A00 = 1Bq.A00(82351);

    @Override // com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider.ProviderGetterCallback
    public void getValueForKey(MSGNotificationEngineContext mSGNotificationEngineContext, String str, NotificationEngineValueProviderGetterCompletionCallback notificationEngineValueProviderGetterCompletionCallback) {
        4YV.A1N(mSGNotificationEngineContext, notificationEngineValueProviderGetterCompletionCallback);
        03Y A00 = R11.A00(mSGNotificationEngineContext.getNotificationContextDict());
        ThreadKey threadKey = (ThreadKey) A00.first;
        String str2 = (String) A00.second;
        if (str2 != null || threadKey == null) {
            notificationEngineValueProviderGetterCompletionCallback.failure(mSGNotificationEngineContext, AnonymousClass001.A0T(str2));
        } else {
            notificationEngineValueProviderGetterCompletionCallback.success(mSGNotificationEngineContext, Boolean.valueOf(((C7C) 1Br.A0B(this.A00)).A01(threadKey)));
        }
    }
}
