package X;

import com.facebook.messenger.notification.engine.MSGRenderedNotification;

/* loaded from: Cmz.class */
public final class Cmz implements C5ov {
    public final MSGRenderedNotification A00;

    public Cmz(MSGRenderedNotification mSGRenderedNotification) {
        this.A00 = mSGRenderedNotification;
    }

    @Override // X.C5ov
    public C5ow AzX(int i) {
        MSGRenderedNotification mSGRenderedNotification = this.A00;
        Long notifType = mSGRenderedNotification.getNotifType();
        long timestampMs = mSGRenderedNotification.getTimestampMs();
        Long threadPK = mSGRenderedNotification.getThreadPK();
        Long messagePK = mSGRenderedNotification.getMessagePK();
        Long senderContactPK = mSGRenderedNotification.getSenderContactPK();
        boolean isEphemeral = mSGRenderedNotification.getIsEphemeral();
        boolean isGroupThread = mSGRenderedNotification.getIsGroupThread();
        String message = mSGRenderedNotification.getMessage();
        String notificationId = mSGRenderedNotification.getNotificationId();
        notificationId.getClass();
        return new C5ow(mSGRenderedNotification.getAttachmentType(), threadPK, messagePK, senderContactPK, null, message, notificationId, null, null, null, null, null, null, timestampMs, notifType == null ? -1 : notifType.longValue(), 0L, isEphemeral, isGroupThread, false, false, false);
    }

    @Override // X.C5ov
    public int getCount() {
        return 1;
    }
}
