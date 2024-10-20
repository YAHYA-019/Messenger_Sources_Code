package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4b9.class */
public abstract class AbstractRunnableC04534b9 implements Runnable {
    public static final String __redex_internal_original_name = "StatefulRunnable";
    public final AtomicInteger A00 = new AtomicInteger(0);

    public Object A01() {
        ExifInterface A00;
        int i;
        if (this instanceof C04514b7) {
            return null;
        }
        if (!(this instanceof 4bU)) {
            4bX r0 = (4bX) this;
            C5f9 c5f9 = r0.A00;
            2Ds A002 = c5f9.A00(r0.A03);
            if (A002 == null) {
                2IU r02 = r0.A02;
                InterfaceC04374as interfaceC04374as = r0.A01;
                r02.CS8(interfaceC04374as, c5f9.A02(), false);
                interfaceC04374as.CaJ("local", "fetch");
                return null;
            }
            A002.A07();
            2IU r03 = r0.A02;
            InterfaceC04374as interfaceC04374as2 = r0.A01;
            r03.CS8(interfaceC04374as2, c5f9.A02(), true);
            interfaceC04374as2.CaJ("local", "fetch");
            2Ds.A03(A002);
            interfaceC04374as2.Ca9("image_color_space", A002.A06);
            return A002;
        }
        4bU r04 = (4bU) this;
        Uri uri = r04.A01.A05;
        5fA r05 = r04.A00;
        ContentResolver contentResolver = r05.A00;
        String A01 = 0CO.A01(contentResolver, uri);
        if (A01 == null) {
            return null;
        }
        try {
            File file = new File(A01);
            if (file.exists() && file.canRead()) {
                new ExifInterface(A01);
            } else {
                AssetFileDescriptor assetFileDescriptor = null;
                if (!0CO.A02(uri)) {
                    return null;
                }
                try {
                    assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                } catch (FileNotFoundException unused) {
                }
                if (assetFileDescriptor == null) {
                    return null;
                }
                A00 = 4bU.A00(assetFileDescriptor.getFileDescriptor());
                assetFileDescriptor.close();
                if (A00 == null) {
                    return null;
                }
            }
            if (!A00.hasThumbnail()) {
                return null;
            }
            byte[] thumbnail = A00.getThumbnail();
            thumbnail.getClass();
            4dQ A012 = r05.A01.A01(thumbnail);
            C05264db c05264db = new C05264db(A012);
            ByteBuffer A03 = 2Dt.A03();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = A03.array();
                Pair pair = null;
                if (2Dt.A00) {
                    try {
                        BitmapFactory.decodeStream(c05264db, null, options);
                    } catch (IllegalArgumentException unused2) {
                    }
                } else {
                    BitmapFactory.decodeStream(c05264db, null, options);
                }
                int i2 = options.outWidth;
                if (i2 != -1) {
                    int i3 = options.outHeight;
                    if (i3 != -1) {
                        new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                }
                2Dt.A04(A03);
                String attribute = A00.getAttribute("Orientation");
                attribute.getClass();
                int A003 = C06544h7.A00(Integer.parseInt(attribute));
                int i4 = -1;
                if (pair != null) {
                    i = ((Number) pair.first).intValue();
                    i4 = ((Number) pair.second).intValue();
                } else {
                    i = -1;
                }
                2EU A02 = 2EU.A02(A012);
                try {
                    2Ds r06 = new 2Ds(A02);
                    2EU.A04(A02);
                    r06.A07 = AbstractC05294de.A05;
                    r06.A02 = A003;
                    r06.A05 = i;
                    r06.A01 = i4;
                    return r06;
                } catch (Throwable th) {
                    2EU.A04(A02);
                    throw th;
                }
            } catch (Throwable th2) {
                2Dt.A04(A03);
                throw th2;
            }
        } catch (IOException unused3) {
            return null;
        } catch (StackOverflowError unused4) {
            C0d7.A00(5fA.class, "StackOverflowError in ExifInterface constructor");
            return null;
        }
    }

    public void A02() {
        if (this.A00.compareAndSet(0, 2)) {
            A03();
        }
    }

    public abstract void A03();

    public abstract void A04(Exception exc);

    public void A05(Object obj) {
        2Ds r0;
        if ((this instanceof C04514b7) || (r0 = (2Ds) obj) == null) {
            return;
        }
        r0.close();
    }

    public abstract void A06(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.A00;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object A01 = A01();
                atomicInteger.set(3);
                try {
                    A06(A01);
                } finally {
                    A05(A01);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                A04(e);
            }
        }
    }
}
