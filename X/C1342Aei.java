package X;

import android.database.CursorWrapper;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Locale;

/* renamed from: X.Aei, reason: case insensitive filesystem */
/* loaded from: Aei.class */
public final class C1342Aei extends CursorWrapper {
    public java.util.Map A00;

    public static String A00(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        int lastIndexOf = lowerCase.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return lowerCase;
        }
        0fH.A0S(C1342Aei.class, "requesting column name with table name -- %s", new Object[]{str});
        return lowerCase.substring(lastIndexOf + 1);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.A00 == null) {
            this.A00 = AnonymousClass001.A0u();
            String[] columnNames = getColumnNames();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= columnNames.length) {
                    break;
                }
                1BK.A1P(A00(columnNames[i2]), this.A00, i2);
                i = i2 + 1;
            }
        }
        return C3o5.A04(1BK.A0o(A00(str), this.A00));
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw AnonymousClass001.A0L(StringFormatUtil.formatStrLocaleSafe("column '%s' does not exist", str));
    }
}
