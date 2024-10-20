package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.ipc.media.data.MimeType;
import com.facebook.messaging.media.folder.Folder;
import com.facebook.messaging.media.folder.LoadFolderParams;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C3y.class */
public final class C3y {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;

    public C3y(1De r302) {
        this.A02 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 85137);
        this.A01 = 1Bu.A03(r0, 85138);
    }

    /* JADX WARN: Type inference failed for: r0v319, types: [java.lang.Object, java.util.Comparator] */
    public final ImmutableList A00(LoadFolderParams loadFolderParams) {
        Object[] objArr;
        String str;
        boolean z;
        Collection values;
        Object[] objArr2;
        String str2;
        boolean z2;
        String str3;
        String[] strArr;
        String str4;
        String[] strArr2;
        11T.A0F(loadFolderParams, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            Bpv bpv = (Bpv) 1Br.A0B(this.A01);
            C00j.A05("getGalleryFoldersApi29", -937011829);
            0QO r0 = new 0QO(0);
            C00i c00i = bpv.A00.A00;
            ContentResolver contentResolver = (ContentResolver) c00i.get();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            11T.A0B(uri);
            String[] strArr3 = {"bucket_display_name", "bucket_id", "date_modified", "_id", "mime_type"};
            boolean z3 = loadFolderParams.A00;
            if (z3) {
                str3 = StringFormatUtil.formatStrLocaleSafe("%s !=?", "mime_type", "bucket_id");
                strArr = new String[]{11T.A02(MimeType.A03)};
            } else {
                str3 = null;
                strArr = null;
            }
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s DESC", "date_modified");
            11T.A0A(formatStrLocaleSafe);
            Cursor cursor = 0L0.A01(contentResolver, uri, str3, formatStrLocaleSafe, strArr3, strArr, 681652133);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex("bucket_id"));
                        if (string != null) {
                            long A02 = AbH.A02(cursor, "date_modified");
                            Folder folder = (Folder) r0.get(string);
                            if (folder == null) {
                                String string2 = cursor.getString(cursor.getColumnIndex("bucket_display_name"));
                                Uri uri2 = null;
                                try {
                                    uri2 = C0A2.A03(0Pz.A0P(uri.toString(), '/', AbH.A02(cursor, "_id")));
                                } catch (SecurityException unused) {
                                }
                                if (string2 != null && uri2 != null) {
                                    r0.put(string, new Folder(uri2, string2, string, 1, A02));
                                }
                            } else {
                                folder.A00++;
                            }
                        }
                    } finally {
                    }
                }
                cursor.close();
            }
            if (!loadFolderParams.A01) {
                0QO r02 = new 0QO(0);
                ContentResolver contentResolver2 = (ContentResolver) c00i.get();
                Uri uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                11T.A0B(uri3);
                String[] strArr4 = {"bucket_display_name", "bucket_id", "date_modified", "_data", "mime_type"};
                if (z3) {
                    str4 = StringFormatUtil.formatStrLocaleSafe("%s !=?", "mime_type", "bucket_id");
                    strArr2 = new String[]{11T.A02(MimeType.A03)};
                } else {
                    str4 = null;
                    strArr2 = null;
                }
                String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("%s DESC", "date_modified");
                11T.A0A(formatStrLocaleSafe2);
                cursor = 0L0.A01(contentResolver2, uri3, str4, formatStrLocaleSafe2, strArr4, strArr2, 681652133);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string3 = cursor.getString(cursor.getColumnIndex("bucket_id"));
                        if (string3 != null) {
                            long A022 = AbH.A02(cursor, "date_modified");
                            Folder folder2 = (Folder) r02.get(string3);
                            if (folder2 == null) {
                                String string4 = cursor.getString(cursor.getColumnIndex("bucket_display_name"));
                                String string5 = cursor.getString(cursor.getColumnIndex("_data"));
                                Uri fromFile = string5 != null ? Uri.fromFile(new File(string5)) : null;
                                if (string4 != null && fromFile != null) {
                                    r02.put(string3, new Folder(fromFile, string4, string3, 1, A022));
                                }
                            } else {
                                folder2.A00++;
                            }
                        }
                    }
                    cursor.close();
                }
                Iterator it = r02.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(it);
                    Object key = A0z.getKey();
                    Folder folder3 = (Folder) A0z.getValue();
                    Folder folder4 = (Folder) r0.get(key);
                    if (folder4 != null) {
                        int i = folder4.A00 + folder3.A00;
                        long j = folder3.A01;
                        long j2 = folder4.A01;
                        folder3 = j > j2 ? new Folder(folder3.A02, folder3.A03, folder3.A04, i, j) : new Folder(folder4.A02, folder4.A03, folder4.A04, i, j2);
                    }
                    r0.put(key, folder3);
                }
            }
            C00j.A01(-702077748);
            values = r0.values();
        } else {
            Bsa bsa = (Bsa) 1Br.A0B(this.A00);
            C00j.A05("getGalleryFoldersApi16", 2018443814);
            C00i c00i2 = bsa.A00.A00;
            ContentResolver contentResolver3 = (ContentResolver) c00i2.get();
            Uri uri4 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            11T.A0B(uri4);
            String[] strArr5 = {"bucket_display_name", "bucket_id", "date_modified", "_id", "mime_type", "COUNT(bucket_id)"};
            boolean z4 = loadFolderParams.A00;
            if (z4) {
                objArr = new Object[]{"mime_type", "bucket_id"};
                str = "%s !=?) GROUP BY (%s";
            } else {
                objArr = new Object[]{"bucket_id"};
                str = "1) GROUP BY (%s";
            }
            String formatStrLocaleSafe3 = StringFormatUtil.formatStrLocaleSafe(str, objArr);
            11T.A0A(formatStrLocaleSafe3);
            String[] strArr6 = z4 ? new String[]{11T.A02(MimeType.A03)} : null;
            String formatStrLocaleSafe4 = StringFormatUtil.formatStrLocaleSafe("MAX(%s) DESC", "date_modified");
            11T.A0A(formatStrLocaleSafe4);
            Cursor A01 = 0L0.A01(contentResolver3, uri4, formatStrLocaleSafe3, formatStrLocaleSafe4, strArr5, strArr6, -1359064231);
            if (A01 != null) {
                try {
                    int columnIndex = A01.getColumnIndex("bucket_id");
                    while (A01.moveToNext()) {
                        String string6 = A01.getString(columnIndex);
                        if (string6 != null) {
                            HashMap hashMap = bsa.A01;
                            if (hashMap.containsKey(string6)) {
                                Folder folder5 = (Folder) hashMap.get(string6);
                                long A023 = AbH.A02(A01, "date_modified");
                                Uri uri5 = null;
                                try {
                                    uri5 = C0A2.A03(0Pz.A0P(uri4.toString(), '/', AbH.A02(A01, "_id")));
                                } catch (SecurityException unused2) {
                                }
                                if (folder5 != null && uri5 != null) {
                                    long j3 = folder5.A01;
                                    if (A023 > j3) {
                                        hashMap.put(string6, new Folder(uri5, folder5.A03, folder5.A04, folder5.A00, j3));
                                    }
                                }
                                Folder folder6 = (Folder) hashMap.get(string6);
                                if (folder6 != null) {
                                    new Folder(folder6.A02, folder6.A03, folder6.A04, folder6.A00 + A01.getInt(A01.getColumnIndex("COUNT(bucket_id)")), folder6.A01);
                                    hashMap.put(string6, z);
                                }
                            } else {
                                int columnIndex2 = A01.getColumnIndex("bucket_display_name");
                                long A024 = AbH.A02(A01, "date_modified");
                                String string7 = A01.getString(columnIndex2);
                                Uri uri6 = null;
                                try {
                                    uri6 = C0A2.A03(0Pz.A0P(uri4.toString(), '/', AbH.A02(A01, "_id")));
                                } catch (SecurityException unused3) {
                                }
                                if (string7 != null && uri6 != null) {
                                    new Folder(uri6, string7, string6, A01.getInt(A01.getColumnIndex("COUNT(bucket_id)")), A024);
                                    hashMap.put(string6, z);
                                }
                            }
                        }
                    }
                    A01.close();
                } finally {
                }
            }
            if (!loadFolderParams.A01) {
                ContentResolver contentResolver4 = (ContentResolver) c00i2.get();
                Uri uri7 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                11T.A0B(uri7);
                String[] strArr7 = {"bucket_display_name", "bucket_id", "date_modified", "_data", "mime_type", "COUNT(bucket_id)"};
                if (z4) {
                    objArr2 = new Object[]{"mime_type", "bucket_id"};
                    str2 = "%s !=?) GROUP BY (%s";
                } else {
                    objArr2 = new Object[]{"bucket_id"};
                    str2 = "1) GROUP BY (%s";
                }
                String formatStrLocaleSafe5 = StringFormatUtil.formatStrLocaleSafe(str2, objArr2);
                11T.A0A(formatStrLocaleSafe5);
                String[] strArr8 = z4 ? new String[]{11T.A02(MimeType.A03)} : null;
                String formatStrLocaleSafe6 = StringFormatUtil.formatStrLocaleSafe("MAX(%s) DESC", "date_modified");
                11T.A0A(formatStrLocaleSafe6);
                A01 = 0L0.A01(contentResolver4, uri7, formatStrLocaleSafe5, formatStrLocaleSafe6, strArr7, strArr8, -1359064231);
                if (A01 != null) {
                    int columnIndex3 = A01.getColumnIndex("bucket_id");
                    while (A01.moveToNext()) {
                        String string8 = A01.getString(columnIndex3);
                        if (string8 != null) {
                            HashMap hashMap2 = bsa.A01;
                            if (hashMap2.containsKey(string8)) {
                                Folder folder7 = (Folder) hashMap2.get(string8);
                                long A025 = AbH.A02(A01, "date_modified");
                                String string9 = A01.getString(A01.getColumnIndex("_data"));
                                Uri fromFile2 = string9 != null ? Uri.fromFile(new File(string9)) : null;
                                if (folder7 != null && fromFile2 != null) {
                                    long j4 = folder7.A01;
                                    if (A025 > j4) {
                                        hashMap2.put(string8, new Folder(fromFile2, folder7.A03, folder7.A04, folder7.A00, j4));
                                    }
                                }
                                Folder folder8 = (Folder) hashMap2.get(string8);
                                if (folder8 != null) {
                                    new Folder(folder8.A02, folder8.A03, folder8.A04, folder8.A00 + A01.getInt(A01.getColumnIndex("COUNT(bucket_id)")), folder8.A01);
                                    hashMap2.put(string8, z2);
                                }
                            } else {
                                int columnIndex4 = A01.getColumnIndex("bucket_display_name");
                                long A026 = AbH.A02(A01, "date_modified");
                                String string10 = A01.getString(columnIndex4);
                                String string11 = A01.getString(A01.getColumnIndex("_data"));
                                Uri fromFile3 = string11 != null ? Uri.fromFile(new File(string11)) : null;
                                if (string10 != null && fromFile3 != null) {
                                    new Folder(fromFile3, string10, string8, A01.getInt(A01.getColumnIndex("COUNT(bucket_id)")), A026);
                                    hashMap2.put(string8, z2);
                                }
                            }
                        }
                    }
                    A01.close();
                }
            }
            C00j.A01(485194056);
            values = bsa.A01.values();
        }
        ArrayList A17 = 1BK.A17(values);
        Collections.sort(A17, new Object());
        return 1BL.A0a(A17);
    }
}
