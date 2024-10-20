package com.facebook.contacts.ccudefault;

import X.0fH;
import X.1Bi;
import X.1GU;
import X.1rC;
import X.4YT;
import X.AbH;
import X.C00i;
import X.C01m;
import X.Kit;
import X.MK4;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: DefaultCcuDatabaseHelper.class */
public final class DefaultCcuDatabaseHelper implements MK4 {
    public final C00i A01 = AbH.A0K();
    public final 1rC A00 = (1rC) 1Bi.A03(16831);

    @Override // X.MK4
    public void AFP() {
        ((1GU) this.A01.get()).AAq();
        this.A00.AUF().delete("contacts_upload_snapshot", null, null);
        0fH.A0j("com.facebook.contacts.ccudefault.DefaultCcuDatabaseHelper", "CCU: clear contacts upload snapshot");
    }

    @Override // X.MK4
    public SQLiteDatabase AUF() {
        return this.A00.AUF();
    }

    @Override // X.MK4
    public void CfA(Kit kit) {
        this.A00.AUF().delete("contacts_upload_snapshot", 4YT.A00(1220), new String[]{String.valueOf(kit.A01)});
    }

    @Override // X.MK4
    public void D80(Kit kit) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("local_contact_id", Long.valueOf(kit.A01));
        contentValues.put("contact_hash", kit.A02);
        SQLiteDatabase AUF = this.A00.AUF();
        C01m.A00(-628525655);
        AUF.replaceOrThrow("contacts_upload_snapshot", null, contentValues);
        C01m.A00(-510242297);
    }
}
