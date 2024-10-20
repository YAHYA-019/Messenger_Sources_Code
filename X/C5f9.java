package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.acra.constants.ActionId;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: X.5f9, reason: invalid class name */
/* loaded from: 5f9.class */
public abstract class C5f9 implements 4aT {
    public final 2H7 A00;
    public final Executor A01;

    public C5f9(2H7 r302, Executor executor) {
        this.A01 = executor;
        this.A00 = r302;
    }

    public 2Ds A00(2Dp r302) {
        byte[] bytes;
        2Ds r312;
        ContentResolver contentResolver;
        Cursor A01;
        int i;
        InputStream openInputStream;
        if (this instanceof C5f8) {
            11T.A0F(r302, 0);
            return A01(new FileInputStream(r302.A02().toString()), (int) r302.A02().length());
        }
        if (this instanceof AnonymousClass699) {
            AnonymousClass699 anonymousClass699 = (AnonymousClass699) this;
            11T.A0F(r302, 0);
            Uri uri = r302.A05;
            11T.A0A(uri);
            Uri uri2 = 0CO.A00;
            boolean z = false;
            if (uri.getPath() != null && 0CO.A02(uri) && 1BJ.A00(ActionId.ASNYC_FAILED).equals(uri.getAuthority()) && !uri.getPath().startsWith(0CO.A00.getPath())) {
                z = true;
            }
            if (z) {
                String A02 = 11T.A02(uri);
                11T.A0F("/photo", 1);
                if (A02.endsWith("/photo")) {
                    openInputStream = anonymousClass699.A00.openInputStream(uri);
                } else {
                    String A022 = 11T.A02(uri);
                    11T.A0F("/display_photo", 1);
                    if (A022.endsWith("/display_photo")) {
                        try {
                            AssetFileDescriptor openAssetFileDescriptor = anonymousClass699.A00.openAssetFileDescriptor(uri, "r");
                            if (openAssetFileDescriptor == null) {
                                throw AnonymousClass001.A0N("Required value was null.");
                            }
                            openInputStream = openAssetFileDescriptor.createInputStream();
                        } catch (IOException unused) {
                            throw AnonymousClass001.A0G(AnonymousClass001.A0Z(uri, "Contact photo does not exist: ", AnonymousClass001.A0k()));
                        }
                    } else {
                        openInputStream = ContactsContract.Contacts.openContactPhotoInputStream(anonymousClass699.A00, uri);
                        if (openInputStream == null) {
                            throw AnonymousClass001.A0G(AnonymousClass001.A0Z(uri, "Contact photo does not exist: ", AnonymousClass001.A0k()));
                        }
                    }
                }
                if (openInputStream == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
            } else {
                String obj = uri.toString();
                if (obj.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || obj.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                    try {
                        ParcelFileDescriptor openFileDescriptor = anonymousClass699.A00.openFileDescriptor(uri, "r");
                        if (openFileDescriptor == null) {
                            throw AnonymousClass001.A0N("Required value was null.");
                        }
                        2Ds A012 = anonymousClass699.A01(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
                        openFileDescriptor.close();
                        return A012;
                    } catch (FileNotFoundException unused2) {
                    }
                }
                openInputStream = anonymousClass699.A00.openInputStream(uri);
                if (openInputStream == null) {
                    throw AnonymousClass001.A0N("Required value was null.");
                }
            }
            r312 = anonymousClass699.A01(openInputStream, -1);
        } else {
            if (!(this instanceof 69A)) {
                String obj2 = r302.A05.toString();
                C0By.A02(Boolean.valueOf(obj2.substring(0, 5).equals("data:")));
                int indexOf = obj2.indexOf(44);
                String substring = obj2.substring(indexOf + 1, obj2.length());
                String substring2 = obj2.substring(0, indexOf);
                if (substring2.contains(";")) {
                    if (substring2.split(";")[r0.length - 1].equals("base64")) {
                        bytes = Base64.decode(substring, 0);
                        return A01(new ByteArrayInputStream(bytes), bytes.length);
                    }
                }
                String decode = Uri.decode(substring);
                decode.getClass();
                bytes = decode.getBytes();
                return A01(new ByteArrayInputStream(bytes), bytes.length);
            }
            69A r0 = (69A) this;
            Uri uri3 = r302.A05;
            Uri uri4 = 0CO.A00;
            String obj3 = uri3.toString();
            if (!obj3.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !obj3.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
                return null;
            }
            C02353ux c02353ux = r302.A09;
            r312 = null;
            if (c02353ux != null && (A01 = 0L0.A01((contentResolver = r0.A00), uri3, (String) null, (String) null, 69A.A03, (String[]) null, -1348685376)) != null) {
                try {
                    if (A01.moveToFirst()) {
                        long j = A01.getLong(A01.getColumnIndex("_id"));
                        Rect rect = 69A.A01;
                        if (5fF.A00(c02353ux, rect.width(), rect.height())) {
                            i = 3;
                        } else {
                            Rect rect2 = 69A.A02;
                            if (5fF.A00(c02353ux, rect2.width(), rect2.height())) {
                                i = 1;
                            }
                        }
                        2Ds r320 = null;
                        Cursor queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(contentResolver, j, i, 69A.A04);
                        if (queryMiniThumbnail != null) {
                            try {
                                if (queryMiniThumbnail.moveToFirst()) {
                                    int columnIndex = queryMiniThumbnail.getColumnIndex("_data");
                                    if (columnIndex >= 0) {
                                        String A0v = 4YU.A0v(queryMiniThumbnail, columnIndex);
                                        if (AnonymousClass001.A1X(A0v)) {
                                            r320 = r0.A01(new FileInputStream(A0v), (int) AnonymousClass001.A0E(A0v).length());
                                        }
                                    }
                                }
                                queryMiniThumbnail.close();
                                if (r320 != null) {
                                    int columnIndex2 = A01.getColumnIndex("_data");
                                    if (columnIndex2 >= 0) {
                                        String string = A01.getString(columnIndex2);
                                        int i2 = 0;
                                        if (string != null) {
                                            try {
                                                i2 = C06544h7.A00(new ExifInterface(string).getAttributeInt("Orientation", 1));
                                            } catch (IOException e) {
                                                Object[] objArr = {string};
                                                C0d8 c0d8 = C0d7.A00;
                                                if (c0d8.BTv(6)) {
                                                    c0d8.e(69A.class.getSimpleName(), String.format(null, "Unable to retrieve thumbnail rotation for %s", objArr), e);
                                                }
                                            }
                                        }
                                        r320.A02 = i2;
                                    }
                                    A01.close();
                                    return r320;
                                }
                            } catch (Throwable th) {
                                queryMiniThumbnail.close();
                                throw th;
                            }
                        }
                    }
                    A01.close();
                    return null;
                } catch (Throwable th2) {
                    A01.close();
                    throw th2;
                }
            }
        }
        return r312;
    }

    public 2Ds A01(InputStream inputStream, int i) {
        2EU A02;
        try {
            if (i <= 0) {
                2H7 r0 = this.A00;
                11T.A0F(inputStream, 0);
                2H5 r02 = r0.A01;
                4dA r03 = new 4dA(r02, r02.A00[0]);
                try {
                    r0.A00.A00(inputStream, r03);
                    A02 = 2EU.A02(r03.A00());
                } finally {
                    r03.close();
                }
            } else {
                A02 = 2EU.A02(this.A00.A00(inputStream, i));
            }
            2Ds r04 = new 2Ds(A02);
            4sB.A01(inputStream);
            2EU.A04(A02);
            return r04;
        } catch (Throwable th) {
            4sB.A01(inputStream);
            2EU.A04((2EU) null);
            throw th;
        }
    }

    public String A02() {
        return this instanceof C5f8 ? "LocalFileFetchProducer" : this instanceof AnonymousClass699 ? "LocalContentUriFetchProducer" : this instanceof 69A ? "LocalContentUriThumbnailFetchProducer" : "DataFetchProducer";
    }

    public void CZW(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as) {
        C04364ar c04364ar = (C04364ar) interfaceC04374as;
        2IU r0 = c04364ar.A05;
        2Dp r02 = c04364ar.A07;
        interfaceC04374as.CaJ("local", "fetch");
        Runnable runnable = new 4bX(interfaceC04444az, this, interfaceC04374as, interfaceC04374as, r0, r0, r02, A02());
        interfaceC04374as.A5P(new C2586GiN(runnable, this, 2));
        this.A01.execute(runnable);
    }
}
