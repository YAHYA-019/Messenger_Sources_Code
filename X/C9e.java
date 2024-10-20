package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: C9e.class */
public abstract class C9e {
    public static Notification.BubbleMetadata A00(4vL r301) {
        PendingIntent pendingIntent = r301.A04;
        if (pendingIntent == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(4iX.A00((Context) null, r301.A05)).setIntent(pendingIntent).setDeleteIntent(r301.A03);
        boolean z = true;
        if ((r301.A02 & 1) == 0) {
            z = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = deleteIntent.setAutoExpandBubble(z).setSuppressNotification(AnonymousClass001.A1N(r301.A02 & 2));
        int i = r301.A00;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        int i2 = r301.A01;
        if (i2 != 0) {
            suppressNotification.setDesiredHeightResId(i2);
        }
        return suppressNotification.build();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.C5b, java.lang.Object] */
    public static 4vL A01(Notification.BubbleMetadata bubbleMetadata) {
        4vL r303 = null;
        if (bubbleMetadata.getIntent() != null) {
            PendingIntent intent = bubbleMetadata.getIntent();
            IconCompat A01 = 4iX.A01(bubbleMetadata.getIcon());
            ?? obj = new Object();
            if (intent == null) {
                throw AnonymousClass001.A0Q("Bubble requires non-null pending intent");
            }
            obj.A04 = intent;
            obj.A05 = A01;
            boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
            int i = obj.A02;
            int i2 = i & (-2);
            if (autoExpandBubble) {
                i2 = i | 1;
            }
            obj.A02 = i2;
            obj.A03 = bubbleMetadata.getDeleteIntent();
            boolean isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
            int i3 = obj.A02;
            int i4 = i3 & (-3);
            if (isNotificationSuppressed) {
                i4 = i3 | 2;
            }
            obj.A02 = i4;
            if (bubbleMetadata.getDesiredHeight() != 0) {
                obj.A00 = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                obj.A01 = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                obj.A01 = bubbleMetadata.getDesiredHeightResId();
                obj.A00 = 0;
            }
            r303 = obj.A00();
        }
        return r303;
    }
}
