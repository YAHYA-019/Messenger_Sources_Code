package X;

import android.util.Base64;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.5hg, reason: invalid class name */
/* loaded from: 5hg.class */
public final class C5hg implements 1Ro {
    public static final String __redex_internal_original_name = "QTLanguagePackGetMethod";
    public final 1Br A00 = 1Bq.A00(65890);
    public final 1Br A01 = 1Bq.A00(65888);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        C5hh c5hh = (C5hh) obj;
        11T.A0F(c5hh, 0);
        C04083zw c04083zw = new C04083zw();
        c04083zw.A0D = "getQTLanguagePack";
        c04083zw.A0F = "qt_language_packs";
        c04083zw.A0E = "GET";
        c04083zw.A03(RequestPriority.CAN_WAIT);
        c04083zw.A0J = c5hh.A00();
        c04083zw.A06 = 0S2.A01;
        return c04083zw.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        Exception e;
        Object obj2;
        IllegalStateException A0N;
        C5hh c5hh = (C5hh) obj;
        11T.A0F(c5hh, 0);
        11T.A0F(anonymousClass439, 1);
        C5he c5he = c5hh.A00;
        try {
            C03353xs A0D = anonymousClass439.A01().A0D("data");
            if (A0D == null || A0D._children.size() == 0) {
                1ZO.A00(c5he, (1ZO) this.A01.A00.get(), "empty", new HashMap());
                Absent absent = Absent.INSTANCE;
                11T.A0A(absent);
                return absent;
            }
            int size = A0D._children.size();
            if (size <= 1) {
                24X A0B = A0D.A0B(0);
                if (A0B != null) {
                    24X A0D2 = A0B.A0D("lp_status");
                    if (A0D2 != null) {
                        String A0I = A0D2.A0I();
                        if (A0I != null) {
                            String upperCase = A0I.toUpperCase(Locale.ROOT);
                            11T.A0A(upperCase);
                            if (upperCase.equals("NEW")) {
                                try {
                                    24X A0D3 = A0B.A0D("lp_checksum");
                                    if (A0D3 != null) {
                                        String A0I2 = A0D3.A0I();
                                        if (A0I2 != null) {
                                            24X A0D4 = A0B.A0D("lp_content");
                                            if (A0D4 != null) {
                                                String A0I3 = A0D4.A0I();
                                                if (A0I3 != null) {
                                                    C00i c00i = this.A01.A00;
                                                    1ZO r0 = (1ZO) c00i.get();
                                                    1ZO.A00(c5he, r0, "new", new DLX(A0I2));
                                                    HashMap A00 = C5hf.A00(c5he);
                                                    A00.put(DKB.A00(509), A0I2);
                                                    1ZO.A02(r0, A00, 4456457);
                                                    byte[] decode = Base64.decode(A0I3, 0);
                                                    C1Ze c1Ze = (C1Ze) this.A00.A00.get();
                                                    11T.A0D(decode);
                                                    11T.A0F(decode, 0);
                                                    if (A0I2.equals(0KC.A03(decode, "MD5"))) {
                                                        File A002 = C1Ze.A00(c1Ze);
                                                        int i = c5he.A00;
                                                        String str = c5he.A03;
                                                        String str2 = c5he.A04;
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(i);
                                                        sb.append('-');
                                                        sb.append(str);
                                                        sb.append('-');
                                                        sb.append(str2);
                                                        sb.append('-');
                                                        sb.append(A0I2);
                                                        sb.append(".langpack");
                                                        File file = new File(A002, sb.toString());
                                                        try {
                                                            Files.A07(file, decode);
                                                            3uE A003 = 3uC.A00(file);
                                                            ((LightweightQuickPerformanceLogger) ((1ZO) c00i.get()).A01.A00.get()).markerEnd(4456457, (short) 2);
                                                            obj2 = Optional.of(A003);
                                                        } catch (IOException e2) {
                                                            new RuntimeException(e2);
                                                        }
                                                    } else {
                                                        int i2 = c5he.A00;
                                                        String format = String.format(Locale.US, 1BJ.A00(741), Arrays.copyOf(new Object[]{Integer.valueOf(i2), c5he.A03, c5he.A04}, 3));
                                                        11T.A0A(format);
                                                        new RuntimeException(format);
                                                    }
                                                } else {
                                                    A0N = AnonymousClass001.A0N("Required value was null.");
                                                }
                                            } else {
                                                A0N = AnonymousClass001.A0N("Required value was null.");
                                            }
                                        } else {
                                            A0N = AnonymousClass001.A0N("Required value was null.");
                                        }
                                    } else {
                                        A0N = AnonymousClass001.A0N("Required value was null.");
                                    }
                                    throw A0N;
                                } catch (Exception e3) {
                                    e = e3;
                                    1ZO.A01((1ZO) 1Br.A0B(this.A01), e, 4456457);
                                }
                            } else if (upperCase.equals("UNCHANGED")) {
                                1ZO.A00(c5he, (1ZO) this.A01.A00.get(), "unchanged", new HashMap());
                                obj2 = Absent.INSTANCE;
                            } else {
                                new IllegalArgumentException(upperCase);
                            }
                            11T.A0D(obj2);
                            return obj2;
                        }
                        e = AnonymousClass001.A0N("Required value was null.");
                    } else {
                        e = AnonymousClass001.A0N("Required value was null.");
                    }
                } else {
                    e = AnonymousClass001.A0N("Required value was null.");
                }
            } else {
                1ZO.A00(c5he, (1ZO) 1Br.A0B(this.A01), "multiple", new DLX(size, 1));
                e = AnonymousClass001.A0T(0Pz.A0T("Expecting 1 QT language pack. Got ", size));
            }
            throw e;
        } catch (Exception e4) {
            throw new Exception(e4);
        }
    }
}
