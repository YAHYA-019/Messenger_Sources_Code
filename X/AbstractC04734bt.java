package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4bt.class */
public abstract class AbstractC04734bt extends 1DV {
    public final C04754bv A00;

    public AbstractC04734bt(Context context, 1E1 r303, C04754bv c04754bv, ImmutableList immutableList, String str) {
        super(context, r303, immutableList, str);
        this.A00 = c04754bv;
    }

    public void AFH() {
        SQLiteDatabase AUF;
        if (1DV.A05) {
            AMe();
            return;
        }
        synchronized (this) {
            AUF = super.AUF();
        }
        ImmutableList immutableList = ((1DV) this).A02;
        int size = immutableList.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                this.A00.A00(AUF.getPath());
                return;
            } else {
                ((1Db) immutableList.get(i2)).A06(((1DV) this).A00);
                i = i2 + 1;
            }
        }
    }

    public void AMe() {
        String path;
        synchronized (this) {
            SQLiteDatabase sQLiteDatabase = ((1DV) this).A00;
            path = sQLiteDatabase != null ? sQLiteDatabase.getPath() : null;
        }
        if (path != null) {
            this.A00.A00(path);
        }
        super.AMe();
    }

    public SQLiteDatabase AUF() {
        SQLiteDatabase AUF;
        synchronized (this) {
            try {
                AUF = super.AUF();
                try {
                    this.A00.A01(AUF.getPath());
                } catch (C4zq e) {
                    AFH();
                    try {
                        AUF = super.AUF();
                        try {
                            this.A00.A01(AUF.getPath());
                        } catch (C4zq e2) {
                            new IllegalStateException(0Pz.A0W("Cannot store uid, initial exception: ", e.getMessage()), e2);
                            throw th;
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return AUF;
    }
}
