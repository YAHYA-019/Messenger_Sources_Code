package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: C9f.class */
public abstract class C9f {
    public static Notification.BubbleMetadata A00(4vL r301) {
        String str = r301.A06;
        Notification.BubbleMetadata.Builder builder = str != null ? new Notification.BubbleMetadata.Builder(str) : new Notification.BubbleMetadata.Builder(r301.A04, 4iX.A00((Context) null, r301.A05));
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(r301.A03);
        boolean z = true;
        if ((r301.A02 & 1) == 0) {
            z = false;
        }
        deleteIntent.setAutoExpandBubble(z).setSuppressNotification(AnonymousClass001.A1N(r301.A02 & 2));
        int i = r301.A00;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        int i2 = r301.A01;
        if (i2 != 0) {
            builder.setDesiredHeightResId(i2);
        }
        return builder.build();
    }

    /* JADX WARN: Type inference failed for: r304v0, types: [X.C5b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r304v2, types: [X.C5b, java.lang.Object] */
    public static 4vL A01(Notification.BubbleMetadata bubbleMetadata) {
        C5b c5b;
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            ?? obj = new Object();
            if (TextUtils.isEmpty(shortcutId)) {
                throw AnonymousClass001.A0Q("Bubble requires a non-null shortcut id");
            }
            obj.A06 = shortcutId;
            c5b = obj;
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            IconCompat A01 = 4iX.A01(bubbleMetadata.getIcon());
            ?? obj2 = new Object();
            if (intent == null) {
                throw AnonymousClass001.A0Q("Bubble requires non-null pending intent");
            }
            obj2.A04 = intent;
            obj2.A05 = A01;
            c5b = obj2;
        }
        boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        int i = c5b.A02;
        int i2 = i & (-2);
        if (autoExpandBubble) {
            i2 = i | 1;
        }
        c5b.A02 = i2;
        c5b.A03 = bubbleMetadata.getDeleteIntent();
        boolean isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
        int i3 = c5b.A02;
        int i4 = i3 & (-3);
        if (isNotificationSuppressed) {
            i4 = i3 | 2;
        }
        c5b.A02 = i4;
        if (bubbleMetadata.getDesiredHeight() != 0) {
            c5b.A00 = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            c5b.A01 = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            c5b.A01 = bubbleMetadata.getDesiredHeightResId();
            c5b.A00 = 0;
        }
        return c5b.A00();
    }
}
