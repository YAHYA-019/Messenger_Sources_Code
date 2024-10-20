package X;

import com.facebook.messaging.model.attachment.AttachmentImageMap;
import com.facebook.messaging.model.attachment.ImageUrl;

/* renamed from: X.61q, reason: invalid class name */
/* loaded from: 61q.class */
public abstract class C61q {
    public static String A00(AttachmentImageMap attachmentImageMap, String str) {
        String str2;
        StringBuilder sb = new StringBuilder(200);
        sb.append("Message ID: ");
        sb.append(str);
        sb.append('\n');
        Enum[] values = 48N.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return sb.toString();
            }
            Enum r0 = values[i2];
            ImageUrl imageUrl = (ImageUrl) attachmentImageMap.A01.get(r0);
            if (imageUrl == null) {
                sb.append(r0.name());
                str2 = " - Not in the URL map\n";
            } else if (imageUrl.A02 == null) {
                sb.append(r0.name());
                str2 = " - SRC is null for type\n";
            } else {
                i = i2 + 1;
            }
            sb.append(str2);
            i = i2 + 1;
        }
    }

    public static boolean A01(AttachmentImageMap attachmentImageMap) {
        ImageUrl imageUrl;
        48N[] values = 48N.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                z = true;
                break;
            }
            48N r0 = values[i2];
            if (r0 != 48N.A01 && ((imageUrl = (ImageUrl) attachmentImageMap.A01.get(r0)) == null || imageUrl.A02 == null)) {
                break;
            }
            i = i2 + 1;
        }
        return z;
    }
}
