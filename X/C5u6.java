package X;

import android.net.Uri;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.video.engine.api.VideoDataSource;
import com.facebook.xapp.messaging.threadview.model.video.VideoAttachment;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;

/* renamed from: X.5u6, reason: invalid class name */
/* loaded from: 5u6.class */
public final class C5u6 {
    public static final C5u6 A00 = new Object();

    public final C5w8 A00(C5pu c5pu, C5u8 c5u8, boolean z) {
        Uri BJs;
        Uri BFf;
        if (c5pu == null) {
            return null;
        }
        1qX r0 = (1qX) c5pu;
        if (r0.mResultSet.getCount() == 0 || c5pu.AXc(0) != 4 || (BJs = c5u8.BJs(c5pu, 0)) == null || (BFf = c5u8.BFf(c5pu, 0)) == null) {
            return null;
        }
        6AF r02 = new 6AF();
        r02.A01(r0.mResultSet.getString(0, ActionId.VIDEO_DISPLAYED));
        Parcelable.Creator creator = VideoDataSource.CREATOR;
        6A9 r03 = new 6A9();
        r03.A03 = BJs;
        r03.A04 = 6AB.A05;
        r02.A00(ImmutableList.of((Object) new VideoDataSource(r03)));
        r02.A0C = BFf;
        Integer nullableInteger = r0.mResultSet.getNullableInteger(0, 30);
        if (nullableInteger == null) {
            nullableInteger = r0.mResultSet.getNullableInteger(0, 32);
            if (nullableInteger == null) {
                nullableInteger = -1;
            }
        }
        r02.A06 = nullableInteger.intValue();
        Integer nullableInteger2 = r0.mResultSet.getNullableInteger(0, 31);
        if (nullableInteger2 == null) {
            nullableInteger2 = r0.mResultSet.getNullableInteger(0, 33);
            if (nullableInteger2 == null) {
                nullableInteger2 = -1;
            }
        }
        r02.A03 = nullableInteger2.intValue();
        Long nullableLong = r0.mResultSet.getNullableLong(0, 21);
        if (nullableLong == null) {
            nullableLong = 4YV.A0i();
        }
        r02.A07 = nullableLong.longValue();
        Long nullableLong2 = r0.mResultSet.getNullableLong(0, 22);
        if (nullableLong2 == null) {
            nullableLong2 = 0L;
        }
        r02.A0A = nullableLong2.longValue();
        Long nullableLong3 = r0.mResultSet.getNullableLong(0, 23);
        if (nullableLong3 == null) {
            nullableLong3 = 0L;
        }
        r02.A08 = nullableLong3.longValue();
        r02.A0D = C48g.VIDEO_ATTACHMENT;
        Comparator comparator = MediaResource.A19;
        C5en c5en = new C5en();
        c5en.A0E = BJs;
        c5en.A0D = BFf;
        c5en.A0P = c5u8.BJp();
        c5en.A0N = C5ep.A0S;
        r02.A0E = new MediaResource(c5en);
        r02.A0L = z;
        VideoAttachment videoAttachment = new VideoAttachment(r02);
        C5w8 c5w8 = new C5w8();
        c5w8.A00 = videoAttachment;
        return c5w8;
    }
}
