package X;

import android.content.Intent;
import android.os.BadParcelableException;
import java.io.Serializable;

/* renamed from: X.Abg, reason: case insensitive filesystem */
/* loaded from: Abg.class */
public abstract class AbstractC1238Abg {
    public static final C5ap A00(Intent intent) {
        if (!intent.hasExtra("notification_type")) {
            return null;
        }
        try {
            Serializable serializableExtra = intent.getSerializableExtra("notification_type");
            if (serializableExtra instanceof C5ap) {
                return (C5ap) serializableExtra;
            }
            return null;
        } catch (BadParcelableException unused) {
            return null;
        }
    }
}
