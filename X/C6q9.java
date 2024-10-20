package X;

import android.database.Cursor;
import android.net.Uri;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.model.StickerCapabilities;
import java.io.File;

/* renamed from: X.6q9, reason: invalid class name */
/* loaded from: 6q9.class */
public abstract class C6q9 {
    public static Sticker A00(Cursor cursor, C6q8 c6q8, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        c6q8.A01();
        String string = cursor.getString(i3);
        String string2 = cursor.getString(i15);
        String string3 = cursor.getString(i13);
        String string4 = cursor.getString(i19);
        String str = 5R0.A06;
        Uri uri = null;
        if (string4 != null) {
            try {
                uri = C0A2.A03(string4);
            } catch (Exception unused) {
            }
        }
        String string5 = cursor.getString(i2);
        Uri uri2 = null;
        if (string5 != null) {
            try {
                uri2 = C0A2.A03(string5);
            } catch (Exception unused2) {
            }
        }
        String string6 = cursor.getString(i12);
        Uri uri3 = null;
        if (string6 != null) {
            try {
                uri3 = C0A2.A03(string6);
            } catch (Exception unused3) {
            }
        }
        String string7 = cursor.getString(i14);
        Uri uri4 = null;
        if (string7 != null) {
            try {
                uri4 = C0A2.A03(string7);
            } catch (Exception unused4) {
            }
        }
        String string8 = cursor.getString(i17);
        Uri uri5 = null;
        if (string8 != null) {
            try {
                uri5 = C0A2.A03(string8);
            } catch (Exception unused5) {
            }
        }
        TriState fromDbValue = TriState.fromDbValue(cursor.getInt(i5));
        TriState fromDbValue2 = TriState.fromDbValue(cursor.getInt(i6));
        TriState fromDbValue3 = TriState.fromDbValue(cursor.getInt(i7));
        TriState fromDbValue4 = TriState.fromDbValue(cursor.getInt(i11));
        TriState fromDbValue5 = TriState.fromDbValue(cursor.getInt(i10));
        TriState fromDbValue6 = TriState.fromDbValue(cursor.getInt(i9));
        TriState fromDbValue7 = TriState.fromDbValue(cursor.getInt(i8));
        String string9 = cursor.getString(i20);
        GraphQLStickerType graphQLStickerType = GraphQLStickerType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        if (string9 != null) {
            graphQLStickerType = (GraphQLStickerType) EnumHelper.A00(graphQLStickerType, string9);
        }
        boolean z = true;
        if (cursor.getInt(i4) != 1) {
            z = false;
        }
        StickerCapabilities stickerCapabilities = new StickerCapabilities(fromDbValue, fromDbValue2, fromDbValue3, fromDbValue4, fromDbValue5, fromDbValue6, fromDbValue7);
        11T.A0F(string, 0);
        c6q8.A0F = string;
        c6q8.A04(string2);
        c6q8.A0G = string3;
        11T.A0F(uri, 0);
        c6q8.A09 = uri;
        c6q8.A02 = uri2;
        c6q8.A03 = uri3;
        c6q8.A05 = uri4;
        c6q8.A07 = uri5;
        c6q8.A03(stickerCapabilities);
        c6q8.A0B = graphQLStickerType;
        c6q8.A0I = z;
        String string10 = cursor.getString(i18);
        String string11 = cursor.getString(i);
        String string12 = cursor.getString(i16);
        if (string10 != null) {
            c6q8.A08 = Uri.fromFile(AnonymousClass001.A0E(string10));
        }
        if (string11 != null) {
            c6q8.A01 = Uri.fromFile(AnonymousClass001.A0E(string11));
        }
        if (string12 != null) {
            c6q8.A06 = Uri.fromFile(new File(string12));
        }
        return c6q8.A00();
    }
}
