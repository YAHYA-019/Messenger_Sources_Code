package X;

import android.database.Cursor;
import com.facebook.acra.constants.ErrorReportingConstants;
import libraries.access.src.main.base.common.FXDeviceItem;

/* loaded from: G7n.class */
public final class G7n implements GJx {
    public final C67Z A00;

    public G7n(C67Z c67z) {
        this.A00 = c67z;
    }

    @Override // X.GJx
    public C67b D4t(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(ErrorReportingConstants.USER_ID_KEY);
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new RuntimeException("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        C67b c67b = null;
        if (string != null && string2 != null) {
            c67b = new C67b(string2, new C67a(string, null, null));
        }
        return c67b;
    }

    @Override // X.GJx
    public ExG D4v(Cursor cursor, C67Z c67z, EMr eMr) {
        throw new RuntimeException("LiteProvider not used in Frl.");
    }

    @Override // X.GJx
    public ExG D4w(Cursor cursor, EMr eMr) {
        11T.A0F(eMr, 1);
        int columnIndex = cursor.getColumnIndex(ErrorReportingConstants.USER_ID_KEY);
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new RuntimeException("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new ExG(string, string2, "FRL", new G8a(10), this.A00, eMr);
    }

    @Override // X.GJx
    public FXDeviceItem D4y(Cursor cursor, EMS ems, 67T r304) {
        return null;
    }
}
