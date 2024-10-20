package X;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;

/* renamed from: X.4S4, reason: invalid class name */
/* loaded from: 4S4.class */
public abstract class C4S4 {
    public static final Cursor A00(C4Il c4Il, 4KE r302) {
        Cursor A02 = c4Il.A02(r302);
        if (A02 instanceof AbstractWindowedCursor) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) A02;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(A02.getColumnNames(), A02.getCount());
                    while (A02.moveToNext()) {
                        Object[] objArr = new Object[A02.getColumnCount()];
                        int columnCount = A02.getColumnCount();
                        for (int i = 0; i < columnCount; i++) {
                            int type = A02.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(A02.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(A02.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = A02.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = A02.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    A02.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return A02;
    }
}
