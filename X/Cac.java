package X;

import android.database.Cursor;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Cac.class */
public final class Cac implements 2Ad {
    public final 1Br A01 = 1BK.A0C();
    public final 1Br A00 = AbG.A0M();

    public java.util.Map getExtraFileFromWorkerThread(File file, FbUserSession fbUserSession) {
        boolean A1X = 1BL.A1X(file, fbUserSession);
        try {
            HashMap A0u = AnonymousClass001.A0u();
            File file2 = new File(file, "db_properties_json.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            1MV A09 = AbF.A09(fbUserSession, 49998);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            try {
                6E9 r0 = (6E9) A09.get();
                HashMap A0u2 = AnonymousClass001.A0u();
                HashMap hashMap = null;
                Cursor A01 = 0L0.A01(r0.A00, r0.A01, (String) null, (String) null, new String[]{"key", "value"}, (String[]) null, 848051636);
                if (A01 != null) {
                    while (A01.moveToNext()) {
                        try {
                            A0u2.put(A01.getString(0), A01.getString(A1X ? 1 : 0));
                        } finally {
                            A01.close();
                        }
                    }
                    hashMap = A0u2;
                }
                if (hashMap != null) {
                    JSONObject A12 = AnonymousClass001.A12();
                    Iterator A0x = AnonymousClass001.A0x(hashMap);
                    int i = 0;
                    while (true) {
                        if (!A0x.hasNext()) {
                            break;
                        }
                        Map.Entry A0z = AnonymousClass001.A0z(A0x);
                        String A0j = AnonymousClass001.A0j(A0z);
                        String A16 = 1BK.A16(A0z);
                        11T.A0D(A0j);
                        if (!0CV.A0b(A0j, "/bug_reporter/", false)) {
                            JSONObject A122 = AnonymousClass001.A12();
                            A122.put("key", A0j);
                            A122.put("value", A16);
                            int i2 = i + 1;
                            A12.put(String.valueOf(i), A122);
                            if (i2 == 100) {
                                JSONObject A123 = AnonymousClass001.A12();
                                A123.put("key", "property_table_row_count");
                                A123.put("value", hashMap.size());
                                A12.put(String.valueOf(i2), A123);
                                break;
                            }
                            i = i2;
                        }
                    }
                    printWriter.write(A12.toString());
                }
                Uri fromFile = Uri.fromFile(file2);
                11T.A0A(fromFile);
                printWriter.close();
                A0u.put("db_properties_json.txt", 11T.A02(fromFile));
                return A0u;
            } finally {
            }
        } catch (JSONException e) {
            1Br.A04(this.A00).softReport("PropertiesDbExtraFileProvider", e);
            return AnonymousClass001.A0u();
        }
    }

    public String getName() {
        return "PropertiesDb";
    }

    public boolean isMemoryIntensive() {
        return false;
    }

    public boolean isUserIdentifiable() {
        return false;
    }

    public void prepareDataForWriting() {
    }

    public boolean shouldSendAsync() {
        return 1Br.A07(this.A01).AZk(2342153633397277201L);
    }
}
