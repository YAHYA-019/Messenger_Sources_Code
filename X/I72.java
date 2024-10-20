package X;

import android.database.Cursor;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.ipc.media.MediaItem;
import com.facebook.photos.local.MediaCursorUtil$getMediaItems$1;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* loaded from: I72.class */
public final class I72 {
    public final 1Br A00 = 1Bu.A00(116318);

    public static final String A00(List list) {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s in (%s)", "_id", 1JF.A07(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, new Object[]{list}));
        11T.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public static final void A01(Cursor cursor, I72 i72, java.util.Map map, boolean z, boolean z2) {
        if (cursor != null) {
            try {
                cursor.moveToPosition(-1);
                0Mn A0B = 0AM.A0B(new MediaCursorUtil$getMediaItems$1(cursor, i72, null, z, z2));
                while (A0B.hasNext()) {
                    MediaItem mediaItem = (MediaItem) A0B.next();
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    } else if (mediaItem != null) {
                        map.put(Long.valueOf(mediaItem.A00.mMediaStoreId), mediaItem);
                    }
                }
                cursor.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass127.A00(cursor, th);
                    throw th2;
                }
            }
        }
    }
}
