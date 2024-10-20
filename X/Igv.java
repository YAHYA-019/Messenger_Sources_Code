package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: Igv.class */
public final class Igv implements 4rQ {
    public final HqB A00;

    public Igv(HqB hqB) {
        this.A00 = hqB;
    }

    private H0N A00(File file, String str, java.util.Map map, int i) {
        boolean z;
        File[] A04;
        long j;
        long j2;
        int length;
        H0N h0n;
        HqB hqB = this.A00;
        long j3 = 2;
        if (i <= j3) {
            if (hqB.A00 == null) {
                File parentFile = hqB.A03.getDatabasePath(DKB.A00(49)).getParentFile();
                hqB.A00 = parentFile == null ? "/databases" : parentFile.getName();
            }
            if (!file.getPath().contains(hqB.A00)) {
                String A0W = 0Pz.A0W(file.getPath(), "/");
                List list = hqB.A01;
                if (list == null) {
                    list = Arrays.asList(1BK.A0N(hqB.A05).BCy(18859837052092713L).trim().split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
                    hqB.A01 = list;
                }
                ArrayList A17 = 1BK.A17(list);
                if (i == 3 && 1BK.A0N(((C4Fx) hqB.A04.get()).A00).AZk(36312050112663377L)) {
                    A17.add("/dex/");
                }
                Iterator it = A17.iterator();
                while (it.hasNext()) {
                    if (A0W.contains(AnonymousClass001.A0i(it))) {
                    }
                }
            }
            z = true;
            int i2 = i + 1;
            A04 = 4sJ.A04(file);
            long j4 = 0;
            if (A04 != null || (length = A04.length) <= 0) {
                j = 0;
                j2 = 0;
            } else {
                j = 0;
                j2 = 0;
                int i3 = 0;
                do {
                    File file2 = A04[i3];
                    if (!4sJ.A03(file2)) {
                        if (file2.isDirectory()) {
                            h0n = ((long) i2) <= j3 ? A00(file2, 0Pz.A0j(str, hqB.A06.A00(file2), "/"), map, i2) : new H0N(4sJ.A01(file2));
                        } else {
                            h0n = new H0N(4sJ.A01(file2));
                            if (z) {
                                A01(h0n, 0Pz.A0W(str, hqB.A06.A00(file2)), map);
                            }
                        }
                        j4 += ((4sL) h0n).A00;
                        j += ((4sL) h0n).A02;
                        j2 += ((4sL) h0n).A01;
                    }
                    i3++;
                } while (i3 < length);
            }
            4sL A02 = 4sJ.A02(file, file.isDirectory());
            4sL r0 = new 4sL(j4 + A02.A00, A02.A02 + j, 1 + j2);
            A01(r0, str, map);
            return r0;
        }
        z = false;
        int i22 = i + 1;
        A04 = 4sJ.A04(file);
        long j42 = 0;
        if (A04 != null) {
        }
        j = 0;
        j2 = 0;
        4sL A022 = 4sJ.A02(file, file.isDirectory());
        4sL r02 = new 4sL(j42 + A022.A00, A022.A02 + j, 1 + j2);
        A01(r02, str, map);
        return r02;
    }

    public static void A01(H0N h0n, String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            map.put(str, h0n);
            return;
        }
        4sL r0 = (4sL) map.get(str);
        if (r0 != null) {
            map.put(str, new H0N(h0n.A00(r0)));
        }
    }

    public String BXf() {
        return "filetree";
    }

    public HashMap CZY() {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator A0y = AnonymousClass001.A0y(this.A00.A00());
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (A0z.getValue() != null) {
                A00((File) A0z.getValue(), AnonymousClass001.A0j(A0z), A0u, 0);
            }
        }
        return A0u;
    }
}
