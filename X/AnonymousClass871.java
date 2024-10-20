package X;

import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.871, reason: invalid class name */
/* loaded from: 871.class */
public final class AnonymousClass871 {
    public static final AnonymousClass871 A00 = new Object();

    public static final VideoDataSource A00(C5j5 c5j5, VideoAttachment videoAttachment) {
        VideoDataSource videoDataSource = null;
        if (videoAttachment != null) {
            boolean A02 = A00.A02(c5j5, videoAttachment);
            1Du it = videoAttachment.A00().iterator();
            while (it.hasNext()) {
                VideoDataSource videoDataSource2 = (VideoDataSource) it.next();
                11T.A0D(videoDataSource2);
                if (A01(c5j5, videoDataSource2)) {
                    if (!A02) {
                        return videoDataSource2;
                    }
                } else if (videoDataSource == null) {
                    videoDataSource = videoDataSource2;
                }
            }
        }
        return videoDataSource;
    }

    public static final boolean A01(C5j5 c5j5, VideoDataSource videoDataSource) {
        if (videoDataSource.A04 != 6AB.A03) {
            return false;
        }
        String valueOf = String.valueOf(videoDataSource.A03);
        return AnonymousClass001.A1V(C5uk.A00(C5ua.A00(new A26(valueOf, c5j5, 0), ZonePolicy.A0F), 0S2.A0B));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (r0.A0U == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A02(X.C5j5 r302, com.facebook.xapp.messaging.threadview.model.video.VideoAttachment r303) {
        /*
            r301 = this;
            r0 = r303
            com.google.common.collect.ImmutableList r0 = r0.A00()
            r304 = r0
            r0 = r304
            X.11T.A0A(r0)
            r0 = r304
            boolean r0 = r0 instanceof java.util.Collection
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2c
            r0 = r304
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2c
        L24:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L29:
            r0 = r306
            return r0
        L2c:
            r0 = r304
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r0 = r0.iterator()
            r304 = r0
        L34:
            r0 = r304
            boolean r0 = r0.hasNext()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L24
            r0 = r304
            java.lang.Object r0 = r0.next()
            com.facebook.video.engine.api.VideoDataSource r0 = (com.facebook.video.engine.api.VideoDataSource) r0
            r307 = r0
            r0 = r307
            X.11T.A0D(r0)
            r0 = r302
            r1 = r307
            boolean r0 = A01(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L34
            r0 = r303
            com.facebook.ui.media.attachments.model.MediaResource r0 = r0.A0E
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L24
            r0 = r307
            com.facebook.ui.media.attachments.model.music.MusicMetaData r0 = r0.A0U
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r307
            if (r0 != 0) goto L29
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass871.A02(X.5j5, com.facebook.xapp.messaging.threadview.model.video.VideoAttachment):boolean");
    }

    public static final boolean A03(C5j5 c5j5, VideoAttachment videoAttachment) {
        11T.A0F(c5j5, 1);
        if (videoAttachment == null || A00.A02(c5j5, videoAttachment)) {
            return false;
        }
        ImmutableList A002 = videoAttachment.A00();
        11T.A0A(A002);
        if ((A002 instanceof Collection) && A002.isEmpty()) {
            return false;
        }
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            VideoDataSource videoDataSource = (VideoDataSource) it.next();
            11T.A0D(videoDataSource);
            if (A01(c5j5, videoDataSource)) {
                return true;
            }
        }
        return false;
    }
}
