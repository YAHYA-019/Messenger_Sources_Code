package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.FileWriteMode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* loaded from: I4g.class */
public final class I4g {
    public final ContentResolver A00;
    public final Context A01;
    public final 1GU A02;
    public final AnonymousClass536 A03;

    public I4g() {
        Context A00 = FbInjector.A00();
        ContentResolver contentResolver = (ContentResolver) 1Hv.A02(GOp.A09(), 100181);
        AnonymousClass536 A0E = GOp.A0E();
        1GU A0A = AbI.A0A();
        this.A01 = A00;
        this.A00 = contentResolver;
        this.A03 = A0E;
        this.A02 = A0A;
    }

    private File A00(Uri uri, String str, String[] strArr) {
        Cursor A01 = 0L0.A01(this.A00, uri, str, (String) null, new String[]{"_data"}, strArr, 52758996);
        if (A01 == null) {
            return null;
        }
        try {
            int columnIndex = A01.getColumnIndex("_data");
            if (columnIndex < 0 || !A01.moveToNext()) {
                A01.close();
                return null;
            }
            String string = A01.getString(columnIndex);
            if (string == null) {
                A01.close();
                return null;
            }
            File A0E = AnonymousClass001.A0E(string);
            if (!string.startsWith("http")) {
                if (A0E.exists()) {
                    return A0E;
                }
            }
            A01.close();
            return null;
        } finally {
            A01.close();
        }
    }

    public long A01(Uri uri) {
        File A03;
        this.A02.AAq();
        try {
            A03 = A03(uri);
        } catch (IOException unused) {
        }
        if (A03 != null) {
            return A03.length();
        }
        ParcelFileDescriptor openFileDescriptor = this.A00.openFileDescriptor(uri, "r");
        if (openFileDescriptor != null) {
            try {
                return openFileDescriptor.getStatSize();
            } finally {
                openFileDescriptor.close();
            }
        }
        return 0L;
    }

    public HnA A02(Uri uri, Integer num) {
        File A03 = A03(uri);
        if (A03 != null) {
            return new HnA(A03, false);
        }
        File A0A = this.A03.A0A(num, "backing_file_copy", ".tmp");
        if (A0A == null) {
            throw AnonymousClass001.A0G("Failed to create temp file");
        }
        ImmutableSet A08 = ImmutableSet.A08(new FileWriteMode[0]);
        C05364dl c05364dl = new C05364dl(C05364dl.A03);
        try {
            String scheme = uri.getScheme();
            InputStream openInputStream = (scheme == null || !scheme.equals("https")) ? this.A00.openInputStream(uri) : new URL(uri.toString()).openStream();
            c05364dl.A00(openInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(A0A, A08.contains(FileWriteMode.A01));
            c05364dl.A00(fileOutputStream);
            1SB.A00(openInputStream, fileOutputStream);
            c05364dl.close();
            return new HnA(A0A, true);
        } finally {
        }
    }

    public File A03(Uri uri) {
        File A00;
        this.A02.AAq();
        File file = null;
        if (uri != null) {
            if ("file".equals(uri.getScheme())) {
                file = GOp.A11(uri);
            } else {
                if (DocumentsContract.isDocumentUri(this.A01, uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    Splitter on = Splitter.on(":");
                    Preconditions.checkArgument(true, "must be greater than zero: %s", 2);
                    Splitter splitter = new Splitter(on.strategy, false, on.trimmer, 2);
                    documentId.getClass();
                    String[] strArr = (String[]) 2Ri.A0I(new Splitter.AnonymousClass5(documentId));
                    if (strArr.length != 2) {
                        A00 = null;
                    } else {
                        String[] strArr2 = {strArr[1]};
                        A00 = A00(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", strArr2);
                        if (A00 == null) {
                            return A00(MediaStore.Images.Media.INTERNAL_CONTENT_URI, "_id=?", strArr2);
                        }
                    }
                    return A00;
                }
                if ("media".equals(uri.getAuthority())) {
                    return A00(uri, null, null);
                }
            }
        }
        return file;
    }
}
