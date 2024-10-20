package com.facebook.messaging.sharedalbum.repository;

import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.4YU;
import X.5HP;
import X.5P5;
import X.7lS;
import X.7zO;
import X.7zP;
import X.7zT;
import X.A1d;
import X.A3i;
import X.AnonymousClass001;
import X.C03853z9;
import X.C0s8;
import X.C5en;
import X.C6kg;
import X.GOm;
import X.Ho4;
import X.HoV;
import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.model.MediaResourceList;
import com.facebook.msys.mci.Attachment;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: RepositoryHelperKt.class */
public abstract class RepositoryHelperKt {
    public static final Uri A00(Uri uri, C03853z9 c03853z9) {
        String str;
        Uri uri2 = null;
        if (uri != null) {
            long A00 = C03853z9.A00(uri);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() >= 2 && (str = pathSegments.get(1)) != null) {
                uri2 = c03853z9.A01(str, A00);
            }
        }
        return uri2;
    }

    public static final Attachment A01(Uri uri, C6kg c6kg, Long l, String str, String str2, String str3, byte[] bArr, int i, int i2, int i3, long j, long j2) {
        byte[] bArr2 = bArr;
        7zP.A1N(uri, 2, c6kg);
        Attachment attachment = Attachment.$redex_init_class;
        Long A0l = 1BK.A0l(i3);
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        String obj = uri.toString();
        String obj2 = uri.toString();
        Long A0l2 = 1BK.A0l(i);
        Long A0l3 = 1BK.A0l(i2);
        if (bArr == null) {
            try {
                bArr2 = c6kg.A04(uri);
            } catch (IOException e) {
                0fH.A0w("SharedAlbumRepositoryHelper", "Failed to get bytes from uri", e);
                bArr2 = null;
            }
        }
        return new Attachment(str3, str3, A0l, str, valueOf, null, valueOf2, true, false, obj, str2, l, obj2, str2, null, A0l2, A0l3, null, null, null, null, null, null, null, null, null, null, null, null, null, bArr2, null, null, null, null, null, null, null, null, false, null, null, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0036, code lost:
    
        if (((X.AIZ) r305).A06 != 1) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(X.C6kg r301, X.C03853z9 r302, X.I4Y r303, com.facebook.xapp.messaging.threadview.model.photo.Photo r304, X.0DR r305, int r306) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt.A02(X.6kg, X.3z9, X.I4Y, com.facebook.xapp.messaging.threadview.model.photo.Photo, X.0DR, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(X.I4Y r301, java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt.A03(X.I4Y, java.lang.String, X.0DR):java.lang.Object");
    }

    public static final List A04(MediaResourceList mediaResourceList, C6kg c6kg, byte[] bArr) {
        boolean A1X = 1BL.A1X(mediaResourceList, c6kg);
        1BQ A02 = 1BQ.A02(Constants.LOAD_RESULT_PGO);
        List list = mediaResourceList.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return A0s;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C0s8.A18();
                throw 0Q8.createAndThrow();
            }
            MediaResource mediaResource = (MediaResource) next;
            String str = mediaResource.A0n;
            long j = mediaResource.A07;
            Uri uri = mediaResource.A0E;
            11T.A09(uri);
            String str2 = mediaResource.A0s;
            int i4 = mediaResource.A04;
            int i5 = mediaResource.A00;
            Long valueOf = Long.valueOf(mediaResource.A08);
            5HP r0 = mediaResource.A0Q;
            11T.A09(r0);
            7lS r02 = 7lS.$redex_init_class;
            int ordinal = r0.ordinal();
            int i6 = 2;
            if (ordinal != 0) {
                i6 = 4;
                if (ordinal != A1X) {
                    i6 = 0;
                }
            }
            A02.get();
            A0s.add(A01(uri, c6kg, valueOf, str, str2, 4YU.A0s(), bArr, i4, i5, i6, j, i2));
            i = i3;
        }
    }

    public static final void A05(ThreadKey threadKey, 5P5 r302, Function1 function1) {
        11T.A0F(r302, 1);
        if (threadKey.A1N()) {
            function1.invoke(7zO.A0k(threadKey));
        } else {
            r302.A00(new A1d(function1, ActionId.RTMP_STREAM_PREPARED), threadKey.A01);
        }
    }

    public static final void A06(HoV hoV, C6kg c6kg, MediaResource mediaResource, Ho4 ho4, C03853z9 c03853z9, Function1 function1) {
        File A00;
        7zT.A1W(c03853z9, c6kg, hoV, ho4);
        Uri A002 = A00(mediaResource.A0E, c03853z9);
        if (A002 == null || (A00 = hoV.A00(A002, 0S2.A00, GOm.A00(198), "video/mp4", ".tmp")) == null) {
            return;
        }
        ho4.A00(A002, new A3i(c6kg, mediaResource, A00, function1), A00);
    }

    public static final void A07(HoV hoV, C6kg c6kg, Ho4 ho4, C03853z9 c03853z9, VideoAttachment videoAttachment, Function1 function1) {
        Uri uri;
        11T.A0F(videoAttachment, 0);
        7zT.A1W(c03853z9, c6kg, hoV, ho4);
        MediaResource mediaResource = videoAttachment.A0E;
        if (mediaResource == null || (uri = mediaResource.A0E) == null) {
            return;
        }
        C5en c5en = new C5en();
        c5en.A0E = uri;
        c5en.A08 = videoAttachment.A07;
        c5en.A00 = videoAttachment.A03;
        c5en.A04 = videoAttachment.A06;
        c5en.A0q = "video/mp4";
        c5en.A0P = 5HP.A0H;
        A06(hoV, c6kg, 4YU.A0Y(c5en), ho4, c03853z9, function1);
    }
}
