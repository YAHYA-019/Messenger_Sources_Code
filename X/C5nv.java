package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.LinkedHashMap;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5nv, reason: invalid class name */
/* loaded from: 5nv.class */
public final class C5nv {
    public static final java.util.Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C5nv[] A02;
    public static final C5nv A03;
    public static final C5nv A04;
    public static final C5nv A05;
    public static final C5nv A06;
    public static final C5nv A07;
    public static final C5nv A08;
    public static final C5nv A09;
    public static final C5nv A0A;
    public static final C5nv A0B;
    public static final C5nv A0C;
    public static final C5nv A0D;
    public static final C5nv A0E;
    public static final C5nv A0F;
    public static final C5nv A0G;
    public final int id;

    static {
        C5nv c5nv = new C5nv("CSAM_BLOCK_ACCESS", 0, 1);
        A03 = c5nv;
        C5nv c5nv2 = new C5nv("CSAM_COMPOSER_BLOCK", 1, 2);
        A0A = c5nv2;
        C5nv c5nv3 = new C5nv("DISABLE_DOWNLOADS", 2, 4);
        A0E = c5nv3;
        C5nv c5nv4 = new C5nv("DISABLE_FORWARDING", 3, 8);
        A0F = c5nv4;
        C5nv c5nv5 = new C5nv("CSAM_DISABLE_ADDING_RISKY_USERS", 4, 16);
        A0B = c5nv5;
        C5nv c5nv6 = new C5nv("CSAM_EDUCATE", 5, 32);
        A0C = c5nv6;
        C5nv c5nv7 = new C5nv("CSAM_EDUCATE_REPORT_UPSELL", 6, 64);
        A0D = c5nv7;
        C5nv c5nv8 = new C5nv("PROACTIVE_WARNING_IIC", 7, 128);
        A0G = c5nv8;
        C5nv c5nv9 = new C5nv("CSAM_BLOCK_ACCESS_THREAD_NAME_BYSTANDER", 8, 256);
        A06 = c5nv9;
        C5nv c5nv10 = new C5nv("CSAM_BLOCK_ACCESS_THREAD_NAME_UPLOADER", 9, 512);
        A07 = c5nv10;
        C5nv c5nv11 = new C5nv("CSAM_BLOCK_ACCESS_THREAD_PHOTO_BYSTANDER", 10, 1024);
        A08 = c5nv11;
        C5nv c5nv12 = new C5nv("CSAM_BLOCK_ACCESS_THREAD_PHOTO_UPLOADER", 11, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        A09 = c5nv12;
        C5nv c5nv13 = new C5nv("CSAM_BLOCK_ACCESS_THREAD_NAME_AND_PHOTO_BYSTANDER", 12, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE);
        A04 = c5nv13;
        C5nv c5nv14 = new C5nv("CSAM_BLOCK_ACCESS_THREAD_NAME_AND_PHOTO_UPLOADER", 13, 8192);
        A05 = c5nv14;
        C5nv[] c5nvArr = {c5nv, c5nv2, c5nv3, c5nv4, c5nv5, c5nv6, c5nv7, c5nv8, c5nv9, c5nv10, c5nv11, c5nv12, c5nv13, c5nv14};
        A02 = c5nvArr;
        A01 = C00t.A00(c5nvArr);
        C5nv[] values = values();
        int A002 = 02J.A00(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002 < 16 ? 16 : A002);
        for (C5nv c5nv15 : values) {
            linkedHashMap.put(Integer.valueOf(c5nv15.id), c5nv15);
        }
        A00 = linkedHashMap;
    }

    public C5nv(String str, int i, int i2) {
        this.id = i2;
    }

    public static C5nv valueOf(String str) {
        return (C5nv) Enum.valueOf(C5nv.class, str);
    }

    public static C5nv[] values() {
        return (C5nv[]) A02.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r301 == X.C5nv.A05) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            X.5nv r0 = X.C5nv.A06
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3a
            X.5nv r0 = X.C5nv.A07
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3a
            X.5nv r0 = X.C5nv.A08
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3a
            X.5nv r0 = X.C5nv.A09
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3a
            X.5nv r0 = X.C5nv.A04
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L3a
            X.5nv r0 = X.C5nv.A05
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L3c
        L3a:
            r0 = 1
            r304 = r0
        L3c:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5nv.A00():boolean");
    }
}
