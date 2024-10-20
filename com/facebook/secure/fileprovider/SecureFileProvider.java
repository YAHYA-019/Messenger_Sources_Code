package com.facebook.secure.fileprovider;

import X.0Pz;
import X.0RF;
import X.10D;
import X.AnonymousClass001;
import X.AnonymousClass053;
import X.C0w6;
import X.C10G;
import X.C1AJ;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: SecureFileProvider.class */
public class SecureFileProvider extends 0RF {
    public 10D A00;

    /* loaded from: SecureFileProvider$Impl.class */
    public class Impl extends AnonymousClass053 {
        public static final C0w6 A01 = new Object();
        public static final String[] A02 = {"_display_name", "_size"};
        public final SecureFileProvider A00;

        public Impl(0RF r302) {
            super(r302);
            this.A00 = (SecureFileProvider) r302;
        }

        @Override // X.AnonymousClass053
        public int A0C(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw AnonymousClass001.A0q("No external updates");
        }

        @Override // X.AnonymousClass053
        public int A0D(Uri uri, String str, String[] strArr) {
            C10G A00 = C10G.A00(uri);
            0RF r0 = super.A00;
            if (!A00.A02(r0.getContext()).booleanValue()) {
                throw AnonymousClass001.A0V("Access denied");
            }
            int i = 0;
            try {
                File A06 = C1AJ.A00(r0.getContext()).A06(uri, AnonymousClass001.A0K());
                if (10D.A03(this.A00.A00, A06) != null) {
                    if (A06.delete()) {
                        i = 1;
                    }
                }
            } catch (IOException unused) {
            }
            return i;
        }

        @Override // X.AnonymousClass053
        public Cursor A0H(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            int i;
            Object A0P;
            C10G A00 = C10G.A00(uri);
            0RF r0 = super.A00;
            if (!A00.A02(r0.getContext()).booleanValue()) {
                throw AnonymousClass001.A0V("Access denied");
            }
            try {
                File A06 = C1AJ.A00(r0.getContext()).A06(uri, AnonymousClass001.A0K());
                if (strArr == null) {
                    strArr = A02;
                }
                int length = strArr.length;
                String[] strArr3 = new String[length];
                Object[] objArr = new Object[length];
                int i2 = 0;
                for (String str3 : strArr) {
                    if ("_display_name".equals(str3)) {
                        strArr3[i2] = "_display_name";
                        i = i2 + 1;
                        A0P = A06.getName();
                    } else if ("_size".equals(str3)) {
                        strArr3[i2] = "_size";
                        i = i2 + 1;
                        A0P = AnonymousClass001.A0P(A06);
                    }
                    objArr[i2] = A0P;
                    i2 = i;
                }
                String[] strArr4 = (String[]) Arrays.copyOf(strArr3, i2);
                Object[] copyOf = Arrays.copyOf(objArr, i2);
                MatrixCursor matrixCursor = new MatrixCursor(strArr4, 0);
                if (i2 > 0) {
                    matrixCursor.addRow(copyOf);
                }
                return matrixCursor;
            } catch (IOException e) {
                A01.Cg0("SecureFileProvider.Impl", "Query incurred an IOException", e);
                return new MatrixCursor(new String[strArr.length], 0);
            }
        }

        @Override // X.AnonymousClass053
        public Uri A0J(Uri uri, ContentValues contentValues) {
            throw AnonymousClass001.A0q("No external inserts");
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, boolean] */
        @Override // X.AnonymousClass053
        public ParcelFileDescriptor A0L(Uri uri, String str) {
            int i;
            C10G A00 = C10G.A00(uri);
            0RF r0 = super.A00;
            ?? booleanValue = A00.A02(r0.getContext()).booleanValue();
            if (booleanValue == 0) {
                throw AnonymousClass001.A0V("Access denied");
            }
            try {
                File A06 = C1AJ.A00(r0.getContext()).A06(uri, AnonymousClass001.A0K());
                if ("r".equals(str)) {
                    i = 268435456;
                } else if ("w".equals(str) || "wt".equals(str)) {
                    i = 738197504;
                } else if ("wa".equals(str)) {
                    i = 704643072;
                } else if ("rw".equals(str)) {
                    i = 939524096;
                } else {
                    if (!"rwt".equals(str)) {
                        throw 0Pz.A05("Invalid mode: ", str);
                    }
                    i = 1006632960;
                }
                return ParcelFileDescriptor.open(A06, i);
            } catch (FileNotFoundException unused) {
                throw booleanValue;
            } catch (IOException e) {
                A01.Cg0("SecureFileProvider.Impl", "IOException during file opening.", e);
                throw new FileNotFoundException("Could not open file");
            }
        }

        @Override // X.AnonymousClass053
        public String A0M(Uri uri) {
            C10G A00 = C10G.A00(uri);
            0RF r0 = super.A00;
            if (!A00.A02(r0.getContext()).booleanValue()) {
                throw AnonymousClass001.A0V("Access denied");
            }
            try {
                File A06 = C1AJ.A00(r0.getContext()).A06(uri, AnonymousClass001.A0K());
                int lastIndexOf = A06.getName().lastIndexOf(46);
                String substring = lastIndexOf == -1 ? "" : A06.getName().substring(lastIndexOf + 1);
                if (substring.length() <= 0) {
                    return "application/octet-stream";
                }
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(substring);
                return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
            } catch (IOException e) {
                A01.Cg0("SecureFileProvider.Impl", "Could not resolve file type.", e);
                return "";
            }
        }
    }

    public static boolean A01(Context context, Uri uri) {
        10D A00 = C1AJ.A00(context);
        try {
            if (!A00.A02.equals(uri.getAuthority()) || !uri.getScheme().equals("content")) {
                return false;
            }
            A00.A06(uri, false);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0w6, java.lang.Object] */
    public void A0I(Context context, ProviderInfo providerInfo) {
        if (((ComponentInfo) providerInfo).exported) {
            throw AnonymousClass001.A0V("Provider must not be exported.");
        }
        HashMap hashMap = 10D.A06;
        this.A00 = 10D.A01(context, providerInfo, (C0w6) new Object());
    }
}
