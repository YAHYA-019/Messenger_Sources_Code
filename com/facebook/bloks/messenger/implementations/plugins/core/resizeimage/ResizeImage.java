package com.facebook.bloks.messenger.implementations.plugins.core.resizeimage;

import X.0S2;
import X.0gF;
import X.11I;
import X.11T;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.1De;
import X.7kF;
import X.7zM;
import X.7zU;
import X.AnonymousClass001;
import X.AnonymousClass536;
import X.C0A2;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKI;
import X.DKc;
import X.Ex6;
import X.F06;
import X.FGb;
import X.FGe;
import X.FHh;
import X.FyG;
import X.GJj;
import X.IFs;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: ResizeImage.class */
public final class ResizeImage {
    public final 1Br A00;
    public final 1De A02;
    public final 1Br A01 = 1Bq.A00(49473);
    public final 1CO A03 = (1CO) 1Bi.A03(16386);

    public ResizeImage(1De r302) {
        this.A02 = r302;
        this.A00 = 7zM.A0h(r302, 99389);
    }

    public final Object A00(FHh fHh, DKc dKc) {
        Integer num;
        String path;
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        11T.A0I(A10, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        FyG fyG = (FyG) A10;
        String A0x = DKE.A0x(dKc, 1);
        Object A102 = DKC.A10(dKc, 2);
        A102.getClass();
        int A05 = DKD.A05(A102, "null cannot be cast to non-null type kotlin.Number");
        Object A103 = DKC.A10(dKc, 3);
        A103.getClass();
        int A052 = DKD.A05(A103, "null cannot be cast to non-null type kotlin.Number");
        List list = dKc.A00;
        GJj A02 = FGb.A02(list, 4);
        GJj A022 = FGb.A02(list, 5);
        FGe fGe = FGe.A02;
        Uri A01 = F06.A01(7zU.A0C(A0x), false);
        if (this.A03.AZk(18311910894491051L) && (path = A01.getPath()) != null) {
            11I r0 = new 11I();
            r0.A0D(path);
            DKI.A0e(r0);
            r0.A08();
        }
        Context context = fyG.A00;
        String obj = A01.toString();
        Ex6 ex6 = new Ex6(this, fyG, fHh, A02, A022);
        int i = A052;
        try {
            if (A052 <= 0 || A05 <= 0) {
                ex6.A01(0S2.A01);
                return null;
            }
            Uri A03 = C0A2.A03(obj);
            String path2 = A03.getPath();
            if (path2 == null) {
                ex6.A01(0S2.A01);
                return null;
            }
            File A0E = AnonymousClass001.A0E(path2);
            boolean z = IFs.A0M;
            int A0W = new IFs(A0E.getCanonicalPath()).A0W(0);
            if (A0W == 6 || A0W == 8) {
                i = A05;
                A05 = A052;
            }
            InputStream openInputStream = context.getContentResolver().openInputStream(A03);
            if (openInputStream == null) {
                ex6.A01(0S2.A0C);
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openInputStream, null, options);
                Rect rect = new Rect(0, 0, options.outWidth, options.outHeight);
                openInputStream.close();
                int width = rect.width();
                int height = rect.height();
                if (width <= 0 || height <= 0) {
                    ex6.A01(0S2.A01);
                    return null;
                }
                if (width <= A05 && height <= i) {
                    ex6.A00(A03);
                    return null;
                }
                Rect rect2 = new Rect(0, 0, A05, i);
                double max = Math.max((rect.width() * 1.0d) / rect2.width(), (rect.height() * 1.0d) / rect2.height());
                Rect rect3 = new Rect(0, 0, (int) (rect.width() / max), (int) (rect.height() / max));
                openInputStream = context.getContentResolver().openInputStream(A03);
                Bitmap bitmap = null;
                if (openInputStream != null) {
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                        if (decodeStream != null) {
                            int width2 = rect3.width();
                            int height2 = rect3.height();
                            0gF.A00(decodeStream);
                            bitmap = Bitmap.createScaledBitmap(decodeStream, width2, height2, true);
                        }
                        openInputStream.close();
                        if (bitmap != null) {
                            File A0C = ((AnonymousClass536) 1Br.A0B(this.A01)).A0C("BloksMedia_", ".jpg");
                            if (A0C == null) {
                                ex6.A01(0S2.A0C);
                                return null;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(A0C);
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                IFs iFs = new IFs(A0C.getCanonicalPath());
                                int A0W2 = new IFs(A0E.getCanonicalPath()).A0W(0);
                                if (A0W2 != 0) {
                                    iFs.A0Z("Orientation", String.valueOf(A0W2));
                                    iFs.A0Y();
                                }
                                ex6.A00(Uri.fromFile(A0C));
                                return null;
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    7kF.A00(th, th2);
                                }
                                throw th;
                            }
                        }
                    } finally {
                    }
                }
                ex6.A01(0S2.A0C);
                return null;
            } finally {
            }
        } catch (FileNotFoundException unused) {
            num = 0S2.A00;
            ex6.A01(num);
            return null;
        } catch (IOException unused2) {
            num = 0S2.A0C;
            ex6.A01(num);
            return null;
        } catch (SecurityException unused3) {
            num = 0S2.A01;
            ex6.A01(num);
            return null;
        }
    }
}
